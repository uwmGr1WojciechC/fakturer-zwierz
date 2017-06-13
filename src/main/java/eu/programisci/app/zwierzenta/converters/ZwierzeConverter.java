package eu.programisci.app.zwierzenta.converters;

import eu.programisci.app.zwierzenta.dto.ZwierzeDTO;
import eu.programisci.app.zwierzenta.ob.ZwierzeOB;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 13.06.17.
 */
public class ZwierzeConverter {

    public ZwierzeDTO obToDto(ZwierzeOB in) {
        ZwierzeDTO out = new ZwierzeDTO();
        out.setId(in.getId());
        out.setNazwa(in.getNazwa());
        out.setGatunek(in.getGatunek());
        out.setPlec(in.getPlec());
        out.setWiek(in.getWiek());
        out.setDataUtworzenia(in.getCreationDate());
        return out;
    }

    public ZwierzeOB dtoToOb(ZwierzeDTO in) {
        ZwierzeOB out = new ZwierzeOB();
        out.setId(in.getId());
        out.setNazwa(in.getNazwa());
        out.setGatunek(in.getGatunek());
        out.setPlec(in.getPlec());
        out.setWiek(in.getWiek());
        out.setCreationDate(in.getDataUtworzenia());
        return out;
    }


    public List<ZwierzeDTO> obListToDtoList(List<ZwierzeOB> inList) {
        if (inList == null) {
            return null;
        }
        List<ZwierzeDTO> outList = new ArrayList<>();
        for (ZwierzeOB in : inList) {
            outList.add(obToDto(in));
        }
        return outList;
    }
}
