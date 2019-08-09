package com.mycompany.model;

import com.sun.istack.internal.NotNull;
import javax.persistence.*;
import java.io.Serializable;

/**
 *
 * @author rahul
 */
@Entity
@Table(
        name = "UserProfile",
        uniqueConstraints = {
            @UniqueConstraint(columnNames = {"name", "phone"})
        }
)

public class UserProfile implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name", length = 15)
    @NotNull
    private String name;

    @Column(name = "email", length = 50)
    @NotNull
    private String email;

    @Column(name = "phone", length = 10)
    @NotNull
    private String phone;

    public UserProfile() {
    }

    public UserProfile(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "UserProfile{" + "id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + '}';
    }

}
