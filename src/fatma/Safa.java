package fatma;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Safa {



	

		public static void main(String[] args) {

		String gissning = JOptionPane.showInputDialog("Gissa ordet!");

		while ( ! gissning.equals("Java")) {

		gissning = JOptionPane.showInputDialog("Fel, gissa igen");

		}

		System.out.println("Äntligen rätt!");
		}
	}



