package taskmanager.objects;
import java.util.Date;

public class Task {
    private Integer id;
    private String titre;
    private String description;
    private Date dateEcheance;
    private prioritesTaches priorite;

    public Task(Integer id, String titre, String description, Date dateEcheance, prioritesTaches priorite) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.dateEcheance = dateEcheance;
        this.priorite = priorite;
    }

}
