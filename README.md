# API-for-sending-notifications
This is a small application for sending notifications in 3 different channels. 1) SMS 2) push 3) e-mail. The application is built on a microservice architecture on the Spring Cloud stack, using components such as Gateway, Spring Eureka. As a send trigger, simply write to the log: 1) "sms was sent" 2) "push was sent"  3) "email was sent"

## Getting started
### 1. Build project
```shell
./eureka_server/gradlew clean build
```
### 2.1 Launch with CLI
In root folder:
```shell
java -jar eureka_server/build/libs/eureka_server-0.0.1-SNAPSHOT.jar
java -jar senderPush/build/libs/senderPush-0.0.1-SNAPSHOT.jar
java -jar senderEmail/build/libs/senderEmail-0.0.1-SNAPSHOT.jar
java -jar senderSMS/build/libs/senderSMS-0.0.1-SNAPSHOT.jar
java -jar api-gateway/build/libs/api-gateway-0.0.1-SNAPSHOT.jar

```
### API
curl -X GET http://localhost:8765/send/push\?msg\=Somemessage

curl -X GET http://localhost:8765/send/sms\?msg\=Somemessage

curl -X GET http://localhost:8765/send/email\?msg\=Somemessage


Also you can follow `localhost:8765/send/push?msg=Some message` in browser


