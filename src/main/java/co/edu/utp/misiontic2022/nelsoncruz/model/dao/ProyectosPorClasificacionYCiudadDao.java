package co.edu.utp.misiontic2022.nelsoncruz.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.edu.utp.misiontic2022.nelsoncruz.model.vo.ProyectosPorClasificacionYCiudadVo;
import co.edu.utp.misiontic2022.nelsoncruz.util.JDBCUtilities;

public class ProyectosPorClasificacionYCiudadDao {

    public List<ProyectosPorClasificacionYCiudadVo> listar(String clasificacion,
            String ciudad1, String ciudad2,
            String ciudad3) throws SQLException {
        List<ProyectosPorClasificacionYCiudadVo> respuesta = new ArrayList<>();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rset = null;
        try {
            conn = JDBCUtilities.getConnection();
            var sql = "SELECT ID_Proyecto, Constructora, Numero_Habitaciones, Ciudad"
                    + " FROM Proyecto"
                    + " WHERE Clasificacion = ?"
                    + " AND Ciudad IN (?, ?, ?);";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, clasificacion);
            stmt.setString(2, ciudad1);
            stmt.setString(3, ciudad2);
            stmt.setString(4, ciudad3);

            rset = stmt.executeQuery();
            while (rset.next()) {
                var vo = new ProyectosPorClasificacionYCiudadVo();
                vo.setId(rset.getInt("ID_Proyecto"));
                vo.setConstructora(rset.getString("Constructora"));
                vo.setHabitaciones(rset.getInt("Numero_Habitaciones"));
                vo.setCiudad(rset.getString("Ciudad"));

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
