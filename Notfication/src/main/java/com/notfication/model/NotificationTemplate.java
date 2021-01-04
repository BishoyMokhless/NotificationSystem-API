package com.notfication.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.UUID;
@Entity
@Table(name = "templates")

public class NotificationTemplate{
@Id
//@GeneratedValue (strategy = GenerationType.SEQUENCE)
	public  int id;
@Column(name = "Subject")
	public  String subject;
@Column(name = "Content")
	public  String content;
@Column(name = "Language")
	public  String language;

	public NotificationTemplate(int id,@JsonProperty("subject") String subject,@JsonProperty("content") String content,@JsonProperty("lang") String  language) {
		this.id = id;
		this.subject = subject;
		this.content = content;
		this.language = language;
	}



	public int getId() {
		return this.id;
	}
	public String getSubject() {
		return this.subject;
	}
	public String getLanguage() {
		return this.language;
	}

	public String getContent() {
		return content;
	}
}
