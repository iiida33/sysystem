package com.lps.po;

import java.util.ArrayList;
import java.util.List;

public class PropNameExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PropNameExample() {
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

        public Criteria andPnIdIsNull() {
            addCriterion("pn_id is null");
            return (Criteria) this;
        }

        public Criteria andPnIdIsNotNull() {
            addCriterion("pn_id is not null");
            return (Criteria) this;
        }

        public Criteria andPnIdEqualTo(Integer value) {
            addCriterion("pn_id =", value, "pnId");
            return (Criteria) this;
        }

        public Criteria andPnIdNotEqualTo(Integer value) {
            addCriterion("pn_id <>", value, "pnId");
            return (Criteria) this;
        }

        public Criteria andPnIdGreaterThan(Integer value) {
            addCriterion("pn_id >", value, "pnId");
            return (Criteria) this;
        }

        public Criteria andPnIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pn_id >=", value, "pnId");
            return (Criteria) this;
        }

        public Criteria andPnIdLessThan(Integer value) {
            addCriterion("pn_id <", value, "pnId");
            return (Criteria) this;
        }

        public Criteria andPnIdLessThanOrEqualTo(Integer value) {
            addCriterion("pn_id <=", value, "pnId");
            return (Criteria) this;
        }

        public Criteria andPnIdIn(List<Integer> values) {
            addCriterion("pn_id in", values, "pnId");
            return (Criteria) this;
        }

        public Criteria andPnIdNotIn(List<Integer> values) {
            addCriterion("pn_id not in", values, "pnId");
            return (Criteria) this;
        }

        public Criteria andPnIdBetween(Integer value1, Integer value2) {
            addCriterion("pn_id between", value1, value2, "pnId");
            return (Criteria) this;
        }

        public Criteria andPnIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pn_id not between", value1, value2, "pnId");
            return (Criteria) this;
        }

        public Criteria andPnNameIsNull() {
            addCriterion("pn_name is null");
            return (Criteria) this;
        }

        public Criteria andPnNameIsNotNull() {
            addCriterion("pn_name is not null");
            return (Criteria) this;
        }

        public Criteria andPnNameEqualTo(String value) {
            addCriterion("pn_name =", value, "pnName");
            return (Criteria) this;
        }

        public Criteria andPnNameNotEqualTo(String value) {
            addCriterion("pn_name <>", value, "pnName");
            return (Criteria) this;
        }

        public Criteria andPnNameGreaterThan(String value) {
            addCriterion("pn_name >", value, "pnName");
            return (Criteria) this;
        }

        public Criteria andPnNameGreaterThanOrEqualTo(String value) {
            addCriterion("pn_name >=", value, "pnName");
            return (Criteria) this;
        }

        public Criteria andPnNameLessThan(String value) {
            addCriterion("pn_name <", value, "pnName");
            return (Criteria) this;
        }

        public Criteria andPnNameLessThanOrEqualTo(String value) {
            addCriterion("pn_name <=", value, "pnName");
            return (Criteria) this;
        }

        public Criteria andPnNameLike(String value) {
            addCriterion("pn_name like", value, "pnName");
            return (Criteria) this;
        }

        public Criteria andPnNameNotLike(String value) {
            addCriterion("pn_name not like", value, "pnName");
            return (Criteria) this;
        }

        public Criteria andPnNameIn(List<String> values) {
            addCriterion("pn_name in", values, "pnName");
            return (Criteria) this;
        }

        public Criteria andPnNameNotIn(List<String> values) {
            addCriterion("pn_name not in", values, "pnName");
            return (Criteria) this;
        }

        public Criteria andPnNameBetween(String value1, String value2) {
            addCriterion("pn_name between", value1, value2, "pnName");
            return (Criteria) this;
        }

        public Criteria andPnNameNotBetween(String value1, String value2) {
            addCriterion("pn_name not between", value1, value2, "pnName");
            return (Criteria) this;
        }

        public Criteria andCatIdIsNull() {
            addCriterion("cat_id is null");
            return (Criteria) this;
        }

        public Criteria andCatIdIsNotNull() {
            addCriterion("cat_id is not null");
            return (Criteria) this;
        }

        public Criteria andCatIdEqualTo(Integer value) {
            addCriterion("cat_id =", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdNotEqualTo(Integer value) {
            addCriterion("cat_id <>", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdGreaterThan(Integer value) {
            addCriterion("cat_id >", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cat_id >=", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdLessThan(Integer value) {
            addCriterion("cat_id <", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdLessThanOrEqualTo(Integer value) {
            addCriterion("cat_id <=", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdIn(List<Integer> values) {
            addCriterion("cat_id in", values, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdNotIn(List<Integer> values) {
            addCriterion("cat_id not in", values, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdBetween(Integer value1, Integer value2) {
            addCriterion("cat_id between", value1, value2, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cat_id not between", value1, value2, "catId");
            return (Criteria) this;
        }

        public Criteria andIsMustIsNull() {
            addCriterion("is_must is null");
            return (Criteria) this;
        }

        public Criteria andIsMustIsNotNull() {
            addCriterion("is_must is not null");
            return (Criteria) this;
        }

        public Criteria andIsMustEqualTo(Boolean value) {
            addCriterion("is_must =", value, "isMust");
            return (Criteria) this;
        }

        public Criteria andIsMustNotEqualTo(Boolean value) {
            addCriterion("is_must <>", value, "isMust");
            return (Criteria) this;
        }

        public Criteria andIsMustGreaterThan(Boolean value) {
            addCriterion("is_must >", value, "isMust");
            return (Criteria) this;
        }

        public Criteria andIsMustGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_must >=", value, "isMust");
            return (Criteria) this;
        }

        public Criteria andIsMustLessThan(Boolean value) {
            addCriterion("is_must <", value, "isMust");
            return (Criteria) this;
        }

        public Criteria andIsMustLessThanOrEqualTo(Boolean value) {
            addCriterion("is_must <=", value, "isMust");
            return (Criteria) this;
        }

        public Criteria andIsMustIn(List<Boolean> values) {
            addCriterion("is_must in", values, "isMust");
            return (Criteria) this;
        }

        public Criteria andIsMustNotIn(List<Boolean> values) {
            addCriterion("is_must not in", values, "isMust");
            return (Criteria) this;
        }

        public Criteria andIsMustBetween(Boolean value1, Boolean value2) {
            addCriterion("is_must between", value1, value2, "isMust");
            return (Criteria) this;
        }

        public Criteria andIsMustNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_must not between", value1, value2, "isMust");
            return (Criteria) this;
        }

        public Criteria andIsSelectIsNull() {
            addCriterion("is_select is null");
            return (Criteria) this;
        }

        public Criteria andIsSelectIsNotNull() {
            addCriterion("is_select is not null");
            return (Criteria) this;
        }

        public Criteria andIsSelectEqualTo(Boolean value) {
            addCriterion("is_select =", value, "isSelect");
            return (Criteria) this;
        }

        public Criteria andIsSelectNotEqualTo(Boolean value) {
            addCriterion("is_select <>", value, "isSelect");
            return (Criteria) this;
        }

        public Criteria andIsSelectGreaterThan(Boolean value) {
            addCriterion("is_select >", value, "isSelect");
            return (Criteria) this;
        }

        public Criteria andIsSelectGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_select >=", value, "isSelect");
            return (Criteria) this;
        }

        public Criteria andIsSelectLessThan(Boolean value) {
            addCriterion("is_select <", value, "isSelect");
            return (Criteria) this;
        }

        public Criteria andIsSelectLessThanOrEqualTo(Boolean value) {
            addCriterion("is_select <=", value, "isSelect");
            return (Criteria) this;
        }

        public Criteria andIsSelectIn(List<Boolean> values) {
            addCriterion("is_select in", values, "isSelect");
            return (Criteria) this;
        }

        public Criteria andIsSelectNotIn(List<Boolean> values) {
            addCriterion("is_select not in", values, "isSelect");
            return (Criteria) this;
        }

        public Criteria andIsSelectBetween(Boolean value1, Boolean value2) {
            addCriterion("is_select between", value1, value2, "isSelect");
            return (Criteria) this;
        }

        public Criteria andIsSelectNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_select not between", value1, value2, "isSelect");
            return (Criteria) this;
        }

        public Criteria andIsSaleIsNull() {
            addCriterion("is_sale is null");
            return (Criteria) this;
        }

        public Criteria andIsSaleIsNotNull() {
            addCriterion("is_sale is not null");
            return (Criteria) this;
        }

        public Criteria andIsSaleEqualTo(Boolean value) {
            addCriterion("is_sale =", value, "isSale");
            return (Criteria) this;
        }

        public Criteria andIsSaleNotEqualTo(Boolean value) {
            addCriterion("is_sale <>", value, "isSale");
            return (Criteria) this;
        }

        public Criteria andIsSaleGreaterThan(Boolean value) {
            addCriterion("is_sale >", value, "isSale");
            return (Criteria) this;
        }

        public Criteria andIsSaleGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_sale >=", value, "isSale");
            return (Criteria) this;
        }

        public Criteria andIsSaleLessThan(Boolean value) {
            addCriterion("is_sale <", value, "isSale");
            return (Criteria) this;
        }

        public Criteria andIsSaleLessThanOrEqualTo(Boolean value) {
            addCriterion("is_sale <=", value, "isSale");
            return (Criteria) this;
        }

        public Criteria andIsSaleIn(List<Boolean> values) {
            addCriterion("is_sale in", values, "isSale");
            return (Criteria) this;
        }

        public Criteria andIsSaleNotIn(List<Boolean> values) {
            addCriterion("is_sale not in", values, "isSale");
            return (Criteria) this;
        }

        public Criteria andIsSaleBetween(Boolean value1, Boolean value2) {
            addCriterion("is_sale between", value1, value2, "isSale");
            return (Criteria) this;
        }

        public Criteria andIsSaleNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_sale not between", value1, value2, "isSale");
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