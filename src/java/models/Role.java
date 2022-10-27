package models;

import java.io.Serializable;

/**
 *
 * @author 1drag
 */
public class Role implements Serializable {

    int roleID;
    String roleName;

    public Role() {
        roleID = 2;
    }

    public Role(int roleID, String roleName) {
        this.roleID = roleID;
        this.roleName = roleName;
    }

    public void setRoleID(int roleID) {
        this.roleID = roleID;
    }

    public void setroleName(String roleName) {
        this.roleName = roleName;
    }

    public int getRoleID() {
        return roleID;
    }

    public String getRoleName() {
        return roleName;
    }
    
}
