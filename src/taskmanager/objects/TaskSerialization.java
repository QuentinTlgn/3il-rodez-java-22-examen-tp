package taskmanager.objects;

import java.io.*;

public class TaskSerialization {

    // Méthode pour sauvegarder les tâches dans un fichier
    public void saveTasksToFile(TaskList taskList, String filePath) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
            outputStream.writeObject(taskList);
        } catch (IOException e) {
            e.printStackTrace();
            // Gestion de l'erreur de sauvegarde des tâches
        }
    }

    // Méthode pour charger les tâches à partir d'un fichier
    public TaskList loadTasksFromFile(String filePath) {
        TaskList taskList = new TaskList();
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filePath))) {
            taskList = (TaskList) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            // Gestion de l'erreur de chargement des tâches
        }
        return taskList;
    }
}