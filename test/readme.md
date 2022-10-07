# ABOUT PROJECT
websit:https://flipkart.com
# Technologies/tools/frameworks/libraries-
Java
Selenium
maven
testng
# Modes
Headless:
	To run tests in headless mode, change mode = headless in config.properties
Non-Headless:
	To run tests in non-headless mode, change mode = non-headless in config.properties
# How to run
•	Clone repo from the github link
•	gitHub link :- https://github.com/Winninghacker/seleniumexittest.git 
•	run RunAssignment.bat
# Important Note
To change browser - change the browser in Resources/config.properties
Important Directory
•	Drivers : .drivers/
•	Report File : .reports/ExtentReports.html
•	Log File : ./logs/propertieslogs.log
•	Configuration File: .Resources/config.properties
•	Screenshots Folder: .test\ScreenCapturesJPEG
•	Test Data File : ./TestData/Excellogin.xlsx

Command to install referenced  jar :
C:\Users\gagankaushik\Downloads\selenium-java-3.141.59

How to run through jenkins
•	download jenkins.war file
•	run in cmd
•	setup Jenkins
Screenshots

 
![image](https://user-images.githubusercontent.com/92116290/194550497-94b99bad-ab89-48e2-86fd-5b6d36f8a8d3.png)
![image](https://user-images.githubusercontent.com/92116290/194550537-775b06c7-b1a8-422d-9cdf-7be37eae7c44.png)

Jenkins final
 

Implemented features
•	Create at least 20 automated scenarios across different flows and screens - done
•	Implement POM - done
•	Test data should be read from excel. User has the ability to selective run the test cases by marking yes in the Execution Required field in excel - done
•	Global Parameters should be read from config file like browser name, test site URL, global wait value etc. should be read from a properties file - done
•	Use proper waits i.e. implicit wait and explicit wait wherever necessary. - done
•	The test should run on following browsers IE, Chrome, FF - done
•	There should be an option to run the test cases in headless mode - done
•	Put proper assertions and error screenshot in the extent report - done
•	Create reusable libraries and import these as jars in the current project - done (in.test.pageUtils)
•	Create a ReadMe document which has the steps to install and run the code - done
•	Integration with github and Jenkins done



