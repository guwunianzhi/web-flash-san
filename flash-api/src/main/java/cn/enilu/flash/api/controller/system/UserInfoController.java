package cn.enilu.flash.api.controller.system;

import com.google.common.collect.Lists;

import cn.enilu.flash.bean.entity.system.UserInfo;
import cn.enilu.flash.bean.vo.front.Rets;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;

@RestController
@RequestMapping("/userInfo")
public class UserInfoController {

  @RequestMapping("/list")
  public Object list() {
    Date date = new Date();
    ArrayList<UserInfo> objects = Lists.newArrayList();
    UserInfo userInfo = new UserInfo();
    userInfo.setId("1");
    userInfo.setUserName("奋财");
    userInfo.setBeginTime(date);
    userInfo.setEndTime(date);
    UserInfo userInfo1 = new UserInfo();
    userInfo1.setId("2");
    userInfo1.setUserName("大超");
    userInfo1.setBeginTime(date);
    userInfo1.setEndTime(date);

    objects.add(userInfo);
    objects.add(userInfo1);

    return Rets.success(objects);

  }


}
