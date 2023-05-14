
package TicketBuyingSystem;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ticket {
    private String ticketNumber;
    private Movie movie;
    private int[] seatNumbers;
    private double totalPrice;
    private String customerName;
    private String customerEmail;

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    public LocalDateTime time;

    public Ticket(String ticketNumber, Movie movie,  double totalPrice, String customerName, String customerEmail) {
        this.ticketNumber = ticketNumber;
        this.movie = movie;
        this.totalPrice = totalPrice;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.time=LocalDateTime.now();
    }
    public void displayTicketDetails() {
//        System.out.println("Ticket Details:");
        System.out.println("Ticket Number: " + ticketNumber);
        System.out.println("Movie: " + movie.getTitle() + " (" + movie.getGenre() + ")");
//        System.out.println("Seat Numbers: " + Arrays.toString(seatNumbers));
        System.out.println("Total Price: $" + String.format("%.2f", totalPrice));
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer Email: " + customerEmail);
        System.out.println("Date time: "+dtf.format(time));
    }

    public boolean checkseat(int seat){
        for(int i=0;i<seatNumbers.length;i++){
            if(seat==seatNumbers[i]){
                return  true;
            }
            else if(i==seatNumbers.length-1){
                return false;
            }
        }
        return false;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public int[] getSeatNumbers() {
        return seatNumbers;
    }

    public void setSeatNumbers(int[] seatNumbers) {
        this.seatNumbers = seatNumbers;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }


}