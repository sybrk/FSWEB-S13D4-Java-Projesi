package com.school;

public class Teacher extends Member{

    public Teacher() {
        super(MemberTypes.Teacher);
    }

    @Override
    public String getAddress() {
        return "";
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
