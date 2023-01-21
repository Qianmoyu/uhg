package com.interviewblank.service;

import com.interviewblank.pojo.UserInfo;
import com.interviewblank.pojo.UserDTO;
import com.interviewblank.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @Transactional
    public UserInfo save(UserDTO userDTO) {
        return userRepository.save(userDTO.getProvider());
    }
}
