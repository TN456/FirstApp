FROM openjdk:17
LABEL maintainer="Tanuja"
ADD target/FirstApp-0.0.1-SNAPSHOT.jar firstapp-docker.jar
ENTRYPOINT [ "java","-jar","firstapp-docker.jar" ]