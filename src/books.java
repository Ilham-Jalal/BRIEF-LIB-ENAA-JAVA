import java.util.Scanner;

public class books {
    String Title ;
    String Author;
    String ISBN;
    int publishDate;
    student Owner = new student();
   void ModifyBook(){
        Scanner input = new Scanner(System.in);
        System.out.println("entrez titre :");
        this.Title= input.nextLine();
        System.out.println("entrez le nom de l'auteur :");
        this.Author= input.nextLine();
        System.out.println("entez ISBN :");
        this.ISBN= input.nextLine();
        System.out.println("entez la date de publication :");
        this.publishDate= input.nextInt();
    }

}
