package co.edu.utp.misiontic2022.nelsoncruz.view;

import java.util.List;

import co.edu.utp.misiontic2022.nelsoncruz.controller.ReportesController;

import co.edu.utp.misiontic2022.nelsoncruz.model.vo.LideresVo;
import co.edu.utp.misiontic2022.nelsoncruz.model.vo.ProyectosPorClasificacionYCiudadVo;

public class ReportesView {

    private ReportesController controlador;

    public ReportesView() {
        controlador = new ReportesController();
    }

    private String repitaCaracter(Character caracter, Integer veces) {
        String respuesta = "";
        for (int i = 0; i < veces; i++) {
            respuesta += caracter;
        }
        return respuesta;
    }

    // public void proyectosFinanciadosPorBanco(String banco) {
    // System.out.println(repitaCaracter('=', 36) + " LISTADO DE PROYECTOS POR BANCO
    // "
    // + repitaCaracter('=', 37));
    // if (banco != null && !banco.isBlank()) {
    // System.out.println(String.format("%3s %-25s %-20s %-15s %-7s %-30s",
    // "ID", "CONSTRUCTORA", "CIUDAD", "CLASIFICACION", "ESTRATO", "LIDER"));
    // System.out.println(repitaCaracter('-', 105));
    // // TODO Imprimir en pantalla la información del proyecto
    // try {
    // List<ProyectoBancoVo> proyectosBanco =
    // controlador.listarProyectosFinanciadosPorBanco(banco);
    // proyectosBanco.forEach(System.out::println);
    // } catch (Exception ex) {
    // System.err.println("Error: " + ex);
    // ex.printStackTrace();
    // }
    // }
    // }

    public void primerInforme() {
        System.out.println(repitaCaracter('=', 36) + "PRIMER INFORME"
                + repitaCaracter('=', 37));
        System.out.println(String.format("%-9s %-10s %-17s %-20s",
                "ID_LIDER", "NOMBRE", "PRIMER_APELLIDO", "CIUDAD_DE_RESIDENCIA"));
        System.out.println(repitaCaracter('-', 105));
        // TODO Imprimir en pantalla la información del proyecto
        try {
            List<LideresVo> lideres = controlador.listarLideres();
            lideres.forEach(System.out::println);
        } catch (Exception ex) {
            System.err.println("Error: " + ex);
            ex.printStackTrace();
        }
    }

    public void segundoInforme(String clasificacion, String ciudad1, String ciudad2, String ciudad3) {
        System.out.println(repitaCaracter('=', 36) + ""
                + repitaCaracter('=', 37));
        System.out.println(String.format("%-13s %-23s %-21s %-15s",
                "ID_PROYECTO", "CONSTRUCTORA", "NUMERO_HABITACIONES", "CIUDAD"));
        System.out.println(repitaCaracter('-', 105));
        // TODO Imprimir en pantalla la información del proyecto
        try {
            List<ProyectosPorClasificacionYCiudadVo> proyectos = controlador
                    .listarProyectosPorClasificacionYCiudad(clasificacion, ciudad1, ciudad2, ciudad3);
            proyectos.forEach(System.out::println);
        } catch (Exception ex) {
            System.err.println("Error: " + ex);
            ex.printStackTrace();
        }
    }

    // public void totalAdeudadoPorProyectosSuperioresALimite(Double limiteInferior)
    // {
    // System.out.println(repitaCaracter('=', 1) + " TOTAL DEUDAS POR PROYECTO "
    // + repitaCaracter('=', 1));
    // if (limiteInferior != null) {
    // System.out.println(String.format("%3s %14s", "ID", "VALOR "));
    // System.out.println(repitaCaracter('-', 29));
    // // TODO Imprimir en pantalla la información del total adeudado
    // try {
    // List<DeudasPorProyectoVo> deudasProyecto =
    // controlador.listarTotalAdeudadoPorProyectos(limiteInferior);
    // deudasProyecto.forEach(System.out::println);
    // } catch (Exception ex) {
    // System.err.println("Error: " + ex);
    // ex.printStackTrace();
    // }
    // }
    // }

    // String.format("%3d %,15.1f", id, valor);

    // public void lideresQueMasGastan() {
    // System.out.println(repitaCaracter('=', 6) + " 10 LIDERES MAS COMPRADORES "
    // + repitaCaracter('=', 7));
    // System.out.println(String.format("%-25s %14s", "LIDER", "VALOR "));
    // System.out.println(repitaCaracter('-', 41));
    // // TODO Imprimir en pantalla la información de los líderes
    // try {
    // List<ComprasDeLiderVo> comprasLider =
    // controlador.listarlideresQueMasGastan();
    // comprasLider.forEach(System.out::println);
    // } catch (Exception ex) {
    // System.err.println("Error: " + ex);
    // ex.printStackTrace();
    // }
    // }
}
