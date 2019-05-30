# Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine

# Make port 8080 available to the world outside this container
EXPOSE 8080

# The application's jar file
#ARG JAR_FILE=target/address-management-0.0.1-SNAPSHOT.jar

# Add the application's jar to the container
ADD ${JAR_FILE} address-management.jar

# Run the jar file ab
ENTRYPOINT ["java","-jar","/address-management.jar"]