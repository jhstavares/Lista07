package l7exercicio;

import java.util.ArrayList;
import java.util.List;

public class Pais {

    private String codigoIso;
    private String nomeDoPais;
    private double populacao;
    private double dimensaoDoPais;
    private List<String> vizinhosFronteira = new ArrayList<>();

    public Pais(String codigoIso, String nomeDoPais, double populacao, double dimensaoDoPais, List<String> vizinhosFronteira) {
        this.codigoIso = codigoIso;
        this.nomeDoPais = nomeDoPais;
        this.populacao = populacao;
        this.dimensaoDoPais = dimensaoDoPais;
        this.vizinhosFronteira = vizinhosFronteira;
    }

    public void status() {
        System.out.println("--------------------------------");
        System.out.println("Informações referente ao país: ");
        System.out.println("--------------------------------");
        System.out.println("Código ISO: " + getCodigoIso() + "\nNome do pais: " + getDimensaoDoPais() +
                "\nNúmero populacional: " + getPopulacao() + " milhões de habitantes " + "\nDimensão: "
                + getDimensaoDoPais() + " km²" );

        System.out.printf("O país tem uma densidade populacional de: %.2f km²\n", this.densidadeDemografica());
    }

    public boolean fronteira(String nomePais) {
        if (vizinhosFronteira.contains(nomePais)) {
            return true;


        } else{
            return false;
        }

    }
    public double densidadeDemografica(){
        return this.populacao / this.dimensaoDoPais;

    }

    public String getCodigoIso() {
        return codigoIso;
    }

    public void setCodigoIso(String codigoIso) {
        this.codigoIso = codigoIso;
    }

    public String getNomeDoPais() {
        return nomeDoPais;
    }

    public void setNomeDoPais(String nomeDoPais) {
        this.nomeDoPais = nomeDoPais;
    }

    public double getPopulacao() {
        return populacao;
    }

    public void setPopulacao(double populacao) {
        this.populacao = populacao;
    }

    public double getDimensaoDoPais() {
        return dimensaoDoPais;
    }

    public void setDimensaoDoPais(double dimensaoDoPais) {
        this.dimensaoDoPais = dimensaoDoPais;
    }

    public List<String> getVizinhosFronteira() {
        return vizinhosFronteira;
    }

    public void setVizinhosFronteira(List<String> vizinhosFronteira) {
        this.vizinhosFronteira = vizinhosFronteira;
    }
}


