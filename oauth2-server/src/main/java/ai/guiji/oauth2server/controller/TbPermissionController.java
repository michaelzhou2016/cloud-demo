package ai.guiji.oauth2server.controller;

import ai.guiji.oauth2server.entity.TbPermission;
import ai.guiji.oauth2server.service.TbPermissionService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TbPermission)表控制层
 *
 * @author makejava
 * @since 2019-12-18 19:53:41
 */
@RestController
@RequestMapping("tbPermission")
public class TbPermissionController {
    /**
     * 服务对象
     */
    @Resource
    private TbPermissionService tbPermissionService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbPermission selectOne(Long id) {
        return this.tbPermissionService.queryById(id);
    }

}