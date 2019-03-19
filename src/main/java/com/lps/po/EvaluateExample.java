package com.lps.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EvaluateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EvaluateExample() {
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

        public Criteria andEvaluateIdIsNull() {
            addCriterion("evaluate_id is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdIsNotNull() {
            addCriterion("evaluate_id is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdEqualTo(Integer value) {
            addCriterion("evaluate_id =", value, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdNotEqualTo(Integer value) {
            addCriterion("evaluate_id <>", value, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdGreaterThan(Integer value) {
            addCriterion("evaluate_id >", value, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("evaluate_id >=", value, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdLessThan(Integer value) {
            addCriterion("evaluate_id <", value, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdLessThanOrEqualTo(Integer value) {
            addCriterion("evaluate_id <=", value, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdIn(List<Integer> values) {
            addCriterion("evaluate_id in", values, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdNotIn(List<Integer> values) {
            addCriterion("evaluate_id not in", values, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdBetween(Integer value1, Integer value2) {
            addCriterion("evaluate_id between", value1, value2, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("evaluate_id not between", value1, value2, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andOrderdtlIdIsNull() {
            addCriterion("orderDtl_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderdtlIdIsNotNull() {
            addCriterion("orderDtl_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdtlIdEqualTo(Integer value) {
            addCriterion("orderDtl_id =", value, "orderdtlId");
            return (Criteria) this;
        }

        public Criteria andOrderdtlIdNotEqualTo(Integer value) {
            addCriterion("orderDtl_id <>", value, "orderdtlId");
            return (Criteria) this;
        }

        public Criteria andOrderdtlIdGreaterThan(Integer value) {
            addCriterion("orderDtl_id >", value, "orderdtlId");
            return (Criteria) this;
        }

        public Criteria andOrderdtlIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderDtl_id >=", value, "orderdtlId");
            return (Criteria) this;
        }

        public Criteria andOrderdtlIdLessThan(Integer value) {
            addCriterion("orderDtl_id <", value, "orderdtlId");
            return (Criteria) this;
        }

        public Criteria andOrderdtlIdLessThanOrEqualTo(Integer value) {
            addCriterion("orderDtl_id <=", value, "orderdtlId");
            return (Criteria) this;
        }

        public Criteria andOrderdtlIdIn(List<Integer> values) {
            addCriterion("orderDtl_id in", values, "orderdtlId");
            return (Criteria) this;
        }

        public Criteria andOrderdtlIdNotIn(List<Integer> values) {
            addCriterion("orderDtl_id not in", values, "orderdtlId");
            return (Criteria) this;
        }

        public Criteria andOrderdtlIdBetween(Integer value1, Integer value2) {
            addCriterion("orderDtl_id between", value1, value2, "orderdtlId");
            return (Criteria) this;
        }

        public Criteria andOrderdtlIdNotBetween(Integer value1, Integer value2) {
            addCriterion("orderDtl_id not between", value1, value2, "orderdtlId");
            return (Criteria) this;
        }

        public Criteria andGoodIdIsNull() {
            addCriterion("good_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodIdIsNotNull() {
            addCriterion("good_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodIdEqualTo(Integer value) {
            addCriterion("good_id =", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdNotEqualTo(Integer value) {
            addCriterion("good_id <>", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdGreaterThan(Integer value) {
            addCriterion("good_id >", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("good_id >=", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdLessThan(Integer value) {
            addCriterion("good_id <", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdLessThanOrEqualTo(Integer value) {
            addCriterion("good_id <=", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdIn(List<Integer> values) {
            addCriterion("good_id in", values, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdNotIn(List<Integer> values) {
            addCriterion("good_id not in", values, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdBetween(Integer value1, Integer value2) {
            addCriterion("good_id between", value1, value2, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdNotBetween(Integer value1, Integer value2) {
            addCriterion("good_id not between", value1, value2, "goodId");
            return (Criteria) this;
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

        public Criteria andEvaluateTextIsNull() {
            addCriterion("evaluate_text is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateTextIsNotNull() {
            addCriterion("evaluate_text is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateTextEqualTo(String value) {
            addCriterion("evaluate_text =", value, "evaluateText");
            return (Criteria) this;
        }

        public Criteria andEvaluateTextNotEqualTo(String value) {
            addCriterion("evaluate_text <>", value, "evaluateText");
            return (Criteria) this;
        }

        public Criteria andEvaluateTextGreaterThan(String value) {
            addCriterion("evaluate_text >", value, "evaluateText");
            return (Criteria) this;
        }

        public Criteria andEvaluateTextGreaterThanOrEqualTo(String value) {
            addCriterion("evaluate_text >=", value, "evaluateText");
            return (Criteria) this;
        }

        public Criteria andEvaluateTextLessThan(String value) {
            addCriterion("evaluate_text <", value, "evaluateText");
            return (Criteria) this;
        }

        public Criteria andEvaluateTextLessThanOrEqualTo(String value) {
            addCriterion("evaluate_text <=", value, "evaluateText");
            return (Criteria) this;
        }

        public Criteria andEvaluateTextLike(String value) {
            addCriterion("evaluate_text like", value, "evaluateText");
            return (Criteria) this;
        }

        public Criteria andEvaluateTextNotLike(String value) {
            addCriterion("evaluate_text not like", value, "evaluateText");
            return (Criteria) this;
        }

        public Criteria andEvaluateTextIn(List<String> values) {
            addCriterion("evaluate_text in", values, "evaluateText");
            return (Criteria) this;
        }

        public Criteria andEvaluateTextNotIn(List<String> values) {
            addCriterion("evaluate_text not in", values, "evaluateText");
            return (Criteria) this;
        }

        public Criteria andEvaluateTextBetween(String value1, String value2) {
            addCriterion("evaluate_text between", value1, value2, "evaluateText");
            return (Criteria) this;
        }

        public Criteria andEvaluateTextNotBetween(String value1, String value2) {
            addCriterion("evaluate_text not between", value1, value2, "evaluateText");
            return (Criteria) this;
        }

        public Criteria andEvaluateDateIsNull() {
            addCriterion("evaluate_date is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateDateIsNotNull() {
            addCriterion("evaluate_date is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateDateEqualTo(Date value) {
            addCriterionForJDBCDate("evaluate_date =", value, "evaluateDate");
            return (Criteria) this;
        }

        public Criteria andEvaluateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("evaluate_date <>", value, "evaluateDate");
            return (Criteria) this;
        }

        public Criteria andEvaluateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("evaluate_date >", value, "evaluateDate");
            return (Criteria) this;
        }

        public Criteria andEvaluateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("evaluate_date >=", value, "evaluateDate");
            return (Criteria) this;
        }

        public Criteria andEvaluateDateLessThan(Date value) {
            addCriterionForJDBCDate("evaluate_date <", value, "evaluateDate");
            return (Criteria) this;
        }

        public Criteria andEvaluateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("evaluate_date <=", value, "evaluateDate");
            return (Criteria) this;
        }

        public Criteria andEvaluateDateIn(List<Date> values) {
            addCriterionForJDBCDate("evaluate_date in", values, "evaluateDate");
            return (Criteria) this;
        }

        public Criteria andEvaluateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("evaluate_date not in", values, "evaluateDate");
            return (Criteria) this;
        }

        public Criteria andEvaluateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("evaluate_date between", value1, value2, "evaluateDate");
            return (Criteria) this;
        }

        public Criteria andEvaluateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("evaluate_date not between", value1, value2, "evaluateDate");
            return (Criteria) this;
        }

        public Criteria andEvaluateStateIsNull() {
            addCriterion("evaluate_state is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateStateIsNotNull() {
            addCriterion("evaluate_state is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateStateEqualTo(Boolean value) {
            addCriterion("evaluate_state =", value, "evaluateState");
            return (Criteria) this;
        }

        public Criteria andEvaluateStateNotEqualTo(Boolean value) {
            addCriterion("evaluate_state <>", value, "evaluateState");
            return (Criteria) this;
        }

        public Criteria andEvaluateStateGreaterThan(Boolean value) {
            addCriterion("evaluate_state >", value, "evaluateState");
            return (Criteria) this;
        }

        public Criteria andEvaluateStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("evaluate_state >=", value, "evaluateState");
            return (Criteria) this;
        }

        public Criteria andEvaluateStateLessThan(Boolean value) {
            addCriterion("evaluate_state <", value, "evaluateState");
            return (Criteria) this;
        }

        public Criteria andEvaluateStateLessThanOrEqualTo(Boolean value) {
            addCriterion("evaluate_state <=", value, "evaluateState");
            return (Criteria) this;
        }

        public Criteria andEvaluateStateIn(List<Boolean> values) {
            addCriterion("evaluate_state in", values, "evaluateState");
            return (Criteria) this;
        }

        public Criteria andEvaluateStateNotIn(List<Boolean> values) {
            addCriterion("evaluate_state not in", values, "evaluateState");
            return (Criteria) this;
        }

        public Criteria andEvaluateStateBetween(Boolean value1, Boolean value2) {
            addCriterion("evaluate_state between", value1, value2, "evaluateState");
            return (Criteria) this;
        }

        public Criteria andEvaluateStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("evaluate_state not between", value1, value2, "evaluateState");
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