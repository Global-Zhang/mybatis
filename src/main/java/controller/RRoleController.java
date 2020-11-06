package controller;
import entity.RRole;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.RRoleService;
import javax.annotation.Resource;

/**
 * (RRole)表控制层
 *
 * @author makejava
 * @since 2020-11-05 15:30:13
 */
@RestController
@RequestMapping("rRole")
public class RRoleController {
    /**
     * 服务对象
     */
    @Resource
    private RRoleService rRoleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @RequestMapping("selectOne")
    public String selectOne(Integer id) {
        System.out.println("adfdvsavdavd");
        System.out.println("sdsdds");
        return "success"+id;
    }

    @RequestMapping("git")
    public String select(){
        System.out.println("gdsf");
        return "success";

    }

}