package com.dsv.assignment6.model;

import java.util.ArrayList;

public class LibraryData {
   private ArrayList<String> bookReturn;
   private ArrayList<String> bookCheckout;
   private ArrayList<String> bookNames;

    public ArrayList<String> getBookReturn() {
        return bookReturn;
    }

    public void setBookReturn(ArrayList<String> bookReturn) {
        this.bookReturn = bookReturn;
    }

    public ArrayList<String> getBookCheckout() {
        return bookCheckout;
    }

    public void setBookCheckout(ArrayList<String> bookCheckout) {
        this.bookCheckout = bookCheckout;
    }

    public ArrayList<String> getBookNames() {
        return bookNames;
    }

    public void setBookNames(ArrayList<String> bookNames) {
        this.bookNames = bookNames;
    }
}
