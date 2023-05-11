package org.example.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class GP {
    @JacksonXmlProperty(localName = "geoplugin_request")
    private String request;
    @JacksonXmlProperty(localName = "geoplugin_status")
    private String status;
    @JacksonXmlProperty(localName = "geoplugin_delay")
    private String delay;
    @JacksonXmlProperty(localName = "geoplugin_credit")
    private String credit;
    @JacksonXmlProperty(localName = "geoplugin_city")
    private String city;
    @JacksonXmlProperty(localName = "geoplugin_region")
    private String region;
    @JacksonXmlProperty(localName = "geoplugin_regionCode")
    private String regionCode;
    @JacksonXmlProperty(localName = "geoplugin_regionName")
    private String regionName;
    @JacksonXmlProperty(localName = "geoplugin_countryCode")
    private String countryCode;
    @JacksonXmlProperty(localName = "geoplugin_countryName")
    private String countryName;
    @JacksonXmlProperty(localName = "geoplugin_inEU")
    private String inEU;
    @JacksonXmlProperty(localName = "geoplugin_continentCode")
    private String continentCode;
    @JacksonXmlProperty(localName = "geoplugin_continentName")
    private String continentName;
    @JacksonXmlProperty(localName = "geoplugin_latitude")
    private String latitude;
    @JacksonXmlProperty(localName = "geoplugin_longitude")
    private String longitude;
    @JacksonXmlProperty(localName = "geoplugin_locationAccuracyRadius")
    private String locationAccuracyRadius;
    @JacksonXmlProperty(localName = "geoplugin_timezone")
    private String timezone;
    @JacksonXmlProperty(localName = "geoplugin_currencyCode")
    private String currencyCode;
    @JacksonXmlProperty(localName = "geoplugin_currencySymbol")
    private String currencySymbol;
    @JacksonXmlProperty(localName = "geoplugin_currencySymbol_UTF8")
    private String currencySymbol_UTF8;
    @JacksonXmlProperty(localName = "geoplugin_currencyConverter")
    private String currencyConverter;

    @Override
    public String toString() {
        return "GeoPlugins{" +
                "geoplugin_request='" + request + '\'' + "\n" +
                " geoplugin_status='" + status + '\'' + "\n" +
                " geoplugin_delay='" + delay + '\'' + "\n" +
                " geoplugin_credit=" + credit + "\n" +
                " geoplugin_city='" + city + '\'' + "\n" +
                " geoplugin_region='" + region + '\'' + "\n" +
                " geoplugin_regionCode='" + regionCode + '\'' + "\n" +
                " geoplugin_regionName='" + regionName + '\'' + "\n" +
                " geoplugin_countryCode='" + countryCode + '\'' + "\n" +
                " geoplugin_countryName='" + countryName + '\'' + "\n" +
                " geoplugin_inEU='" + inEU + '\'' + "\n" +
                " geoplugin_continentCode='" + continentCode + '\'' + "\n" +
                " geoplugin_continentName='" + continentName + '\'' + "\n" +
                " geoplugin_latitude='" + latitude + '\'' + "\n" +
                " geoplugin_longitude='" + longitude + '\'' + "\n" +
                " geoplugin_locationAccuracyRadius='" + locationAccuracyRadius + '\'' + "\n" +
                " geoplugin_timezone='" + timezone + '\'' + "\n" +
                " geoplugin_currencyCode='" + currencyCode + '\'' + "\n" +
                " geoplugin_currencySymbol='" + currencySymbol + '\'' + "\n" +
                " geoplugin_currencySymbol_UTF8='" + currencySymbol_UTF8 + '\'' + "\n" +
                " geoplugin_currencyConverter='" + currencyConverter + '\'' +
                '}';
    }
}