package eu.programisci.relacje.dto;

/**
 * Created by student on 06.06.17.
 */
public class ResponseDTO {

    Long klientId;
    String klientImie;
    String klientNazwisko;
    Long id1;
    String val1;
    Long id2;
    String val2;
    Long id3;
    String val3;

    public ResponseDTO() {
    }

    public ResponseDTO(Long klientId, String klientImie, String klientNazwisko, Long id1, String val1) {
        this.klientId = klientId;
        this.klientImie = klientImie;
        this.klientNazwisko = klientNazwisko;
        this.id1 = id1;
        this.val1 = val1;
    }

    public ResponseDTO(Long klientId, String klientImie, String klientNazwisko, Long id1, String val1, Long id2, String val2) {
        this.klientId = klientId;
        this.klientImie = klientImie;
        this.klientNazwisko = klientNazwisko;
        this.id1 = id1;
        this.val1 = val1;
        this.id2 = id2;
        this.val2 = val2;
    }

    public ResponseDTO(Long klientId, String klientImie, String klientNazwisko, Long id1, String val1, Long id2, String val2, Long id3, String val3) {
        this.klientId = klientId;
        this.klientImie = klientImie;
        this.klientNazwisko = klientNazwisko;
        this.id1 = id1;
        this.val1 = val1;
        this.id2 = id2;
        this.val2 = val2;
        this.id3 = id3;
        this.val3 = val3;
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

    public Long getId1() {
        return id1;
    }

    public void setId1(Long id1) {
        this.id1 = id1;
    }

    public String getVal1() {
        return val1;
    }

    public void setVal1(String val1) {
        this.val1 = val1;
    }

    public Long getId2() {
        return id2;
    }

    public void setId2(Long id2) {
        this.id2 = id2;
    }

    public String getVal2() {
        return val2;
    }

    public void setVal2(String val2) {
        this.val2 = val2;
    }

    public Long getId3() {
        return id3;
    }

    public void setId3(Long id3) {
        this.id3 = id3;
    }

    public String getVal3() {
        return val3;
    }

    public void setVal3(String val3) {
        this.val3 = val3;
    }
}
