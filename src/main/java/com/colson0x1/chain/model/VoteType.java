package com.colson0x1.chain.model;

import com.colson0x1.chain.exceptions.SpringChainException;

import java.util.Arrays;

public enum VoteType {
    UPVOTE(1), DOWNVOTE(-1), ;

    private int direction;

    VoteType(int direction) {}

    public static VoteType lookup(Integer direction) {
        return Arrays.stream(VoteType.values())
                .filter(value -> value.getDirection().equals(direction))
                .findAny()
                .orElseThrow(() -> new SpringChainException("Vote not found"));
    }
}