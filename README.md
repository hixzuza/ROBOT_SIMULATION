📌 Robot Simulation

A Java-based robot movement simulator demonstrating object-oriented programming (OOP) concepts such as abstraction, inheritance, polymorphism, interfaces, and real-time simulation logic.
The program lets you create robots, move them in a 2D grid, manage obstacles, and interact through a colorful animated console menu.

🚀 Features
🤖 Robot Types

SimpleRobot

Moves forward (avance)

Turns right (droite)

RobotNG (Next-Generation)

All SimpleRobot features +

Turn left (gauche)

U-turn (demiTour)

Diagonal movement (avanceDiagonale)

Turbo mode (triples movement distance)

🧱 Obstacle Logic

Robots cannot move into:

Obstacles

Other robots

Collision prevention is implemented in AbstractRobot via checkPosition.

🎨 Animated Console Menu

User-friendly interface with:

Dynamic colors

Step-by-step simulation

Robot filtering and status info

🛠️ Simulation Management

Add/remove robots

Add obstacles

Move specific robots or all robots at once

Execute one-step or multi-step simulations

Show only NG robots, turbo robots, simple robots, etc.

📂 Project Structure

All classes are inside the package project/:

project/
 ├── Movable.java
 ├── Direction.java
 ├── Position.java
 ├── AbstractRobot.java
 ├── SimpleRobot.java
 ├── RobotNG.java
 └── Simulation.java

Class Responsibilities
File	Description
Movable.java	Interface defining movement actions.
Direction.java	Enum for the 4 directions (Nord, Sud, Est, Ouest).
Position.java	Holds X/Y coordinates.
AbstractRobot.java	Base class with direction, position, collision checks.
SimpleRobot.java	Basic robot implementation.
RobotNG.java	Advanced robot with turbo and extra movements.
Simulation.java	Main class containing menu, step logic, robot/obstacle lists.
🧰 Requirements

Java JDK 8+

Terminal/Command Prompt or Eclipse (recommended)

📥 Installation
1. Clone the repository
git clone https://github.com/hixzuza/ROBOT_SIMULATION.git
cd ROBOT_SIMULATION

2. Compile the project

If your repo structure is:

ROBOT_SIMULATION/
   project/
      *.java


run:

javac project/*.java -d bin

3. Run the Simulation
java -cp bin project.Simulation

▶️ Usage

When you run the simulation, you’ll see an animated menu like:

🌟 WELCOME TO ROBOT SIMULATION 🌟

╔══════════════════════════════════════╗
║            SIMULATION MENU           ║
╚══════════════════════════════════════╝


You can choose options like:

1 → Execute one step

2 → Execute multiple steps

3–7 → Display robots by filters

8–9 → Add robots

10 → Add obstacles

11–14 → Move robots (right, left, U-turn, diagonal)

0 → Exit the simulation

Example of adding a robot:
enter nom (char):
A
X = 
0
Y = 
0
Direction (Nord, Sud, Est, Ouest):
Nord
simple robot has been added to the list