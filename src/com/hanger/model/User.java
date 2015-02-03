package com.hanger.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by b.potapskiy on 03.02.15.
 */
@Entity
@Table(name = "users", schema = "", catalog = "hanger")
public class User implements Serializable {

    private String id;
    private String first_name;
    private String last_name;
    private String primary_contact;
    private String sex;

    public User() {}


    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "first_name", nullable = false, insertable = true, updatable = true, length = 45)
    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    @Basic
    @Column(name = "last_name", nullable = false, insertable = true, updatable = true, length = 45)
    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    @Basic
    @Column(name = "primary_contact", nullable = false, insertable = true, updatable = true, length = 45)
    public String getPrimary_contact() {
        return primary_contact;
    }

    public void setPrimary_contact(String primary_contact) {
        this.primary_contact = primary_contact;
    }

    @Basic
    @Column(name = "sex", nullable = false, insertable = true, updatable = true, length = 10)
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
