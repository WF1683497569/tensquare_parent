package com.tensquare.friend.dao;

import com.tensquare.friend.pojo.NoFriend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

/**
 * Created by 16834 on 2019/9/30.
 */
public interface NoFriendDao extends JpaRepository<NoFriend, String>{
    public NoFriend findByUseridAndFriendid(String userid, String friendid);
}
