FROM eclipse-temurin:21-jre
WORKDIR /app
COPY target/*.jar aap.jar
EXPOSE 8080
ENTRYPOINT [ "java","-jar","aap.jar" ]