package com.school.base;

import com.school.MemberTypes;
import com.school.interfaces.IMember;

import java.util.Date;

public class Member implements IMember {
    private String name;
    private Date birtDate;
    private String address;
    private int id;
    private static int nextId = 1;
    private MemberTypes role;

    public Member(String _name, Date _birtdate, String _address) {
        id = nextId++;
        name = _name;
        birtDate = _birtdate;
        address = _address;
    }


    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setRole(MemberTypes _role) {
        role = _role;
    }
    public String getAddress(){
        return address;
    }

    //Overloaded
    public String getAddress(String city){
        return address +" "+ city;
    }
}
