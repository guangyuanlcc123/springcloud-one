FROM java:8
VOLUME /usr/local/inxedu-upload/upload
ADD web-0.0.1-SNAPSHOT.jar web.jar
RUN bash -c 'touch /web.jar'
EXPOSE 7001
ENTRYPOINT [ "java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/web.jar" ]