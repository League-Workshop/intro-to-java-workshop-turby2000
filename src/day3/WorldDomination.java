package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String anwser=JOptionPane.showInputDialog("Do you know how to write code?");

		// 2. If they say "yes", tell them they will rule the world.
             String yes= JOptionPane.showInputDialog("Enter Yes/No");
             if(anwser.equalsIgnoreCase("yes")) {
            	 JOptionPane.showMessageDialog(null,"You will rule the world");
             }
		// 3. Otherwise, wish them good luck washing dishes.
             
             if(anwser.equalsIgnoreCase("no")) {
            	 JOptionPane.showMessageDialog(null,"Good luck washing dishes!");
          
	}
}}

