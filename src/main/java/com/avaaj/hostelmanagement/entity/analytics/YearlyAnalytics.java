package com.avaaj.hostelmanagement.entity.analytics;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="yearly_analytics")
@Data
public class YearlyAnalytics implements Analytics {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int month;
    private Long totalExpense;
    private Long totalRent;
    private Long totalRevenue;

    @Override
    public Long getExpenses() {
        return totalExpense;
    }

    @Override
    public Long getRevenue() {
        return totalRevenue;
    }

    @Override
    public Long getRent() {
        return totalRent;
    }
}
