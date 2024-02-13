
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

class Library {

        ArrayList<books> ListeLivres = new ArrayList<books>();
        ArrayList<student> ListeStudent = new ArrayList<student>();


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


            }
        }
    }

    void ModifyBookLb(){
        Scanner input = new Scanner(System.in);
        int imodify = -1;
        if (ListeLivres.isEmpty()) {
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
    void searchBook() {
        Scanner input = new Scanner(System.in);
        System.out.println("Entrer le titre de livre à rechercher: ");
        String titre = input.nextLine();
          for (books book : ListeLivres) { // تحقق من الكتب التابعة لكل طالب
                if (book.Title.equalsIgnoreCase(titre)) {
                    System.out.println("++++ LIVRE TROUVÉ ++++");
                    System.out.println("Le titre: " + book.Title);
                    System.out.println("L'auteur: " + book.Author);
                    System.out.println("ISBN: " + book.ISBN);
                    System.out.println("La date de publication: " + book.publishDate);
                    break;
                }
                else{
                    System.out.println("Aucun livre ne correspond à votre recherche.");
                }
            }
    }

    void Addstudent () {
        Scanner input = new Scanner(System.in);
        student Student = new student();
        System.out.println("entrer le nom de l'etudiant :");
        Student.name = input.nextLine();
        System.out.println("entrer l'adresse de l'étudiant :");
        Student.address = input.nextLine();
        System.out.println("entrer numéro d'identification de l'etudiant :");
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
            System.out.println("Entrez le nom du etudiant à modifier : ");
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
                    break;
                }
                else {System.out.println("L'etudiant a été supprimer avec succes!");
                    }
            }

        }
    }
    void searchStudent() {
        Scanner input = new Scanner(System.in);
        System.out.println("Entrer le nom de l'étudiant à rechercher: ");
        String nom = input.nextLine();

        for (student student : ListeStudent) {
            if (student.name.equalsIgnoreCase(nom)) {
                System.out.println("++++ L'ÉTUDIANT EST TROUVÉ ++++");
                System.out.println("Nom: " + student.name);
                System.out.println("Adresse: " + student.address);
                System.out.println("Numéro d'identification: " + student.idnum);
                 break;
            }
            else {
                System.out.println("Aucun étudiant ne correspond à votre recherche.");
            }
            }
        }



    void AddReservation() {
        Scanner input = new Scanner(System.in);
        books Book = new books();
        if (ListeLivres.isEmpty()) {
            System.out.println("Aucun livre trouvé pour l'instant.");
        } else {
            System.out.println("====Ajouter une réservation====");
            System.out.println("Entrez le nom d'étudiant qui reserve : ");
            String StudentName = input.nextLine();
            System.out.println("entrez le titre du livre à reserver");
            String title = input.nextLine();
            for (int i = 0; i < ListeLivres.size(); i++) {
                if (ListeLivres.get(i).Title.equals(title)) {
                    if (Book.Owner != null) {
                        System.out.println("Le livre  a été reserver par " + StudentName);
                    } else {
                        System.out.println("Le livre n'a pas encore été emprunté");
                    }
                }
            }
        }
    }
}

