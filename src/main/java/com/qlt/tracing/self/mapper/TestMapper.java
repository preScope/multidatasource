package com.qlt.tracing.self.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TestMapper {


    @Select( " select count(1) from  sys_user   "  )
    Integer countAll();
}
