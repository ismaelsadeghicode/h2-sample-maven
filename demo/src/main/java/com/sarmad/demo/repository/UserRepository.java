package com.sarmad.demo.repository;

import com.sarmad.demo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Esmaeil Sadeghi, 8/4/20 9:01 PM
 */
@Repository
public interface UserRepository extends JpaRepository<Customer, Integer> {
}
