package com.book.BookProject;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {

    @Id
    private int bid;
    private String btitle;
    private String bauthor;
    private String bcategory;
    private int bprice;
    private int bavaliablecopies;

   
    public Book() {
    }


    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getBtitle() {
        return btitle;
    }

    public void setBtitle(String btitle) {
        this.btitle = btitle;
    }

    public String getBauthor() {
        return bauthor;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public String getBcategory() {
        return bcategory;
    }

    public void setBcategory(String bcategory) {
        this.bcategory = bcategory;
    }

    public int getBprice() {
        return bprice;
    }

    public void setBprice(int bprice) {
        this.bprice = bprice;
    }

    public int getBavaliablecopies() {
        return bavaliablecopies;
    }

    public void setBavaliablecopies(int bavaliablecopies) {
        this.bavaliablecopies = bavaliablecopies;
    }

    @Override
    public String toString() {
        return "Book [bid=" + bid +
               ", btitle=" + btitle +
               ", bauthor=" + bauthor +
               ", bcategory=" + bcategory +
               ", bprice=" + bprice +
               ", bavaliablecopies=" + bavaliablecopies + "]";
    }
}