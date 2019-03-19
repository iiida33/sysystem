package com.lps.po;

import java.util.ArrayList;
import java.util.List;

public class GoodPicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodPicExample() {
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

        public Criteria andPicIdIsNull() {
            addCriterion("pic_id is null");
            return (Criteria) this;
        }

        public Criteria andPicIdIsNotNull() {
            addCriterion("pic_id is not null");
            return (Criteria) this;
        }

        public Criteria andPicIdEqualTo(Integer value) {
            addCriterion("pic_id =", value, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdNotEqualTo(Integer value) {
            addCriterion("pic_id <>", value, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdGreaterThan(Integer value) {
            addCriterion("pic_id >", value, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pic_id >=", value, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdLessThan(Integer value) {
            addCriterion("pic_id <", value, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdLessThanOrEqualTo(Integer value) {
            addCriterion("pic_id <=", value, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdIn(List<Integer> values) {
            addCriterion("pic_id in", values, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdNotIn(List<Integer> values) {
            addCriterion("pic_id not in", values, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdBetween(Integer value1, Integer value2) {
            addCriterion("pic_id between", value1, value2, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pic_id not between", value1, value2, "picId");
            return (Criteria) this;
        }

        public Criteria andPicNameIsNull() {
            addCriterion("pic_name is null");
            return (Criteria) this;
        }

        public Criteria andPicNameIsNotNull() {
            addCriterion("pic_name is not null");
            return (Criteria) this;
        }

        public Criteria andPicNameEqualTo(String value) {
            addCriterion("pic_name =", value, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameNotEqualTo(String value) {
            addCriterion("pic_name <>", value, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameGreaterThan(String value) {
            addCriterion("pic_name >", value, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameGreaterThanOrEqualTo(String value) {
            addCriterion("pic_name >=", value, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameLessThan(String value) {
            addCriterion("pic_name <", value, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameLessThanOrEqualTo(String value) {
            addCriterion("pic_name <=", value, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameLike(String value) {
            addCriterion("pic_name like", value, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameNotLike(String value) {
            addCriterion("pic_name not like", value, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameIn(List<String> values) {
            addCriterion("pic_name in", values, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameNotIn(List<String> values) {
            addCriterion("pic_name not in", values, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameBetween(String value1, String value2) {
            addCriterion("pic_name between", value1, value2, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameNotBetween(String value1, String value2) {
            addCriterion("pic_name not between", value1, value2, "picName");
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

        public Criteria andIsTurnIsNull() {
            addCriterion("is_turn is null");
            return (Criteria) this;
        }

        public Criteria andIsTurnIsNotNull() {
            addCriterion("is_turn is not null");
            return (Criteria) this;
        }

        public Criteria andIsTurnEqualTo(Boolean value) {
            addCriterion("is_turn =", value, "isTurn");
            return (Criteria) this;
        }

        public Criteria andIsTurnNotEqualTo(Boolean value) {
            addCriterion("is_turn <>", value, "isTurn");
            return (Criteria) this;
        }

        public Criteria andIsTurnGreaterThan(Boolean value) {
            addCriterion("is_turn >", value, "isTurn");
            return (Criteria) this;
        }

        public Criteria andIsTurnGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_turn >=", value, "isTurn");
            return (Criteria) this;
        }

        public Criteria andIsTurnLessThan(Boolean value) {
            addCriterion("is_turn <", value, "isTurn");
            return (Criteria) this;
        }

        public Criteria andIsTurnLessThanOrEqualTo(Boolean value) {
            addCriterion("is_turn <=", value, "isTurn");
            return (Criteria) this;
        }

        public Criteria andIsTurnIn(List<Boolean> values) {
            addCriterion("is_turn in", values, "isTurn");
            return (Criteria) this;
        }

        public Criteria andIsTurnNotIn(List<Boolean> values) {
            addCriterion("is_turn not in", values, "isTurn");
            return (Criteria) this;
        }

        public Criteria andIsTurnBetween(Boolean value1, Boolean value2) {
            addCriterion("is_turn between", value1, value2, "isTurn");
            return (Criteria) this;
        }

        public Criteria andIsTurnNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_turn not between", value1, value2, "isTurn");
            return (Criteria) this;
        }

        public Criteria andIsDetailIsNull() {
            addCriterion("is_detail is null");
            return (Criteria) this;
        }

        public Criteria andIsDetailIsNotNull() {
            addCriterion("is_detail is not null");
            return (Criteria) this;
        }

        public Criteria andIsDetailEqualTo(Boolean value) {
            addCriterion("is_detail =", value, "isDetail");
            return (Criteria) this;
        }

        public Criteria andIsDetailNotEqualTo(Boolean value) {
            addCriterion("is_detail <>", value, "isDetail");
            return (Criteria) this;
        }

        public Criteria andIsDetailGreaterThan(Boolean value) {
            addCriterion("is_detail >", value, "isDetail");
            return (Criteria) this;
        }

        public Criteria andIsDetailGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_detail >=", value, "isDetail");
            return (Criteria) this;
        }

        public Criteria andIsDetailLessThan(Boolean value) {
            addCriterion("is_detail <", value, "isDetail");
            return (Criteria) this;
        }

        public Criteria andIsDetailLessThanOrEqualTo(Boolean value) {
            addCriterion("is_detail <=", value, "isDetail");
            return (Criteria) this;
        }

        public Criteria andIsDetailIn(List<Boolean> values) {
            addCriterion("is_detail in", values, "isDetail");
            return (Criteria) this;
        }

        public Criteria andIsDetailNotIn(List<Boolean> values) {
            addCriterion("is_detail not in", values, "isDetail");
            return (Criteria) this;
        }

        public Criteria andIsDetailBetween(Boolean value1, Boolean value2) {
            addCriterion("is_detail between", value1, value2, "isDetail");
            return (Criteria) this;
        }

        public Criteria andIsDetailNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_detail not between", value1, value2, "isDetail");
            return (Criteria) this;
        }

        public Criteria andPicOrderIsNull() {
            addCriterion("pic_order is null");
            return (Criteria) this;
        }

        public Criteria andPicOrderIsNotNull() {
            addCriterion("pic_order is not null");
            return (Criteria) this;
        }

        public Criteria andPicOrderEqualTo(Integer value) {
            addCriterion("pic_order =", value, "picOrder");
            return (Criteria) this;
        }

        public Criteria andPicOrderNotEqualTo(Integer value) {
            addCriterion("pic_order <>", value, "picOrder");
            return (Criteria) this;
        }

        public Criteria andPicOrderGreaterThan(Integer value) {
            addCriterion("pic_order >", value, "picOrder");
            return (Criteria) this;
        }

        public Criteria andPicOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("pic_order >=", value, "picOrder");
            return (Criteria) this;
        }

        public Criteria andPicOrderLessThan(Integer value) {
            addCriterion("pic_order <", value, "picOrder");
            return (Criteria) this;
        }

        public Criteria andPicOrderLessThanOrEqualTo(Integer value) {
            addCriterion("pic_order <=", value, "picOrder");
            return (Criteria) this;
        }

        public Criteria andPicOrderIn(List<Integer> values) {
            addCriterion("pic_order in", values, "picOrder");
            return (Criteria) this;
        }

        public Criteria andPicOrderNotIn(List<Integer> values) {
            addCriterion("pic_order not in", values, "picOrder");
            return (Criteria) this;
        }

        public Criteria andPicOrderBetween(Integer value1, Integer value2) {
            addCriterion("pic_order between", value1, value2, "picOrder");
            return (Criteria) this;
        }

        public Criteria andPicOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("pic_order not between", value1, value2, "picOrder");
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