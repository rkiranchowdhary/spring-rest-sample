# spring-rest-samples
Sample Sprint Rest App in Get, Post, Put and DELETE

Below is the command to generate seed of a maven quick start application, which will generate the project structure and also the pom.xml which is needed for building the project . The pom.xml file used for specifying the dependencies.

```
mvn archetype:generate -DgroupId=com.paypal.rest -DartifactId=spring-rest  -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

Here ``archetype:generate`` means creating a new template, ``-DgroupId=com.paypal.rest`` is for specifying the group id, ``-DartifactId=spring-rest`` is for specifying the application name, ``-DarchetypeArtifactId=maven-archetype-quickstart`` is to specify which template to use and ``-DinteractiveMode=false`` is to make the process interactive.

Below is the reference link to get to know more about the maven archetypes.
https://maven.apache.org/guides/introduction/introduction-to-archetypes.html

If you are using any external dependencies you need include it in the dependencies section in the pom.xml file.
For searching dependency lib names you can use the below link.
http://search.maven.org/

Building project using maven

```
mvn clean install
```

Running application / jar file

```
java -jar spring-rest.jar
```

Setting up gradle:
Here gradle is optional, you can either use maven or gradle for building your project, but gradle provides easy way to specify dependencies, and it manages dependencies very well. Gradle integrates well with maven, and it can make use of maven repository.

Installing gradle with brew.

```
brew install gradle
```

You can create a gradle project from maven project(pom.xml) by running the below command in the project directory.

```
gradle init
```

On creating the gradle project using above command it will create files ``build.gradle`` and ``settings.gradle`` from the maven project using the pom.xml.

Creating gradle wrapper:
Gradle wrapper enable us to build the project without installing gradle on the local machine and it also take care of the gradle version to use. To create a gradle  wrapper run the below command.

```
gradle wrapper --gradle-version 2.0
```

After running the above command it will create the two files, they are ``gradlew`` and ``gradlew.bat``.

Any person who don't have the gradle installed can use the gradlew (gradlew.bat for windows) to download dependencies and build the project. It will actually download the correct version of gradle and keep it in the ``<project>/.gradle/<version>/`` directory.

Building the project with Gradle Wrapper:

```
gradlew clean install
```

Dependency management in Maven and gradle (using maven repository).
To manage dependencies we need to decide on the libraries that we are going to use. Mainly here we need to know the artifactid(lib name), groupid(company/package name) and version number. And then go to the website http://mvnrepository.com and search for your library and get the artifact id and group id from there.
Ex: Suppose if you want to use the Spring-core 4.3.3 then goto the URL https://mvnrepository.com/artifact/org.springframework/spring-core/4.3.3.RELEASE. There you will find the dependency data(xml) for maven, gradle , ivy and also for the SBT. Include those dependency information in your project. Ex. for maven (include it in pom.xml) , for gradle (include it in the build.gradle).

Use application.properties to configure server properties like port number context path etc..
