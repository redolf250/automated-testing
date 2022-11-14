package com.redolf.itech.service;

import com.redolf.itech.dto.StudentRequest;
import com.redolf.itech.model.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
class ServiceTest {

    @InjectMocks
    public Service service = new Service();

    public Student student;

    @BeforeEach
    void setUp() {
        student = Student.builder()
                .studentId(UUID.randomUUID().toString())
                .firstName("Asamani")
                .lastName("Redolf")
                .reference(43374)
                .index(5754745)
                .build();

    }

    @Test
    void createStudent() {
        service.createStudent(student);
    }

    @Test
    void getReference() {
        service.getReference(getReference_());
        System.out.println("service.getReference(getReference_()) = " + service.getReference(getReference_()));
    }

    @Test
    void findAllStudent() {
        service.findAllStudent(getReference_());
    }

    private List<Student> getReference_(){
        List<Student> data = new ArrayList<>();
        data.add(new Student(UUID.randomUUID().toString(),"Asamani","Anack",47834,56464));
        data.add(new Student(UUID.randomUUID().toString(),"Asamani","Percy",67687,121212));
        data.add(new Student(UUID.randomUUID().toString(),"Asamani","Kendrick",47834,56464));
        return data;
    }

    @Test
    void filterByLastname() {
        service.filterByLastname(getReference_(),"P");
        System.out.println("service = " + service.filterByLastname(getReference_(),"P"));
    }

    @Test
    void test(){
//        StudentRequest  student_ = StudentRequest.builder()
//                .studentId(UUID.randomUUID().toString())
//                .firstName("Asamani")
//                .lastName("Anack")
//                .reference(7575)
//                .index(5574)
//                .build();
//      when(service.createStudent(student)).thenReturn(student_);
    }

    @Test
    void test1(){
        Assertions.assertTrue(true);
    }
}