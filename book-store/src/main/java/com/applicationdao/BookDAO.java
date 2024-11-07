package com.applicationdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.applicationentities.Book;

public class BookDAO {
    private static Connection myDB = null;
    private static final String url = "jdbc:mysql://localhost:3306/BookService";
    private static final String username = "root";
    private static final String password = "admin";

    private BookDAO() {

    }

    public static Connection getConnection() {
        try {
            if (myDB == null) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                myDB = DriverManager.getConnection(url, username, password);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return myDB;
    }

    public static Book getBookById(String book_id) {
        try {
            Connection myDB = getConnection();
            PreparedStatement ps = myDB.prepareStatement("select * from books where book_id =?");
            ps.setString(1, book_id);
            ResultSet rs = ps.executeQuery();

            rs.next();

            Book bk = new Book(
                    rs.getString("book_id"),
                    rs.getString("book_title"),
                    rs.getString("book_author"),
                    rs.getFloat("book_price"));

            return bk;

        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public static List<Book> getAllBooks() {
        List<Book> bks = new ArrayList<Book>();
        try {
            Connection myDB = getConnection();
            PreparedStatement ps = myDB.prepareStatement("select * from books");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                bks.add(new Book(
                        rs.getString("book_id"),
                        rs.getString("book_title"),
                        rs.getString("book_author"),
                        rs.getFloat("book_price")));
            }

            return bks;

        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public static String addBook(Book book) {
        int status = 0;
        String resMessage = "";

        try {
            Connection myDB = getConnection();
            PreparedStatement ps = myDB
                    .prepareStatement("insert into books(book_id,book_title,book_author,book_price) values (?,?,?,?)");
            ps.setString(1, book.getBook_id());
            ps.setString(2, book.getBook_title());
            ps.setString(3, book.getBook_author());
            ps.setFloat(4, book.getBook_price());

            status = ps.executeUpdate();

            String succcessMes = "Book added: " + book.getBook_id();
            String failedMes = "Failed to add: " + book.getBook_id();

            resMessage = status == 1 ? succcessMes : failedMes;

        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Add book response message: " + resMessage);
        return resMessage;
    }

    public static String removeBook(String book_id) {
        int status = 0;
        String resMessage = "";

        try {
            Connection myDB = getConnection();
            PreparedStatement ps = myDB
                    .prepareStatement("delete from books where book_id = ?");
            ps.setString(1, book_id);

            status = ps.executeUpdate();

            String succcessMes = "Book removed: " + book_id;
            String failedMes = "Failed to remove: " + book_id;

            resMessage = status == 1 ? succcessMes : failedMes;

        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Remove book response message: " + resMessage);
        return resMessage;
    }

    public static String updateBook(Book book) {
        int status = 0;
        String resMessage = "";

        try {
            Connection myDB = getConnection();
            PreparedStatement ps = myDB
                    .prepareStatement("update books set book_title=?,book_author=?,book_price=? where book_id=?");
            ps.setString(1, book.getBook_title());
            ps.setString(2, book.getBook_author());
            ps.setFloat(3, book.getBook_price());
            ps.setString(4, book.getBook_id());

            status = ps.executeUpdate();

            String succcessMes = "Book updated: " + book.getBook_id();
            String failedMes = "Failed to update: " + book.getBook_id();

            resMessage = status == 1 ? succcessMes : failedMes;

        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Update book response message: " + resMessage);
        return resMessage;
    }

    // public static List<Book> getAllBooks() {
    // List<Book> r = new ArrayList<Book>();

    // r.add(new Book("ISBN101", "Book 1", "Author 1", (float) 1.99));
    // r.add(new Book("ISBN102", "Book 2", "Author 2", (float) 2.99));
    // r.add(new Book("ISBN103", "Book 3", "Author 3", (float) 3.99));
    // r.add(new Book("ISBN104", "Book 4", "Author 4", (float) 4.99));

    // return r;
    // }
}