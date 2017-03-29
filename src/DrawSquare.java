import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class DrawSquare {
public static void main(String[] args) {
	Robot robocop = new Robot("mini");
	robocop.penDown();
	robocop.setPenColor(Color.BLUE);
	robocop.setSpeed(10);
	robocop.move(500);
	robocop.turn(90);
	robocop.move(200);
	robocop.turn(90);
	robocop.move(500);
	robocop.turn(90);
	robocop.move(200);
	
}
}
