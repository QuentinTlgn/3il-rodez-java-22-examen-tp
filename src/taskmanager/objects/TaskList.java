package taskmanager.objects;

import java.util.List;
import taskmanager.interfaces.taskManager;

public class TaskList implements taskManager{
    
    private List<Task> taskList;

    @Override
    public void ajouterTache(Task tache) {
        taskList.add(tache);
    }

    @Override
    public void modifierTache(Task tache) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modifierTache'");
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
