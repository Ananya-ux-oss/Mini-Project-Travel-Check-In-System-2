# Mini-Project-Travel-Check-In-System-2

About This Project  
This is a simple Java OOP project that simulates a travel check-in system at an airport. It demonstrates how different types of passengers, such as Regular, VIP, and Staff, go through various check-in processes.  

Although they share the same basic system, each type behaves differently. This is achieved through inheritance and polymorphism in Java.

Purpose
The main goal of this project is to practice and understand key OOP concepts from Chapter 4, especially:

- Code reusability using inheritance  
- Method overriding  
- Runtime polymorphism  
- Upcasting and dynamic method dispatch  
- How Java decides which method to run at runtime

  Concepts Used

- Inheritance (extends)
- Superclass and Subclass
- Method Overriding
- Runtime Polymorphism
- Upcasting
- this keyword
- super keyword
- Constructor chaining (super())
- Reference vs Object behavior
- IS-A relationship

  How It Works

- Passenger is the main parent class  
- Other classes (Regular, VIP, Staff) extend it  
- Each class has its own version of the checkIn() method  
- In the main class, all objects are stored using a parent reference  
- At runtime, Java decides which method to run based on the actual object  


Project Structure

TravelCheckInSystem/

├── Passenger.java  
├── RegularPassenger.java  
├── VIPPassenger.java  
├── StaffPassenger.java  
└── Main.java 

Challenges Faced

- Understanding the difference between reference type and object type  
- Confusing upcasting and why it is automatic in Java  
- Figuring out how method overriding works at runtime  
- Remembering when Java uses parent methods vs child methods  

What I Learned
Through this project, I understood how Java uses:
- One parent class
- Multiple child classes
- Runtime decision making
