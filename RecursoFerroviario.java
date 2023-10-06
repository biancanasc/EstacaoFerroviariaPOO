public class RecursoFerroviario {
  private Trem trem;
  private Vagao vagao;
  private Locomotiva locomotiva;

  public RecursoFerroviario(Trem trem) {
    this.trem = trem;
  }

  public RecursoFerroviario(Vagao vagao) {
    this.vagao = vagao;
  }

  public RecursoFerroviario(Locomotiva locomotiva) {
    this.locomotiva = locomotiva;
  }

  public Trem getTrem() {
    return trem;
  }

  public Vagao getVagao() {
    return vagao;
  }

  public Locomotiva getLocomotiva() {
    return locomotiva;
  }

  public void setTrem(Trem trem) {
    this.trem = trem;
  }

  public void setVagao(Vagao vagao) {
    this.vagao = vagao;
  }

  public void setLocomotiva(Locomotiva locomotiva) {
    this.locomotiva = locomotiva;
  }

  public String toString() {
    if (trem != null) {
      return "Tipo: Trem";
    } else if (vagao != null) {
      return "Tipo: Vagão";
    } else if (locomotiva != null) {
      return "Tipo: Locomotiva";
    }
    return "Tipo: Desconhecido";
  }
}