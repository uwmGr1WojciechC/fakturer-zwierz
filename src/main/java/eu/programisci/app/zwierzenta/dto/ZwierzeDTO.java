package eu.programisci.app.zwierzenta.dto;

import eu.programisci.app.zwierzenta.enums.EGatunek;
import eu.programisci.app.zwierzenta.enums.EPlec;

import java.util.Date;

/**
 * Created by student on 13.06.17.
 */
public class ZwierzeDTO {
    private Long id;
    private Date dataUtworzenia; // (wypelniane new Date() przy tworzeniu nowego rekordu)
    private String nazwa;
    private EGatunek gatunek;
    private EPlec plec;
    private Integer wiek;

    public ZwierzeDTO() {
    }

    public ZwierzeDTO(Long id, String nazwa, EGatunek gatunek, Integer wiek,EPlec plec ) {
        this.id = id;
        this.nazwa = nazwa;
        this.gatunek = gatunek;
        this.plec = plec;
        this.wiek = wiek;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataUtworzenia() {
        return dataUtworzenia;
    }

    public void setDataUtworzenia(Date dataUtworzenia) {
        this.dataUtworzenia = dataUtworzenia;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public EGatunek getGatunek() {
        return gatunek;
    }

    public void setGatunek(EGatunek gatunek) {
        this.gatunek = gatunek;
    }

    public EPlec getPlec() {
        return plec;
    }

    public void setPlec(EPlec plec) {
        this.plec = plec;
    }

    public Integer getWiek() {
        return wiek;
    }

    public void setWiek(Integer wiek) {
        this.wiek = wiek;
    }
}
