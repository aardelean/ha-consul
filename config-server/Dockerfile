FROM frolvlad/alpine-oraclejdk8:slim
RUN SERVICE_NAME=config-server
ADD build/libs/config-server-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
