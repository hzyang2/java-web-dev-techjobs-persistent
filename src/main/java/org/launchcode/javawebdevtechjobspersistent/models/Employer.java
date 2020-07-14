package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message = "location is required")
    @Size(min = 2, max = 50, message = "Location must be between 2 and 50 characters")
    private String location;

    @OneToMany
    @JoinColumn(name = "employer_id")
    private final List<Job> jobs = new ArrayList<>();

    public Employer() {}

    public Employer(String location) { this.location = location; }

    @Override
    public void setSkills(List<Skill> skillObjs) {}

    public List<Job> getJobs() { return jobs;}

    public String getLocation() { return location; }

    public void setLocation(String location) { this.location = location; }
}
