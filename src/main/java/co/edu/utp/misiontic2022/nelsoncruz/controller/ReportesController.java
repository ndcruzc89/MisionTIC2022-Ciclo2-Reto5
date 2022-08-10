package co.edu.utp.misiontic2022.nelsoncruz.controller;

import java.sql.SQLException;
import java.util.List;

import co.edu.utp.misiontic2022.nelsoncruz.model.dao.LideresDao;
import co.edu.utp.misiontic2022.nelsoncruz.model.dao.ProyectosPorClasificacionYCiudadDao;
import co.edu.utp.misiontic2022.nelsoncruz.model.dao.ProyectosPorProveedorYCiudadDao;
import co.edu.utp.misiontic2022.nelsoncruz.model.vo.LideresVo;
import co.edu.utp.misiontic2022.nelsoncruz.model.vo.ProyectosPorClasificacionYCiudadVo;
import co.edu.utp.misiontic2022.nelsoncruz.model.vo.ProyectosPorProveedorYCiudadVo;

public class ReportesController {

    private LideresDao lideresDao;
    private ProyectosPorClasificacionYCiudadDao proyectosPorClasificacionYCiudadDao;
    private ProyectosPorProveedorYCiudadDao proyectosPorProveedorYCiudadDao;

    public ReportesController() {
        lideresDao = new LideresDao();
        proyectosPorClasificacionYCiudadDao = new ProyectosPorClasificacionYCiudadDao();
        proyectosPorProveedorYCiudadDao = new ProyectosPorProveedorYCiudadDao();

    }

    public List<LideresVo> listarLideres() throws SQLException {
        return lideresDao.listar();

    }

    public List<ProyectosPorClasificacionYCiudadVo> listarProyectosPorClasificacionYCiudad() throws SQLException {
        return proyectosPorClasificacionYCiudadDao.listar();
    }

    public List<ProyectosPorProveedorYCiudadVo> listarProyectosPorProveedorYCiudad() throws SQLException {
        return proyectosPorProveedorYCiudadDao.listar();
    }

}
