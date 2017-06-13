package eu.programisci.app.zwierzenta.service;

import eu.programisci.app.zwierzenta.converters.ZwierzeConverter;
import eu.programisci.app.zwierzenta.dto.ZwierzeDTO;
import eu.programisci.app.zwierzenta.enums.EGatunek;
import eu.programisci.app.zwierzenta.enums.EPlec;
import eu.programisci.app.zwierzenta.ob.ZwierzeOB;
import eu.programisci.app.zwierzenta.repository.IZwierzeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by student on 13.06.17.
 */
@Service
public class ZwierzeServiceImpl implements IZwierzeService {

    @Autowired
    private IZwierzeRepository zwierzeRepository;

    @Autowired
    private ZwierzeConverter zwierzeConverter;

    @Override
    public ZwierzeDTO findOne(Long id) {
        ZwierzeOB ob = zwierzeRepository.findOne(id);
        ZwierzeDTO dto = zwierzeConverter.obToDto(ob);
        return dto;
    }

    @Override
    public List<ZwierzeDTO > findAll() {
        List<ZwierzeOB> obList = zwierzeRepository.findAll();
        List<ZwierzeDTO > dtoList = zwierzeConverter.obListToDtoList(obList);
        return dtoList;
    }

    @Override
    public void deleteOne(Long id) {
        zwierzeRepository.delete(id);
    }

    @Override
    public ZwierzeDTO save(ZwierzeDTO dto) {
        if (dto.getId() == null) {
            return zwierzeConverter.obToDto(create(dto));
        } else {
            return zwierzeConverter.obToDto(update(dto));
        }
    }

    private ZwierzeOB create(ZwierzeDTO dto) {
        ZwierzeOB ob = zwierzeConverter.dtoToOb(dto);
        ob.setCreationDate(new Date());
        ob = zwierzeRepository.save(ob);
        return ob;
    }

    private ZwierzeOB update(ZwierzeDTO dto) {
        ZwierzeOB ob = zwierzeRepository.findOne(dto.getId());
        ob.setNazwa(dto.getNazwa());
        ob.setGatunek(dto.getGatunek());
        ob.setWiek(dto.getWiek());
        ob.setPlec(dto.getPlec());
        ob.setCreationDate(dto.getDataUtworzenia());
        ob = zwierzeRepository.save(ob);
        return ob;
    }

    @Override
    public List<ZwierzeDTO> init() {
        List<ZwierzeOB> pOBList = new ArrayList<>();
        pOBList.add(zwierzeConverter.dtoToOb(new ZwierzeDTO(null, "Azor", EGatunek.PIES,4,EPlec.SAMIEC )));
        pOBList.add(zwierzeConverter.dtoToOb(new ZwierzeDTO(null, "Hanba",EGatunek.PIES,3,EPlec.SAMICA)));
        pOBList.add(zwierzeConverter.dtoToOb(new ZwierzeDTO(null, "Mruczek",EGatunek.KOT,4,EPlec.SAMIEC )));
        pOBList.add(zwierzeConverter.dtoToOb(new ZwierzeDTO(null, "Diabul",EGatunek.KOT,3,EPlec.SAMIEC)));
        pOBList.add(zwierzeConverter.dtoToOb(new ZwierzeDTO(null, "Zenek",EGatunek.JASZCZURKA,1, EPlec.SAMIEC )));
        pOBList = zwierzeRepository.save(pOBList);
        return zwierzeConverter.obListToDtoList(pOBList);
    }
}
