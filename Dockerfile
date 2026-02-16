FROM amazoncorretto:11

COPY target/docker-app.jar  /usr/app/

WORKDIR /usr/app/

EXPOSE 8080

ENTRYPOINT ["java","-jar","docker-app.jar"]