package com.emailvalidationapi.dto;

import javax.persistence.*;

@Entity
@Table(name = "Email_Storage")
public class EmailStorage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String personID;

    @Column(name="LastName")
    String lastName;
    @Column(name="FirstName")
    String firstName;
    @Column(name="EmaiID")
    String emailID;
    @Column(name="UpdatedTimeStamp")
    String updatedTimeStamp;


    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getUpdatedTimeStamp() {
        return updatedTimeStamp;
    }

    public void setUpdatedTimeStamp(String updatedTimeStamp) {
        this.updatedTimeStamp = updatedTimeStamp;
    }
}
