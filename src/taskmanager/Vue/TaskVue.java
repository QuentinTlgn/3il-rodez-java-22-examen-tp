package taskmanager.Vue;

import javax.swing.*;

import taskmanager.Modele.TaskModele;

import java.awt.*;


public class TaskVue extends JPanel {
    private TaskModele modele;
    private JTextField guessField;
    private JLabel motLabel;
    private JButton submitButton;
    private JLabel messageLabel;
    private JLabel historyLabel;
    private JButton newGameButton;

    public TaskVue(TaskModele modele) {
        this.modele = modele;

        setBackground(Color.WHITE);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);



        // Création du label pour afficher un message en haut de la fenêtre
        messageLabel = new JLabel("Faites votre premier guess");
        add(messageLabel, gbc);

        // Création du champ de saisie
        gbc.gridy++;
        guessField = new JTextField(10);
        add(guessField, gbc);

        // Création du bouton pour soumettre une lettre
        gbc.gridy++;
        submitButton = new JButton("Soumettre");
        add(submitButton, gbc);

        // Création du label pour afficher le mot
        gbc.gridy++;
        motLabel = new JLabel("");
        add(motLabel, gbc);

        // Création du label pour afficher l'historique
        gbc.gridy++;
        historyLabel = new JLabel("Historique : ");
        add(historyLabel, gbc);

        // Création du bouton pour commencer une nouvelle partie
        gbc.gridy++;
        newGameButton = new JButton("Nouvelle partie");
        newGameButton.setVisible(false);
        add(newGameButton, gbc);

        // Définition de la taille fixe
        setPreferredSize(new Dimension(800, 350)); // Largeur: 800 pixels, Hauteur: 300 pixels
    }

    public JButton getSubmitButton() {
        return submitButton;
    }

    // Méthode pour récupérer le texte entré dans le champ de saisie
    public String getEnteredText() {
        return guessField.getText();
    }

    // Méthode pour définir le texte à afficher dans le label
    public void setMot(String text) {
        motLabel.setText(text);
        repaint();
    }

    public void setMessage(String text) {
        messageLabel.setText(text);
        repaint();
    }

    public JTextField getGuessField() {
        return guessField;
    }

    public void disableAllInputs() {
        submitButton.setEnabled(false);
        guessField.setEnabled(false);
    }

    public JLabel getHistoryLabel() {
        return historyLabel;
    }

    public void setHistoryLabel(String history) {
        historyLabel.setText("Historique : [" + history + "]");
    }

    public JButton getNewGameButton() {
        return newGameButton;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        update(g);
    }

    public void update(){}
}