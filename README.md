# FacadePattern
FACADE PATTERN:
          It says that,provide simplified interface to set of interface in a subsystem,therefore 
it hides the complexities of the subsystem from the client.In other words, facade pattern 
describe a higher-level interface that makes the sub-system easier to use.It is the Structural
Design pattern. 

ADVANTAGES:
        Complexity get removed.Usage of pattern becomes simple and easy to read.It promotes loose 
coupling between the subsystem and clients.

         In This project 'Cube','CubeTimesTwo','MultiplyTwoClass' are the interfaces and the impl 
are the concrete class which implement the interfaces.The facade class 'FacadeImpl' which implement 
the facade interface is a next step.'Main' will use facadeImpl class to get the object of concrete 
classes by passing an  information such as(Cube/CubeTimesTwo/MultiplyTwoClass) to Facade to get 
type of object it needs.In these project,the three classes hides its complexities from the client.




JunitTest:
     There is Junit Test for all the type of facade pattern and test coverage in jacoco report is 100% 
successful.

SONARQUBE 

gradle command to publish code to SonarQube
gradle sonarqube 
  -Dsonar.projectKey=Facade 
  -Dsonar.host.url=http://localhost:9000 
  -Dsonar.login=1fad14f4c0252d3e3dad5f7e1bbe8c732be53e98