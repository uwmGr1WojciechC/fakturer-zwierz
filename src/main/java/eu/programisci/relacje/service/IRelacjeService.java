package eu.programisci.relacje.service;

import eu.programisci.relacje.dto.RequestDTO;
import eu.programisci.relacje.dto.ResponseDTO;

import java.util.List;

public interface IRelacjeService {

    void init();

    List<ResponseDTO> query(RequestDTO aCrit);
}
