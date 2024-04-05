package taskmanager;

import javax.swing.*;

import taskmanager.Controleur.TaskControleur;
import taskmanager.Modele.TaskModele;
import taskmanager.Vue.TaskVue;

public class App {
    public static void main(String[] args) {
        // Création d'une instance de modèle Pendu

        TaskModele modele = new TaskModele();

        // Création de l'instance de la vue PenduVue
        TaskVue vue = new TaskVue(modele);

        // Création de l'instance du contrôleur PenduControleur
        TaskControleur controleur = new TaskControleur(modele, vue);

        // Création de la fenêtre Swing pour afficher la vue
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI(vue);
            }
        });
    }

    private static void createAndShowGUI(TaskVue vue) {
        // Création de la fenêtre Swing pour afficher la vue
        JFrame frame = new JFrame("Gestionnaire de tâches absolument pas fini");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(vue);
        frame.pack();
        frame.setVisible(true);
    }
}
