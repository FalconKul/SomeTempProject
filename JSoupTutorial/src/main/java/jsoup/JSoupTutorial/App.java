package jsoup.JSoupTutorial;

import java.io.File;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        File htmlFile = new File("C:/Users/K Notebook/Downloads/ADMIN4/ADMIN4_25.html");
        try {
            Document doc = Jsoup.parse(htmlFile, "UTF-8");
            String title = doc.title();
            System.out.println("Title : " + title);
            System.out.println(doc.toString());
        
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
