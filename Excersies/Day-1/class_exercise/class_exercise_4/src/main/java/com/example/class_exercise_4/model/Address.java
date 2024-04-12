package com.example.class_exercise_4.model;

public class Address {
     private String name,streetname,area,district,state,country;
     private int doorno,pincode;
     public Address(String name, String streetname, String area, String district, String state, String country,
               int doorno, int pincode) {
          this.name = name;
          this.streetname = streetname;
          this.area = area;
          this.district = district;
          this.state = state;
          this.country = country;
          this.doorno = doorno;
          this.pincode = pincode;
     }
     public String getName() {
          return name;
     }
     public void setName(String name) {
          this.name = name;
     }
     public String getStreetname() {
          return streetname;
     }
     public void setStreetname(String streetname) {
          this.streetname = streetname;
     }
     public String getArea() {
          return area;
     }
     public void setArea(String area) {
          this.area = area;
     }
     public String getDistrict() {
          return district;
     }
     public void setDistrict(String district) {
          this.district = district;
     }
     public String getState() {
          return state;
     }
     public void setState(String state) {
          this.state = state;
     }
     public String getCountry() {
          return country;
     }
     public void setCountry(String country) {
          this.country = country;
     }
     public int getDoorno() {
          return doorno;
     }
     public void setDoorno(int doorno) {
          this.doorno = doorno;
     }
     public int getPincode() {
          return pincode;
     }
     public void setPincode(int pincode) {
          this.pincode = pincode;
     }
     
}
