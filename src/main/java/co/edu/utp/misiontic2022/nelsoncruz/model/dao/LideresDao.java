package co.edu.utp.misiontic2022.nelsoncruz.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.edu.utp.misiontic2022.nelsoncruz.model.vo.LideresVo;
import co.edu.utp.misiontic2022.nelsoncruz.util.JDBCUtilities;

public class LideresDao {

    public List<LideresVo> listar() throws SQLException {
        List<LideresVo> respuesta = new ArrayList<>();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rset = null;
        try {
            conn = JDBCUtilities.getConnection();
            var sql = "SELECT ID_Lider, Nombre, Primer_Apellido, Ciudad_Residencia"
                    + " FROM Lider"
                    + " ORDER BY Ciudad_Residencia;";
            stmt = conn.prepareStatement(sql);
            rset = stmt.executeQuery();
            while (rset.next()) {
                var vo = new LideresVo();
                vo.setId(rset.getInt("ID_Lider"));
                vo.setNombre(rset.getString("Nombre"));
                vo.setPrimerApellido(rset.getString("Primer_Apellido"));
                vo.setCiudadResidencia(rset.getString("Ciudad_Residencia"));

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
