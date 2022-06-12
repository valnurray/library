package com.lankin.library.security.JWT;

import com.lankin.library.entity.Role;
import com.lankin.library.entity.Status;
import com.lankin.library.entity.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public final class JwtUserFactory {

    public JwtUserFactory() {
    }

    public static JwtUser create(User user) {
        return new JwtUser(
                user.getId(),
                user.getUserName(),
                user.getPassword(),
                user.getEmail(),
                user.getGenderType(),
                user.getBirthday(),
                user.getStatus().equals(Status.ACTIVE),
//                null,
                mapToGrantedAuthorities(new ArrayList<>(user.getRoles()))
        );
    }

    private static List<GrantedAuthority> mapToGrantedAuthorities(List<Role> userRoles) {
        return userRoles.stream()
                .map(role ->
                        new SimpleGrantedAuthority(role.getUserType())
                ).collect(Collectors.toList());
    }
}
