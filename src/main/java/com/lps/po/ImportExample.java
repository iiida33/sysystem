package com.lps.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ImportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ImportExample() {
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

        public Criteria andImportIdIsNull() {
            addCriterion("import_id is null");
            return (Criteria) this;
        }

        public Criteria andImportIdIsNotNull() {
            addCriterion("import_id is not null");
            return (Criteria) this;
        }

        public Criteria andImportIdEqualTo(Integer value) {
            addCriterion("import_id =", value, "importId");
            return (Criteria) this;
        }

        public Criteria andImportIdNotEqualTo(Integer value) {
            addCriterion("import_id <>", value, "importId");
            return (Criteria) this;
        }

        public Criteria andImportIdGreaterThan(Integer value) {
            addCriterion("import_id >", value, "importId");
            return (Criteria) this;
        }

        public Criteria andImportIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("import_id >=", value, "importId");
            return (Criteria) this;
        }

        public Criteria andImportIdLessThan(Integer value) {
            addCriterion("import_id <", value, "importId");
            return (Criteria) this;
        }

        public Criteria andImportIdLessThanOrEqualTo(Integer value) {
            addCriterion("import_id <=", value, "importId");
            return (Criteria) this;
        }

        public Criteria andImportIdIn(List<Integer> values) {
            addCriterion("import_id in", values, "importId");
            return (Criteria) this;
        }

        public Criteria andImportIdNotIn(List<Integer> values) {
            addCriterion("import_id not in", values, "importId");
            return (Criteria) this;
        }

        public Criteria andImportIdBetween(Integer value1, Integer value2) {
            addCriterion("import_id between", value1, value2, "importId");
            return (Criteria) this;
        }

        public Criteria andImportIdNotBetween(Integer value1, Integer value2) {
            addCriterion("import_id not between", value1, value2, "importId");
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

        public Criteria andImportCostIsNull() {
            addCriterion("import_cost is null");
            return (Criteria) this;
        }

        public Criteria andImportCostIsNotNull() {
            addCriterion("import_cost is not null");
            return (Criteria) this;
        }

        public Criteria andImportCostEqualTo(Double value) {
            addCriterion("import_cost =", value, "importCost");
            return (Criteria) this;
        }

        public Criteria andImportCostNotEqualTo(Double value) {
            addCriterion("import_cost <>", value, "importCost");
            return (Criteria) this;
        }

        public Criteria andImportCostGreaterThan(Double value) {
            addCriterion("import_cost >", value, "importCost");
            return (Criteria) this;
        }

        public Criteria andImportCostGreaterThanOrEqualTo(Double value) {
            addCriterion("import_cost >=", value, "importCost");
            return (Criteria) this;
        }

        public Criteria andImportCostLessThan(Double value) {
            addCriterion("import_cost <", value, "importCost");
            return (Criteria) this;
        }

        public Criteria andImportCostLessThanOrEqualTo(Double value) {
            addCriterion("import_cost <=", value, "importCost");
            return (Criteria) this;
        }

        public Criteria andImportCostIn(List<Double> values) {
            addCriterion("import_cost in", values, "importCost");
            return (Criteria) this;
        }

        public Criteria andImportCostNotIn(List<Double> values) {
            addCriterion("import_cost not in", values, "importCost");
            return (Criteria) this;
        }

        public Criteria andImportCostBetween(Double value1, Double value2) {
            addCriterion("import_cost between", value1, value2, "importCost");
            return (Criteria) this;
        }

        public Criteria andImportCostNotBetween(Double value1, Double value2) {
            addCriterion("import_cost not between", value1, value2, "importCost");
            return (Criteria) this;
        }

        public Criteria andImportCountIsNull() {
            addCriterion("import_count is null");
            return (Criteria) this;
        }

        public Criteria andImportCountIsNotNull() {
            addCriterion("import_count is not null");
            return (Criteria) this;
        }

        public Criteria andImportCountEqualTo(Integer value) {
            addCriterion("import_count =", value, "importCount");
            return (Criteria) this;
        }

        public Criteria andImportCountNotEqualTo(Integer value) {
            addCriterion("import_count <>", value, "importCount");
            return (Criteria) this;
        }

        public Criteria andImportCountGreaterThan(Integer value) {
            addCriterion("import_count >", value, "importCount");
            return (Criteria) this;
        }

        public Criteria andImportCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("import_count >=", value, "importCount");
            return (Criteria) this;
        }

        public Criteria andImportCountLessThan(Integer value) {
            addCriterion("import_count <", value, "importCount");
            return (Criteria) this;
        }

        public Criteria andImportCountLessThanOrEqualTo(Integer value) {
            addCriterion("import_count <=", value, "importCount");
            return (Criteria) this;
        }

        public Criteria andImportCountIn(List<Integer> values) {
            addCriterion("import_count in", values, "importCount");
            return (Criteria) this;
        }

        public Criteria andImportCountNotIn(List<Integer> values) {
            addCriterion("import_count not in", values, "importCount");
            return (Criteria) this;
        }

        public Criteria andImportCountBetween(Integer value1, Integer value2) {
            addCriterion("import_count between", value1, value2, "importCount");
            return (Criteria) this;
        }

        public Criteria andImportCountNotBetween(Integer value1, Integer value2) {
            addCriterion("import_count not between", value1, value2, "importCount");
            return (Criteria) this;
        }

        public Criteria andImportBusIsNull() {
            addCriterion("import_bus is null");
            return (Criteria) this;
        }

        public Criteria andImportBusIsNotNull() {
            addCriterion("import_bus is not null");
            return (Criteria) this;
        }

        public Criteria andImportBusEqualTo(String value) {
            addCriterion("import_bus =", value, "importBus");
            return (Criteria) this;
        }

        public Criteria andImportBusNotEqualTo(String value) {
            addCriterion("import_bus <>", value, "importBus");
            return (Criteria) this;
        }

        public Criteria andImportBusGreaterThan(String value) {
            addCriterion("import_bus >", value, "importBus");
            return (Criteria) this;
        }

        public Criteria andImportBusGreaterThanOrEqualTo(String value) {
            addCriterion("import_bus >=", value, "importBus");
            return (Criteria) this;
        }

        public Criteria andImportBusLessThan(String value) {
            addCriterion("import_bus <", value, "importBus");
            return (Criteria) this;
        }

        public Criteria andImportBusLessThanOrEqualTo(String value) {
            addCriterion("import_bus <=", value, "importBus");
            return (Criteria) this;
        }

        public Criteria andImportBusLike(String value) {
            addCriterion("import_bus like", value, "importBus");
            return (Criteria) this;
        }

        public Criteria andImportBusNotLike(String value) {
            addCriterion("import_bus not like", value, "importBus");
            return (Criteria) this;
        }

        public Criteria andImportBusIn(List<String> values) {
            addCriterion("import_bus in", values, "importBus");
            return (Criteria) this;
        }

        public Criteria andImportBusNotIn(List<String> values) {
            addCriterion("import_bus not in", values, "importBus");
            return (Criteria) this;
        }

        public Criteria andImportBusBetween(String value1, String value2) {
            addCriterion("import_bus between", value1, value2, "importBus");
            return (Criteria) this;
        }

        public Criteria andImportBusNotBetween(String value1, String value2) {
            addCriterion("import_bus not between", value1, value2, "importBus");
            return (Criteria) this;
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

        public Criteria andImportDateIsNull() {
            addCriterion("import_date is null");
            return (Criteria) this;
        }

        public Criteria andImportDateIsNotNull() {
            addCriterion("import_date is not null");
            return (Criteria) this;
        }

        public Criteria andImportDateEqualTo(Date value) {
            addCriterionForJDBCDate("import_date =", value, "importDate");
            return (Criteria) this;
        }

        public Criteria andImportDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("import_date <>", value, "importDate");
            return (Criteria) this;
        }

        public Criteria andImportDateGreaterThan(Date value) {
            addCriterionForJDBCDate("import_date >", value, "importDate");
            return (Criteria) this;
        }

        public Criteria andImportDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("import_date >=", value, "importDate");
            return (Criteria) this;
        }

        public Criteria andImportDateLessThan(Date value) {
            addCriterionForJDBCDate("import_date <", value, "importDate");
            return (Criteria) this;
        }

        public Criteria andImportDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("import_date <=", value, "importDate");
            return (Criteria) this;
        }

        public Criteria andImportDateIn(List<Date> values) {
            addCriterionForJDBCDate("import_date in", values, "importDate");
            return (Criteria) this;
        }

        public Criteria andImportDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("import_date not in", values, "importDate");
            return (Criteria) this;
        }

        public Criteria andImportDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("import_date between", value1, value2, "importDate");
            return (Criteria) this;
        }

        public Criteria andImportDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("import_date not between", value1, value2, "importDate");
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