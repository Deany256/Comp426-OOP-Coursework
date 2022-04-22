import uk.ac.leedsbeckett.oop.LBUGraphics;
import java.awt.FlowLayout;
import javax.swing.JFrame;

/* NOTE
 * -- is necessary parts of todo
 * -/ is potential parts to implement into function
 * 
 * Check if item is in array list
 * https://stackoverflow.com/questions/1128723/how-do-i-determine-whether-an-array-contains-a-particular-value-in-java
 * 
 * convert string into list
 * https://www.geeksforgeeks.org/java-program-to-convert-string-to-string-array/
 * https://stackoverflow.com/questions/3413586/string-to-string-array-conversion-in-java
 * 
 * TODO need to convert forward(90) into [forward, 90]
 * --replace brackets with spaces
 * --convert number(currently a str) into integer
 * 
 * TODO add all commands to process command object
 * 
 * TODO use switch statements in isvalidcommand object to check if entered command is in arraylist of acceptable commands
 * -- forward(90) is equivilant to forward(90) and forward 90
 * -/ might need an if statement to remove brackets
 * 
 * TODO add colour functionality
 * -- list of predifined colors
 * -/ accepts rgb values for colours
 * 		L> color(int R int G intB) 
 * 			L> would need to split string into list and be able to handle lists of different lengths
 * 
 * TODO add objects of predefined shapes: circle, square, triangle, pentagon
*/

public class MyTurtledGraphics extends LBUGraphics{
	public MyTurtledGraphics() {
		JFrame MainFrame = new JFrame();
	    MainFrame.setLayout(new FlowLayout()); 
	    MainFrame.add(this);
	    
	    MainFrame.pack();      
	    MainFrame.setVisible(true);
	    //about();
	    
	}
	private boolean isCommandValid(String command) {
		//TODO
		// break commands down to lists
		// have array list of valid variations of commands
		
//		System.out.println("You typed " + command);
		String newcommand = command.replace("(", " ").replace(")", "");
//		System.out.println("You Typed " + newcommand);
		String[] commands = newcommand.split(" ");
		try {
			int value = Integer.parseInt(commands[1]);
			return true;
		}
		catch (IndexOutOfBoundsException excep) {
			return true;
		}
		//return true;
	}
		                                                           
	
	public void processCommand(String command) {
		//TODO a series of else if statements
		//TODO split commadn into list may need to replace ()
		System.out.println("You typed " + command);
		String newcommand = command.replace("(", " ").replace(")", "");
		System.out.println("You Typed " + newcommand);
		String[] commands = newcommand.split(" ");
		int commandSize = commands.length;
//		if (commandSize > 1) {
//			int value = Integer.parseInt(commands[1]);
//			if(commands[0].equals("forward")== true) {
//				forward(value);
//			} else if (commands[0].equals("backward")== true) {
//				forward(value * -1);
//			} else if (commands[0].contentEquals("turnLeft") == true) {
//				turnLeft(value);
//			} else if (commands[0].contentEquals("turnRight") == true) {
//				turnRight(value);
//			}
//		} else {
//			if (commands[0].contentEquals("penDown") == true) {
//				penDown();
//			} else if (commands[0].contentEquals("penUp") == true) {
//				penUp();
//			} else if (commands[0].contentEquals("reset") == true) {
//				reset();
//			} else if (commands[0].contentEquals("clear") == true) {
//				clear();
//			} else if (commands[0].contentEquals("turnLeft") == true) {
//				turnLeft(90);
//			} else if (commands[0].contentEquals("turnRight") == true) {
//				turnRight(90);
//			}
//			// preset shapes
//			else if (commands[0].contentEquals("about") == true) {
//				about();
//			} else if (commands[0].contentEquals("circle") == true) {
//				//circle(value);
//			}
//		}
		
//		if (commands[0].contentEquals("penDown") == true) {
//			penDown();
//		} else if (commands[0].contentEquals("penUp") == true) {
//			penUp();
//		} else if (commands[0].contentEquals("reset") == true) {
//			reset();
//		} else if (commands[0].contentEquals("clear") == true) {
//			clear();
//		}
//		// preset shapes
//		else if (commands[0].contentEquals("about") == true) {
//			about();
//		} else if (commands[0].contentEquals("circle") == true) {
//			//circle(value);
//		}

		
		
			switch (commands[0]) {
			case "about":
				about();
				break;
			case "forward":
				forward(commands[1]);
				break;
			case "turnLeft":
				turnLeft(commands[1]);
				break;
			case "turnRight":
				turnRight(commands[1]);
				break;
			case "penDown":
				penDown();
				break;
			case "penUp":
				penUp();
				break;
			case "reset":
				reset();
				break;
			case "clear":
				clear();
				break;
//			case "":
//				FUNCTION;
			
			}
		
	}
	


	
	
}


