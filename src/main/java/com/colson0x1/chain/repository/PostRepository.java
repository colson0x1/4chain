package com.colson0x1.chain.repository;

import com.colson0x1.chain.model.Post;
import com.colson0x1.chain.model.Sub4chain;
import com.colson0x1.chain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findALlBySub4chain(Sub4chain sub4chain);
    List<Post> findByUser(User user);
}