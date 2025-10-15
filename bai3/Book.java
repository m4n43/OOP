
package bai3;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Book implements Serializable {
    public static final long serialVersionUID = 1L;
    
    private int id;
    private String authors;
    private String title;
    private String category;
    ArrayList<Book> list = new ArrayList<>();
    
    public Book() {
    }

    public Book(int id, String authors, String title, String category) {
        this.id = id;
        this.authors = authors;
        this.title = title;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", authors=" + authors + ", title=" + title + ", category=" + category + '}';
    }
    public transient Scanner sc = new Scanner(System.in);
    public void addBook() {
        System.out.print("Nhập số lượng sách: ");
        int n = new Scanner(System.in).nextInt();
        Book b = null;
        for(int i = 0; i<n; i++) {
            b = new Book();
            System.out.print("Nhập id: ");
            b.setId(sc.nextInt());
            sc.nextLine();
            System.out.print("Nhập tác giả: ");
            b.setAuthors(sc.nextLine());
            System.out.print("Nhập tiêu đề: ");
            b.setTitle(sc.nextLine());
            System.out.print("Nhập thể loại: ");
            b.setCategory(sc.nextLine());
            list.add(b);
        }
    }
    public void addBookToFile() {
        try {
            File file = new File("books.dat");
            PrintWriter pw =  new PrintWriter(file);
            for (Book book : list) {
                pw.printf("%d-%s-%s-%s\n", book.getId(), book.getAuthors(), book.getTitle(), book.getCategory());
            }
            pw.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void printBooks() {
        for (Book b : list) {
            System.out.println(b);
        }
    }
    public static void main(String[] args) {
        Book b = new Book();
        b.addBook();
        b.addBookToFile();
        b.printBooks();
    }
}
