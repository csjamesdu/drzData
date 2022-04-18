FROM adoptopenjdk/openjdk11-openj9:alpine
RUN mkdir /opt/app
COPY target/core-0.0.1.jar /opt/app
CMD ["java", "-jar", "/opt/app/core-0.0.1.jar"]