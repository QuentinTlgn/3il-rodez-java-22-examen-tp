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
        //TODO A faire
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //TODO A faire
    }
}
