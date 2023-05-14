package TicketBuyingSystem;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private String genre;
    private double price;
    public Ticket[] tickets;
    public ArrayList<Integer> selectedSeats;
    public int ticketcount;

    public Movie(String title, String genre, double price,int ticketcount) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.ticketcount=ticketcount;
        selectedSeats = new ArrayList<Integer>();
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
