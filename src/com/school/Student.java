package com.school;

import com.school.base.Member;

import java.util.Date;

public class Student extends Member {

    public Student(String _name, Date _birtdate, String _address) {
        super(_name, _birtdate, _address);
        this.setRole(MemberTypes.Student);
    }
}
