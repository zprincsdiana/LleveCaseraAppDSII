package com.anys.lleve_casera_dv.model;

public class Opciones {

    public String txt_op;
    int img_id;

    public Opciones(String txt_op, int img_id) {
        this.txt_op = txt_op;
        this.img_id = img_id;
    }

    public int getImg_id() {
        return img_id;
    }

    public void setImg_id(int img_id) {
        this.img_id = img_id;
    }

    public String getTxt_op() {
        return txt_op;
    }

    public void setTxt_op(String txt_op) {
        this.txt_op = txt_op;
    }
}
