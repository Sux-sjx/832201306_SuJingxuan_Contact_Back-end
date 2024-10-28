package com.contact.model;
public class Contact {
	private Integer id;//ID
	private String name;//姓名
	private Integer sex;//性别
	private String headImg;//头像
	private String celphone;//联系电话
	private String email;//邮箱
	private String address;//住址
	private String remark;//备注
	private String createTime;//创建时间
	private Integer userId;//用户ID
	public Integer getId(){
		return id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name == null ? null : name.trim();
	}
	public Integer getSex(){
		return sex;
	}
	public void setSex(Integer sex){
		this.sex = sex;
	}
	public String getHeadImg(){
		return headImg;
	}
	public void setHeadImg(String headImg){
		this.headImg = headImg == null ? null : headImg.trim();
	}
	public String getCelphone(){
		return celphone;
	}
	public void setCelphone(String celphone){
		this.celphone = celphone == null ? null : celphone.trim();
	}
	public String getEmail(){
		return email;
	}
	public void setEmail(String email){
		this.email = email == null ? null : email.trim();
	}
	public String getAddress(){
		return address;
	}
	public void setAddress(String address){
		this.address = address == null ? null : address.trim();
	}
	public String getRemark(){
		return remark;
	}
	public void setRemark(String remark){
		this.remark = remark == null ? null : remark.trim();
	}
	public String getCreateTime(){
		return createTime;
	}
	public void setCreateTime(String createTime){
		this.createTime = createTime == null ? null : createTime.trim();
	}
	public Integer getUserId(){
		return userId;
	}
	public void setUserId(Integer userId){
		this.userId = userId;
	}
}
