package co.edu.utp.misiontic2022.nelsoncruz.controller;

import java.sql.SQLException;
import java.util.List;

import co.edu.utp.misiontic2022.nelsoncruz.model.dao.LideresDao;
import co.edu.utp.misiontic2022.nelsoncruz.model.dao.ProyectosPorClasificacionYCiudadDao;
import co.edu.utp.misiontic2022.nelsoncruz.model.vo.LideresVo;
import co.edu.utp.misiontic2022.nelsoncruz.model.vo.ProyectosPorClasificacionYCiudadVo;

public class ReportesController {

    private LideresDao lideresDao;
    private ProyectosPorClasificacionYCiudadDao proyectosPorClasificacionYCiudadDao;

    public ReportesController() {
        lideresDao = new LideresDao();
        proyectosPorClasificacionYCiudadDao = new ProyectosPorClasificacionYCiudadDao();

    }

    public List<LideresVo> listarLideres() throws SQLException {
        return lideresDao.listar();

    }

    public List<ProyectosPorClasificacionYCiudadVo> listarProyectosPorClasificacionYCiudad(String clasificacion, String ciudad1, String ciudad2, String ciudad3) throws SQLException {
        return proyectosPorClasificacionYCiudadDao.listar(clasificacion, ciudad1,ciudad2, ciudad3);
    }


    // public List<DeudasPorProyectoVo> listarTotalAdeudadoPorProyectos(Double
    // limiteInferior) throws SQLException {
    // return deudasPorProyectoDao.listar(limiteInferior);
    // }

    // public List<ComprasDeLiderVo> listarlideresQueMasGastan() throws SQLException
    // {
    // return comprasDeLiderDao.listar();
    // }
}
