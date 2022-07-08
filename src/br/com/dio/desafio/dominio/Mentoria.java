package br.com.dio.desafio.dominio;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
public class Mentoria extends Conteudo {
    private LocalDate data;


    @Override
    public double calcularXP() {
        return XP_Padrao * 2;
    }

    public Mentoria() {
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria" +
                "\nTítulo: " + getTitulo() +
                "\nDescricao: " + getDescricao() +
                "\nData: " + data +"\n";
    }

}
