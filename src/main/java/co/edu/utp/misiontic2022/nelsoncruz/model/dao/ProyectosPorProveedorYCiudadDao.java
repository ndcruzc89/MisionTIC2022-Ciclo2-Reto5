package co.edu.utp.misiontic2022.nelsoncruz.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.edu.utp.misiontic2022.nelsoncruz.model.vo.ProyectosPorProveedorYCiudadVo;
import co.edu.utp.misiontic2022.nelsoncruz.util.JDBCUtilities;

public class ProyectosPorProveedorYCiudadDao {

    public List<ProyectosPorProveedorYCiudadVo> listar() throws SQLException {
        List<ProyectosPorProveedorYCiudadVo> respuesta = new ArrayList<>();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rset = null;
        try {
            conn = JDBCUtilities.getConnection();
            var sql = "SELECT L.NOMBRE ||' '||L.PRIMER_APELLIDO ||' '||L.SEGUNDO_APELLIDO AS LIDER,"
                    + "       SUM(C.CANTIDAD * MC.PRECIO_UNIDAD) AS VALOR"
                    + " FROM LIDER L"
                    + " JOIN PROYECTO P ON (P.ID_LIDER = L.ID_LIDER)"
                    + " JOIN COMPRA C ON (P.ID_PROYECTO = C.ID_PROYECTO)"
                    + " JOIN MATERIALCONSTRUCCION MC ON (C.ID_MATERIALCONSTRUCCION = MC.ID_MATERIALCONSTRUCCION)"
                    + " GROUP BY LIDER"
                    + " ORDER BY VALOR DESC"
                    + " LIMIT 10;";
            stmt = conn.prepareStatement(sql);
            rset = stmt.executeQuery();
            while (rset.next()) {
                var vo = new ProyectosPorProveedorYCiudadVo();
                vo.setLider(rset.getString("lider"));
                vo.setValor(rset.getDouble("valor"));

                respuesta.add(vo);
            }
        } finally {
            if (rset != null) {
                rset.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return respuesta;
    }
}
