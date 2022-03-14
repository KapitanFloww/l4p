package de.flowwindustries.l4p.services;

import de.flowwindustries.l4p.listeners.PingPongListener;
import lombok.extern.slf4j.Slf4j;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.security.auth.login.LoginException;

/**
 * JDA Service class. Initializes the discord bot.
 */
@Slf4j
@Configuration
public class JDAConfiguration {

    @Value("${application.discord.secret-token}")
    private String token;

    @Value("${application.discord.msg}")
    private String msg;

    /**
     * Initialize the discord bot.
     * @throws LoginException
     */
    @Bean
    public JDA init() throws LoginException {
        log.info("Initializing discord bot");
        return JDABuilder.createLight(token, GatewayIntent.GUILD_MESSAGES, GatewayIntent.DIRECT_MESSAGES)
                .setActivity(Activity.playing(msg))
                .setStatus(OnlineStatus.ONLINE)
                .addEventListeners(new PingPongListener())
                .build();
    }
}
