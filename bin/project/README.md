# Robot Simulation

## Description
A Java-based console application that simulates the movement of robots in a 2D grid environment. The project demonstrates object-oriented programming principles through the implementation of different robot types (SimpleRobot and RobotNG), obstacles, and a simulation manager with an interactive animated menu.

## Features
*   **Two Robot Types:**
    *   `SimpleRobot`: Basic robot that can move forward (avance) and turn right (droite).
    *   `RobotNG`: Advanced robot with additional capabilities, including turning left (gauche), U-turn (demiTour), diagonal movement (avanceDiagonale), and a turbo mode that triples its movement distance.
*   **Collision & Obstacle Avoidance:** Robots cannot move into positions occupied by other robots or predefined obstacles.
*   **Interactive Console Menu:** A colorful, animated text-based menu provides a user-friendly interface to control the simulation.
*   **Simulation Management:**
    *   Add/remove robots and obstacles.
    *   Execute simulation steps (single or multiple).
    *   Filter and display robots by type or status (e.g., turbo mode).
    *   Issue movement commands to individual robots or the entire fleet.
*   **Object-Oriented Design:** Utilizes interfaces (Movable), abstract classes (AbstractRobot), inheritance, and polymorphism.

## Installation
1.  **Prerequisites:** Ensure you have Java Development Kit (JDK) version 8 or higher installed.
2.  **Clone/Download:** Place all the provided `.java` files into a directory named `project`.
3.  **Compilation:** Open a terminal/command prompt in the parent directory of `project` and compile all Java files:
    ```bash
    javac project/*.java
    ```
4.  **Run:** Execute the program by running the `Simulation` class:
    ```bash
    java project.Simulation
    ```

## Usage
1.  Run the program as shown in the Installation section.
2.  You will be greeted with an animated welcome message and a main menu.
3.  Use the numbered options to interact with the simulation:
    *   **1, 2:** Execute simulation steps.
    *   **3, 4, 6, 7:** Display robots (filtered or all).
    *   **5:** Display all obstacles.
    *   **8, 9:** Add new robots to the simulation. You will be prompted for their name (a single character), starting coordinates (x, y), initial direction (Nord, Sud, Est, Ouest), and (for RobotNG) turbo mode status.
    *   **10:** Add obstacles by specifying (x, y) coordinates.
    *   **11-14:** Issue movement commands (turn right, left, U-turn, diagonal) to robots.
    *   **0:** Exit the program.

**Example Interaction:**
🌟 WELCOME TO ROBOT SIMULATION 🌟

╔═══════════════════════════════════════╗
║ SIMULATION MENU ║
╚═══════════════════════════════════════╝

1 ⏯️ exucute one step
2 ⏭️ exucute many steps
...
enter what do u want: 8
enter nom (char) :
A
X =
0
Y =
0
direction (Nord,Sud ,Est, Ouest) : !!!!PLEASE ENTER THE FIRST LETTER IN UPPERCASE FORM !!!!
Nord
simple robot have been added to the list


## Project Structure
The project consists of the following Java classes and interfaces, all in the `project` package:

*   **`Movable.java`**: Interface defining basic movement methods (avance, droite).
*   **`Direction.java`**: Enumeration representing the four cardinal directions.
*   **`Position.java`**: A simple class representing an (x, y) coordinate.
*   **`AbstractRobot.java`**: Abstract base class implementing Movable. Contains common robot logic like collision detection (checkPosition), direction tracking, and position management.
*   **`SimpleRobot.java`**: Extends AbstractRobot. Implements basic forward movement and right turns.
*   **`RobotNG.java`**: Extends AbstractRobot. Adds advanced features like turbo mode, left turns, U-turns, diagonal movement, and overloaded avance(int steps) method.
*   **`Simulation.java`**: The main driver class. Manages lists of robots and obstacles, provides the step-by-step simulation logic, and contains the interactive console menu with animated text in the main method.

## Dependencies
*   **Java Standard Edition (SE) Development Kit:** Version 8 or higher is required. The project uses core Java libraries (java.util.ArrayList, java.util.Scanner) and does not require any external frameworks or libraries.

## Configuration
No external configuration files are needed. All simulation parameters (robot positions, obstacles, turbo mode) are set dynamically through the interactive console menu when the program runs.

## Contributing
Contributions to improve the simulation are welcome. To contribute:
1.  Fork the repository (if applicable).
2.  Create a feature branch (git checkout -b feature/AmazingFeature).
3.  Ensure your code follows the existing style and includes appropriate JavaDoc comments.
4.  Test your changes thoroughly.
5.  Commit your changes (git commit -m 'Add some AmazingFeature').
6.  Push to the branch (git push origin feature/AmazingFeature).
7.  Open a Pull Request.