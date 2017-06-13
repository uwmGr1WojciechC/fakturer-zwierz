package eu.programisci.app.zwierzenta.service;

import eu.programisci.app.zwierzenta.dto.ZwierzeDTO;

import java.util.List;

/**
 * Created by student on 13.06.17.
 */
public interface IZwierzeService {
    ZwierzeDTO findOne(Long id);

    List<ZwierzeDTO> findAll();

    void deleteOne(Long id);

    ZwierzeDTO save(ZwierzeDTO userDTO);

    List<ZwierzeDTO> init();
}
