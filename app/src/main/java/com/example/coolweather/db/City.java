package com.example.coolweather.db;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.coolweather.R;

import org.litepal.crud.DataSupport;

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;

    public int getId(){
        return  id;
    }
    public void setId(){
        this.id=id;
    }
    public String getCityName(){
        return cityName;
    }
    public void setCityName(String name){
        this.cityName=cityName;
    }
    public int getCityCode(){
        return cityCode;
    }
    public void setCityCode(int id){
        this.cityCode=cityCode;
    }
    public int getProvinceId(){
        return provinceId;
    }
    public void setProvinceId(int provinceId){
        this.provinceId= this.provinceId;
    }

}
