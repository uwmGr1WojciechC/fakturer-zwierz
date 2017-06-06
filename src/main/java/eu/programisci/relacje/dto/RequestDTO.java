package eu.programisci.relacje.dto;

/**
 * Created by student on 06.06.17.
 */
public class RequestDTO {

    String adres;
    String telefon;
    String email;

    public RequestDTO() {
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
