package com.lps.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerExample() {
        oredCriteria = new ArrayList<Criteria>();
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
            criteria = new ArrayList<Criterion>();
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andCustIdIsNull() {
            addCriterion("cust_id is null");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNotNull() {
            addCriterion("cust_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustIdEqualTo(Integer value) {
            addCriterion("cust_id =", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotEqualTo(Integer value) {
            addCriterion("cust_id <>", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThan(Integer value) {
            addCriterion("cust_id >", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cust_id >=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThan(Integer value) {
            addCriterion("cust_id <", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThanOrEqualTo(Integer value) {
            addCriterion("cust_id <=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdIn(List<Integer> values) {
            addCriterion("cust_id in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotIn(List<Integer> values) {
            addCriterion("cust_id not in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdBetween(Integer value1, Integer value2) {
            addCriterion("cust_id between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cust_id not between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andCustNameIsNull() {
            addCriterion("cust_name is null");
            return (Criteria) this;
        }

        public Criteria andCustNameIsNotNull() {
            addCriterion("cust_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustNameEqualTo(String value) {
            addCriterion("cust_name =", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotEqualTo(String value) {
            addCriterion("cust_name <>", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThan(String value) {
            addCriterion("cust_name >", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThanOrEqualTo(String value) {
            addCriterion("cust_name >=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThan(String value) {
            addCriterion("cust_name <", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThanOrEqualTo(String value) {
            addCriterion("cust_name <=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLike(String value) {
            addCriterion("cust_name like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotLike(String value) {
            addCriterion("cust_name not like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameIn(List<String> values) {
            addCriterion("cust_name in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotIn(List<String> values) {
            addCriterion("cust_name not in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameBetween(String value1, String value2) {
            addCriterion("cust_name between", value1, value2, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotBetween(String value1, String value2) {
            addCriterion("cust_name not between", value1, value2, "custName");
            return (Criteria) this;
        }

        public Criteria andCustUsernameIsNull() {
            addCriterion("cust_username is null");
            return (Criteria) this;
        }

        public Criteria andCustUsernameIsNotNull() {
            addCriterion("cust_username is not null");
            return (Criteria) this;
        }

        public Criteria andCustUsernameEqualTo(String value) {
            addCriterion("cust_username =", value, "custUsername");
            return (Criteria) this;
        }

        public Criteria andCustUsernameNotEqualTo(String value) {
            addCriterion("cust_username <>", value, "custUsername");
            return (Criteria) this;
        }

        public Criteria andCustUsernameGreaterThan(String value) {
            addCriterion("cust_username >", value, "custUsername");
            return (Criteria) this;
        }

        public Criteria andCustUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("cust_username >=", value, "custUsername");
            return (Criteria) this;
        }

        public Criteria andCustUsernameLessThan(String value) {
            addCriterion("cust_username <", value, "custUsername");
            return (Criteria) this;
        }

        public Criteria andCustUsernameLessThanOrEqualTo(String value) {
            addCriterion("cust_username <=", value, "custUsername");
            return (Criteria) this;
        }

        public Criteria andCustUsernameLike(String value) {
            addCriterion("cust_username like", value, "custUsername");
            return (Criteria) this;
        }

        public Criteria andCustUsernameNotLike(String value) {
            addCriterion("cust_username not like", value, "custUsername");
            return (Criteria) this;
        }

        public Criteria andCustUsernameIn(List<String> values) {
            addCriterion("cust_username in", values, "custUsername");
            return (Criteria) this;
        }

        public Criteria andCustUsernameNotIn(List<String> values) {
            addCriterion("cust_username not in", values, "custUsername");
            return (Criteria) this;
        }

        public Criteria andCustUsernameBetween(String value1, String value2) {
            addCriterion("cust_username between", value1, value2, "custUsername");
            return (Criteria) this;
        }

        public Criteria andCustUsernameNotBetween(String value1, String value2) {
            addCriterion("cust_username not between", value1, value2, "custUsername");
            return (Criteria) this;
        }

        public Criteria andCustPasswordIsNull() {
            addCriterion("cust_password is null");
            return (Criteria) this;
        }

        public Criteria andCustPasswordIsNotNull() {
            addCriterion("cust_password is not null");
            return (Criteria) this;
        }

        public Criteria andCustPasswordEqualTo(String value) {
            addCriterion("cust_password =", value, "custPassword");
            return (Criteria) this;
        }

        public Criteria andCustPasswordNotEqualTo(String value) {
            addCriterion("cust_password <>", value, "custPassword");
            return (Criteria) this;
        }

        public Criteria andCustPasswordGreaterThan(String value) {
            addCriterion("cust_password >", value, "custPassword");
            return (Criteria) this;
        }

        public Criteria andCustPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("cust_password >=", value, "custPassword");
            return (Criteria) this;
        }

        public Criteria andCustPasswordLessThan(String value) {
            addCriterion("cust_password <", value, "custPassword");
            return (Criteria) this;
        }

        public Criteria andCustPasswordLessThanOrEqualTo(String value) {
            addCriterion("cust_password <=", value, "custPassword");
            return (Criteria) this;
        }

        public Criteria andCustPasswordLike(String value) {
            addCriterion("cust_password like", value, "custPassword");
            return (Criteria) this;
        }

        public Criteria andCustPasswordNotLike(String value) {
            addCriterion("cust_password not like", value, "custPassword");
            return (Criteria) this;
        }

        public Criteria andCustPasswordIn(List<String> values) {
            addCriterion("cust_password in", values, "custPassword");
            return (Criteria) this;
        }

        public Criteria andCustPasswordNotIn(List<String> values) {
            addCriterion("cust_password not in", values, "custPassword");
            return (Criteria) this;
        }

        public Criteria andCustPasswordBetween(String value1, String value2) {
            addCriterion("cust_password between", value1, value2, "custPassword");
            return (Criteria) this;
        }

        public Criteria andCustPasswordNotBetween(String value1, String value2) {
            addCriterion("cust_password not between", value1, value2, "custPassword");
            return (Criteria) this;
        }

        public Criteria andCustPhoneIsNull() {
            addCriterion("cust_phone is null");
            return (Criteria) this;
        }

        public Criteria andCustPhoneIsNotNull() {
            addCriterion("cust_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCustPhoneEqualTo(String value) {
            addCriterion("cust_phone =", value, "custPhone");
            return (Criteria) this;
        }

        public Criteria andCustPhoneNotEqualTo(String value) {
            addCriterion("cust_phone <>", value, "custPhone");
            return (Criteria) this;
        }

        public Criteria andCustPhoneGreaterThan(String value) {
            addCriterion("cust_phone >", value, "custPhone");
            return (Criteria) this;
        }

        public Criteria andCustPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("cust_phone >=", value, "custPhone");
            return (Criteria) this;
        }

        public Criteria andCustPhoneLessThan(String value) {
            addCriterion("cust_phone <", value, "custPhone");
            return (Criteria) this;
        }

        public Criteria andCustPhoneLessThanOrEqualTo(String value) {
            addCriterion("cust_phone <=", value, "custPhone");
            return (Criteria) this;
        }

        public Criteria andCustPhoneLike(String value) {
            addCriterion("cust_phone like", value, "custPhone");
            return (Criteria) this;
        }

        public Criteria andCustPhoneNotLike(String value) {
            addCriterion("cust_phone not like", value, "custPhone");
            return (Criteria) this;
        }

        public Criteria andCustPhoneIn(List<String> values) {
            addCriterion("cust_phone in", values, "custPhone");
            return (Criteria) this;
        }

        public Criteria andCustPhoneNotIn(List<String> values) {
            addCriterion("cust_phone not in", values, "custPhone");
            return (Criteria) this;
        }

        public Criteria andCustPhoneBetween(String value1, String value2) {
            addCriterion("cust_phone between", value1, value2, "custPhone");
            return (Criteria) this;
        }

        public Criteria andCustPhoneNotBetween(String value1, String value2) {
            addCriterion("cust_phone not between", value1, value2, "custPhone");
            return (Criteria) this;
        }

        public Criteria andCustEmailIsNull() {
            addCriterion("cust_email is null");
            return (Criteria) this;
        }

        public Criteria andCustEmailIsNotNull() {
            addCriterion("cust_email is not null");
            return (Criteria) this;
        }

        public Criteria andCustEmailEqualTo(String value) {
            addCriterion("cust_email =", value, "custEmail");
            return (Criteria) this;
        }

        public Criteria andCustEmailNotEqualTo(String value) {
            addCriterion("cust_email <>", value, "custEmail");
            return (Criteria) this;
        }

        public Criteria andCustEmailGreaterThan(String value) {
            addCriterion("cust_email >", value, "custEmail");
            return (Criteria) this;
        }

        public Criteria andCustEmailGreaterThanOrEqualTo(String value) {
            addCriterion("cust_email >=", value, "custEmail");
            return (Criteria) this;
        }

        public Criteria andCustEmailLessThan(String value) {
            addCriterion("cust_email <", value, "custEmail");
            return (Criteria) this;
        }

        public Criteria andCustEmailLessThanOrEqualTo(String value) {
            addCriterion("cust_email <=", value, "custEmail");
            return (Criteria) this;
        }

        public Criteria andCustEmailLike(String value) {
            addCriterion("cust_email like", value, "custEmail");
            return (Criteria) this;
        }

        public Criteria andCustEmailNotLike(String value) {
            addCriterion("cust_email not like", value, "custEmail");
            return (Criteria) this;
        }

        public Criteria andCustEmailIn(List<String> values) {
            addCriterion("cust_email in", values, "custEmail");
            return (Criteria) this;
        }

        public Criteria andCustEmailNotIn(List<String> values) {
            addCriterion("cust_email not in", values, "custEmail");
            return (Criteria) this;
        }

        public Criteria andCustEmailBetween(String value1, String value2) {
            addCriterion("cust_email between", value1, value2, "custEmail");
            return (Criteria) this;
        }

        public Criteria andCustEmailNotBetween(String value1, String value2) {
            addCriterion("cust_email not between", value1, value2, "custEmail");
            return (Criteria) this;
        }

        public Criteria andCustSexIsNull() {
            addCriterion("cust_sex is null");
            return (Criteria) this;
        }

        public Criteria andCustSexIsNotNull() {
            addCriterion("cust_sex is not null");
            return (Criteria) this;
        }

        public Criteria andCustSexEqualTo(String value) {
            addCriterion("cust_sex =", value, "custSex");
            return (Criteria) this;
        }

        public Criteria andCustSexNotEqualTo(String value) {
            addCriterion("cust_sex <>", value, "custSex");
            return (Criteria) this;
        }

        public Criteria andCustSexGreaterThan(String value) {
            addCriterion("cust_sex >", value, "custSex");
            return (Criteria) this;
        }

        public Criteria andCustSexGreaterThanOrEqualTo(String value) {
            addCriterion("cust_sex >=", value, "custSex");
            return (Criteria) this;
        }

        public Criteria andCustSexLessThan(String value) {
            addCriterion("cust_sex <", value, "custSex");
            return (Criteria) this;
        }

        public Criteria andCustSexLessThanOrEqualTo(String value) {
            addCriterion("cust_sex <=", value, "custSex");
            return (Criteria) this;
        }

        public Criteria andCustSexLike(String value) {
            addCriterion("cust_sex like", value, "custSex");
            return (Criteria) this;
        }

        public Criteria andCustSexNotLike(String value) {
            addCriterion("cust_sex not like", value, "custSex");
            return (Criteria) this;
        }

        public Criteria andCustSexIn(List<String> values) {
            addCriterion("cust_sex in", values, "custSex");
            return (Criteria) this;
        }

        public Criteria andCustSexNotIn(List<String> values) {
            addCriterion("cust_sex not in", values, "custSex");
            return (Criteria) this;
        }

        public Criteria andCustSexBetween(String value1, String value2) {
            addCriterion("cust_sex between", value1, value2, "custSex");
            return (Criteria) this;
        }

        public Criteria andCustSexNotBetween(String value1, String value2) {
            addCriterion("cust_sex not between", value1, value2, "custSex");
            return (Criteria) this;
        }

        public Criteria andCustBirthIsNull() {
            addCriterion("cust_birth is null");
            return (Criteria) this;
        }

        public Criteria andCustBirthIsNotNull() {
            addCriterion("cust_birth is not null");
            return (Criteria) this;
        }

        public Criteria andCustBirthEqualTo(Date value) {
            addCriterionForJDBCDate("cust_birth =", value, "custBirth");
            return (Criteria) this;
        }

        public Criteria andCustBirthNotEqualTo(Date value) {
            addCriterionForJDBCDate("cust_birth <>", value, "custBirth");
            return (Criteria) this;
        }

        public Criteria andCustBirthGreaterThan(Date value) {
            addCriterionForJDBCDate("cust_birth >", value, "custBirth");
            return (Criteria) this;
        }

        public Criteria andCustBirthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cust_birth >=", value, "custBirth");
            return (Criteria) this;
        }

        public Criteria andCustBirthLessThan(Date value) {
            addCriterionForJDBCDate("cust_birth <", value, "custBirth");
            return (Criteria) this;
        }

        public Criteria andCustBirthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cust_birth <=", value, "custBirth");
            return (Criteria) this;
        }

        public Criteria andCustBirthIn(List<Date> values) {
            addCriterionForJDBCDate("cust_birth in", values, "custBirth");
            return (Criteria) this;
        }

        public Criteria andCustBirthNotIn(List<Date> values) {
            addCriterionForJDBCDate("cust_birth not in", values, "custBirth");
            return (Criteria) this;
        }

        public Criteria andCustBirthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cust_birth between", value1, value2, "custBirth");
            return (Criteria) this;
        }

        public Criteria andCustBirthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cust_birth not between", value1, value2, "custBirth");
            return (Criteria) this;
        }

        public Criteria andCustAddressIsNull() {
            addCriterion("cust_address is null");
            return (Criteria) this;
        }

        public Criteria andCustAddressIsNotNull() {
            addCriterion("cust_address is not null");
            return (Criteria) this;
        }

        public Criteria andCustAddressEqualTo(String value) {
            addCriterion("cust_address =", value, "custAddress");
            return (Criteria) this;
        }

        public Criteria andCustAddressNotEqualTo(String value) {
            addCriterion("cust_address <>", value, "custAddress");
            return (Criteria) this;
        }

        public Criteria andCustAddressGreaterThan(String value) {
            addCriterion("cust_address >", value, "custAddress");
            return (Criteria) this;
        }

        public Criteria andCustAddressGreaterThanOrEqualTo(String value) {
            addCriterion("cust_address >=", value, "custAddress");
            return (Criteria) this;
        }

        public Criteria andCustAddressLessThan(String value) {
            addCriterion("cust_address <", value, "custAddress");
            return (Criteria) this;
        }

        public Criteria andCustAddressLessThanOrEqualTo(String value) {
            addCriterion("cust_address <=", value, "custAddress");
            return (Criteria) this;
        }

        public Criteria andCustAddressLike(String value) {
            addCriterion("cust_address like", value, "custAddress");
            return (Criteria) this;
        }

        public Criteria andCustAddressNotLike(String value) {
            addCriterion("cust_address not like", value, "custAddress");
            return (Criteria) this;
        }

        public Criteria andCustAddressIn(List<String> values) {
            addCriterion("cust_address in", values, "custAddress");
            return (Criteria) this;
        }

        public Criteria andCustAddressNotIn(List<String> values) {
            addCriterion("cust_address not in", values, "custAddress");
            return (Criteria) this;
        }

        public Criteria andCustAddressBetween(String value1, String value2) {
            addCriterion("cust_address between", value1, value2, "custAddress");
            return (Criteria) this;
        }

        public Criteria andCustAddressNotBetween(String value1, String value2) {
            addCriterion("cust_address not between", value1, value2, "custAddress");
            return (Criteria) this;
        }

        public Criteria andCustPicIsNull() {
            addCriterion("cust_pic is null");
            return (Criteria) this;
        }

        public Criteria andCustPicIsNotNull() {
            addCriterion("cust_pic is not null");
            return (Criteria) this;
        }

        public Criteria andCustPicEqualTo(String value) {
            addCriterion("cust_pic =", value, "custPic");
            return (Criteria) this;
        }

        public Criteria andCustPicNotEqualTo(String value) {
            addCriterion("cust_pic <>", value, "custPic");
            return (Criteria) this;
        }

        public Criteria andCustPicGreaterThan(String value) {
            addCriterion("cust_pic >", value, "custPic");
            return (Criteria) this;
        }

        public Criteria andCustPicGreaterThanOrEqualTo(String value) {
            addCriterion("cust_pic >=", value, "custPic");
            return (Criteria) this;
        }

        public Criteria andCustPicLessThan(String value) {
            addCriterion("cust_pic <", value, "custPic");
            return (Criteria) this;
        }

        public Criteria andCustPicLessThanOrEqualTo(String value) {
            addCriterion("cust_pic <=", value, "custPic");
            return (Criteria) this;
        }

        public Criteria andCustPicLike(String value) {
            addCriterion("cust_pic like", value, "custPic");
            return (Criteria) this;
        }

        public Criteria andCustPicNotLike(String value) {
            addCriterion("cust_pic not like", value, "custPic");
            return (Criteria) this;
        }

        public Criteria andCustPicIn(List<String> values) {
            addCriterion("cust_pic in", values, "custPic");
            return (Criteria) this;
        }

        public Criteria andCustPicNotIn(List<String> values) {
            addCriterion("cust_pic not in", values, "custPic");
            return (Criteria) this;
        }

        public Criteria andCustPicBetween(String value1, String value2) {
            addCriterion("cust_pic between", value1, value2, "custPic");
            return (Criteria) this;
        }

        public Criteria andCustPicNotBetween(String value1, String value2) {
            addCriterion("cust_pic not between", value1, value2, "custPic");
            return (Criteria) this;
        }

        public Criteria andCustCreateIsNull() {
            addCriterion("cust_create is null");
            return (Criteria) this;
        }

        public Criteria andCustCreateIsNotNull() {
            addCriterion("cust_create is not null");
            return (Criteria) this;
        }

        public Criteria andCustCreateEqualTo(Date value) {
            addCriterionForJDBCDate("cust_create =", value, "custCreate");
            return (Criteria) this;
        }

        public Criteria andCustCreateNotEqualTo(Date value) {
            addCriterionForJDBCDate("cust_create <>", value, "custCreate");
            return (Criteria) this;
        }

        public Criteria andCustCreateGreaterThan(Date value) {
            addCriterionForJDBCDate("cust_create >", value, "custCreate");
            return (Criteria) this;
        }

        public Criteria andCustCreateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cust_create >=", value, "custCreate");
            return (Criteria) this;
        }

        public Criteria andCustCreateLessThan(Date value) {
            addCriterionForJDBCDate("cust_create <", value, "custCreate");
            return (Criteria) this;
        }

        public Criteria andCustCreateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cust_create <=", value, "custCreate");
            return (Criteria) this;
        }

        public Criteria andCustCreateIn(List<Date> values) {
            addCriterionForJDBCDate("cust_create in", values, "custCreate");
            return (Criteria) this;
        }

        public Criteria andCustCreateNotIn(List<Date> values) {
            addCriterionForJDBCDate("cust_create not in", values, "custCreate");
            return (Criteria) this;
        }

        public Criteria andCustCreateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cust_create between", value1, value2, "custCreate");
            return (Criteria) this;
        }

        public Criteria andCustCreateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cust_create not between", value1, value2, "custCreate");
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