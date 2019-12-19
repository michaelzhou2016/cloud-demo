package ai.guiji.oauth2server.entity;

import java.io.Serializable;

/**
 * (TbUserRole)实体类
 *
 * @author makejava
 * @since 2019-12-18 19:56:50
 */
public class TbUserRole implements Serializable {
    private static final long serialVersionUID = -95330048459119480L;
    /**
    * 主键ID
    */
    private Long id;
    /**
    * 用户主键
    */
    private Long userId;
    /**
    * 角色ID
    */
    private Long roleId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

}