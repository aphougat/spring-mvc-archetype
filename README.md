# spring-mvc-archetype
spring-mvc-archetype with MongoDB
This is a maven archetype to generate a spring MVC @RestController project Relying on Spring Data to connect to mongodb. 

you can download the archetype jar from here : https://github.com/aphougat/spring-mvc-archetype/blob/master/target/spring-mvc-archetype-1.0-SNAPSHOT.jar

Please go to the location where you dowloaded this jar and follow below steps. 

Command:
mvn archetype:generate -DarchetypeGroupId=com.itembryo -DarchetypeArtifactId=spring-mvc-archetype -DarchetypeVersion=1.0-SNAPSHOT -DgroupId=<your group ID> -DartifactId=<your artifact id>
  
 Example: 
 
 mvn archetype:generate -DarchetypeGroupId=com.itembryo -DarchetypeArtifactId=spring-mvc-archetype -DarchetypeVersion=1.0-SNAPSHOT -DgroupId=com.itembryo -DartifactId=juspayclient
 
 **Please install maven before using these steps
