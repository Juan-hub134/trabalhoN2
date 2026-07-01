FROM openjdk:17-jdk-slim

# Copia o JAR gerado para o container
COPY target/seu-arquivo.jar app.jar

# Expõe a porta do Spring Boot
EXPOSE 8080

# Comando para rodar o JAR
ENTRYPOINT ["java", "-jar", "/app.jar"]