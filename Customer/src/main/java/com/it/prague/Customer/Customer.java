package com.it.prague.Customer;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PostLoad;
import jakarta.persistence.PostPersist;
import jakarta.persistence.PostRemove;
import jakarta.persistence.PostUpdate;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreRemove;
import jakarta.persistence.PreUpdate;

@Entity
public class Customer {
	
	@Id
	private int id;
	
	private String firstName;
	
	private String lastName;

	public Customer(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	@PrePersist
	public void prePersist() {
		System.out.println("@PrePersist");
	}
	
	@PostPersist
	public void postPersist() {
		System.out.println("@PostPersist");
	}
	
	@PostLoad
	public void postLoad() {
		System.out.println("@PostLoad");
	}
	
	@PreUpdate
	public void preUpdate() {
		System.out.println("@PreUpdate");
	}
	@PostUpdate
	public void postUpdate() {
		System.out.println("@PostUpdate");
	}
	
	@PreRemove
	public void preRemove() {
		System.out.println("@PreRemove");
	}
	@PostRemove
	public void postRemove() {
		System.out.println("@PostRemove");
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	

}
