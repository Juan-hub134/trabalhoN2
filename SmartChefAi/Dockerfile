# Estágio 1: Compilar o projeto
FROM maven:3.9-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Estágio 2: Rodar a aplicação
FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY --from=build /app/target/SmartChefAi.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]

