package service.impl;

import org.springframework.stereotype.Service;
import service.RRoleService;

import javax.annotation.Resource;
import java.util.List;


import entity.RRole;
import dao.RRoleDao;
import service.RRoleService;

/**
 * (RRole)表服务实现类
 *
 * @author makejava
 * @since 2020-11-05 15:30:12
 */
@Service("rRoleService")
public class RRoleServiceImpl implements RRoleService {
    @Resource
    private RRoleDao rRoleDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public RRole queryById(Integer id) {
        return this.rRoleDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<RRole> queryAllByLimit(int offset, int limit) {
        return this.rRoleDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param rRole 实例对象
     * @return 实例对象
     */
    @Override
    public RRole insert(RRole rRole) {
        this.rRoleDao.insert(rRole);
        return rRole;
    }

    /**
     * 修改数据
     *
     * @param rRole 实例对象
     * @return 实例对象
     */
    @Override
    public RRole update(RRole rRole) {
        this.rRoleDao.update(rRole);
        return this.queryById(rRole.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.rRoleDao.deleteById(id) > 0;
    }
}