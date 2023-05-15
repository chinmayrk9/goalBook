package com.iiitb.spe;

import java.util.List;

import com.iiitb.spe.service.LoginJson;
import com.iiitb.spe.service.Notification;
import com.iiitb.spe.service.UpdateProfileJson;
import com.iiitb.spe.service.User;

public interface ProfileService {
	
	public boolean createProfile(User user);
	
	public User getUser(int user_id);
	
	public List<UserResponse> search(ProfileSearch Key);
	
	
	
	public User login(LoginJson loginDetail);
	
	public List<Notification> getNotifiaction(int user_id);
	
	public void updateNotification(int user_id);
	public int  getNotificationStat(int user_id);
	
	public void updateProfilePic(UpdateProfileJson data);
	

	public void updatePassword(UpdateProfileJson data);

}
