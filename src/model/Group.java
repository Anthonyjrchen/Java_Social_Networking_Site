package model;

import java.util.*;
public class Group extends TimeRecord{

    private User admin;
    private List<User> groupMembers = new ArrayList<>();
    private String description;

    public Group(User admin) {
        this.admin = admin;
        recordTime();
    }

    public void inviteUser (User caller, User invitee) {
        //Could make it so that only admin can invite
        invitee.receiveInvite(this);
    }

    public void removeUser (User caller, User removee) throws Exception {
        if (caller == admin) {
            groupMembers.remove(removee);
        } else {
            throw new Exception("You do not have permission to perform this action");
        }
    }


    //GETTERS AND SETTERS
    //
    //
    public List<User> getGroupMembers() {
        return groupMembers;
    }

    public void setGroupMembers(List<User> groupMembers) {
        this.groupMembers = groupMembers;
    }

    public User getAdmin() {
        return admin;
    }

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
