import java.io.IOException;

public class welcome {
	void hellos()  throws InterruptedException, IOException {

		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"); // this is so bad why didnt the escape code thing work
		System.out.println("Hello welcome to dskprt simulator. Choose what you will do: \n");
		System.out.println("1. Change profile pic");
		System.out.println("2. Go out");
		System.out.println("3. Troll");
		System.out.println("Become hot anime girl " + "\033[1;36m" + "(requires 500 points)" + "\u001B[0m" + "\033[0;36m");
	}

}
