FROM openjdk:11
WORKDIR /app
COPY target/api-management-cars-0.0.1.jar /app/api-management-cars-0.0.1.jar
EXPOSE 8080
CMD ["java", "-jar", "api-management-cars-0.0.1.jar"]
