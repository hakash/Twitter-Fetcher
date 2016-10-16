FROM java:8
MAINTAINER Morten Olsrud
VOLUME /tmp
ADD TwitterSentimentFetcher-1.0-SNAPSHOT.jar fetcher.jar
RUN bash -c 'touch /fetcher.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/fetcher.jar"]