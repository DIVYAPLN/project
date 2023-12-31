package com.example.demo.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.Entity.Userentity;
import com.example.demo.Repository.Userrepo;

@RestController
public class Usercontroller {
	
	@Autowired
	public Userrepo obj;
	
	@PostMapping("/add")
	public Userentity adddata(@RequestBody Userentity user) {
		obj.save(user);
		return user;
	}
	@GetMapping("/users")
	public List<Userentity> getAllUsers() {
		return obj.findAll();
}
	@PutMapping("/update")
	public Userentity updateuser (@RequestBody Userentity up) {
		try {
			obj.save(up);
			return up ;
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return up;
	}
@DeleteMapping("/getdel/{Id}")
public String del (@PathVariable int Id) {
try {
	@SuppressWarnings("deprecation")

	Userentity up=obj.getOne (Id);
	obj.delete(up);
	return "delete";
}
catch(Exception ex) {
	ex.printStackTrace();
}
return null;
}	
}
