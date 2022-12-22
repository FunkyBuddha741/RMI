# RMI

#Steps to Run

#Install Java in your system

Clone this repository

To compile all files, use the command below:
javac *.java
Create stub using:
rmic PowerService
Initialize registry using:
1) start rmiregistry 5000 ( for Windows user)
2) rmiregistry 5000 & ( for Unix User)
3) Start the RMI server we have created using:
4) java PowerServiceServer

In another command shell, start RMI client as well using:
1) java PowerServiceClient


The server performs following operations:
* Calculates square
* Calculates power
* Adds two numbers
* Subracts two numbers
* Multiplies two numbers
* Divides two numbers
* Finds GCD of two numbers
* Finds LCM of two numbers

You can type in any number from 1 to 8 to perform your desired operation, once you run RMI client.
