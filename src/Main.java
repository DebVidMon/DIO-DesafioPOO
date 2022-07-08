import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){

        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Aprenda Java na DIO");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("JavaScript");
        curso2.setDescricao("Aprenda JavaScript na DIO");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Tirando dúvidas de Java");
        mentoria1.setDescricao("Live de interação para tirar dúvidas");
        mentoria1.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
                bootcamp.setNome("Bootcamp Java Developer");
               bootcamp.setDescricao("Melhore suas habilidades Java");
               bootcamp.getConteudos().add(curso1);
                bootcamp.getConteudos().add(curso2);
                bootcamp.getConteudos().add(mentoria1);

                Dev devCami = new Dev();
                devCami.setNome("Camila");
                devCami.inscreverBootcamp(bootcamp);
                System.out.println("Conteúdos Inscritos Camila:" + devCami.getConteudosInscritos());
                devCami.progredir();
                devCami.progredir();
                System.out.println("-");
                System.out.println("Conteúdos Inscritos Camila:" + devCami.getConteudosInscritos());
                System.out.println("Conteúdos Concluídos Camila:" + devCami.getConteudosConcluidos());
                System.out.println("XP:" + devCami.calcularTotalXp());

                System.out.println("-------");

                Dev devDeh = new Dev();
                devDeh.setNome("Débora");
                devDeh.inscreverBootcamp(bootcamp);
                System.out.println("Conteúdos Inscritos Débora:" + devDeh.getConteudosInscritos());
                devDeh.progredir();
                devDeh.progredir();
                devDeh.progredir();
                System.out.println("-");
                System.out.println("Conteúdos Inscritos Débora:" + devDeh.getConteudosInscritos());
                System.out.println("Conteúdos Concluidos Débora:" + devDeh.getConteudosConcluidos());
                System.out.println("XP:" + devDeh.calcularTotalXp());
    }
}
