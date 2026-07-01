FROM openjdk:21-jdk-slim

# Copia o arquivo JAR gerado no build para o container
COPY target/seu-arquivo.jar app.jar

# Expõe a porta que o Spring Boot usa
EXPOSE 8080

# Comando para rodar a aplicação
ENTRYPOINT ["java", "-jar", "/app.jar"]