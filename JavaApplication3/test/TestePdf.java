/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.itextpdf.io.IOException;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import java.io.FileNotFoundException;
/**
 *
 * @author henri
 */
public class TestePdf {
public void Criarpdf() throws IOException, FileNotFoundException{
    PdfWriter writer = new PdfWriter("C:\\Users\\henri\\Documents\\Projeto Otica\\Teste\\helloWord.pdf");
    PdfDocument pdf = new PdfDocument(writer);
    Document document = new Document(pdf);
    document.add(new Paragraph("Hello World!"));
    document.close();
    }    
}
