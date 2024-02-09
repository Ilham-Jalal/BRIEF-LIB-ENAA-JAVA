import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {

        ArrayList<books> ListeLivres = new ArrayList<books>();
        ArrayList<student> Students = new ArrayList<student>();

        void AddBook (){
            Scanner input = new Scanner(System.in);
            books Book = new books();
            System.out.println("enter title :");
            Book.Title= input.nextLine();
            System.out.println("enter book's author's name :");
            Book.Author= input.nextLine();
            System.out.println("enter book's ISBN :");
            Book.ISBN= input.nextLine();
            System.out.println("enter book's publish date :");
            Book.publishDate= input.nextInt();
            ListeLivres.add(Book);
        }
        void DisplayBook (){
            for (books Book : ListeLivres ){

                System.out.println("Title is :"+Book.Title);
                System.out.println("Author is :"+Book.Author);
                System.out.println("ISBN is :"+Book.ISBN);
                System.out.println("Book's publish date is :"+Book.publishDate);
            }
        }
    }

