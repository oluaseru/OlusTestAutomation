# test-olusprojects-automation

An Selenium / cucumber (java) example project for functional tests on Clear Channel international website.

Instructions:
1. Install maven on my machine either via https://maven.apache.org/download.cg alternatively, install HomeBrew
so you can install Maven using: brew install maven.

1.2 Maven Environment variables needs to be set plus add Maven bin Directory Location to System Path.

2. Clone the project in to your local system via git clone https://github.com/oluaseru/test-automationProjects.git or download the zip.
Use either IntelliJ or Eclipse to import the Project from pom.xml file

3. Import this project as a maven project in e.g. IntelliJ, verify all dependencies have been downloaded from POM.xml without issues.

4. Two way to run the test, either run the test via Maven command in terminal. Navigate to the root of pom.xml and enter **mvn test**
OR open the project in your IDE and navigate to the Run the RunCucumberTest.class at this location below:
test-olusprojects-automation/src/test/java/com/clearchannel/runners/RunCucumberTest.java
