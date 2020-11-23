# Design Pattern

## Object Oriented Design Principles

* Identify the aspects of your application that vary and seperate them from what stays the same. **Encapsulate what varies.**
* Program to an interface, not an implementation.
* Favor composition over inheritance.
* Strive for loosely coupled designs for objects that interact.
* Classes should be open for extention but closed for modification.
* Depend upon abstraction. Do not depend upon concrete classes.


## Object Oriented Design Pattern
1. **Strategy Pattern:** The Strategy pattern defines a family of algorithm encapsulates each one, and make them interchangable. Strategy lets the algorithm vary independently from clients that use it.
2. **Observer Pattern:** The Observer pattern defines a one-to-many dependency between objects so that when one object changes state all of its dependencies are notified and updated automatically.
3. **Decorator Pattern:** The Decorator pattern attaches additionaly responsibilty to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.
4. **Factory Method Pattern:** The Factory Method Pattern defines an interface for creating an object, but lets subclass decide which class to instantiate. Factory method lets a class defer instantiation to subclasses.
