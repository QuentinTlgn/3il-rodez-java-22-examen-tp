package taskmanager.Controleur;


import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;

import taskmanager.Modele.TaskModele;
import taskmanager.Vue.TaskVue;

public class TaskControleur implements ActionListener {
    private TaskModele modele;
    private TaskVue vue;

    public TaskControleur(TaskModele modele, TaskVue vue) {
        this.modele = modele;
        this.vue = vue;

        //vue.setMot(modele.getMot());

        // Ajout de l'action listener au bouton
        vue.getSubmitButton().addActionListener(this);

        // Ajout de l'action listener au bouton "Nouvelle partie"
        vue.getNewGameButton().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vue.getSubmitButton()) {
        }
        else if (e.getSource() == vue.getNewGameButton()) {

        }
    }
}
