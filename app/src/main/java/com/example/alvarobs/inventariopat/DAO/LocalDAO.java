package com.example.alvarobs.inventariopat.DAO;

import com.example.alvarobs.inventariopat.VO.LocalVO;

import java.util.ArrayList;

/**
 * Created by alvin on 12/03/2016.
 */
public class LocalDAO {
    private ArrayList<LocalVO> banco;

    public LocalDAO(){
        banco = new ArrayList<LocalVO>();
    }

    public void salvar(LocalVO local){
        banco.add(local);
    }
}
