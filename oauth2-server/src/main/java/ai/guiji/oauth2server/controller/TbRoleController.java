package ai.guiji.oauth2server.controller;

import ai.guiji.oauth2server.entity.TbRole;
import ai.guiji.oauth2server.service.TbRoleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TbRole)表控制层
 *
 * @author makejava
 * @since 2019-12-18 19:55:43
 */
@RestController
@RequestMapping("tbRole")
public class TbRoleController {
    /**
     * 服务对象
     */
    @Resource
    private TbRoleService tbRoleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbRole selectOne(Long id) {
        return this.tbRoleService.queryById(id);
    }

}