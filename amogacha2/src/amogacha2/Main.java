package amogacha2;
import java.util.Scanner;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		double random, rand, ind;
		int index, rarity, percentage;
		Pull name = new Pull();
		System.out.println("Your 10 pulls are:");
		for (int i = 0; i < 9; i++)
		{
			random = Math.random() * 100;
			percentage = (int) random;
			if (percentage <= 9)
			{
				ind = (Math.random() * 100)%7;
				index = (int) ind;
				System.out.println();
				System.out.println("You have obtained a HIGHLY RARE amogus!");
				System.out.println("6 star - " + name.Six[index]);
				System.out.println();
			}
			else if (percentage <= 24) {
				ind = (Math.random() * 100)%10;
				index = (int) ind;
				System.out.println();
				System.out.println("You have obtained a RARE amogus!");
				System.out.println("5 star - " + name.Five[index]);
				System.out.println();
			}
			else if (percentage <= 74) {
				ind = (Math.random() * 100)%9;
				index = (int) ind;
				System.out.println("4 star - " + name.Four[index]);
			}
			else if (percentage <= 99) {
				ind = (Math.random() * 100)%7;
				index = (int) ind;
				System.out.println("3 star - " + name.Three[index]);
			}
			else {
				System.out.println("NULLAMOGUS " + percentage);
			}
		}
		Scanner scanf = new Scanner(System.in);
		scanf.nextLine();

	}

}
