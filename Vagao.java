public class Vagao {
  private String numeroDeSerie;
  private String tipo;
  private double capacidadeDeCarga;
  private double comprimentoTesteira;
  private double comprimentoEngate;

  public Vagao(String numeroDeSerie, String tipo, double capacidadeDeCarga, double comprimentoTestesteira,
      double comprimentoEngate) {
    this.numeroDeSerie = numeroDeSerie;
    this.tipo = tipo;
    this.capacidadeDeCarga = capacidadeDeCarga;
    this.comprimentoTesteira = comprimentoTestesteira;
    this.comprimentoEngate = comprimentoEngate;
  }
  public Vagao(String numeroDeSerie) {
    this.numeroDeSerie = numeroDeSerie;
  }

  public String getNumeroDeSerie() {
    return numeroDeSerie;
  }

  public String getTipo() {
    return tipo;
  }

  public double getCapacidadeDeCarga() {
    return capacidadeDeCarga;
  }

  public double getComprimentoTesteira() {
    return comprimentoTesteira;
  }

  public double getComprimentoEngate() {
    return comprimentoEngate;
  }

  public void setNumeroDeSerie(String numeroDeSerie) {
    this.numeroDeSerie = numeroDeSerie;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public void setCapacidadeDeCarga(double capacidadeDeCarga) {
    this.capacidadeDeCarga = capacidadeDeCarga;
  }

  public void setComprimentoTesteira(double comprimentoTestesteira) {
    this.comprimentoTesteira = comprimentoTestesteira;
  }

  public void setComprimentoEngate(double comprimentoEngate) {
    this.comprimentoEngate = comprimentoEngate;
  }

  public String toString() {
    return "Tipo: Vagão\nNúmero de Série: " + numeroDeSerie + "\nCapacidade de Carga: " + capacidadeDeCarga
        + "\nComprimento entre Testeira: " + comprimentoTesteira + "\nComprimento Engate: " + comprimentoEngate;
  }

}