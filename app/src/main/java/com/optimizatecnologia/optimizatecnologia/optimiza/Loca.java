package com.optimizatecnologia.optimizatecnologia.optimiza;

/**
 * Created by Usuario on 26/05/2015.
 */
public class Loca {
    private String locacode;
    private String locafirmtype;
    private Firm locafirmCode;
    private String locadesc;
    private String locaTel1;
    private String locadire;
    private String locaPolbDesc;
    private String locaProvDesc;
    private String locamail;

    @Override
    public String toString() {
        return "Loca{" +
                "locacode='" + locacode + '\'' +
                '}';
    }

    public Loca(String locacode, String locafirmtype) {
        this.locacode = locacode;
        this.locafirmtype = locafirmtype;
    }

    public Loca() {
    }

    public String getLocacode() {
        return locacode;
    }

    public void setLocacode(String locacode) {
        this.locacode = locacode;
    }

    public String getLocafirmtype() {
        return locafirmtype;
    }

    public void setLocafirmtype(String locafirmtype) {
        this.locafirmtype = locafirmtype;
    }

    public Firm getLocafirmCode() {
        return locafirmCode;
    }

    public void setLocafirmCode(Firm locafirmCode) {
        this.locafirmCode = locafirmCode;
    }

    public String getLocadesc() {
        return locadesc;
    }

    public void setLocadesc(String locadesc) {
        this.locadesc = locadesc;
    }

    public String getLocaTel1() {
        return locaTel1;
    }

    public void setLocaTel1(String locaTel1) {
        this.locaTel1 = locaTel1;
    }

    public String getLocadire() {
        return locadire;
    }

    public void setLocadire(String locadire) {
        this.locadire = locadire;
    }

    public String getLocaPolbDesc() {
        return locaPolbDesc;
    }

    public void setLocaPolbDesc(String locaPolbDesc) {
        this.locaPolbDesc = locaPolbDesc;
    }

    public String getLocaProvDesc() {
        return locaProvDesc;
    }

    public void setLocaProvDesc(String locaProvDesc) {
        this.locaProvDesc = locaProvDesc;
    }

    public String getLocamail() {
        return locamail;
    }

    public void setLocamail(String locamail) {
        this.locamail = locamail;
    }
}
