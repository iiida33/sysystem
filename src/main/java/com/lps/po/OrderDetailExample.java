package com.lps.po;

import java.util.ArrayList;
import java.util.List;

public class OrderDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderDetailExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
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

        public Criteria andOrderdtlNameIsNull() {
            addCriterion("orderDtl_name is null");
            return (Criteria) this;
        }

        public Criteria andOrderdtlNameIsNotNull() {
            addCriterion("orderDtl_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdtlNameEqualTo(String value) {
            addCriterion("orderDtl_name =", value, "orderdtlName");
            return (Criteria) this;
        }

        public Criteria andOrderdtlNameNotEqualTo(String value) {
            addCriterion("orderDtl_name <>", value, "orderdtlName");
            return (Criteria) this;
        }

        public Criteria andOrderdtlNameGreaterThan(String value) {
            addCriterion("orderDtl_name >", value, "orderdtlName");
            return (Criteria) this;
        }

        public Criteria andOrderdtlNameGreaterThanOrEqualTo(String value) {
            addCriterion("orderDtl_name >=", value, "orderdtlName");
            return (Criteria) this;
        }

        public Criteria andOrderdtlNameLessThan(String value) {
            addCriterion("orderDtl_name <", value, "orderdtlName");
            return (Criteria) this;
        }

        public Criteria andOrderdtlNameLessThanOrEqualTo(String value) {
            addCriterion("orderDtl_name <=", value, "orderdtlName");
            return (Criteria) this;
        }

        public Criteria andOrderdtlNameLike(String value) {
            addCriterion("orderDtl_name like", value, "orderdtlName");
            return (Criteria) this;
        }

        public Criteria andOrderdtlNameNotLike(String value) {
            addCriterion("orderDtl_name not like", value, "orderdtlName");
            return (Criteria) this;
        }

        public Criteria andOrderdtlNameIn(List<String> values) {
            addCriterion("orderDtl_name in", values, "orderdtlName");
            return (Criteria) this;
        }

        public Criteria andOrderdtlNameNotIn(List<String> values) {
            addCriterion("orderDtl_name not in", values, "orderdtlName");
            return (Criteria) this;
        }

        public Criteria andOrderdtlNameBetween(String value1, String value2) {
            addCriterion("orderDtl_name between", value1, value2, "orderdtlName");
            return (Criteria) this;
        }

        public Criteria andOrderdtlNameNotBetween(String value1, String value2) {
            addCriterion("orderDtl_name not between", value1, value2, "orderdtlName");
            return (Criteria) this;
        }

        public Criteria andOrderdtlPropsIsNull() {
            addCriterion("orderDtl_props is null");
            return (Criteria) this;
        }

        public Criteria andOrderdtlPropsIsNotNull() {
            addCriterion("orderDtl_props is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdtlPropsEqualTo(String value) {
            addCriterion("orderDtl_props =", value, "orderdtlProps");
            return (Criteria) this;
        }

        public Criteria andOrderdtlPropsNotEqualTo(String value) {
            addCriterion("orderDtl_props <>", value, "orderdtlProps");
            return (Criteria) this;
        }

        public Criteria andOrderdtlPropsGreaterThan(String value) {
            addCriterion("orderDtl_props >", value, "orderdtlProps");
            return (Criteria) this;
        }

        public Criteria andOrderdtlPropsGreaterThanOrEqualTo(String value) {
            addCriterion("orderDtl_props >=", value, "orderdtlProps");
            return (Criteria) this;
        }

        public Criteria andOrderdtlPropsLessThan(String value) {
            addCriterion("orderDtl_props <", value, "orderdtlProps");
            return (Criteria) this;
        }

        public Criteria andOrderdtlPropsLessThanOrEqualTo(String value) {
            addCriterion("orderDtl_props <=", value, "orderdtlProps");
            return (Criteria) this;
        }

        public Criteria andOrderdtlPropsLike(String value) {
            addCriterion("orderDtl_props like", value, "orderdtlProps");
            return (Criteria) this;
        }

        public Criteria andOrderdtlPropsNotLike(String value) {
            addCriterion("orderDtl_props not like", value, "orderdtlProps");
            return (Criteria) this;
        }

        public Criteria andOrderdtlPropsIn(List<String> values) {
            addCriterion("orderDtl_props in", values, "orderdtlProps");
            return (Criteria) this;
        }

        public Criteria andOrderdtlPropsNotIn(List<String> values) {
            addCriterion("orderDtl_props not in", values, "orderdtlProps");
            return (Criteria) this;
        }

        public Criteria andOrderdtlPropsBetween(String value1, String value2) {
            addCriterion("orderDtl_props between", value1, value2, "orderdtlProps");
            return (Criteria) this;
        }

        public Criteria andOrderdtlPropsNotBetween(String value1, String value2) {
            addCriterion("orderDtl_props not between", value1, value2, "orderdtlProps");
            return (Criteria) this;
        }

        public Criteria andOrderdtlCountIsNull() {
            addCriterion("orderDtl_count is null");
            return (Criteria) this;
        }

        public Criteria andOrderdtlCountIsNotNull() {
            addCriterion("orderDtl_count is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdtlCountEqualTo(Integer value) {
            addCriterion("orderDtl_count =", value, "orderdtlCount");
            return (Criteria) this;
        }

        public Criteria andOrderdtlCountNotEqualTo(Integer value) {
            addCriterion("orderDtl_count <>", value, "orderdtlCount");
            return (Criteria) this;
        }

        public Criteria andOrderdtlCountGreaterThan(Integer value) {
            addCriterion("orderDtl_count >", value, "orderdtlCount");
            return (Criteria) this;
        }

        public Criteria andOrderdtlCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderDtl_count >=", value, "orderdtlCount");
            return (Criteria) this;
        }

        public Criteria andOrderdtlCountLessThan(Integer value) {
            addCriterion("orderDtl_count <", value, "orderdtlCount");
            return (Criteria) this;
        }

        public Criteria andOrderdtlCountLessThanOrEqualTo(Integer value) {
            addCriterion("orderDtl_count <=", value, "orderdtlCount");
            return (Criteria) this;
        }

        public Criteria andOrderdtlCountIn(List<Integer> values) {
            addCriterion("orderDtl_count in", values, "orderdtlCount");
            return (Criteria) this;
        }

        public Criteria andOrderdtlCountNotIn(List<Integer> values) {
            addCriterion("orderDtl_count not in", values, "orderdtlCount");
            return (Criteria) this;
        }

        public Criteria andOrderdtlCountBetween(Integer value1, Integer value2) {
            addCriterion("orderDtl_count between", value1, value2, "orderdtlCount");
            return (Criteria) this;
        }

        public Criteria andOrderdtlCountNotBetween(Integer value1, Integer value2) {
            addCriterion("orderDtl_count not between", value1, value2, "orderdtlCount");
            return (Criteria) this;
        }

        public Criteria andOrderdtlPriceIsNull() {
            addCriterion("orderDtl_price is null");
            return (Criteria) this;
        }

        public Criteria andOrderdtlPriceIsNotNull() {
            addCriterion("orderDtl_price is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdtlPriceEqualTo(Double value) {
            addCriterion("orderDtl_price =", value, "orderdtlPrice");
            return (Criteria) this;
        }

        public Criteria andOrderdtlPriceNotEqualTo(Double value) {
            addCriterion("orderDtl_price <>", value, "orderdtlPrice");
            return (Criteria) this;
        }

        public Criteria andOrderdtlPriceGreaterThan(Double value) {
            addCriterion("orderDtl_price >", value, "orderdtlPrice");
            return (Criteria) this;
        }

        public Criteria andOrderdtlPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("orderDtl_price >=", value, "orderdtlPrice");
            return (Criteria) this;
        }

        public Criteria andOrderdtlPriceLessThan(Double value) {
            addCriterion("orderDtl_price <", value, "orderdtlPrice");
            return (Criteria) this;
        }

        public Criteria andOrderdtlPriceLessThanOrEqualTo(Double value) {
            addCriterion("orderDtl_price <=", value, "orderdtlPrice");
            return (Criteria) this;
        }

        public Criteria andOrderdtlPriceIn(List<Double> values) {
            addCriterion("orderDtl_price in", values, "orderdtlPrice");
            return (Criteria) this;
        }

        public Criteria andOrderdtlPriceNotIn(List<Double> values) {
            addCriterion("orderDtl_price not in", values, "orderdtlPrice");
            return (Criteria) this;
        }

        public Criteria andOrderdtlPriceBetween(Double value1, Double value2) {
            addCriterion("orderDtl_price between", value1, value2, "orderdtlPrice");
            return (Criteria) this;
        }

        public Criteria andOrderdtlPriceNotBetween(Double value1, Double value2) {
            addCriterion("orderDtl_price not between", value1, value2, "orderdtlPrice");
            return (Criteria) this;
        }

        public Criteria andOrderdtlMoneyIsNull() {
            addCriterion("orderDtl_money is null");
            return (Criteria) this;
        }

        public Criteria andOrderdtlMoneyIsNotNull() {
            addCriterion("orderDtl_money is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdtlMoneyEqualTo(Double value) {
            addCriterion("orderDtl_money =", value, "orderdtlMoney");
            return (Criteria) this;
        }

        public Criteria andOrderdtlMoneyNotEqualTo(Double value) {
            addCriterion("orderDtl_money <>", value, "orderdtlMoney");
            return (Criteria) this;
        }

        public Criteria andOrderdtlMoneyGreaterThan(Double value) {
            addCriterion("orderDtl_money >", value, "orderdtlMoney");
            return (Criteria) this;
        }

        public Criteria andOrderdtlMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("orderDtl_money >=", value, "orderdtlMoney");
            return (Criteria) this;
        }

        public Criteria andOrderdtlMoneyLessThan(Double value) {
            addCriterion("orderDtl_money <", value, "orderdtlMoney");
            return (Criteria) this;
        }

        public Criteria andOrderdtlMoneyLessThanOrEqualTo(Double value) {
            addCriterion("orderDtl_money <=", value, "orderdtlMoney");
            return (Criteria) this;
        }

        public Criteria andOrderdtlMoneyIn(List<Double> values) {
            addCriterion("orderDtl_money in", values, "orderdtlMoney");
            return (Criteria) this;
        }

        public Criteria andOrderdtlMoneyNotIn(List<Double> values) {
            addCriterion("orderDtl_money not in", values, "orderdtlMoney");
            return (Criteria) this;
        }

        public Criteria andOrderdtlMoneyBetween(Double value1, Double value2) {
            addCriterion("orderDtl_money between", value1, value2, "orderdtlMoney");
            return (Criteria) this;
        }

        public Criteria andOrderdtlMoneyNotBetween(Double value1, Double value2) {
            addCriterion("orderDtl_money not between", value1, value2, "orderdtlMoney");
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