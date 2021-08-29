package com.com.recycleviewimg2;

public class Item {
    int num;
    int ivImg;
    int tvText;

    public Item(int num, int ivImg, int tvText) {
        this.num = num;
        this.ivImg = ivImg;
        this.tvText = tvText;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getIvImg() {
        return ivImg;
    }

    public void setIvImg(int ivImg) {
        this.ivImg = ivImg;
    }

    public int getTvText() {
        return tvText;
    }

    public void setTvText(int tvText) {
        this.tvText = tvText;
    }
}
