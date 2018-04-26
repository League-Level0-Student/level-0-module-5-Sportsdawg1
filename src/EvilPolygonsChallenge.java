import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		screenSize.setSize(1000, 1000);
		//1. Create a new Robot
		Robot rob = new Robot();
		//2. Set the speed to 100
		rob.setSpeed(100);
		int colorChoice=JOptionPane.showOptionDialog(null, "hello", "title", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"red","green", "blue", "yellow"}, 0);
		System.out.println(colorChoice);
		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
	    if (colorChoice == 3) {
	    	rob.setPenColor(255,255,0);
	    } else if (colorChoice == 2) {
			rob.setPenColor(0,0,255);
		} else if (colorChoice == 1) {
			rob.setPenColor(0,255,0);
		} else if (colorChoice == 0) {
			rob.setPenColor(255,0,0);
		}
		//4. Ask the use how many polygons they want to be drawn.
		String numPolygonsS = JOptionPane.showInputDialog("how many polygons(this number will be multiplied by 16)");
		int numPolygons = Integer.parseInt(numPolygonsS);
		//5. Use the robot to draw the number of polygons the user requested.
		rob.setX(10);
		rob.setY(10);
		rob.setAngle(90);
		for(int b = 0;b < 4; b++) {
		for(int c = 0; c < numPolygons; c++) {
		for(int i = 0; i < 4; i++) {
			rob.penDown();
			for(int a = 0; a < 4; a++) {
				rob.move(10);
				rob.turn(90);
			}
			rob.penUp();
			rob.move(100);
			rob.turn(90);
		}
		rob.move(205);
		//6. Make it so your shapes do not overlap
		}
			rob.turn(90);
		}
		}
		//7. Challenge: add more colors to the Option Dialog.
	}


