import java.util.ArrayList;
import java.util.Scanner;

class student {
    String name;
    String address;
    String idnum;

    void Modifystudent(){
        Scanner input = new Scanner(System.in);
        System.out.println("entrez le nom d'étudiant  :");
        this.name= input.nextLine();
        System.out.println("entrez l'addresse de l'étudiant  :");
        this.address= input.nextLine();
        System.out.println("entrez numéro d'identification de l'étudiant :");
        this.idnum= input.nextLine();

    }
}
