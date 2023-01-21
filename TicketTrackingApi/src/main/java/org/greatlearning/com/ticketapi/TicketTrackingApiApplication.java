package org.greatlearning.com.ticketapi;

import org.greatlearning.com.ticketapi.entity.Ticket;
import org.greatlearning.com.ticketapi.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;



@SpringBootApplication
@Component
public class TicketTrackingApiApplication implements CommandLineRunner {
	@Autowired
	TicketRepository ticketRepository;

	public static void main(String[] args) {
		SpringApplication.run(TicketTrackingApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
    Ticket t1=new Ticket();
    t1.setTicketTitle("Gl Prom Night");
    t1.setTicketDescription("Farewell Party to outgoing students");
    t1.setTicketCreatedOn("28/1/2023");
    ticketRepository.save(t1);
		 
		  
		 
	}

}
