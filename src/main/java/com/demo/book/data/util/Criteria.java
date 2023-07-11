package com.demo.book.data.util;

import lombok.Data;


public class Criteria {
    private int pageNum;
    private int amount;
    private String type;
    private String keyword;

    public Criteria() {
        this(0, 10);
    }

    public String[] getTypeArr() {
        return type == null || type.isEmpty() ? new String[] {} : type.split("");
    }

    public Criteria(int pageNum, int amount) {
        this.pageNum = pageNum;
        this.amount = amount;
    }
}
