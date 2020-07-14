package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @NotBlank(message = "description is required") //Luke
    @Size(min = 2, max = 100, message = "Description must be between 2 and 100 characters")
    private String description;

    @ManyToMany(mappedBy = "skills")
    private final List<Job> jobs = new ArrayList<>();

    public Skill() {}

    public Skill(String description) { this.description = description; }

    @Override
    public void setSkills(List<Skill> skillObjs) {}

    public List<Job> getJobs() {
        return jobs;
    }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }
}