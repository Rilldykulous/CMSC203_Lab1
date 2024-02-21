import java.util.Scanner;
public class MovieDriver {

	public static void main(String[] args) {
		boolean wantNext;
	//Create a new object of type Scanner that reads from the keyboard
		Scanner input = new Scanner(System.in);
	//Create a new movie object
		Movie movie = new Movie();
	//looping through this until user says to stop
		do {
		//Prompt the user to enter the title of a movie
			System.out.println("Please enter the title of a movie");
		//Read in the line that the user types
			String movieName = input.nextLine();
		//Set the title in the movie object
			movie.setTitle(movieName);
		//Prompt the user to enter the movie’s rating
			System.out.println("Please enter the movie's rating");
		//Read in the line that the user types
			String rating = input.nextLine();
		//Set the rating in the movie object
			movie.setRating(rating);
		//Prompt the user to enter the number of tickets sold at a (unnamed) theater
			System.out.println("Please enter the number of tickets sold");
		//Read in the integer that the user types
			int ticketsSold = input.nextInt();
		//Set the number of tickets sold in the movie object
			movie.setSoldTickets(ticketsSold);
		//Print out the information using the movie’s toString method
			System.out.println(movie.toString());
			System.out.print("Do you wish to enter another movie? (y/n) ");
			input.nextLine();
			String response = input.nextLine();
			if(response.equalsIgnoreCase("y"))
				wantNext = true;
			else
				wantNext = false;
	} while(wantNext);
	}

}
