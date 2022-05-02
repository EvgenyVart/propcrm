package net.protezov.bestprotez.repository;

import net.protezov.bestprotez.entity.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends  CrudRepository<Client, Long> {
}
