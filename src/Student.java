import java.util.ArrayList;
import java.util.Scanner;

class student {
    String name;
    String address;
    String idnum;
    ArrayList<books> Owned_by = new ArrayList<books>();
    void Modifystudent(){
        Scanner input = new Scanner(System.in);
        System.out.println("entrez le nom d'etudiant  :");
        this.name= input.nextLine();
        System.out.println("entrez l'addresse de l'etudiant  :");
        this.address= input.nextLine();
        System.out.println("entrez id de l'etudiant :");
        this.idnum= input.nextLine();

    }
}
