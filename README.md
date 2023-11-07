# Inlämningsuppgift - Erik Wei (console application)
##  User & UserList


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

[![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com/en/)

[![OpenJDK](https://img.shields.io/badge/openjdk-437291.svg?style=for-the-badge&logoColor=yellow&logo=data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABgAAAAYCAYAAADgdz34AAAABmJLR0QA/wD/AP+gvaeTAAAB0UlEQVRIia3VTYiNURgH8N+dO0rjhsbMgikNUVakTM0GC1kqH1lQStwFFhYWylqxsNJEyXZKSUm+SygRpZSP1TQ+YgglEdMI1+Kcm9d13tvc995/nd56nuf8/895n+c8p6w1HMUCPG5x37SwAzVMYU2nyZdiMgrU8AazOylwOUNeXyOdIt+SIK/hF1a1S14SCpoSqOFquwKbItFvHMcyDOKgvzUZbkfgfiQ5nfDtj76LzQjKTXzLMYBzuIJXDf4xzMcXPMHnFElXE4GdOIyJnES68BZHsDuPJE9gMfrwDrewNSeBS3iOJViUIkpltho3hD5/iq+oYA8+YC72CYU/E/dUcBZ38TrvNLANd3APvQ2+QezFAaE+WczDgyiQOi3YiPOYidFmWeRgFD24gA11Y7YGQzgldMZYAYFnWIiTcu5GP25iezaDFrAeVaF+/XlBVaErBgoI9AoFrmaNjW36UfiPEwUEPglvxfu8gFkYx+0C5HVcixw9dUP2BD+xVrj2RTGOdZELdGecU8JLNaMNgTJeZg2pUdGdsE0X/yWXInuBlXiEOdiFFXFzCd/i94cwqq8LY2NI6MB/UEoIVHBMuNFwAg9z4jYL/T8Z1yF8zwb9AbKCa544nxFWAAAAAElFTkSuQmCC)](https://openjdk.org/)

[![Maven](https://img.shields.io/badge/apachemaven-C71A36.svg?style=for-the-badge&logo=apachemaven&logoColor=white)](https://maven.apache.org/)

[![JetBrains IntelliJ IDEA](https://img.shields.io/badge/IntelliJ_IDEA-000000.svg?style=for-the-badge&logo=intellij-idea)](https://www.jetbrains.com/idea/)


<p style="font-family: Bahnschrift;  text-align: center">(<a href="#readme-top">back to top</a>)</p>


<!-- GETTING STARTED -->
## Getting Started

If you are planning to set up the project locally I would recommend to clone it from GitHub.

Follow the Github-link, go to code and either 'Download ZIP' or Open with GitHub Desktop

![GitHub Clone wih Desktop](https://gyazo.com/72a5a39d865eb5455846e360f4bcf170)

### Prerequisites

The code can be run with any java IDE. For most reliable and accurate compilation please use [IntelliJ IDEA](https://www.jetbrains.com/idea/)

Another option would be using the Linux distribution Ubuntu. 
If you are running Windows I recommend Ubuntu found in Microsoft Store

### Installation

1. Get a free API Key at [https://example.com](https://example.com)
2. Clone the repo
   ```sh
   git clone https://github.com/github_username/repo_name.git
   ```
3. Install NPM packages
   ```sh
   npm install
   ```
4. Enter your API in `config.js`
   ```js
   const API_KEY = 'ENTER YOUR API';
   ```

<p align="right">(<a href="#readme-top">back to top</a>)</p>


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

How to add an image: ![Alt text](https://gyazo.com/72a5a39d865eb5455846e360f4bcf170).

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
