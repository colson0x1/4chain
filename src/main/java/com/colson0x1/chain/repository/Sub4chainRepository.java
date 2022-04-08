package com.colson0x1.chain.repository;

import com.colson0x1.chain.model.Sub4chain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface Sub4chainRepository extends JpaRepository<Sub4chain, Long> {
    Optional<Sub4chain> findByName(String sub4chainName);
}