Scenario: Move the rover forward

Given
Initial Starting Point of the Rover; Rover; Direction; Commands;

When
Move the rover forward

Then
Rover change to the direction; Follow the command which is go forward; Finally move rover forward.


Scenario: Turn the rover left

Given
Initial Starting Point of the Rover; Rover; Direction; Commands;

When
Move the rover left

Then
Rover change to the direction; Follow the command which is go left; Finally move rover left.
