/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package onlinemovieticketingsystem;
 abstract class Ticket {
 
    private String id;
    private String name;
    private String type;
    private String time;
    private String date;
 
    public Ticket(String id, String name, String type, String time, String date) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.time = time;
        this.date = date;
    }
 
    public String getId() {
        return id;
    }
 
    public void setId(String id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getType() {
        return type;
    }
 
    public void setType(String type) {
        this.type = type;
    }
 
    public String getTime() {
        return time;
    }
 
    public void setTime(String time) {
        this.time = time;
    }
 
    public String getDate() {
        return date;
    }
 
    public void setDate(String date) {
        this.date = date;
    }
 
    @Override
    public String toString() {
        return "Ticket{" + "id=" + id + ", name=" + name + ", type=" + type + ", time=" + time + ", date=" + date + '}';
    }
 
    public abstract double calculatePrice();
}
 
class MovieTicket extends Ticket {
 
    private String[] types = new String[]{"IMAX", "3D", "None"};
    private String movieName;
    private String[] times = new String[]{"12:00PM", "3:00PM", "6:00PM", "9:00PM"};
 
    public MovieTicket(String id, String name, String type, String time, String date, String movieName) {
        super(id, name, type, time, date);
        this.movieName = movieName;
    }
 
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
 
    public String getMovieName() {
        return this.movieName;
    }
 
    @Override
    public double calculatePrice() {
        double basePrice = 8.99;
        if (super.getType().toLowerCase().equals(types[0].toLowerCase())) {
            basePrice = basePrice + 3.00;
        } else if (super.getType().toLowerCase().equals(types[1].toLowerCase())) {
            basePrice = basePrice + 2.50;
        }
        return basePrice;
    }
 
    @Override
    public String toString() {
        return super.toString() + ", movieName=" + movieName;
    }
 
}
/**
 *
 * @author Admin
 */
public class OnlineMovieTicketingSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           MovieTicket mt = new MovieTicket("1234", "waleed ayub", "IMAX", "12:00PM", "27/12/2022", "Avengers");
        System.out.println(mt);
        System.out.println(mt.calculatePrice());
        // TODO code application logic here
    }
    
}
