package ai.guiji.oauth2server.service.impl;

import ai.guiji.oauth2server.entity.TbRole;
import ai.guiji.oauth2server.dao.TbRoleDao;
import ai.guiji.oauth2server.service.TbRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TbRole)表服务实现类
 *
 * @author makejava
 * @since 2019-12-18 19:55:43
 */
@Service("tbRoleService")
public class TbRoleServiceImpl implements TbRoleService {
    @Resource
    private TbRoleDao tbRoleDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TbRole queryById(Long id) {
        return this.tbRoleDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TbRole> queryAllByLimit(int offset, int limit) {
        return this.tbRoleDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tbRole 实例对象
     * @return 实例对象
     */
    @Override
    public TbRole insert(TbRole tbRole) {
        this.tbRoleDao.insert(tbRole);
        return tbRole;
    }

    /**
     * 修改数据
     *
     * @param tbRole 实例对象
     * @return 实例对象
     */
    @Override
    public TbRole update(TbRole tbRole) {
        this.tbRoleDao.update(tbRole);
        return this.queryById(tbRole.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.tbRoleDao.deleteById(id) > 0;
    }
}