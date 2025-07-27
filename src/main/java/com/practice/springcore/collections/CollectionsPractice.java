package com.practice.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsPractice {
    private String empName;
    private List<String> empPhones;
    private Set<String> addresses;
    private Map<String,String> courses;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public List<String> getEmpPhones() {
        return empPhones;
    }

    public void setEmpPhones(List<String> empPhones) {
        this.empPhones = empPhones;
    }

    public Set<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<String> addresses) {
        this.addresses = addresses;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "CollectionsPractice{" +
                "empName='" + empName + '\'' +
                ", empPhones=" + empPhones +
                ", addresses=" + addresses +
                ", courses=" + courses +
                '}';
    }
}
