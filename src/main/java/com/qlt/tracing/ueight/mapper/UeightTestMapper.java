package com.qlt.tracing.ueight.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UeightTestMapper {


    @Select( " select count(1) from  data_wares   "  )
    Integer countAll();
}
