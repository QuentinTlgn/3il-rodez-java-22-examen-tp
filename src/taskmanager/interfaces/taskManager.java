package taskmanager.interfaces;

import java.util.Date;
import java.util.List;

import taskmanager.objects.Task;
import taskmanager.objects.prioritesTaches;

public interface taskManager {
    
    public void ajouterTache(Task tache);

    public void modifierTache(Task tache, String titre, String description, Date dateEcheance ,prioritesTaches priorite);

    public void supprimerTache(Task tache);

    public List<Task> getTaches();

}
