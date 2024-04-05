package taskmanager.Modele;

import java.util.Date;
import java.util.List;

import taskmanager.interfaces.taskManager;
import taskmanager.objects.Task;
import taskmanager.objects.prioritesTaches;

public class TaskModele implements taskManager{
    
    private List<Task> taskList;

    @Override
    public void ajouterTache(Task tache) {
        taskList.add(tache);
    }

    @Override
    public void modifierTache(Task tache, String titre, String description, Date dateEcheance ,prioritesTaches priorite) {
        tache = taskList.get(taskList.indexOf(tache));
        tache.setTitre(titre);
        tache.setDescription(description);
        tache.setDateEcheance(dateEcheance);
        tache.setPriorite(priorite);
    }

    @Override
    public void supprimerTache(Task tache) {

        taskList.remove(taskList.indexOf(tache));
    }

    @Override
    public List<Task> getTaches() {
        return taskList;
    }

}
