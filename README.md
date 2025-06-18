# Una_Interview
Written is a simple application with Spring Boot and MySQL / Postgres DB. With structured code so that there are domain/entity, repository and service layers. The application does provide a GraphiQL Web Interface to create a record and to modify an existing record using GraphQL API. 

How to run this web app: 

Prequisite: 
*Java 17
*Docker installed and running 

1. Open command prompt and be sure to change directory as where you put the files
Ex: "cd D:\Una^ Community\" and inside this folder is where you put all the files from this github

2. Using docker to run database

"Docker compose up -d" 

The database name is mysql-una and the container name 
is unacommunity if somehow it conflicting Please let me know. 

3. Start the app

"mvnw.cmd spring-boot:run"

4. Now for how to insert GraphiQL Input: 

A. Insert data ex:

mutation {
  createAssurance(name: "Justin Habel", age: 21, assuranceType: "Basic") {
    id
    name
    age
    assuranceType
  }
}

B. Update data ex:
mutation {
  updateAssurance(id: 1, name: "Jordan Cain", age: 22, assuranceType: "Basic") {
    id
    name
    age
    assuranceType
  }
}

C. Query all data:
query {
  getAllAssurances {
    id
    name
    age
    assuranceType
  }
}

D. Delete by Id:
mutation {
  deleteAssurance(id: 123)
}

E. Query data by Id Ex:
query {
  getAssuranceById(id: 1) {
    id
    name
    age
    assuranceType
  }
}


Just in case:
To install Java, go to https://www.oracle.com/java/technologies/downloads/?er=221886#jdk24-windows

After downloading the 64 Installer, run it, and put it anywhere

Edit environment variable in system variable make new JAVA_HOME and for the value
put in the jdk-24 at, start is at "C:\Program Files\Java\jdk-17"

and also in system variables, you can see path, double click and in there add new
"%JAVA_HOME%\bin"


IF ANYTHING WERE TO HAPPEN, OR NOT WORKING CONTACT: 0895620350762 OR
Justinhabelk@gmail.com
