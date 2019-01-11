# docker-springboot
SpringBoot with Docker

Simple App for SpringBoot with Dockerfile

First, running the follow command to build the SpringBoot image

```
mvn clean install dockerfile:build
```

Then you can see the tips like the follow message:

```
[INFO] Successfully built hankchan101/docker-springboot:1.0.0
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
```

Now, you can running this docker image as follow:

```
docker run -p 8080:8080 hankchan101/docker-springboot:1.0.0
```

After that, you can invoke the http request as follow:

```
curl localhost:8080/health
```

and response likes this:

```
timestamp:1547186064291
```

That's all, Simple!