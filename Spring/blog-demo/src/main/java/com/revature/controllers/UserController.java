package com.revature.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.revature.domain.User;
import com.revature.service.UserService;

@RestController
public class UserController {

	UserService service = new UserService();

	@RequestMapping(method=RequestMethod.POST, value="/users" , 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> addUser(@RequestBody User user){
		/* ResponseEntity<T> adds additional information of the HTTP method and URI to
		 * the request. it also extends HttpEntity, where we can add appropriate
		 * HttpStatus codes to the response --
		 * https://www.logicbig.com/tutorials/spring-framework/spring-web-mvc/request-
		 * response-entity.html 		 */
		user = service.addUser(user);
		if(user==null) {
			return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
		}
		else if(user.getId()==0) {
			return new ResponseEntity<User>(HttpStatus.I_AM_A_TEAPOT); // because why not
		}
		else {
			return new ResponseEntity<User>(user, HttpStatus.CREATED);
		}
	}
	
}
