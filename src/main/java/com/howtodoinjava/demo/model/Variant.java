package com.howtodoinjava.demo.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "VARIANT")
public class Variant implements Serializable {
    private static final long serialVersionUID=-23423742355456l;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Variants{" +
                "id=" + id +
                ", variant='" + name + '\'' +
                '}';
    }
}
