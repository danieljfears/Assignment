package danieljfears.assignment;

import java.io.Serializable;

public class TopLocationObject implements Serializable {

    private String cityName;
    private String countryName;
    private Integer flagResource;
    private String mapPictureURL;
    private String woeid;

    public String getCityName() {
    return cityName;
    }

    public String getCountryName() {
        return countryName;
    }

    public Integer getFlagResource() {
        return flagResource;
    }

    public String getMapPictureURL() {
        return mapPictureURL;
    }

    public String getWoeid() {
        return woeid;
    }

    public TopLocationObject(String cityName, String countryName, Integer flagResource, String mapPictureURL, String woeid) {
        this.cityName = cityName;
        this.countryName = countryName;
        this.flagResource = flagResource;
        this.mapPictureURL = mapPictureURL;
        this.woeid = woeid;
    }


}
