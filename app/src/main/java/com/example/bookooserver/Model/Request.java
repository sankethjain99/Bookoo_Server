package com.example.bookooserver.Model;

import java.util.List;

public class Request {
    private String name;
    private String phone;
    private String emailaddress;
    private String status;
    private String total;
    private List<Order> books;

    public Request() {
    }


    public Request(String name, String phone, String emailaddress, String total, List<Order> books) {
        this.name = name;
        this.phone = phone;
        this.emailaddress = emailaddress;
        this.total = total;
        this.books = books;
        this.status = "0";
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmailAddress() {
        return emailaddress;
    }

    public void setEmailAddress(String emailAddress) {
        emailaddress = emailAddress;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public List<Order> getBooks() {
        return books;
    }

    public void setBooks(List<Order> books) {
        this.books = books;
    }
}

