import java.util.Scanner;

public class Menu {
    Library enaa = new Library();
    void MENU(){
        int choice;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("******MENU******");
            System.out.println("1-Add book ");
            System.out.println("2-Display book ");
            System.out.println("3-search on a book ");
            System.out.println("4-Modify an existent book ");
            System.out.println("5-Delete an existent book");
            System.out.println("0-Exit");
            System.out.print("enter your choice : ");
            choice = input.nextInt();

            switch(choice){
                case 1:
                   enaa.AddBook();
                    break;
                case 2:
                    enaa.DisplayBook ();
                    break;
                case 3:
                    //enaa.SearchBook ();
                    //break;
                case 4:
                    //enaa.ModifyBook ();
                    //break;
                case 5:
                    //enaa.RemoveBook ();
                    //break;
                case 0:
                    System.out.println("See you later , have a good day");
                    break;
                default:
                    System.out.println("choice invalide !");
            }
        }
        while (choice != 0);


    }
}
