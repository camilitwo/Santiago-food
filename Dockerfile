FROM amazoncorretto:17-alpine
VOLUME /tmp
COPY target/*.jar app.jar
EXPOSE 8280
ENTRYPOINT ["java","-jar","/app.jar"]
