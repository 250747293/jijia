package com.baiyajin.entity.pagedata;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
@TableName("page_subscription")
public class PageSubscription {
  private String id;
  private String title;
  private String materialID;
  private String areaID;
  private String time;
  private String userID;
  private String statusID;
  private String number;
  private String isPush;  //是否推送，0代表已推送，1代表未推送
  private BigDecimal bookPrice;//订阅时材料价格
  private String remark;

  private Timestamp createTime;
  private Timestamp updateTime;



}
