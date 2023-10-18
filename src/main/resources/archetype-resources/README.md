# ${projectDescription}#[[

## Requirements

### Download and config or install via [SDKMAN](https://sdkman.io/)

#### Download
1. Get Java 21 [here](https://www.oracle.com/java/technologies/downloads)
2. Get maven 3.9.5 [here](https://dlcdn.apache.org/maven/maven-3/3.9.5/binaries/apache-maven-3.9.5-bin.tar.gz)
3. Add above to your path if necessary.

#### Via SDKMAN
1. Install [SDKMAN](https://sdkman.io/install)
2. Install Java using SDKMAN -> `sdk install java 21-oracle && sdk use java 21-oracle`
3. Install Maven using SDKMAN -> `sdk install maven 3.9.5 && sdk use maven 3.9.5`

### Execute project
1. `git clone ${scmUrl}`
2. `mvn clean package`
3. `java -jar target/${artifactId}-${version}.jar`
]]#