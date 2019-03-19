package com.lps.po;

import java.util.ArrayList;
import java.util.List;

public class GoodExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodExample() {
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

        public Criteria andGoodNameIsNull() {
            addCriterion("good_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodNameIsNotNull() {
            addCriterion("good_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodNameEqualTo(String value) {
            addCriterion("good_name =", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotEqualTo(String value) {
            addCriterion("good_name <>", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameGreaterThan(String value) {
            addCriterion("good_name >", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameGreaterThanOrEqualTo(String value) {
            addCriterion("good_name >=", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameLessThan(String value) {
            addCriterion("good_name <", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameLessThanOrEqualTo(String value) {
            addCriterion("good_name <=", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameLike(String value) {
            addCriterion("good_name like", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotLike(String value) {
            addCriterion("good_name not like", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameIn(List<String> values) {
            addCriterion("good_name in", values, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotIn(List<String> values) {
            addCriterion("good_name not in", values, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameBetween(String value1, String value2) {
            addCriterion("good_name between", value1, value2, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotBetween(String value1, String value2) {
            addCriterion("good_name not between", value1, value2, "goodName");
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

        public Criteria andGoodBrandIsNull() {
            addCriterion("good_brand is null");
            return (Criteria) this;
        }

        public Criteria andGoodBrandIsNotNull() {
            addCriterion("good_brand is not null");
            return (Criteria) this;
        }

        public Criteria andGoodBrandEqualTo(String value) {
            addCriterion("good_brand =", value, "goodBrand");
            return (Criteria) this;
        }

        public Criteria andGoodBrandNotEqualTo(String value) {
            addCriterion("good_brand <>", value, "goodBrand");
            return (Criteria) this;
        }

        public Criteria andGoodBrandGreaterThan(String value) {
            addCriterion("good_brand >", value, "goodBrand");
            return (Criteria) this;
        }

        public Criteria andGoodBrandGreaterThanOrEqualTo(String value) {
            addCriterion("good_brand >=", value, "goodBrand");
            return (Criteria) this;
        }

        public Criteria andGoodBrandLessThan(String value) {
            addCriterion("good_brand <", value, "goodBrand");
            return (Criteria) this;
        }

        public Criteria andGoodBrandLessThanOrEqualTo(String value) {
            addCriterion("good_brand <=", value, "goodBrand");
            return (Criteria) this;
        }

        public Criteria andGoodBrandLike(String value) {
            addCriterion("good_brand like", value, "goodBrand");
            return (Criteria) this;
        }

        public Criteria andGoodBrandNotLike(String value) {
            addCriterion("good_brand not like", value, "goodBrand");
            return (Criteria) this;
        }

        public Criteria andGoodBrandIn(List<String> values) {
            addCriterion("good_brand in", values, "goodBrand");
            return (Criteria) this;
        }

        public Criteria andGoodBrandNotIn(List<String> values) {
            addCriterion("good_brand not in", values, "goodBrand");
            return (Criteria) this;
        }

        public Criteria andGoodBrandBetween(String value1, String value2) {
            addCriterion("good_brand between", value1, value2, "goodBrand");
            return (Criteria) this;
        }

        public Criteria andGoodBrandNotBetween(String value1, String value2) {
            addCriterion("good_brand not between", value1, value2, "goodBrand");
            return (Criteria) this;
        }

        public Criteria andGoodDescribeIsNull() {
            addCriterion("good_describe is null");
            return (Criteria) this;
        }

        public Criteria andGoodDescribeIsNotNull() {
            addCriterion("good_describe is not null");
            return (Criteria) this;
        }

        public Criteria andGoodDescribeEqualTo(String value) {
            addCriterion("good_describe =", value, "goodDescribe");
            return (Criteria) this;
        }

        public Criteria andGoodDescribeNotEqualTo(String value) {
            addCriterion("good_describe <>", value, "goodDescribe");
            return (Criteria) this;
        }

        public Criteria andGoodDescribeGreaterThan(String value) {
            addCriterion("good_describe >", value, "goodDescribe");
            return (Criteria) this;
        }

        public Criteria andGoodDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("good_describe >=", value, "goodDescribe");
            return (Criteria) this;
        }

        public Criteria andGoodDescribeLessThan(String value) {
            addCriterion("good_describe <", value, "goodDescribe");
            return (Criteria) this;
        }

        public Criteria andGoodDescribeLessThanOrEqualTo(String value) {
            addCriterion("good_describe <=", value, "goodDescribe");
            return (Criteria) this;
        }

        public Criteria andGoodDescribeLike(String value) {
            addCriterion("good_describe like", value, "goodDescribe");
            return (Criteria) this;
        }

        public Criteria andGoodDescribeNotLike(String value) {
            addCriterion("good_describe not like", value, "goodDescribe");
            return (Criteria) this;
        }

        public Criteria andGoodDescribeIn(List<String> values) {
            addCriterion("good_describe in", values, "goodDescribe");
            return (Criteria) this;
        }

        public Criteria andGoodDescribeNotIn(List<String> values) {
            addCriterion("good_describe not in", values, "goodDescribe");
            return (Criteria) this;
        }

        public Criteria andGoodDescribeBetween(String value1, String value2) {
            addCriterion("good_describe between", value1, value2, "goodDescribe");
            return (Criteria) this;
        }

        public Criteria andGoodDescribeNotBetween(String value1, String value2) {
            addCriterion("good_describe not between", value1, value2, "goodDescribe");
            return (Criteria) this;
        }

        public Criteria andGoodPropsIsNull() {
            addCriterion("good_props is null");
            return (Criteria) this;
        }

        public Criteria andGoodPropsIsNotNull() {
            addCriterion("good_props is not null");
            return (Criteria) this;
        }

        public Criteria andGoodPropsEqualTo(String value) {
            addCriterion("good_props =", value, "goodProps");
            return (Criteria) this;
        }

        public Criteria andGoodPropsNotEqualTo(String value) {
            addCriterion("good_props <>", value, "goodProps");
            return (Criteria) this;
        }

        public Criteria andGoodPropsGreaterThan(String value) {
            addCriterion("good_props >", value, "goodProps");
            return (Criteria) this;
        }

        public Criteria andGoodPropsGreaterThanOrEqualTo(String value) {
            addCriterion("good_props >=", value, "goodProps");
            return (Criteria) this;
        }

        public Criteria andGoodPropsLessThan(String value) {
            addCriterion("good_props <", value, "goodProps");
            return (Criteria) this;
        }

        public Criteria andGoodPropsLessThanOrEqualTo(String value) {
            addCriterion("good_props <=", value, "goodProps");
            return (Criteria) this;
        }

        public Criteria andGoodPropsLike(String value) {
            addCriterion("good_props like", value, "goodProps");
            return (Criteria) this;
        }

        public Criteria andGoodPropsNotLike(String value) {
            addCriterion("good_props not like", value, "goodProps");
            return (Criteria) this;
        }

        public Criteria andGoodPropsIn(List<String> values) {
            addCriterion("good_props in", values, "goodProps");
            return (Criteria) this;
        }

        public Criteria andGoodPropsNotIn(List<String> values) {
            addCriterion("good_props not in", values, "goodProps");
            return (Criteria) this;
        }

        public Criteria andGoodPropsBetween(String value1, String value2) {
            addCriterion("good_props between", value1, value2, "goodProps");
            return (Criteria) this;
        }

        public Criteria andGoodPropsNotBetween(String value1, String value2) {
            addCriterion("good_props not between", value1, value2, "goodProps");
            return (Criteria) this;
        }

        public Criteria andGoodStateIsNull() {
            addCriterion("good_state is null");
            return (Criteria) this;
        }

        public Criteria andGoodStateIsNotNull() {
            addCriterion("good_state is not null");
            return (Criteria) this;
        }

        public Criteria andGoodStateEqualTo(Boolean value) {
            addCriterion("good_state =", value, "goodState");
            return (Criteria) this;
        }

        public Criteria andGoodStateNotEqualTo(Boolean value) {
            addCriterion("good_state <>", value, "goodState");
            return (Criteria) this;
        }

        public Criteria andGoodStateGreaterThan(Boolean value) {
            addCriterion("good_state >", value, "goodState");
            return (Criteria) this;
        }

        public Criteria andGoodStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("good_state >=", value, "goodState");
            return (Criteria) this;
        }

        public Criteria andGoodStateLessThan(Boolean value) {
            addCriterion("good_state <", value, "goodState");
            return (Criteria) this;
        }

        public Criteria andGoodStateLessThanOrEqualTo(Boolean value) {
            addCriterion("good_state <=", value, "goodState");
            return (Criteria) this;
        }

        public Criteria andGoodStateIn(List<Boolean> values) {
            addCriterion("good_state in", values, "goodState");
            return (Criteria) this;
        }

        public Criteria andGoodStateNotIn(List<Boolean> values) {
            addCriterion("good_state not in", values, "goodState");
            return (Criteria) this;
        }

        public Criteria andGoodStateBetween(Boolean value1, Boolean value2) {
            addCriterion("good_state between", value1, value2, "goodState");
            return (Criteria) this;
        }

        public Criteria andGoodStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("good_state not between", value1, value2, "goodState");
            return (Criteria) this;
        }

        public Criteria andGoodImageIsNull() {
            addCriterion("good_image is null");
            return (Criteria) this;
        }

        public Criteria andGoodImageIsNotNull() {
            addCriterion("good_image is not null");
            return (Criteria) this;
        }

        public Criteria andGoodImageEqualTo(String value) {
            addCriterion("good_image =", value, "goodImage");
            return (Criteria) this;
        }

        public Criteria andGoodImageNotEqualTo(String value) {
            addCriterion("good_image <>", value, "goodImage");
            return (Criteria) this;
        }

        public Criteria andGoodImageGreaterThan(String value) {
            addCriterion("good_image >", value, "goodImage");
            return (Criteria) this;
        }

        public Criteria andGoodImageGreaterThanOrEqualTo(String value) {
            addCriterion("good_image >=", value, "goodImage");
            return (Criteria) this;
        }

        public Criteria andGoodImageLessThan(String value) {
            addCriterion("good_image <", value, "goodImage");
            return (Criteria) this;
        }

        public Criteria andGoodImageLessThanOrEqualTo(String value) {
            addCriterion("good_image <=", value, "goodImage");
            return (Criteria) this;
        }

        public Criteria andGoodImageLike(String value) {
            addCriterion("good_image like", value, "goodImage");
            return (Criteria) this;
        }

        public Criteria andGoodImageNotLike(String value) {
            addCriterion("good_image not like", value, "goodImage");
            return (Criteria) this;
        }

        public Criteria andGoodImageIn(List<String> values) {
            addCriterion("good_image in", values, "goodImage");
            return (Criteria) this;
        }

        public Criteria andGoodImageNotIn(List<String> values) {
            addCriterion("good_image not in", values, "goodImage");
            return (Criteria) this;
        }

        public Criteria andGoodImageBetween(String value1, String value2) {
            addCriterion("good_image between", value1, value2, "goodImage");
            return (Criteria) this;
        }

        public Criteria andGoodImageNotBetween(String value1, String value2) {
            addCriterion("good_image not between", value1, value2, "goodImage");
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