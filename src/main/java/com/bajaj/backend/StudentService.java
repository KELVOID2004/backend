package com.bajaj.backend;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    public Student postOperation(RequestDto inputData) {
        List alphabets = new ArrayList<Character>();
        List numbers = new ArrayList<Integer>();
        List highest_alphabet = new ArrayList<Character>();
        int highest_ascii = 0;
        String highest_element = "";
        try {
            for (String item : inputData.getData()) {
                if (item.length() > 1) {
                    numbers.add(Integer.parseInt(item));
                } else if (item.length() == 1) {
                    int temp = item.toUpperCase().charAt(0);
                    if (temp >= 48 && temp <= 57) {
                        numbers.add(Integer.parseInt(item));
                    } else {
                        alphabets.add(item);
                        if (temp > highest_ascii) {
                            highest_ascii = temp;
                            highest_element = item;
                        }
                    }
                }
            }
            if (!highest_element.equalsIgnoreCase("")) {
                highest_alphabet.add(highest_element);
            }
            return new Student(true, "Sayantan_Bhaumik_01072004", "ss1852@srmist.edu.in", "RA2111026020011", numbers, alphabets, highest_alphabet);
        } catch (Exception e) {
            return new Student(false, "Sayantan_Bhaumik_01072004", "ss1852@srmist.edu.in", "RA2111026020011", numbers, alphabets, highest_alphabet);
        }

    }

}
