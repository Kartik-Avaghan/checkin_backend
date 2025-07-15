package com.example.checkin.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Component
@Entity
public class CheckIn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String mobileNo;


    private LocalDateTime checkInDateTime;

    private LocalDate checkOutDate;

    private LocalTime checkOutTime;

    private String visitingPerson;

    private String purposeOfVisit;


}
