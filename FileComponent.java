// Déclare le package Tree, auquel cette classe appartient
package Tree;

// Importe les classes nécessaires pour gérer les collections
import java.util.ArrayList;
import java.util.List;

// Classe abstraite FileComponent qui sert de base pour les fichiers et les répertoires
abstract class FileComponent {
    // Attribut protégé pour stocker le nom du fichier ou du répertoire
    protected String name;

    // Constructeur qui initialise le nom du composant
    public FileComponent(String name) {
        this.name = name;
    }

    // Méthode pour ajouter un enfant au composant
    // Lève une exception par défaut car elle est généralement implémentée dans les sous-classes
    public void add(FileComponent component) {
        throw new UnsupportedOperationException();
    }

    // Méthode pour supprimer un enfant du composant
    // Lève une exception par défaut car elle est généralement implémentée dans les sous-classes
    public void remove(FileComponent component) {
        throw new UnsupportedOperationException();
    }

    // Méthode pour obtenir un enfant à une position spécifique
    // Lève une exception par défaut car elle est généralement implémentée dans les sous-classes
    public FileComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    // Méthode pour obtenir le nom du composant
    public String getName() {
        return name;
    }

    // Méthode abstraite pour afficher la structure du composant avec une indentation donnée
    public abstract void display(String indent);
}