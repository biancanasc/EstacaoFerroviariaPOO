import java.util.ArrayList;
import java.util.Date;

public class Trem {
  private String prefixo;
  private ArrayList<RecursoFerroviario> recursos;
  private EstacaoFerroviaria estacaoOrigem;
  private EstacaoFerroviaria estacaoDestino;
  private Date dataFormacao;

  public Trem(String prefixo, ArrayList<RecursoFerroviario> recursos, EstacaoFerroviaria estacaoOrigem,
      EstacaoFerroviaria estacaoDestino, Date dataFormacao) {

    this.prefixo = prefixo;
    this.recursos = recursos;
    this.estacaoOrigem = estacaoOrigem;
    this.estacaoDestino = estacaoDestino;
    this.dataFormacao = dataFormacao;
  }

  public String getPrefixo() {
    return prefixo;
  }

  public void setPrefixo(String prefixo) {
    this.prefixo = prefixo;
  }

  public ArrayList<RecursoFerroviario> getRecursos() {
    return recursos;
  }

  public void setRecursos(ArrayList<RecursoFerroviario> recursos) {
    this.recursos = recursos;
  }

  public EstacaoFerroviaria getEstacaoOrigem() {
    return estacaoOrigem;
  }

  public void setEstacaoOrigem(EstacaoFerroviaria estacaoOrigem) {
    this.estacaoOrigem = estacaoOrigem;
  }

  public EstacaoFerroviaria getEstacaoDestino() {
    return estacaoDestino;
  }

  public void setEstacaoDestino(EstacaoFerroviaria estacaoDestino) {
    this.estacaoDestino = estacaoDestino;
  }

  public Date getDataFormacao() {
    return dataFormacao;
  }

  public void setDataFormacao(Date dataFormacao) {
    this.dataFormacao = dataFormacao;
  }

  public void adicionarRecurso(RecursoFerroviario recurso) {
    if (recursos.size() < 150) {
      recursos.add(recurso);
    } else {
      System.out.println("Limite de recursos é de 150!");
    }
  }

  public String toString() {
    if (estacaoOrigem.getSigla().equals(estacaoDestino.getSigla())) {
      return "A estação de origem deve ser diferente da estação de destino!";
    } else {
      return "Prefixo do trem: " + prefixo +
          "\nEstação de Origem: " + estacaoOrigem.getDescricao() +
          "\nEstação de Destino: " + estacaoDestino.getDescricao() +
          "\nData de Formação: " + dataFormacao +
          "\nRecursos no Trem: " + recursos.size();
    }
  }

}
