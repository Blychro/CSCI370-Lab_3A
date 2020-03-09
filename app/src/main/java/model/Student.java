package com.example.advancedadapter;

public class Student {
    private String first;
    private String last;
    private String major;

    public Student (String first, String last, String major) {
        this.first = first;
        this.last = last;
        this.major = major;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    public String getMajor() {
        return major;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}