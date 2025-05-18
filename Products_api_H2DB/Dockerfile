# Stage 1: Build stage (optional if Jenkins is already building with Maven)
# FROM maven:3.8.6-openjdk-17 AS build
# WORKDIR /app
# COPY . .
# RUN mvn clean package -DskipTests

# Stage 2: Runtime stage
FROM openjdk:17-jdk-slim

# Create a non-root user (optional but recommended)
RUN addgroup --system app && adduser --system --ingroup app appuser

# Create app directory
WORKDIR /app

# Copy the JAR file from the target directory
COPY target/*.jar app.jar

# Run as non-root
USER appuser

# Default command
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
