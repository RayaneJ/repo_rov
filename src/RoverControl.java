

public class RoverControl {

	public Rover controlRover(int platPosition, Rover rover, String nasaMsg) {

		for (char letter : nasaMsg.toCharArray()) {
			if (letter == 'L' || letter == 'R') {
				rover = changeCardinalPoint(rover, letter);

			} else if (letter == 'M') {

				rover = moveRover(rover, letter);
			}
		}

		return rover;
	}

	public Rover changeCardinalPoint(Rover rover, char direction) {

		char ccPoint = rover.getCcpoint();
		if (direction == 'L') {

			if (ccPoint == 'N') {
				rover.setCcpoint('W');
			} else if (ccPoint == 'W') {
				rover.setCcpoint('S');
			} else if (ccPoint == 'S') {
				rover.setCcpoint('E');
			} else if (ccPoint == 'E') {

				rover.setCcpoint('N');
			}

		}

		else if (direction == 'R') {

			if (ccPoint == 'N') {
				rover.setCcpoint('E');
			} else if (ccPoint == 'E') {
				rover.setCcpoint('S');
			} else if (ccPoint == 'S') {
				rover.setCcpoint('W');

			} else if (ccPoint == 'W') {

				rover.setCcpoint('N');
			}

		}

		return rover;
	}

	public Rover moveRover(Rover rover, char lettre) {

		int x = rover.getX();
		int y = rover.getY();

		if (rover.getCcpoint() == 'N') {

			rover.setY(y + 1);

		} else if (rover.getCcpoint() == 'S') {
			rover.setY(y - 1);
		} else if (rover.getCcpoint() == 'E') {
			rover.setX(x + 1);
		} else if (rover.getCcpoint() == 'W') {
			rover.setX(x - 1);
		}
		return rover;
	}
}
