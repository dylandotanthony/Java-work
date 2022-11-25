package com.codingdojo.safeTravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.safeTravels.models.Expense;
import com.codingdojo.safeTravels.repositories.ExpenseRepository;

@Service
public class expenseService {

private final ExpenseRepository repo; 
    
    public expenseService(ExpenseRepository repo) {
        this.repo = repo;
    }
   
    public List<Expense> all() {
        return repo.findall();
    }
    
    public Expense create(Expense b) {
        return repo.save(b);
    }
    
    public Expense update(Expense b) {
        return repo.save(b);
    }
    
    public Expense find(Long id) {
        Optional<Expense> optional = repo.findById(id);
        if(optional.isPresent()) {
            return optional.get();
        } else {
            return null;
        }
    }
    public void delete(Long id) {
    	repo.deleteById(id);
    }
}
