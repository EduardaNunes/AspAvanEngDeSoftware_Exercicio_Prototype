package org.example.prototype;

public class Questao implements Cloneable {
    private String enunciado;
    private Integer valor;

    public Questao(String enunciado, Integer valor) {
        super();
        this.enunciado = enunciado;
        this.valor = valor;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Questao{" +
                "enunciado='" + enunciado + '\'' +
                ", valor=" + valor +
                '}';
    }
}
