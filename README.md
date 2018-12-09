# Feed API
## Spring Boot restful API for users and feeds using MySQL and docker-compose

### 1. Requirements
This project has the following dependencies:
    
    * Docker and docker-compose
    * Spring Boot
    * Gradle
    * Java 8

### 2. Setup the application
The application jar file must be built on the host, run

```sh
$ ./gradlew build jar
```

To build the application docker image, run

```sh
$ docker build -t feed-api .
```

### 3. Run the application
From the root of the project, run

```sh
$ docker-compose up
```