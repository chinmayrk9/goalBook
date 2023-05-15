package com.iiitb.spe;

import java.util.List;

import com.iiitb.spe.service.Comment;
import com.iiitb.spe.service.CommentJson;
import com.iiitb.spe.service.LikeJson;
import com.iiitb.spe.service.Post;
import com.iiitb.spe.service.PostJson;
import com.iiitb.spe.service.User;

public interface PostService {
	
	public int createPost(PostJson post);
	public void like(LikeJson likeJson);
	public void comment(CommentJson commentJson);
	public List<User> viewLike(String post_id);
	public List<Comment> viewComment(String post_id);
	public List<Post> viewPost(String user_id);
	public List<Post> viewAllPost(String user_id);
	
	public Post getPost(String post_id);
	
}
