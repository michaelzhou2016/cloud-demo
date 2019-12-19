package ai.guiji.oauth2server.entity;

import java.io.Serializable;

/**
 * (TbRolePermission)实体类
 *
 * @author makejava
 * @since 2019-12-18 19:56:04
 */
public class TbRolePermission implements Serializable {
    private static final long serialVersionUID = 252393164352159724L;
    /**
    * 主键ID
    */
    private Long id;
    /**
    * 角色ID
    */
    private Long roleId;
    /**
    * 权限ID
    */
    private Long permissionId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }

}