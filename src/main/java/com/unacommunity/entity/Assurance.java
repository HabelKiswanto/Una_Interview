package com.unacommunity.entity;

import jakarta.persistence.*;

@Entity
public class Assurance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;

    @Column(name = "assurance_type")
    private String assuranceType;

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getAssuranceType() { return assuranceType; }
    public void setAssuranceType(String assuranceType) { this.assuranceType = assuranceType; }
}
