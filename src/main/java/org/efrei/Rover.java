package main.java.org.efrei;


import java.util.List;
import java.util.Map;

public class Rover {
    private Direction direction;
    private Location location;

    public Rover() {
        this.location = new Location(0, 0);
        this.direction = Direction.North;
    }

    public void moveForward() {
        List<Map<String, Direction>>
        String positionToUpdate = isXorY(this.direction);

        if (positionToUpdate.equals("Y") && this.direction == Direction.North)
            this.location = location.up();
        else if (positionToUpdate.equals("Y") && this.direction == Direction.South)
            this.location = location.down();
        else if (positionToUpdate.equals("X") && this.direction == Direction.North)

        else if (positionToUpdate.equals("X") && this.direction == Direction.North)

        // EAST-FORWARD: 1, 0; NORTH-FORWARD: 0, 1; SOUTH-FORWARD: 0, -1; WEST-FORWARD: -1, 0;
    }

    public void moveBackward() {
        String positionToUpdate = isXorY(this.direction);

        if (positionToUpdate.equals("Y"))
            this.location = location.down();
        else
            this.location = location.up();
    }

    private String isXorY(Direction direction) {
        switch (direction) {
            case North:
                return "Y";
            case South:
                return "Y";
            case East:
                return "X";
            case West:
                return "X";
        }
        return null;
    }

    public Location getLocation() {
        return this.location;
    }

    public void turnRight() {
        String positionToUpdate = isXorY(this.direction);

        if (positionToUpdate.equals("Y"))
            this.location = location.right();
        else
            this.location = location.left();
    }

    public void turnLeft() {
        String positionToUpdate = isXorY(this.direction);

        if (positionToUpdate.equals("Y"))
            this.location = location.left();
        else
            this.location = location.right();
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
