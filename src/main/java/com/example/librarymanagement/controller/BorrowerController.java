package com.example.librarymanagement.controller;

import com.example.librarymanagement.entity.Borrower;
import com.example.librarymanagement.service.BorrowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/borrowers")
public class BorrowerController {

    @Autowired
    private BorrowerService borrowerService;

    @GetMapping
    public List<Borrower> getAllBorrowers() {
        return borrowerService.getAllBorrowers();
    }

    @PostMapping
    public Borrower createBorrower(@RequestBody Borrower borrower) {
        return borrowerService.createBorrower(borrower);
    }

    @PutMapping("/{id}")
    public Borrower updateBorrower(@PathVariable Long id, @RequestBody Borrower borrower) {
        return borrowerService.updateBorrower(id, borrower);
    }

    @DeleteMapping("/{id}")
    public void deleteBorrower(@PathVariable Long id) {
        borrowerService.deleteBorrower(id);
    }
}