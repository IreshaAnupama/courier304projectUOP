package com.example.courier304project.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class PostalCode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String postalCode1;
    private String postalCode2;
    private String postalCode3;

    @JsonIgnore
    @OneToOne(mappedBy = "postalCodes")
    @JoinColumn()
    private Courier courierPostal;

    public PostalCode(String postalCode1, String postalCode2, String postalCode3) {
        this.postalCode1=postalCode1;
        this.postalCode2=postalCode2;
        this.postalCode3=postalCode3;
    }
}
