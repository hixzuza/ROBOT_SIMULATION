🤖 Robot Simulation

A Java-based console application that simulates robot movement in a 2D grid environment. Demonstrates object-oriented programming principles including abstraction, inheritance, polymorphism, interfaces, and real-time simulation management.
✨ Features
🤖 Robot Types

    SimpleRobot: Basic robot with forward movement and right turns

    RobotNG: Advanced robot with turbo mode, left turns, U-turns, and diagonal movement

🛡️ Collision Prevention

    Robots cannot occupy the same position

    Obstacle avoidance system

    Position validation before movement

🎨 Interactive Console Interface

    Colorful animated menu with emojis

    Step-by-step simulation control

    Real-time robot status display

⚙️ Simulation Controls

    Add/remove robots and obstacles

    Execute single or multiple steps

    Filter robots by type and status

    Control individual or all robots simultaneously

📁 Project Structure
text

ROBOT_SIMULATION/
├── src/
│   └── project/
│       ├── AbstractRobot.java
│       ├── Direction.java
│       ├── Movable.java
│       ├── Position.java
│       ├── PROJECT DIAGRAM.drawio
│       ├── PROJECT DIAGRAM.drawio.bkp
│       ├── DIAGRAM.png
│       ├── RobotNG.java
│       ├── SimpleRobot.java
│       └── Simulation.java
├── bin/                          # Compiled classes (after compilation)
├── .git/                         # Git repository
├── .idea/                        # IDE settings
├── .classpath                    # Eclipse configuration
├── .project                      # Eclipse project file
├── README.md                     # This file
└── settings/                     # IDE settings

🚀 Quick Start
Prerequisites

    Java JDK 8 or higher

    Terminal or command prompt

Installation & Running
bash

# Navigate to your project root
cd ROBOT_SIMULATION

# Method 1: Compile to bin folder (Recommended)
javac -d bin src/project/*.java
java -cp bin project.Simulation

# Method 2: Direct compilation
cd src
javac project/*.java
java project.Simulation

🎮 Usage

Upon launching, you'll see an animated welcome screen followed by the main menu:
text

🌟 WELCOME TO ROBOT SIMULATION 🌟

╔═══════════════════════════════════════╗
║       SIMULATION MENU                 ║
╚═══════════════════════════════════════╝

1   ⏯️   Execute one step
2   ⏭️   Execute many steps
3   🤖   Display only SimpleRobot
4   🚀   Display only RobotNG
5   🚧   Display all obstacles
6   ⚡   Display robots in turbo mode
7   👥   Display all robots
8   ➕   Add SimpleRobot
9   ➕   Add RobotNG
10  🔨   Add obstacle
11  ↪️   Turn right for all robots
12  ↩️   Turn left (RobotNG only)
13  🔄   U-turn (RobotNG only)
14  ↗️   Diagonal movement (RobotNG only)
0   ❌   Exit

🎯 Example: Adding a Robot
text

Choose option: 8
Enter name (char): A
X = 0
Y = 0
Direction (Nord, Sud, Est, Ouest): Nord
Simple robot has been added to the list

🔧 IDE Setup
Eclipse/IntelliJ Users:

Your project already has IDE configuration files:

    .classpath and .project for Eclipse

    .idea/ folder for IntelliJ

Simply open ROBOT_SIMULATION as an existing project in your IDE.
📖 Key Classes
AbstractRobot

    Base class implementing Movable interface

    Handles collision detection via checkPosition()

    Manages robot position and direction

RobotNG (Extends AbstractRobot)

    Turbo Mode: Triples movement distance when active

    Enhanced Movement: Left turns, U-turns, diagonal movement

Simulation

    Main driver with interactive console menu

    Manages robot and obstacle lists

    Provides step-by-step execution

🐛 Troubleshooting
Common Compilation Issues:
bash

# If you get "package project does not exist":
cd ROBOT_SIMULATION
javac -d bin src/project/*.java

# If you get "Error: Could not find or load main class":
java -cp bin project.Simulation

# Clean and recompile:
rm -rf bin/*.class
javac -d bin src/project/*.java

IDE-Specific Issues:

    Eclipse: Right-click project → Build Path → Configure Build Path → Add src as source folder

    IntelliJ: Mark src as Sources Root (right-click src → Mark Directory as → Sources Root)

📋 Files Overview
File	Purpose
PROJECT DIAGRAM.drawio	Visual design diagram
DIAGRAM.png	Diagram image
AbstractRobot.java	Base robot class with collision logic
Simulation.java	Main program with interactive menu
RobotNG.java	Advanced robot with turbo mode
SimpleRobot.java	Basic robot implementation