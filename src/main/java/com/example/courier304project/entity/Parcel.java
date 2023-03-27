package com.example.courier304project.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Time;

@Entity
public class Parcel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int parcelId;
    private Float cost;
    private int paymentType;
    private float length;
    private float width;
    private float height;
    private Date date;
    private Time time;
    private int scheduleNo;
    private double distance;
    private int status; // 1= one day delevery, 2= 3 days,  3= within week , 4 = other

    //@OneToMany(targetEntity = Parcel.class, cascade = CascadeType.ALL)
    //@JoinColumn(name="fk",referencedColumnName = "customerPhone")


    @ManyToOne
    //@JoinColumn(name="fk",referencedColumnName = "customerPhone")
    private Customer customer;

    public Parcel(){}

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    //constructor only cost,paymentType,dimension,status
    public Parcel(Float cost, int paymentType, float length, float width, float height, int status,Customer customer) {
        this.cost = cost;
        this.paymentType = paymentType;
        this.length = length;
        this.width = width;
        this.height = height;
        this.status = status;
        this.customer= customer;
    }


    public int getParcelId() {
        return parcelId;
    }

    public void setParcelId(int parcelId) {
        this.parcelId = parcelId;
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }

    public int getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(int paymentType) {
        this.paymentType = paymentType;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public int getScheduleNo() {
        return scheduleNo;
    }

    public void setScheduleNo(int scheduleNo) {
        this.scheduleNo = scheduleNo;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
