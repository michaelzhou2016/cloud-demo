package ai.guiji.oauth2server.service.impl;

import ai.guiji.oauth2server.entity.TbPermission;
import ai.guiji.oauth2server.dao.TbPermissionDao;
import ai.guiji.oauth2server.service.TbPermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TbPermission)表服务实现类
 *
 * @author makejava
 * @since 2019-12-18 19:53:40
 */
@Service("tbPermissionService")
public class TbPermissionServiceImpl implements TbPermissionService {
    @Resource
    private TbPermissionDao tbPermissionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TbPermission queryById(Long id) {
        return this.tbPermissionDao.queryById(id);
    }

    @Override
    public List<TbPermission> getByUserId(Long userId) {
        return tbPermissionDao.queryByUserId(userId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<TbPermission> queryAllByLimit(int offset, int limit) {
        return this.tbPermissionDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tbPermission 实例对象
     * @return 实例对象
     */
    @Override
    public TbPermission insert(TbPermission tbPermission) {
        this.tbPermissionDao.insert(tbPermission);
        return tbPermission;
    }

    /**
     * 修改数据
     *
     * @param tbPermission 实例对象
     * @return 实例对象
     */
    @Override
    public TbPermission update(TbPermission tbPermission) {
        this.tbPermissionDao.update(tbPermission);
        return this.queryById(tbPermission.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.tbPermissionDao.deleteById(id) > 0;
    }
}