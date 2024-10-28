package com.contact.controller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.contact.dao.*;
import com.contact.model.*;
import com.contact.util.*;
import org.springframework.web.bind.annotation.CrossOrigin;
@CrossOrigin(origins = "*")
@Controller
@RequestMapping("/alterPwd/alterPassword")
public class AlterPasswordController {
	@Autowired
	AdminMapper adminMapper;
	@Autowired
	UserMapper userMapper;
	/**
	提交修改密码请求接口
	*/
	@RequestMapping("submit")
	@ResponseBody
	public Object submit( ModelMap modelMap,String password1,String password2,
	String password3,
	HttpServletRequest request, HttpServletResponse response) {
		Map<String,Object> rs = new HashMap<String,Object>();
		LoginModel user = (LoginModel) request.getSession().getAttribute(CommonVal.sessionName);
		if(password1==null||password2==null||password3==null){
			rs.put("rs", 0);
			rs.put("msg", "系统异常");
			return rs;
		}
		if(password2.equals(password3)==false){
			rs.put("rs", 0);
			rs.put("msg", "两次密码输入不一致");
			return rs;
		}
		if(user==null){
			rs.put("rs", 0);
			rs.put("msg", "尚未登录");
			return rs;
		}
		if(user.getLoginType()==1){//管理员角色修改密码
			Admin l  =adminMapper.selectByPrimaryKey(user.getId());//根据账号id查询账号信息
			if(l.getPassword().equals(password1)==false){
				rs.put("code",0);
				rs.put("msg","旧密码输入错误");
				return rs;
			}
			if(l.getPassword().equals(password2)){//新密码不能和原密码一样
				rs.put("code",0);
				rs.put("msg","新密码不能和原密码一致");
				return rs;
			}
			l.setPassword(password2);//设置为新密码
			adminMapper.updateByPrimaryKeySelective(l);//根据账号id和更改后的信息更新管理员的信息
		}
		if(user.getLoginType()==2){//用户角色修改密码
			User l  =userMapper.selectByPrimaryKey(user.getId());//根据账号id查询账号信息
			if(l.getPassword().equals(password1)==false){
				rs.put("code",0);
				rs.put("msg","旧密码输入错误");
				return rs;
			}
			if(l.getPassword().equals(password2)){//新密码不能和原密码一样
				rs.put("code",0);
				rs.put("msg","新密码不能和原密码一致");
				return rs;
			}
			l.setPassword(password2);//设置为新密码
			userMapper.updateByPrimaryKeySelective(l);//根据账号id和更改后的信息更新用户的信息
		}
		rs.put("rs", 1);
		rs.put("msg", "密码修改成功，会在下次登录生效");
		return rs;
	}
}
