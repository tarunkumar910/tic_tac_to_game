<div align="center">
    <h1 style="font-weight: bold; color: blue;">Tic-Tac-TO_GAME </h1>
</div>



<p align="center">
  <a href="#introduction">Introduction</a> •
  <a href="#features">Features</a> •
  <a href="#installation">Install</a> •
  <a href="#usage">Usage</a> •
  <a href="#work">Work</a> •
  <a href="#future">Future</a> •
  <a href="#conclusion">Conclusion</a>
    
</p>


## Introduction

The Tic-Tac-Toe game is a simple yet engaging implementation of the classic two-player strategy game. This project provides an interactive console-based version of the game with options for single-player (against a computer) or two-player modes. The game includes enhanced features such as colored player symbols (X and O), a replay option, and a user-friendly grid system for move selection.

The goal of this project is to demonstrate core programming concepts such as:

- Control structures (loops, conditionals)
- Array manipulation
- User input handling
- Basic AI for single-player mode



---

## Features

<h1 align="left">
  <img src="image/image.png" alt="Password_Strength_Checker" width="700px"></a>
  <br>
</h1>


- **Single Player Mode**: Play against a simple computer AI.
- **Two Player Mode**: Play against another human player.
- **Color-Coded Symbols**: Distinguish player moves (X in red, O in blue) for better visibility.
- **Replay Option**: Play multiple rounds without restarting the program.
- **Input Validation**: Ensures valid moves and prevents overwriting cells.
- **Clear and Organized Game Board**: The board updates dynamically after each move, providing a clear view of the current game state.


---

### Usage 

- Launch the Game: Run the program in your terminal or command prompt.

- Choose a Game Mode:

  - 1: Single Player (vs. Computer)
  - 2: Two Players
- Make Moves:

  - Players take turns entering a number (1-9) corresponding to the grid position.
  - The computer makes random valid moves in Single Player mode.
- Game End:

  - The game announces a winner or a draw.
  - Players can choose to play again or exit.
- Replay:

  - After each game, you'll be asked if you want to play again.
  - Choosing "yes" resets the board and starts a new game
 
---
## Installation

### Prerequisites
To run this project, you need:

- Java Development Kit (JDK): Version 8 or higher.
- A terminal or command-line interface that supports ANSI escape codes for colored output.

  
### Step of Installing from Repositry 
```bash
git clone https://github.com/your-repo/tic-tac-toe.git
javac TicTacToe.java
java TicTacToe
```


---

### Work

- **Game Board**: A 3x3 grid is represented using a 2D array, with cells initialized to numbers 1-9.

- **Player Input**: Players enter a number corresponding to the grid position to mark their move.

- **Computer AI**: In Single Player mode, the computer chooses a random valid position.

- **Win Checking**: After every move, the program checks for winning conditions (row, column, diagonal) or a draw.


---

### Future 

- Implement a more strategic AI using a minimax algorithm.
- Add a graphical user interface (GUI) for better user experience.
- Include score tracking across multiple games.

---

### Conclusion

This project provides a simple and fun way to learn Java programming by implementing a popular game. It covers key concepts such as user interaction, arrays, and control structures while offering room for future enhancements.

<p align="center">
  <a href="#introduction">Introduction</a> •
  <a href="#features">Features</a> •
  <a href="#installation">Install</a> •
  <a href="#usage">Usage</a>
</p>


## Introduction

A comprehensive and secure password strength checker that evaluates the strength of a password based on multiple factors such as length, complexity, entropy, common usage, and data breaches. This tool helps users create stronger passwords by providing detailed feedback and actionable suggestions.

---

## Features

<h1 align="left">
  <img src="image/image.png" alt="Password_Strength_Checker" width="700px"></a>
  <br>
</h1>


- **Password Length Check**: Ensures the password is of adequate length (at least 12 characters).
- **Character Variety**: Checks for a mix of uppercase letters, lowercase letters, digits, and special characters.
- **Entropy Calculation**: Calculates password entropy to measure its randomness and complexity.
- **Common Password Check**: Alerts users if their password is among commonly used passwords.
- **Breach Check**: Checks if the password has been exposed in data breaches via the HaveIBeenPwned API.
- **Enhanced Feedback**: Provides detailed suggestions for improving weak passwords.
- **Auto Save Weak Passwords**: Tracks and saves weak or moderate passwords to a common passwords file for monitoring.

---

### Usage 

```bash
cd password-strength-checker
python password_strength_checker.py
```
This will Display  Enter a password to check its strength (or type 'exit' to quit): 

    ==================================================
         PASSWORD STRENGTH CHECKER
    ==================================================
    Password Strength: Very Strong
    Password Entropy: 78.66 bits

    Category: This password is highly secure. It meets all criteria and has high entropy.

    General Suggestions to improve your password:

      - Good news! This password has not been found in any known breaches.

    Enter a password to check its strength (or type 'exit' to quit):

 
---
## Installation

### Prerequisites
To use this password checker, you will need:
- Python 3.x (Python 3.6 or above recommended)
- Access to the internet for breach checking (uses HaveIBeenPwned API)

### Step of Installing from Repositry 
```bash
git clone https://github.com/tarunkumar910/password_strength_checker.git
cd password-strength-checker
pip install -r requirements.txt
python password_strength_checker.py
```
