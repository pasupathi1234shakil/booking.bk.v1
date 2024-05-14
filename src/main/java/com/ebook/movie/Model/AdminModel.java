package com.ebook.movie.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="TicketCreation")
public class AdminModel {
@Id
@GeneratedValue
private int id;
private String moviename;
private String person;
private String price;
private String cardnumber;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getMoviename() {
	return moviename;
}
public void setMoviename(String moviename) {
	this.moviename = moviename;
}
public String getPerson() {
	return person;
}
public void setPerson(String person) {
	this.person = person;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
public String getCardnumber() {
	return cardnumber;
}
public void setCardnumber(String cardnumber) {
	this.cardnumber = cardnumber;
}


}
