package com.example.projectX.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table
public class Expenses {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String expense;

    private String description;

    private BigDecimal amount;


    public Expenses(Long id, String expense, String description, BigDecimal amount) {
        this.id = id;
        this.expense = expense;
        this.description = description;
        this.amount = amount;
    }

    public Expenses() {
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getExpense() {
        return expense;
    }

    public void setExpense(String expense) {
        this.expense = expense;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Expenses expenses = (Expenses) o;
        return Objects.equals(id, expenses.id) && Objects.equals(expense, expenses.expense) && Objects.equals(description, expenses.description) && Objects.equals(amount, expenses.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, expense, description, amount);
    }
}
