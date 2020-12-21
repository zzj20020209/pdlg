package com.zzj.vo;

public class Employee {
    int id;
    String ename;
    String sex;
    String age;
    String username;
    String password;
    String phone;
    String idCard;
    String address;
    int state;

    public Employee(){

    }

    public Employee(int id, String ename, String sex, String age, String username, String password, String phone, String idCard, String address, int state) {
        this.id = id;
        this.ename = ename;
        this.sex = sex;
        this.age = age;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.idCard = idCard;
        this.address = address;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "YgVo{" +
                "id=" + id +
                ", ename='" + ename + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", idCard='" + idCard + '\'' +
                ", address='" + address + '\'' +
                ", state=" + state +
                '}';
    }
}
