package com.example.alvarobs.inventariopat.BO;

import com.example.alvarobs.inventariopat.DAO.LocalDAO;
import com.example.alvarobs.inventariopat.VO.LocalVO;

/**
 * Created by alvin on 12/03/2016.
 */
public class LocalBO {
        private LocalDAO dao;
        private LocalVO localDefinido;

        public LocalBO(){
            dao = new LocalDAO();
            localDefinido.setLocal("naocadastrado");
            localDefinido.setIdLocal("naocadastrado");
            localDefinido.setCoordenadasGPS("naocadastrado");

        }
        public void cadastrarLocal(LocalVO local){
            dao.salvar(local);
            localDefinido=local;
        }
        public void definirLocal(LocalVO local){
            this.localDefinido = local;
        }

}
