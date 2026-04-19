# 🏦 Simple Bank Project

![Java](https://img.shields.io/badge/Java-14%2B-blue) ![Console App](https://img.shields.io/badge/Type-Console%20App-informational) ![License](https://img.shields.io/badge/License-MIT-green)

A lightweight command-line banking simulator written in Java. Manage a single account with deposits, withdrawals, and balance checks — all from your terminal.

---

## Features

| # | Option | Description |
|---|--------|-------------|
| 1 | **Deposit** | Add funds to your account. Rejects zero or negative amounts. |
| 2 | **Withdraw** | Remove funds. Prevents overdrafts and invalid amounts. |
| 3 | **Check balance** | Display current balance formatted to 2 decimal places. |
| 4 | **Exit** | Safely close the program and release the scanner. |

---

## Getting Started

### Prerequisites

- Java Development Kit (JDK) **14 or higher**
- Any IDE (IntelliJ IDEA recommended) or a terminal with `javac`

### Clone the repo

```bash
git clone https://github.com/ClydeCenteno1/Simple-Bank-Project.git
cd Simple-Bank-Project
```

### Run with IntelliJ IDEA

1. Open the project folder in IntelliJ.
2. Navigate to `src/Bank.java`.
3. Click the green **Run** button or press `Shift + F10`.

### Run from the terminal

```bash
javac src/Bank.java
java -cp src Bank
```

---

## Usage Example

```
*************
1. Deposit
2. Withdraw
3. Check balance
4. Exit
Select (1-4): 1
*************
Input an amount: 500
*************
Select (1-4): 3
*************
Your balance is $500.00
```

---

## Project Structure

```
Simple-Bank-Project/
├── src/
│   └── Bank.java       ← main application logic
├── .gitignore
└── bankOwn.iml         ← IntelliJ project file
```

---

## How It Works

The app runs a `while` loop that continuously presents a menu until the user chooses to exit. Two static methods handle the core logic:

- `deposit()` — reads an amount and returns it only if it's positive.
- `withdraw(double balance)` — reads an amount and returns it only if it's positive and does not exceed the current balance.

---

## License

This project is open source and available under the [MIT License](https://opensource.org/licenses/MIT).
