package Taxi.model;

import java.sql.Date;
import java.sql.Time;

public class Rides {

    private short id;
    private short user_id;
    private short driver_id;
    private Time time_of_order;
    private Time time_of_start;
    private Time time_of_end;
    private Date date;
    private short ride_state;
    private String start_location;
    private String end_location;
    private double price;

    public short getId() {
        return id;
    }


    public short getUser_id() {
        return user_id;
    }

    public void setUser_id(short user_id) {
        this.user_id = user_id;
    }

    public short getDriver_id() {
        return driver_id;
    }

    public void setDriver_id(short driver_id) {
        this.driver_id = driver_id;
    }

    public Time getTime_of_order() {
        return time_of_order;
    }

    public void setTime_of_order(Time time_of_order) {
        this.time_of_order = time_of_order;
    }

    public Time getTime_of_start() {
        return time_of_start;
    }

    public void setTime_of_start(Time time_of_start) {
        this.time_of_start = time_of_start;
    }

    public Time getTime_of_end() {
        return time_of_end;
    }

    public void setTime_of_end(Time time_of_end) {
        this.time_of_end = time_of_end;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public short getRide_state() {
        return ride_state;
    }

    public void setRide_state(short ride_state) {
        this.ride_state = ride_state;
    }

    public String getStart_location() {
        return start_location;
    }

    public void setStart_location(String start_location) {
        this.start_location = start_location;
    }

    public String getEnd_location() {
        return end_location;
    }

    public void setEnd_location(String end_location) {
        this.end_location = end_location;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Rides(short id, short user_id, short driver_id, Time time_of_order, Time time_of_start, Time time_of_end, Date date, short ride_state, String start_location, String end_location, double price) {
        this.id = id;
        this.user_id = user_id;
        this.driver_id = driver_id;
        this.time_of_order = time_of_order;
        this.time_of_start = time_of_start;
        this.time_of_end = time_of_end;
        this.date = date;
        this.ride_state = ride_state;
        this.start_location = start_location;
        this.end_location = end_location;
        this.price = price;
    }
}
