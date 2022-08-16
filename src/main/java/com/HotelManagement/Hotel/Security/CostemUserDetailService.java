package com.HotelManagement.Hotel.Security;

import com.HotelManagement.Hotel.Models.User;
import com.HotelManagement.Hotel.Repository.UserRepo;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class CostemUserDetailService implements UserDetailsService {
    private UserRepo userRepo;
    @Override
    public org.springframework.security.core.userdetails.UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user= this.userRepo.findByEmail(username).orElseThrow();
        return  user;
    }
}
