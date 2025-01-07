Scenario 1: Move the rover forward

Given
Initial Starting Point of the Rover; Rover; Direction; Commands;

When
Move the rover forward

Then
Rover change to the direction; Follow the command which is go forward; Finally move rover forward.


Scenario 2: Turn the rover left

Given
Initial Starting Point of the Rover; Rover; Direction; Commands;

When
Move the rover left

Then
Rover change to the direction; Follow the command which is go left; Finally move rover left.


Automatic Test Scenario 1:

Given
Initial Starting Point of the Rover; Rover; Direction; Commands;

When
Move the rover forward

Then
Verify initial location of rover changed to the corresponding location after moving forward


Automatic Test Scenario 2:

Given
Initial Starting Point of the Rover; Rover; Direction; Commands;

When
Move the rover left

Then
Verify initial location of rover changed to the corresponding location after moving left
