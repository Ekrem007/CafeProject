package Entities;

import Abstract.IEntity;

public  class Customer implements IEntity {
    private int ıd;
    private String name;
    private String surname;
    private String dateOfBirth;
    private String nationaltyId;

    public Customer(int ıd, String name, String surname, String dateOfBirth, String nationaltyId) {
        this.ıd = ıd;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.nationaltyId = nationaltyId;
    }
    public Customer(){

    }

    public int getId() {
        return ıd;
    }

    public void setId(int ıd) {
        this.ıd = ıd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth() {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationaltyId() {
        return nationaltyId;
    }

    public void setNationaltyId(String nationaltyId) {
        this.nationaltyId = nationaltyId;
    }
}
