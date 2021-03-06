package com.example.authentication;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

// TODO 演習4 継承するクラスを記述しなさい
public class SampleUser {

    private String fullName;

    private String deptName;

    public SampleUser(String username, String password,
            Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
    }

    public String getFullName() {
        return fullName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    private static final long serialVersionUID = 5869301720811314860L;
}
