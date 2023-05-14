package TicketBuyingSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Movie movie1 = new Movie("Breaking Bad", "Crime", 32,70);
        Movie movie2 = new Movie("Lucy", "adventure", 21,68);
        Movie movie3 = new Movie("Nobody", "science fiction", 13,50);
        Movie movie4 = new Movie("Joker", "Drama/Crime", 9,40);
        Movie movie5 = new Movie("ghosted", "horror", 13,20);

        // Create an array of movies
        Movie[] movies = {movie1, movie2, movie3, movie4, movie5};


       System.out.println("Write 'exit' to exit");
        System.out.println("Write 'again' to buy new tickets:");
        String request=input.next();
        while(request.equals("again")){



            //movcud filmleri istifadeciye goster


            System.out.println("Available movies:\n");
            for (int i = 0; i < movies.length; i++) {
                System.out.println(
                        (i + 1) + ". " + movies[i].getTitle() + " (" + movies[i].getGenre() + ") - $" + String.format("%.2f", movies[i].getPrice()) +"   Free seats:"+(movies[i].ticketcount-(movies[i].selectedSeats.size())));
            }

            //isdifadeciden film secmeyi ve input elde etmeyi sorus
            System.out.print("\nSelect a movie (1-" + movies.length + "): ");
            int movieIndex = input.nextInt() - 1;
            Movie selectedMovie = movies[movieIndex];

            //  isdifadeciden hansi yer secmeyi sorus
            System.out.print("Which seat(1-"+(selectedMovie.ticketcount-(selectedMovie.selectedSeats.size())+"): "));
            int numSeats = input.nextInt();
            while(numSeats>selectedMovie.ticketcount){
                System.out.println("You can choose seat 1-100");
                numSeats = input.nextInt();
            }
                while(selectedMovie.selectedSeats.contains(numSeats)){
                    System.out.println("This seat has been reserved.Choose other seat:");
                    numSeats=input.nextInt();
                }

                    selectedMovie.selectedSeats.add(numSeats);





            // alici detallarini sorus
            System.out.print("Enter your name: ");
            String customerName = input.next();
            System.out.print("Enter your email: ");
            String customerEmail = input.next();
            while(!customerEmail.contains("@")){
                System.out.println("Enter valid email");
                customerEmail = input.next();
            }

            // ticket obyektini yarat
            Ticket ticket = new Ticket("Ticket "+numSeats, selectedMovie,  selectedMovie.getPrice() , customerName, customerEmail);

            // isdifadeciye ticket detallarini goster
            System.out.println("\nTicket details:");
            ticket.displayTicketDetails();


            System.out.println("   ");
            System.out.println("Write 'exit' to exit");
            System.out.println("Write 'again' to buy new tickets");
            request=input.next();
        }
        System.out.println("Thank you for choosing us");
    }
}




