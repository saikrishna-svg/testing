
# Use an official OpenJDK 17 as a base image
FROM openjdk:17-jdk-slim as builder

# Set the working directory inside the container
WORKDIR /app

# Copy the Spring Boot JAR file to the container (adjust the JAR file name)
COPY target/3-DockerExample-0.0.1-SNAPSHOT.jar /app/3-DockerExample-0.0.1-SNAPSHOT.jar

# Expose the port your application will run on (default Spring Boot port is 8080)
EXPOSE 8080

# Command to run the Spring Boot application
ENTRYPOINT ["java", "-jar", "/app/3-DockerExample-0.0.1-SNAPSHOT.jar"]
