package de.flowwindustries.l4p.services.beans;

import lombok.extern.slf4j.Slf4j;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.OnlineStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

/**
 * Shutdown bean.
 */
@Slf4j
@Component
public class ShutdownBean {

    @Autowired
    private JDA jda;

    /**
     * Set the bots status to offline when shutting down the app.
     */
    @PreDestroy
    public void destroy() {
        log.info("Shutting down bot");
        jda.getPresence().setStatus(OnlineStatus.OFFLINE);
    }

}
