package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
	StdDraw.setPenColor(Color.GREEN);
	StdDraw.filledRectangle(0.2, 0.5, 0.2, 0.2);
	StdDraw.setPenColor(Color.RED);
	StdDraw.filledRectangle(0.5, 0.5, 0.2, 0.2);
	StdDraw.setPenColor(Color.GREEN);
	StdDraw.filledRectangle(0.8, 0.5, 0.2, 0.2);
		
	}
}