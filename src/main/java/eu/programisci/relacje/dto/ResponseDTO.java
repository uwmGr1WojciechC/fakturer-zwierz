package eu.programisci.relacje.dto;

/**
 * Created by student on 06.06.17.
 */
public class ResponseDTO {

    Long klientId;
    String klientImie;
    String klientNazwisko;
    Long adresId;
    String adresText;

    public ResponseDTO() {
    }

    public ResponseDTO(Long klientId, String klientImie, String klientNazwisko, Long adresId, String adresText) {
        this.klientId = klientId;
        this.klientImie = klientImie;
        this.klientNazwisko = klientNazwisko;
        this.adresId = adresId;
        this.adresText = adresText;
    }

    public Long getKlientId() {
        return klientId;
    }

    public void setKlientId(Long klientId) {
        this.klientId = klientId;
    }

    public String getKlientImie() {
        return klientImie;
    }

    public void setKlientImie(String klientImie) {
        this.klientImie = klientImie;
    }

    public String getKlientNazwisko() {
        return klientNazwisko;
    }

    public void setKlientNazwisko(String klientNazwisko) {
        this.klientNazwisko = klientNazwisko;
    }

    public Long getAdresId() {
        return adresId;
    }

    public void setAdresId(Long adresId) {
        this.adresId = adresId;
    }

    public String getAdresText() {
        return adresText;
    }

    public void setAdresText(String adresText) {
        this.adresText = adresText;
    }
}
