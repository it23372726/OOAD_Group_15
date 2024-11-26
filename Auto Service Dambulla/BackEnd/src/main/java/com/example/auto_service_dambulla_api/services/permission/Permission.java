package com.example.auto_service_dambulla_api.services.permission;

import com.example.auto_service_dambulla_api.services.role.Role;
import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Permission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long permissionId;

    private String permissionName;

    @ManyToMany(mappedBy = "permissions")
    private Set<Role> roles;

    // Getters and Setters
    public Long getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}

