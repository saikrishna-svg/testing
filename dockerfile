FROM openjdk:17-jdk-alpine
MAINTAINER baeldung.com
COPY target/3-DockerExample-0.0.1-SNAPSHOT.jar message-server-1.0.0.jar
ENTRYPOINT ["java","-jar","/3-DockerExample-0.0.1-SNAPSHOT.jar]