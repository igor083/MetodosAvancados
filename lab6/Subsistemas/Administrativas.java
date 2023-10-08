package Subsistemas;

import java.util.Date;

class Reuniao {
    Date data = new Date();
}

public class Administrativas {

    public String getReunioesAgendadas() {
        return "...";
    }

    public String getEntrevistas() {
        return "...";
    }

    public void agendarReuniao() {
        System.out.println(""+this.data);
    }

    public void agendarEntrevista() {

    }

}
