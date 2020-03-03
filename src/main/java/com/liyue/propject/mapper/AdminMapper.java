package com.liyue.propject.mapper;

import com.liyue.propject.bean.Admin;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AdminMapper {

    @Select("select * from admin")
    List<Admin> findAll();

}
