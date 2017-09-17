package com.github.crainstorm.qac.user.dao;

import com.github.crainstorm.qac.pub.entity.Notice;
import com.github.crainstorm.qac.pub.entity.User;
import com.github.crainstorm.qac.pub.entity.UserLogin;
import org.springframework.stereotype.Repository;

/**
 * Created by chen on 9/17/17.
 */
@Repository
public interface UserManageDao {
    int checkUserLogin(UserLogin user);

    int checkUserEmail(String email);
    
    User getUserBriefInfo(UserLogin user);
    
    User getUserBriefInfo(int id);

    int addUser(User user);

    User getUserDetails(int id);

    int followUser(int user_id, int follow_id);

    Notice getNotice(int user_id);
}