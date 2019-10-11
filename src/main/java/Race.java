import java.time.LocalDateTime;
import java.util.ArrayList;

public class Race {
    private String raceNavn;
    private String raceBeskrivelse;
    private LocalDateTime raceStart;
    private LocalDateTime raceSlutt;
    private ArrayList<Deltager> deltagere;

    Race(String raceNavn, String raceBeskrivelse, LocalDateTime raceStart, LocalDateTime raceSlutt, ArrayList<Deltager> deltagere) {
        this.raceNavn = raceNavn;
        this.raceBeskrivelse = raceBeskrivelse;
        this.raceStart = raceStart;
        this.raceSlutt = raceSlutt;
        this.deltagere = deltagere;
    }

    @Override
    public String toString(){
        return raceNavn + " " + raceStart + " " + raceSlutt;
    }

    public String getRaceNavn() {
        return raceNavn;
    }

    public void setRaceNavn(String raceNavn) {
        this.raceNavn = raceNavn;
    }

    public String getRaceBeskrivelse() {
        return raceBeskrivelse;
    }

    public void setRaceBeskrivelse(String raceBeskrivelse) {
        this.raceBeskrivelse = raceBeskrivelse;
    }

    public LocalDateTime getRaceStart() {
        return raceStart;
    }

    public void setRaceStart(LocalDateTime raceStart) {
        this.raceStart = raceStart;
    }

    public LocalDateTime getRaceSlutt() {
        return raceSlutt;
    }

    public void setRaceSlutt(LocalDateTime raceSlutt) {
        this.raceSlutt = raceSlutt;
    }

    public ArrayList<Deltager> getDeltagere() {
        return deltagere;
    }

    public void setDeltagere(ArrayList<Deltager> deltagere) {
        this.deltagere = deltagere;
    }
}
