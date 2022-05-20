package com.prakhar.chefkart.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("User")
public class User {
    @Id
    Integer _id;

    String name;

    String mobileNumber;

    String address;

    Integer postCount;

    public User() {
    }

    public User(Integer _id, String name, String mobileNumber, String address, Integer postCount) {
        this._id = _id;
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.address = address;
        this.postCount = postCount;
    }

    public Integer getId() {
        return _id;
    }

    public void setId(Integer _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPostCount() {
        return postCount;
    }

    public void setPostCount(Integer postCount) {
        this.postCount = postCount;
    }

    @Override
    public String toString() {
        return "User [address=" + address + ", _id=" + _id + ", mobileNumber=" + mobileNumber + ", name=" + name
                + ", postCount=" + postCount + "]";
    }

}
