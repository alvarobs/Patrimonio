package com.example.alvarobs.inventariopat.VO;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by alvin on 12/03/2016.
 */
public class LocalVO implements Serializable{
    private String local;
    private String idLocal;
    private String coordenadasGPS;
    private Date dataHoraCad;


    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(String idLocal) {
        this.idLocal = idLocal;
    }

    public String getCoordenadasGPS() {
        return coordenadasGPS;
    }

    public void setCoordenadasGPS(String coordenadasGPS) {
        this.coordenadasGPS = coordenadasGPS;
    }

    public Date getDataHoraCad() {
        return dataHoraCad;
    }

    public void setDataHoraCad(Date dataHoraCad) {
        this.dataHoraCad = dataHoraCad;
    }
}
