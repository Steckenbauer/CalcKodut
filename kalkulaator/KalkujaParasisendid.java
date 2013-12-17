package kalkulaator;

import java.awt.Button;
import java.awt.Color;

@SuppressWarnings("serial")
public class KalkujaParasisendid extends ParaCalc {
	public void nupuSisendid() {
		setLayout(null);
		int xUus = 500;

		// Kalkulaatori KOMPONENDID
		tSumma.setBackground(Color.black);
		tSumma.setForeground(Color.green);
		tSumma.setBounds(xUus + 5, 25, 270, 30);
		add(tSumma);

		/*
		 * Parabooli komponendid a
		 */
		paralA.setBackground(Color.black);
		paralA.setForeground(Color.green);
		paralA.setBounds(xUus + 15, 280, 30, 30);
		add(paralA);

		// b
		paralB.setBackground(Color.black);
		paralB.setForeground(Color.green);
		paralB.setBounds(xUus + 120, 280, 30, 30);
		add(paralB);

		// c
		paralC.setBackground(Color.black);
		paralC.setForeground(Color.green);
		paralC.setBounds(xUus + 226, 280, 30, 30);
		add(paralC);

		// M22rn v2vid ja numbrid numbritele
		for (int i = 0; i < 10; i++) {
			button[i] = new Button(String.valueOf(i));
			button[i].setBackground(Color.black);
			button[i].setForeground(Color.green);

		}
		// m22ran symbolite v2rvid
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

		// m22ran nuppude asukohad
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
		// Aktiveerin numbrid
		for (int i = 0; i < 10; i++) {
			add(button[i]);
		}
		// M22ran symbolite asukohad
		punkt.setBounds(xUus + 225, 190, 50, 50);
		liida.setBounds(xUus + 170, 80, 50, 30);
		lahuta.setBounds(xUus + 225, 80, 50, 30);
		korruta.setBounds(xUus + 170, 117, 50, 30);
		jaga.setBounds(xUus + 225, 117, 50, 30);
		summa.setBounds(xUus + 170, 155, 50, 30);
		kustuta.setBounds(xUus + 225, 155, 50, 30);
		// aktiveerin symbolid
		add(punkt);
		add(liida);
		add(lahuta);
		add(korruta);
		add(jaga);
		add(summa);
		add(kustuta);

	}

}
