package com.lps.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AdminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminExample() {
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

        public Criteria andAdminIdIsNull() {
            addCriterion("admin_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNotNull() {
            addCriterion("admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminIdEqualTo(Integer value) {
            addCriterion("admin_id =", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotEqualTo(Integer value) {
            addCriterion("admin_id <>", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThan(Integer value) {
            addCriterion("admin_id >", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_id >=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThan(Integer value) {
            addCriterion("admin_id <", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThanOrEqualTo(Integer value) {
            addCriterion("admin_id <=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIn(List<Integer> values) {
            addCriterion("admin_id in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotIn(List<Integer> values) {
            addCriterion("admin_id not in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdBetween(Integer value1, Integer value2) {
            addCriterion("admin_id between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_id not between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminNumIsNull() {
            addCriterion("admin_num is null");
            return (Criteria) this;
        }

        public Criteria andAdminNumIsNotNull() {
            addCriterion("admin_num is not null");
            return (Criteria) this;
        }

        public Criteria andAdminNumEqualTo(Integer value) {
            addCriterion("admin_num =", value, "adminNum");
            return (Criteria) this;
        }

        public Criteria andAdminNumNotEqualTo(Integer value) {
            addCriterion("admin_num <>", value, "adminNum");
            return (Criteria) this;
        }

        public Criteria andAdminNumGreaterThan(Integer value) {
            addCriterion("admin_num >", value, "adminNum");
            return (Criteria) this;
        }

        public Criteria andAdminNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_num >=", value, "adminNum");
            return (Criteria) this;
        }

        public Criteria andAdminNumLessThan(Integer value) {
            addCriterion("admin_num <", value, "adminNum");
            return (Criteria) this;
        }

        public Criteria andAdminNumLessThanOrEqualTo(Integer value) {
            addCriterion("admin_num <=", value, "adminNum");
            return (Criteria) this;
        }

        public Criteria andAdminNumIn(List<Integer> values) {
            addCriterion("admin_num in", values, "adminNum");
            return (Criteria) this;
        }

        public Criteria andAdminNumNotIn(List<Integer> values) {
            addCriterion("admin_num not in", values, "adminNum");
            return (Criteria) this;
        }

        public Criteria andAdminNumBetween(Integer value1, Integer value2) {
            addCriterion("admin_num between", value1, value2, "adminNum");
            return (Criteria) this;
        }

        public Criteria andAdminNumNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_num not between", value1, value2, "adminNum");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordIsNull() {
            addCriterion("admin_password is null");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordIsNotNull() {
            addCriterion("admin_password is not null");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordEqualTo(String value) {
            addCriterion("admin_password =", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotEqualTo(String value) {
            addCriterion("admin_password <>", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordGreaterThan(String value) {
            addCriterion("admin_password >", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("admin_password >=", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordLessThan(String value) {
            addCriterion("admin_password <", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordLessThanOrEqualTo(String value) {
            addCriterion("admin_password <=", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordLike(String value) {
            addCriterion("admin_password like", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotLike(String value) {
            addCriterion("admin_password not like", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordIn(List<String> values) {
            addCriterion("admin_password in", values, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotIn(List<String> values) {
            addCriterion("admin_password not in", values, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordBetween(String value1, String value2) {
            addCriterion("admin_password between", value1, value2, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotBetween(String value1, String value2) {
            addCriterion("admin_password not between", value1, value2, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminNameIsNull() {
            addCriterion("admin_name is null");
            return (Criteria) this;
        }

        public Criteria andAdminNameIsNotNull() {
            addCriterion("admin_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdminNameEqualTo(String value) {
            addCriterion("admin_name =", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotEqualTo(String value) {
            addCriterion("admin_name <>", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThan(String value) {
            addCriterion("admin_name >", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThanOrEqualTo(String value) {
            addCriterion("admin_name >=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThan(String value) {
            addCriterion("admin_name <", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThanOrEqualTo(String value) {
            addCriterion("admin_name <=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLike(String value) {
            addCriterion("admin_name like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotLike(String value) {
            addCriterion("admin_name not like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameIn(List<String> values) {
            addCriterion("admin_name in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotIn(List<String> values) {
            addCriterion("admin_name not in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameBetween(String value1, String value2) {
            addCriterion("admin_name between", value1, value2, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotBetween(String value1, String value2) {
            addCriterion("admin_name not between", value1, value2, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminSexIsNull() {
            addCriterion("admin_sex is null");
            return (Criteria) this;
        }

        public Criteria andAdminSexIsNotNull() {
            addCriterion("admin_sex is not null");
            return (Criteria) this;
        }

        public Criteria andAdminSexEqualTo(String value) {
            addCriterion("admin_sex =", value, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexNotEqualTo(String value) {
            addCriterion("admin_sex <>", value, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexGreaterThan(String value) {
            addCriterion("admin_sex >", value, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexGreaterThanOrEqualTo(String value) {
            addCriterion("admin_sex >=", value, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexLessThan(String value) {
            addCriterion("admin_sex <", value, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexLessThanOrEqualTo(String value) {
            addCriterion("admin_sex <=", value, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexLike(String value) {
            addCriterion("admin_sex like", value, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexNotLike(String value) {
            addCriterion("admin_sex not like", value, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexIn(List<String> values) {
            addCriterion("admin_sex in", values, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexNotIn(List<String> values) {
            addCriterion("admin_sex not in", values, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexBetween(String value1, String value2) {
            addCriterion("admin_sex between", value1, value2, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexNotBetween(String value1, String value2) {
            addCriterion("admin_sex not between", value1, value2, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminBirthIsNull() {
            addCriterion("admin_birth is null");
            return (Criteria) this;
        }

        public Criteria andAdminBirthIsNotNull() {
            addCriterion("admin_birth is not null");
            return (Criteria) this;
        }

        public Criteria andAdminBirthEqualTo(Date value) {
            addCriterionForJDBCDate("admin_birth =", value, "adminBirth");
            return (Criteria) this;
        }

        public Criteria andAdminBirthNotEqualTo(Date value) {
            addCriterionForJDBCDate("admin_birth <>", value, "adminBirth");
            return (Criteria) this;
        }

        public Criteria andAdminBirthGreaterThan(Date value) {
            addCriterionForJDBCDate("admin_birth >", value, "adminBirth");
            return (Criteria) this;
        }

        public Criteria andAdminBirthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("admin_birth >=", value, "adminBirth");
            return (Criteria) this;
        }

        public Criteria andAdminBirthLessThan(Date value) {
            addCriterionForJDBCDate("admin_birth <", value, "adminBirth");
            return (Criteria) this;
        }

        public Criteria andAdminBirthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("admin_birth <=", value, "adminBirth");
            return (Criteria) this;
        }

        public Criteria andAdminBirthIn(List<Date> values) {
            addCriterionForJDBCDate("admin_birth in", values, "adminBirth");
            return (Criteria) this;
        }

        public Criteria andAdminBirthNotIn(List<Date> values) {
            addCriterionForJDBCDate("admin_birth not in", values, "adminBirth");
            return (Criteria) this;
        }

        public Criteria andAdminBirthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("admin_birth between", value1, value2, "adminBirth");
            return (Criteria) this;
        }

        public Criteria andAdminBirthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("admin_birth not between", value1, value2, "adminBirth");
            return (Criteria) this;
        }

        public Criteria andAdminEmailIsNull() {
            addCriterion("admin_email is null");
            return (Criteria) this;
        }

        public Criteria andAdminEmailIsNotNull() {
            addCriterion("admin_email is not null");
            return (Criteria) this;
        }

        public Criteria andAdminEmailEqualTo(String value) {
            addCriterion("admin_email =", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailNotEqualTo(String value) {
            addCriterion("admin_email <>", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailGreaterThan(String value) {
            addCriterion("admin_email >", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailGreaterThanOrEqualTo(String value) {
            addCriterion("admin_email >=", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailLessThan(String value) {
            addCriterion("admin_email <", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailLessThanOrEqualTo(String value) {
            addCriterion("admin_email <=", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailLike(String value) {
            addCriterion("admin_email like", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailNotLike(String value) {
            addCriterion("admin_email not like", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailIn(List<String> values) {
            addCriterion("admin_email in", values, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailNotIn(List<String> values) {
            addCriterion("admin_email not in", values, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailBetween(String value1, String value2) {
            addCriterion("admin_email between", value1, value2, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailNotBetween(String value1, String value2) {
            addCriterion("admin_email not between", value1, value2, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneIsNull() {
            addCriterion("admin_phone is null");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneIsNotNull() {
            addCriterion("admin_phone is not null");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneEqualTo(String value) {
            addCriterion("admin_phone =", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneNotEqualTo(String value) {
            addCriterion("admin_phone <>", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneGreaterThan(String value) {
            addCriterion("admin_phone >", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("admin_phone >=", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneLessThan(String value) {
            addCriterion("admin_phone <", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneLessThanOrEqualTo(String value) {
            addCriterion("admin_phone <=", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneLike(String value) {
            addCriterion("admin_phone like", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneNotLike(String value) {
            addCriterion("admin_phone not like", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneIn(List<String> values) {
            addCriterion("admin_phone in", values, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneNotIn(List<String> values) {
            addCriterion("admin_phone not in", values, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneBetween(String value1, String value2) {
            addCriterion("admin_phone between", value1, value2, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneNotBetween(String value1, String value2) {
            addCriterion("admin_phone not between", value1, value2, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminAddressIsNull() {
            addCriterion("admin_address is null");
            return (Criteria) this;
        }

        public Criteria andAdminAddressIsNotNull() {
            addCriterion("admin_address is not null");
            return (Criteria) this;
        }

        public Criteria andAdminAddressEqualTo(String value) {
            addCriterion("admin_address =", value, "adminAddress");
            return (Criteria) this;
        }

        public Criteria andAdminAddressNotEqualTo(String value) {
            addCriterion("admin_address <>", value, "adminAddress");
            return (Criteria) this;
        }

        public Criteria andAdminAddressGreaterThan(String value) {
            addCriterion("admin_address >", value, "adminAddress");
            return (Criteria) this;
        }

        public Criteria andAdminAddressGreaterThanOrEqualTo(String value) {
            addCriterion("admin_address >=", value, "adminAddress");
            return (Criteria) this;
        }

        public Criteria andAdminAddressLessThan(String value) {
            addCriterion("admin_address <", value, "adminAddress");
            return (Criteria) this;
        }

        public Criteria andAdminAddressLessThanOrEqualTo(String value) {
            addCriterion("admin_address <=", value, "adminAddress");
            return (Criteria) this;
        }

        public Criteria andAdminAddressLike(String value) {
            addCriterion("admin_address like", value, "adminAddress");
            return (Criteria) this;
        }

        public Criteria andAdminAddressNotLike(String value) {
            addCriterion("admin_address not like", value, "adminAddress");
            return (Criteria) this;
        }

        public Criteria andAdminAddressIn(List<String> values) {
            addCriterion("admin_address in", values, "adminAddress");
            return (Criteria) this;
        }

        public Criteria andAdminAddressNotIn(List<String> values) {
            addCriterion("admin_address not in", values, "adminAddress");
            return (Criteria) this;
        }

        public Criteria andAdminAddressBetween(String value1, String value2) {
            addCriterion("admin_address between", value1, value2, "adminAddress");
            return (Criteria) this;
        }

        public Criteria andAdminAddressNotBetween(String value1, String value2) {
            addCriterion("admin_address not between", value1, value2, "adminAddress");
            return (Criteria) this;
        }

        public Criteria andAdminIdnumIsNull() {
            addCriterion("admin_idnum is null");
            return (Criteria) this;
        }

        public Criteria andAdminIdnumIsNotNull() {
            addCriterion("admin_idnum is not null");
            return (Criteria) this;
        }

        public Criteria andAdminIdnumEqualTo(String value) {
            addCriterion("admin_idnum =", value, "adminIdnum");
            return (Criteria) this;
        }

        public Criteria andAdminIdnumNotEqualTo(String value) {
            addCriterion("admin_idnum <>", value, "adminIdnum");
            return (Criteria) this;
        }

        public Criteria andAdminIdnumGreaterThan(String value) {
            addCriterion("admin_idnum >", value, "adminIdnum");
            return (Criteria) this;
        }

        public Criteria andAdminIdnumGreaterThanOrEqualTo(String value) {
            addCriterion("admin_idnum >=", value, "adminIdnum");
            return (Criteria) this;
        }

        public Criteria andAdminIdnumLessThan(String value) {
            addCriterion("admin_idnum <", value, "adminIdnum");
            return (Criteria) this;
        }

        public Criteria andAdminIdnumLessThanOrEqualTo(String value) {
            addCriterion("admin_idnum <=", value, "adminIdnum");
            return (Criteria) this;
        }

        public Criteria andAdminIdnumLike(String value) {
            addCriterion("admin_idnum like", value, "adminIdnum");
            return (Criteria) this;
        }

        public Criteria andAdminIdnumNotLike(String value) {
            addCriterion("admin_idnum not like", value, "adminIdnum");
            return (Criteria) this;
        }

        public Criteria andAdminIdnumIn(List<String> values) {
            addCriterion("admin_idnum in", values, "adminIdnum");
            return (Criteria) this;
        }

        public Criteria andAdminIdnumNotIn(List<String> values) {
            addCriterion("admin_idnum not in", values, "adminIdnum");
            return (Criteria) this;
        }

        public Criteria andAdminIdnumBetween(String value1, String value2) {
            addCriterion("admin_idnum between", value1, value2, "adminIdnum");
            return (Criteria) this;
        }

        public Criteria andAdminIdnumNotBetween(String value1, String value2) {
            addCriterion("admin_idnum not between", value1, value2, "adminIdnum");
            return (Criteria) this;
        }

        public Criteria andAdminPicIsNull() {
            addCriterion("admin_pic is null");
            return (Criteria) this;
        }

        public Criteria andAdminPicIsNotNull() {
            addCriterion("admin_pic is not null");
            return (Criteria) this;
        }

        public Criteria andAdminPicEqualTo(String value) {
            addCriterion("admin_pic =", value, "adminPic");
            return (Criteria) this;
        }

        public Criteria andAdminPicNotEqualTo(String value) {
            addCriterion("admin_pic <>", value, "adminPic");
            return (Criteria) this;
        }

        public Criteria andAdminPicGreaterThan(String value) {
            addCriterion("admin_pic >", value, "adminPic");
            return (Criteria) this;
        }

        public Criteria andAdminPicGreaterThanOrEqualTo(String value) {
            addCriterion("admin_pic >=", value, "adminPic");
            return (Criteria) this;
        }

        public Criteria andAdminPicLessThan(String value) {
            addCriterion("admin_pic <", value, "adminPic");
            return (Criteria) this;
        }

        public Criteria andAdminPicLessThanOrEqualTo(String value) {
            addCriterion("admin_pic <=", value, "adminPic");
            return (Criteria) this;
        }

        public Criteria andAdminPicLike(String value) {
            addCriterion("admin_pic like", value, "adminPic");
            return (Criteria) this;
        }

        public Criteria andAdminPicNotLike(String value) {
            addCriterion("admin_pic not like", value, "adminPic");
            return (Criteria) this;
        }

        public Criteria andAdminPicIn(List<String> values) {
            addCriterion("admin_pic in", values, "adminPic");
            return (Criteria) this;
        }

        public Criteria andAdminPicNotIn(List<String> values) {
            addCriterion("admin_pic not in", values, "adminPic");
            return (Criteria) this;
        }

        public Criteria andAdminPicBetween(String value1, String value2) {
            addCriterion("admin_pic between", value1, value2, "adminPic");
            return (Criteria) this;
        }

        public Criteria andAdminPicNotBetween(String value1, String value2) {
            addCriterion("admin_pic not between", value1, value2, "adminPic");
            return (Criteria) this;
        }

        public Criteria andAdminAuthorityIsNull() {
            addCriterion("admin_authority is null");
            return (Criteria) this;
        }

        public Criteria andAdminAuthorityIsNotNull() {
            addCriterion("admin_authority is not null");
            return (Criteria) this;
        }

        public Criteria andAdminAuthorityEqualTo(Integer value) {
            addCriterion("admin_authority =", value, "adminAuthority");
            return (Criteria) this;
        }

        public Criteria andAdminAuthorityNotEqualTo(Integer value) {
            addCriterion("admin_authority <>", value, "adminAuthority");
            return (Criteria) this;
        }

        public Criteria andAdminAuthorityGreaterThan(Integer value) {
            addCriterion("admin_authority >", value, "adminAuthority");
            return (Criteria) this;
        }

        public Criteria andAdminAuthorityGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_authority >=", value, "adminAuthority");
            return (Criteria) this;
        }

        public Criteria andAdminAuthorityLessThan(Integer value) {
            addCriterion("admin_authority <", value, "adminAuthority");
            return (Criteria) this;
        }

        public Criteria andAdminAuthorityLessThanOrEqualTo(Integer value) {
            addCriterion("admin_authority <=", value, "adminAuthority");
            return (Criteria) this;
        }

        public Criteria andAdminAuthorityIn(List<Integer> values) {
            addCriterion("admin_authority in", values, "adminAuthority");
            return (Criteria) this;
        }

        public Criteria andAdminAuthorityNotIn(List<Integer> values) {
            addCriterion("admin_authority not in", values, "adminAuthority");
            return (Criteria) this;
        }

        public Criteria andAdminAuthorityBetween(Integer value1, Integer value2) {
            addCriterion("admin_authority between", value1, value2, "adminAuthority");
            return (Criteria) this;
        }

        public Criteria andAdminAuthorityNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_authority not between", value1, value2, "adminAuthority");
            return (Criteria) this;
        }

        public Criteria andAdminEntryIsNull() {
            addCriterion("admin_entry is null");
            return (Criteria) this;
        }

        public Criteria andAdminEntryIsNotNull() {
            addCriterion("admin_entry is not null");
            return (Criteria) this;
        }

        public Criteria andAdminEntryEqualTo(Date value) {
            addCriterionForJDBCDate("admin_entry =", value, "adminEntry");
            return (Criteria) this;
        }

        public Criteria andAdminEntryNotEqualTo(Date value) {
            addCriterionForJDBCDate("admin_entry <>", value, "adminEntry");
            return (Criteria) this;
        }

        public Criteria andAdminEntryGreaterThan(Date value) {
            addCriterionForJDBCDate("admin_entry >", value, "adminEntry");
            return (Criteria) this;
        }

        public Criteria andAdminEntryGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("admin_entry >=", value, "adminEntry");
            return (Criteria) this;
        }

        public Criteria andAdminEntryLessThan(Date value) {
            addCriterionForJDBCDate("admin_entry <", value, "adminEntry");
            return (Criteria) this;
        }

        public Criteria andAdminEntryLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("admin_entry <=", value, "adminEntry");
            return (Criteria) this;
        }

        public Criteria andAdminEntryIn(List<Date> values) {
            addCriterionForJDBCDate("admin_entry in", values, "adminEntry");
            return (Criteria) this;
        }

        public Criteria andAdminEntryNotIn(List<Date> values) {
            addCriterionForJDBCDate("admin_entry not in", values, "adminEntry");
            return (Criteria) this;
        }

        public Criteria andAdminEntryBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("admin_entry between", value1, value2, "adminEntry");
            return (Criteria) this;
        }

        public Criteria andAdminEntryNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("admin_entry not between", value1, value2, "adminEntry");
            return (Criteria) this;
        }

        public Criteria andIsResignIsNull() {
            addCriterion("is_resign is null");
            return (Criteria) this;
        }

        public Criteria andIsResignIsNotNull() {
            addCriterion("is_resign is not null");
            return (Criteria) this;
        }

        public Criteria andIsResignEqualTo(Boolean value) {
            addCriterion("is_resign =", value, "isResign");
            return (Criteria) this;
        }

        public Criteria andIsResignNotEqualTo(Boolean value) {
            addCriterion("is_resign <>", value, "isResign");
            return (Criteria) this;
        }

        public Criteria andIsResignGreaterThan(Boolean value) {
            addCriterion("is_resign >", value, "isResign");
            return (Criteria) this;
        }

        public Criteria andIsResignGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_resign >=", value, "isResign");
            return (Criteria) this;
        }

        public Criteria andIsResignLessThan(Boolean value) {
            addCriterion("is_resign <", value, "isResign");
            return (Criteria) this;
        }

        public Criteria andIsResignLessThanOrEqualTo(Boolean value) {
            addCriterion("is_resign <=", value, "isResign");
            return (Criteria) this;
        }

        public Criteria andIsResignIn(List<Boolean> values) {
            addCriterion("is_resign in", values, "isResign");
            return (Criteria) this;
        }

        public Criteria andIsResignNotIn(List<Boolean> values) {
            addCriterion("is_resign not in", values, "isResign");
            return (Criteria) this;
        }

        public Criteria andIsResignBetween(Boolean value1, Boolean value2) {
            addCriterion("is_resign between", value1, value2, "isResign");
            return (Criteria) this;
        }

        public Criteria andIsResignNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_resign not between", value1, value2, "isResign");
            return (Criteria) this;
        }

        public Criteria andAdminLeaveIsNull() {
            addCriterion("admin_leave is null");
            return (Criteria) this;
        }

        public Criteria andAdminLeaveIsNotNull() {
            addCriterion("admin_leave is not null");
            return (Criteria) this;
        }

        public Criteria andAdminLeaveEqualTo(Date value) {
            addCriterionForJDBCDate("admin_leave =", value, "adminLeave");
            return (Criteria) this;
        }

        public Criteria andAdminLeaveNotEqualTo(Date value) {
            addCriterionForJDBCDate("admin_leave <>", value, "adminLeave");
            return (Criteria) this;
        }

        public Criteria andAdminLeaveGreaterThan(Date value) {
            addCriterionForJDBCDate("admin_leave >", value, "adminLeave");
            return (Criteria) this;
        }

        public Criteria andAdminLeaveGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("admin_leave >=", value, "adminLeave");
            return (Criteria) this;
        }

        public Criteria andAdminLeaveLessThan(Date value) {
            addCriterionForJDBCDate("admin_leave <", value, "adminLeave");
            return (Criteria) this;
        }

        public Criteria andAdminLeaveLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("admin_leave <=", value, "adminLeave");
            return (Criteria) this;
        }

        public Criteria andAdminLeaveIn(List<Date> values) {
            addCriterionForJDBCDate("admin_leave in", values, "adminLeave");
            return (Criteria) this;
        }

        public Criteria andAdminLeaveNotIn(List<Date> values) {
            addCriterionForJDBCDate("admin_leave not in", values, "adminLeave");
            return (Criteria) this;
        }

        public Criteria andAdminLeaveBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("admin_leave between", value1, value2, "adminLeave");
            return (Criteria) this;
        }

        public Criteria andAdminLeaveNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("admin_leave not between", value1, value2, "adminLeave");
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