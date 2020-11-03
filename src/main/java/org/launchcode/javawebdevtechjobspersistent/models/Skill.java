package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.Size;
import javax.xml.stream.Location;

@Entity
public class Skill extends AbstractEntity {

    @Size(max = 200, message = "Name must be between 3 and 200 characters")
    private Skill skill;

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public Skill() {
    }
}