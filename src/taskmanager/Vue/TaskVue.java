package taskmanager.Vue;

import javax.swing.*;

import taskmanager.Modele.TaskModele;
import taskmanager.objects.prioritesTaches;

import java.awt.*;


public class TaskVue extends JPanel {
    private TaskModele modele;

    private JLabel newTaskLabel;
    private JTextArea newTaskTitle;
    private JTextArea newTaskDescription;
    private JComboBox newTaskPrioriteSelector;
    private prioritesTaches prioritesTaches;
    private Container c;

    public TaskVue(TaskModele modele) {
        this.modele = modele;

        setBounds(300,90,900,600);
        setBackground(Color.WHITE);
        
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);

        newTaskLabel = new JLabel("Ajouter une tâche");
        add(newTaskLabel, gbc);

        newTaskTitle = new JTextArea();
        add(newTaskTitle, gbc);

        newTaskDescription = new JTextArea();
        add(newTaskDescription, gbc);
        
        newTaskPrioriteSelector = new JComboBox<prioritesTaches>();

        // Définition de la taille fixe
        setPreferredSize(new Dimension(800, 350)); // Largeur: 800 pixels, Hauteur: 300 pixels
    }

    public JLabel getNewTaskLabel() {
        return newTaskLabel;
    }

    public JTextArea getNewTaskTitle() {
        return newTaskTitle;
    }

    public JTextArea getNewTaskDescription() {
        return newTaskDescription;
    }

    public JComboBox getNewTaskPrioriteSelector() {
        return newTaskPrioriteSelector;
    }

    public prioritesTaches getPrioritesTaches() {
        return prioritesTaches;
    }

    
}