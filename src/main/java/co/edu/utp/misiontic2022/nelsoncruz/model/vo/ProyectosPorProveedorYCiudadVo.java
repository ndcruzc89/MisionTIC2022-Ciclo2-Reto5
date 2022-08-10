package co.edu.utp.misiontic2022.nelsoncruz.model.vo;

public class ProyectosPorProveedorYCiudadVo {

    private Integer id;
    private String constructora;
    private String bancoVinculado;

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

    public String getBancoVinculado() {
        return bancoVinculado;
    }

    public void setBancoVinculado(String bancoVinculado) {
        this.bancoVinculado = bancoVinculado;
    }

    @Override
    public String toString() {
        return String.format("%-11s %-23s %-21s", id, constructora, bancoVinculado);
    }

}
