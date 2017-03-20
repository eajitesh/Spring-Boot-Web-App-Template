# Containerized SpringBoot Microservice

This project is a sample SpringBoot microservice project which is further containerized to be run within docker containers.

Following is the Dockerfile:
```
FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD target/demo-0.0.1-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
```

