package com.techtalentsouth.TechTalentBlog.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BlogPost {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String firstName;
		private String lastName;
		private String emailAddress;
		
	public BlogPost() {
		
	}
		
		public BlogPost(String firstName, String lastName, String emailAddress) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.emailAddress = emailAddress;
			
		}

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

		public String getEmailAddress() {
			return emailAddress;
		}

		public void setEmailAddress(String emailAddress) {
			this.emailAddress = emailAddress;
		}

		@Override
		public String toString() {
			return "BlogPost [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailAddress="
					+ emailAddress + "]";
		}

		
		
}



