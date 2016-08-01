package dev.kropla.service;

import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

/**
 * Created by kropla on 01.08.16.
 */
public class FileParser {

    File file;

    public void parse() {

        try{
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser saxParser = factory.newSAXParser();

        DefaultHandler handler = new DefaultHandler() {


        };

        } catch (Exception ex){

        }
    }