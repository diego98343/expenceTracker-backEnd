package com.example.projectX.service;

import com.example.projectX.model.Expenses;

import java.util.List;



public interface ExpensesService {

    List<Expenses>findAll();

    Expenses save(Expenses expenses);

    Expenses findById(Long id);


    void delete(Long id);

}
