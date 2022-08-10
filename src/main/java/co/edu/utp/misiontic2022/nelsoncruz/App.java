package co.edu.utp.misiontic2022.nelsoncruz;

import co.edu.utp.misiontic2022.nelsoncruz.view.ReportesView;

public final class App {
    public static void main(String[] args) {

        /* ================== Consulta 1 ============================== */
        // var reportesView = new ReportesView();
        // reportesView.primerInforme();

        /* ================== Consulta 2 ============================== */
        var reportesView = new ReportesView();
        var clasificacion = "Casa Campestre";
        var ciudad1 = "Santa Marta";
        var ciudad2 = "Cartagena";
        var ciudad3 = "Barranquilla";
        reportesView.segundoInforme(clasificacion, ciudad1, ciudad2, ciudad3);


        /* ================== Consulta 3 ============================== */
        // var reportesView = new ReportesView();
        // reportesView.lideresQueMasGastan();

    }
}
