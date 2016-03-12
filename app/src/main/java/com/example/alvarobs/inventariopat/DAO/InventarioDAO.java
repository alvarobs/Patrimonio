package com.example.alvarobs.inventariopat.DAO;

import com.example.alvarobs.inventariopat.VO.LocalVO;
import com.example.alvarobs.inventariopat.VO.PatrimonioVO;

import java.util.ArrayList;

/**
 * Created by alvin on 12/03/2016.
 */
public class InventarioDAO {
    private ArrayList<PatrimonioVO> bancoInventario;
    private LocalVO local = new LocalVO();
    public InventarioDAO(){
        bancoInventario = new ArrayList<PatrimonioVO>();

    }

    public void salvar (PatrimonioVO patrimonio){
        bancoInventario.add(patrimonio);
    }

    public LocalVO getLocal() {
        return local;
    }

    public void setLocal(LocalVO local) {
        this.local = local;
    }
}
