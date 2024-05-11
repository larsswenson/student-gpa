# Student GPA Management 

This Java app manages and sorts a list of students based on GPA. It demonstrates the use of the `Comparable` interface to establish a natural ordering of student objects.

## Features

- **Sorting Students by GPA**: Students are sorted in ascending order based on GPA.
- **Class Definition**: The `Student` class includes properties for student ID, name, and GPA.
- **Comparable Interface**: Implements the `Comparable<Student>` interface to compare students' GPA.

## File Structure

- `Student.java`: Contains the `Student` class along with the main method to demonstrate sorting functionality.

## Prerequisites

- Java Development Kit (JDK)

### Compiling the Program

1. Save the `Student.java` file in a directory on your computer.
2. Open a command prompt or terminal window.
3. Navigate to the directory where the file is located.
4. Compile the Java program by running:
   ```bash
   javac Student.java

   java Student

The output will be the list of students sorted by GPA in ascending order.
