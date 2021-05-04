import java.io.IOException;
import java.util.Scanner;


public class dskprt {
	public static void main(String args[ ]) throws InterruptedException, IOException {
		System.out.println("\033[0;36m");
		welcome welcomemsg = new welcome();
	double points = 0;
	while(5 > 3) {
		welcomemsg.hellos();
		System.out.println("\nYour points:" + points);
		Scanner choice2 = new Scanner(System.in);
		int choice = choice2.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Wtf how??");
			Thread.sleep(3000);
			if (Math.random() < 0.7) {
			    System.out.println("Your friends didn't appreciate your new pfp. You lost 5 points.");
				points -= 5;
				Thread.sleep(3000);
				continue;
			}
			else {
				System.out.println("Your friends liked your new pfp! You get 3 points.");
				points += 5;
				Thread.sleep(3000);
				continue;
			}
			
		case 2:
			if (Math.random() < 0.2) {
			    System.out.println("You went out and you felt sad. You loose 5 points!");
				points -= 5;
				Thread.sleep(3000);
				continue;
			}
			else {
				System.out.println("You went out and found big chungus. Now you know its real! You get 8 points.");
				points += 8;
				Thread.sleep(3000);
				continue;
			}
		case 3:
				System.out.println("It wasn't worth the time, nobody cared. You loose 10 points!");
				points -= 10;
				Thread.sleep(3000);
				break;
		case 4:
				if(points > 500) {
					System.out.println("you became hot anime girl and finished the game!!!");
					Thread.sleep(5000);
					System.exit(0);
				}
				else{
					System.out.println("Not enough points!");
					Thread.sleep(5000);
					continue;
				}
		default:
				System.out.println("type out something valid, silly");
				Thread.sleep(3000);
				continue;
		}
	}
}
}
		
		
			
		
			
			

