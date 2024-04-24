package com.avaaj.hostelmanagement.entity.analytics;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="quarterly_analytics")
@Data
public class QuarterlyAnalytics implements Analytics {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int quarter;
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
