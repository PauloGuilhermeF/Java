package JavaCore.ZZCjdbc.classes;

import java.util.Objects;

public class Carro {
    private Integer id;
    private String nome;
    private String placa;
    private Comprador comprador;

    public Carro( ) {

    }

    public Carro(Integer id, String nome, String placa, Comprador comprador) {
        this.id = id;
        this.nome = nome;
        this.placa = placa;
        this.comprador = comprador;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return Objects.equals(id, carro.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Comprador getComprador() {
        return comprador;
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
