#base docker imgae
FROM openjdk:11
COPY target/demo.jar demo.jar
EXPOSE 9000
ENTRYPOINT ["java","-jar","demo.jar"]