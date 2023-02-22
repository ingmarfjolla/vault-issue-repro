package org.acme;

import io.quarkus.hibernate.reactive.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GiftRepository implements PanacheRepository<Gift> {
}
