FROM maven:3-eclipse-temurin-11-alpine
COPY . /usr/src/maven
WORKDIR /usr/src/maven
EXPOSE 8080
CMD mvn spring-boot:run