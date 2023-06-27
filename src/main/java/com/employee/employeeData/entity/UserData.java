package com.employee.employeeData.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserData {
    @Id
    private Long id;
    private String name;
    private String designation;
    private double salary;

}
