package com.kipers.test;

import org.apache.tika.exception.TikaException;
import org.apache.tika.parser.AbstractParser;
import org.apache.tika.parser.pdf.PDFParser;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.net.URISyntaxException;


public class ImportPDFDemo extends TikaDemo {
    public static void main(String[] args) throws URISyntaxException, TikaException, SAXException, IOException {
        (new ImportPDFDemo()).runDemo();
    }

    @Override
    protected String getFileName() {
        return "problem_report.pdf";
    }

    @Override
    protected AbstractParser getParser() {
        return new PDFParser();
    }
}
