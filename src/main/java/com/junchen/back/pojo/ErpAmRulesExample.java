package com.junchen.back.pojo;

import java.util.ArrayList;
import java.util.List;

public class ErpAmRulesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ErpAmRulesExample() {
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

        public Criteria andRulesIdIsNull() {
            addCriterion("rules_id is null");
            return (Criteria) this;
        }

        public Criteria andRulesIdIsNotNull() {
            addCriterion("rules_id is not null");
            return (Criteria) this;
        }

        public Criteria andRulesIdEqualTo(Long value) {
            addCriterion("rules_id =", value, "rulesId");
            return (Criteria) this;
        }

        public Criteria andRulesIdNotEqualTo(Long value) {
            addCriterion("rules_id <>", value, "rulesId");
            return (Criteria) this;
        }

        public Criteria andRulesIdGreaterThan(Long value) {
            addCriterion("rules_id >", value, "rulesId");
            return (Criteria) this;
        }

        public Criteria andRulesIdGreaterThanOrEqualTo(Long value) {
            addCriterion("rules_id >=", value, "rulesId");
            return (Criteria) this;
        }

        public Criteria andRulesIdLessThan(Long value) {
            addCriterion("rules_id <", value, "rulesId");
            return (Criteria) this;
        }

        public Criteria andRulesIdLessThanOrEqualTo(Long value) {
            addCriterion("rules_id <=", value, "rulesId");
            return (Criteria) this;
        }

        public Criteria andRulesIdIn(List<Long> values) {
            addCriterion("rules_id in", values, "rulesId");
            return (Criteria) this;
        }

        public Criteria andRulesIdNotIn(List<Long> values) {
            addCriterion("rules_id not in", values, "rulesId");
            return (Criteria) this;
        }

        public Criteria andRulesIdBetween(Long value1, Long value2) {
            addCriterion("rules_id between", value1, value2, "rulesId");
            return (Criteria) this;
        }

        public Criteria andRulesIdNotBetween(Long value1, Long value2) {
            addCriterion("rules_id not between", value1, value2, "rulesId");
            return (Criteria) this;
        }

        public Criteria andRulesNameIsNull() {
            addCriterion("rules_name is null");
            return (Criteria) this;
        }

        public Criteria andRulesNameIsNotNull() {
            addCriterion("rules_name is not null");
            return (Criteria) this;
        }

        public Criteria andRulesNameEqualTo(String value) {
            addCriterion("rules_name =", value, "rulesName");
            return (Criteria) this;
        }

        public Criteria andRulesNameNotEqualTo(String value) {
            addCriterion("rules_name <>", value, "rulesName");
            return (Criteria) this;
        }

        public Criteria andRulesNameGreaterThan(String value) {
            addCriterion("rules_name >", value, "rulesName");
            return (Criteria) this;
        }

        public Criteria andRulesNameGreaterThanOrEqualTo(String value) {
            addCriterion("rules_name >=", value, "rulesName");
            return (Criteria) this;
        }

        public Criteria andRulesNameLessThan(String value) {
            addCriterion("rules_name <", value, "rulesName");
            return (Criteria) this;
        }

        public Criteria andRulesNameLessThanOrEqualTo(String value) {
            addCriterion("rules_name <=", value, "rulesName");
            return (Criteria) this;
        }

        public Criteria andRulesNameLike(String value) {
            addCriterion("rules_name like", value, "rulesName");
            return (Criteria) this;
        }

        public Criteria andRulesNameNotLike(String value) {
            addCriterion("rules_name not like", value, "rulesName");
            return (Criteria) this;
        }

        public Criteria andRulesNameIn(List<String> values) {
            addCriterion("rules_name in", values, "rulesName");
            return (Criteria) this;
        }

        public Criteria andRulesNameNotIn(List<String> values) {
            addCriterion("rules_name not in", values, "rulesName");
            return (Criteria) this;
        }

        public Criteria andRulesNameBetween(String value1, String value2) {
            addCriterion("rules_name between", value1, value2, "rulesName");
            return (Criteria) this;
        }

        public Criteria andRulesNameNotBetween(String value1, String value2) {
            addCriterion("rules_name not between", value1, value2, "rulesName");
            return (Criteria) this;
        }

        public Criteria andRulesUrlIsNull() {
            addCriterion("rules_url is null");
            return (Criteria) this;
        }

        public Criteria andRulesUrlIsNotNull() {
            addCriterion("rules_url is not null");
            return (Criteria) this;
        }

        public Criteria andRulesUrlEqualTo(String value) {
            addCriterion("rules_url =", value, "rulesUrl");
            return (Criteria) this;
        }

        public Criteria andRulesUrlNotEqualTo(String value) {
            addCriterion("rules_url <>", value, "rulesUrl");
            return (Criteria) this;
        }

        public Criteria andRulesUrlGreaterThan(String value) {
            addCriterion("rules_url >", value, "rulesUrl");
            return (Criteria) this;
        }

        public Criteria andRulesUrlGreaterThanOrEqualTo(String value) {
            addCriterion("rules_url >=", value, "rulesUrl");
            return (Criteria) this;
        }

        public Criteria andRulesUrlLessThan(String value) {
            addCriterion("rules_url <", value, "rulesUrl");
            return (Criteria) this;
        }

        public Criteria andRulesUrlLessThanOrEqualTo(String value) {
            addCriterion("rules_url <=", value, "rulesUrl");
            return (Criteria) this;
        }

        public Criteria andRulesUrlLike(String value) {
            addCriterion("rules_url like", value, "rulesUrl");
            return (Criteria) this;
        }

        public Criteria andRulesUrlNotLike(String value) {
            addCriterion("rules_url not like", value, "rulesUrl");
            return (Criteria) this;
        }

        public Criteria andRulesUrlIn(List<String> values) {
            addCriterion("rules_url in", values, "rulesUrl");
            return (Criteria) this;
        }

        public Criteria andRulesUrlNotIn(List<String> values) {
            addCriterion("rules_url not in", values, "rulesUrl");
            return (Criteria) this;
        }

        public Criteria andRulesUrlBetween(String value1, String value2) {
            addCriterion("rules_url between", value1, value2, "rulesUrl");
            return (Criteria) this;
        }

        public Criteria andRulesUrlNotBetween(String value1, String value2) {
            addCriterion("rules_url not between", value1, value2, "rulesUrl");
            return (Criteria) this;
        }

        public Criteria andRulesDatetimeIsNull() {
            addCriterion("rules_datetime is null");
            return (Criteria) this;
        }

        public Criteria andRulesDatetimeIsNotNull() {
            addCriterion("rules_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andRulesDatetimeEqualTo(String value) {
            addCriterion("rules_datetime =", value, "rulesDatetime");
            return (Criteria) this;
        }

        public Criteria andRulesDatetimeNotEqualTo(String value) {
            addCriterion("rules_datetime <>", value, "rulesDatetime");
            return (Criteria) this;
        }

        public Criteria andRulesDatetimeGreaterThan(String value) {
            addCriterion("rules_datetime >", value, "rulesDatetime");
            return (Criteria) this;
        }

        public Criteria andRulesDatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("rules_datetime >=", value, "rulesDatetime");
            return (Criteria) this;
        }

        public Criteria andRulesDatetimeLessThan(String value) {
            addCriterion("rules_datetime <", value, "rulesDatetime");
            return (Criteria) this;
        }

        public Criteria andRulesDatetimeLessThanOrEqualTo(String value) {
            addCriterion("rules_datetime <=", value, "rulesDatetime");
            return (Criteria) this;
        }

        public Criteria andRulesDatetimeLike(String value) {
            addCriterion("rules_datetime like", value, "rulesDatetime");
            return (Criteria) this;
        }

        public Criteria andRulesDatetimeNotLike(String value) {
            addCriterion("rules_datetime not like", value, "rulesDatetime");
            return (Criteria) this;
        }

        public Criteria andRulesDatetimeIn(List<String> values) {
            addCriterion("rules_datetime in", values, "rulesDatetime");
            return (Criteria) this;
        }

        public Criteria andRulesDatetimeNotIn(List<String> values) {
            addCriterion("rules_datetime not in", values, "rulesDatetime");
            return (Criteria) this;
        }

        public Criteria andRulesDatetimeBetween(String value1, String value2) {
            addCriterion("rules_datetime between", value1, value2, "rulesDatetime");
            return (Criteria) this;
        }

        public Criteria andRulesDatetimeNotBetween(String value1, String value2) {
            addCriterion("rules_datetime not between", value1, value2, "rulesDatetime");
            return (Criteria) this;
        }

        public Criteria andRulesStaffIsNull() {
            addCriterion("rules_staff is null");
            return (Criteria) this;
        }

        public Criteria andRulesStaffIsNotNull() {
            addCriterion("rules_staff is not null");
            return (Criteria) this;
        }

        public Criteria andRulesStaffEqualTo(Long value) {
            addCriterion("rules_staff =", value, "rulesStaff");
            return (Criteria) this;
        }

        public Criteria andRulesStaffNotEqualTo(Long value) {
            addCriterion("rules_staff <>", value, "rulesStaff");
            return (Criteria) this;
        }

        public Criteria andRulesStaffGreaterThan(Long value) {
            addCriterion("rules_staff >", value, "rulesStaff");
            return (Criteria) this;
        }

        public Criteria andRulesStaffGreaterThanOrEqualTo(Long value) {
            addCriterion("rules_staff >=", value, "rulesStaff");
            return (Criteria) this;
        }

        public Criteria andRulesStaffLessThan(Long value) {
            addCriterion("rules_staff <", value, "rulesStaff");
            return (Criteria) this;
        }

        public Criteria andRulesStaffLessThanOrEqualTo(Long value) {
            addCriterion("rules_staff <=", value, "rulesStaff");
            return (Criteria) this;
        }

        public Criteria andRulesStaffIn(List<Long> values) {
            addCriterion("rules_staff in", values, "rulesStaff");
            return (Criteria) this;
        }

        public Criteria andRulesStaffNotIn(List<Long> values) {
            addCriterion("rules_staff not in", values, "rulesStaff");
            return (Criteria) this;
        }

        public Criteria andRulesStaffBetween(Long value1, Long value2) {
            addCriterion("rules_staff between", value1, value2, "rulesStaff");
            return (Criteria) this;
        }

        public Criteria andRulesStaffNotBetween(Long value1, Long value2) {
            addCriterion("rules_staff not between", value1, value2, "rulesStaff");
            return (Criteria) this;
        }

        public Criteria andRulesEnableIsNull() {
            addCriterion("rules_enable is null");
            return (Criteria) this;
        }

        public Criteria andRulesEnableIsNotNull() {
            addCriterion("rules_enable is not null");
            return (Criteria) this;
        }

        public Criteria andRulesEnableEqualTo(String value) {
            addCriterion("rules_enable =", value, "rulesEnable");
            return (Criteria) this;
        }

        public Criteria andRulesEnableNotEqualTo(String value) {
            addCriterion("rules_enable <>", value, "rulesEnable");
            return (Criteria) this;
        }

        public Criteria andRulesEnableGreaterThan(String value) {
            addCriterion("rules_enable >", value, "rulesEnable");
            return (Criteria) this;
        }

        public Criteria andRulesEnableGreaterThanOrEqualTo(String value) {
            addCriterion("rules_enable >=", value, "rulesEnable");
            return (Criteria) this;
        }

        public Criteria andRulesEnableLessThan(String value) {
            addCriterion("rules_enable <", value, "rulesEnable");
            return (Criteria) this;
        }

        public Criteria andRulesEnableLessThanOrEqualTo(String value) {
            addCriterion("rules_enable <=", value, "rulesEnable");
            return (Criteria) this;
        }

        public Criteria andRulesEnableLike(String value) {
            addCriterion("rules_enable like", value, "rulesEnable");
            return (Criteria) this;
        }

        public Criteria andRulesEnableNotLike(String value) {
            addCriterion("rules_enable not like", value, "rulesEnable");
            return (Criteria) this;
        }

        public Criteria andRulesEnableIn(List<String> values) {
            addCriterion("rules_enable in", values, "rulesEnable");
            return (Criteria) this;
        }

        public Criteria andRulesEnableNotIn(List<String> values) {
            addCriterion("rules_enable not in", values, "rulesEnable");
            return (Criteria) this;
        }

        public Criteria andRulesEnableBetween(String value1, String value2) {
            addCriterion("rules_enable between", value1, value2, "rulesEnable");
            return (Criteria) this;
        }

        public Criteria andRulesEnableNotBetween(String value1, String value2) {
            addCriterion("rules_enable not between", value1, value2, "rulesEnable");
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