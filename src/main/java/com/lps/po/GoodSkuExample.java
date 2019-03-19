package com.lps.po;

import java.util.ArrayList;
import java.util.List;

public class GoodSkuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodSkuExample() {
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

        public Criteria andSkuIdIsNull() {
            addCriterion("sku_id is null");
            return (Criteria) this;
        }

        public Criteria andSkuIdIsNotNull() {
            addCriterion("sku_id is not null");
            return (Criteria) this;
        }

        public Criteria andSkuIdEqualTo(Integer value) {
            addCriterion("sku_id =", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotEqualTo(Integer value) {
            addCriterion("sku_id <>", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThan(Integer value) {
            addCriterion("sku_id >", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sku_id >=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThan(Integer value) {
            addCriterion("sku_id <", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThanOrEqualTo(Integer value) {
            addCriterion("sku_id <=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdIn(List<Integer> values) {
            addCriterion("sku_id in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotIn(List<Integer> values) {
            addCriterion("sku_id not in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdBetween(Integer value1, Integer value2) {
            addCriterion("sku_id between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sku_id not between", value1, value2, "skuId");
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

        public Criteria andSkuNumIsNull() {
            addCriterion("sku_num is null");
            return (Criteria) this;
        }

        public Criteria andSkuNumIsNotNull() {
            addCriterion("sku_num is not null");
            return (Criteria) this;
        }

        public Criteria andSkuNumEqualTo(Integer value) {
            addCriterion("sku_num =", value, "skuNum");
            return (Criteria) this;
        }

        public Criteria andSkuNumNotEqualTo(Integer value) {
            addCriterion("sku_num <>", value, "skuNum");
            return (Criteria) this;
        }

        public Criteria andSkuNumGreaterThan(Integer value) {
            addCriterion("sku_num >", value, "skuNum");
            return (Criteria) this;
        }

        public Criteria andSkuNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("sku_num >=", value, "skuNum");
            return (Criteria) this;
        }

        public Criteria andSkuNumLessThan(Integer value) {
            addCriterion("sku_num <", value, "skuNum");
            return (Criteria) this;
        }

        public Criteria andSkuNumLessThanOrEqualTo(Integer value) {
            addCriterion("sku_num <=", value, "skuNum");
            return (Criteria) this;
        }

        public Criteria andSkuNumIn(List<Integer> values) {
            addCriterion("sku_num in", values, "skuNum");
            return (Criteria) this;
        }

        public Criteria andSkuNumNotIn(List<Integer> values) {
            addCriterion("sku_num not in", values, "skuNum");
            return (Criteria) this;
        }

        public Criteria andSkuNumBetween(Integer value1, Integer value2) {
            addCriterion("sku_num between", value1, value2, "skuNum");
            return (Criteria) this;
        }

        public Criteria andSkuNumNotBetween(Integer value1, Integer value2) {
            addCriterion("sku_num not between", value1, value2, "skuNum");
            return (Criteria) this;
        }

        public Criteria andSkuPriceIsNull() {
            addCriterion("sku_price is null");
            return (Criteria) this;
        }

        public Criteria andSkuPriceIsNotNull() {
            addCriterion("sku_price is not null");
            return (Criteria) this;
        }

        public Criteria andSkuPriceEqualTo(Double value) {
            addCriterion("sku_price =", value, "skuPrice");
            return (Criteria) this;
        }

        public Criteria andSkuPriceNotEqualTo(Double value) {
            addCriterion("sku_price <>", value, "skuPrice");
            return (Criteria) this;
        }

        public Criteria andSkuPriceGreaterThan(Double value) {
            addCriterion("sku_price >", value, "skuPrice");
            return (Criteria) this;
        }

        public Criteria andSkuPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("sku_price >=", value, "skuPrice");
            return (Criteria) this;
        }

        public Criteria andSkuPriceLessThan(Double value) {
            addCriterion("sku_price <", value, "skuPrice");
            return (Criteria) this;
        }

        public Criteria andSkuPriceLessThanOrEqualTo(Double value) {
            addCriterion("sku_price <=", value, "skuPrice");
            return (Criteria) this;
        }

        public Criteria andSkuPriceIn(List<Double> values) {
            addCriterion("sku_price in", values, "skuPrice");
            return (Criteria) this;
        }

        public Criteria andSkuPriceNotIn(List<Double> values) {
            addCriterion("sku_price not in", values, "skuPrice");
            return (Criteria) this;
        }

        public Criteria andSkuPriceBetween(Double value1, Double value2) {
            addCriterion("sku_price between", value1, value2, "skuPrice");
            return (Criteria) this;
        }

        public Criteria andSkuPriceNotBetween(Double value1, Double value2) {
            addCriterion("sku_price not between", value1, value2, "skuPrice");
            return (Criteria) this;
        }

        public Criteria andSkuStockIsNull() {
            addCriterion("sku_stock is null");
            return (Criteria) this;
        }

        public Criteria andSkuStockIsNotNull() {
            addCriterion("sku_stock is not null");
            return (Criteria) this;
        }

        public Criteria andSkuStockEqualTo(Integer value) {
            addCriterion("sku_stock =", value, "skuStock");
            return (Criteria) this;
        }

        public Criteria andSkuStockNotEqualTo(Integer value) {
            addCriterion("sku_stock <>", value, "skuStock");
            return (Criteria) this;
        }

        public Criteria andSkuStockGreaterThan(Integer value) {
            addCriterion("sku_stock >", value, "skuStock");
            return (Criteria) this;
        }

        public Criteria andSkuStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("sku_stock >=", value, "skuStock");
            return (Criteria) this;
        }

        public Criteria andSkuStockLessThan(Integer value) {
            addCriterion("sku_stock <", value, "skuStock");
            return (Criteria) this;
        }

        public Criteria andSkuStockLessThanOrEqualTo(Integer value) {
            addCriterion("sku_stock <=", value, "skuStock");
            return (Criteria) this;
        }

        public Criteria andSkuStockIn(List<Integer> values) {
            addCriterion("sku_stock in", values, "skuStock");
            return (Criteria) this;
        }

        public Criteria andSkuStockNotIn(List<Integer> values) {
            addCriterion("sku_stock not in", values, "skuStock");
            return (Criteria) this;
        }

        public Criteria andSkuStockBetween(Integer value1, Integer value2) {
            addCriterion("sku_stock between", value1, value2, "skuStock");
            return (Criteria) this;
        }

        public Criteria andSkuStockNotBetween(Integer value1, Integer value2) {
            addCriterion("sku_stock not between", value1, value2, "skuStock");
            return (Criteria) this;
        }

        public Criteria andSkuPropsIsNull() {
            addCriterion("sku_props is null");
            return (Criteria) this;
        }

        public Criteria andSkuPropsIsNotNull() {
            addCriterion("sku_props is not null");
            return (Criteria) this;
        }

        public Criteria andSkuPropsEqualTo(String value) {
            addCriterion("sku_props =", value, "skuProps");
            return (Criteria) this;
        }

        public Criteria andSkuPropsNotEqualTo(String value) {
            addCriterion("sku_props <>", value, "skuProps");
            return (Criteria) this;
        }

        public Criteria andSkuPropsGreaterThan(String value) {
            addCriterion("sku_props >", value, "skuProps");
            return (Criteria) this;
        }

        public Criteria andSkuPropsGreaterThanOrEqualTo(String value) {
            addCriterion("sku_props >=", value, "skuProps");
            return (Criteria) this;
        }

        public Criteria andSkuPropsLessThan(String value) {
            addCriterion("sku_props <", value, "skuProps");
            return (Criteria) this;
        }

        public Criteria andSkuPropsLessThanOrEqualTo(String value) {
            addCriterion("sku_props <=", value, "skuProps");
            return (Criteria) this;
        }

        public Criteria andSkuPropsLike(String value) {
            addCriterion("sku_props like", value, "skuProps");
            return (Criteria) this;
        }

        public Criteria andSkuPropsNotLike(String value) {
            addCriterion("sku_props not like", value, "skuProps");
            return (Criteria) this;
        }

        public Criteria andSkuPropsIn(List<String> values) {
            addCriterion("sku_props in", values, "skuProps");
            return (Criteria) this;
        }

        public Criteria andSkuPropsNotIn(List<String> values) {
            addCriterion("sku_props not in", values, "skuProps");
            return (Criteria) this;
        }

        public Criteria andSkuPropsBetween(String value1, String value2) {
            addCriterion("sku_props between", value1, value2, "skuProps");
            return (Criteria) this;
        }

        public Criteria andSkuPropsNotBetween(String value1, String value2) {
            addCriterion("sku_props not between", value1, value2, "skuProps");
            return (Criteria) this;
        }

        public Criteria andSkuPicIsNull() {
            addCriterion("sku_pic is null");
            return (Criteria) this;
        }

        public Criteria andSkuPicIsNotNull() {
            addCriterion("sku_pic is not null");
            return (Criteria) this;
        }

        public Criteria andSkuPicEqualTo(String value) {
            addCriterion("sku_pic =", value, "skuPic");
            return (Criteria) this;
        }

        public Criteria andSkuPicNotEqualTo(String value) {
            addCriterion("sku_pic <>", value, "skuPic");
            return (Criteria) this;
        }

        public Criteria andSkuPicGreaterThan(String value) {
            addCriterion("sku_pic >", value, "skuPic");
            return (Criteria) this;
        }

        public Criteria andSkuPicGreaterThanOrEqualTo(String value) {
            addCriterion("sku_pic >=", value, "skuPic");
            return (Criteria) this;
        }

        public Criteria andSkuPicLessThan(String value) {
            addCriterion("sku_pic <", value, "skuPic");
            return (Criteria) this;
        }

        public Criteria andSkuPicLessThanOrEqualTo(String value) {
            addCriterion("sku_pic <=", value, "skuPic");
            return (Criteria) this;
        }

        public Criteria andSkuPicLike(String value) {
            addCriterion("sku_pic like", value, "skuPic");
            return (Criteria) this;
        }

        public Criteria andSkuPicNotLike(String value) {
            addCriterion("sku_pic not like", value, "skuPic");
            return (Criteria) this;
        }

        public Criteria andSkuPicIn(List<String> values) {
            addCriterion("sku_pic in", values, "skuPic");
            return (Criteria) this;
        }

        public Criteria andSkuPicNotIn(List<String> values) {
            addCriterion("sku_pic not in", values, "skuPic");
            return (Criteria) this;
        }

        public Criteria andSkuPicBetween(String value1, String value2) {
            addCriterion("sku_pic between", value1, value2, "skuPic");
            return (Criteria) this;
        }

        public Criteria andSkuPicNotBetween(String value1, String value2) {
            addCriterion("sku_pic not between", value1, value2, "skuPic");
            return (Criteria) this;
        }

        public Criteria andSkuStateIsNull() {
            addCriterion("sku_state is null");
            return (Criteria) this;
        }

        public Criteria andSkuStateIsNotNull() {
            addCriterion("sku_state is not null");
            return (Criteria) this;
        }

        public Criteria andSkuStateEqualTo(Boolean value) {
            addCriterion("sku_state =", value, "skuState");
            return (Criteria) this;
        }

        public Criteria andSkuStateNotEqualTo(Boolean value) {
            addCriterion("sku_state <>", value, "skuState");
            return (Criteria) this;
        }

        public Criteria andSkuStateGreaterThan(Boolean value) {
            addCriterion("sku_state >", value, "skuState");
            return (Criteria) this;
        }

        public Criteria andSkuStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("sku_state >=", value, "skuState");
            return (Criteria) this;
        }

        public Criteria andSkuStateLessThan(Boolean value) {
            addCriterion("sku_state <", value, "skuState");
            return (Criteria) this;
        }

        public Criteria andSkuStateLessThanOrEqualTo(Boolean value) {
            addCriterion("sku_state <=", value, "skuState");
            return (Criteria) this;
        }

        public Criteria andSkuStateIn(List<Boolean> values) {
            addCriterion("sku_state in", values, "skuState");
            return (Criteria) this;
        }

        public Criteria andSkuStateNotIn(List<Boolean> values) {
            addCriterion("sku_state not in", values, "skuState");
            return (Criteria) this;
        }

        public Criteria andSkuStateBetween(Boolean value1, Boolean value2) {
            addCriterion("sku_state between", value1, value2, "skuState");
            return (Criteria) this;
        }

        public Criteria andSkuStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("sku_state not between", value1, value2, "skuState");
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