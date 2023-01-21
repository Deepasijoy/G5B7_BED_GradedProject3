package org.greatlearning.com.ticketapi.repository;

import java.util.List;

import org.greatlearning.com.ticketapi.entity.Ticket;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.data.repository.query.Param;

public interface TicketRepository extends JpaRepositoryImplementation<Ticket, Integer>{
	@Query(value = "select * from tickets t where t.ticket_title like %:ticketTitle% or t.ticket_description like %:ticketTitle%" , nativeQuery = true)
	 List<Ticket> searchTicketByTicketTitle(@Param("ticketTitle") String ticketTitle);
}
