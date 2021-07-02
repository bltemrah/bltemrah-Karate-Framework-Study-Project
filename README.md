# Automation Testing Exercise by Using Karate Framework Features

In this repository, I use different test scenarios to show how QA/SDET can implement Karate framework, which is one of the populer framework in the IT market, in their work environment. As seen, Karate framework is easy to use for particulary Backend test. Many functions is coming with the framework, so QA/SDET does not need to waste her/his time to write a code to have some fundamental methods. 

## Instructions

Test Scenarios are prepared by;

**Emrah Bulut**

**QA Test Automation Engineer**

**bltemrah@gmail.com**

**https://www.linkedin.com/in/emrah-bulut-66802453/**

#### Build Tool
```bash
Maven
```

#### Dependency
```bash
        <dependency>
            <groupId>com.intuit.karate</groupId>
            <artifactId>karate-apache</artifactId>
            <version>0.9.6</version>
            <scope>test</scope>
        </dependency>

        <dependency>
            <groupId>com.intuit.karate</groupId>
            <artifactId>karate-junit5</artifactId>
            <version>0.9.6</version>
            <scope>test</scope>
        </dependency>
```

#### Features
```bash
src > test > java > com > finspire > features
```

#### System Requirements

Java 8 + SDK

#### Test Scenario
1. I particulary created scenarios to show how to use Karate Framewrok features.
2. There are two more packages names data and utilites.
3. In the utilities package, there are different java class for the database connection, data generator and so on.
4. Since there are more than one scenarios in some features, there is Parallel runner to execute in parallel.

