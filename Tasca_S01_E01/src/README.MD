Technologies
Java --version 25

Project Structure
.
├── Tasca_S01_E01.iml
├── out
│   └── production
│       └── Tasca_S01_E01
│           ├── README.MD
│           ├── exercise01instrument
│           │   ├── Instrument.class
│           │   ├── Main.class
│           │   ├── PercussionInstrument.class
│           │   ├── StringInstrument.class
│           │   └── WindInstrument.class
│           ├── exercise02car
│           │   ├── Car.class
│           │   └── Main.class
│           └── exercise03phone
│               ├── Camera.class
│               ├── Clock.class
│               ├── Main.class
│               ├── Phone.class
│               └── Smartphone.class
└── src
├── README.MD
├── exercise01instrument
│   ├── Instrument.java
│   ├── Main.java
│   ├── PercussionInstrument.java
│   ├── StringInstrument.java
│   └── WindInstrument.java
├── exercise02car
│   ├── Car.java
│   └── Main.java
└── exercise03phone
├── Camera.java
├── Clock.java
├── Main.java
├── Phone.java
└── Smartphone.java

Application setup.
Clone from github
git clone https://github.com/hmoa575/IT_Academy_Especialitzacio/tree/main/Tasca_S01_E01

Tasca Sprint 01 - Exercise 01 Description

Exercise 01 - Instrument

Instrument
Abstract class that represents a generic musical instrument. It defines the common attributes name and price, as well as the abstract method play(), which must be implemented by each subclass to represent its specific behavior when played.

WindInstrument
Subclass of Instrument that represents a wind instrument. It implements the play() method by printing the corresponding message for this type of instrument.

StringInstrument
Subclass of Instrument that represents a string instrument. It overrides the play() method to display a message indicating that a string instrument is being played.

PercussionInstrument
Subclass of Instrument that represents a percussion instrument. It implements the play() method with a specific message for this kind of instrument.

Main
Main class of the exercise. Its purpose is to create instances of the different instrument types and execute their methods in order to demonstrate inheritance, polymorphism, and class loading behavior in Java.

Exercise 02 - Car

Car
Class that represents a car and is used to practice static and final attributes in Java. It includes the attributes brand, model, and power, as well as a static method brake() and an instance method accelerate(), showing the difference between static and non-static behavior.

Main
Main class of the exercise. It tests the functionality of the Car class by calling the static method brake() without creating an object and the instance method accelerate() through an object, demonstrating how both kinds of methods are used.

Exercise 03 - Phone

Phone
Base class that represents a phone. It contains basic information such as brand and model, and includes the method call() to simulate a phone call.

Camera
Interface that defines behavior related to camera functionality. It requires the implementation of a method that represents taking a picture.

Clock
Interface that defines behavior related to clock or alarm functionality. It requires the implementation of a method that represents an alarm sound.

Smartphone
Class that extends Phone and implements the Camera and Clock interfaces. It represents a more complete device that combines the ability to make calls, take pictures, and use alarms.

Main
Main class of the exercise. It creates a Smartphone object and executes its different functionalities in order to demonstrate the combined use of inheritance and interfaces in Java.

