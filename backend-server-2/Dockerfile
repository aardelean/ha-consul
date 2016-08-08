FROM frolvlad/alpine-oraclejdk8:slim
RUN SERVICE_NAME=backend-server-v2
ADD build/libs/backend-server-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=production","/app.jar"]
