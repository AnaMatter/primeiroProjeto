package modelo;

public class Cliente {

    private Long id;
    private String nome;
    private String email;
    private String tipo;
    private String documento;
    private Integer idade;

    public Cliente() {

    }
    public Cliente(Long id, String nome, String email, String tipo, String documento, Integer idade) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.tipo = tipo;
        this.documento = documento;
        this.idade = idade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }


    @Override //sobrescrita muda comportamento da mae (object)
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", tipo='" + tipo + '\'' +
                ", documento='" + documento + '\'' +
                ", idade=" + idade +
                '}';
    }

//    public Integer calcularIdade(Integer numero) {
//        return idade + numero;
//    }
//
//    public String alterarNome(String sobrenome) {
//        return nome + sobrenome;
//    }
//
//    public String corrigirEmail(
//
//    ) {
//        return this.email.trim();
//    }
    //    public String transformarNomeEmMinusculo() {
//        return this.nome.toLowerCase();
//    }
}
