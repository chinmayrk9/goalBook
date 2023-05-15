package com.iiitb.spe;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.iiitb.spe.service.Like;
import com.iiitb.spe.service.Post;
import com.iiitb.spe.service.User;
@Repository
public interface LikeDao extends JpaRepository<Like,Integer>{

	@Query("SELECT l.user FROM Like l WHERE l.post = :post")
	List<User> viewLike(@Param("post") Post post);
	
	@Query("SELECT l.id FROM Like l WHERE l.post = :post AND l.user=:user")
	int getLike(@Param("post") Post post,@Param("user") User user);
	
}
