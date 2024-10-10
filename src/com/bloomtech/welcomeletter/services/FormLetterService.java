package com.bloomtech.welcomeletter.services;

import com.bloomtech.welcomeletter.fileIO.FileManager;
import com.bloomtech.welcomeletter.models.Employee;

import java.io.IOException;

public class FormLetterService {
    private static final FileManager fileManager = new FileManager();

    public void generateWelcomeLetter(Employee employee) throws IOException {
        //TODO: Get template text from resources
        String template = fileManager.getTextFromFile("LetterTemplate");

        //TODO: Replace []ed text with correct info
        String newTemp = template.replace("[company name]", employee.getCompany().getCompanyName())
        .replace("[fullname]", employee.getFirstname() + " " + employee.getLastname())
        .replace("[startDate]", employee.getStartDate().toString())
        .replace("[startingsalary]", String.valueOf(employee.getSalary()))
        .replace("[company starttime]", employee.getCompany().getCompanyName());

        //TODO: Write finalized String to file
        fileManager.writeTextToFile("Welcome" + employee.getFirstname() + employee.getLastname(), newTemp);
    }
}
