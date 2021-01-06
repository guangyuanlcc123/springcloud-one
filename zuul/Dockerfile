FROM java:8
VOLUME /usr/local/inxedu-upload/upload
ADD zuul-0.0.1-SNAPSHOT.jar zuul.jar
RUN bash -c 'touch /zuul.jar'
EXPOSE 7001
ENTRYPOINT [ "java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/zuul.jar" ]