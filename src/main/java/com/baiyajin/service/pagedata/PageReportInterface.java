package com.baiyajin.service.pagedata;

import com.baiyajin.entity.pagedata.PageReport;
import com.baiyajin.vo.pagedata.Page;
import com.baiyajin.vo.pagedata.ReportVo;
import com.baomidou.mybatisplus.service.IService;

import java.util.Map;

public interface PageReportInterface extends IService<PageReport> {

    Page<ReportVo> findList(Page<ReportVo> page, ReportVo reportVo);

    int getCount(ReportVo reportVo);

    int updateRemark(Map<String,Object> map);

    Map<String,Object> selectRemarkByReportId(Map<String,Object> map);

    int addRemark(Map<String,Object> map);

    PageReport selectRemark(Map<String,Object> map);


}
