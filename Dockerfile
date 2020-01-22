FROM openjdk:8
VOLUME /tmp
EXPOSE 8888
ADD ./target/spring.boot.webflux.ms.config-0.0.1-SNAPSHOT.jar ms-config.jar
ENTRYPOINT ["java","-jar","/ms-config.jar"]