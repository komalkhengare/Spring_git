package com.example.SpringBootCrudOperation.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "student_info")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int roll_no;
    @Column
    private String name;
    @Column
    private double percentage;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll_no=" + roll_no +
                ", name='" + name + '\'' +
                ", percentage=" + percentage +
                '}';
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public Student(int roll_no, String name, double percentage) {
        this.roll_no = roll_no;
        this.name = name;
        this.percentage = percentage;
    }
}
