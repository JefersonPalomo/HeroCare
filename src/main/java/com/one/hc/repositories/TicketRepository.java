package com.one.hc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.one.hc.models.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long>{

}
