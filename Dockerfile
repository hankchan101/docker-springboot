FROM openjdk:8-jdk-alpine
LABEL maintainer="me@hankchan.cn"
ADD entrypoint.sh /usr/local/bin/entrypoint.sh
RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime \
    && echo "Asia/Shanghai" > /etc/timezone \
    && chmod +x /usr/local/bin/entrypoint.sh
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
EXPOSE 8080
ENTRYPOINT ["entrypoint.sh"]
