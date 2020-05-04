import exceptions.MsgNotValidException;
import exceptions.OutOfPlateauException;

public class RoverControl {

	public Rover controlRover(int platPosition, Rover rover, String nasaMsg)
			throws MsgNotValidException, OutOfPlateauException {

		for (char letter : nasaMsg.toCharArray()) {
			if (letter == 'L' || letter == 'R') {
				rover = changeCardinalPoint(rover, letter);

			} else if (letter == 'M') {

				rover = moveRover(rover, letter, platPosition);
			} else {
				throw new MsgNotValidException("Nasa message is incorrect");
			}
		}

		if (rover.getX() > platPosition || rover.getY() > platPosition) {
			throw new OutOfPlateauException("rover position can't be out of plateau ");
		}
		return rover;
	}

	public Rover changeCardinalPoint(Rover rover, char direction) throws MsgNotValidException {

		char ccPoint = rover.getCcpoint();

		// Left : N -> W -> S -> E -> N
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

		// Right : N -> E -> S -> W -> N

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

	public Rover moveRover(Rover rover, char lettre, int platPosition) throws OutOfPlateauException {

		int x = rover.getX();
		int y = rover.getY();

		// N : y+1 , S: y-1 , E : x+1 , W : x -1

		if (rover.getCcpoint() == 'N') {

			rover.setY(y + 1);

		} else if (rover.getCcpoint() == 'S') {
			rover.setY(y - 1);
		} else if (rover.getCcpoint() == 'E') {
			rover.setX(x + 1);
		} else if (rover.getCcpoint() == 'W') {
			rover.setX(x - 1);
		}

		if (rover.getX() > platPosition || rover.getY() > platPosition) {
			throw new OutOfPlateauException("rover position can't be out of plateau ");
		}
		return rover;
	}
}
