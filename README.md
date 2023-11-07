# User & UserList
# Inlämningsuppgift - Erik Wei (console application)

- [Markdown Guide: Markdown Cheat Sheet](https://www.markdownguide.org/cheat-sheet/)
- [Github: About READMEs](https://docs.github.com/en/repositories/managing-your-repositorys-settings-and-features/customizing-your-repository/about-readmes)

This is a console application for creating and managing
an instance of users and its ID along with email

No information input by the user will be saved anywhere.

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
