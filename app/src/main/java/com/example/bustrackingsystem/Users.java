package com.example.bustrackingsystem;

public class Users {

    public String name;
    public String email;
    public String age;
    public String contNO;
    public String dob;
    public String postal;
    public String track;
    public String feedback;

    public Users() {
    }

    public Users(String name, String email, String age, String contNO, String dob, String postal, String track, String feedback) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.contNO = contNO;
        this.dob = dob;
        this.postal = postal;
        this.track = track;
        this.feedback = feedback;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getContNO() {
        return contNO;
    }

    public void setContNO(String contNO) {
        this.contNO = contNO;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    public String getTrack() {
        return track;
    }

    public void setTrack(String track) {
        this.track = track;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String toString(){

        return this.name+"\tThis is Your Information"+"\nName:\t"+name+"\n Email:\t"+email+" \nPhone No:\t"+contNO+" \n Track Purpose:\t"+ track+"\n Age:\t" +age+"\n Adrress :\t"+postal;
    }
}