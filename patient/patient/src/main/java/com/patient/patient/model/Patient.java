package com.patient.patient.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Patient {
    private int id;
    private String patientname;
    private int age;
    private long phone;
    private String dieases;

}
