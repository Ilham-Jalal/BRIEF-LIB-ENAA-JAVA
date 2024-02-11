import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

class Library {

        ArrayList<books> ListeLivres = new ArrayList<books>();
        ArrayList<student> ListeStudent = new ArrayList<student>();
        ArrayList<Reservation> ListeReservation = new ArrayList<Reservation>();

        void AddBook (){
            Scanner input = new Scanner(System.in);
            books Book = new books();
            System.out.println("entrer titre :");
            Book.Title= input.nextLine();
            System.out.println("entrer nom de l'auteur :");
            Book.Author= input.nextLine();
            System.out.println("enter ISBN :");
            Book.ISBN= input.nextLine();
            System.out.println("entrer la date du publication :");
            Book.publishDate= input.nextInt();
            ListeLivres.add(Book);
            System.out.println("le livre a été ajouter avec succés");
        }
    void DisplayBook () {
        if (ListeLivres.isEmpty()) {
            System.out.println("Aucun livre trouvé pour l'instant.");
        } else {

            System.out.println("=====La liste des livres=====");
            for (int i = 0; i < ListeLivres.size(); i++) {
                System.out.println("=== Livre id : " + (i + 1) + " ===");
                System.out.println(" Titre :" + ListeLivres.get(i).Title);
                System.out.println(" Auteur :" + ListeLivres.get(i).Author);
                System.out.println(" ISBN :" + ListeLivres.get(i).ISBN);
                System.out.println(" Date de publication :" + ListeLivres.get(i).publishDate);

                if(ListeLivres.get(i).Booked){
                    System.out.println("=== Le livre est reservé par ===");
                    System.out.println("=== Nom :"+ListeLivres.get(i).Owner.name);
                    System.out.println("=== Adresse :"+ListeLivres.get(i).Owner.address);
                    System.out.println("=== Némuro d'identification :"+ListeLivres.get(i).Owner.idnum);
                } else {

                    System.out.println("Le livre est disponible pour reservé");
                }
            }
        }
    }

    void ModifyBookLb(){
        Scanner input = new Scanner(System.in);
        int imodify = -1;
        if (ListeLivres.isEmpty()) {
            System.out.println("     La bibliothèque est vide.     ");
            System.out.println(" Aucun livre trouvé pour l'instant. ");

        } else {

            System.out.println(" Modifier un livre  ");
            System.out.println("Entrez le titre du livre à modifier : ");
            String TitleModify = input.nextLine();
            for (int i =  0; i <ListeLivres.size(); i++) {
                if (ListeLivres.get(i).Title.equals(TitleModify)) {
                    ListeLivres.get(i).ModifyBook();
                    imodify = i;
                }
            }
            if (imodify == -1) {
                System.out.println("    Ce livre n'a pas été trouvé    ");
            } else {
                System.out.println("Le livre a été modifié avec succes!");
            }

        }
    }
    void DeletBook(){
        if (ListeLivres.isEmpty()){
            System.out.println("La biobliothique est vide.");
        }else {
            Scanner input = new Scanner(System.in);
            System.out.println("Entrez le titre de livre à supprimer :");
            String title = input.nextLine();
            for (int i=0 ; i<ListeLivres.size();i++){
                if (ListeLivres.get(i).Title.equals(title)){
                    ListeLivres.remove(i);
                }
            }
            System.out.println("Le livre a été supprimer avec succes!");
        }
    }
    void searchbook(){
        Scanner input = new Scanner(System.in);
        System.out.println("entrer le titre a rechercher ");
        String TITRE =input.nextLine();
        books Book =ListeLivres.stream().filter(studs->studs.Title.equalsIgnoreCase(TITRE)).findFirst().orElse(null);
        if(Book!=null){
            System.out.println("++++ LE LIVRE EST TROUVE ++++");
            System.out.println("le titre est :"+Book.Title );
            System.out.println("l'auteur est :"+Book.Author );
            System.out.println("ISBN est :"+Book.ISBN );
            System.out.println("la date de publication est :"+Book.publishDate );
        }else {
            System.out.println("aucun livre correspond a votre recherche");}
    }
    void Addstudent () {
        Scanner input = new Scanner(System.in);
        student Student = new student();
        System.out.println("entrer le nom de l'etudiant :");
        Student.name = input.nextLine();
        System.out.println("entrer l'adresse de l'étudiant :");
        Student.address = input.nextLine();
        System.out.println("entrer ID de l'etudiant :");
        Student.idnum = input.nextLine();
        System.out.println("l'étudiant a été ajouter avec succés");
        ListeStudent.add(Student);
    }
        void DisplayStudent () {
            if (ListeStudent.isEmpty()) {
                System.out.println("Aucun étudiant trouvé pour l'instant.");

            } else {
                System.out.println("======La liste des étudiant(e)s======");
                for (int i = 0; i < ListeStudent.size(); i++) {
                    System.out.println("+++++Etudiant(e) ID : " + (i + 1) + "+++++");
                    System.out.println(" Nom :" + ListeStudent.get(i).name);
                    System.out.println(" Adresse :" + ListeStudent.get(i).address);
                    System.out.println(" Numéro d'identification :" + ListeStudent.get(i).idnum);

                    if (ListeStudent.get(i).Owned_by.isEmpty()) {
                        System.out.println("  L'étudiant n'a jamais réservé  ");
                    } else {
                        int ireserve = i;
                        System.out.println("-> Livres reservés :");
                        for (int j = 0; j < ListeStudent.get(ireserve).Owned_by.size(); j++) {
                            System.out.println("- Livre " + (j + 1) + " :" + ListeStudent.get(ireserve).Owned_by.get(j).Title);
                        }
                    }
                }
            }
        }

    void ModifystudentLb(){
        Scanner input = new Scanner(System.in);
        int imodify = -1;
        if (ListeStudent.isEmpty()) {
            System.out.println(" Aucun etudiant trouvé pour l'instant. ");

        } else {

            System.out.println(" Modifier un etudiant  ");
            System.out.println("Entrez le nom du livre à modifier : ");
            String TitleModify = input.nextLine();
            for (int i =  0; i <ListeStudent.size(); i++) {
                if (ListeStudent.get(i).name.equals(TitleModify)) {
                    ListeStudent.get(i).Modifystudent();
                    imodify = i;
                }
            }
            if (imodify == -1) {
                System.out.println("    Cet étudiant n'a pas été trouvé    ");
            } else {
                System.out.println("L'etudiant a été modifié avec succes!");
            }

        }
    }
    void Deletstudent(){
        if (ListeStudent.isEmpty()){
            System.out.println("Aucun etudiant trouvé pour l'instant.");
        }else {
            Scanner input = new Scanner(System.in);
            System.out.println("Entrez le nom de l'etudiant à supprimer :");
            String nom = input.nextLine();
            for (int i=0 ; i<ListeLivres.size();i++){
                if (ListeStudent.get(i).name.equals(nom)){
                    ListeStudent.remove(i);
                }
            }
            System.out.println("L'etudiant a été supprimer avec succes!");
        }
    }
    void SearchStudent(){
        Scanner input = new Scanner(System.in);
        System.out.println("entrer le nom de l'etudiant a rechercher ");
        String Nom =input.nextLine();
        student Student =ListeStudent.stream().filter(studs->studs.name.equalsIgnoreCase(Nom)).findFirst().orElse(null);
        if(Student!=null){
            System.out.println("++++ L ETUDIANT EST TROUVE ++++");
            System.out.println("le nom est : "+Student.name );
            System.out.println("l'adresse est : "+Student.address );
            System.out.println("ID est : "+Student.idnum);
        }else {
            System.out.println("aucun etudiant correspond a votre recherche");
        }
    }
    void AddReservation() {
         Scanner input = new Scanner(System.in);
        Reservation POOReservation = new Reservation();
        LocalDate currenteDate = LocalDate.now();
        boolean BookFound = false;
        boolean StudentFound = false;
        if (ListeLivres.isEmpty()){
            System.out.println("   La bibliothèque est vide.    ");
            System.out.println("Aucun livre trouvé pour l'instant.");
        } else if (ListeStudent.isEmpty()){

            System.out.println("   La bibliothèque est vide.     ");
            System.out.println("Aucun étudiant trouvé pour l'instant.");
        } else {
            System.out.println("   Ajouter une réservation    ");
            System.out.println("Entrez le nom d'étudiant qui reserve : ");
            String CheckStudentName = input.nextLine();
            for (student ReserveStudent : ListeStudent){
                if (ReserveStudent.name.equals(CheckStudentName)){
                    StudentFound = true;
                    System.out.println("Entrez Le titre du livre à reserver : ");
                    String CheckBookName = input.nextLine();
                    for (books ReserveBook : ListeLivres){
                        if(ReserveBook.Title.equals(CheckBookName)){
                            BookFound = true;
                            if(!ReserveBook.Booked) {
                                ReserveStudent.Owned_by.add(ReserveBook);
                                POOReservation.BookReserv = ReserveBook;
                                ReserveBook.Owner = ReserveStudent;
                                POOReservation.StudentReserv = ReserveStudent;
                                POOReservation.dateBegin = currenteDate ;
                                System.out.println("Entrez la date fin de réservation (AAAA-MM-JJ) : ");
                                String FormatterDate = input.nextLine();
                                POOReservation.dateEnd = LocalDate.parse(FormatterDate, DateTimeFormatter.ISO_DATE);
                                ListeReservation.add(POOReservation);
                                System.out.println("La réservation effuectée avec succes");
                                ReserveBook.Booked = true;
                            } else {
                                System.out.println("=====Le livre est deja reservé=====");
                            }
                            break;
                        }
                    }
                    if (!BookFound){
                        System.out.println("=====Le livre n'existe pas!=====");
                    }
                    break;
                }
            }
            if(!StudentFound){
                System.out.println("=====L'étudiant n'existe pas!=====");
            }

        }

    }
    void DisplayReservations() {
        if (ListeReservation.isEmpty()) {

            System.out.println(" Aucune réservation pour l'instant ! ");
        } else {
            System.out.println("=====La liste des réservations=====");
            for (int i = 0; i < ListeReservation.size(); i++) {
                System.out.println("+++++ Réservation ID : " + (i + 1) + "+++++");
                System.out.println(" Nom d'etudiant : " + ListeReservation.get(i).StudentReserv.name);
                System.out.println(" Numéro d'identification : " + ListeReservation.get(i).StudentReserv.idnum);

                System.out.println(" Livre N° : " + (i + 1));
                System.out.println(" Titre de livre réservé : " + ListeReservation.get(i).BookReserv.Title);
                System.out.println(" Date début de réservation : " + ListeReservation.get(i).dateBegin);
                System.out.println(" Date fin de réservation : " + ListeReservation.get(i).dateEnd);
            }
        }
    }
    void ReturnReservation() {
            Scanner scanner = new Scanner(System.in);
        if (ListeReservation.isEmpty()) {

            System.out.println(" Aucune réservation pour l'instant ! ");

        } else {
            System.out.println("   Annuler une réservations  ");
            System.out.println("Entrez le nom de l'étudiant :");
            String returnStudent = scanner.nextLine();
            boolean foundReservation = false;
            for (int i = 0; i <ListeReservation.size(); i++) {
                if (ListeReservation.get(i).StudentReserv.name.equals(returnStudent)) {
                    foundReservation = true;
                    System.out.println(" Livres réservés par " + returnStudent + " :");
                    for (Reservation  ReturnReservation : ListeReservation) {
                        System.out.println("- " + ReturnReservation.BookReserv.Title);
                    }
                    System.out.println("Entrez le titre du livre à annuler :");
                    String returnBookTitle = scanner.nextLine();
                    for (books ReturnBook : ListeLivres) {
                        if (ReturnBook.Title.equals(returnBookTitle)) {
                            ReturnBook.Booked = false;
                            ReturnBook.Owner = null;
                            for (student ReturnStudent : ListeStudent){
                                if(ReturnStudent.name.equals(returnStudent)){
                                    ReturnStudent.Owned_by.remove(ReturnBook);
                                }
                            }
                            ListeReservation.remove(i);
                            System.out.println(" L'annulation effuectée avec succes ");
                            break;
                        }
                    }
                }
            }
            if (!foundReservation) {
                System.out.println("Aucune réservation trouvée !");
            }
        }
    }




}

