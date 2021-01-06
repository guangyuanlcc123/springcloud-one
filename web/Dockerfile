FROM java:8
VOLUME /usr/local/inxedu-upload/upload
ADD web-0.0.1-SNAPSHOT-execute.jar webexecute.jar
RUN bash -c 'touch /webexecute.jar'
EXPOSE 7001
ENTRYPOINT [ "java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/webexecute.jar" ]