// Déclare le package Tree, auquel cette classe appartient
package Tree;

// Classe principale qui contient le point d'entrée du programme
public class TreeCommand {

    // Méthode principale qui sert de point d'entrée à l'application
    public static void main(String[] args) {
        // Crée un répertoire racine nommé "root"
        Directory root = new Directory("root");

        // Crée un sous-répertoire de root nommé "home"
        Directory home = new Directory("home");

        // Crée un sous-répertoire de home nommé "user"
        Directory user = new Directory("user");

        // Crée des fichiers avec les noms spécifiés
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");

        // Crée un sous-répertoire de user nommé "documents"
        Directory documents = new Directory("documents");

        // Crée des fichiers à l'intérieur du répertoire documents
        File file3 = new File("resume.pdf");
        File file4 = new File("coverletter.docx");

        // Ajoute le répertoire home comme sous-répertoire de root
        root.add(home);

        // Ajoute le répertoire user comme sous-répertoire de home
        home.add(user);

        // Ajoute file1 et file2 comme fichiers dans le répertoire user
        user.add(file1);
        user.add(file2);

        // Ajoute le répertoire documents comme sous-répertoire de user
        user.add(documents);

        // Ajoute file3 et file4 comme fichiers dans le répertoire documents
        documents.add(file3);
        documents.add(file4);

        // Affiche la structure de répertoires et de fichiers à partir du répertoire root
        root.display("");
    }
}