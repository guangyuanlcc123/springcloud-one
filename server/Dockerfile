FROM java:8
VOLUME /usr/local/inxedu-upload/upload
ADD server-0.0.1-SNAPSHOT-execute.jar serverexecute.jar
RUN bash -c 'touch /serverexecute.jar'
EXPOSE 7001
ENTRYPOINT [ "java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/serverexecute.jar" ]