package com.school;

import java.util.Date;

public class Member {
    public String name;
    public Date birtDate;
    public String address;
    public int id;
    private String role;

    public Member(String _role) {
        role = _role;
    }
}
