# Solution for Rockwell Automation's puzzle "Ceremonial assembly line startup"

## Pre-requisites and How to run 
1 `JDK 8` and maven should be installed.
2. Build the project using the command: `mvn clean`.
3. Run the following commandline to run the tests 
'mvn test'

## Work Summary
* The puzzle is solved by creating 2 classes and 1 enumeration
* Class PLC is created with property "mode" of type enum PlcMode (which has RUN & PROGRAM modes as values)
* Class PuzzleSolution has the algorithm to set and reset the mode of each plc as per the puzzle
* To test the the solution, a test case is created under "RockwellAutomation/CALStartup_Test" which call the solution created in PuzzleSolution class

Solution Test result will be shown as below
![image](https://user-images.githubusercontent.com/56521460/115156680-bef8c100-a085-11eb-87c0-e27b9ea8b69b.png)
