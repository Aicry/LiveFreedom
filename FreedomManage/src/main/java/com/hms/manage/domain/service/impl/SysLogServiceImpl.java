package com.hms.manage.domain.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hms.manage.domain.entity.SysLog;
import com.hms.manage.domain.service.SysLogService;
import com.hms.manage.mapper.SysLogMapper;
import org.springframework.stereotype.Service;

/**
* @author Hms
* @description 针对表【sys_log(系统日志)】的数据库操作Service实现
* @createDate 2023-08-19 15:02:12
*/
@Service
public class SysLogServiceImpl extends ServiceImpl<SysLogMapper, SysLog>
    implements SysLogService{

}




