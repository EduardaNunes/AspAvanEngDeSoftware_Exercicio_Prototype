package prototype;

import org.example.prototype.Prova;
import org.example.prototype.Questao;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProvaTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Prova prova = new Prova(123, "Prova Original", new Questao("Explique o padrão Prototype", 1), "Turma A");

        Prova provaClone = prova.clone();
        provaClone.setCodigo(456);
        provaClone.setDisciplina("Prova Clonada");
        provaClone.getQuestao().setValor(2);

        assertEquals("Prova{codigo=123, disciplina='Prova Original', questao=Questao{enunciado='Explique o padrão Prototype', valor=1}, turma='Turma A'}", prova.toString());
        assertEquals("Prova{codigo=456, disciplina='Prova Clonada', questao=Questao{enunciado='Explique o padrão Prototype', valor=2}, turma='Turma A'}", provaClone.toString());
    }
}
