package com.avaaj.hostelmanagement.entity.analytics;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="weekly_analytics")
@Data
public class WeeklyAnalytics implements Analytics {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int week;
    private Long totalExpense;
    @Override
    public Long getExpenses() {
        return totalExpense;
    }
}
