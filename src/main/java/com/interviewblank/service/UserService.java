package com.interviewblank.service;

import com.interviewblank.pojo.UserInfo;
import com.interviewblank.pojo.UserDTO;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    UserInfo save(UserDTO userDTO);
}
