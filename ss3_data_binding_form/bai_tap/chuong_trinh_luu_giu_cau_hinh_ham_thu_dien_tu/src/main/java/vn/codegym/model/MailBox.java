package vn.codegym.model;

import java.util.Objects;

public class MailBox {
    private String languages;
    private int pageSize;
    private boolean spams;
    private String signature;

    public MailBox(String languages, int pageSize, boolean spams, String signature) {
        this.languages = languages;
        this.pageSize = pageSize;
        this.spams = spams;
        this.signature = signature;
    }

    public MailBox() {
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public boolean isSpams() {
        return spams;
    }

    public void setSpams(boolean spams) {
        this.spams = spams;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    @Override
    public String toString() {
        return "MailBox{" +
                "languages='" + languages + '\'' +
                ", pageSize=" + pageSize +
                ", spams=" + spams +
                ", signature='" + signature + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MailBox mailBox = (MailBox) o;
        return pageSize == mailBox.pageSize;
    }

}
