FROM azul/zulu-openjdk:17-latest
VOLUME /tmp
ARG JAR_FILE
COPY /build/libs/render-deploy-process-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
