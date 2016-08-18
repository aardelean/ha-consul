FROM frolvlad/alpine-oraclejdk8:slim
ADD build/libs/backend-client-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=production","/app.jar"]
