import java.util.Scanner;

public class books {
    String Title ;
    String Author;
    String ISBN;
    int publishDate;
    student Owner = new student();
    Boolean Booked = false;
   void ModifyBook(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter title :");
        this.Title= input.nextLine();
        System.out.println("enter book's author's name :");
        this.Author= input.nextLine();
        System.out.println("enter book's ISBN :");
        this.ISBN= input.nextLine();
        System.out.println("enter book's publish date :");
        this.publishDate= input.nextInt();
    }

}
