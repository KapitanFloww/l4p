package de.flowwindustries.l4p.listeners;

import lombok.extern.slf4j.Slf4j;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Abstract listener class for cross-cutting concerns regarding all listeners.
 */
@Slf4j
@Component
public class AbstractListener extends ListenerAdapter {

    /**
     * Post Construct callback.
     */
    @PostConstruct
    void init() {
        log.info("Registered {}", PingPongListener.class.getName());
    }

}
