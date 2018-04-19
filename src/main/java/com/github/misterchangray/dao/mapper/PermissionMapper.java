package com.github.misterchangray.dao.mapper;

import com.github.misterchangray.dao.entity.Permission;
import com.github.misterchangray.dao.entity.PermissionQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PermissionMapper {
    long countByQuery(PermissionQuery query);

    int deleteByQuery(PermissionQuery query);

    int deleteByPrimaryKey(Integer id);

    int insert(Permission record);

    int insertSelective(Permission record);

    List<Permission> selectByQuery(PermissionQuery query);

    Permission selectByPrimaryKey(Integer id);

    int updateByQuerySelective(@Param("record") Permission record, @Param("example") PermissionQuery query);

    int updateByQuery(@Param("record") Permission record, @Param("example") PermissionQuery query);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permission
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int batchInsert(@Param("list") List<Permission> list);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permission
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int batchInsertSelective(@Param("list") List<Permission> list, @Param("selective") Permission.Column ... selective);
}