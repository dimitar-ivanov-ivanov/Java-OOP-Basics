package com.company.Mankind.Models;

import com.company.Mankind.Constants.ExceptionMessages;
import com.company.Mankind.Models.Human;

public class Student extends Human {
    private String facultyNumber;

    public Student(String firstName, String lastName, String facultyNumber) {
        super(firstName, lastName);
        setFacultyNumber(facultyNumber);
    }

    private void setFacultyNumber(String facultyNumber) throws IllegalArgumentException {
        if (facultyNumber.length() < 5 || facultyNumber.length() > 10) {
            throw new IllegalArgumentException(ExceptionMessages.FACULTY_NUMBER_INVALID_LENGTH);
        }
        this.facultyNumber = facultyNumber;
    }

    private String getFacultyNumber() {
        return facultyNumber;
    }

    @Override
    public String toString() {
        return super.toString() + "Faculty number: " + getFacultyNumber();
    }
}
