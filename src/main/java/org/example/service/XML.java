package org.example.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.example.model.GP;

public class XML {
    XmlMapper xmlMapper = new XmlMapper();
    public GP getPlugins(String xml) throws JsonProcessingException {
        return  xmlMapper.readValue(xml, GP.class);
    }
}