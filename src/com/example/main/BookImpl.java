package com.example.main;

public class BookImpl {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setTitle("The Secret");
        book1.setIsbnNo(537263852);
        book1.setAuthorName("Vaibhav Diwan");
        book1.setYearOfPublication("16/08/2022");
        System.out.println("book1.getTitle() = " + book1.getTitle());
        System.out.println("book1.getAuthorName() = " + book1.getAuthorName());
        System.out.println("book1.getIsbnNo() = " + book1.getIsbnNo());
        System.out.println("book1.getYearOfPublication() = " + book1.getYearOfPublication());
    }
}
