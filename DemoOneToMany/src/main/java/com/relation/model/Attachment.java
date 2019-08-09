package com.relation.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.hibernate.annotations.CreationTimestamp;

/**
 *
 * @author rahul
 */
@Entity
@Table(name = "attachment")
public class Attachment  implements Serializable  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "filename", length = 20)
    @NotNull
    private String filename;

    @Column(name = "filesize", length = 10)
    @NotNull
    private String filesize;

    @Column(name = "created")
    @CreationTimestamp
    private LocalDateTime created;

    @Column(name = "attachment")
    @NotNull
    private byte[] attachment;

    public Attachment() {
    }

    public Attachment(String filename, String filesize, LocalDateTime created, byte[] attachment) {
        this.filename = filename;
        this.filesize = filesize;
        this.created = created;
        this.attachment = attachment;
    }
    
    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
