package ai.guiji.oauth2server.controller;

import ai.guiji.oauth2server.entity.TbUserRole;
import ai.guiji.oauth2server.service.TbUserRoleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TbUserRole)表控制层
 *
 * @author makejava
 * @since 2019-12-18 19:56:50
 */
@RestController
@RequestMapping("tbUserRole")
public class TbUserRoleController {
    /**
     * 服务对象
     */
    @Resource
    private TbUserRoleService tbUserRoleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbUserRole selectOne(Long id) {
        return this.tbUserRoleService.queryById(id);
    }

}