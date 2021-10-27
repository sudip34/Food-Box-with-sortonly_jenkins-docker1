FROM openjdk:8-alpine
EXPOSE 8080
add target/*.jar foodbox-bankend.jar
ENTRYPOINT ["java","-jar","/foodbox-bankend.jar"]
