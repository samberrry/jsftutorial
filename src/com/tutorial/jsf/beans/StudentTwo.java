package com.tutorial.jsf.beans;

import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
public class StudentTwo {
    private String firstName;
    private String lastName;
    private String country;
    List<String> countryOptions;

    public StudentTwo() {
        countryOptions = new ArrayList<>();

        countryOptions.add("Iran");
        countryOptions.add("Iraq");
        countryOptions.add("United States");
        countryOptions.add("Turkey");
        countryOptions.add("United Kingdom");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<String> getCountryOptions() {
        return countryOptions;
    }

    public void setCountryOptions(List<String> countryOptions) {
        this.countryOptions = countryOptions;
    }
}
