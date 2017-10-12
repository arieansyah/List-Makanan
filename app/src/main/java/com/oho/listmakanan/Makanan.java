package com.oho.listmakanan;

import org.w3c.dom.Text;

/**
 * Created by borneo on 05/10/17.
 */

public class Makanan {
    private String title, desc, bahan, prosedur;
    private int img;

    public Makanan(String title, String desc, String bahan, String prosedur, int img) {
        this.title = title;
        this.desc = desc;
        this.bahan = bahan;
        this.prosedur = prosedur;
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    public String getProsedur() {
        return prosedur;
    }

    public void setProsedur(String prosedur) {
        this.prosedur = prosedur;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
