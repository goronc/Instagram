# Utilise une image Java officielle comme image de base
FROM openjdk:17-jdk-slim

# Créez un répertoire pour l'application
WORKDIR /app

# Copiez le fichier JAR de l'application dans le conteneur
COPY target/rest-service-0.0.1-SNAPSHOT.jar app.jar

# Exposez le port sur lequel l'application écoute
EXPOSE 8082

# Commande pour exécuter l'application
ENTRYPOINT ["java", "-jar", "app.jar"]
