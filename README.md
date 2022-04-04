# FacadePattern

          Facade pattern describe  higher-level interface that makes the sub-system easier to use.
It is the Structural Design pattern. 


        Complexity get removed.Usage of pattern becomes simple and easy to read.
        
        It promotes loose coupling between the subsystem and clients.

         In This project 'Cube','CubeTimesTwo','MultiplyTwoClass' are the interfaces and the "impl" 
packages has all the concrete classes whic implement the interfaces.
         'FacadeImpl' which implement "Facade" interface is a next step.'Main' will use "FacadeImpl" 
class to get the object of concrete classes by passing an  information such as(Cube/CubeTimesTwo/MultiplyTwoClass)
to "Facade" to get the type of object it needs.In these project,the three classes hides its complexities
from the client.



JunitTest:

       The  Junit Test is done of all the entities in  "facade pattern" project and test coverage 
is 100% successful in jacoco report.

       
  SONARQUBE :
          In sonarqube,reliability ,security , securityReview and maintainability is A and 
the code coverage is 100%. 

SONARQUBE :

gradle command to publish code to SonarQube
gradle sonarqube 
  -Dsonar.projectKey=Facade 
  -Dsonar.host.url=http://localhost:9000 
  -Dsonar.login=1fad14f4c0252d3e3dad5f7e1bbe8c732be53e98