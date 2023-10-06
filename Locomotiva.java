public class Locomotiva {
  private String numeroDeSerie;
  private double capacidadeDeTracao;
  private double comprimento;

  public Locomotiva(String numeroDeSerie, double capacidadeDeTracao, double comprimento) {
    this.numeroDeSerie = numeroDeSerie;
    this.capacidadeDeTracao = capacidadeDeTracao;
    this.comprimento = comprimento;
  }
  public Locomotiva(String numeroDeSerie) {
    this.numeroDeSerie = numeroDeSerie;
  }

  public String getNumeroDeSerie() {
    return numeroDeSerie;
  }

  public double getCapacidadeDeTracao() {
    return capacidadeDeTracao;
  }

  public double getComprimento() {
    return comprimento;
  }

  public void setNumeroDeSerie(String numeroDeSerie) {
    this.numeroDeSerie = numeroDeSerie;
  }

  public void setCapacidadeDeTracao(double capacidadeDeTracao) {
    this.capacidadeDeTracao = capacidadeDeTracao;
  }

  public void setComprimento(double comprimento) {
    this.comprimento = comprimento;
  }

  public String toString() {
    return "Tipo: Locomotiva\nNúmero de Série: " + numeroDeSerie + "\nCapacidade de Tração: " + capacidadeDeTracao
        + "\nComprimento: " + comprimento;
  }

}