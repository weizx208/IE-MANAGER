package com.mds.manager.model;

public class RolePermission {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role_permission.id
     *
     * @mbggenerated Sat Aug 26 18:07:14 CST 2017
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role_permission.role_id
     *
     * @mbggenerated Sat Aug 26 18:07:14 CST 2017
     */
    private Long roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role_permission.permission_id
     *
     * @mbggenerated Sat Aug 26 18:07:14 CST 2017
     */
    private Long permissionId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role_permission.id
     *
     * @return the value of t_role_permission.id
     *
     * @mbggenerated Sat Aug 26 18:07:14 CST 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role_permission.id
     *
     * @param id the value for t_role_permission.id
     *
     * @mbggenerated Sat Aug 26 18:07:14 CST 2017
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role_permission.role_id
     *
     * @return the value of t_role_permission.role_id
     *
     * @mbggenerated Sat Aug 26 18:07:14 CST 2017
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role_permission.role_id
     *
     * @param roleId the value for t_role_permission.role_id
     *
     * @mbggenerated Sat Aug 26 18:07:14 CST 2017
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role_permission.permission_id
     *
     * @return the value of t_role_permission.permission_id
     *
     * @mbggenerated Sat Aug 26 18:07:14 CST 2017
     */
    public Long getPermissionId() {
        return permissionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role_permission.permission_id
     *
     * @param permissionId the value for t_role_permission.permission_id
     *
     * @mbggenerated Sat Aug 26 18:07:14 CST 2017
     */
    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }
}