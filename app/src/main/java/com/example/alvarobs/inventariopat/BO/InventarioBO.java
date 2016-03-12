package com.example.alvarobs.inventariopat.BO;

import com.example.alvarobs.inventariopat.DAO.InventarioDAO;
import com.example.alvarobs.inventariopat.VO.PatrimonioVO;

/**
 * Created by alvin on 12/03/2016.
 */
public class InventarioBO {
    private InventarioDAO dao;

    public InventarioBO(){
        dao = new InventarioDAO();

    }
public void cadastrarPatrimonio(PatrimonioVO patrimonio){
    dao.salvar(patrimonio);
}
}
