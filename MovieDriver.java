import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) 
	{
		String movie;
		String rating;
		int tickets;
		String another;
		char answer;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the name of a movie"); // Asks the user for the name of a movie 
			movie = keyboard.nextLine(); // Gets the input 

		
		
		
		System.out.println("Enter the rating of the movie");
			rating = keyboard.nextLine(); // Gets the rating for the movie
				
				
		System.out.println("Enter the number of tickets sold for this movie");
			tickets = keyboard.nextInt(); // Gets number of tickets sold 
		
		
		System.out.println(movie + " (" + rating + "):" + "Tickets Sold:" + tickets);
		
		System.out.println("Do you want to enter another? (y or n)");
			another = keyboard.nextLine(); // Gets the line of input
			answer = another.charAt(0); // Gets the first letter 
			
			while (answer == 'y' || answer == 'Y') // Loop for as long as the user wants to keep entering movies
			{
				System.out.println("Enter the name of a movie"); 
				movie = keyboard.nextLine();  

			
			
			
			System.out.println("Enter the rating of the movie");
				rating = keyboard.nextLine();
					
					
			System.out.println("Enter the number of tickets sold for this movie");
				tickets = keyboard.nextInt();
			
			
			System.out.println(movie + " (" + rating + "):" + "Tickets Sold:" + tickets);
			
			System.out.println("Do you want to enter antoher? (y or n)");
				another = keyboard.nextLine();
				answer = another.charAt(0);
			}
		if (answer == 'n' || answer == 'N')
		{
			System.out.println("Goodbye");		
		}
	}

}
