# User & UserList
# Inlämningsuppgift - Erik Wei (console application)

- [Markdown Guide: Markdown Cheat Sheet](https://www.markdownguide.org/cheat-sheet/)
- [Github: About READMEs](https://docs.github.com/en/repositories/managing-your-repositorys-settings-and-features/customizing-your-repository/about-readmes)


<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#roadmap">Roadmap</a></li>
    <li><a href="#contributing">Contributing</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
    <li><a href="#acknowledgments">Acknowledgments</a></li>
  </ol>
</details>

## About the Project

This is a console application for creating and managing
an instance of users and its ID along with email

No information input by the user will be saved anywhere.

### Built With

This code is written in the **Java** programming language and built using 
**Maven**. It also uses the **OpenJDK** implementation of the Java Platform Standard Edition (Java SE). 
Which provides the Java compiler, the Java virtual machine, and the Java class library. 
The code is developed and edited using the **IntelliJ IDEA**, an integrated development environment (IDE)
that supports Java and other languages.

* **Maven** is a free, open-sourced build automation, and project management tool. 
This will automate the source code compilation and dependency management.
Hosted by the Apache Software Foundation, Maven originated as part of the Jakarta Project.

* **OpenJDK** is a free and open-source implementation of the Java Platform, Standard Edition (Java SE). 
It provides the Java compiler, the Java virtual machine, and the Java class library that are needed to run Java programs.
OpenJDK is based on the source code of the Java Development Kit (JDK), which is a commercial product of Oracle. 
It is also licensed under the GPL-2.0-only with a linking exception.
This allows other components to link to the Java Class Library without being subject to the GPL license.

* **IntelliJ IDEA** is an IDE for Java and as well as Kotlin, which is not used here. It offers a variety of tools to assist the 
one coding. While I could list a plethora of features the IDE offers, it would unfortunately take up more space than I'd like.
I will instead name a few that I've personally used:
      <ul>
  - Refactoring
  - Code inspection
  - Test running
  - Plugin ecosystem
  - Theme templates
  - Database tools
  - IDE Setting sync
       </ul>
 
  
* [![Java][Java]][https://www.java.com/en/]
* [![Maven][Maven]][https://maven.apache.org/]
* [![OpenJDK][OpenJDK]][https://openjdk.org/]
* [![JetBrains IntelliJ IDEA][JetBrains IntelliJ IDEA]][https://www.jetbrains.com/idea/]


<p align="right">(<a href="#readme-top">back to top</a>)</p>


## How To Use

1. Pull the code from Github
2. Open the project in Intellij IDEA
3. Run `main()` from ``


## Project structure

### `Main.java`

This file is the entry point and will call the UserList to manage users.

Here is where all user input / output is done.

### `User.java`

This file creates private variables for ID, Name, and Email.

### `UserList.java`

This files uses the class 'User' and creates and ArrayList, which manages its users by 
creating, removing, and getting user information.

## Image demo

How to add an image: `![alt text](/assets/DEMO.png)`.

**Demo:**

![alt text](/assets/DEMO.png)

## Link demo

How to add a link: `[Link text](https://example.com/)`.

**Demo:**

[Link text](https://example.com/)

## List demo

### Unordered list

- Unordered one
- Unordered two
- Unordered three

### Ordered list

1. Ordered one
2. Ordered two
3. Ordered three


## Clean code

This code demonstrates using clean code by having descriptive method names such as

- `getAllCars()`: Describes exactly what it does, gets all cars from the database and returns the to the caller
- `throws SQLException`: Throw the exception to the caller so that it can the error correctly
- `executeSelectSql(String sql)`: Describes exactly what it does, takes an SQL query string, executes it and returns
  the result as a `ResultSet`

```java
