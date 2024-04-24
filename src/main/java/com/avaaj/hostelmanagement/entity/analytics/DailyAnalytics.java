package com.avaaj.hostelmanagement.entity.analytics;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
@Entity
@Table(name="daily_analytics")
@Data
public class DailyAnalytics implements Analytics {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate date;
    private Long totalExpense;
    @Override
    public Long getExpenses() {
        return totalExpense;
    }
}
