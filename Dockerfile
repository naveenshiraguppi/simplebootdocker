# syntax=docker/dockerfile:1
FROM eclipse-temurin:17-jdk-jammy
COPY build/libs/simplebootdocker-1.0.0.jar simplebootdocker-1.0.0.jar
ENTRYPOINT ["java", "-jar", "simplebootdocker-1.0.0.jar"]
