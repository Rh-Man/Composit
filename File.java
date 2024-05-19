public // Déclare le package Tree, auquel cette classe appartient
package Tree;

// Classe File qui représente un fichier et hérite de FileComponent
public class File extends FileComponent {

    // Constructeur qui initialise le nom du fichier
    public File(String name) {
        super(name);
    }

    // Méthode pour afficher le nom du fichier avec une indentation donnée
    @Override
    public void display(String indent) {
        // Affiche le nom du fichier avec un - devant
        System.out.println(indent + "- " + getName());
    }
} File {
    
}
