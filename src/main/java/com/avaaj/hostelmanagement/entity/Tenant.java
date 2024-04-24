package com.avaaj.hostelmanagement.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="tenant")
public class Tenant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String fatherName;
    String bloodGroup;
    String phoneNumber;
    String aadharNumber;
    byte[] profilePic;
    byte[] aadharCard;
}
