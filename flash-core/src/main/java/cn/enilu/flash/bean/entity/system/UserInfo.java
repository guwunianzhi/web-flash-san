package cn.enilu.flash.bean.entity.system;

import lombok.Data;

import java.util.Date;

import javax.persistence.Entity;

//@Entity
@Data
public class UserInfo {

  private String id ;
  private String userName ;
  private Date beginTime ;
  private Date endTime ;

}
