package studio4;

import java.awt.Color;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;
import support.cse131.DialogBoxes;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class NorwayMotherOfAllFlags {
	private static void mother() {
		StdDraw.clear();
		StdDraw.setPenColor(255, 0, 0);
		StdDraw.filledRectangle(3, 3, 3, 3);
		StdDraw.filledRectangle(3, 13, 3, 3);
		StdDraw.filledRectangle(16, 3, 6, 3);
		StdDraw.filledRectangle(16, 13, 6, 3);
		StdDraw.setPenColor(0, 0, 127);
		StdDraw.filledRectangle(11, 8, 11, 1);
		StdDraw.filledRectangle(8, 8, 1, 8);
	}

	public static void norway() {
		StdDraw.setXscale(0, 22);
		StdDraw.setYscale(0, 16);
		mother();
	}

	public static void france() {
		
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledRectangle(22.0/3, 8, 22.0/3, 8.0);
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledRectangle(44.0/3, 8, 22.0/3, 8.0);
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledRectangle(66.0/3, 8, 22.0/3, 8.0);
	}

	public static void indonesia() {
		
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledRectangle(11.0, 4.0, 11.0, 4.0);
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledRectangle(11.0, 12.0, 11.0, 4.0);
	}

	public static void netherlands() {
		
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledRectangle(11.0, 16.0/3, 11.0, 16.0/3);
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledRectangle(11.0, 32.0/3, 11.0, 16.0/3);
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledRectangle(11.0, 48.0/3, 11.0, 16.0/3);
	}

	public static void poland() {
		
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledRectangle(11.0, 4.0, 11.0, 4.0);
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledRectangle(11.0, 12.0, 11.0, 4.0);
	}

	public static void thailand() {
		
		// TODO
	}

	public static void finland() {
		
		// TODO
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			int canvasHeight = 512;
			int canvasWidth = 22 * canvasHeight / 16;
			StdDraw.setCanvasSize(canvasWidth, canvasHeight);
			Object[] options = { "Continue", "Exit" };
			while (true) {
				norway();
				if (DialogBoxes.askUser("Continue to Flag of France?", "Current: Norway", JOptionPane.QUESTION_MESSAGE,
						options)) {
					france();
					if (DialogBoxes.askUser("Continue to Flag of Indonesia?", "Current: France",
							JOptionPane.QUESTION_MESSAGE, options)) {
						indonesia();
						if (DialogBoxes.askUser("Continue to Flag of Netherlands?", "Current: Indonesia",
								JOptionPane.QUESTION_MESSAGE, options)) {
							netherlands();
							if (DialogBoxes.askUser("Continue to Flag of Poland?", "Current: Netherlands",
									JOptionPane.QUESTION_MESSAGE, options)) {
								poland();
								if (DialogBoxes.askUser("Continue to Flag of Thailand?", "Current: Poland",
										JOptionPane.QUESTION_MESSAGE, options)) {
									thailand();
									if (DialogBoxes.askUser("Continue to Flag of Finland?", "Current: Thailand",
											JOptionPane.QUESTION_MESSAGE, options)) {
										finland();
										if (DialogBoxes.askUser("Exit?", "Current: Finland")) {
											// pass
										} else {
											continue;
										}
									}
								}
							}
						}
					}
				}
				System.exit(0);
			}
		});
	}
}
