# Watiqai Khuska - Ecuadorian Semantic Repository  #

Ecuadorian Semantic Repository of Ecuadorian Academics for the discovery of common research areas. The platform is based on the Apache Marmotta Linked Data Platform.

### What is this repository for? ###

**Quick summary**

Watiqai Khuska in a quechua phrase that means "Research together". 

**Version**


**Sponsors and Contributors**

[CEDIA](https://www.cedia.org.ec)

Computer Science Department - University of Cuenca

### How do I get set up? ###

**System requirements**

1. Java JRE 1.7.0_45 or superior
2. Maven 3 or superior
3. 1GB main memory
4. Java Application Server (Tomcat 7.x or Jetty 6.x)
5. Database engine(PostgreSQL, MySQL - if not explicitly configured, an embedded H2 database will be used)

**Summary of set up**

Download, fork or clone the repository from the [Repo URL](https://santteegt@bitbucket.org/ecsemanticrep/watiqay-khuska-ecuadorian-semantic-repository-for-researchers.git)

**Deployment instructions**

* Open a Terminal window and Go to the repository folder ***${wkhuska.home}***
* Execute ** mvn package install* (If you need a fast deplyment you can use the parameter ***-DskipTests=true***)
* The deployed application will be installed In the directory *${wkhuska.home}/webapp/target/marmotta.war*
* If you need to run the application for testing purposes you can go to the directory *${wkhuska.home}/webapp* and execute from a terminal window ***mvn tomcat7:run***

**Marmotta Configuration**

If you're deploying an instance using your own Application Server you need to set the Marmotta Home Directory. (e.g. in Tomcat 7 you can set it on the setenv.sh file as 
    
    *export MARMOTTA_HOME=/path/to/marmotta/home*

**Database configuration**

Marmotta comes configured with an H2 Embedded Database instance, but for production it's recommended that you configure a Database Server. Before using the application instance you need to create both a Database Schema and a User in your preferred database Vendor, and configure it in Marmotta through the Admin interface.


### Contribution guidelines ###

**Develop a new module**

To create a new module you can make a copy of the example module *base-module* or you can create a new project using the default Marmotta maven artifacts: 

    mvn archetype:generate -DarchetypeGroupId=org.apache.marmotta -DarchetypeArtifactId=marmotta-archetype-module 

You **MUST** follow the same pom schema as the base-module.

You **MUST** follow the Java code Conventions when programming a new module.

You **MUST** develop test cases for your module.

**Develop a web module or interface**

Any new frontend or web interface must be deployed using the **webapp** project on the repository. You have a base frontend example on *src/main/webapp/wkhome* folder that you can clone to develop your own custom fronted app. The base technology stack that you should use for developing and testing is:

* Nodejs
* Bower
* AngularJS
* Bootstrap
* jQuery
* Karma (unit tests)
* Protractor (End to End tests)

**Writing tests**

**Code review**

**Other guidelines**

### Who do I talk to? ###

* Repo owner or admin
* Other community or team contact