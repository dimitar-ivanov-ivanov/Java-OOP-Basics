package com.company.BorderControl.Models;

public class Robot extends IdentifiableImpl {
    private String model;

    public Robot(String model, String id) {
        super(id);
        this.model = model;
    }
}
