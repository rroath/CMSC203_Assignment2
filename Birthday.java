import java.util.Scanner;
import javax.swing.JOptionPane;
import java.awt.Dialog;

public class Birthday {

	public static void main(String[] args) {
		//declared variables
		Scanner bd=new Scanner(System.in);
		
		int age;
		String name, toy, tryAgain, balloon, card, repeat, purchase;
		double finalTotal;
		
		//display message
		JOptionPane.showMessageDialog(null, "Welcome to the Toy Company! A place to buy toys for children");
		
		//child's name and age
		name = JOptionPane.showInputDialog("What is the child's name?", JOptionPane.QUESTION_MESSAGE);
		age = Integer.parseInt(JOptionPane.showInputDialog("How old is "+name+"?", JOptionPane.QUESTION_MESSAGE));
		
		//declare toy object
		Toy first = new Toy(name, age);
		
		//toy condition
		do {
			
		toy = JOptionPane.showInputDialog("What kind of toy do you want to buy: plushie, book, block", JOptionPane.QUESTION_MESSAGE);
		first.setToy(toy);
		
		if(first.ageOK() == false)
			tryAgain = JOptionPane.showInputDialog(toy+" is not really for "+age+" year olds. Do you want to continue?", JOptionPane.QUESTION_MESSAGE);
		else
			tryAgain = "yes";
		
		} while(tryAgain.equalsIgnoreCase("no"));
		
		JOptionPane.showMessageDialog(null, "Good Choice!");
		
		//card
		card = JOptionPane.showInputDialog("Do you want a card for the "+toy+"? (yes or no)", JOptionPane.QUESTION_MESSAGE);
		first.addCard(card);
		
		//balloon
		balloon = JOptionPane.showInputDialog("Do you want a balloon for the "+toy+"? (yes or no)", JOptionPane.QUESTION_MESSAGE);
		first.addBalloon(balloon);
		
		//another toy
		repeat = JOptionPane.showInputDialog("Do you want another to enter another toy? (yes or no)", JOptionPane.QUESTION_MESSAGE);
		
		//display cost and info for first toy
		purchase = name+first.toString();
		JOptionPane.showMessageDialog(null, purchase);
		
		//add total
		
		
		//repeat.equalsIgnoreCase("yes");
		
	}

}
