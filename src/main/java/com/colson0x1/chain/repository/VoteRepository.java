package com.colson0x1.chain.repository;

import com.colson0x1.chain.model.Post;
import com.colson0x1.chain.model.User;
import com.colson0x1.chain.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
