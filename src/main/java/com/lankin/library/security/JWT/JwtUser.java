package com.lankin.library.security.JWT;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Date;
import java.util.List;

public class JwtUser implements UserDetails {

    private final long id;
    private final String userName;
    private final String password;
    private final String email;
    private final int genderType;
    private final Date birthday;
    private final boolean enabled;
//    private final Date lastPasswordResetDate;
    private final Collection<? extends GrantedAuthority> authorities;

    public JwtUser(
            long id,
            String userName,
            String password,
            String email,
            int genderType,
            Date birthday,
            boolean enabled,
//            Date lastPasswordResetDate,
            Collection<? extends GrantedAuthority> authorities
    ) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.genderType = genderType;
        this.birthday = birthday;
        this.enabled = enabled;
//        this.lastPasswordResetDate = lastPasswordResetDate;
        this.authorities = authorities;
    }


    @JsonIgnore
    public long getId() {
        return id;
    }


    @Override
    @JsonIgnore
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public int getGenderType() {
        return genderType;
    }

    public Date getBirthday() {
        return birthday;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

//    public Date getLastPasswordResetDate() {
//        return lastPasswordResetDate;
//    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @JsonIgnore
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @JsonIgnore
    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @JsonIgnore
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

}
