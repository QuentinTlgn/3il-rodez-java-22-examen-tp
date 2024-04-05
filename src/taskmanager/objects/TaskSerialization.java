package taskmanager.objects;

import java.io.*;

import taskmanager.Modele.TaskModele;

public class TaskSerialization {

    // Méthode pour sauvegarder les tâches dans un fichier
    public void saveTasksToFile(TaskModele taskModele, String filePath) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
            outputStream.writeObject(taskModele);
        } catch (IOException e) {
            e.printStackTrace();
            // Gestion de l'erreur de sauvegarde des tâches
        }
    }

    // Méthode pour charger les tâches à partir d'un fichier
    public TaskModele loadTasksFromFile(String filePath) {
        TaskModele taskModele = new TaskModele();
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filePath))) {
            taskModele = (TaskModele) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            // Gestion de l'erreur de chargement des tâches
        }
        return taskModele;
    }
}