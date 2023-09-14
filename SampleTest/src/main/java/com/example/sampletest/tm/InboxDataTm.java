package com.example.sampletest.tm;

public class InboxDataTm {


    private String date;
    private String unit;
    private String id;
    private String name;

    public InboxDataTm() {
    }

    public InboxDataTm(String date, String unit, String id, String name) {
        this.date = date;
        this.unit = unit;
        this.id = id;
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "InboxDataTm{" +
                "date='" + date + '\'' +
                ", unit='" + unit + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
