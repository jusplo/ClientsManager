package com.example.justyna.clientsmanager.data;

/**
 * Created by Justyna on 10.07.2017.
 */

public class User {

    private String title;
    private String password;
    private String name;
    private String surname;
    private String birthday;
    private String listUsersGroups;

    public User(String title, String password, String name, String surname, String birthday, String listUsersGroups) {
        this.title = title;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.listUsersGroups = listUsersGroups;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getListUsersGroups() {
        return listUsersGroups;
    }

    public void setListUsersGroups(String listUsersGroups) {
        this.listUsersGroups = listUsersGroups;
    }



}
