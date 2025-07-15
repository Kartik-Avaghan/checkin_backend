package com.example.checkin.service;


import com.example.checkin.model.CheckIn;
import com.example.checkin.repository.CheckInRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CheckInService {


    private final CheckInRepository checkInRepository;

    public CheckInService(CheckInRepository checkInRepository){
        this.checkInRepository=checkInRepository;
    }


    public CheckIn createCheckIns(CheckIn checkIn){
        return checkInRepository.save(checkIn);
    }

    public List<CheckIn> getAllCheckIns(){
        return checkInRepository.findAll();
    }

    public CheckIn getCheckInsById(Long id){
        Optional<CheckIn> result =checkInRepository.findById(id);
        return result.orElse(null);
    }

    public void deleteCheckIns(Long id){
         checkInRepository.deleteById(id);
    }

    public CheckIn updateCheckIns(Long id, CheckIn updated) {
        return checkInRepository.findById(id).map(existing -> {
            existing.setName(updated.getName());
            existing.setMobileNo(updated.getMobileNo());
            existing.setCheckInDateTime(updated.getCheckInDateTime());
            existing.setCheckOutDate(updated.getCheckOutDate());
            existing.setCheckOutTime(updated.getCheckOutTime());
            existing.setVisitingPerson(updated.getVisitingPerson());
            existing.setPurposeOfVisit(updated.getPurposeOfVisit());
            return checkInRepository.save(existing);
        }).orElse(null);
    }


}
