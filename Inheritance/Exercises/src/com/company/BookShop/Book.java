package com.company.BookShop;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String author, String title, double price) {
        setAuthor(author);
        setTitle(title);
        setPrice(price);
    }

    private void setTitle(String title) throws IllegalArgumentException {
        if (title.length() < 3) {
            throw new IllegalArgumentException("Title not valid!");
        }
        this.title = title;
    }

    private void setAuthor(String author) throws IllegalArgumentException {
        String[] authorArgs = author.split(" ");
        if (authorArgs.length == 2) {
            String firstName = authorArgs[0];
            String secondName = authorArgs[1];
            if (Character.isDigit(secondName.charAt(0))) {
                throw new IllegalArgumentException("Author not valid!");
            }
        }
        this.author = author;
    }

    private void setPrice(double price) throws IllegalArgumentException {
        if (price <= 0) {
            throw new IllegalArgumentException("Price not valid!");
        }
        this.price = price;
    }

    protected double getPrice() {
        return price;
    }

    protected String getTitle() {
        return title;
    }

    protected String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Type: ").append(this.getClass().getSimpleName())
                .append(System.lineSeparator())
                .append("Title: ").append(getTitle())
                .append(System.lineSeparator())
                .append("Author: ").append(getAuthor())
                .append(System.lineSeparator())
                .append("Price: ").append(getPrice())
                .append(System.lineSeparator());
        return sb.toString();
    }
}
