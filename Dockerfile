FROM openjdk:8-jdk-alpine
COPY target/demo-0.0.1-SNAPSHOT app.jar
ENTRYPOINT ["java","-jar","/app.jar"]