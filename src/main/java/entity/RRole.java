package entity;

import java.io.Serializable;

/**
 * (RRole)实体类
 *
 * @author makejava
 * @since 2020-11-05 15:30:07
 */
public class RRole implements Serializable {
    private static final long serialVersionUID = -55056264330962953L;

    private Integer id;

    private String roleName;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

}