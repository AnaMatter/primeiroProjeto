package modelo;

public class Produto {

    private Long id;
    private String descricao;
    private Long codigo;
    private String unMedida;
    private Double vlUnitario;
    private Boolean status;


    public Produto() {
        this.status = true;
    }

    public Produto(Long id, String descricao, Long codigo, String unMedida, Double vlUnitario) {
        this.id = id;
        this.descricao = descricao;
        this.codigo = codigo;
        this.unMedida = unMedida;
        this.vlUnitario = vlUnitario;
        this.status = true;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getUnMedida() {
        return unMedida;
    }

    public void setUnMedida(String unMedida) {
        this.unMedida = unMedida;
    }

    public Double getVlUnitario() {
        return vlUnitario;
    }

    public void setVlUnitario(Double vlUnitario) {
        this.vlUnitario = vlUnitario;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", codigo=" + codigo +
                ", unMedida='" + unMedida + '\'' +
                ", vlUnitario=" + vlUnitario +
                ", status=" + status +
                '}';
    }
}
