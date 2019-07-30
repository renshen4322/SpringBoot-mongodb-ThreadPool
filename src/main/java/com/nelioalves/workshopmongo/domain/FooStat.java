package com.nelioalves.workshopmongo.domain;

import org.springframework.data.annotation.Id;

import java.io.Serializable;

public class FooStat implements Serializable {

    //@Id
    //private String id;
    private String upCenter;
    private String downCenter;
    private int upTicket;
    private int downTicket;
    private int deliveryNo; //有发未到
    private int getToNo; //有到未发

    public FooStat(){
        //this.id = null;
        this.upCenter = null;
        this.downCenter=null;
        this.upTicket = 0;
        this.downTicket = 0;
        this.deliveryNo = 0;
        this.getToNo = 0;
    }
    public FooStat sum(AllocateStat foo){
       //this.id= foo.getId();
       this.upCenter = foo.getUpCenter();
       this.downCenter = foo.getDownCenter();
       this.upTicket += foo.getUpTicket();
       this.downTicket += foo.getDownTicket();
       this.deliveryNo += foo.getDeliveryNo();
       this.getToNo += foo.getGetToNo();
        return this;
    }
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }

    public String getUpCenter() {
        return upCenter;
    }

    public void setUpCenter(String upCenter) {
        this.upCenter = upCenter;
    }

    public String getDownCenter() {
        return downCenter;
    }

    public void setDownCenter(String downCenter) {
        this.downCenter = downCenter;
    }

    public int getUpTicket() {
        return upTicket;
    }

    public void setUpTicket(int upTicket) {
        this.upTicket = upTicket;
    }

    public int getDownTicket() {
        return downTicket;
    }

    public void setDownTicket(int downTicket) {
        this.downTicket = downTicket;
    }

    public int getDeliveryNo() {
        return deliveryNo;
    }

    public void setDeliveryNo(int deliveryNo) {
        this.deliveryNo = deliveryNo;
    }

    public int getGetToNo() {
        return getToNo;
    }

    public void setGetToNo(int getToNo) {
        this.getToNo = getToNo;
    }


}
