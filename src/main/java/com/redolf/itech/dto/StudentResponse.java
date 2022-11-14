package com.redolf.itech.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudentResponse {
    private String studentId;
    private String firstName;
    private String lastName;
    private int  reference;
    private int index;
}
