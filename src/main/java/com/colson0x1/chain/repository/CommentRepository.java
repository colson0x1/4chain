package com.colson0x1.chain.repository;

import com.colson0x1.chain.model.Comment;
import com.colson0x1.chain.model.Post;
import com.colson0x1.chain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);
    List<Comment> findAllByUser(User user);
}
