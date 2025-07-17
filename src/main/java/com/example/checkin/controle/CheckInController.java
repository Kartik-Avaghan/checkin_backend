package com.example.checkin.controle;


import com.example.checkin.model.CheckIn;
import com.example.checkin.service.CheckInService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class CheckInController {


    private final CheckInService checkInService;

    public CheckInController(CheckInService checkInService){
        this.checkInService=checkInService;
    }

    @PostMapping
    public CheckIn createCheckIn(@RequestBody CheckIn checkIn){
        return checkInService.createCheckIns(checkIn);
    }

    @GetMapping
    public List<CheckIn> getAllCheckIns(){
        return checkInService.getAllCheckIns();
    }

    @GetMapping("/{id}")
    public CheckIn getCheckInsById(@PathVariable Long id){
        return checkInService.getCheckInsById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
         checkInService.deleteCheckIns(id);
    }
}
