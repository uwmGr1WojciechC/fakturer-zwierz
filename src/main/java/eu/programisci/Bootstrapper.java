package eu.programisci;

import eu.programisci.Test.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class Bootstrapper implements ApplicationListener<ContextRefreshedEvent> {

    private final Logger log = Logger.getLogger(this.getClass().getName());

    @Autowired
    private IUserService userService;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
    }
}
