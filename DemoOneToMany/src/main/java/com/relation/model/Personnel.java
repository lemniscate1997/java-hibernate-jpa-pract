package com.relation.model;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;

/**
 *
 * @author rahul
 */
@Entity
@Table(name = "personnel")
public class Personnel  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", length = 60)
    @NotNull
    private String name;

    @Column(name = "qualificationlevel")
    @NotNull
    private QualificationLevel qualificationlevel;

    @Column(name = "phone", length = 10)
    @NotNull
    @Min(value = 10)
    @Pattern(regexp = "[9876]{1}[0-9]{9}")
    private String phone;

    public Personnel() {
    }

    public Personnel(String name, QualificationLevel qualificationlevel, String phone) {
        this.name = name;
        this.qualificationlevel = qualificationlevel;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
