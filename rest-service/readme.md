le projet a été conteneurisé ce qui signifie de lancer uniquement le conteneur du projet pour lancer la BDD associer.

Pour générer le JAR éxécuter la commande:

./mvnw clean package

Une fois le fichier JAR créer, le nom de ce fichier JAR présent dans le dossier target (dans cet exemple "rest-service-0.0.1-SNAPSHOT.jar" devra etre configurer dans le dockerfile)

le fichier .YML docker-compose devra etre configurer de sorte a ce que le port et le nom de la BDD soit correct mais aussi le port et le nom de conteneur

Pour créer l'image du conteneur éxécuter la commande: 

docker build -t commentaire . 

Cette commande permettra de créer l'image qui permettra de lancer le tout

Pour finir éxécuter la commande :

docker-compose up 

pour lancer le conteneur
