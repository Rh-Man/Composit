// Déclare le package Tree, auquel cette classe appartient
package Tree;

// Importe les classes nécessaires pour gérer les collections
import java.util.ArrayList;
import java.util.List;

// Classe Directory qui représente un répertoire et hérite de FileComponent
public class Directory extends FileComponent {
    // Liste pour contenir les enfants (fichiers ou sous-répertoires) de ce répertoire
    private List<FileComponent> children = new ArrayList<>();

    // Constructeur qui initialise le nom du répertoire
    public Directory(String name) {
        super(name);
    }

    // Méthode pour ajouter un enfant (fichier ou sous-répertoire) à ce répertoire
    @Override
    public void add(FileComponent component) {
        children.add(component);
    }

    // Méthode pour supprimer un enfant de ce répertoire
    @Override
    public void remove(FileComponent component) {
        children.remove(component);
    }

    // Méthode pour obtenir un enfant à une position spécifique
    @Override
    public FileComponent getChild(int i) {
        return children.get(i);
    }

    // Méthode pour afficher la structure du répertoire
    @Override
    public void display(String indent) {
        // Affiche le nom du répertoire avec un + devant
        System.out.println(indent + "+ " + getName());
        // Parcourt et affiche chaque enfant avec une indentation supplémentaire
        for (FileComponent component : children) {
            component.display(indent + "  ");
        }
    }
}