package org.example.prototype;

public class Prova implements Cloneable {
    private int codigo;
    private String disciplina;
    private Questao questao;
    private String turma;

    public Prova(int codigo, String disciplina, Questao questao, String turma) {
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.questao = questao;
        this.turma = turma;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Questao getQuestao() {
        return questao;
    }

    public void setQuestao(Questao questao) {
        this.questao = questao;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    @Override
    public Prova clone() throws CloneNotSupportedException {
        Prova provaClone = (Prova) super.clone();
        provaClone.questao = (Questao) provaClone.questao.clone();
        return provaClone;
    }

    @Override
    public String toString() {
        return "Prova{" +
                "codigo=" + codigo +
                ", disciplina='" + disciplina + '\'' +
                ", questao=" + questao +
                ", turma='" + turma + '\'' +
                '}';
    }
}
