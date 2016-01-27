package com.kipers.test;

import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.AbstractParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.sax.BodyContentHandler;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

abstract public class TikaDemo {
    public void runDemo() throws URISyntaxException, TikaException, SAXException, IOException {
        URL resource = ImportDocDemo.class.getClassLoader().getResource(getFileName());
        InputStream in = Files.newInputStream(Paths.get(resource.toURI()));

        BodyContentHandler handler = new BodyContentHandler();
        Metadata metadata = new Metadata();
        ParseContext pContext = new ParseContext();

        AbstractParser parser = getParser();
        parser.parse(in, handler, metadata, pContext);
        System.out.println("Contents of the file:" + handler.toString());
        System.out.println("Metadata of the file:");

        String[] metadataNames = metadata.names();
        for (String name: metadataNames) {
            System.out.println(name + ":" + metadata.get(name));
        }
    }

    abstract protected String getFileName();

    abstract protected AbstractParser getParser();
}
