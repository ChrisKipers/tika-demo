package com.kipers.test;

import org.apache.tika.exception.TikaException;
import org.apache.tika.parser.AbstractParser;
import org.apache.tika.parser.html.HtmlParser;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.net.URISyntaxException;

public class ImportHTMLDemo extends TikaDemo {
    public static void main(String[] args) throws URISyntaxException, TikaException, SAXException, IOException {
        (new ImportHTMLDemo()).runDemo();
    }

    @Override
    protected String getFileName() {
        return "tika.html";
    }

    @Override
    protected AbstractParser getParser() {
        return new HtmlParser();
    }
}
