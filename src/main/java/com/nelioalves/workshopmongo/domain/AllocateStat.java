package com.nelioalves.workshopmongo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collection="allocateStat")
public class AllocateStat implements Serializable {
    @Id
    private String id;
    private String upCenter;
    private String downCenter;
    private int upTicket;
    private int downTicket;
    private int deliveryNo; //有发未到
    private int getToNo; //有到未发
    public AllocateStat(){

    };
    public AllocateStat(String id,String upCenter,String downCenter,int upTicket,int downTicket,int deliveryNo,int getToNo){
        super();
        this.id= id;
        this.upCenter = upCenter;
        this.downCenter = downCenter;
        this.upTicket = upTicket;
        this.downTicket = downTicket;
        this.deliveryNo = deliveryNo;
        this.getToNo = getToNo;
    };
    public AllocateStat(String upCenter,String downCenter,int upTicket,int downTicket,int deliveryNo,int getToNo){
        this.upCenter = upCenter;
        this.downCenter = downCenter;
        this.upTicket = upTicket;
        this.downTicket = downTicket;
        this.deliveryNo = deliveryNo;
        this.getToNo = getToNo;
    };

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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
