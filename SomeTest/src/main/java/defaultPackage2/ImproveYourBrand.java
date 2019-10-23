package main.java.defaultPackage2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class ImproveYourBrand {
    public static void main(String args[]) {
        // Variable use for random
        String operation;
        int number1, number2;
        // number of line exercise you want to print
        int math = 60*4; // 1 line has 4 math, 15 lines/page => 60 * 4 page
        
        // Create Blank document
        XWPFDocument document = new XWPFDocument();
        
        for (int i = 0; i < math; i++) {
            // Create new Paragraph
            XWPFParagraph paragraph = document.createParagraph();
            XWPFRun run = createRun(paragraph);
            for (int j = 0; j < 4; j++) {
                
                number1 = ThreadLocalRandom.current().nextInt(1, 9 + 1); // use before operation
                number2 = ThreadLocalRandom.current().nextInt(1, 9 + 1); // use after operation
                operation = randomOperation();
                
                run.addTab();
                String string = number1 + "  " + operation + "  " + number2 + "  = ";
                run.setText(string);
                run.addTab();
            }
            run.addBreak();
        }
        
        // Write the Document in file system
        try {
            FileOutputStream out = new FileOutputStream(new File("Improve-Your-Brand-Project.docx"));
            document.write(out);
            out.close();
            document.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("successully");
    }
    
    public static XWPFRun createRun(XWPFParagraph paragraph) {
        XWPFRun run = paragraph.createRun();
        run.setFontFamily("Times New Roman");
        run.setFontSize(15);
        // run.setBold(true);
        return run;
    }
    
    private static String randomOperation() {
        int operation = ThreadLocalRandom.current().nextInt(1, 2 + 1); // 2 operation: + , - 
        
        if (operation == 1)
            return "+";
        if (operation == 2)
            return "-";
        /*if (operation == 3)
            return "*";*/
        
        return "";
    }
    
}
