package softwareengineering.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Organiser extends Bruker implements Serializable {

    private ArrayList<Arrangement> arrangementListe = new ArrayList<>();

    public Organiser(String email, String password, String navn) {
        super(email, password, navn);
    }

    public void addArrangement(Arrangement arrangement){
        arrangementListe.add(arrangement);
    }

    public Arrangement opprettArrangement(String arrangementNavn,String arrangementBeskrivelse, LocalDateTime arrangementStartDate, LocalDateTime arrangementSluttDate, String arrangementLokasjon) {

        Arrangement temp = new Arrangement(arrangementNavn,arrangementBeskrivelse,arrangementStartDate,arrangementSluttDate,arrangementLokasjon,this);
        addArrangement(temp);
        return temp;
    }

    public Race addRace(Arrangement arrangementSentMed, Race race) {

        Race racet = null;
        for (Arrangement arrangementetIListen : this.arrangementListe) {
            if (arrangementetIListen.equals(arrangementSentMed)) {
                arrangementetIListen.getRaceList().add(race);
                racet = race;
            }
        }
        return racet;
    }

    public ArrayList<Arrangement> getArrangementListe() {
        return arrangementListe;
    }

    public void setArrangementListe(ArrayList<Arrangement> arrangementListe) {
        this.arrangementListe = arrangementListe;
    }



}
