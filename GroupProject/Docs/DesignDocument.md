# Design Document


**Author**: \<Team 6>

## 1 Design Considerations


### 1.1 Assumptions

We assume that the user is only using an Android supported mobile device, and is familiar with using an Android application. 


### 1.2 Constraints

The system is designed to only be used on Android devices. The interaction patterns used will only function on the groceryList mobile app. For instance, the tab bar at the bottom of the screen, that the user will be using to navigate through the app, is designed specifically to be used on an Android mobile device. 


### 1.3 System Environment

The sysem will only operate on up to date Android mobile devices. We will be using Android studio, JAVA Development Kit (JDK)

## 2 Architectural Design

### 2.1 Component Diagram

We are providing various types of components in order to run our program. We need 

### 2.2 Deployment Diagram
***User Interface:*** The user interface component will provide the Graphical User Interface for the app. This is  where the user will decide what they want to do. This component consists of logic and code to render the login page, profile settings after successful login and other user interfaces to provide options to create user This component will interact with all the application logic components that includes Identification, User  using the provided java interfaces.


***Identification:*** This component will identify each user of the application. The identification component will interact with customer component to create the player instance in case user login is successful. The authentication component will interact with database using room persistence library


## 3 Low-Level Design

### 3.1 Class Diagram

![](https://i.imgur.com/Bp3FncD.png)

### 3.2 Other Diagrams


## 4 User Interface Design
- login design
- new user
- tab bar
- settings
