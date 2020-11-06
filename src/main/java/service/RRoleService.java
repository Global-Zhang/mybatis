package service;
import entity.RRole;

import java.util.List;


import entity.RRole;

/**
 * (RRole)表服务接口
 *
 * @author makejava
 * @since 2020-11-05 15:30:11
 */
public interface RRoleService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    RRole queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<RRole> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param rRole 实例对象
     * @return 实例对象
     */
    RRole insert(RRole rRole);

    /**
     * 修改数据
     *
     * @param rRole 实例对象
     * @return 实例对象
     */
    RRole update(RRole rRole);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}