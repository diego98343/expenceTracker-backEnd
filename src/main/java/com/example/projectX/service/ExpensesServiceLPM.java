package com.example.projectX.service;

import com.example.projectX.model.Expenses;
import com.example.projectX.repository.ExpensesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpensesServiceLPM implements ExpensesService{

@Autowired
ExpensesRepository expensesRepository;


    @Override
    public List<Expenses> findAll(){
        return  expensesRepository.findAll();
    }
    @Override
    public Expenses save(Expenses expenses){
        expensesRepository.save(expenses);
        return expenses;
    }

    @Override
    public Expenses findById(Long id){
        if(expensesRepository.findById(id).isPresent()){
            return expensesRepository.findById(id).get();
        }
        return null;
    }

    @Override
    public void delete (Long id){
        Expenses expense= findById(id);
        expensesRepository.delete(expense);
    }


}
