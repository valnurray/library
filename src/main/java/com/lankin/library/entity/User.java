package com.lankin.library.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usr")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private long id;

    @Column(name = "username", nullable = false, unique = true)
    private String userName;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "e_mail", nullable = false)
    private String email;

    @Column(name = "gendertype", nullable = false)
    private int genderType;

    @Column(name = "birthday")
    private Date birthday;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private Status status;

//    @Column(name = "role_id", nullable = false)
//    private long roleId;

//    @ManyToOne(optional=false, cascade= CascadeType.ALL)
//    @JoinColumn(name="role_id")
//    private Role role;

//    @ManyToMany(fetch = FetchType.EAGER)
//    @JoinTable(name = "user_roles",
//            joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "user_id")},
//            inverseJoinColumns = {@JoinColumn(name = "role_id", referencedColumnName = "role_id")})
//    private Set<Role> roles;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "usr_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private List<Role> roles;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderField> orderField;

}