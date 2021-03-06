package com.baiyajin.service.pagedata;

import com.baiyajin.entity.pagedata.PageReport;
import com.baiyajin.mapper.pagedata.PageReportMapper;
import com.baiyajin.vo.pagedata.Page;
import com.baiyajin.vo.pagedata.ReportVo;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class PageReportService extends ServiceImpl<PageReportMapper,PageReport> implements PageReportInterface {


    @Override
    public Page<ReportVo> findList(Page<ReportVo> page, ReportVo reportVo) {
        List<ReportVo> reportVoList = baseMapper.findList(reportVo);
        // 设置分页参数
        reportVo.setPage(page);
        // 执行分页查询
        page.setList(reportVoList);
        return page;
    }

    @Override
    public int getCount(ReportVo reportVo) {
        return baseMapper.getCount(reportVo);
    }

    @Override
    public int updateRemark(Map<String, Object> map) {
        return baseMapper.updateRemark(map);
    }

    @Override
    public Map<String, Object> selectRemarkByReportId(Map<String, Object> map) {
        return baseMapper.selectRemarkByReportId(map);
    }

    @Override
    public int addRemark(Map<String, Object> map) {
        return baseMapper.addRemark(map);
    }

    @Override
    public PageReport selectRemark(Map<String, Object> map) {
        return baseMapper.selectRemark(map);
    }
}
