------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all they need to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE:Food Ordering Program
PURPOSE OF PROJECT:To take orders and display the bill as per the order
VERSION or DATE:
HOW TO START THIS PROJECT: Right click the mainclass,
first complie it and then click on void main

AUTHORS:Aniket Pandey(24BSA10012)

USER INSTRUCTIONS: 1.Enter your personal details
                   2.Enter the number as the per the food you want.
                   3.Do as the code say to do

🍔 YummyBee - Automated Food Ordering System

📋 Project Overview

YummyBee is a console-based Java application designed to digitize the food ordering process in fast-food restaurants. It replaces error-prone manual billing with an automated system that handles menu management, dynamic cart operations, tax calculation (GST), and discount coupon validation.

This project was built to demonstrate Object-Oriented Programming (OOP) concepts including Inheritance, Encapsulation, and Polymorphism, alongside dynamic data structures for real-time order management.

✨ Key Features

This project implements Three Major Functional Modules as required:

1. User Management & Authentication 👤

Secure login system (Email/Password validation).

Captures customer details (Name, Phone) for the invoice.

2. Dynamic Cart & Order Processing (CRUD) 🛒

Create: Add items from multiple categories (Burgers, Pizzas, Combos).

Read: View the current cart status with itemized pricing.

Update: Modify the quantity of items already in the cart.

Delete: Remove specific items from the cart before checkout.

Tech Spec: Implemented using ArrayList for dynamic memory management.

3. Advanced Billing & Reporting 🧾

Automated Calculation: Real-time summation of item prices.

Taxation: Automatic application of 5% GST.

Coupon System: Smart logic to validate discount codes (e.g., 112021 for 20% off).

Invoice Generation: specific itemized bill printed to the console.

🛠️ Technologies Used

Programming Language: Java (JDK 8+)

Development Environment: BlueJ / Eclipse / IntelliJ IDEA

Core Concepts: Collections Framework (ArrayList), Scanner Input, Switch-Case Logic, OOP Principles.

📂 Project Structure

YummyBee/
├── src/
│   ├── MainClass.java        # Entry point & Billing Logic
│   ├── PersonalDetails.java  # User Auth Module
│   ├── CartItem.java         # Data Model for Cart Objects
│   ├── Category.java         # Menu Display
│   ├── Burger.java           # Food Item Class
│   ├── Pizaa.java            # Food Item Class
│   ├── Frenchfires.java      # Food Item Class
│   ├── Colddrink.java        # Food Item Class
│   ├── Coffee.java           # Food Item Class
│   └── combos.java           # Food Item Class
└── README.md                 # Documentation


🚀 Steps to Install & Run

Prerequisites

Java Development Kit (JDK) installed.

BlueJ IDE (Recommended) or any standard Java IDE.

Running in BlueJ (Preferred)

Download the repository code.

Open BlueJ and select Project > Open Project.

Navigate to the folder containing the .java files.

Click Compile to build all classes.

Right-click on MainClass and select void main(String[] args).

The console window will open—follow the on-screen prompts.

Running in Terminal

Navigate to the source folder:

cd src


Compile the code:

javac MainClass.java


Run the application:

java MainClass


🧪 Instructions for Testing

To verify the Functional Requirements, try the following test cases:

Test Case

Input Action

Expected Outcome

Login Validation

Enter Email: A, Pass: B

System denies access and exits.

Successful Login

Enter Email: A, Pass: A

Access granted to the main menu.

Add to Cart

Select 1 (Burger) -> Veg

Item added to internal cart list.

View Cart

Select option 7

Displays all items added so far.

Update Order

Select 7 -> 2 (Update)

Change quantity of an item; Total updates automatically.

Remove Item

Select 7 -> 1 (Remove)

Item removed from list; Final bill decreases.

Coupon Logic

Enter Code 112021

20% discount applied to final total.

📸 Screenshots

(Place your screenshots in a folder named screenshots and link them here. Example below:)

Main Menu Interface

Final Bill Generation

Built for VITyarthi Flipped Course Evaluation.