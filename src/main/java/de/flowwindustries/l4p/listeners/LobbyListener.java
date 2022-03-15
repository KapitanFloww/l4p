package de.flowwindustries.l4p.listeners;

import de.flowwindustries.l4p.repository.LobbyRepository;
import lombok.extern.slf4j.Slf4j;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Locale;

/**
 * Listener for Lobby commands
 */
@Slf4j
@Component
public class LobbyListener extends AbstractListener {

    @Autowired
    private LobbyRepository lobbyRepository;

    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        Message msg = event.getMessage();
        if(msg.getContentRaw().toLowerCase(Locale.ROOT).equals("!lobby")) {
            log.info("Received lobby message!");
            MessageChannel channel = event.getChannel();
        }
    }
}
