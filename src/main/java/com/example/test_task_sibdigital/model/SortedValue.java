package com.example.test_task_sibdigital.model;

import jakarta.persistence.*;

@Entity
@Table(name = "sorted_values")
public class SortedValue {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long sortedValueId;

    @Column(name = "sortedValue")
    private Long sortedValue;

    @ManyToOne(fetch = FetchType.LAZY)
    private Result result;

    public SortedValue() {
    }

    public SortedValue(Long sortedValue, Result result) {
        this.sortedValue = sortedValue;
        this.result = result;
    }

    public Long getValueId() {
        return sortedValueId;
    }

    public void setValueId(Long id) {
        this.sortedValueId = id;
    }

    public Long getSortedValue() {
        return sortedValue;
    }

    public void setSortedValue(Long value) {
        this.sortedValue = value;
    }

    public Result getSort() {
        return result;
    }

    public void setSort(Result result) {
        this.result = result;
    }
}
