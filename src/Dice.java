import java.util.Scanner;

public class Dice {

	int nos;//Number Of Sides
	
	public Dice(int nos)//Accept Only 2 ,4 or 5 Otherwise Invalid Input
	{
		if (nos < 2 || nos == 3 || nos == 5 || nos > 6) 
		{
			System.out.println("Invalid Input");
			System.exit(0);
		} 
		else 
		{
			this.nos = nos;
		}
	}
	
	public String roll() {
		int rand = 1 + (int)(Math.random() * nos);
		String result = null;
		if (nos == 2) //if number of sides are two
		{
			switch(rand)
			{
			case 1 : result = "HEAD";
			break;
			case 2 : result = "TAIL";
			break;
			}
		} 
		else 
		{
			result = String.valueOf(rand);
		}
		return result;
	}

	public static void main(String[] args)
	{
		System.out.println("Enter Number of Sides ");
		Scanner scanner = new Scanner(System.in);
		int sides = scanner.nextInt();
		Dice ud = new Dice(sides);//Object Creation of Dice
		int choice;//For further rolling of dice
		do 
		{
			System.out.println(ud.roll());
			System.out.println("Do you want to roll again(1 --> yes, 0 --> no): ");
			choice = scanner.nextInt();
		} while(choice == 1);
		scanner.close();
	}
}
