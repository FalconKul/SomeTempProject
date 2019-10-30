package jsoup.JSoupTutorial;

import java.io.File;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to Jsoup Tutorial!");
        File htmlFile = new File("C:/Users/K Notebook/Downloads/ADMIN4/ADMIN4_25.html");
        try {
            System.out.println("Parse HTML to Jsoup Document");
            Document doc = Jsoup.parse(htmlFile, "UTF-8");
            System.out.println();
            
            System.out.println("Get body info");
            System.out.println(doc.getElementsByTag("body"));
            
        
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
