package com.relation.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;

/**
 *
 * @author rahul
 */
@Entity
@Table(name = "education")
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "degreeType", length = 20)
    @NotNull
    private String degreeType;

    @Column(name = "degreeDescription", length = 40)
    private String degreeDescription;

    @Column(name = "graduationYear", length = 4)
    @NotNull
    @Min(value = 4)
    private String graduationYear;

    @Column(name = "school", length = 25)
    @NotNull
    private String school;

    @OneToOne(mappedBy = "education")
    private Student student;

    public Education() {
    }

    public Education(String degreeType, String degreeDescription, String graduationYear, String school) {
        this.degreeType = degreeType;
        this.degreeDescription = degreeDescription;
        this.graduationYear = graduationYear;
        this.school = school;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDegreeType() {
        return degreeType;
    }

    public void setDegreeType(String degreeType) {
        this.degreeType = degreeType;
    }

    public String getDegreeDescription() {
        return degreeDescription;
    }

    public void setDegreeDescription(String degreeDescription) {
        this.degreeDescription = degreeDescription;
    }

    public String getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(String graduationYear) {
        this.graduationYear = graduationYear;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
