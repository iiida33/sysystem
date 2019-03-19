package com.lps.po;

import java.util.ArrayList;
import java.util.List;

public class DeliveryInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeliveryInfoExample() {
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

        public Criteria andDelIdIsNull() {
            addCriterion("del_id is null");
            return (Criteria) this;
        }

        public Criteria andDelIdIsNotNull() {
            addCriterion("del_id is not null");
            return (Criteria) this;
        }

        public Criteria andDelIdEqualTo(Integer value) {
            addCriterion("del_id =", value, "delId");
            return (Criteria) this;
        }

        public Criteria andDelIdNotEqualTo(Integer value) {
            addCriterion("del_id <>", value, "delId");
            return (Criteria) this;
        }

        public Criteria andDelIdGreaterThan(Integer value) {
            addCriterion("del_id >", value, "delId");
            return (Criteria) this;
        }

        public Criteria andDelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("del_id >=", value, "delId");
            return (Criteria) this;
        }

        public Criteria andDelIdLessThan(Integer value) {
            addCriterion("del_id <", value, "delId");
            return (Criteria) this;
        }

        public Criteria andDelIdLessThanOrEqualTo(Integer value) {
            addCriterion("del_id <=", value, "delId");
            return (Criteria) this;
        }

        public Criteria andDelIdIn(List<Integer> values) {
            addCriterion("del_id in", values, "delId");
            return (Criteria) this;
        }

        public Criteria andDelIdNotIn(List<Integer> values) {
            addCriterion("del_id not in", values, "delId");
            return (Criteria) this;
        }

        public Criteria andDelIdBetween(Integer value1, Integer value2) {
            addCriterion("del_id between", value1, value2, "delId");
            return (Criteria) this;
        }

        public Criteria andDelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("del_id not between", value1, value2, "delId");
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

        public Criteria andDelReceiverIsNull() {
            addCriterion("del_receiver is null");
            return (Criteria) this;
        }

        public Criteria andDelReceiverIsNotNull() {
            addCriterion("del_receiver is not null");
            return (Criteria) this;
        }

        public Criteria andDelReceiverEqualTo(String value) {
            addCriterion("del_receiver =", value, "delReceiver");
            return (Criteria) this;
        }

        public Criteria andDelReceiverNotEqualTo(String value) {
            addCriterion("del_receiver <>", value, "delReceiver");
            return (Criteria) this;
        }

        public Criteria andDelReceiverGreaterThan(String value) {
            addCriterion("del_receiver >", value, "delReceiver");
            return (Criteria) this;
        }

        public Criteria andDelReceiverGreaterThanOrEqualTo(String value) {
            addCriterion("del_receiver >=", value, "delReceiver");
            return (Criteria) this;
        }

        public Criteria andDelReceiverLessThan(String value) {
            addCriterion("del_receiver <", value, "delReceiver");
            return (Criteria) this;
        }

        public Criteria andDelReceiverLessThanOrEqualTo(String value) {
            addCriterion("del_receiver <=", value, "delReceiver");
            return (Criteria) this;
        }

        public Criteria andDelReceiverLike(String value) {
            addCriterion("del_receiver like", value, "delReceiver");
            return (Criteria) this;
        }

        public Criteria andDelReceiverNotLike(String value) {
            addCriterion("del_receiver not like", value, "delReceiver");
            return (Criteria) this;
        }

        public Criteria andDelReceiverIn(List<String> values) {
            addCriterion("del_receiver in", values, "delReceiver");
            return (Criteria) this;
        }

        public Criteria andDelReceiverNotIn(List<String> values) {
            addCriterion("del_receiver not in", values, "delReceiver");
            return (Criteria) this;
        }

        public Criteria andDelReceiverBetween(String value1, String value2) {
            addCriterion("del_receiver between", value1, value2, "delReceiver");
            return (Criteria) this;
        }

        public Criteria andDelReceiverNotBetween(String value1, String value2) {
            addCriterion("del_receiver not between", value1, value2, "delReceiver");
            return (Criteria) this;
        }

        public Criteria andDelAreaIsNull() {
            addCriterion("del_area is null");
            return (Criteria) this;
        }

        public Criteria andDelAreaIsNotNull() {
            addCriterion("del_area is not null");
            return (Criteria) this;
        }

        public Criteria andDelAreaEqualTo(String value) {
            addCriterion("del_area =", value, "delArea");
            return (Criteria) this;
        }

        public Criteria andDelAreaNotEqualTo(String value) {
            addCriterion("del_area <>", value, "delArea");
            return (Criteria) this;
        }

        public Criteria andDelAreaGreaterThan(String value) {
            addCriterion("del_area >", value, "delArea");
            return (Criteria) this;
        }

        public Criteria andDelAreaGreaterThanOrEqualTo(String value) {
            addCriterion("del_area >=", value, "delArea");
            return (Criteria) this;
        }

        public Criteria andDelAreaLessThan(String value) {
            addCriterion("del_area <", value, "delArea");
            return (Criteria) this;
        }

        public Criteria andDelAreaLessThanOrEqualTo(String value) {
            addCriterion("del_area <=", value, "delArea");
            return (Criteria) this;
        }

        public Criteria andDelAreaLike(String value) {
            addCriterion("del_area like", value, "delArea");
            return (Criteria) this;
        }

        public Criteria andDelAreaNotLike(String value) {
            addCriterion("del_area not like", value, "delArea");
            return (Criteria) this;
        }

        public Criteria andDelAreaIn(List<String> values) {
            addCriterion("del_area in", values, "delArea");
            return (Criteria) this;
        }

        public Criteria andDelAreaNotIn(List<String> values) {
            addCriterion("del_area not in", values, "delArea");
            return (Criteria) this;
        }

        public Criteria andDelAreaBetween(String value1, String value2) {
            addCriterion("del_area between", value1, value2, "delArea");
            return (Criteria) this;
        }

        public Criteria andDelAreaNotBetween(String value1, String value2) {
            addCriterion("del_area not between", value1, value2, "delArea");
            return (Criteria) this;
        }

        public Criteria andDelAddressIsNull() {
            addCriterion("del_address is null");
            return (Criteria) this;
        }

        public Criteria andDelAddressIsNotNull() {
            addCriterion("del_address is not null");
            return (Criteria) this;
        }

        public Criteria andDelAddressEqualTo(String value) {
            addCriterion("del_address =", value, "delAddress");
            return (Criteria) this;
        }

        public Criteria andDelAddressNotEqualTo(String value) {
            addCriterion("del_address <>", value, "delAddress");
            return (Criteria) this;
        }

        public Criteria andDelAddressGreaterThan(String value) {
            addCriterion("del_address >", value, "delAddress");
            return (Criteria) this;
        }

        public Criteria andDelAddressGreaterThanOrEqualTo(String value) {
            addCriterion("del_address >=", value, "delAddress");
            return (Criteria) this;
        }

        public Criteria andDelAddressLessThan(String value) {
            addCriterion("del_address <", value, "delAddress");
            return (Criteria) this;
        }

        public Criteria andDelAddressLessThanOrEqualTo(String value) {
            addCriterion("del_address <=", value, "delAddress");
            return (Criteria) this;
        }

        public Criteria andDelAddressLike(String value) {
            addCriterion("del_address like", value, "delAddress");
            return (Criteria) this;
        }

        public Criteria andDelAddressNotLike(String value) {
            addCriterion("del_address not like", value, "delAddress");
            return (Criteria) this;
        }

        public Criteria andDelAddressIn(List<String> values) {
            addCriterion("del_address in", values, "delAddress");
            return (Criteria) this;
        }

        public Criteria andDelAddressNotIn(List<String> values) {
            addCriterion("del_address not in", values, "delAddress");
            return (Criteria) this;
        }

        public Criteria andDelAddressBetween(String value1, String value2) {
            addCriterion("del_address between", value1, value2, "delAddress");
            return (Criteria) this;
        }

        public Criteria andDelAddressNotBetween(String value1, String value2) {
            addCriterion("del_address not between", value1, value2, "delAddress");
            return (Criteria) this;
        }

        public Criteria andDelPhoneIsNull() {
            addCriterion("del_phone is null");
            return (Criteria) this;
        }

        public Criteria andDelPhoneIsNotNull() {
            addCriterion("del_phone is not null");
            return (Criteria) this;
        }

        public Criteria andDelPhoneEqualTo(String value) {
            addCriterion("del_phone =", value, "delPhone");
            return (Criteria) this;
        }

        public Criteria andDelPhoneNotEqualTo(String value) {
            addCriterion("del_phone <>", value, "delPhone");
            return (Criteria) this;
        }

        public Criteria andDelPhoneGreaterThan(String value) {
            addCriterion("del_phone >", value, "delPhone");
            return (Criteria) this;
        }

        public Criteria andDelPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("del_phone >=", value, "delPhone");
            return (Criteria) this;
        }

        public Criteria andDelPhoneLessThan(String value) {
            addCriterion("del_phone <", value, "delPhone");
            return (Criteria) this;
        }

        public Criteria andDelPhoneLessThanOrEqualTo(String value) {
            addCriterion("del_phone <=", value, "delPhone");
            return (Criteria) this;
        }

        public Criteria andDelPhoneLike(String value) {
            addCriterion("del_phone like", value, "delPhone");
            return (Criteria) this;
        }

        public Criteria andDelPhoneNotLike(String value) {
            addCriterion("del_phone not like", value, "delPhone");
            return (Criteria) this;
        }

        public Criteria andDelPhoneIn(List<String> values) {
            addCriterion("del_phone in", values, "delPhone");
            return (Criteria) this;
        }

        public Criteria andDelPhoneNotIn(List<String> values) {
            addCriterion("del_phone not in", values, "delPhone");
            return (Criteria) this;
        }

        public Criteria andDelPhoneBetween(String value1, String value2) {
            addCriterion("del_phone between", value1, value2, "delPhone");
            return (Criteria) this;
        }

        public Criteria andDelPhoneNotBetween(String value1, String value2) {
            addCriterion("del_phone not between", value1, value2, "delPhone");
            return (Criteria) this;
        }

        public Criteria andDelPcIsNull() {
            addCriterion("del_pc is null");
            return (Criteria) this;
        }

        public Criteria andDelPcIsNotNull() {
            addCriterion("del_pc is not null");
            return (Criteria) this;
        }

        public Criteria andDelPcEqualTo(String value) {
            addCriterion("del_pc =", value, "delPc");
            return (Criteria) this;
        }

        public Criteria andDelPcNotEqualTo(String value) {
            addCriterion("del_pc <>", value, "delPc");
            return (Criteria) this;
        }

        public Criteria andDelPcGreaterThan(String value) {
            addCriterion("del_pc >", value, "delPc");
            return (Criteria) this;
        }

        public Criteria andDelPcGreaterThanOrEqualTo(String value) {
            addCriterion("del_pc >=", value, "delPc");
            return (Criteria) this;
        }

        public Criteria andDelPcLessThan(String value) {
            addCriterion("del_pc <", value, "delPc");
            return (Criteria) this;
        }

        public Criteria andDelPcLessThanOrEqualTo(String value) {
            addCriterion("del_pc <=", value, "delPc");
            return (Criteria) this;
        }

        public Criteria andDelPcLike(String value) {
            addCriterion("del_pc like", value, "delPc");
            return (Criteria) this;
        }

        public Criteria andDelPcNotLike(String value) {
            addCriterion("del_pc not like", value, "delPc");
            return (Criteria) this;
        }

        public Criteria andDelPcIn(List<String> values) {
            addCriterion("del_pc in", values, "delPc");
            return (Criteria) this;
        }

        public Criteria andDelPcNotIn(List<String> values) {
            addCriterion("del_pc not in", values, "delPc");
            return (Criteria) this;
        }

        public Criteria andDelPcBetween(String value1, String value2) {
            addCriterion("del_pc between", value1, value2, "delPc");
            return (Criteria) this;
        }

        public Criteria andDelPcNotBetween(String value1, String value2) {
            addCriterion("del_pc not between", value1, value2, "delPc");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIsNull() {
            addCriterion("is_default is null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIsNotNull() {
            addCriterion("is_default is not null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultEqualTo(Boolean value) {
            addCriterion("is_default =", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotEqualTo(Boolean value) {
            addCriterion("is_default <>", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultGreaterThan(Boolean value) {
            addCriterion("is_default >", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_default >=", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLessThan(Boolean value) {
            addCriterion("is_default <", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLessThanOrEqualTo(Boolean value) {
            addCriterion("is_default <=", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIn(List<Boolean> values) {
            addCriterion("is_default in", values, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotIn(List<Boolean> values) {
            addCriterion("is_default not in", values, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultBetween(Boolean value1, Boolean value2) {
            addCriterion("is_default between", value1, value2, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_default not between", value1, value2, "isDefault");
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