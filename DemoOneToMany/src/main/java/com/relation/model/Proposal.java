package com.relation.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.Type;

/**
 *
 * @author rahul
 */
@Entity
@Table(name = "proposal")
@SequenceGenerator(name="proposal_attachment_id_seq")
@SequenceGenerator(name="proposal_personnel_id_seq")
public class Proposal  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "title", length = 100)
    @NotNull
    private String title;

    @Column(name = "comment", length = 1000)
    @NotNull
    private String comment;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @CollectionId(
        columns = @Column(name="proposal_personnel_id"), 
        type=@Type(type="long"), 
        generator = "proposal_personnel_id_seq"
    )
//    @JoinColumn(name = "proposal_id")
    private List<Personnel> personnels;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @Column(unique = true)
    @CollectionId(
        columns = @Column(name="proposal_attachment_id"), 
        type=@Type(type="long"), 
        generator = "proposal_attachment_id_seq"
    )
//    @JoinColumn(name = "proposal_id")
    private List<Attachment> attachments;

    public Proposal() {
    }

    public Proposal(String title, String comment, List<Personnel> personnels, List<Attachment> attachments) {
        this.title = title;
        this.comment = comment;
        this.personnels = personnels;
        this.attachments = attachments;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    
    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
