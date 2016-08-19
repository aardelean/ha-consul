FROM frolvlad/alpine-oraclejdk8:slim
ENV SERVICE_NAME=config-server
EXPOSE 8090
ADD build/libs/config-server-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=production","/app.jar"]
