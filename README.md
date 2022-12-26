# Mouse Coordinates Detector

The Mouse Coordinates Detector is a Java program that detects the current coordinates of the mouse pointer in a Linux system. It demonstrates the concept that everything in Linux is a file by reading the mouse coordinates from a file in the /dev/input/ directory. The program displays the coordinates in a user-friendly graphical interface and allows the user to select a different input file, control the mouse pointer, and simulate mouse clicks. It is a simple application that can be useful for learning about how mouse input works in a Linux system.

## How to use
1. Compile the Java source code using the command javac MouseCoordinatesDetector.java.
2. Run the program using the command java MouseCoordinatesDetector.
3. Move the mouse around to see the current coordinates of the pointer displayed on the console.

## Example Output
Mouse Coordinates: (100, 200)
Mouse Coordinates: (105, 205)
Mouse Coordinates: (110, 210)

## Requirements
1. Java 8 or later
2. Linux system with /dev/input/ directory containing the mouse input file

## Notes

1. The program may need to be run with root privileges to access the mouse input file in the /dev/input/ directory.
2. The coordinates displayed are the coordinates within the current display, not necessarily the absolute coordinates on the desktop.
3. The program only works on Linux systems and will not work on other operating systems.


