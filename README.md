# reactive
Spring Reactive native build example project

### build
mvn -Pnative spring-boot:build-image

### run app
java -jar target/reactive-0.0.1-SNAPSHOT.jar

### run container
docker run --rm -p 8080:8080 docker.io/library/reactive:0.0.1-SNAPSHOT
