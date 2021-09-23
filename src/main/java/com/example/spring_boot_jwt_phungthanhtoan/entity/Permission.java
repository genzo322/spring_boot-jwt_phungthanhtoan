package com.example.spring_boot_jwt_phungthanhtoan.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "t_permission")
@Getter
@Setter

public class Permission extends BaseEnity{

    private String permissionName;

    private String permissionKey;
}
