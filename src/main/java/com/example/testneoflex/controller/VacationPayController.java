package com.example.testneoflex.controller;

import com.example.testneoflex.service.VacationPayService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class VacationPayController {

    private final VacationPayService vacationPayService;

    public VacationPayController(VacationPayService vacationPayService) {
        this.vacationPayService = vacationPayService;
    }
    @GetMapping("/calculacte")
    public ResponseEntity<Double> calculateVacationPay(@RequestParam double averageSalary, @RequestParam int numberDays) {
        double vacationPay = vacationPayService.calculateVocationPay(averageSalary, numberDays);
        HttpStatus httpStatus = HttpStatus.OK;
        if (averageSalary < 0 || numberDays < 0){
            httpStatus = HttpStatus.BAD_REQUEST;
        }
        return new ResponseEntity<>(vacationPay, httpStatus);
    }

}
