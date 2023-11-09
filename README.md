# Inlämningsuppgift - Erik Wei (console application)
##  User & UserList


- [Markdown Guide: Markdown Cheat Sheet](https://www.markdownguide.org/cheat-sheet/)
- [Github: About READMEs](https://docs.github.com/en/repositories/managing-your-repositorys-settings-and-features/customizing-your-repository/about-readmes)
<a name="readme-top"></a>

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

![GitHub Clone wih Desktop](https://i.gyazo.com/72a5a39d865eb5455846e360f4bcf170.gif)

### Prerequisites

The code can be run with any java IDE. For most reliable and accurate compilation please use [IntelliJ IDEA](https://www.jetbrains.com/idea/)

Another option would be using the Linux distribution Ubuntu. 

If you are running Windows I recommend Ubuntu found in the Microsoft Store

### Installation

### Ubuntu
These steps will help you install, compile and run the code in Ubuntu

1. First, inside Powershell type:
    >wsl --install
2. Download Ubuntu for Windows at [Microsoft Store](https://www.microsoft.com/store/productId/9PDXGNCFSCZV?ocid=pdpshare)
3. Open installed Ubuntu and choose password etc.
4. Type in:
    >sudo apt-get update

    >sudo apt install openjdk-19-jdk-headless
5. If multiple versions of openjdk is already installed
    >sudo update-alternatives --config java
6. Enter number correlated to the correct openjdk, which should be openjdk-19 in 'auto mode'
7. Double check now that you have the correct version. It should display this.
    >java -version

    >openjdk version "19.0.2" 2023-01-17
8. Install git and clone the repo
    >sudo apt install git
    
    >git --version

9. 
   ```sh
   git clone https://github.com/ErikW-GH/Inlamningsuppgift_ErikWei.git TestFolder
   ```
10. This will create a new directory called `TestFolder`. 
If you do not wish to create this directory remove the text, instead go to 10.b

10.a Change directory to if you have created said directory

>    cd TestFolder/

10.b If you have not created `TestFolder`, enter this instead

>    cd ~/Inlamningsuppgift_ErikWei


11. Compile the code
    >javac -d out src/main/java/org/example/*.java
12. Run the code
    >java -cp out org.example.Main
13. The `-cp out` option sets the classpath to the out directory, and org.example.Main is the fully qualified name of the Main class.

### Windows - IntelliJ IDEA Ultimate
Inside IntelliJ after cloning with GitHub Desktop, run Main.

<p align="right">(<a href="#readme-top">back to top</a>)</p>


## Documentation

In this documentation I will be going through and commenting on every line
that contains some form of explanation that requires so. I will start with the class Main,
and go through User and UserList and its functions. I will be listing some sources as well in the end.


### `Main.java`

This file is the entry point and will call the UserList to manage users.

Here is where all user input / output is done.


`Line 9: private static final Scanner userInput = new Scanner(System.in)`

I will be using the Scanner class throughout this project as a way for the user 
to type in the console with information which will be temporarily stored for each instance (meaning each run).
The scanner as seen in the comment code is outside psvm as it will be 
continually used in other methods contained inside `Main.java`.

`Line 13, 21, 23-24:` 

`UserList userList = new UserList();`

`UserList userList` is an instance of the class `UserList.java`. 
This instance is created in the main method and passed to the menuHandler method,
which will take care of adding, removing, finding and sorting Users stored inside its ArrayList.

`private static void menuHandler(UserList menuList) {` is a method which handles all the operations for the console menu.
They are set to `private`, which limits visibility of the method, and can only be accessed within the same class, 
`Main.java` in this case.

`static` can be called without creating an instance of the class. 
This is helpful as it doesn't depend on the state of any object and neither needs to modify any fields in the class.
However, seeing now as I only call `menuHandler` once in my code, another option would be to remove its static state
and instead initialize it inside psvm. I will refrain from doing so but will instead add inside here how I would do it.

>       Main mainInstance = new Main(); 
>       mainInstance.menuHandler(userList);
>           }
>
>       private void menuHandler(UserList menuList) {


`int menuOption = 0;` is set to 0 as it is a variable which is initialized at that number.
This is created inside `menuHandler` which determines the switch-case operation for when the user inputs an option.

`Line 26-59:`

This is a switch-case which is inside a while-loop 

### `User.java`

This file creates private variables for ID, Name, and Email.

### `UserList.java`

This files uses the class 'User' and creates and ArrayList, which manages its users by
creating, removing, and getting user information.


## Clean code

This code demonstrates using clean code by having descriptive method names such as

- `menuHandler()`: Describes exactly what it does. Handles the menu input
- `askAtStart()`: GUI for options, which will return input to menuHandler
- `askForGoBack()`: Method which returns an input for which the user loops back at the beginning of `askAtStart()` or quits
- `NumberFormatException ex`: Catches for a number and if incorrect prints out error
