package joonistamine;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;
import java.applet.*;

public class Graafiline extends Applet implements ActionListener {

	TextField tSumma = new TextField("");
	Button button[] = new Button[10];
	Button punkt = new Button(".");
	Button jaga = new Button("/");
	Button korruta = new Button("*");
	Button liida = new Button("+");
	Button lahuta = new Button("-");
	Button summa = new Button("=");
	Button kustuta = new Button("C");
	double num, numtemp;
	int counter;
	String strnum = "", strnumtemp = "";
	String op = "";
	private Graphics2D g;

	public void paint(Graphics g) {
		this.g = (Graphics2D) g;
		joonistaTaust();
		joonistaKoordinaadistik();
		joonistaParabool();
		init();
	}

	public void joonistaTaust() {
		int w = getWidth();
		int h = getHeight();
		g.setColor(Color.black);
		g.fillRect(0, 0, w, h);

	}

	private void init() {
		setLayout(null);
		// Raam
		int xUus = 500;
		g.setColor(Color.green);	
		g.drawRect(xUus, 0, 280, 475);
		// Kalkulaatori KOMPONENDID
		tSumma.setBackground(Color.black);
		tSumma.setForeground(Color.green);
		tSumma.setBounds(xUus + 5, 25, 270, 30);
		add(tSumma);
		// M‰‰ran v‰rvid numbritele
		for (int i = 0; i < 10; i++) {
			button[i] = new Button(String.valueOf(i));
			button[i].setBackground(Color.black);
			button[i].setForeground(Color.green);

		}
		// m‰‰ran s¸mbolitele t‰hised ja v‰rvid
		
		punkt.setBackground(Color.black);
		punkt.setForeground(Color.green);
		liida.setBackground(Color.black);
		liida.setForeground(Color.green);
		lahuta.setBackground(Color.black);
		lahuta.setForeground(Color.green);
		korruta.setBackground(Color.black);
		korruta.setForeground(Color.green);
		jaga.setBackground(Color.black);
		jaga.setForeground(Color.green);
		summa.setBackground(Color.black);
		summa.setForeground(Color.green);
		kustuta.setBackground(Color.black);
		kustuta.setForeground(Color.green);

		// m‰‰ran nuppude asukohad
		button[1].setBounds(xUus + 5, 80, 50, 50);
		button[2].setBounds(xUus + 60, 80, 50, 50);
		button[3].setBounds(xUus + 115, 80, 50, 50);
		button[4].setBounds(xUus + 5, 135, 50, 50);
		button[5].setBounds(xUus + 60, 135, 50, 50);
		button[6].setBounds(xUus + 115, 135, 50, 50);
		button[7].setBounds(xUus + 5, 190, 50, 50);
		button[8].setBounds(xUus + 60, 190, 50, 50);
		button[9].setBounds(xUus + 115, 190, 50, 50);
		button[0].setBounds(xUus + 170, 190, 50, 50);
		punkt.setBounds(xUus + 225, 190, 50, 50);
		liida.setBounds(xUus + 170, 80, 50, 30);
		lahuta.setBounds(xUus + 225, 80, 50, 30);
		korruta.setBounds(xUus + 170, 117, 50, 30);
		jaga.setBounds(xUus + 225, 117, 50, 30);
		summa.setBounds(xUus + 170, 155, 50, 30);
		kustuta.setBounds(xUus + 225, 155, 50, 30);
		// Aktiveerin nupud
		for (int i = 0; i < 10; i++) {
			add(button[i]);

		}
		add(punkt);
		add(liida);
		add(lahuta);
		add(korruta);
		add(jaga);
		add(summa);
		add(kustuta);

		// Paraboolisisendi komponendid
		// a
		g.drawRect(xUus + 5, 275, 270, 40);
		g.drawRect(xUus + 15, 280, 30, 30);
		g.drawString("* x ^ 2    +", xUus + 55, 300);
		// b
		g.drawRect(xUus + 120, 280, 30, 30);
		g.drawString("* x +", xUus + 180, 300);
		// c
		g.drawRect(xUus + 225, 280, 30, 30);
	}

	public void operation() {
		counter++;
		if (counter == 1) {
			numtemp = num;
			strnum = "";
			num = 0;
		} else {
			if (op == "+")
				numtemp += num;
			else if (op == "-")
				numtemp -= num;
			else if (op == "*")
				numtemp = numtemp * num;
			else if (op == "/")
				numtemp = numtemp / num;
			strnumtemp = Double.toString(numtemp);
			tSumma.setText(strnumtemp);
			strnum = "";
			num = 0;
		}
	}
	public void stop() {
		for (int i = 0; i <= 9; i++) {
			button[i].addActionListener(null);
		}
		punkt.addActionListener(null);
		liida.addActionListener(null);
		lahuta.addActionListener(null);
		jaga.addActionListener(null);
		korruta.addActionListener(null);
		summa.addActionListener(null);
		kustuta.addActionListener(null);
	}


	public void start() {
		for (int i = 0; i <= 9; i++) {
			button[i].addActionListener(this);
		}
		punkt.addActionListener(this);
		liida.addActionListener(this);
		lahuta.addActionListener(this);
		jaga.addActionListener(this);
		korruta.addActionListener(this);
		summa.addActionListener(this);
		kustuta.addActionListener(this);
	}


	public void actionPerformed(ActionEvent e) {
		for (int i = 0; i <= 9; i++) {
			if (e.getSource() == button[i]) {
				play(getCodeBase(), i + ".au");
				strnum += Integer.toString(i);
				tSumma.setText(strnum);
				num = Double.valueOf(strnum).doubleValue();
			}
		}

		if (e.getSource() == liida) {
			operation();
			op = "+";
		}

		if (e.getSource() == lahuta) {
			operation();
			op = "-";
		}

		if (e.getSource() == jaga) {
			operation();
			op = "/";
		}

		if (e.getSource() == korruta) {
			operation();
			op = "*";
		}

		if (e.getSource() == summa) {
			if (op == "+")
				numtemp += num;
			else if (op == "-")
				numtemp -= num;
			else if (op == "*")
				numtemp = numtemp * num;
			else if (op == "/")
				numtemp = numtemp / num;

			strnumtemp = Double.toString(numtemp);
			tSumma.setText(strnumtemp);
			strnumtemp = "";
			numtemp = 0;
			strnum = "";
			num = 0;
			counter = 0;
		}

		if (e.getSource() == kustuta) {
			tSumma.setText("0");
			strnumtemp = "";
			numtemp = 0;
			strnum = "";
			num = 0;
			counter = 0;
		}
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
		// Jooned osadeks
		for (int t = 0; t < 250; t = t + 10) {
			if (t != 0) {
				g.drawLine(250 - t, 250 - 5, 250 - t, 250 + 5);
				g.drawLine(250 + t, 250 - 5, 250 + t, 250 + 5);
				g.drawLine(250 - 5, 250 - t, 250 + 5, 250 - t);
				g.drawLine(250 - 5, 250 + t, 250 + 5, 250 + t);
			}
		}

	}

	public void joonistaParabool() {
		g.setColor(Color.red);
		double a = 1;
		double b = 6;
		double c = 0;
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

	}

}
