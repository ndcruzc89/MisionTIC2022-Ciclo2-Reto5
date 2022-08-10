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
            var sql = "SELECT c.ID_Compra, p.Constructora, p.Banco_Vinculado"
                    + " FROM Compra c"
                    + " JOIN Proyecto p ON (c.ID_Proyecto = p.ID_Proyecto)"
                    + " WHERE c.Proveedor = 'Homecenter'"
                    + " AND p.Ciudad = 'Salento';";
            stmt = conn.prepareStatement(sql);
            rset = stmt.executeQuery();
            while (rset.next()) {
                var vo = new ProyectosPorProveedorYCiudadVo();
                vo.setId(rset.getInt("ID_Compra"));
                vo.setConstructora(rset.getString("Constructora"));
                vo.setBancoVinculado(rset.getString("Banco_Vinculado"));

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
