package com.services;

import com.constants.Menu;
import com.models.User;
import com.models.enums.Role;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LoginService {

    public static int startupAction() {
        Scanner scanner = new Scanner(System.in);
        int actionNum = Integer.parseInt(scanner.nextLine());
        if(actionNum == 1 || actionNum == 2 || actionNum == 0) {
            System.out.printf("You chose action %d\n", actionNum);
            return actionNum;
        } else {
            System.out.println("Invalid action, please try again:");
            startupAction();
            return -1;
        }
    }

    public static void loginAction(User user) {
        String path = "resources/users.txt";
        String line = "";
        // reading the username from a file
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            while((line = br.readLine()) != null) {
                String[] values = line.split(", ");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
