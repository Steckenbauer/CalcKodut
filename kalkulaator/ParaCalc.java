package kalkulaator;

import java.awt.*;
import java.applet.*;

@SuppressWarnings("serial")
public class ParaCalc extends Applet {

	public void init() {
		Nupud nupp = new Nupud();
		this.addKeyListener(nupp);
		new Arvuta();

		new KalkujaParasisendid();
	}

	public Graphics2D g;
	TextField tSumma = new TextField("");
	TextField paralA = new TextField("");
	TextField paralB = new TextField("");
	TextField paralC = new TextField("");

	Button button[] = new Button[10];
	Button punkt = new Button(".");
	Button jaga = new Button("/");
	Button korruta = new Button("*");
	Button liida = new Button("+");
	Button lahuta = new Button("-");
	Button summa = new Button("=");
	Button kustuta = new Button("C");

	double number, ajutnumber;
	public double a = 0, b = 0, c = 0;
	int lugeja;
	String strnumber = "", ajutstrnum = "";
	String syndmus = "";

}