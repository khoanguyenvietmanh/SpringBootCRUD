FROM openjdk:17.0.2
ADD target/*.jar app.jar
EXPOSE 9191
ENTRYPOINT [ "java", "-jar", "app.jar"]