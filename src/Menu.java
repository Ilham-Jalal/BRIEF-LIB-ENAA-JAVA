import java.util.Scanner;
import java.util.WeakHashMap;

class Menu {
    Library enaa = new Library();
     void interfaceMENU(){
         Scanner scanner = new Scanner(System.in);
        int choixPrincipal=0;
         System.out.println("+++++MENU PRINCIPALE+++++");
         System.out.println("1-les livres");
         System.out.println("2-les étudiant(e)s");
         System.out.println("3-Résurvation");
         System.out.println("4-Quitter");
         System.out.println("entrer votre choix :");
         choixPrincipal = scanner.nextInt();
         switch(choixPrincipal){
             case 1:
                 interfacelivrres();
                 break;
             case 2:
                 interfaceEtudent();
                 break;
             case 3:
                 interfaceReserv();
                 break;
             case 4:
                 System.out.println("Au revoir !");
                 break;
             default:
                 System.out.println("choix invalid .");
         }
         while (choixPrincipal!=4);
     }
    void interfacelivrres(){
        int choix;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("******MENU******");
            System.out.println("1-ajouter livre ");
            System.out.println("2-afficher les livres ");
            System.out.println("3-modifier un livre ");
            System.out.println("4-supprimer un livre ");
            System.out.println("5-rechercher un livre");
            System.out.println("6-retour a l'interface principale !");
            System.out.print("entrer votre choix: ");
            choix = input.nextInt();

            switch(choix){
                case 1:
                   enaa.AddBook();
                    break;
                case 2:
                    enaa.DisplayBook ();
                    break;
                case 3:
                    enaa.ModifyBookLb ();
                    break;

                case 4:
                    enaa.DeletBook ();
                    break;
                case 5:
                    enaa.searchbook();
                    break;
                case 6:
                    interfaceMENU();
                    break;
                default:
                    System.out.println("choix invalide !");
            }
        }
        while (choix != 0);
    }
    void interfaceEtudent(){
        int choix;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("******MENU******");
            System.out.println("1-ajouter étudiant ");
            System.out.println("2-afficher étudiant ");
            System.out.println("3-modifier un étudiant ");
            System.out.println("4-supprimer un étudiant ");
            System.out.println("5-rechercher un étudiant");
            System.out.println("6-retourer a l'interface principal");
            System.out.print("entrer un choix: ");
            choix = input.nextInt();

            switch(choix){
                case 1:
                    enaa.Addstudent();
                    break;
                case 2:
                    enaa.DisplayStudent();
                    break;
                case 3:
                    enaa.ModifystudentLb();
                    break;

                case 4:
                    enaa.Deletstudent();
                    break;
                case 5:
                    enaa.SearchStudent();
                    break;
                case 6:
                    interfaceMENU();
                    break;
                default:
                    System.out.println("choix invalide !");
            }
        }
        while (choix != 6);
    }
    void interfaceReserv (){
        int Choix = 0;
        do {
            System.out.println("++++Interface de Réservations++++");
            System.out.println("1- Ajouter une réservation.");
            System.out.println("2- Afficher les réservations.");
            System.out.println("3- Annuler une réservation.");
            System.out.println("4- Returner à l'interface principale .");
            System.out.print("  Entrez un choix : ");
            Choix = new Scanner(System.in).nextInt();
            switch (Choix) {
                case 1:
                    enaa.AddReservation();
                    break;
                case 2:
                    enaa.DisplayReservations();
                    break;
                case 3:
                    enaa.ReturnReservation();
                    break;
                case 4 :
                    interfaceMENU();
                    break;
                default:
                    System.out.println(" choix invalid !  ");
                    break;
            }
        }while (Choix != 4);
    }
}
