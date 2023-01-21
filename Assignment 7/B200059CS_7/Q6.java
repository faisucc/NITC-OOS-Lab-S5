import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Scanner;

interface Borrowable{
    void checkIn();
    void checkOut(String name);
}

abstract class Book implements Borrowable{
    int bookID;
    String title;
    String author;


    abstract String getStatus();
    abstract String getBorrowedUser();
}

class TextBooks extends Book{
    String status;
    String borrowedUser;

    public void checkIn(){
        this.status = "Available";
    }

    public void checkOut(String name){
        this.status = "Borrowed";
        this.borrowedUser = name;
    }


    public String getStatus(){
        return this.status;
    }

    public String getBorrowedUser(){
        return this.borrowedUser;
    }
}

class ReferenceBooks extends Book{
    String status;
    String borrowedUser;
    public void checkIn(){
        this.status = "Invalid";
    }

    public void checkOut(String name){
        this.status = "Invalid";
        System.out.println("Cannot be borrowed");
    }


    public String getStatus(){
        return this.status;
    }

    public String getBorrowedUser(){
        return this.borrowedUser;
    }

}

public class Q6 {
    public static void main(String[] args){
        ArrayList<Book> books = new ArrayList<>();
        Scanner line = new Scanner(System.in);

        System.out.println("1. Add Reference Books");
        System.out.println("2. Add Text Book");
        System.out.println("3. Check-Out");
        System.out.println("4. Check-In");
        System.out.println("5. List Books");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
        String inp = "";
        inp = line.nextLine().trim();

        while(!inp.equals("6")){

            if(inp.equals("1")){
                System.out.println("Enter ID, Title and Author (Line by line)");
                ReferenceBooks r = new ReferenceBooks();
                r.bookID = Integer.parseInt(line.nextLine().trim());
                r.title = line.nextLine().trim();
                r.author = line.nextLine().trim();
                r.status = "Invalid";
                books.add(r);
            }

            else if(inp.equals("2")){
                System.out.println("Enter ID, Title and Author (Line by line)");
                TextBooks t = new TextBooks();
                t.bookID = Integer.parseInt(line.nextLine().trim());
                t.title = line.nextLine().trim();
                t.author = line.nextLine().trim();
                t.status = "Available";
                books.add(t);
            }

            else if(inp.equals("3")){
                System.out.print("Enter Book ID: ");
                int req = Integer.parseInt(line.nextLine().trim());
                for(Book b : books){
                    if(b.bookID == req){
                        if(b.getStatus().equals("Invalid")){
                            b.checkOut("");
                        }
                        else{
                            System.out.print("Enter Username: ");
                            b.checkOut(line.nextLine().trim());
                        }
                    }
                }
            }

            else if(inp.equals("4")){
                System.out.print("Enter Book ID: ");
                int req = Integer.parseInt(line.nextLine().trim());
                for(Book b : books){
                    if(b.bookID == req){
                        b.checkIn();
                    }
                }
            }

            else if(inp.equals("5")){
                for(Book b : books){
                    if(b.getStatus().equals("Invalid")){
                        System.out.println("ReferenceBook: " + b.bookID + ": " + b.title + ": " + b.author);
                    }
                    else if(b.getStatus().equals("Available")){
                        System.out.println("TextBook: " + b.bookID + ": " + b.title + ": " + b.author + ": " + "Available");
                    }
                    else if(b.getStatus().equals("Borrowed")){
                        System.out.println("TextBook: " + b.bookID + ": " + b.title + ": " + b.author + ": " + "Borrowed by " + b.getBorrowedUser());
                    }
                }
            }

            System.out.println();
        /*  System.out.println("1. Add Reference Books");
            System.out.println("2. Add Text Book");
            System.out.println("3. Check-Out");
            System.out.println("4. Check-In");
            System.out.println("5. List Books");
            System.out.println("6. Exit");*/
            System.out.print("Enter your choice: ");
            inp = line.nextLine().trim();
        }

    }
}
