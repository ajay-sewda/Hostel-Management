package com.avaaj.hostelmanagement.entity;

import jakarta.persistence.*;
import lombok.Data;


import java.time.LocalDate;

@Entity
@Data
@Table(name="expense")
public class Expense {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long id;
    String description;
    LocalDate date;
    Double amount;

}
