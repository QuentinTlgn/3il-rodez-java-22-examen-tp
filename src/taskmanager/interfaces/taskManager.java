package taskmanager.interfaces;

import java.util.List;

import taskmanager.objects.Task;

public interface taskManager {
    
    public void ajouterTache(Task tache);

    public void modifierTache(Task tache);

    public void supprimerTache(Task tache);

    public List<Task> getTaches();

}
