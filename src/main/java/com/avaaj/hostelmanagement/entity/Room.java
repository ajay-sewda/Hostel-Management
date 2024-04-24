package com.avaaj.hostelmanagement.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="room")
@Data
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int roomNumber;
    private int capacity;
    private int occupancy;

}
