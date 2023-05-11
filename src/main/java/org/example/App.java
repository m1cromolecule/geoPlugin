package org.example;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.example.model.GP;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;
import org.example.service.XML;
import org.example.service.RS;

public class App {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File("geoPlugin.xml"));
        List<GP> geoPluginsList = new ArrayList<>();
        NodeList nodeList = document.getElementsByTagName("geoPlugin");

        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);

            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                String request = element.getElementsByTagName("geoplugin_request").item(0).getTextContent();
                String status = element.getElementsByTagName("geoplugin_status").item(0).getTextContent();
                String delay = element.getElementsByTagName("geoplugin_delay").item(0).getTextContent();
                String credit = element.getElementsByTagName("geoplugin_credit").item(0).getTextContent();
                String city = element.getElementsByTagName("geoplugin_city").item(0).getTextContent();
                String region = element.getElementsByTagName("geoplugin_region").item(0).getTextContent();
                String regionCode = element.getElementsByTagName("geoplugin_regionCode").item(0).getTextContent();
                String regionName = element.getElementsByTagName("geoplugin_regionName").item(0).getTextContent();
                String countryCode = element.getElementsByTagName("geoplugin_countryCode").item(0).getTextContent();
                String countryName = element.getElementsByTagName("geoplugin_countryName").item(0).getTextContent();
                String inEU = element.getElementsByTagName("geoplugin_inEU").item(0).getTextContent();
                String continentCode = element.getElementsByTagName("geoplugin_continentCode").item(0).getTextContent();
                String continentName = element.getElementsByTagName("geoplugin_continentName").item(0).getTextContent();
                String latitude = element.getElementsByTagName("geoplugin_latitude").item(0).getTextContent();
                String longitude = element.getElementsByTagName("geoplugin_longitude").item(0).getTextContent();
                String locationAccuracyRad = element.getElementsByTagName("geoplugin_locationAccuracyRadius").item(0).getTextContent();
                String timezone = element.getElementsByTagName("geoplugin_timezone").item(0).getTextContent();
                String curCode = element.getElementsByTagName("geoplugin_currencyCode").item(0).getTextContent();
                String curSymb = element.getElementsByTagName("geoplugin_currencySymbol").item(0).getTextContent();
                String curSymbUTF8 = element.getElementsByTagName("geoplugin_currencySymbol_UTF8").item(0).getTextContent();
                String curConverter = element.getElementsByTagName("geoplugin_currencyConverter").item(0).getTextContent();

                geoPluginsList.add(new GP(request, status, delay, credit, city, region, regionCode, regionName,
                        countryCode, countryName, inEU, continentCode, continentName, latitude, longitude, locationAccuracyRad, timezone,
                        curCode, curSymb, curSymbUTF8, curConverter));
            }
        }
        System.out.println("DOMParser");
        for (GP geoPlugin : geoPluginsList) {
            System.out.println(geoPlugin.toString());
        }
        System.out.println();

        RS service = new RS();
        XML xmlMapper = new XML();
        String response = service.run("http://www.geoplugin.net/xml.gp?base_currency=USD");
        GP geoPlugins = xmlMapper.getPlugins(response);

        System.out.println("Jackson");
        System.out.println(geoPlugins);
    }
}