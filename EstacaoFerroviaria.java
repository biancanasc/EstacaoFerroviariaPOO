import java.util.ArrayList;

public class EstacaoFerroviaria {
  private String sigla;
  private String descricao;
  private ArrayList<LinhaFerroviaria> linhas;
  private ArrayList<Trem> trens;

  public EstacaoFerroviaria(String sigla, String descricao) {
    this.sigla = sigla;
    this.descricao = descricao;
    this.linhas = new ArrayList<>();
    this.trens = new ArrayList<>();
  }

  public String getSigla() {
    return sigla;
  }

  public void setSigla(String sigla) {
    this.sigla = sigla;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public ArrayList<LinhaFerroviaria> getLinhas() {
    return linhas;
  }

  public void setLinhas(ArrayList<LinhaFerroviaria> linhas) {
    this.linhas = linhas;
  }

  public ArrayList<Trem> getTrens() {
    return trens;
  }

  public void setTrens(ArrayList<Trem> trens) {
    this.trens = trens;
  }

  public void adicionarLinha(LinhaFerroviaria linha) {
    linhas.add(linha);
  }

  public void adicionarTrem(Trem trem) {
    if (trem.getRecursos().size() <= 150) {
      trens.add(trem);
    } else {
      System.out.println("Limite de recursos no trem atingido (150).");
    }
  }

  public String toString() {
    return "Estação Ferroviária: " + sigla + "\nDescrição: " + descricao +
        "\nQuantidade de Linhas Ferroviárias: " + linhas.size();
  }

}