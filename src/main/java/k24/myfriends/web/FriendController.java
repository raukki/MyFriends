package k24.myfriends.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import k24.myfriends.model.friend;

@Controller
public class FriendController {

    @GetMapping("main")
    public String showMainPage(Model model) {

        System.out.println("friends...");

        List<friend> friends = new ArrayList<>();
        friends.add(new friend("Petri", "Perus"));
        friends.add(new friend("Janne", "Joku"));

        model.addAttribute("friends", friends);
        return ("main");
    }
    @GetMapping("addfriend")
	public String newFriendInfo(Model model) {
		//insert list to model Key-Value
		model.addAttribute("friend", new friend());
		return "addfriend";
	}

    @PostMapping("add")
	public String addFriend(friend friend) {
		System.out.println("add friend : " + friend);
		return "main";
	}

}
