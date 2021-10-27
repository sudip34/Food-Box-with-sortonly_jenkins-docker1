package kitchenstory.kitchenstory.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kitchenstory.kitchenstory.entity.AdminLogin;
import kitchenstory.kitchenstory.repository.LoginRepository;

@RestController

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class LoginController {
	
	@Autowired
	private LoginRepository loginRepository;

	@PostMapping("/newUSer")
	public AdminLogin createNewUser(@RequestBody AdminLogin theUser ) {
		return this.loginRepository.save(theUser);
	}
	
	
	// login portal
	@GetMapping("/login")
	public List<AdminLogin> getLoginCredential() {
		return this.loginRepository.findAll();
	}
	
	@GetMapping("/login/{username}")
	public AdminLogin getUser(@PathVariable("username") String keyword) {
		String role="User";
		return this.loginRepository.search(keyword,role);
	}

	@GetMapping("/login/{keyword}/{role}")
	public AdminLogin getAdmin(@PathVariable("keyword") String keyword,@PathVariable("role") String role) {
		return this.loginRepository.search(keyword,role);
	}

	@PostMapping("/login/update")
	public void updateLogin(@RequestBody AdminLogin user) {
		this.loginRepository.save(user);
	}

	@GetMapping("/login/adminName")
	public List<String> getLoginadminNames() {
		List<AdminLogin> logins = this.loginRepository.findAll();
		List<String> adminNames = new ArrayList<>();
		for (AdminLogin login : logins) {
			if(login.getRole().equals("Admin"))
			adminNames.add(login.getAdminName());
		}

		return adminNames;
	}
	@GetMapping("/login/userName")
	public List<String> getLoginUserNames() {
		List<AdminLogin> logins = this.loginRepository.findAll();
		List<String> adminNames = new ArrayList<>();
		for (AdminLogin login : logins) {
			if(login.getRole().equals("User"))
			adminNames.add(login.getAdminName());
		}

		return adminNames;
	}

}
