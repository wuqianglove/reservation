/**
 * Copyright (C), 2019, 义金(杭州)健康科技有限公司
 * FileName: UserService
 * Author:   CentreS
 * Date:     2019-06-21 10:45
 * Description: 管理员用户管理
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.yjjk.reservation.service;

import com.yjjk.reservation.entity.Manager;
import com.yjjk.reservation.entity.User;

import java.util.List;

/**
 * @Description: 管理员用户管理
 * @author CentreS
 * @create 2019-06-21
 */
public interface ManagerService {

    /**
     * 查询管理员用户信息
     * @param manager
     * @return
     */
    List<Manager> getManagerInfoSelective(Manager manager);

    /**
     * 新增管理员
     * @param manager
     * @return
     */
    int insertSelective(Manager manager);

    /**
     * 更新管理员信息
     * @param manager
     * @return
     */
    int updateSelective(Manager manager);

    /**
     * 更新管理员角色
     * @param managerId
     * @param roleId
     * @return
     */
    int updateManagerRole(Integer managerId, Integer roleId);

    /**
     * 删除管理员角色
     * @param managerId
     * @return
     */
    int deleteManagerRole(Integer managerId);


}
