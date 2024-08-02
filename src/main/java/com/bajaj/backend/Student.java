package com.bajaj.backend;

import java.util.Arrays;
import java.util.List;

public class Student {

    private boolean status;
    private String user_id;
    private String college_email_id;
    private String college_roll_number;
    private List<Integer> numbers;
    private List<String> alphabets;

    private List<String> highest_alphabet;

    public Student(boolean status, String user_id, String college_email_id, String college_roll_number, List<Integer> numbers, List<String> alphabets, List<String> highest_alphabet) {
        this.status = status;
        this.user_id = user_id;
        this.college_email_id = college_email_id;
        this.college_roll_number = college_roll_number;
        this.numbers = numbers;
        this.alphabets = alphabets;
        this.highest_alphabet = highest_alphabet;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getCollege_email_id() {
        return college_email_id;
    }

    public void setCollege_email_id(String college_email_id) {
        this.college_email_id = college_email_id;
    }

    public String getCollege_roll_number() {
        return college_roll_number;
    }

    public void setCollege_roll_number(String college_roll_number) {
        this.college_roll_number = college_roll_number;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<String> getAlphabets() {
        return alphabets;
    }

    public void setAlphabets(List<String> alphabets) {
        this.alphabets = alphabets;
    }

    public List<String> getHighest_alphabet() {
        return highest_alphabet;
    }

    public void setHighest_alphabet(List<String> highest_alphabet) {
        this.highest_alphabet = highest_alphabet;
    }

    @Override
    public String toString() {
        return "Student{" +
                "status=" + status +
                ", user_id='" + user_id + '\'' +
                ", college_email_id='" + college_email_id + '\'' +
                ", college_roll_number='" + college_roll_number + '\'' +
                ", numbers=" + numbers +
                ", alphabets=" + alphabets +
                ", highest_alphabet=" + highest_alphabet +
                '}';
    }
}
