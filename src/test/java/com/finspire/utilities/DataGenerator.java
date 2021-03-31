package com.finspire.utilities;

import com.github.javafaker.Faker;
import com.github.javafaker.IdNumber;
import com.opencsv.CSVWriter;

import java.io.*;
import java.util.*;

public class DataGenerator {

    public static void main(String[] args) {


    }

    public static Map<String, Object> createUser() {

        Faker faker = new Faker();
        String name = faker.name().firstName();
        String lastName = faker.name().lastName();
        String gender = faker.demographic().sex();
        String email = faker.name().username() + "@gmail.com";
        long phone = Long.parseLong(faker.numerify("#####"));

        Map<String, Object> newUser = new HashMap<>();
        newUser.put("name", name);
        newUser.put("gender", gender);
        newUser.put("email", email);
        newUser.put("status", "Active");

        return newUser;

    }

    public static String generateFakeAccountName() {
        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String fullName = firstName + " " + lastName;
        return fullName;
    }

    public static String generateCompanyName() {
        Faker faker = new Faker();
        String companyName = faker.company().name();
        return companyName;
    }

    public static int generateRandomAmount() {
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(900) + 100;
        //String randomAccountNumber = String.valueOf(randomNumber);
        //out.println("randomNumber = " + randomNumber);
        return randomNumber;
    }

    public static String generateRandomAccountNumber() {
        int digit = 8;
        int m = (int) Math.pow(10, digit - 1);
        int randomAccNumber = m + new Random().nextInt(9 * m);
        String randomAccountNumber = String.valueOf(randomAccNumber);
        //out.println("randomAccountNumber = " + randomAccountNumber);
        return randomAccountNumber;

    }

    public static String generateRandomSortNumber() {
        int digit = 6;
        int m = (int) Math.pow(10, digit - 1);
        int randomAccNumber = m + new Random().nextInt(9 * m);
        String randomAccountNumber = String.valueOf(randomAccNumber);
        //out.println("randomSortNumber = " + randomAccountNumber);
        return randomAccountNumber;
    }

    public static String generateStrongPassword() {
        int digit = 6;
        int m = (int) Math.pow(10, digit - 1);
        int randomAccNumber = m + new Random().nextInt(9 * m);
        String randomAccountNumber = String.valueOf(randomAccNumber);
        //out.println("randomSortNumber = " + randomAccountNumber);
        return "P@ss" + randomAccountNumber;
    }

    public static String generateFakeEmailAddress() {
        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String emailAddress = firstName + lastName + "@yopmail.com";
        return emailAddress;
    }

    public static String extractTokenFromVerificationLink(String verificationLink) {
        String verificationToken = verificationLink.substring(verificationLink.lastIndexOf("eyJhbGciOiJIUzUxMiJ9"), verificationLink.indexOf("\"}"));
        return verificationToken;
    }

    public static String generatePhoneNumber() {
        Faker faker = new Faker();
        //String basePhoneNumber = faker.phoneNumber().cellPhone();
        long basePhoneNumber = faker.number().randomNumber(8, true);
        Long number = new Long(basePhoneNumber);
        String pNumber = number.toString(number);
        String phoneNumber = "4400" + pNumber;
        return phoneNumber;
    }

    public static void generateCSVwithoutKey(String token) {

        try (PrintWriter writer = new PrintWriter(("./src/test/java/com/finspire/data/token.csv"))) {

            StringBuilder sb = new StringBuilder();
            sb.append(token);
            writer.write(sb.toString());

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());

        }

    }
    public static void generateCSVwithKey(String filePath, String token)
    {
        // first create file object for file placed at location
        // specified by filepath
        File file = new File(filePath);

        try {
            // create FileWriter object with file as parameter
            FileWriter outputfile = new FileWriter(file);

            // create CSVWriter with '|' as separator
            CSVWriter writer = new CSVWriter(outputfile, ',',
                    CSVWriter.NO_QUOTE_CHARACTER,
                    CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                    CSVWriter.DEFAULT_LINE_END);

            // create a List which contains String array
            List<String[]> data = new ArrayList<String[]>();
            data.add(new String[] { "Token"});
            data.add(new String[] {token});
            writer.writeAll(data);

            // closing writer connection
            writer.close();
        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }





}