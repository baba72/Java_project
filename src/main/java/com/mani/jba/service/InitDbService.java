package com.mani.jba.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mani.jba.repository.BlogRepository;
import com.mani.jba.repository.ItemRepository;
import com.mani.jba.repository.RoleRepository;
import com.mani.jba.repository.UserRepository;
import com.mani.jba.entity.Blog;
import com.mani.jba.entity.Item;
import com.mani.jba.entity.Role;
import com.mani.jba.entity.User;

@Transactional
@Service
public class InitDbService {

	@Autowired
	private RoleRepository roleRepository;

	@Autowired
	private BlogRepository blogRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private ItemRepository itemRepository;

	@PostConstruct
	public void init() {
		Role roleUser = new Role();
		roleUser.setName("ROLE_USER");
		roleRepository.save(roleUser);
		
		Role roleAdmin = new Role();
		roleAdmin.setName("ROLE_ADMIN");
		roleRepository.save(roleAdmin);
		
		User userAdmin = new User();
		userAdmin.setName("admin");
		List<Role> roles = new ArrayList<Role>();
		roles.add(roleUser);
		roles.add(roleAdmin);
		userAdmin.setRoles(roles);
		userRepository.save(userAdmin);
		
		Blog blogJavaids=new Blog();
		blogJavaids.setName("JavaVids");
		blogJavaids.setUrl("http://feeds.feedburner.com/javavids?format=xml");
		blogJavaids.setUser(userAdmin);
		blogRepository.save(blogJavaids);
		
		Item item1=new Item();
		item1.setBlog(blogJavaids);
		item1.setTitle("first");
		item1.setLink("http://www.javavids.com");
		item1.setPublishedDate(new Date());
		Item item2=new Item();
		item2.setBlog(blogJavaids);
		item2.setTitle("second");
		item2.setLink("http://www.javavids.com");
		item2.setPublishedDate(new Date());
		
	
		
		
		

	}

}
