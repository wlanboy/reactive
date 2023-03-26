# reactive
Spring Reactive native build example project

## depencencies
- openjdk 17 
```
sudo apt-get install openjdk-17-jdk-headless maven
export JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64
```
- graalvm 22.3
```
sudo apt-get install build-essential zlib1g-dev
wget https://github.com/graalvm/graalvm-ce-builds/releases/download/vm-22.3.1/graalvm-ce-java17-linux-amd64-22.3.1.tar.gz -P $HOME
cd $HOME && tar -xf graalvm-ce-java17-linux-amd64-22.3.1.tar.gz
export GRAALVM_HOME=$HOME/graalvm-ce-java17-22.3.1
```

## build
mvn -Pnative spring-boot:build-image

## run app
java -jar target/reactive-0.0.1-SNAPSHOT.jar

## run as native image
java -Dspring.aot.enabled=true -jar target/reactive-0.0.1-SNAPSHOT.jar

## build native container
mvn -Pnative spring-boot:build-image

## test native container
mvn -PnativeTest test

## run container
docker run --rm -p 8080:8080 docker.io/library/reactive:0.0.1-SNAPSHOT
