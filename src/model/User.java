package model;

import java.util.*;

public class User {
    private String password;
    private String username;
    private Date birthday;
    private String gender;
    private String displayName;
    private Map<String, User> friends;
    private List<Group> listOfGroups = new ArrayList<>();


    public User(String pass, String name, String gender, Date birthdate) {
        this.password = pass;
        this.username = name;
        this.gender = gender;
        this.birthday = birthdate;
        friends = new HashMap<>();
    }

    //METHODS
    //
    //

    public void addFriend(User friend) {
        String friendName = friend.getDisplayName();
        friends.put(friendName, friend);
    }

    public void removeFriend(String removeName) {
        friends.remove(removeName);
    }

    public void sendMessage(String message, User destination) {
        Message bloop = new Message(message);
        destination.receiveMessage(bloop);
    }

    public void receiveMessage(Message m) {
        //stub
    }

    public void receiveInvite(Group g) {
        //stub
    }

    public void createGroup() {
        Group toBeAdded = new Group(this);
        listOfGroups.add(toBeAdded);
    }




    //GETTERS AND SETTERS
    //
    //

    public Map<String, User> getFriends() {
        return friends;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
}
