package com.contact.model;
import java.util.ArrayList;
import java.util.List;
public class ContactExample {
	protected String orderByClause;
	protected boolean distinct;
	protected int startRow;
	protected int pageRows;
	protected List<Criteria> oredCriteria;
	public ContactExample() {
		oredCriteria = new ArrayList<>();
	}
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}
	public String getOrderByClause() {
		return orderByClause;
	}
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}
	public boolean isDistinct() {
		return distinct;
	}
	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}
	public int getStartRow() {
		return startRow;
	}
	public void setPageRows(int pageRows) {
		this.pageRows = pageRows;
	}
	public int getPageRows() {
		return pageRows;
	}
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;
		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<>();
		}
		public boolean isValid() {
			return criteria.size() > 0;
		}
		public List<Criterion> getAllCriteria() {
			return criteria;
		}
		public List<Criterion> getCriteria() {
			return criteria;
		}
		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}
		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}
		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}
		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return (Criteria) this;
		}
		public Criteria andIdIsNotNull(){
			addCriterion("id is not null");
			return (Criteria) this;
		}
		public Criteria andIdEqualTo(Integer value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}
		public Criteria andIdNotEqualTo(Integer value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}
		public Criteria andIdGreaterThan(Integer value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}
		public Criteria andIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("id >=", value, "Id");
			return (Criteria) this;
		}
		public Criteria andIdLessThan(Integer value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}
		public Criteria andIdLessThanOrEqualTo(Integer value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}
		public Criteria andIdIn(List<Integer> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}
		public Criteria andIdNotIn(List<Integer> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}
		public Criteria andIdBetween(Integer value1, Integer value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}
		public Criteria andIdNotBetween(Integer value1, Integer value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}
		public Criteria andIdLike(Integer value) {
			addCriterion("id like", value, "id");
			return (Criteria) this;
		}
		public Criteria andIdNotLike(Integer value) {
			addCriterion("id not like", value, "id");
			return (Criteria) this;
		}
		public Criteria andNameIsNull() {
			addCriterion("name is null");
			return (Criteria) this;
		}
		public Criteria andNameIsNotNull(){
			addCriterion("name is not null");
			return (Criteria) this;
		}
		public Criteria andNameEqualTo(String value) {
			addCriterion("name =", value, "name");
			return (Criteria) this;
		}
		public Criteria andNameNotEqualTo(String value) {
			addCriterion("name <>", value, "name");
			return (Criteria) this;
		}
		public Criteria andNameGreaterThan(String value) {
			addCriterion("name >", value, "name");
			return (Criteria) this;
		}
		public Criteria andNameGreaterThanOrEqualTo(String value) {
			addCriterion("name >=", value, "Name");
			return (Criteria) this;
		}
		public Criteria andNameLessThan(String value) {
			addCriterion("name <", value, "name");
			return (Criteria) this;
		}
		public Criteria andNameLessThanOrEqualTo(String value) {
			addCriterion("name <=", value, "name");
			return (Criteria) this;
		}
		public Criteria andNameIn(List<String> values) {
			addCriterion("name in", values, "name");
			return (Criteria) this;
		}
		public Criteria andNameNotIn(List<String> values) {
			addCriterion("name not in", values, "name");
			return (Criteria) this;
		}
		public Criteria andNameBetween(String value1, String value2) {
			addCriterion("name between", value1, value2, "name");
			return (Criteria) this;
		}
		public Criteria andNameNotBetween(String value1, String value2) {
			addCriterion("name not between", value1, value2, "name");
			return (Criteria) this;
		}
		public Criteria andNameLike(String value) {
			addCriterion("name like", value, "name");
			return (Criteria) this;
		}
		public Criteria andNameNotLike(String value) {
			addCriterion("name not like", value, "name");
			return (Criteria) this;
		}
		public Criteria andSexIsNull() {
			addCriterion("sex is null");
			return (Criteria) this;
		}
		public Criteria andSexIsNotNull(){
			addCriterion("sex is not null");
			return (Criteria) this;
		}
		public Criteria andSexEqualTo(Integer value) {
			addCriterion("sex =", value, "sex");
			return (Criteria) this;
		}
		public Criteria andSexNotEqualTo(Integer value) {
			addCriterion("sex <>", value, "sex");
			return (Criteria) this;
		}
		public Criteria andSexGreaterThan(Integer value) {
			addCriterion("sex >", value, "sex");
			return (Criteria) this;
		}
		public Criteria andSexGreaterThanOrEqualTo(Integer value) {
			addCriterion("sex >=", value, "Sex");
			return (Criteria) this;
		}
		public Criteria andSexLessThan(Integer value) {
			addCriterion("sex <", value, "sex");
			return (Criteria) this;
		}
		public Criteria andSexLessThanOrEqualTo(Integer value) {
			addCriterion("sex <=", value, "sex");
			return (Criteria) this;
		}
		public Criteria andSexIn(List<Integer> values) {
			addCriterion("sex in", values, "sex");
			return (Criteria) this;
		}
		public Criteria andSexNotIn(List<Integer> values) {
			addCriterion("sex not in", values, "sex");
			return (Criteria) this;
		}
		public Criteria andSexBetween(Integer value1, Integer value2) {
			addCriterion("sex between", value1, value2, "sex");
			return (Criteria) this;
		}
		public Criteria andSexNotBetween(Integer value1, Integer value2) {
			addCriterion("sex not between", value1, value2, "sex");
			return (Criteria) this;
		}
		public Criteria andSexLike(Integer value) {
			addCriterion("sex like", value, "sex");
			return (Criteria) this;
		}
		public Criteria andSexNotLike(Integer value) {
			addCriterion("sex not like", value, "sex");
			return (Criteria) this;
		}
		public Criteria andHeadImgIsNull() {
			addCriterion("head_img is null");
			return (Criteria) this;
		}
		public Criteria andHeadImgIsNotNull(){
			addCriterion("head_img is not null");
			return (Criteria) this;
		}
		public Criteria andHeadImgEqualTo(String value) {
			addCriterion("head_img =", value, "headImg");
			return (Criteria) this;
		}
		public Criteria andHeadImgNotEqualTo(String value) {
			addCriterion("head_img <>", value, "headImg");
			return (Criteria) this;
		}
		public Criteria andHeadImgGreaterThan(String value) {
			addCriterion("head_img >", value, "headImg");
			return (Criteria) this;
		}
		public Criteria andHeadImgGreaterThanOrEqualTo(String value) {
			addCriterion("head_img >=", value, "HeadImg");
			return (Criteria) this;
		}
		public Criteria andHeadImgLessThan(String value) {
			addCriterion("head_img <", value, "headImg");
			return (Criteria) this;
		}
		public Criteria andHeadImgLessThanOrEqualTo(String value) {
			addCriterion("head_img <=", value, "headImg");
			return (Criteria) this;
		}
		public Criteria andHeadImgIn(List<String> values) {
			addCriterion("head_img in", values, "headImg");
			return (Criteria) this;
		}
		public Criteria andHeadImgNotIn(List<String> values) {
			addCriterion("head_img not in", values, "headImg");
			return (Criteria) this;
		}
		public Criteria andHeadImgBetween(String value1, String value2) {
			addCriterion("head_img between", value1, value2, "headImg");
			return (Criteria) this;
		}
		public Criteria andHeadImgNotBetween(String value1, String value2) {
			addCriterion("head_img not between", value1, value2, "headImg");
			return (Criteria) this;
		}
		public Criteria andHeadImgLike(String value) {
			addCriterion("head_img like", value, "headImg");
			return (Criteria) this;
		}
		public Criteria andHeadImgNotLike(String value) {
			addCriterion("head_img not like", value, "headImg");
			return (Criteria) this;
		}
		public Criteria andCelphoneIsNull() {
			addCriterion("celphone is null");
			return (Criteria) this;
		}
		public Criteria andCelphoneIsNotNull(){
			addCriterion("celphone is not null");
			return (Criteria) this;
		}
		public Criteria andCelphoneEqualTo(String value) {
			addCriterion("celphone =", value, "celphone");
			return (Criteria) this;
		}
		public Criteria andCelphoneNotEqualTo(String value) {
			addCriterion("celphone <>", value, "celphone");
			return (Criteria) this;
		}
		public Criteria andCelphoneGreaterThan(String value) {
			addCriterion("celphone >", value, "celphone");
			return (Criteria) this;
		}
		public Criteria andCelphoneGreaterThanOrEqualTo(String value) {
			addCriterion("celphone >=", value, "Celphone");
			return (Criteria) this;
		}
		public Criteria andCelphoneLessThan(String value) {
			addCriterion("celphone <", value, "celphone");
			return (Criteria) this;
		}
		public Criteria andCelphoneLessThanOrEqualTo(String value) {
			addCriterion("celphone <=", value, "celphone");
			return (Criteria) this;
		}
		public Criteria andCelphoneIn(List<String> values) {
			addCriterion("celphone in", values, "celphone");
			return (Criteria) this;
		}
		public Criteria andCelphoneNotIn(List<String> values) {
			addCriterion("celphone not in", values, "celphone");
			return (Criteria) this;
		}
		public Criteria andCelphoneBetween(String value1, String value2) {
			addCriterion("celphone between", value1, value2, "celphone");
			return (Criteria) this;
		}
		public Criteria andCelphoneNotBetween(String value1, String value2) {
			addCriterion("celphone not between", value1, value2, "celphone");
			return (Criteria) this;
		}
		public Criteria andCelphoneLike(String value) {
			addCriterion("celphone like", value, "celphone");
			return (Criteria) this;
		}
		public Criteria andCelphoneNotLike(String value) {
			addCriterion("celphone not like", value, "celphone");
			return (Criteria) this;
		}
		public Criteria andEmailIsNull() {
			addCriterion("email is null");
			return (Criteria) this;
		}
		public Criteria andEmailIsNotNull(){
			addCriterion("email is not null");
			return (Criteria) this;
		}
		public Criteria andEmailEqualTo(String value) {
			addCriterion("email =", value, "email");
			return (Criteria) this;
		}
		public Criteria andEmailNotEqualTo(String value) {
			addCriterion("email <>", value, "email");
			return (Criteria) this;
		}
		public Criteria andEmailGreaterThan(String value) {
			addCriterion("email >", value, "email");
			return (Criteria) this;
		}
		public Criteria andEmailGreaterThanOrEqualTo(String value) {
			addCriterion("email >=", value, "Email");
			return (Criteria) this;
		}
		public Criteria andEmailLessThan(String value) {
			addCriterion("email <", value, "email");
			return (Criteria) this;
		}
		public Criteria andEmailLessThanOrEqualTo(String value) {
			addCriterion("email <=", value, "email");
			return (Criteria) this;
		}
		public Criteria andEmailIn(List<String> values) {
			addCriterion("email in", values, "email");
			return (Criteria) this;
		}
		public Criteria andEmailNotIn(List<String> values) {
			addCriterion("email not in", values, "email");
			return (Criteria) this;
		}
		public Criteria andEmailBetween(String value1, String value2) {
			addCriterion("email between", value1, value2, "email");
			return (Criteria) this;
		}
		public Criteria andEmailNotBetween(String value1, String value2) {
			addCriterion("email not between", value1, value2, "email");
			return (Criteria) this;
		}
		public Criteria andEmailLike(String value) {
			addCriterion("email like", value, "email");
			return (Criteria) this;
		}
		public Criteria andEmailNotLike(String value) {
			addCriterion("email not like", value, "email");
			return (Criteria) this;
		}
		public Criteria andAddressIsNull() {
			addCriterion("address is null");
			return (Criteria) this;
		}
		public Criteria andAddressIsNotNull(){
			addCriterion("address is not null");
			return (Criteria) this;
		}
		public Criteria andAddressEqualTo(String value) {
			addCriterion("address =", value, "address");
			return (Criteria) this;
		}
		public Criteria andAddressNotEqualTo(String value) {
			addCriterion("address <>", value, "address");
			return (Criteria) this;
		}
		public Criteria andAddressGreaterThan(String value) {
			addCriterion("address >", value, "address");
			return (Criteria) this;
		}
		public Criteria andAddressGreaterThanOrEqualTo(String value) {
			addCriterion("address >=", value, "Address");
			return (Criteria) this;
		}
		public Criteria andAddressLessThan(String value) {
			addCriterion("address <", value, "address");
			return (Criteria) this;
		}
		public Criteria andAddressLessThanOrEqualTo(String value) {
			addCriterion("address <=", value, "address");
			return (Criteria) this;
		}
		public Criteria andAddressIn(List<String> values) {
			addCriterion("address in", values, "address");
			return (Criteria) this;
		}
		public Criteria andAddressNotIn(List<String> values) {
			addCriterion("address not in", values, "address");
			return (Criteria) this;
		}
		public Criteria andAddressBetween(String value1, String value2) {
			addCriterion("address between", value1, value2, "address");
			return (Criteria) this;
		}
		public Criteria andAddressNotBetween(String value1, String value2) {
			addCriterion("address not between", value1, value2, "address");
			return (Criteria) this;
		}
		public Criteria andAddressLike(String value) {
			addCriterion("address like", value, "address");
			return (Criteria) this;
		}
		public Criteria andAddressNotLike(String value) {
			addCriterion("address not like", value, "address");
			return (Criteria) this;
		}
		public Criteria andRemarkIsNull() {
			addCriterion("remark is null");
			return (Criteria) this;
		}
		public Criteria andRemarkIsNotNull(){
			addCriterion("remark is not null");
			return (Criteria) this;
		}
		public Criteria andRemarkEqualTo(String value) {
			addCriterion("remark =", value, "remark");
			return (Criteria) this;
		}
		public Criteria andRemarkNotEqualTo(String value) {
			addCriterion("remark <>", value, "remark");
			return (Criteria) this;
		}
		public Criteria andRemarkGreaterThan(String value) {
			addCriterion("remark >", value, "remark");
			return (Criteria) this;
		}
		public Criteria andRemarkGreaterThanOrEqualTo(String value) {
			addCriterion("remark >=", value, "Remark");
			return (Criteria) this;
		}
		public Criteria andRemarkLessThan(String value) {
			addCriterion("remark <", value, "remark");
			return (Criteria) this;
		}
		public Criteria andRemarkLessThanOrEqualTo(String value) {
			addCriterion("remark <=", value, "remark");
			return (Criteria) this;
		}
		public Criteria andRemarkIn(List<String> values) {
			addCriterion("remark in", values, "remark");
			return (Criteria) this;
		}
		public Criteria andRemarkNotIn(List<String> values) {
			addCriterion("remark not in", values, "remark");
			return (Criteria) this;
		}
		public Criteria andRemarkBetween(String value1, String value2) {
			addCriterion("remark between", value1, value2, "remark");
			return (Criteria) this;
		}
		public Criteria andRemarkNotBetween(String value1, String value2) {
			addCriterion("remark not between", value1, value2, "remark");
			return (Criteria) this;
		}
		public Criteria andRemarkLike(String value) {
			addCriterion("remark like", value, "remark");
			return (Criteria) this;
		}
		public Criteria andRemarkNotLike(String value) {
			addCriterion("remark not like", value, "remark");
			return (Criteria) this;
		}
		public Criteria andCreateTimeIsNull() {
			addCriterion("create_time is null");
			return (Criteria) this;
		}
		public Criteria andCreateTimeIsNotNull(){
			addCriterion("create_time is not null");
			return (Criteria) this;
		}
		public Criteria andCreateTimeEqualTo(String value) {
			addCriterion("create_time =", value, "createTime");
			return (Criteria) this;
		}
		public Criteria andCreateTimeNotEqualTo(String value) {
			addCriterion("create_time <>", value, "createTime");
			return (Criteria) this;
		}
		public Criteria andCreateTimeGreaterThan(String value) {
			addCriterion("create_time >", value, "createTime");
			return (Criteria) this;
		}
		public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
			addCriterion("create_time >=", value, "CreateTime");
			return (Criteria) this;
		}
		public Criteria andCreateTimeLessThan(String value) {
			addCriterion("create_time <", value, "createTime");
			return (Criteria) this;
		}
		public Criteria andCreateTimeLessThanOrEqualTo(String value) {
			addCriterion("create_time <=", value, "createTime");
			return (Criteria) this;
		}
		public Criteria andCreateTimeIn(List<String> values) {
			addCriterion("create_time in", values, "createTime");
			return (Criteria) this;
		}
		public Criteria andCreateTimeNotIn(List<String> values) {
			addCriterion("create_time not in", values, "createTime");
			return (Criteria) this;
		}
		public Criteria andCreateTimeBetween(String value1, String value2) {
			addCriterion("create_time between", value1, value2, "createTime");
			return (Criteria) this;
		}
		public Criteria andCreateTimeNotBetween(String value1, String value2) {
			addCriterion("create_time not between", value1, value2, "createTime");
			return (Criteria) this;
		}
		public Criteria andCreateTimeLike(String value) {
			addCriterion("create_time like", value, "createTime");
			return (Criteria) this;
		}
		public Criteria andCreateTimeNotLike(String value) {
			addCriterion("create_time not like", value, "createTime");
			return (Criteria) this;
		}
		public Criteria andUserIdIsNull() {
			addCriterion("user_id is null");
			return (Criteria) this;
		}
		public Criteria andUserIdIsNotNull(){
			addCriterion("user_id is not null");
			return (Criteria) this;
		}
		public Criteria andUserIdEqualTo(Integer value) {
			addCriterion("user_id =", value, "userId");
			return (Criteria) this;
		}
		public Criteria andUserIdNotEqualTo(Integer value) {
			addCriterion("user_id <>", value, "userId");
			return (Criteria) this;
		}
		public Criteria andUserIdGreaterThan(Integer value) {
			addCriterion("user_id >", value, "userId");
			return (Criteria) this;
		}
		public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("user_id >=", value, "UserId");
			return (Criteria) this;
		}
		public Criteria andUserIdLessThan(Integer value) {
			addCriterion("user_id <", value, "userId");
			return (Criteria) this;
		}
		public Criteria andUserIdLessThanOrEqualTo(Integer value) {
			addCriterion("user_id <=", value, "userId");
			return (Criteria) this;
		}
		public Criteria andUserIdIn(List<Integer> values) {
			addCriterion("user_id in", values, "userId");
			return (Criteria) this;
		}
		public Criteria andUserIdNotIn(List<Integer> values) {
			addCriterion("user_id not in", values, "userId");
			return (Criteria) this;
		}
		public Criteria andUserIdBetween(Integer value1, Integer value2) {
			addCriterion("user_id between", value1, value2, "userId");
			return (Criteria) this;
		}
		public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
			addCriterion("user_id not between", value1, value2, "userId");
			return (Criteria) this;
		}
		public Criteria andUserIdLike(Integer value) {
			addCriterion("user_id like", value, "userId");
			return (Criteria) this;
		}
		public Criteria andUserIdNotLike(Integer value) {
			addCriterion("user_id not like", value, "userId");
			return (Criteria) this;
		}
	}
	public static class Criteria extends GeneratedCriteria {
		protected Criteria() {
			super();
		}
	}
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;
		public String getCondition() {
			return condition;
		}
		public Object getValue() {
			return value;
		}
		public Object getSecondValue() {
			return secondValue;
		}
		public boolean isNoValue() {
			return noValue;
		}
		public boolean isSingleValue() {
			return singleValue;
		}
		public boolean isBetweenValue() {
			return betweenValue;
		}
		public boolean isListValue() {
			return listValue;
		}
		public String getTypeHandler() {
			return typeHandler;
		}
		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}
		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}
		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}
		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}
		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}
}
