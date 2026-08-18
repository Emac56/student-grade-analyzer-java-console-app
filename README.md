# Student Grade Analyzer

A beginner-friendly Java console application for analyzing a student's grades.

The application accepts a student's name, quiz score, midterm score, and final score. It calculates the average and determines the student's classification.

Built with **Java + Gradle** and developed/run using **J Studio on Android**.

## Features

- Student name input
- Quiz score input
- Midterm score input
- Final score input
- Average calculation
- Grade classification
- Student report display
- Simple layered architecture

## Technologies

- Java
- Gradle
- J Studio

## Project Structure

```text
student-grade-analyzer-java-console-app/
├── build.gradle
├── settings.gradle
├── gradle.properties
├── gradlew
├── gradlew.bat
├── gradle/
│   └── wrapper/
└── src/
    └── main/
        └── java/
            └── com/
                └── studentgradeanalyzer/
                    └── app/
                        ├── App.java
                        ├── Student.java
                        ├── StudentController.java
                        ├── StudentService.java
                        ├── Util.java
                        └── View.java
```

## How to Run

### 1. Open the Project in J Studio

Open **J Studio** on your Android device.

Open or import the project folder:

```text
student-grade-analyzer-java-console-app
```

Make sure you open the **project root**.

The root folder should contain:

```text
build.gradle
settings.gradle
gradlew
gradlew.bat
src/
```

Do not open only the `src` folder.

### 2. Open the Terminal

Open the terminal in J Studio.

Check Java:

```bash
java -version
```

Check the Java compiler:

```bash
javac -version
```

Both commands should return a Java version.

### 3. Build the Project

This project uses the **Gradle Wrapper**, so you do not need to install Gradle separately.

On Android/Linux:

```bash
./gradlew build
```

If you receive:

```text
Permission denied
```

run:

```bash
chmod +x gradlew
```

Then:

```bash
./gradlew build
```

A successful build should show:

```text
BUILD SUCCESSFUL
```

### 4. Run the Application

If `build.gradle` is configured with the Gradle `application` plugin, run:

```bash
./gradlew run
```

The application will start in the terminal.

Example:

```text
Student name : Juan Dela Cruz
Quiz Score : 90
Midterm Score : 85
Final Score : 95
```

The application then displays:

```text
==== STUDENT REPORT ====
Student : Juan Dela Cruz
Id      : 1

Quiz    : 90
Midterm : 85
Final   : 95

Average : 90

Status  : Excellent
```

## How the Application Works

The application follows this flow:

```text
User
 ↓
View
 ↓
StudentController
 ↓
StudentService
 ↓
Student
 ↓
View
 ↓
Student Report
```

### App

`App.java` is the entry point of the application.

It creates and connects the main objects:

```text
App
 ├── Util
 ├── Student
 ├── StudentService
 ├── StudentController
 └── View
```

Then it starts the application through:

```java
view.start();
```

### View

`View.java` handles interaction with the user.

It asks for:

```text
Student name
Quiz score
Midterm score
Final score
```

The View sends the collected data to the controller.

```text
View
 ↓
StudentController
```

### StudentController

`StudentController.java` receives the data from the View and passes it to the service.

```text
View
 ↓
StudentController
 ↓
StudentService
```

The controller acts as the connection between the View and the Service.

### StudentService

`StudentService.java` contains the main business logic.

It:

1. Calculates the average.
2. Determines the classification.
3. Stores the calculated values in the `Student` object.

The average is calculated using:

```text
(quiz + midterm + final) / 3
```

Current classification:

| Average | Classification |
|---:|---|
| 90–100 | Excellent |
| 80–89 | Very Good |
| 75–79 | Good |
| Below 75 | Failed |

### Student

`Student.java` represents the student's data.

It contains:

```text
ID
Student name
Quiz score
Midterm score
Final score
Average
Status
```

It acts as the model/entity that holds the student's information.

### Util

`Util.java` contains reusable input functionality.

Currently it handles:

```text
inputString()
inputInt()
```

This keeps `Scanner` input handling separate from the View.

## Gradle Commands

Build the project:

```bash
./gradlew build
```

Run the application:

```bash
./gradlew run
```

Clean generated build files:

```bash
./gradlew clean
```

Build while skipping tests:

```bash
./gradlew build -x test
```

On Windows:

```cmd
gradlew.bat build
```

```cmd
gradlew.bat run
```

## Git and Gradle

The project uses the Gradle Wrapper.

These should normally be committed:

```text
gradlew
gradlew.bat
gradle/wrapper/
build.gradle
settings.gradle
gradle.properties
```

Generated Gradle files should normally be ignored:

```text
.gradle/
build/
```

Example `.gitignore`:

```gitignore
.gradle/
build/

.idea/
*.iml
.vscode/
```

## Troubleshooting

### `./gradlew: Permission denied`

Run:

```bash
chmod +x gradlew
```

Then:

```bash
./gradlew build
```

### `JAVA_HOME` Problem

Check:

```bash
java -version
```

and:

```bash
javac -version
```

If Java is not available, configure a JDK in your development environment.

### `Task 'run' not found`

The Gradle project may not have the `application` plugin or its required configuration.

Check your `build.gradle`.

### `build/` or `.gradle/` Appears After Running Gradle

This is normal.

Gradle generates:

```text
.gradle/
build/
```

## Author

**Emac56**

Beginner Java / Backend Development Practice Project
