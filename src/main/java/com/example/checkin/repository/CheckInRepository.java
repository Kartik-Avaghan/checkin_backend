package com.example.checkin.repository;

import com.example.checkin.model.Visitors;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckInRepository extends JpaRepository<Visitors, Long> {
}
