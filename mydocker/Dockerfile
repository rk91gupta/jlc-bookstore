From arm64v8/tomcat:9.0
MAINTAINER "Srinivas Dande"

ENV JLC_MYSQL_HOST jlc-mysql
ENV JLC_MYSQL_PORT 3306
ENV JLC_MYSQL_DATABASE myjlcbs
ENV JLC_MYSQL_USER srinivas
ENV JLC_MYSQL_PASSWORD srinivas

RUN rm -rf /usr/local/tomcat/webapps/*
COPY myjlcbs.war /usr/local/tomcat/webapps

EXPOSE 8080
CMD ["catalina.sh","run"]


