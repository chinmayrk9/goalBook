package com.iiitb.spe;

import java.util.List;

import com.iiitb.spe.service.FriendJson;
import com.iiitb.spe.service.User;



public interface FriendService {
	
	
	public boolean friendRequestSend(FriendJson friend);
	public boolean friendRequestAccept(FriendJson friend);
	public int checkStatus(FriendJson friend);
	public List<User> getFriends(int user_id);
	public boolean unfriend(FriendJson friend);
	

}
