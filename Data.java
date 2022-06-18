/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fix;

import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.text.*;
import java.util.Random;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author alfi zia ulhaq
 */
public class Data implements Serializable {
    private String name;
    private String address;
    private String email;
    private String id;
    private double total;
    private float day;
    private double price;
    private String hotel;
    private String type;
    private String room;
    private String checkin;
    private String checkout;
    private double totalfix;
    private double discount;

    public Data(String name, String address, String email, String id, double total, float day, double price, String hotel, String type, String room, String checkin, String checkout, double totalfix, double discount) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.id = id;
        this.total = total;
        this.day = day;
        this.price = price;
        this.hotel = hotel;
        this.type = type;
        this.room = room;
        this.checkin = checkin;
        this.checkout = checkout;
        this.totalfix = totalfix;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public float getDay() {
        return day;
    }

    public void setDay(float day) {
        this.day = day;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }

    public double getTotalfix() {
        return totalfix;
    }

    public void setTotalfix(double totalfix) {
        this.totalfix = totalfix;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    
}
