package com.optimizatecnologia.optimizatecnologia.optimiza;

import java.io.Serializable;

/**
 * Created by Usuario on 26/05/2015.
 */
public class Firm implements Serializable {
    private String firmcode;
    private String firmniff;
    private String firmnamecome;
    private String firmTel1;
    private String firmdire;
    private String firmPolbDesc;
    private String firmProvDesc;
    private String firmmail;

    public Firm(String firmcode, String firmniff, String firmnamecome, String firmTel1) {
        this.firmcode = firmcode;
        this.firmniff = firmniff;
        this.firmnamecome = firmnamecome;
        this.firmTel1 = firmTel1;
    }

    public Firm(String firmcode) {
        this.firmcode = firmcode;
    }

    public Firm() {
    }

    @Override
    public String toString() {
        return "Firm{" +
                "firmcode='" + firmcode + '\'' +
                ", firmnamecome='" + firmnamecome + '\'' +
                '}';
    }

    public String getFirmcode() {
        return firmcode;
    }

    public void setFirmcode(String firmcode) {
        this.firmcode = firmcode;
    }

    public String getFirmniff() {
        return firmniff;
    }

    public void setFirmniff(String firmniff) {
        this.firmniff = firmniff;
    }

    public String getFirmnamecome() {
        return firmnamecome;
    }

    public void setFirmnamecome(String firmnamecome) {
        this.firmnamecome = firmnamecome;
    }

    public String getFirmTel1() {
        return firmTel1;
    }

    public void setFirmTel1(String firmTel1) {
        this.firmTel1 = firmTel1;
    }

    public String getFirmdire() {
        return firmdire;
    }

    public void setFirmdire(String firmdire) {
        this.firmdire = firmdire;
    }

    public String getFirmPolbDesc() {
        return firmPolbDesc;
    }

    public void setFirmPolbDesc(String firmPolbDesc) {
        this.firmPolbDesc = firmPolbDesc;
    }

    public String getFirmProvDesc() {
        return firmProvDesc;
    }

    public void setFirmProvDesc(String firmProvDesc) {
        this.firmProvDesc = firmProvDesc;
    }

    public String getFirmmail() {
        return firmmail;
    }

    public void setFirmmail(String firmmail) {
        this.firmmail = firmmail;
    }
}

