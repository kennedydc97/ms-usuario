FROM amazoncorretto:19.0.2-alpine3.17
LABEL maintainer="Kennedy Dourado"
WORKDIR /opt/app
COPY target/*.jar app.jar
ENTRYPOINT ["java", "-Dspring.profiles.active=docker", "-jar", "app.jar"]
EXPOSE 8080


