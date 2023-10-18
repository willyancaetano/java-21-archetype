# A Maven archetype project for using Java 21 and JUnit 5.x

This is a Maven archetype project for using Java 21 and JUnit 5.x.

## How to use

1. Clone this repository.
2. Install and configure [Java 21](https://www.oracle.com/java/technologies/downloads/) and Maven [3.9.5](https://dlcdn.apache.org/maven/maven-3/3.9.5/binaries/apache-maven-3.9.5-bin.tar.gz).
3. Run `mvn clean install`.
4. After you do that, you can `cd ../somewhere-else` and run `mvn archetype:generate`, and the last item on the list will be your locally installed archetype, which you can select by number.

The resulting Java project contains a minimal HelloWorld and accompanying test and uses the latest JUnit 5.x and latest versions of various Maven plugins. To package and run the resulting project, you'd typically:

* `mvn clean package`
* `java -jar target/${artifactId}-${version}.jar`