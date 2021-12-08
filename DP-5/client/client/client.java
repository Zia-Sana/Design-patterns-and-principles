package client;

import java.util.ArrayList;

import classes.BasicUser;
import classes.ChatMediator;
import classes.PremiumUser;

public class client {
	public static void main(String... k) {
		ChatMediator chatMediator = new ChatMediator();
		chatMediator.setUsers(new ArrayList());
		BasicUser bUser = new BasicUser(chatMediator, "BUser");
		PremiumUser pUser = new PremiumUser(chatMediator, "PUser");
		BasicUser ruksana=new BasicUser(chatMediator,"Ruksana");
		chatMediator.addUser(bUser);
		chatMediator.addUser(pUser);
		//chatMediator.addUser(suraj);
		
	ruksana.sendMessage("Hi All,My name is Ruksana Malik");
		//pUser.sendMessage("USer HH sent message");

		//chatMediator.sendMessage("i wanted to send message to you all");

	}

}
