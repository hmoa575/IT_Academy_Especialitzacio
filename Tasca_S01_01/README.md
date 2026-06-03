# Tasca S01.01 – Smartphone with Multiple Functionalities

**Description**:
This project demonstrates the use of class inheritance and interface implementation in Java.
It simulates a smartphone that inherits from a basic phone and also implements camera and clock
functionalities.

## Exercise Statement

Create a `Phone` class with brand, model, and a method to make calls.
Define two interfaces: `Camera` (with `takePhoto()`) and `Clock` (with `activateAlarm()`).
Develop a `Smartphone` class that extends `Phone` and implements both interfaces.
In the `main()` method, create a `Smartphone` object, test making a call, taking a photo, and activating
an alarm.

## Features

- **Inheritance**: `Smartphone` reuses attributes and the `call()` method from `Phone`.
- **Interfaces**: `Smartphone` implements `takePhoto()` and `activateAlarm()`.
- **Polymorphism**: Different devices that implement `Camera` or `Clock` can be treated uniformly.
- **Console output**: Each action prints a descriptive message.

## Technologies

- **Language**: Java (version 25 or higher)
- **Tools**: JDK 25, IDE (IntelliJ, VS Code)
- **Dependencies**: None (pure Java project)

# SportsNews – Sports News Editorial System

**Description**:
A Java console application to manage a sports news editorial office. It allows registering journalists, adding news categorized by sport (football, basketball, tennis, F1, MotoGP), automatically calculating the score and price of each news item according to business rules, and displaying all information through an interactive menu.

## Exercise Statement

Design a system with the following requirements:

- **Journalists**: each has a name, DNI (immutable), and a static salary common to all (initially €1500). Each journalist can write multiple news articles.
- **News**: each news item has a title, text (empty when created), a score, and a price. There are 5 types: Football, Basketball, Tennis, F1, and MotoGP. Each type contains specific attributes (competition, club, player, team, etc.).
- **Price & Score calculation**: specific methods for each news type following the given tables (e.g., football base price €300 + bonuses for competition, clubs, or prominent players).
- **Main menu** with options to:
  1. Add journalist
  2. Remove journalist
  3. Add news to a journalist
  4. Remove news (by journalist and news title)
  5. Show all news of a journalist
  6. Calculate score of a news item
  7. Calculate price of a news item

## Features

- Full journalist management (add, delete, search by DNI).
- Create news with sport‑specific data.
- Automatic score and price calculation when creating a news item (re‑calculation available on demand).
- Display all news of a journalist with title, score, and price.
- Remove news by title (case‑insensitive).
- Common salary for all journalists (`static` attribute) and immutable DNI (`final`).
- Application of inheritance, polymorphism, encapsulation, and collections (`ArrayList`).

## Technologies

- **Java 17** (or higher)
- **Tools**: IntelliJ IDEA / Eclipse / VS Code
- **Dependency management**: none (standard Java library only)
- **Testing**: JUnit 5 (optional, not implemented in this version)

## Installation and Execution

1. **Clone the repository**
   ```bash
   git clone https://github.com/your-username/Tasca_S01_01.git
   cd Tasca_S01_01

   ```

## Diagram

    ┌─────────────┐
        │  <`<interface>`>   │
        │     Camera        │
        │ + takePhoto()     │
        └─────────┬─────────┘
                  │
        ┌─────────┴─────────┐
        │                   │
┌───────▼───────┐   ┌───────▼───────┐
│     Phone     │   │    Clock      │
│ - brand       │   │ + activateAlarm() │
│ - model       │   └───────────────┘
│ + call()      │
└───────┬───────┘
        │
┌───────▼───────────┐
│    Smartphone     │
│ (extends Phone +  │
│  implements       │
│  Camera, Clock)   │
└───────────────────
