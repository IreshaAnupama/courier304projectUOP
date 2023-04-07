package com.example.courier304project.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Parcel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private Date pickupDate;
   private String timeFrom;
   private String timeTo;

   private String vehicleType;
   private String postMethod;
   private String paymentType;
   private String specialNote;
   private float length;
   private float width;
   private float height;
   private float weight;

   private float parcelCost;
   private float deliveryCost;

    /*@ManyToOne(fetch =FetchType.LAZY)
   // @JoinColumn
   // @JsonIgnore
    //private Customer sender;

   @JsonIgnore
    @ManyToOne(fetch =FetchType.LAZY)
   @JoinColumns({
            @JoinColumn(name="fk_sender",referencedColumnName = "customer_id"),
            @JoinColumn(name="fk_receivr",referencedColumnName = "customer_id")
    })*/

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn()
    private Address senderAddress;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn()
    private Address receiverAddress;
    @JsonIgnore
    @ManyToOne(fetch =FetchType.EAGER)
    @JoinColumn()
    private Customer sender;

    @JsonIgnore
    @ManyToOne(fetch =FetchType.EAGER)
    @JoinColumn()
    private Customer receiver;

    @JsonIgnore
    @ManyToOne(fetch =FetchType.EAGER)
    @JoinColumn()
    private Courier pickupVehicle;

    @JsonIgnore
    @ManyToOne(fetch =FetchType.EAGER)
    @JoinColumn()
    private Courier deliveryVehicle;


    public Parcel(float parcelCost, String timeFrom, String timeTo, String vehicleType,
                  String postMethod, String paymentType, String specialNote, float deliveryCost,
                  Date pickupDate, Address senderAddress, Address receiverAddress,Customer sender,Customer receiver) {
            this.parcelCost=parcelCost;
           // this.pickupDate=pickupDate;
            this.timeFrom=timeFrom;
            this.timeTo=timeTo;
            this.paymentType=paymentType;
            this.postMethod=postMethod;
            this.vehicleType=vehicleType;
            this.specialNote=specialNote;
            this.deliveryCost=deliveryCost;
            this.pickupDate=pickupDate;
            this.senderAddress=senderAddress;
            this.receiverAddress=receiverAddress;
            this.sender=sender;
            this.receiver=receiver;


    }
}
