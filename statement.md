<div align="center">

# 🎯 Project Statement: YummyBee

</div>

---

## 1. Problem Statement

In traditional fast-food establishments, manual ordering and billing processes are often **inefficient and prone to human error**. Hand-written orders can lead to miscommunication between customers and kitchen staff, while manual calculations for taxation (GST) and discounts (coupons) slow down the checkout process during peak hours. 

There is a need for a **digital solution** to streamline order entry, ensure billing accuracy, and improve the overall customer experience.

---

## 2. Scope of the Project

The **YummyBee Automated Food Ordering System** is a console-based application developed in Java. It allows users to interactively select food items from a categorized menu, manage their orders dynamically via a shopping cart, and receive an instantly calculated invoice. 

### The scope covers:

- **Digital Menu Management:** Displaying various categories (Burgers, Pizzas, Drinks, etc.) with prices.

- **Order Customization:** Handling specific user inputs (e.g., "Extra Cheese", "Spicy").

- **Billing Engine:** Automating the calculation of sub-totals, totals, 5% GST, and discount coupons.

- **Session Management:** Basic user authentication and continuous ordering loops until checkout.

---

## 3. Target Users

### Primary Users

**Restaurant Customers:** Individuals looking for a quick, transparent, and self-service way to place food orders.

### Secondary Users

**Restaurant Staff/Managers:** Who benefit from reduced workload regarding manual calculation and order taking.

---

## 4. High-Level Features

### 🔐 Secure User Entry
Authentication module requiring valid credentials to access the system.

### 🍽️ Interactive Menu Browsing
Categorized selection for:
- Burgers
- Pizzas
- French Fries
- Cold Drinks
- Coffee
- Combos

### 🛒 Dynamic Shopping Cart (CRUD)

| Operation | Description |
|-----------|-------------|
| **Create** | Add multiple items to a persistent cart |
| **Read** | Review all selected items and their current costs |
| **Update** | Adjust quantities of ordered items before payment |
| **Delete** | Remove unwanted items from the cart |

### 💰 Smart Billing System

- ✅ Automatic application of **5% GST**
- ✅ Logic-based **Coupon Validation** (e.g., Code `112021` for 20% discount)
- ✅ Detailed **invoice generation** showing a breakdown of all costs

---

<div align="center">

*A comprehensive solution for modern fast-food ordering*

</div>
