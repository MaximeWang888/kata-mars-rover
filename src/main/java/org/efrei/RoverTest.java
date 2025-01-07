package main.java.org.efrei;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RoverTest {

    // WITH DEFAULT DIRECTION (NORTH)
    @Test
    void testMoveForward() {
        // Given
        Rover rover = new Rover();

        // When
        rover.moveForward();

        // Then
        assertEquals(new Location(0, 1), rover.getLocation());
    }

    @Test
    void testMoveBackward() {
        // Given
        Rover rover = new Rover();

        // When
        rover.moveBackward();

        // Then
        assertEquals(new Location(0, -1), rover.getLocation());
    }

    @Test
    void testTurnRight() {
        // Given
        Rover rover = new Rover();

        // When
        rover.turnRight();

        // Then
        assertEquals(new Location(1, 0), rover.getLocation());
    }

    @Test
    void testTurnLeft() {
        // Given
        Rover rover = new Rover();

        // When
        rover.turnLeft();

        // Then
        assertEquals(new Location(-1, 0), rover.getLocation());
    }


    // WITH DEFINED DIRECTIONS (can be NORTH, SOUTH, EAST and WEST)
    @Test
    void testMoveForwardWithDirection() {
        // Given
        Rover rover = new Rover();
        rover.setDirection(Direction.South);

        // When
        rover.moveForward();

        // Then
        assertEquals(new Location(0, -1), rover.getLocation());
    }
}