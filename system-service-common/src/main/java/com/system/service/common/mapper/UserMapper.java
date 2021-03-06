package com.system.service.common.mapper;

import com.system.service.common.domain.UserVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    List<UserVO> select(UserVO userVO);

    UserVO selectByUserId(@Param("userId") String userId);

    UserVO selectByLoginName(@Param("loginName") String loginName);

    int judgeUserExistsByLoginName(@Param("loginName") String loginName);

    int insert(UserVO userVO);

    int updateByUserId(UserVO userVo);

    int deleteByUserId(@Param("userId") String userId);
}