FROM java:8
VOLUME /usr/local/inxedu-upload/upload
ADD eureka-0.0.1-SNAPSHOT-execute.jar eurekaexecute.jar
RUN bash -c 'touch /eurekaexecute.jar'
EXPOSE 7001
ENTRYPOINT [ "java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/eurekaexecute.jar" ]