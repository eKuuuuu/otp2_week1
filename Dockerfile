FROM openjdk:21-jdk-slim

WORKDIR /app

COPY target/otp2_week1-1.0-SNAPSHOT.jar app.jar

EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "app.jar"]