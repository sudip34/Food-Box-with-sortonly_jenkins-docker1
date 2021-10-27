FROM openjdk:8-alpine
EXPOSE 8080
ADD target/foodbox-bankend.jar foodbox-bankend.jar
ENTRYPOINT ["java","-jar","/foodbox-bankend.jar"]
