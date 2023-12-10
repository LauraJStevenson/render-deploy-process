FROM azul/zulu-openjdk:17-latest
WORKDIR /app
COPY ./build/libs/render-deploy-process-0.0.1-SNAPSHOT.jar app/render-deploy-process.jar
EXPOSE 8080
CMD ["java","-jar","/app.jar"]
