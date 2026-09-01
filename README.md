Petronia – Robotic Pet Management System

SE2012: Object-Oriented Analysis and Design

Practical 04 – Object-Oriented Relationships in Java

2025 Year 2, Semester 1

Project Overview

This project implements the Petronia Robotic Pet Management System using Java and demonstrates the main Object-Oriented Programming concepts covered in Practical 04.

Petronia is a futuristic city where humans own intelligent robotic pets. The system supports different robotic pet types such as RoboDog, RoboCat, and RoboBird, along with pet owners, activities, battery management, and competitions.

Implemented OOP Concepts

The completed system demonstrates:

Classes and Objects

Constructors

Constructor Overloading

Constructor Chaining using this()

Superclass Constructor Calls using super()

Access Modifiers

Encapsulation

Inheritance

Method Overriding

Runtime Polymorphism

Aggregation / Object Relationships

Validation

Collections of superclass references

Implemented Classes

RoboPet

The base class for all robotic pets.

It contains the common pet information:

name

model_number

battery_level

The class includes:

No-argument constructor

Parameterized constructor

Overloaded constructor

Constructor chaining with this()

Getters and setters

Battery recharge functionality

Validation for invalid values

Common activity and reporting functionality

RoboDog

Extends RoboPet.

It includes dog-specific functionality such as:

guard()

Dog-specific competition behavior

Battery consumption during activities

Competition tracking

RoboCat

Extends RoboPet.

It includes cat-specific functionality such as:

climb()

Cat-specific competition behavior

Battery consumption during activities

Competition tracking

RoboBird

Extends RoboPet.

It includes bird-specific functionality such as:

fly()

Bird-specific competition behavior

Battery consumption during activities

Competition tracking

PetOwner

Represents the relationship between an owner and multiple robotic pets.

It contains:

Owner name

A collection of RoboPet objects

addPet()

displayPets()

Multiple pets can be registered under one owner, and each pet maintains its own independent state.

Constructors

The project demonstrates different constructor concepts.

No-Argument Constructors

Default values are provided when an object is created without arguments.

Parameterized Constructors

Objects can be initialized with supplied values such as name, model number, battery level, and subclass-specific attributes.

Constructor Overloading

Different constructors are provided with different parameter lists.

Constructor Chaining

this() is used where appropriate to reuse constructor initialization logic within the same class.

Superclass Initialization

super() is used in subclasses to initialize the inherited RoboPet attributes.

Validation

The system prevents invalid object states by validating:

Battery levels below 0

Battery levels above 100

Empty pet names

Invalid model numbers

Valid and invalid object creation is demonstrated in the program.

Battery Management

Battery levels are actively managed throughout the system.

Each robotic pet activity consumes battery power.

The system:

Displays battery levels

Reduces battery after activities

Prevents activities when battery is insufficient

Restores the battery to 100% using recharge()

Competition System

All robotic pet types support competitions through compete().

The implementation includes:

Different battery costs for competitions

Battery validation before participation

Prevention of competitions when battery is too low

Tracking of completed competitions

Recharging and participating again

Polymorphism

The project demonstrates runtime polymorphism by storing different robotic pet objects in a collection using the RoboPet type.

For example, the collection can contain:

RoboDog

RoboCat

RoboBird

An overridden method such as performActivity() is used so that each object performs its own behavior when accessed through a RoboPet reference.

Comprehensive Object Report

The system provides a report containing information such as:

Pet name

Model number

Pet type

Battery level

Completed activities

Competition count

Private attributes are accessed through methods rather than directly.

Advanced Extension

The project also includes additional robotic pet types beyond the original three.

Each additional pet type:

Extends RoboPet

Has unique behavior

Includes multiple constructors

Uses super()

Consumes battery during activities

Is demonstrated in the main program

Main Program

The main program demonstrates the complete system by:

Creating robotic pet objects using different constructors

Demonstrating constructor execution

Testing valid and invalid object creation

Creating a pet owner

Registering multiple pets

Displaying pet information

Demonstrating unique pet activities

Managing battery levels

Recharging pets

Running competitions

Demonstrating low-battery restrictions

Demonstrating runtime polymorphism

Displaying the comprehensive object report

Project Structure

Petronia/
├── README.md
├── RoboPet.java
├── RoboDog.java
├── RoboCat.java
├── RoboBird.java
├── PetOwner.java
└── Main.java

The actual Java files may be combined or organized differently depending on the implementation.

Conclusion

The completed Petronia project demonstrates how object-oriented programming concepts can be combined to build a structured robotic pet management system.

The implementation focuses on encapsulation, inheritance, constructor concepts, validation, object relationships, battery management, competitions, and runtime polymorphism.

Submission

The project includes:

Java source code

Program output demonstrating the implemented features

Screenshots of the output
