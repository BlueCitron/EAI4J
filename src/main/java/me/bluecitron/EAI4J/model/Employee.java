package me.bluecitron.EAI4J.model;

import lombok.Data;

@Data
public class Employee {
    private int empNo;
    private String birthDate;
    private String firstName;
    private String lastName;
    private String gender;
    private String hireDate;
    private String transmitYn;
    private String transmitTm;
}
