package org.greatlearning.com.ticketapi.services;

import java.util.List;

import org.greatlearning.com.ticketapi.entity.Ticket;
import org.greatlearning.com.ticketapi.repository.TicketRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
@Service
public class TicketServicesImpl implements TicketServices{
	
	private TicketRepository ticketRepository;
	

	public TicketServicesImpl(TicketRepository ticketRepository) {
		super();
		this.ticketRepository = ticketRepository;
	}


	@Override
	public Ticket insertTicket(Ticket ticket) {
		
		return ticketRepository.save(ticket);
	}


	@Override
	public List<Ticket> getAllTickets() {
		
		return ticketRepository.findAll();
	}


	@Override
	public Ticket getTicketByTicketNumber(int ticketNumber) {
		
		return ticketRepository.findById(ticketNumber).get();
		}


	@Override
	public Ticket updateTicket(Ticket t) {
		
		return ticketRepository.save(t);
	}


	@Override
	public void deleteTicketById(int ticketNumber) {
		ticketRepository.deleteById(ticketNumber);
		
	}

	@Override
	public List<Ticket> searchTicketByTicketTitle(String ticketTitle) {
		return ticketRepository.searchTicketByTicketTitle(ticketTitle);
	}

	


	


	
	

}