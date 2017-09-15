package jrout.tutorial.hibernate.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="Persons")
public class Person implements Serializable {
    private int personID;
    private String lastName;
    private String firstName;
    private String addresss;
    private String City;

    @Id
    @Column(name = "PersonID",unique = true,nullable = false)
    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    @Column(name = "LastName",nullable = false)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "FirstName",nullable = false)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "Address",nullable = false)
    public String getAddresss() {
        return addresss;
    }

    public void setAddresss(String addresss) {
        this.addresss = addresss;
    }

    @Column(name = "City",nullable = false)
    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    @Override
    public String toString() {
        return "ID ="+personID +" LastName ="+ lastName +" FirstName "+ firstName;
    }
}
