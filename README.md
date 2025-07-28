# e2e-bdd-testing

This repo contains a little E2E automation project that simulates what a true ALF fan might do when browsing TMDB. 

It uses Selenium + JUnit 5 + Cucumber, and automates the full flow of searching for the ALF TV series, accessing its detail 
page, and checking that Paul Fusco is listed as the creator and that the show has at least four seasons. As a bonus, it 
also takes a screenshot once the validations are complete.

## Dependencies
The project uses [Oracle Java OpenJDK 24](https://jdk.java.net/24/)

You will also need to [install Maven](https://maven.apache.org/install.html)

## Running the tests
```bash
cd e2e-bdd-testing/
mvn test
```
