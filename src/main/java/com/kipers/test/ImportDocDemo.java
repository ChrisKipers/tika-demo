package com.kipers.test;

import org.apache.tika.exception.TikaException;
import org.apache.tika.parser.AbstractParser;
import org.apache.tika.parser.microsoft.ooxml.OOXMLParser;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.net.URISyntaxException;


public class ImportDocDemo extends TikaDemo {
    public static void main(String[] args) throws IOException, URISyntaxException, TikaException, SAXException {
        (new ImportDocDemo()).runDemo();
    }

    @Override
    protected String getFileName() {
        return "data_exploration_notes.docx";
    }

    @Override
    protected AbstractParser getParser() {
        return new OOXMLParser();
    }
}
