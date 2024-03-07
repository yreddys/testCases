FROM openjdk:8
EXPOSE 8080
ADD target/movieBooking.jar movieBooking.jar
ENTRYPOINT ["java","-jar","/movieBooking.jar"]
