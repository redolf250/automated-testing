package com.redolf.itech.dto;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.UUID;


class StudentRequestTest {

    StudentRequest student;
    @BeforeEach
    void setUp() {
        student = StudentRequest.builder()
                .studentId(UUID.randomUUID().toString())
                .firstName("Asamani")
                .lastName("Redolf")
                .index(474743)
                .reference(5478457)
                .build();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void setStudentId() {
        student.setStudentId(UUID.randomUUID().toString());
    }

    @Test
    void setFirstName() {
        student.setFirstName("Asamani");
    }

    @Test
    void setLastName() {
        student.setLastName("Redolf");
    }

    @Test
    void setReference() {
        student.setReference(5478457);
    }

    @Test
    void setIndex() {
        student.setIndex(474743);
    }

    @Test
    void getStudentId() {
        student.getStudentId();
    }

    @Test
    void getFirstName() {
        org.assertj.core.api.Assertions.assertThat(student.getFirstName())
                .contains("A");
    }

    @Test
    void getLastName() {
        Assertions.assertEquals("Redolf",student.getLastName());
    }

    @Test
    void getReference() {
        Assertions.assertEquals(5478457,student.getReference());
    }

    @Test
    void getIndex() {
        Assertions.assertEquals(474743,student.getIndex());
    }

}