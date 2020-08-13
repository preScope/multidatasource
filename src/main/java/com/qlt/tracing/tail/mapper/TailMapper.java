package com.qlt.tracing.tail.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TailMapper {


    @Select(" select count(1)  from  demo ")
    int  getAll();


}
