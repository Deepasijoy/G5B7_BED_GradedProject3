package org.greatlearning.com.ticketapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="tickets")
public class Ticket {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ticket_number",nullable = false)
	private int ticketNumber;
	@Column(name="ticketTitle",nullable = false)
	private String ticketTitle;
	@Column(name="ticketDescription")
	private String ticketDescription;
	@Column(name="ticket_Created_on")
	private String ticketCreatedOn;
	
	
	public Ticket() {
		
	}


	public Ticket(int ticketNumber, String ticketTitle, String ticketDescription, String ticketCreatedOn) {
		super();
		this.ticketNumber = ticketNumber;
		this.ticketTitle = ticketTitle;
		this.ticketDescription = ticketDescription;
		this.ticketCreatedOn = ticketCreatedOn;
	}


	


		
	

}
