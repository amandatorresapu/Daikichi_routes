package com.codingdojo.daikichiroutes;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class HomeController {
	
	@RequestMapping("")
	public String welcome(@RequestParam(value="q", required=false) String searchQuery) {
		if(searchQuery == null) {
			return "nothing ";
		}else {
			return "Your searched for: " + searchQuery;	
		}
		
	}
	
	@RequestMapping("/today")
	public String today() {
		return "Today you will find luck in all your endeavors!";
	}
	
	@RequestMapping("/tomorrow")
	public String tomorrow() {
		return "goodluck tomorrow!";
	}
	
	@RequestMapping("/{travel}/{kyoto}")
	public String tomorrow(@PathVariable("travel") String travel, @PathVariable("kyoto") String kyoto) {
		return "congrats! you will " + travel + " to " + kyoto + "!!!";
	}
	
	@RequestMapping("/lotto/{lotto}/{num}")
	public String lotto(@PathVariable("lotto") String lotto, @PathVariable("num") Integer num) {
		if (num %2 == 0) {
			return "You will take a grand journey in the near future, but be weary of tempting offers";
		} else {
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
		}
		
	}
	
	
}
