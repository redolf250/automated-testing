package com.redolf.itech.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private String studentId;
    private String firstName;
    private String lastName;
    private int  reference;
    private int index;

}
