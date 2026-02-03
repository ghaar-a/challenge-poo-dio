import br.com.dio.challenge.domain.*;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição do curso");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso python");
        curso2.setDescricao("descrição curso python");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Conteudo conteudo = new Curso();  //polimorfismo
        conteudo.setTitulo("Segurança em Java");
        conteudo.setDescricao("descrição de segurança em java");
        Conteudo conteudo1 = new Mentoria();
        conteudo1.setTitulo("Introdução à ciberseguraç");
        conteudo1.setDescricao("descrição de introdução à cibersegurança");


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("John");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + dev.getConteudosInscritos());
        System.out.println("=");
        dev.progredir();
        dev.progredir();
        System.out.println("Conteúdos inscritos: " + dev.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + dev.getConteudosConcluidos());


        System.out.println("===============");
        Dev dev1 = new Dev();
        dev1.setNome("Mary");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("=");
        System.out.println("Conteúdos inscritos: " + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("Conteúdos inscritos: " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + dev1.getConteudosConcluidos());
    }
}