package org.intensive.builder.repo;


import org.intensive.builder.Lunch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LunchRepo extends JpaRepository<Lunch, Integer> {
}
