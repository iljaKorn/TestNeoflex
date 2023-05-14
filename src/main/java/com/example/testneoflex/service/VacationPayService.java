package com.example.testneoflex.service;

import org.springframework.stereotype.Service;

@Service
public class VacationPayService {

    public double calculateVocationPay(double averageSalary, int numberDays){
        double dailySalary = averageSalary / 29.3;
        return dailySalary * numberDays * 0.87; //income without tax
    }

}
