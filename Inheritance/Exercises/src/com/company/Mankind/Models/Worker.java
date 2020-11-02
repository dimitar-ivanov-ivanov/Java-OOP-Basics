package com.company.Mankind.Models;

import com.company.Mankind.Constants.ExceptionMessages;
import com.company.Mankind.Models.Human;

import java.text.DecimalFormat;

public class Worker extends Human {
    private double weekSalary;
    private double workHoursPerDay;

    public Worker(String firstName, String lastName, double weekSalary, double workHoursPerDay) {
        super(firstName);
        this.setLastName(lastName);
        setWeeklySalary(weekSalary);
        setWorkHoursPerDay(workHoursPerDay);
    }

    @Override
    protected void setLastName(String lastName) throws IllegalArgumentException {
        if (lastName.length() <= 3) {
            throw new IllegalArgumentException(String.format(ExceptionMessages.WORKER_LASTNAME_LENGTH_SHOULD_BE_MORE_SYMBOLS, 3, "lastName"));
        }
        super.lastName = lastName;
    }

    private void setWeeklySalary(double weeklySalary) throws IllegalArgumentException {
        if (weeklySalary <= 10) {
            throw new IllegalArgumentException(String.format(ExceptionMessages.VALUE_MISMATCH, "weekSalary"));
        }
        this.weekSalary = weeklySalary;
    }

    private void setWorkHoursPerDay(double workHoursPerDay) throws IllegalArgumentException {
        if (workHoursPerDay < 1 || workHoursPerDay > 12) {
            throw new IllegalArgumentException(String.format(ExceptionMessages.VALUE_MISMATCH, "workHoursPerDay"));
        }
        this.workHoursPerDay = workHoursPerDay;
    }

    private double getWeeklySalary() {
        return weekSalary;
    }

    private double getWorkHoursPerDay() {
        return workHoursPerDay;
    }

    private double getSalaryPerHour() {
        return weekSalary / (7 * workHoursPerDay);
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return super.toString() +
                "Week Salary: " + df.format(getWeeklySalary()) + "\n" +
                "Hours per day: " + df.format(getWorkHoursPerDay()) + "\n" +
                "Salary per hour: " + df.format(getSalaryPerHour());
    }
}
