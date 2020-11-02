package com.company.Telephony.Models;

import com.company.Telephony.Interfaces.Browseable;
import com.company.Telephony.Interfaces.Callable;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Smartphone implements Browseable, Callable {
    public Smartphone() {
    }

    @Override
    public void browse(String url) throws IllegalArgumentException {
        Pattern pattern = Pattern.compile("^((?!\\d).)*$");
        Matcher urlMatcher = pattern.matcher(url);
        List<String> matchedUrl = new ArrayList<>();

        while (urlMatcher.find()) {
            matchedUrl.add(urlMatcher.group());
        }

        if (matchedUrl.size() != 1) {
            throw new IllegalArgumentException("Invalid URL!");
        }

        System.out.println("Browsing: " + url + "!");
    }

    @Override
    public void callPhone(String phone) throws IllegalArgumentException {
        Pattern pattern = Pattern.compile("\\b\\d+\\b");
        Matcher phoneMatcher = pattern.matcher(phone);
        List<String> matchedPhones = new ArrayList<>();

        while (phoneMatcher.find()) {
            matchedPhones.add(phoneMatcher.group());
        }

        if (matchedPhones.size() != 1) {
            throw new IllegalArgumentException("Invalid number!");
        }

        System.out.println("Calling... " + phone);
    }
}
