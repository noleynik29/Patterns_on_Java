package Behavioral.TemplateMethod;

import Behavioral.TemplateMethod.networks.Instagram;
import Behavioral.TemplateMethod.networks.Network;
import Behavioral.TemplateMethod.networks.Telegram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Network network = null;
        System.out.print("Input user name: ");
        String userName = reader.readLine();
        System.out.print("Input password: ");
        String password = reader.readLine();

        System.out.print("Input message: ");
        String message = reader.readLine();

        System.out.println("\nChoose social network for posting message.\n" +
                "1 - Instagram\n" +
                "2 - Telegram");
        int choice = Integer.parseInt(reader.readLine());

        if (choice == 1) {
            network = new Instagram(userName, password);
        } else if (choice == 2) {
            network = new Telegram(userName, password);
        }
        network.post(message);
    }
}
