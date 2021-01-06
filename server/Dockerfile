FROM java:8
VOLUME /usr/local/inxedu-upload/upload
ADD server-0.0.1-SNAPSHOT.jar server.jar
RUN bash -c 'touch /server.jar'
EXPOSE 7001
ENTRYPOINT [ "java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/server.jar" ]