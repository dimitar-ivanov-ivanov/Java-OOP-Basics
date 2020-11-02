package com.company.Telephony;

import com.company.Telephony.Models.Smartphone;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        solve();
    }

    private static void solve() {
        Scanner scanner = new Scanner(System.in);
        String[] phones = scanner.nextLine().split(" ");
        String[] urls = scanner.nextLine().split(" ");
        Smartphone smartphone = new Smartphone();

        callPhones(phones, smartphone);
        browseUrls(urls, smartphone);
    }

    private static void browseUrls(String[] urls, Smartphone smartphone) {
        Arrays.stream(urls).forEach(url -> {
            try {
                smartphone.browse(url);
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        });
    }

    private static void callPhones(String[] phones, Smartphone smartphone) {
        Arrays.stream(phones).forEach(phone -> {
            try {
                smartphone.callPhone(phone);
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        });
    }
}
