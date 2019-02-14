FROM gradle:jdk8 as builder
COPY --chown=gradle:gradle . /home/gradle/work
WORKDIR /home/gradle/work
RUN gradle build


FROM openjdk:8-jdk-alpine
VOLUME /tmp
#ARG JAR_FILE
COPY --from=builder /home/gradle/work/build/libs/gs-spring-boot-0.1.0.jar app.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]