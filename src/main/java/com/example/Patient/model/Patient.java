package com.example.Patient.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Patient {
    @Id
    private String id;
    @Column
    private String name;
    @Column
    private String doctor;
    public Patient()
    {

    }
    public Patient(String string, String string2, String string3) {
        id=string;
        name=string2;
        doctor=string3;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getdoctor() {
        return doctor;
    }

    public void setdoctor(String doctor) {
        this.doctor = doctor;
    }
}
