package com.redolf.itech.service;

import com.redolf.itech.dto.StudentRequest;
import com.redolf.itech.dto.StudentResponse;
import com.redolf.itech.model.Student;

import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class Service {

    public StudentRequest createStudent(Student student){
        return StudentRequest.builder()
                .studentId(UUID.randomUUID().toString())
                .firstName(student.getFirstName())
                .lastName(student.getLastName())
                .reference(student.getReference())
                .index(student.getIndex())
                .build();
    }

    public List<String> getReference(List<Student> student){

        return student.stream().map(Student::getStudentId).collect(Collectors.toList());
    }
    public List<StudentResponse> findAllStudent(List<Student> student){
        return student.stream().map(this::mapper).collect(Collectors.toList());
    }

    public List<String> filterByLastname(List<Student> student, String name){
        return Collections.singletonList(student.stream().filter(student1 -> student1.getLastName().startsWith(name))
                        .limit(2)
                .collect(Collectors.toList()).toString());
    }
    private StudentResponse mapper(Student student){
        return StudentResponse.builder()
                .index(student.getIndex())
                .studentId(student.getStudentId())
                .lastName(student.getLastName())
                .firstName(student.getFirstName())
                .reference(student.getReference())
                .build();
    }


}
