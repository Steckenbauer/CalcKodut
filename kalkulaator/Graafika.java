package kalkulaator;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

@SuppressWarnings("serial")
public class Graafika extends ParaCalc {
	
	public void paint(Graphics g) {
		 
		this.g = (Graphics2D) g;
		joonistaTaust();
		joonistaKoordinaadistik();
		joonistaParabool();

	}

	public void joonistaTaust() {
		int w = getWidth();
		int h = getHeight();
		g.setColor(Color.black);
		g.fillRect(0, 0, w, h);
		// Raam
		int xUus = 500;
		g.setColor(Color.green);
		g.drawRect(xUus, 0, 280, 475);

		// Paraboolisisendi komponendid
		// A
		g.drawRect(xUus + 5, 275, 270, 40);
		g.drawRect(xUus + 15, 280, 30, 30);
		g.drawString("* x ^ 2    +", xUus + 55, 300);
		// B
		g.drawRect(xUus + 120, 280, 30, 30);
		g.drawString("* x +", xUus + 180, 300);
		// C
		g.drawRect(xUus + 225, 280, 30, 30);

	}

	public void joonistaKoordinaadistik() {
		// X,Y
		g.setColor(Color.green);
		g.drawLine(0, 250, 775, 250);
		g.drawLine(250, 0, 250, 500);
		g.drawLine(500 - 5, 250 - 5, 500, 250);
		g.drawLine(500 - 5, 250 + 5, 500, 250);
		g.drawLine(250 - 5, 0 + 5, 250, 0);
		g.drawLine(250 + 5, 0 + 5, 250, 0);
		g.setColor(Color.white);
		// Koordinaadistik osadeks osadeks
		for (int t = 0; t < 250; t = t + 10) {
			if (t != 0) {
				g.drawLine(250 - t, 250 - 5, 250 - t, 250 + 5);
				g.drawLine(250 + t, 250 - 5, 250 + t, 250 + 5);
				g.drawLine(250 - 5, 250 - t, 250 + 5, 250 - t);
				g.drawLine(250 - 5, 250 + t, 250 + 5, 250 + t);
			}
		}
		repaint();
	}

	public void joonistaParabool() {
		g.setColor(Color.red);
		double x;
		double y;
		double x2;
		double y2;
		double rad = -250;
		for (double nurk = 0; nurk <= Math.PI; nurk = nurk + 0.003) {
			rad = rad + 0.005;
			x = (rad * Math.cos(nurk));
			y = (a * x * x) + (b * x) + c;
			x2 = x + 1;
			y2 = (a * x2 * x2) + (b * x2) + c;
			g.draw(new Line2D.Double(250 + (x * 10), 250 - (y * 10),
					250 + (x2 * 10), 250 - (y2 * 10)));

		}
		repaint();
	}
	

}
