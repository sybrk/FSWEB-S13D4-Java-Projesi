package com.school;

import java.util.Date;

public class Member {
    public String name;
    public Date birtDate;
    public String address;
    public int id;
    private MemberTypes role;

    public Member(MemberTypes _role) {
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
