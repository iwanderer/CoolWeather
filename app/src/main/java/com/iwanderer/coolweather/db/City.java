package com.iwanderer.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by leslie on 17-7-9.
 */

public class City extends DataSupport {
    private int id;
    private int cityCode;
    private String cityName;
    private int privonceId;

    public int getPrivonceId() {
        return privonceId;
    }

    public void setPrivonceId(int privonceId) {
        this.privonceId = privonceId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
