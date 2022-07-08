package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
    private int cargaHoraria;

    @Override
    public double calcularXP() {
        return XP_Padrao * cargaHoraria;
    }
    public Curso() {
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso" +
                "\nTítulo: " + getTitulo() +
                "\nDescrição: " + getDescricao() +
                "\nCarga Horária: " + cargaHoraria +
                "h \n";
    }
}
