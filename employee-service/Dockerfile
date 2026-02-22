FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY target/*.jar employee-service.jar
EXPOSE 8081
ENTRYPOINT [ "java","-jar","employee-service.jar" ]