package de.flowwindustries.l4p.domain;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Set;

/**
 * Lobby entity.
 */
@Entity
public class Lobby {

    /**
     * Database ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    /**
     * Unique ID
     */
    @Column(unique = true)
    private String uuid;

    /**
     * Game Title
     */
    private String game;

    /**
     * Max players
     */
    private int playerAmount;

    /**
     * Participants
     */
    @ElementCollection
    private Set<String> participants;
}
