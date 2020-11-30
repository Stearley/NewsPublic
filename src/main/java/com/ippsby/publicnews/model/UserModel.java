package com.ippsby.publicnews.model;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;


@Data
@Entity
@Table(name = "users" )
public class UserModel implements Serializable {
    @JsonView(Security.Public.class)
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long userId;

    @JsonView(Security.Public.class)
    @Column(name = "roleId")
    private long roleId;

    @JsonView(Security.Local.class)
    @Column(name = "username")
    private String username;

    @JsonView(Security.Local.class)
    @Column(name = "password", length = 36)
        private String password;

   // @OneToMany(mappedBy = "newsId")
    //private List<News> newsModels;

    @JsonView(Security.Local.class)
    @OneToMany(mappedBy = "userModel")//связь пользователя и новостей
    private List<News> news;

    @JsonView(Security.Local.class)
    @ManyToMany
    @JoinTable(name = "peList",
            joinColumns = @JoinColumn(name = "peId"),
            inverseJoinColumns = @JoinColumn(name = "userId"))
    private List <Pe> peList;







}
