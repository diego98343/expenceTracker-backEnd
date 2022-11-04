package com.example.projectX.controller;

import com.example.projectX.model.Expenses;
import com.example.projectX.service.ExpensesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin("*")
@RequestMapping("/api/1")
@RestController
public class ExpensesController {
    @Autowired
    ExpensesService expensesService;

    @GetMapping("/expenses")
    public ResponseEntity<List<Expenses>> get(){
        List<Expenses> expenses= expensesService.findAll();
        return new ResponseEntity<List<Expenses>>(expenses, HttpStatus.OK);
    }

    @PostMapping("/expenses")
    public ResponseEntity<Expenses>save(@RequestBody Expenses expense){
        Expenses expenses= expensesService.save(expense);
        return new ResponseEntity<Expenses>(expense,HttpStatus.OK);
    }

    @GetMapping("/expenses/{id}")
    public ResponseEntity<Expenses> get(@PathVariable("id")Long id){
       Expenses expense= expensesService.findById(id);
       return new ResponseEntity<Expenses>(expense,HttpStatus.OK);
    }

    @DeleteMapping("/expenses/{id}")
    public ResponseEntity<String> delete(@PathVariable("id")Long id){
       expensesService.delete(id);
        return new ResponseEntity<String>("Expense is deleted",HttpStatus.OK);
    }


}
