package com.contact.service.impl;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.contact.dao.*;
import com.contact.model.*;
import com.contact.service.*;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import com.contact.util.*;
import org.springframework.ui.ModelMap;
import java.util.*;
import com.contact.service.*;
import com.contact.controller.LoginModel;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.ParseException;
import java.io.IOException;
@Service
public class ContactServiceImpl implements ContactService{
	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
	SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMddHHmmss");
	SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM");
	@Autowired
	UserMapper userMapper;
	@Autowired
	ContactMapper contactMapper;
	/**
	新增
	*/
	@Override
	public String add(Contact model,LoginModel login){
		if(model.getName()==null||model.getName().equals("")){
			return "姓名为必填属性";
		}
		if(model.getSex()==null){
			return "性别为必填属性";
		}
		if(model.getHeadImg()==null||model.getHeadImg().equals("")){
			return "头像为必填属性";
		}
		if(model.getHeadImg()!=null){
			String [] fileSplit = model.getHeadImg().split(";");
			if(fileSplit.length>1){
				return "头像的图片数量不能大于1";
			}
		}
		if(model.getCelphone()==null||model.getCelphone().equals("")){
			return "联系电话为必填属性";
		}
		if(model.getCelphone()!=null){
		Pattern p = Pattern.compile("^[1](([3|5|8][\\d])|([4][4,5,6,7,8,9])|([6][2,5,6,7])|([7][^9])|([9][1,8,9]))[\\d]{8}$");
			Matcher m = p.matcher(model.getCelphone());
			if( m.matches()==false){
				return "请输入正确的联系电话";
			}
		}
		if(model.getEmail()==null||model.getEmail().equals("")){
			return "邮箱为必填属性";
		}
		if(model.getEmail()!=null){
		Pattern p = Pattern.compile("^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$");
			Matcher m = p.matcher(model.getEmail());
			if( m.matches()==false){
				return "请输入正确的邮箱";
			}
		}
		if(model.getAddress()==null||model.getAddress().equals("")){
			return "住址为必填属性";
		}
		if(model.getRemark()==null||model.getRemark().equals("")){
			return "备注为必填属性";
		}
		model.setCreateTime(sdf1.format(new Date()));//当前时间格式
		model.setUserId(login.getId());//登录id
		contactMapper.insertSelective(model);//插入数据
		return "";
	}
	/**
	修改
	*/
	@Override
	public String update(Contact model,LoginModel login){
		Contact preModel = contactMapper.selectByPrimaryKey(model.getId());
		if(model.getName()==null||model.getName().equals("")){
			return "姓名为必填属性";
		}
		if(model.getSex()==null){
			return "性别为必填属性";
		}
		if(model.getHeadImg()==null||model.getHeadImg().equals("")){
			return "头像为必填属性";
		}
		if(model.getHeadImg()!=null){
			String [] fileSplit = model.getHeadImg().split(";");
			if(fileSplit.length>1){
				return "头像的图片数量不能大于1";
			}
		}
		if(model.getCelphone()==null||model.getCelphone().equals("")){
			return "联系电话为必填属性";
		}
		if(model.getCelphone()!=null){
		Pattern p = Pattern.compile("^[1](([3|5|8][\\d])|([4][4,5,6,7,8,9])|([6][2,5,6,7])|([7][^9])|([9][1,8,9]))[\\d]{8}$");
			Matcher m = p.matcher(model.getCelphone());
			if( m.matches()==false){
				return "请输入正确的联系电话";
			}
		}
		if(model.getEmail()==null||model.getEmail().equals("")){
			return "邮箱为必填属性";
		}
		if(model.getEmail()!=null){
		Pattern p = Pattern.compile("^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$");
			Matcher m = p.matcher(model.getEmail());
			if( m.matches()==false){
				return "请输入正确的邮箱";
			}
		}
		if(model.getAddress()==null||model.getAddress().equals("")){
			return "住址为必填属性";
		}
		if(model.getRemark()==null||model.getRemark().equals("")){
			return "备注为必填属性";
		}
		preModel.setName(model.getName());
		preModel.setSex(model.getSex());
		preModel.setHeadImg(model.getHeadImg());
		preModel.setCelphone(model.getCelphone());
		preModel.setEmail(model.getEmail());
		preModel.setAddress(model.getAddress());
		preModel.setRemark(model.getRemark());
		contactMapper.updateByPrimaryKey(preModel);//更新数据
		return "";
	}
	/**
	*根据参数查询联系人列表总数
	*/
	@Override
	public Map<String,Integer> getDataListCount(Contact queryModel,Integer pageSize,LoginModel login) {
		ContactExample se = new ContactExample();
		ContactExample.Criteria sc = se.createCriteria();
		se.setOrderByClause("id desc");//默认按照id倒序排序
		if(queryModel.getName()!=null&&queryModel.getName().equals("")==false){
			sc.andNameLike("%"+queryModel.getName()+"%");//模糊查询
		}
		if(queryModel.getSex()!=null){
			sc.andSexEqualTo(queryModel.getSex());//查询性别等于指定值
		}
		if(queryModel.getCelphone()!=null&&queryModel.getCelphone().equals("")==false){
			sc.andCelphoneLike("%"+queryModel.getCelphone()+"%");//模糊查询
		}
		if(login.getLoginType()==2){
			sc.andUserIdEqualTo(login.getId());//查询权限限制
		}
		int count = (int)contactMapper.countByExample(se);
		int totalPage = 0;
		if ((count > 0) && ((count % pageSize) == 0)) {
			totalPage = count / pageSize;
		} else {
			totalPage = (count / pageSize) + 1;
		}
		Map<String,Integer> rs = new HashMap<String,Integer>();
		rs.put("count",count);//数据总数
		rs.put("totalPage",totalPage);//总页数
		return rs;
	}
	/**
	*根据参数查询联系人列表数据
	*/
	@Override
	public Map<String,Object> getDataList(Contact queryModel,Integer page,Integer pageSize,LoginModel login) {
		ContactExample se = new ContactExample();
		ContactExample.Criteria sc = se.createCriteria();
		se.setOrderByClause("id desc");//默认按照id倒序排序
		if(queryModel.getName()!=null&&queryModel.getName().equals("")==false){
			sc.andNameLike("%"+queryModel.getName()+"%");//模糊查询
		}
		if(queryModel.getSex()!=null){
			sc.andSexEqualTo(queryModel.getSex());//查询性别等于指定值
		}
		if(queryModel.getCelphone()!=null&&queryModel.getCelphone().equals("")==false){
			sc.andCelphoneLike("%"+queryModel.getCelphone()+"%");//模糊查询
		}
		if(login.getLoginType()==2){
			sc.andUserIdEqualTo(login.getId());//查询权限限制
		}
		if(page!=null&&pageSize!=null){
			se.setPageRows(pageSize);
			se.setStartRow((page-1)*pageSize);
		}
		List<Contact> list = contactMapper.selectByExample(se);//执行查询语句
		Map<String,Object> rs = new HashMap<String,Object>();
		List<Map<String,Object>> list2 = new ArrayList<Map<String,Object>>();
		for(Contact model:list){
			list2.add(getContactModel(model,login));
		}
		rs.put("list",list2);//数据列表
		return rs;
	}
	/**
	封装联系人为前台展示的数据形式
	*/
	@Override
	public Map<String,Object> getContactModel(Contact model,LoginModel login){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("contact",model);
		map.put("sexStr",DataListUtils.getSexNameById(model.getSex()+""));//解释性别字段
		List<String> headImgList = new ArrayList<String>();
		if(model.getHeadImg()!=null){
			String [] headImgSplit = model.getHeadImg().split(";");
			for(String tmpstr:headImgSplit ){
				if(tmpstr.equals("")==false){
					headImgList.add(tmpstr);
				}
			}
		}
		map.put("headImgList",headImgList);
		if(model.getUserId()!=null){
			User user = userMapper.selectByPrimaryKey(model.getUserId());//用户ID为外接字段，需要关联用户来解释该字段
			if(user!=null){
				map.put("userIdStr",user.getLoginName());
			}
		}
		return map;
	}
	/**
	* 删除数据
	*/
	@Override
	public void delete(Integer id) {
		contactMapper.deleteByPrimaryKey(id);
	}
}
