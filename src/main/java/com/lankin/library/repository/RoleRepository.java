package com.lankin.library.repository;

import com.lankin.library.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByUserType (Integer userType);
}
