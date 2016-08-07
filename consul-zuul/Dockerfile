FROM frolvlad/alpine-oraclejdk8:slim
RUN SERVICE_NAME=zuul
ADD build/libs/consul-zuul-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
