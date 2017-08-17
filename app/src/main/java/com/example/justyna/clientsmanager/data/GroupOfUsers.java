package com.example.justyna.clientsmanager.data;

/**
 * Created by Justyna on 10.07.2017.
 */

public class GroupOfUsers {

    private String groupTitle;
    private String usersList;

    public GroupOfUsers(String groupTitle, String usersList) {
        this.groupTitle = groupTitle;
        this.usersList = usersList;
    }

    public String getGroupTitle() {
        return groupTitle;
    }

    public void setGroupTitle(String groupTitle) {
        this.groupTitle = groupTitle;
    }

    public String getUsersList() {
        return usersList;
    }

    public void setUsersList(String usersList) {
        this.usersList = usersList;
    }


}
