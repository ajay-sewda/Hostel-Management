package com.avaaj.hostelmanagement.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="hostel")
public class Hostel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String hostelName;
    private String managerName;
    private String address;
    private String email;
    private String password;
    private String phoneNumber;
    private int totalRooms;
    private int totalTenants;

}
