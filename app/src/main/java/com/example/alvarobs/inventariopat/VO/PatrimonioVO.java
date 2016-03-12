package com.example.alvarobs.inventariopat.VO;

import java.util.Date;

/**
 * Created by alvin on 12/03/2016.
 */
public class PatrimonioVO {

    private String numPatrimonio;
    private String descricao;
    private String coordenadasGPS;
    private Date dataHoraCaptura;

    public String getNumPatrimonio() {
        return numPatrimonio;
    }

    public void setNumPatrimonio(String numPatrimonio) {
        this.numPatrimonio = numPatrimonio;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCoordenadasGPS() {
        return coordenadasGPS;
    }

    public void setCoordenadasGPS(String coordenadasGPS) {
        this.coordenadasGPS = coordenadasGPS;
    }

    public Date getDataHoraCaptura() {
        return dataHoraCaptura;
    }

    public void setDataHoraCaptura(Date dataHoraCaptura) {
        this.dataHoraCaptura = dataHoraCaptura;
    }
}
