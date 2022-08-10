package co.edu.utp.misiontic2022.nelsoncruz.model.vo;

public class ProyectosPorClasificacionYCiudadVo {

    private Integer id;
    private String constructora;
    private Integer habitaciones;
    private String ciudad;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getConstructora() {
        return constructora;
    }

    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    public Integer getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(Integer habitaciones) {
        this.habitaciones = habitaciones;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return String.format("%-13d %-23s %-21d %-15s", id, constructora, habitaciones, ciudad);
    }
}
