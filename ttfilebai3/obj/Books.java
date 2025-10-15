
package ttfilebai3.obj;

import java.io.Serializable;
import java.util.Scanner;

public class Books implements Serializable{
    protected String id;
    protected String authors;
    protected String title;
    protected String category;

    public Books() {
    }

    public Books(String id, String authors, String title, String category) {
        this.id = id;
        this.authors = authors;
        this.title = title;
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
    public transient Scanner sc = new Scanner(System.in);
    public void add() {
        System.out.print("Nhap id: ");
        id = sc.nextLine();
        System.out.print("Nhap authors: ");
        authors = sc.nextLine();
        System.out.print("Nhap title: ");
        title = sc.nextLine();
        System.out.print("Nhap category: ");
        category = sc.nextLine();
    }
    @Override
    public String toString() {
        return "Books{" + "id=" + id + ", authors=" + authors + ", title=" + title + ", category=" + category + '}';
    }
    
}
