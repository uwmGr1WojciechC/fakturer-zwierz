package eu.programisci.relacje.api;

import eu.programisci.relacje.dto.RequestDTO;
import eu.programisci.relacje.dto.ResponseDTO;
import eu.programisci.relacje.service.IRelacjeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/relacje")
@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.HEAD, RequestMethod.OPTIONS, RequestMethod.DELETE, RequestMethod.POST, RequestMethod.PUT})
public class RelacjeRestController {

    @Autowired
    private IRelacjeService relacjeService;

    @RequestMapping(value = "/init", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void init() {
        relacjeService.init();
    }

    @RequestMapping(value = "/query", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<ResponseDTO> query(@RequestBody RequestDTO aRequest) {
        return relacjeService.query(aRequest);
    }
}
