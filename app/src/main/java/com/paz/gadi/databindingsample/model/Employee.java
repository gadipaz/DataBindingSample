package com.paz.gadi.databindingsample.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.google.gson.annotations.SerializedName;

public class Employee extends BaseObservable {
    @SerializedName("name")
    private String name;
    @SerializedName("email")
    private String email;
    @SerializedName("phone")
    private String phone;

    public Employee(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Bindable
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Bindable
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
