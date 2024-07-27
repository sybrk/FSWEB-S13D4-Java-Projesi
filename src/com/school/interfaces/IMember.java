package com.school.interfaces;

import com.school.MemberTypes;

public interface IMember {

    public int getId();
    public String getName();
    public void setRole(MemberTypes _role);
    public String getAddress();
}
