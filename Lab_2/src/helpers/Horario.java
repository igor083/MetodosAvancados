package helpers;

public class Horario {
    private MyTypes.DiaSemana diaSemana;
    private MyTypes.HorasDia horasDia;

    public Horario(MyTypes.DiaSemana diaSemana, MyTypes.HorasDia horasDia) {
        this.diaSemana = diaSemana;
        this.horasDia = horasDia;
    }

    public String getDiaSemana() {
      return diaSemana.toString();
    }

    public String getHorasDia() {
      return horasDia.toString();
    }
}

