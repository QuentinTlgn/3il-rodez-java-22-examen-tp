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

    public Integer getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public String getDescription() {
        return description;
    }

    public Date getDateEcheance() {
        return dateEcheance;
    }

    public prioritesTaches getPriorite() {
        return priorite;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDateEcheance(Date dateEcheance) {
        this.dateEcheance = dateEcheance;
    }

    public void setPriorite(prioritesTaches priorite) {
        this.priorite = priorite;
    }

}
