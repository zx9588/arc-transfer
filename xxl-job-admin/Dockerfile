FROM openjdk:8-jre-slim
MAINTAINER xuxueli

ENV PARAMS=""

ENV TZ=PRC
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

ADD xxl-job-admin-2.4.1-SNAPSHOT.jar /xxl-job-admin.jar

ENTRYPOINT ["sh","-c","java -jar $JAVA_OPTS /xxl-job-admin.jar $PARAMS"]