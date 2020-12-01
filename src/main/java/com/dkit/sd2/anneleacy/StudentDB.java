package com.dkit.sd2.anneleacy;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentDB {

    private ArrayList<Student> studentList;

    public StudentDB() {
        this.studentList = new ArrayList<>();
    }

    public Student findStudentById(String id) {
        for(Student s : studentList ) {
            if(s.getId().equals(id))
                return s;
        }
        return null;    // not found
    }

    public void addStudent( Student s) {    //TODO prevent duplicates
        studentList.add( s );
    }

    public void removeStudentById( String id ) {
        Student student = findStudentById( id );    //TODO check for null id
        if( student != null)
            studentList.remove(student);

    }

    public void loadStudentsFromFile() {
        // open 'students.txt' file
        // read records and instantiate new Student objects
        // add each new student object to studentList
        // end.

        // Could initially hardcode some values here instead of reading from file
        // studentList.add( new Student("D012","Frank","1998-10-26"));
        //  etc - hard code more values


        System.out.println("Reading student DB from file...");

        try {
            Scanner sc = new Scanner(new File("students.txt"));

            while (sc.hasNext()) {

                String id = sc.next();
                String name = sc.next();
                String strBirthDate = sc.next();

                System.out.println("ID: " + id + " Name: " + name + " Birth date: " + strBirthDate);

                studentList.add( new Student(id, name, strBirthDate));

            }
            System.out.println("All students loaded");
            sc.close();
            System.out.println("All Students: " + studentList); // print them all

        } catch (IOException e) {
            System.out.println("IOException thrown in loadStudentsFromFile() "+e.getMessage());
        }

    }



}
