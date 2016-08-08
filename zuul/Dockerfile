FROM frolvlad/alpine-oraclejdk8:slim
RUN SERVICE_NAME=zuul
RUN CONSUL_SERVER=192.168.178.19
RUN CONFIG_SERVER=192.168.178.19
ADD build/libs/zuul-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=production","/app.jar"]
