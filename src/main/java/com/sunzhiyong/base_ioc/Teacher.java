package com.sunzhiyong.base_ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component(value = "teacher")
public class Teacher {
    private String name;
    private String address;
    private String phone;

    @Autowired
    private Dog dog;

    public List<String> getSchools() {
        return schools;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", dog=" + dog +
                ", schools=" + schools +
                '}';
    }

    public void setSchools(List<String> schools) {
        this.schools = schools;
    }

    private List<String> schools;

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public Teacher() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
