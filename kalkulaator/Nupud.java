package kalkulaator;

import java.awt.Color;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@SuppressWarnings("serial")
public class Nupud extends Graafika implements KeyListener {
	
	
	double igav = 0;

	@Override
	public  void keyPressed(KeyEvent e) {
		String muutuja = null;

		if (e.getKeyCode() == KeyEvent.VK_NUMPAD0) {
			play(getCodeBase(), 0 + ".au");
			muutuja += Integer.toString(0);
			g.setColor(Color.white);
			((TextField) e.getSource()).setText(muutuja);
			igav = Double.valueOf(muutuja).doubleValue();
		}
		if (e.getKeyCode() == KeyEvent.VK_NUMPAD1) {
			play(getCodeBase(), 1 + ".au");
			muutuja += Integer.toString(1);
			g.setColor(Color.white);
			((TextField) e.getSource()).setText(muutuja);
			igav = Double.valueOf(muutuja).doubleValue();
		}
		if (e.getKeyCode() == KeyEvent.VK_NUMPAD2) {
			play(getCodeBase(), 2 + ".au");
			muutuja += Integer.toString(2);
			g.setColor(Color.white);
			((TextField) e.getSource()).setText(muutuja);
			igav = Double.valueOf(muutuja).doubleValue();
		}
		if (e.getKeyCode() == KeyEvent.VK_NUMPAD3) {
			play(getCodeBase(), 3 + ".au");
			muutuja += Integer.toString(3);
			g.setColor(Color.white);
			paralA.setText(muutuja);
			igav = Double.valueOf(muutuja).doubleValue();
		}
		if (e.getKeyCode() == KeyEvent.VK_NUMPAD4) {
			play(getCodeBase(), 4 + ".au");
			muutuja += Integer.toString(4);
			g.setColor(Color.white);
			((TextField) e.getSource()).setText(muutuja);
			igav = Double.valueOf(muutuja).doubleValue();
		}
		if (e.getKeyCode() == KeyEvent.VK_NUMPAD0) {
			play(getCodeBase(), 5 + ".au");
			muutuja += Integer.toString(5);
			g.setColor(Color.white);
			((TextField) e.getSource()).setText(muutuja);
			igav = Double.valueOf(muutuja).doubleValue();
		}
		if (e.getKeyCode() == KeyEvent.VK_NUMPAD6) {
			play(getCodeBase(), 6 + ".au");
			muutuja += Integer.toString(6);

			g.setColor(Color.white);
			((TextField) e.getSource()).setText(muutuja);
			igav = Double.valueOf(muutuja).doubleValue();
		}
		if (e.getKeyCode() == KeyEvent.VK_NUMPAD7) {
			play(getCodeBase(), 7 + ".au");
			muutuja += Integer.toString(7);
			g.setColor(Color.white);
			((TextField) e.getSource()).setText(muutuja);
			igav = Double.valueOf(muutuja).doubleValue();
		}
		if (e.getKeyCode() == KeyEvent.VK_NUMPAD8) {
			play(getCodeBase(), 8 + ".au");
			muutuja += Integer.toString(8);
			g.setColor(Color.white);
			((TextField) e.getSource()).setText(muutuja);
			igav = Double.valueOf(muutuja).doubleValue();
		}
		if (e.getKeyCode() == KeyEvent.VK_NUMPAD9) {
			play(getCodeBase(), 9 + ".au");
			muutuja += Integer.toString(9);
			g.setColor(Color.white);
			((TextField) e.getSource()).setText(muutuja);
			igav = Double.valueOf(muutuja).doubleValue();
		}
		if (e.getKeyCode() == KeyEvent.VK_SUBTRACT) {
			play(getCodeBase(), "-" + ".au");
			muutuja += "-";
			g.setColor(Color.white);
			((TextField) e.getSource()).setText(muutuja);
			igav = Double.valueOf(muutuja).doubleValue();
		}

		
		if (((TextField) e.getSource()) == paralA) {
			igav = a;

		}

		if (((TextField) e.getSource()) == paralB) {
			igav = b;
		}
		if (((TextField) e.getSource()) == paralC) {
			igav = c;
		}

	}
	

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

}
