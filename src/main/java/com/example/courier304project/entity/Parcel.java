package com.example.courier304project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Parcel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long ParcelID;

    String senderPhoneNo;
    String senderName;
    String senderEmail;
    String senderAddress;
    String senderCity;
    String senderDistrict;

    String receiverPhoneNo;
    String receiverName;
    String receiverAddress;
    String receiverDistrict;
    String receiverCity;

    //"12:12 AM" 'Date("11/24/2021")'
    String timeFrom;
    String timeTo;
    String pickupDate;
    String vehicleType;
    String postMethod;
    String paymentType;
    String specialNote; //spetial

    int cost;

    public Parcel() {
    }

    public Parcel(String senderPhoneNo, String senderName, String senderEmail,
                  String senderAddress, String senderCity, String senderDistrict,
                  String receiverPhoneNo, String receiverName, String receiverAddress,
                  String receiverDistrict, String receiverCity, String timeFrom, String timeTo,
                  String pickupDate, String vehicleType, String postMethod, String paymentType,
                  String specialNote,int cost) {
        this.senderPhoneNo = senderPhoneNo;
        this.senderName = senderName;
        this.senderEmail = senderEmail;
        this.senderAddress = senderAddress;
        this.senderCity = senderCity;
        this.senderDistrict = senderDistrict;
        this.receiverPhoneNo = receiverPhoneNo;
        this.receiverName = receiverName;
        this.receiverAddress = receiverAddress;
        this.receiverDistrict = receiverDistrict;
        this.receiverCity = receiverCity;
        this.timeFrom = timeFrom;
        this.timeTo = timeTo;
        this.pickupDate = pickupDate;
        this.vehicleType = vehicleType;
        this.postMethod = postMethod;
        this.paymentType = paymentType;
        this.specialNote = specialNote;
        this.cost=cost;
    }

    public Long getParcelID() {
        return ParcelID;
    }

    public void setParcelID(Long parcelID) {
        ParcelID = parcelID;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getSenderPhoneNo() {
        return senderPhoneNo;
    }

    public void setSenderPhoneNo(String senderPhoneNo) {
        this.senderPhoneNo = senderPhoneNo;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getSenderEmail() {
        return senderEmail;
    }

    public void setSenderEmail(String senderEmail) {
        this.senderEmail = senderEmail;
    }

    public String getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public String getSenderCity() {
        return senderCity;
    }

    public void setSenderCity(String senderCity) {
        this.senderCity = senderCity;
    }

    public String getSenderDistrict() {
        return senderDistrict;
    }

    public void setSenderDistrict(String senderDistrict) {
        this.senderDistrict = senderDistrict;
    }

    public String getReceiverPhoneNo() {
        return receiverPhoneNo;
    }

    public void setReceiverPhoneNo(String receiverPhoneNo) {
        this.receiverPhoneNo = receiverPhoneNo;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public String getReceiverDistrict() {
        return receiverDistrict;
    }

    public void setReceiverDistrict(String receiverDistrict) {
        this.receiverDistrict = receiverDistrict;
    }

    public String getReceiverCity() {
        return receiverCity;
    }

    public void setReceiverCity(String receiverCity) {
        this.receiverCity = receiverCity;
    }

    public String getTimeFrom() {
        return timeFrom;
    }

    public void setTimeFrom(String timeFrom) {
        this.timeFrom = timeFrom;
    }

    public String getTimeTo() {
        return timeTo;
    }

    public void setTimeTo(String timeTo) {
        this.timeTo = timeTo;
    }

    public String getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(String pickupDate) {
        this.pickupDate = pickupDate;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getPostMethod() {
        return postMethod;
    }

    public void setPostMethod(String postMethod) {
        this.postMethod = postMethod;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getSpecialNote() {
        return specialNote;
    }

    public void setSpecialNote(String specialNote) {
        this.specialNote = specialNote;
    }
}
