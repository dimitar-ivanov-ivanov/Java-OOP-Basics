package com.company.MilitaryElite.Models.Soldiers;

import com.company.MilitaryElite.Interfaces.Private;
import com.company.MilitaryElite.Models.Soldiers.SoldierImpl;

public class PrivateImpl extends SoldierImpl implements Private {

    private double salary;

    public PrivateImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName);
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        return super.toString() + " Salary: " + getSalary();
    }
}
