package ai.guiji.oauth2server.service.impl;

import ai.guiji.oauth2server.entity.TbUserRole;
import ai.guiji.oauth2server.dao.TbUserRoleDao;
import ai.guiji.oauth2server.service.TbUserRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TbUserRole)表服务实现类
 *
 * @author makejava
 * @since 2019-12-18 19:56:50
 */
@Service("tbUserRoleService")
public class TbUserRoleServiceImpl implements TbUserRoleService {
    @Resource
    private TbUserRoleDao tbUserRoleDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TbUserRole queryById(Long id) {
        return this.tbUserRoleDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TbUserRole> queryAllByLimit(int offset, int limit) {
        return this.tbUserRoleDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tbUserRole 实例对象
     * @return 实例对象
     */
    @Override
    public TbUserRole insert(TbUserRole tbUserRole) {
        this.tbUserRoleDao.insert(tbUserRole);
        return tbUserRole;
    }

    /**
     * 修改数据
     *
     * @param tbUserRole 实例对象
     * @return 实例对象
     */
    @Override
    public TbUserRole update(TbUserRole tbUserRole) {
        this.tbUserRoleDao.update(tbUserRole);
        return this.queryById(tbUserRole.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.tbUserRoleDao.deleteById(id) > 0;
    }
}