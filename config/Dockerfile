FROM java:8
VOLUME /usr/local/inxedu-upload/upload
ADD config-0.0.1-SNAPSHOT.jar config.jar
RUN bash -c 'touch /config.jar'
EXPOSE 7001
ENTRYPOINT [ "java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/config.jar" ]