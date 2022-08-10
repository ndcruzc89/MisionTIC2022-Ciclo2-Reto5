package co.edu.utp.misiontic2022.nelsoncruz.model.vo;

public class LideresVo {

    private Integer id;
    private String nombre;
    private String primerApellido;
    private String ciudadResidencia;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getCiudadResidencia() {
        return ciudadResidencia;
    }

    public void setCiudadResidencia(String ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    }

    @Override
    public String toString() {
        return String.format("%-9d %-10s %-17s %-20s", id, nombre, primerApellido, ciudadResidencia);
    }
}
