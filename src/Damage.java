/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.text.DateFormat;

/**
 * @author Malte
 */
public class Damage {
    public Damage(String date, String categorie, String description, Room room, User user) {
        this.date = date;
        this.categorie = categorie;
        this.description = description;
        this.room = room;
        this.user = user;
    }

    public String getDate() {
        return date;
    }

    public String getCategorie() {
        return categorie;
    }

    public String getDescription() {
        return description;
    }

    public Room getRoom() {
        return room;
    }

    public User getUser() {
        return user;
    }

    private String date;

    public void setDate(String date) {
        this.date = date;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public void setUser(User user) {
        this.user = user;
    }

    private String categorie;
    private String description;
    private Room room;
    private User user;
    private String FickDichGit;
}
