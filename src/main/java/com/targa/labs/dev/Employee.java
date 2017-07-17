/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.targa.labs.dev;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Wayne.Hu
 */
@Entity
public class Employee implements Serializable {
@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
 
    protected Employee() {
    }
 
    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
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
 
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Employee employee = (Employee) o;
        return Objects.equals(getName(), employee.getName())
                && Objects.equals(getEmail(), employee.getEmail());
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getEmail());
    }
 
    @Override
    public String toString() {
        return "Employee{id=[" + id +"], name=[" + name + "], email=[" + email + "]}";
    }
    
}
