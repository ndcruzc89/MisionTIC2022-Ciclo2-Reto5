package co.edu.utp.misiontic2022.nelsoncruz.view;

import java.util.List;

import co.edu.utp.misiontic2022.nelsoncruz.controller.ReportesController;

import co.edu.utp.misiontic2022.nelsoncruz.model.vo.LideresVo;
import co.edu.utp.misiontic2022.nelsoncruz.model.vo.ProyectosPorClasificacionYCiudadVo;
import co.edu.utp.misiontic2022.nelsoncruz.model.vo.ProyectosPorProveedorYCiudadVo;

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

    public void primerInforme() {
        System.out.println(repitaCaracter('=', 36) + "PRIMER INFORME"
                + repitaCaracter('=', 37));
        System.out.println(String.format("%-9s %-10s %-17s %-20s",
                "ID LIDER", "NOMBRE", "PRIMER APELLIDO", "CIUDAD RESIDENCIA"));
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

    public void segundoInforme() {
        System.out.println(repitaCaracter('=', 36) + ""
                + repitaCaracter('=', 37));
        System.out.println(String.format("%-13s %-23s %-21s %-15s",
                "ID PROYECTO", "CONSTRUCTORA", "HABITACIONES", "CIUDAD"));
        System.out.println(repitaCaracter('-', 105));
        // TODO Imprimir en pantalla la información del proyecto
        try {
            List<ProyectosPorClasificacionYCiudadVo> proyectos = controlador
                    .listarProyectosPorClasificacionYCiudad();
            proyectos.forEach(System.out::println);
        } catch (Exception ex) {
            System.err.println("Error: " + ex);
            ex.printStackTrace();
        }
    }


    public void tercerInforme() {
        System.out.println(repitaCaracter('=', 36) + ""
                + repitaCaracter('=', 37));
        System.out.println(String.format("%-11s %-23s %-21s",
                "ID_COMPRA", "CONSTRUCTORA", "BANCO_VINCULADO"));
        System.out.println(repitaCaracter('-', 105));
        // TODO Imprimir en pantalla la información del proyecto
        try {
            List<ProyectosPorProveedorYCiudadVo> proyectos = controlador
                    .listarProyectosPorProveedorYCiudad();
            proyectos.forEach(System.out::println);
        } catch (Exception ex) {
            System.err.println("Error: " + ex);
            ex.printStackTrace();
        }
    }
}
