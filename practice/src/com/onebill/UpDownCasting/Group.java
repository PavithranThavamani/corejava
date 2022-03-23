package com.onebill.UpDownCasting;

public class Group {

	public static void main(String[] args) {
		User user = new Admin("Pavithran", 9876543210l);
		user.chat();
		user.videocall();
		user.share();
		
		Admin admin = (Admin) user;
		admin.addUser();
		admin.removeUser();
		
	}
}
