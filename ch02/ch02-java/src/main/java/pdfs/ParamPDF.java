package pdfs;

import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class ParamPDF {

    public static final String RESULT
        = "build/my.pdf";

    public static void main(String[] args)
    	throws DocumentException, IOException {
    	new ParamPDF().createPdf(RESULT, args[0]);
    }

    public void createPdf(String filename, String word)
	throws DocumentException, IOException {

        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream(filename));
        document.open();
        /*
        if(word.length == 0){
          word = "hello2";
        }
        */
        document.add(new Paragraph( word ));

        document.close();
    }
}
