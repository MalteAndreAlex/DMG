/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 * @author Malte
 */
public class Room {
    public Room(int houseNr, int stage, int roomNr) {
        this.houseNr = houseNr;
        this.stage = stage;
        this.roomNr = roomNr;
    }

    private int houseNr;

    public int getHouseNr() {
        return houseNr;
    }

    public void setHouseNr(int houseNr) {
        this.houseNr = houseNr;
    }

    public int getStage() {
        return stage;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }

    public int getRoomNr() {
        return roomNr;
    }

    public void setRoomNr(int roomNr) {
        this.roomNr = roomNr;
    }

    private int stage;
    private int roomNr;

}
