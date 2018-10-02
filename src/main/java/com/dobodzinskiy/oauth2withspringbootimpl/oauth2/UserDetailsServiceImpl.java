package com.dobodzinskiy.oauth2withspringbootimpl.oauth2;

import com.dobodzinskiy.oauth2withspringbootimpl.persist.entity.User;
import com.dobodzinskiy.oauth2withspringbootimpl.persist.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException(username));
        RequestContextHolder.currentRequestAttributes().setAttribute("userLogin", user.getUsername(), 1);

        return user;
    }

}
