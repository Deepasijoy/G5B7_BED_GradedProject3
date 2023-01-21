package org.greatlearning.com.ticketapi.services;



import java.util.List;

import org.greatlearning.com.ticketapi.entity.Ticket;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;





public interface TicketServices {
	
	
Ticket insertTicket(Ticket ticket);
List<Ticket>getAllTickets();
Ticket getTicketByTicketNumber(int ticketNumber);
Ticket updateTicket(Ticket t);
void deleteTicketById(int ticketNumber);

List<Ticket> searchTicketByTicketTitle(String ticketTitle);

}