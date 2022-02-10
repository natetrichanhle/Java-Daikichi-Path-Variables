package com.nate.daikichiroutes;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DaikichiRoutesController {
	@RequestMapping("/daikichi")
	public String welcome() {
		return "Welcome";
	}
	@RequestMapping("/daikichi/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to open to new ideas!";
	}
	@RequestMapping("/daikichi/today")
	public String today() {
		return "Today you will find luck in all your endeavors.";
	}
	@RequestMapping("/daikichi/travel/{place}")
	public String travelTo(@PathVariable("place") String place) {
		return "Congratulations! You will soon travel to " + place + "!";
	}
	@RequestMapping("/daikichi/lotto/{number}")
	public String lottery(@PathVariable("number") int number) {
		if(number % 2 == 0) {
			return "You will take a grand journey in the near future, but be weary of tempting offers.";
		} else {
			return "You have enjoyed the fruits of you labor but now is a great time to spend time with family and friends.";
		}
	}
}