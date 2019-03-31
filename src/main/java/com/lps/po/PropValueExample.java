package com.lps.po;

import java.util.ArrayList;
import java.util.List;

public class PropValueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PropValueExample() {
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

        public Criteria andPvIdIsNull() {
            addCriterion("pv_id is null");
            return (Criteria) this;
        }

        public Criteria andPvIdIsNotNull() {
            addCriterion("pv_id is not null");
            return (Criteria) this;
        }

        public Criteria andPvIdEqualTo(String value) {
            addCriterion("pv_id =", value, "pvId");
            return (Criteria) this;
        }

        public Criteria andPvIdNotEqualTo(String value) {
            addCriterion("pv_id <>", value, "pvId");
            return (Criteria) this;
        }

        public Criteria andPvIdGreaterThan(String value) {
            addCriterion("pv_id >", value, "pvId");
            return (Criteria) this;
        }

        public Criteria andPvIdGreaterThanOrEqualTo(String value) {
            addCriterion("pv_id >=", value, "pvId");
            return (Criteria) this;
        }

        public Criteria andPvIdLessThan(String value) {
            addCriterion("pv_id <", value, "pvId");
            return (Criteria) this;
        }

        public Criteria andPvIdLessThanOrEqualTo(String value) {
            addCriterion("pv_id <=", value, "pvId");
            return (Criteria) this;
        }

        public Criteria andPvIdLike(String value) {
            addCriterion("pv_id like", value, "pvId");
            return (Criteria) this;
        }

        public Criteria andPvIdNotLike(String value) {
            addCriterion("pv_id not like", value, "pvId");
            return (Criteria) this;
        }

        public Criteria andPvIdIn(List<String> values) {
            addCriterion("pv_id in", values, "pvId");
            return (Criteria) this;
        }

        public Criteria andPvIdNotIn(List<String> values) {
            addCriterion("pv_id not in", values, "pvId");
            return (Criteria) this;
        }

        public Criteria andPvIdBetween(String value1, String value2) {
            addCriterion("pv_id between", value1, value2, "pvId");
            return (Criteria) this;
        }

        public Criteria andPvIdNotBetween(String value1, String value2) {
            addCriterion("pv_id not between", value1, value2, "pvId");
            return (Criteria) this;
        }

        public Criteria andPvNameIsNull() {
            addCriterion("pv_name is null");
            return (Criteria) this;
        }

        public Criteria andPvNameIsNotNull() {
            addCriterion("pv_name is not null");
            return (Criteria) this;
        }

        public Criteria andPvNameEqualTo(String value) {
            addCriterion("pv_name =", value, "pvName");
            return (Criteria) this;
        }

        public Criteria andPvNameNotEqualTo(String value) {
            addCriterion("pv_name <>", value, "pvName");
            return (Criteria) this;
        }

        public Criteria andPvNameGreaterThan(String value) {
            addCriterion("pv_name >", value, "pvName");
            return (Criteria) this;
        }

        public Criteria andPvNameGreaterThanOrEqualTo(String value) {
            addCriterion("pv_name >=", value, "pvName");
            return (Criteria) this;
        }

        public Criteria andPvNameLessThan(String value) {
            addCriterion("pv_name <", value, "pvName");
            return (Criteria) this;
        }

        public Criteria andPvNameLessThanOrEqualTo(String value) {
            addCriterion("pv_name <=", value, "pvName");
            return (Criteria) this;
        }

        public Criteria andPvNameLike(String value) {
            addCriterion("pv_name like", value, "pvName");
            return (Criteria) this;
        }

        public Criteria andPvNameNotLike(String value) {
            addCriterion("pv_name not like", value, "pvName");
            return (Criteria) this;
        }

        public Criteria andPvNameIn(List<String> values) {
            addCriterion("pv_name in", values, "pvName");
            return (Criteria) this;
        }

        public Criteria andPvNameNotIn(List<String> values) {
            addCriterion("pv_name not in", values, "pvName");
            return (Criteria) this;
        }

        public Criteria andPvNameBetween(String value1, String value2) {
            addCriterion("pv_name between", value1, value2, "pvName");
            return (Criteria) this;
        }

        public Criteria andPvNameNotBetween(String value1, String value2) {
            addCriterion("pv_name not between", value1, value2, "pvName");
            return (Criteria) this;
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