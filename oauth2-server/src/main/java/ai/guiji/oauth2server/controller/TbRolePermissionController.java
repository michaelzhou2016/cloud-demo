package ai.guiji.oauth2server.controller;

import ai.guiji.oauth2server.entity.TbRolePermission;
import ai.guiji.oauth2server.service.TbRolePermissionService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TbRolePermission)表控制层
 *
 * @author makejava
 * @since 2019-12-18 19:56:04
 */
@RestController
@RequestMapping("tbRolePermission")
public class TbRolePermissionController {
    /**
     * 服务对象
     */
    @Resource
    private TbRolePermissionService tbRolePermissionService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbRolePermission selectOne(Long id) {
        return this.tbRolePermissionService.queryById(id);
    }

}