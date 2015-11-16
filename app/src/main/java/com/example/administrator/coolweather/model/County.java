package com.example.administrator.coolweather.model;

/**
 * Created by Administrator on 2015/11/16 0016.
 */
public class County {

    private int id;
    private String countyName;
    private String countyCode;
    private int cityId;

    public void setid(int id) {
        this.id=id;
    }

    public String getCountyName(){
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName=countyName;
    }

    public String getCountyCode(){
        return countyCode;
    }

    public void setCountyCode(String countyCode) {
        this.countyCode=countyCode;
    }

    public int getCityId(){
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId=cityId;
    }
}
