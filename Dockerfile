FROM gcr.io/sapient-logic-218318/lt-docker-base-image:v1.0.0
MAINTAINER Joshua Kaldon "jkaldon@lenistech.com"
ARG JAR_NAME 

ADD build/libs/$JAR_NAME /srv/LTTemplateService.jar

EXPOSE 8080

ENTRYPOINT java -Xmx256m -jar /srv/LTTemplateService.jar --server.port=8080 
