package com.example.cook.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.cook.User;
import com.example.cook.repository.UserRepository;

@RestController
public class Login {
	
	@Autowired
	private UserRepository userRepository;

	@GetMapping("/{user}/{password}")
	public String getUser(@PathVariable("user") String user, @PathVariable("password") String passwrod) {
		Optional<User> userObject = userRepository.findById(user);
		if(!userObject.isPresent()) {
			return "User Not Found: " +user;
		}
		return "Login sucessfull for user: " + user + " First name: "+ userObject.get().getFirstName() +" Last Name "+userObject.get().getLastName();

	}

	@PostMapping("/register")
	public String createuser(@RequestBody User user) {

		return "Registration complete";

	}

	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	
	public enum Element{
		HELIUM("HE", "Gas"),
		MGN("AE", "solid");
		private String chem;
		private String symbol;
		private Element(String newchem, String newNat) {
			chem = newchem;
			symbol = newNat;
		}
		public String chemSyb() {
			return chem;
		}
		public String natr() {
			return symbol;
		}
	}
	
	
	
	public static void main(String args[]) {
		String dateTime =  	"2013-09-06 15:40:22";
        try {
			Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dateTime);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	

}
