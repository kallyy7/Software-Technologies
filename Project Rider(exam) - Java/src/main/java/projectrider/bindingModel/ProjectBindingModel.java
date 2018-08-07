package projectrider.bindingModel;

public class ProjectBindingModel {

    // TODO

    private Integer id;

    private String title;

    private String description;

    private String budget;

    public ProjectBindingModel() {
    }

    public ProjectBindingModel(Integer id, String title, String description, String budget) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.budget = budget;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }
}
