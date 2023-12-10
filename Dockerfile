FROM azul/zulu-openjdk:17-latest
VOLUME /tmp
COPY ./build/libs/render-deploy-process-0.0.1-SNAPSHOT.jar app.jar
CMD ["java","-jar","/app.jar"]
