package com.example.testneoflex;

import com.example.testneoflex.service.VacationPayService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VacationPayServiceTest {
    @Test
    public void calculateVacationPay(){
        VacationPayService vacationPayService = new VacationPayService();
        double averageSalary = 20000;
        int numberDays = 12;
        assertEquals(vacationPayService.calculateVocationPay(averageSalary, numberDays), 7126.279863481229);
    }
}
