package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends AbstractEntity{

//    @Id
//    @GeneratedValue
//    private int id;

//    private String name;
    @ManyToOne
    private Employer employer;

    @ManyToMany
    private List<Skill> skills = new ArrayList<>();

    public Job() {}

    public void setSkills(List<Skill> skillObjs) { this.skills = skillObjs; }

    public Job(Employer employer) {  //Luke
        this.employer = employer;
    }

    public Employer getEmployer() {  //Luke
        return employer;
    }

    public void setEmployer(Employer employer) {  //Luke
        this.employer = employer;
    }

    public List<Skill> getSkills() {  //Luke
        return skills;
    }

    public void addSkill(Skill skill) { this.skills.add(skill); }
}
