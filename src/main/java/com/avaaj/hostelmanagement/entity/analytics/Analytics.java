package com.avaaj.hostelmanagement.entity.analytics;

public interface Analytics {
    Long getExpenses();
    default Long getRevenue(){
        return 0L;
    };
    default Long getRent(){
        return 0L;
    };
}
