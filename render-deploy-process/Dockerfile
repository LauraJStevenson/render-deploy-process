FROM azul/zulu-openjdk:17-latest
VOLUME /tmp
COPY build/libs/*.jar render-deploy-process-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/app.jar"]
