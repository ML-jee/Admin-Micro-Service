FROM openjdk:17
EXPOSE 8087
ADD target/AdminMicroService-0.0.1-SNAPSHOT.jar AdminMicroService-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/AdminMicroService-0.0.1-SNAPSHOT.jar"]