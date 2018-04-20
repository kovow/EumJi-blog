package com.eumji.zblog.mapper;

import com.eumji.zblog.vo.LogInfo;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface LogMapper {
    /**
     * 保存日志信息
     * @param log
     */
    void save(LogInfo log);
}
