package com.example.checkin.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Entity
public class Visitors {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String mobileNo;

    private LocalDateTime checkInDateTime;

    private LocalDateTime checkOutDate;

    private Double duration;

    private String visitingPerson;

    private String purposeOfVisit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public LocalDateTime getCheckInDateTime() {
        return checkInDateTime;
    }

    public void setCheckInDateTime(LocalDateTime checkInDateTime) {
        this.checkInDateTime = checkInDateTime;
    }

    public LocalDateTime getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(LocalDateTime checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public String getVisitingPerson() {
        return visitingPerson;
    }

    public void setVisitingPerson(String visitingPerson) {
        this.visitingPerson = visitingPerson;
    }

    public String getPurposeOfVisit() {
        return purposeOfVisit;
    }

    public void setPurposeOfVisit(String purposeOfVisit) {
        this.purposeOfVisit = purposeOfVisit;
    }

    public Visitors(Long id, String name, String mobileNo, LocalDateTime checkInDateTime, LocalDateTime checkOutDate, Double duration, String visitingPerson, String purposeOfVisit) {
        this.id = id;
        this.name = name;
        this.mobileNo = mobileNo;
        this.checkInDateTime = checkInDateTime;
        this.checkOutDate = checkOutDate;
        this.duration = duration;
        this.visitingPerson = visitingPerson;
        this.purposeOfVisit = purposeOfVisit;
    }

    @Override
    public String toString() {
        return "Visitors{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", checkInDateTime=" + checkInDateTime +
                ", checkOutDate=" + checkOutDate +
                ", duration=" + duration +
                ", visitingPerson='" + visitingPerson + '\'' +
                ", purposeOfVisit='" + purposeOfVisit + '\'' +
                '}';
    }

    public Visitors() {

    }
}
