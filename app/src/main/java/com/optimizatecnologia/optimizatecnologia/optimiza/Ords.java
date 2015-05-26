package com.optimizatecnologia.optimizatecnologia.optimiza;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Usuario on 26/05/2015.
 */
public class Ords implements Serializable {
    private int ords_key;
    private int ordsnumb;
    private String ordsstatcode;
    private Date ordsfechavis;
    private Loca ordslocaCode;
    private String ordsrefe;
    private String ordsobse;

    public Firm getFirmcode() {
        return firmcode;
    }

    public void setFirmcode(Firm firmcode) {
        this.firmcode = firmcode;
    }

    @Override
    public String toString() {
        return "Ords{" +
                "ordsnumb=" + ordsnumb +
                '}';
    }

    private Firm firmcode;

    public Ords(int ords_key) {
        this.ords_key = ords_key;
    }

    public Ords() {
    }

    public int getOrds_key() {
        return ords_key;
    }

    public void setOrds_key(int ords_key) {
        this.ords_key = ords_key;
    }

    public int getOrdsnumb() {
        return ordsnumb;
    }

    public void setOrdsnumb(int ordsnumb) {
        this.ordsnumb = ordsnumb;
    }

    public String getOrdsstatcode() {
        return ordsstatcode;
    }

    public void setOrdsstatcode(String ordsstatcode) {
        this.ordsstatcode = ordsstatcode;
    }

    public Date getOrdsfechavis() {
        return ordsfechavis;
    }

    public void setOrdsfechavis(Date ordsfechavis) {
        this.ordsfechavis = ordsfechavis;
    }

    public Loca getOrdslocaCode() {
        return ordslocaCode;
    }

    public void setOrdslocaCode(Loca ordslocaCode) {
        this.ordslocaCode = ordslocaCode;
    }

    public String getOrdsrefe() {
        return ordsrefe;
    }

    public void setOrdsrefe(String ordsrefe) {
        this.ordsrefe = ordsrefe;
    }

    public String getOrdsobse() {
        return ordsobse;
    }

    public void setOrdsobse(String ordsobse) {
        this.ordsobse = ordsobse;
    }
}
