package kalkulaator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class Arvuta extends ParaCalc implements ActionListener {

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

	public void operation() {
		lugeja++;
		if (lugeja == 1) {
			ajutnumber = number;
			strnumber = "";
			number = 0;
		} else {
			if (syndmus == "+")
				ajutnumber += number;
			else if (syndmus == "-")
				ajutnumber -= number;
			else if (syndmus == "*")
				ajutnumber = ajutnumber * number;
			else if (syndmus == "/")
				ajutnumber = ajutnumber / number;
			ajutstrnum = Double.toString(ajutnumber);
			g.setColor(Color.white);
			tSumma.setText(ajutstrnum);
			strnumber = "";
			number = 0;

		}
	}

	public void actionPerformed(ActionEvent e) {
		for (int i = 0; i <= 9; i++) {
			if (e.getSource() == button[i]) {
				play(getCodeBase(), i + ".au");
				strnumber += Integer.toString(i);
				g.setColor(Color.white);
				tSumma.setText(strnumber);
				number = Double.valueOf(strnumber).doubleValue();
			}
		}

		if (e.getSource() == liida) {
			operation();
			syndmus = "+";
		}

		if (e.getSource() == lahuta) {
			operation();
			syndmus = "-";
		}

		if (e.getSource() == jaga) {
			operation();
			syndmus = "/";
		}
		if (e.getSource() == korruta) {
			operation();
			syndmus = "*";
		}

		if (e.getSource() == summa) {
			if (syndmus == "+")
				ajutnumber += number;
			else if (syndmus == "-")
				ajutnumber -= number;
			else if (syndmus == "*")
				ajutnumber = ajutnumber * number;
			else if (syndmus == "/")
				ajutnumber = ajutnumber / number;

			ajutstrnum = Double.toString(ajutnumber);
			tSumma.setText(ajutstrnum);
			ajutstrnum = "";
			ajutnumber = 0;
			strnumber = "";
			number = 0;
			lugeja = 0;

		}

		if (e.getSource() == kustuta) {
			tSumma.setText("0");
			paralA.setText("");
			paralB.setText("");
			paralC.setText("");
			ajutstrnum = "";
			ajutnumber = 0;
			strnumber = "";
			number = 0;
			lugeja = 0;
		}
	}

}
