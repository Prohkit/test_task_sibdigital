package com.example.test_task_sibdigital.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "result")
public class Result {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long resultId;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "result", cascade = CascadeType.ALL)
    @Column(name = "arraySortedValues")
    private List<SortedValue> arraySortedValues;

    public Result() {
    }

    public Long getResultId() {
        return resultId;
    }

    public void setResultId(Long id) {
        this.resultId = id;
    }

    public List<SortedValue> getArrayValues() {
        return arraySortedValues;
    }

    public void setArrayValues(List<SortedValue> sortedValues) {
        this.arraySortedValues = sortedValues;
    }
}
