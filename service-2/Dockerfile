FROM eclipse-temurin:17-jre

VOLUME /tmp

WORKDIR app

COPY run.sh .

ARG JAR_FILE=./target/*.jar
COPY $JAR_FILE ./app.jar

ENTRYPOINT ["./run.sh"]
