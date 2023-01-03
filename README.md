Guide:  https://spring.io/guides/gs/spring-boot/#initial

Bootstrap the project from https://start.spring.io/

Settings:
Project: Maven
Language: Java
Spring Boot: 3.0.1
Group: io.prinz
Artifact: hellospringboot
Name: let it auto-populate
Description: leave as-is
Package name: let it auto-populate
Packaging: Jar
Java: 17

Click on Add Dependencies and search for Web
Select Spring Web (the one with the embedded Tomcat server)

# To run this in a vm

    ./mvnw spring-boot:run

    curl http://localhost:8080

# This also works

    mvn clean
    mvn package
    java -jar target/spring-boot-0.0.1-SNAPSHOT.jar

    curl http://localhost:8080

# To run this in a container using the manually built jar file

    mvn clean
    mvn package

    podman build -t manual .
    podman run --rm --name=test -p 8080:8080 -it manual

    curl http://localhost:8080

# To run this in a container letting OpenShift S2I perform the build

    oc new-app --name=hellospringboot java:openjdk-17-ubi8~https://github.com/t-prinz/hellospringboot.git
    oc set env --from secret/mysql deployment/hellospringboot
    oc expose svc/hellospringboot

