package com.mycompany.model;

import javax.persistence.*;
import java.io.Serializable;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;

/**
 *
 * @author rahul
 */
@Entity
@Table(name = "helloworld")
public class HelloWorld implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "message")
    private String message;

    public HelloWorld() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

}
