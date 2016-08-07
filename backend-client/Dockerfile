FROM frolvlad/alpine-oraclejdk8:slim
RUN SERVICE_NAME=backend-client
ADD build/libs/backend-client-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
