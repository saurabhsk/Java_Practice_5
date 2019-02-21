package com.stackroute.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class StudentTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testStudent() {

        List<Student> students = new ArrayList<>();
        Student obj1 = new Student(1, "Ajay", 30);
        Student obj2 = new Student(2, "Rahul", 33);
        Student obj3 = new Student(3, "Ram", 35);
        Student obj4 = new Student(4, "Sam", 30);
        Student obj5 = new Student(5, "Sujata", 34);
        students.add(obj1);
        students.add(obj2);
        students.add(obj3);
        students.add(obj4);
        students.add(obj5);

        Collections.sort(students,new StudentSorter());

        String expected = "[Student{id=3, name=Ram', age=35}, Student{id=5, name=Sujata', age=34}, Student{id=2, name=Rahul', age=33}, Student{id=4, name=Sam', age=30}, Student{id=1, name=Ajay', age=30}]";
        assertEquals(expected,students.toString());
    }
}