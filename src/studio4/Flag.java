package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
	
		StdDraw.clear();
		
		// background
		Color pink = new Color(229, 188, 203);
		
		StdDraw.setPenColor(pink);

		StdDraw.filledRectangle(.5, .5, .4, .25);

		//envelope left side
		double[] x = {.1,  .9, .1};
		double[] y = {.25,  .25, .75};
		Color darkPink = new Color(236, 156, 185);

		
		StdDraw.setPenColor(darkPink);

		StdDraw.filledPolygon(x,y);
		
		//envelope right side
		double[] a = {.9,  .9, .1};
		double[] b = {.75,  .25, .25};
		StdDraw.filledPolygon(a,b);
		
	}
}