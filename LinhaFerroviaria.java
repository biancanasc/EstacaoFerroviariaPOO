import java.util.ArrayList;

public class LinhaFerroviaria {
  private int numero;
  private double extensaoMetros;
  private String descricao;
  private ArrayList<RecursoFerroviario> recursos;
  private EstacaoFerroviaria estacaoFerroviaria;

  public LinhaFerroviaria(int numero, double extensaoMetros, String descricao, EstacaoFerroviaria estacaoFerroviaria,
      ArrayList<RecursoFerroviario> recursos) {
    this.numero = numero;
    this.extensaoMetros = extensaoMetros;
    this.descricao = descricao;
    this.estacaoFerroviaria = estacaoFerroviaria;
    this.recursos = recursos;
  }
  public LinhaFerroviaria(int numero) {
    this.numero = numero;
  }

  public int getNumero() {
    return numero;
  }

  public double getExtensaoMetros() {
    return extensaoMetros;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public void setExtensaoMetros(double extensaoMetros) {
    this.extensaoMetros = extensaoMetros;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public EstacaoFerroviaria getEstacaoFerroviaria() {
    return estacaoFerroviaria;
  }

  public void setEstacaoFerroviaria(EstacaoFerroviaria estacaoFerroviaria) {
    this.estacaoFerroviaria = estacaoFerroviaria;
  }

  public void adicionarRecurso(RecursoFerroviario recurso) {
    recursos.add(recurso);
  }

  public String toString() {
    String siglaEstacao = estacaoFerroviaria != null ? estacaoFerroviaria.getSigla() : "Estação não foi definida";
    return "Linha Ferroviária: " + numero +
        "\nEstação Sigla: " + siglaEstacao +
        "\nQuantidade de Recursos: " + recursos.size();
  }
}