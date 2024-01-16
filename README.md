# Finding-Spare-Parts-Using-AI
This is a repository for our University (AUEB) course lesson "Programming 2".  In this project we use AI technologies with Java programming language and Maven as a build automation and project management tool. Our project helps mechanics and car lovers easily find or suggest the best suited spare parts for cars.

## Compilation Instractions

To compile the **Finding-Spare-Parts-Using-AI project** we use the **MAVEN** build automation and project management tool.

Make sure you have Maven installed on your system. If not, you can download it from [Maven's official website](https://maven.apache.org/download.cgi).

To compile the program using Maven, navigate to the project's root directory in the terminal and run:

> mvn clean install

## Execution Instractions

To execute the program from the command line:

First, navigate to the folder that you have saved the repository in your local device using the following command.

> cd (+ path to your saved folder)

Second, compile the wanted java files using the following command.

> javac RegistrationForm.java App.java ChatGPT.java

Then execute the java file using the command.

> java RegistrationForm

## Usage Instructions

After executing the RegistrationForm.java file, the user will be asked to sign in or sign up to the program, using the credentials saved to the database (Username and Password).

Then, you will be asked to insert the user's secret API key to create the connection with the AI model.

Next, the user is asked to insert **the brand, the model, the year of construction and the name of the spare part** of the car they are lookig for.

After these easy steps, the AI model returns the ideal spare part for the user's needs.

## Repository Structure

Below you can see the repository's structure: 

![](https://github.com/Alexandra-Stath/Finding-Spare-Parts-Using-AI/blob/development/Screenshot_2.png "Repository Structure")

## UML Diagram

This is the UML Diagram for our project:

![](https://github.com/Alexandra-Stath/Finding-Spare-Parts-Using-AI/blob/development/Screenshot%202024-01-16%20200039.png "UML Diagram")

## Data Structures and Algorithms

The fundamental data Structures and Algorithms of our project are:

1. The App constructor that fills the database with the names of the parts of the vehicle

2. The chatGPT method that creates the connection between our project and the AI Technology, we use the ChatGpt open AI.

3. The SignIn and SignUp methods that create the connection between the SQL database and the RegistrationForm.java file.
