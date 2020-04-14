package com.dbelliazzi.chat.model;
import javax.persistence.*;
@Entity
public class Messagerepo {


	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;
	    private String message;
	    private String user;
	    
	   

	    public Messagerepo() {
	    }

	    public Messagerepo(String message, String user) {
	        this.message = message;
	        this.user = user;
	    }

	    // getters and setters removed for brevity
	
}
