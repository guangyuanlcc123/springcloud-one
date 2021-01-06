FROM java:8
VOLUME /usr/local/inxedu-upload/upload
ADD zuul-0.0.1-SNAPSHOT-execute.jar zuulexecute.jar
RUN bash -c 'touch /zuulexecute.jar'
EXPOSE 7001
ENTRYPOINT [ "java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/zuulexecute.jar" ]