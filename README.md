# Simple-Assembly-Language
A simple implementation of assembly language using JAVA and OPPs. 

# How to start with a fresh Dataset
1. Open the data.properties file as a text file in any text editor of your choice.
2. Clear everything in the file, making it a blank file and thus a blank dataset.

# Functionality
### MV (REG_Name),#(int REG_Value)
* The MV command is used to create a new Register
* It creates a new entry in our data

### ADD (REG1_Name),(int value)/(REG2_Name)
The ADD command has two Functionalities depending on the command
1. Add a constant value to the specified register's value.
2. Add the value of another register into the specified register's value.

### SHOW REG
* This command displays the current state of the data
* Displays all the registers with their present values

### EXIT
* This command is used to exit the program once all the desired operations are done.

#Data Structure Used
* HashMap
* We have to store registers with their values
* Since registers are unique HashMap is the used to store Key,Value pairs
* Static HashMap is used as the data needs to be consistent throughout the program

You can also give multiple commands in a single line by seperating them using ';' at the end of each command 

# Data.Properties File
* It is a source file for our program.
* Our HashMap data is stored and updated onto this file so that it can accessed at any time
* Using this the data is not lost on each run
* The properties class is used which extends the java.util.HashTable to store the data into the file as simple plain text using properties.store
* At the beggining of the program properties.load is used to retrive the data from the file into a Map


