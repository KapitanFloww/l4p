package de.flowwindustries.l4p.repository;

import de.flowwindustries.l4p.domain.Lobby;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository for {@link Lobby}.
 */
@Repository
public interface LobbyRepository extends JpaRepository<Lobby, Long> {
}
