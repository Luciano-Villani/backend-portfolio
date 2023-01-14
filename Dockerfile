FROM amazoncorretto:17-alpine-jdk
MAINTAINER luciano-villani
COPY target/backend-portfolio-0.0.1-SNAPSHOT.jar backend-portfolio-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/backend-portfolio-0.0.1-SNAPSHOT.jar"]