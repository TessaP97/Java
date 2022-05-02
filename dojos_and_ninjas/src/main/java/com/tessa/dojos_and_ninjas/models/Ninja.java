package com.tessa.dojos_and_ninjas.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="ninjas")
public class Ninja {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Size(min=2, max=20, message="Please provide a Ninja Name Greater than 2 characters")
	private String firstName;
	
	
	@Size(min=2, max=20, message="Please provide a Last Name Greater than 2 characters")
	private String lastName;
	
	
	@Size(min=1, message="Please provide an age")
	private String age;
	
	
	// Many to 1
	@ManyToOne(fetch=FetchType.LAZY)
	// this is how it connects it in MySql
	@JoinColumn(name="dojo_id")
	private Dojo dojo;
	
	public Ninja() {
		
	}
	
	// ------ Date -------
	
	@Column(updatable = false)
	private Date createdAt;
	private Date updatedAt;
	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}
	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
	}
	
	
	// ------ Getters & Setters -------
	
	public Long getId() {
		return id;
	}
	
	
	public void setId(Long id) {
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
	
	
	public String getAge() {
		return age;
	}
	
	
	public void setAge(String age) {
		this.age = age;
	}
	
	
	public Dojo getDojo() {
		return dojo;
	}
	
	
	public void setDojo(Dojo dojo) {
		this.dojo = dojo;
	}
	
	
	public Date getCreatedAt() {
		return createdAt;
	}
	
	
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	
	
	public Date getUpdatedAt() {
		return updatedAt;
	}
	
	
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

}
