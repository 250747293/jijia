package com.baiyajin.mapper.pagedata;

import com.baiyajin.entity.pagedata.PageReport;
import com.baiyajin.vo.pagedata.ReportVo;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

public interface PageReportMapper extends BaseMapper<PageReport> {
    List<ReportVo> findList(ReportVo reportVo);

    int getCount(ReportVo reportVo);

    int updateRemark(Map<String,Object> map);

    Map<String,Object> selectRemarkByReportId(Map<String,Object> map);

    int addRemark(Map<String,Object> map);

    PageReport selectRemark(Map<String,Object> map);


}
