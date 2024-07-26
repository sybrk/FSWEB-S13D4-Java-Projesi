package com.school;

import java.util.Date;

public class Teacher extends Member{

    public Teacher(String _name, Date _birtdate, String _address) {
        super(_name, _birtdate, _address);
        this.setRole(MemberTypes.Teacher);
    }

    @Override
    public String getAddress() {
        return "gizli";
    }

    //Overloaded
    public String getAddress(String city, String country) {
        return getAddress()+ " " + city+" "+ country;
    }

    //Overloaded
    public String getAddress(String city, String country, String district) {
        return getAddress(city,country) + " "+ district;
    }
}
