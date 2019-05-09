FROM java:8-jre

MAINTAINER huangyanbo

ENV TZ Asia/Shanghai

RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone;

EXPOSE 8055

ADD ./target/demo-0.0.1-SNAPSHOT.jar /usr/local/

ENTRYPOINT java -jar /usr/local/demo-0.0.1-SNAPSHOT.jar