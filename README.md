<div align="center">

# 🍔 YummyBee - Automated Food Ordering System

### *Digitizing Fast-Food Ordering with Java*

[![Java](https://img.shields.io/badge/Java-8%2B-orange?style=flat&logo=java)](https://www.java.com)
[![BlueJ](https://img.shields.io/badge/IDE-BlueJ-blue?style=flat)](https://www.bluej.org)
[![License](https://img.shields.io/badge/License-Educational-green?style=flat)](LICENSE)

**PROJECT TITLE:** Food Ordering Program  
**PURPOSE:** To take orders and display the bill as per the order  
**AUTHOR:** Aniket Pandey (24BSA10012)

---

</div>

## 📋 Project Overview

YummyBee is a **console-based Java application** designed to digitize the food ordering process in fast-food restaurants. It replaces error-prone manual billing with an automated system that handles menu management, dynamic cart operations, tax calculation (GST), and discount coupon validation.

This project demonstrates **Object-Oriented Programming (OOP)** concepts including:
- **Inheritance**
- **Encapsulation**
- **Polymorphism**
- Dynamic data structures for real-time order management

---

## ✨ Key Features

### Three Major Functional Modules:

#### 1. 👤 User Management & Authentication
- Secure login system (Email/Password validation)
- Captures customer details (Name, Phone) for the invoice

#### 2. 🛒 Dynamic Cart & Order Processing (CRUD)
| Operation | Description |
|-----------|-------------|
| **Create** | Add items from multiple categories (Burgers, Pizzas, Combos) |
| **Read** | View the current cart status with itemized pricing |
| **Update** | Modify the quantity of items already in the cart |
| **Delete** | Remove specific items from the cart before checkout |

> **Tech Spec:** Implemented using `ArrayList` for dynamic memory management

#### 3. 🧾 Advanced Billing & Reporting
- ✅ **Automated Calculation:** Real-time summation of item prices
- ✅ **Taxation:** Automatic application of 5% GST
- ✅ **Coupon System:** Smart logic to validate discount codes (e.g., `112021` for 20% off)
- ✅ **Invoice Generation:** Specific itemized bill printed to the console

---

## 🛠️ Technologies Used

```
Programming Language: Java (JDK 8+)
Development Environment: BlueJ / Eclipse / IntelliJ IDEA
Core Concepts: Collections Framework (ArrayList), Scanner Input, 
               Switch-Case Logic, OOP Principles
```

---

## 📂 Project Structure

```
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
```

---

## 🚀 Installation & Setup

### Prerequisites
- ☕ Java Development Kit (JDK) installed
- 🔵 BlueJ IDE (Recommended) or any standard Java IDE

### Option 1: Running in BlueJ (Preferred)

1. Download the repository code
2. Open BlueJ and select **Project > Open Project**
3. Navigate to the folder containing the `.java` files
4. Click **Compile** to build all classes
5. Right-click on `MainClass` and select **void main(String[] args)**
6. The console window will open—follow the on-screen prompts

### Option 2: Running in Terminal

```bash
# Navigate to the source folder
cd src

# Compile the code
javac MainClass.java

# Run the application
java MainClass
```

---

## 📖 User Instructions

1. **Enter your personal details** when prompted
2. **Enter the number** corresponding to the food you want
3. **Follow the on-screen instructions** to complete your order

---

## 🧪 Testing Guide

### Test Cases for Functional Requirements:

| Test Case | Input Action | Expected Outcome |
|-----------|--------------|------------------|
| **Login Validation** | Email: `A`, Pass: `B` | System denies access and exits |
| **Successful Login** | Email: `A`, Pass: `A` | Access granted to the main menu |
| **Add to Cart** | Select `1` (Burger) → Veg | Item added to internal cart list |
| **View Cart** | Select option `7` | Displays all items added so far |
| **Update Order** | Select `7` → `2` (Update) | Change quantity; Total updates automatically |
| **Remove Item** | Select `7` → `1` (Remove) | Item removed; Final bill decreases |
| **Coupon Logic** | Enter Code `112021` | 20% discount applied to final total |

---

## 📸 Screenshots

> *Place your screenshots in a folder named `screenshots` and link them here*

- Main Menu Interface
- Final Bill Generation

---

## 📝 Version History

- **VERSION/DATE:** *(To be updated)*
- **HOW TO START:** Right click the MainClass, first compile it and then click on void main

---

<div align="center">

### Built for VITyarthi Flipped Course Evaluation

---

*Made with ❤️ by Aniket Pandey*

</div>
