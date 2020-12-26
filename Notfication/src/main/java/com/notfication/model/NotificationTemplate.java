package com.notfication.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.UUID;
@Entity
@Table(name = "templates")

public class NotificationTemplate{
@Id
@GeneratedValue (strategy = GenerationType.SEQUENCE)
	private final int id;
@Column(name = "Subject")
	private final String subject;
@Column(name = "Content")
	private final String content;
@Column(name = "Language")
	private final String language;

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
