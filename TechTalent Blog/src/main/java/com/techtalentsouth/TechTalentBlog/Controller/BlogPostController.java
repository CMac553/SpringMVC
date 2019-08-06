package com.techtalentsouth.TechTalentBlog.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.techtalentsouth.TechTalentBlog.Model.BlogPost;
import com.techtalentsouth.TechTalentBlog.Repository.BlogPostRepository;

@Controller
public class BlogPostController {
	
	@Autowired
	private BlogPostRepository blogPostRepository;
	private static List<BlogPost> posts = new ArrayList<>();
	
	@GetMapping("/")
	public String index(BlogPost blogPost, Model model) {
	model.addAttribute("posts", posts);
		return "blogpost/index";
	}
	

	@PostMapping("/")
	public String addNewBlogPost(BlogPost blogPost, Model model) {
	blogPostRepository.save(new BlogPost(blogPost.getFirstName(), blogPost.getLastName(), blogPost.getEmailAddress()));
	model.addAttribute("firstName", blogPost.getFirstName());
	model.addAttribute("lastName", blogPost.getLastName());
	model.addAttribute("emailAddress", blogPost.getEmailAddress());
		return "blogpost/result";
	
	} 
	
	@GetMapping(value = "/blog_posts/new")
	public String newBlog(BlogPost blogPost ) {
		return "blogpost/new";
	
	}

	@PostMapping("/blog_posts/new")
	public String create(BlogPost blogPost, Model model) {
		blogPostRepository.save(blogPost);
		posts.add(blogPost);
		model.addAttribute("firstName", blogPost.getFirstName());
		model.addAttribute("lasttName", blogPost.getLastName());
		model.addAttribute("emailAddress", blogPost.getEmailAddress());
			return "blogpost/new";
			
	}
	
	
	}
	

