# A Maven archetype project for using Java 21

This is a Maven archetype project for using Java 21
## How to use

1. Clone this repository.
2. Install and configure [Java 21](https://www.oracle.com/java/technologies/downloads/) and Maven [3.9.5](https://dlcdn.apache.org/maven/maven-3/3.9.5/binaries/apache-maven-3.9.5-bin.tar.gz).
3. Run `mvn clean install`.
4. After you do that, you can `cd ../somewhere-else` and run `mvn archetype:generate`, and the last item on the list will be your locally installed archetype, which you can select by number. The image below shows an example:

![Selection_001](https://github.com/willyancaetano/java-21-archetype/assets/72472115/10f9dce6-25a0-4a6b-9287-1cd9ca2d8a71)

The resulting Java project contains a minimal HelloWorld and accompanying test and uses the latest JUnit 5.x and latest versions of various Maven plugins. To package and run the resulting project, you'd typically:

* `mvn clean package`
* `java -jar target/${artifactId}-${version}.jar`
