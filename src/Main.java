import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    Curso curso1 = new Curso();
    curso1.setTitulo("java");
    curso1.setDescricao("java baciso");
    curso1.setCargaHoraria(8);

    Mentoria mentoria= new Mentoria();
     mentoria.setTitulo("mentoria java");
     mentoria.setDescricao("mentoria java basico");
     mentoria.setData(LocalDate.now());

        System.out.println(curso1);

        System.out.println(mentoria);
    }
}