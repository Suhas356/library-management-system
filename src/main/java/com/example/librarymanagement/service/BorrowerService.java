package com.example.librarymanagement.service;

import com.example.librarymanagement.entity.Borrower;
import com.example.librarymanagement.repository.BorrowerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BorrowerService {

    @Autowired
    private BorrowerRepository borrowerRepository;

    public List<Borrower> getAllBorrowers() {
        return borrowerRepository.findAll();
    }

    public Borrower createBorrower(Borrower borrower) {
        return borrowerRepository.save(borrower);
    }

    public Borrower updateBorrower(Long id, Borrower borrower) {
        borrower.setId(id);
        return borrowerRepository.save(borrower);
    }

    public void deleteBorrower(Long id) {
        borrowerRepository.deleteById(id);
    }
}