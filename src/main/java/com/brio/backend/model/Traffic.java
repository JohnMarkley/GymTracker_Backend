package com.brio.backend.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Traffic {
    @Id
    @GeneratedValue
    private Long id;
    private String day; //M,T,W,Th,Fri
    private String status; //Empty, Less Than Normal, Busy, Packed
    private int pings;
    private int time; //hh.mm.ss military time
    private boolean active;

    public Traffic(){
        super();
    }

    public Traffic(String day, String status, int pings, int time, boolean active) {

        this.day = day;
        this.status = status;
        this.pings = pings;
        this.time = time;
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getPings() {
        return pings;
    }

    public void setPings(int pings) {
        this.pings = pings;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
