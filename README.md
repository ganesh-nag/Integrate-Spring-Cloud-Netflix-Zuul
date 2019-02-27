# Example-SpringCloudNetflix-Zuul-Ribbon-Eureka

@author Ganesh Nagalingam

GitHub
Proof of Concept shows Spring boot application that explores Zuul router integration with Ribbon to identify services through service id from Eureka discoverer.
Two types of Clients, such as Feign and Rest Template have been used to compare service invocation styles.
Four different modules have been created and integrated. Multiple instances have been created to test load balance capability.

This is a working example that shows microservices development using the following technology stack. For learning purpose, you can import these projects as Maven projects to test in your local machine.
a. Java SE 11
b. Spring boot
c. Zuul router
d. Ribbon LB
e. Feign, Rest template ( 2 different clients used to compare and contrast)
f. Eureka discoverer server
