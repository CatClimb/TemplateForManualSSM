package com.example.main.bean;



public class LabBean {

    private Integer id;

    private String labId;

    private String labType;

    public LabBean(Integer id, String labId, String labType) {
        this.id = id;
        this.labId = labId;
        this.labType = labType;
    }
    public LabBean() {

    }

    @Override
    public String toString() {
        return "LabBean{" +
                "id=" + id +
                ", labId='" + labId + '\'' +
                ", labType='" + labType + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLabId() {
        return labId;
    }

    public void setLabId(String labId) {
        this.labId = labId;
    }

    public String getLabType() {
        return labType;
    }

    public void setLabType(String labType) {
        this.labType = labType;
    }
}

