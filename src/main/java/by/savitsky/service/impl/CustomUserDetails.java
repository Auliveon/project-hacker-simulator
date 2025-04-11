package by.savitsky.service.impl;

import by.savitsky.service.ISecurityUserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetails implements UserDetailsService {

    private final ISecurityUserService securityUserService;

    public CustomUserDetails(ISecurityUserService securityUserService) {
        this.securityUserService = securityUserService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }

}
