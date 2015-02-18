package com.hanger.model;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by b.potapskiy on 03.02.15.
 */
@Entity
@Table(name = "users", schema = "", catalog = "hanger")
@JsonIgnoreProperties(ignoreUnknown = true)
public class User implements Serializable {

    @JsonProperty("id")
    private String id;
    @JsonProperty("first_name")
    private String first_name;
    @JsonProperty("last_name")
    private String last_name;
    @JsonProperty("primary_contact")
    private String primary_contact;
    @JsonProperty("sex")
    private String sex = "undefined";

    public User() {}

    public User(String id, String first_name, String last_name, String primary_contact, String sex) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.primary_contact = primary_contact;
        this.sex = sex;
    }

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

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", primary_contact='" + primary_contact + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
