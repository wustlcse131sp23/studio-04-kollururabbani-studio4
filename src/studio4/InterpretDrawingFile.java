package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shape = in.next();
		int color1 = in.nextInt();
		int color2 = in.nextInt();
		int color3 = in.nextInt();
		StdDraw.setPenColor(new Color (color1, color2, color3));
		boolean fill = in.nextBoolean();
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();
		
		if (fill == true) {
			StdDraw.filledSquare(a,b,c);
		}
		else {
			StdDraw.square(a,b,c);
		}
		
	}
}
