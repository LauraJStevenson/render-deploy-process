FROM azul/zulu-openjdk:17-latest
VOLUME /tmp
COPY ./build/libs/. app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
