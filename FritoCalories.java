import java.util.Scanner;


public class FritoCalories
{
	public static void main(String[] args)
	{
		
		double fritos; //Number of fritos eaten
		double calories;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the number of Fritos eaten: ");
		fritos = keyboard.nextDouble();
		
		calories = fritos * 24;
		
		System.out.print("Number of total calories consumed: " + calories);
	}
}