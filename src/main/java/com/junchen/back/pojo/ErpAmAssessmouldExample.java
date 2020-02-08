package com.junchen.back.pojo;

import java.util.ArrayList;
import java.util.List;

public class ErpAmAssessmouldExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ErpAmAssessmouldExample() {
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

        public Criteria andAssessmouldIdIsNull() {
            addCriterion("assessmould_id is null");
            return (Criteria) this;
        }

        public Criteria andAssessmouldIdIsNotNull() {
            addCriterion("assessmould_id is not null");
            return (Criteria) this;
        }

        public Criteria andAssessmouldIdEqualTo(Long value) {
            addCriterion("assessmould_id =", value, "assessmouldId");
            return (Criteria) this;
        }

        public Criteria andAssessmouldIdNotEqualTo(Long value) {
            addCriterion("assessmould_id <>", value, "assessmouldId");
            return (Criteria) this;
        }

        public Criteria andAssessmouldIdGreaterThan(Long value) {
            addCriterion("assessmould_id >", value, "assessmouldId");
            return (Criteria) this;
        }

        public Criteria andAssessmouldIdGreaterThanOrEqualTo(Long value) {
            addCriterion("assessmould_id >=", value, "assessmouldId");
            return (Criteria) this;
        }

        public Criteria andAssessmouldIdLessThan(Long value) {
            addCriterion("assessmould_id <", value, "assessmouldId");
            return (Criteria) this;
        }

        public Criteria andAssessmouldIdLessThanOrEqualTo(Long value) {
            addCriterion("assessmould_id <=", value, "assessmouldId");
            return (Criteria) this;
        }

        public Criteria andAssessmouldIdIn(List<Long> values) {
            addCriterion("assessmould_id in", values, "assessmouldId");
            return (Criteria) this;
        }

        public Criteria andAssessmouldIdNotIn(List<Long> values) {
            addCriterion("assessmould_id not in", values, "assessmouldId");
            return (Criteria) this;
        }

        public Criteria andAssessmouldIdBetween(Long value1, Long value2) {
            addCriterion("assessmould_id between", value1, value2, "assessmouldId");
            return (Criteria) this;
        }

        public Criteria andAssessmouldIdNotBetween(Long value1, Long value2) {
            addCriterion("assessmould_id not between", value1, value2, "assessmouldId");
            return (Criteria) this;
        }

        public Criteria andAssessmouldNameIsNull() {
            addCriterion("assessmould_name is null");
            return (Criteria) this;
        }

        public Criteria andAssessmouldNameIsNotNull() {
            addCriterion("assessmould_name is not null");
            return (Criteria) this;
        }

        public Criteria andAssessmouldNameEqualTo(String value) {
            addCriterion("assessmould_name =", value, "assessmouldName");
            return (Criteria) this;
        }

        public Criteria andAssessmouldNameNotEqualTo(String value) {
            addCriterion("assessmould_name <>", value, "assessmouldName");
            return (Criteria) this;
        }

        public Criteria andAssessmouldNameGreaterThan(String value) {
            addCriterion("assessmould_name >", value, "assessmouldName");
            return (Criteria) this;
        }

        public Criteria andAssessmouldNameGreaterThanOrEqualTo(String value) {
            addCriterion("assessmould_name >=", value, "assessmouldName");
            return (Criteria) this;
        }

        public Criteria andAssessmouldNameLessThan(String value) {
            addCriterion("assessmould_name <", value, "assessmouldName");
            return (Criteria) this;
        }

        public Criteria andAssessmouldNameLessThanOrEqualTo(String value) {
            addCriterion("assessmould_name <=", value, "assessmouldName");
            return (Criteria) this;
        }

        public Criteria andAssessmouldNameLike(String value) {
            addCriterion("assessmould_name like", value, "assessmouldName");
            return (Criteria) this;
        }

        public Criteria andAssessmouldNameNotLike(String value) {
            addCriterion("assessmould_name not like", value, "assessmouldName");
            return (Criteria) this;
        }

        public Criteria andAssessmouldNameIn(List<String> values) {
            addCriterion("assessmould_name in", values, "assessmouldName");
            return (Criteria) this;
        }

        public Criteria andAssessmouldNameNotIn(List<String> values) {
            addCriterion("assessmould_name not in", values, "assessmouldName");
            return (Criteria) this;
        }

        public Criteria andAssessmouldNameBetween(String value1, String value2) {
            addCriterion("assessmould_name between", value1, value2, "assessmouldName");
            return (Criteria) this;
        }

        public Criteria andAssessmouldNameNotBetween(String value1, String value2) {
            addCriterion("assessmould_name not between", value1, value2, "assessmouldName");
            return (Criteria) this;
        }

        public Criteria andAssessmouldStaffIsNull() {
            addCriterion("assessmould_staff is null");
            return (Criteria) this;
        }

        public Criteria andAssessmouldStaffIsNotNull() {
            addCriterion("assessmould_staff is not null");
            return (Criteria) this;
        }

        public Criteria andAssessmouldStaffEqualTo(Long value) {
            addCriterion("assessmould_staff =", value, "assessmouldStaff");
            return (Criteria) this;
        }

        public Criteria andAssessmouldStaffNotEqualTo(Long value) {
            addCriterion("assessmould_staff <>", value, "assessmouldStaff");
            return (Criteria) this;
        }

        public Criteria andAssessmouldStaffGreaterThan(Long value) {
            addCriterion("assessmould_staff >", value, "assessmouldStaff");
            return (Criteria) this;
        }

        public Criteria andAssessmouldStaffGreaterThanOrEqualTo(Long value) {
            addCriterion("assessmould_staff >=", value, "assessmouldStaff");
            return (Criteria) this;
        }

        public Criteria andAssessmouldStaffLessThan(Long value) {
            addCriterion("assessmould_staff <", value, "assessmouldStaff");
            return (Criteria) this;
        }

        public Criteria andAssessmouldStaffLessThanOrEqualTo(Long value) {
            addCriterion("assessmould_staff <=", value, "assessmouldStaff");
            return (Criteria) this;
        }

        public Criteria andAssessmouldStaffIn(List<Long> values) {
            addCriterion("assessmould_staff in", values, "assessmouldStaff");
            return (Criteria) this;
        }

        public Criteria andAssessmouldStaffNotIn(List<Long> values) {
            addCriterion("assessmould_staff not in", values, "assessmouldStaff");
            return (Criteria) this;
        }

        public Criteria andAssessmouldStaffBetween(Long value1, Long value2) {
            addCriterion("assessmould_staff between", value1, value2, "assessmouldStaff");
            return (Criteria) this;
        }

        public Criteria andAssessmouldStaffNotBetween(Long value1, Long value2) {
            addCriterion("assessmould_staff not between", value1, value2, "assessmouldStaff");
            return (Criteria) this;
        }

        public Criteria andAssessmouldMakedateIsNull() {
            addCriterion("assessmould_makeDate is null");
            return (Criteria) this;
        }

        public Criteria andAssessmouldMakedateIsNotNull() {
            addCriterion("assessmould_makeDate is not null");
            return (Criteria) this;
        }

        public Criteria andAssessmouldMakedateEqualTo(String value) {
            addCriterion("assessmould_makeDate =", value, "assessmouldMakedate");
            return (Criteria) this;
        }

        public Criteria andAssessmouldMakedateNotEqualTo(String value) {
            addCriterion("assessmould_makeDate <>", value, "assessmouldMakedate");
            return (Criteria) this;
        }

        public Criteria andAssessmouldMakedateGreaterThan(String value) {
            addCriterion("assessmould_makeDate >", value, "assessmouldMakedate");
            return (Criteria) this;
        }

        public Criteria andAssessmouldMakedateGreaterThanOrEqualTo(String value) {
            addCriterion("assessmould_makeDate >=", value, "assessmouldMakedate");
            return (Criteria) this;
        }

        public Criteria andAssessmouldMakedateLessThan(String value) {
            addCriterion("assessmould_makeDate <", value, "assessmouldMakedate");
            return (Criteria) this;
        }

        public Criteria andAssessmouldMakedateLessThanOrEqualTo(String value) {
            addCriterion("assessmould_makeDate <=", value, "assessmouldMakedate");
            return (Criteria) this;
        }

        public Criteria andAssessmouldMakedateLike(String value) {
            addCriterion("assessmould_makeDate like", value, "assessmouldMakedate");
            return (Criteria) this;
        }

        public Criteria andAssessmouldMakedateNotLike(String value) {
            addCriterion("assessmould_makeDate not like", value, "assessmouldMakedate");
            return (Criteria) this;
        }

        public Criteria andAssessmouldMakedateIn(List<String> values) {
            addCriterion("assessmould_makeDate in", values, "assessmouldMakedate");
            return (Criteria) this;
        }

        public Criteria andAssessmouldMakedateNotIn(List<String> values) {
            addCriterion("assessmould_makeDate not in", values, "assessmouldMakedate");
            return (Criteria) this;
        }

        public Criteria andAssessmouldMakedateBetween(String value1, String value2) {
            addCriterion("assessmould_makeDate between", value1, value2, "assessmouldMakedate");
            return (Criteria) this;
        }

        public Criteria andAssessmouldMakedateNotBetween(String value1, String value2) {
            addCriterion("assessmould_makeDate not between", value1, value2, "assessmouldMakedate");
            return (Criteria) this;
        }

        public Criteria andAssessmouldEnableIsNull() {
            addCriterion("assessmould_enable is null");
            return (Criteria) this;
        }

        public Criteria andAssessmouldEnableIsNotNull() {
            addCriterion("assessmould_enable is not null");
            return (Criteria) this;
        }

        public Criteria andAssessmouldEnableEqualTo(String value) {
            addCriterion("assessmould_enable =", value, "assessmouldEnable");
            return (Criteria) this;
        }

        public Criteria andAssessmouldEnableNotEqualTo(String value) {
            addCriterion("assessmould_enable <>", value, "assessmouldEnable");
            return (Criteria) this;
        }

        public Criteria andAssessmouldEnableGreaterThan(String value) {
            addCriterion("assessmould_enable >", value, "assessmouldEnable");
            return (Criteria) this;
        }

        public Criteria andAssessmouldEnableGreaterThanOrEqualTo(String value) {
            addCriterion("assessmould_enable >=", value, "assessmouldEnable");
            return (Criteria) this;
        }

        public Criteria andAssessmouldEnableLessThan(String value) {
            addCriterion("assessmould_enable <", value, "assessmouldEnable");
            return (Criteria) this;
        }

        public Criteria andAssessmouldEnableLessThanOrEqualTo(String value) {
            addCriterion("assessmould_enable <=", value, "assessmouldEnable");
            return (Criteria) this;
        }

        public Criteria andAssessmouldEnableLike(String value) {
            addCriterion("assessmould_enable like", value, "assessmouldEnable");
            return (Criteria) this;
        }

        public Criteria andAssessmouldEnableNotLike(String value) {
            addCriterion("assessmould_enable not like", value, "assessmouldEnable");
            return (Criteria) this;
        }

        public Criteria andAssessmouldEnableIn(List<String> values) {
            addCriterion("assessmould_enable in", values, "assessmouldEnable");
            return (Criteria) this;
        }

        public Criteria andAssessmouldEnableNotIn(List<String> values) {
            addCriterion("assessmould_enable not in", values, "assessmouldEnable");
            return (Criteria) this;
        }

        public Criteria andAssessmouldEnableBetween(String value1, String value2) {
            addCriterion("assessmould_enable between", value1, value2, "assessmouldEnable");
            return (Criteria) this;
        }

        public Criteria andAssessmouldEnableNotBetween(String value1, String value2) {
            addCriterion("assessmould_enable not between", value1, value2, "assessmouldEnable");
            return (Criteria) this;
        }

        public Criteria andAssessmouldMemoIsNull() {
            addCriterion("assessmould_memo is null");
            return (Criteria) this;
        }

        public Criteria andAssessmouldMemoIsNotNull() {
            addCriterion("assessmould_memo is not null");
            return (Criteria) this;
        }

        public Criteria andAssessmouldMemoEqualTo(String value) {
            addCriterion("assessmould_memo =", value, "assessmouldMemo");
            return (Criteria) this;
        }

        public Criteria andAssessmouldMemoNotEqualTo(String value) {
            addCriterion("assessmould_memo <>", value, "assessmouldMemo");
            return (Criteria) this;
        }

        public Criteria andAssessmouldMemoGreaterThan(String value) {
            addCriterion("assessmould_memo >", value, "assessmouldMemo");
            return (Criteria) this;
        }

        public Criteria andAssessmouldMemoGreaterThanOrEqualTo(String value) {
            addCriterion("assessmould_memo >=", value, "assessmouldMemo");
            return (Criteria) this;
        }

        public Criteria andAssessmouldMemoLessThan(String value) {
            addCriterion("assessmould_memo <", value, "assessmouldMemo");
            return (Criteria) this;
        }

        public Criteria andAssessmouldMemoLessThanOrEqualTo(String value) {
            addCriterion("assessmould_memo <=", value, "assessmouldMemo");
            return (Criteria) this;
        }

        public Criteria andAssessmouldMemoLike(String value) {
            addCriterion("assessmould_memo like", value, "assessmouldMemo");
            return (Criteria) this;
        }

        public Criteria andAssessmouldMemoNotLike(String value) {
            addCriterion("assessmould_memo not like", value, "assessmouldMemo");
            return (Criteria) this;
        }

        public Criteria andAssessmouldMemoIn(List<String> values) {
            addCriterion("assessmould_memo in", values, "assessmouldMemo");
            return (Criteria) this;
        }

        public Criteria andAssessmouldMemoNotIn(List<String> values) {
            addCriterion("assessmould_memo not in", values, "assessmouldMemo");
            return (Criteria) this;
        }

        public Criteria andAssessmouldMemoBetween(String value1, String value2) {
            addCriterion("assessmould_memo between", value1, value2, "assessmouldMemo");
            return (Criteria) this;
        }

        public Criteria andAssessmouldMemoNotBetween(String value1, String value2) {
            addCriterion("assessmould_memo not between", value1, value2, "assessmouldMemo");
            return (Criteria) this;
        }

        public Criteria andAssessmouldTotalIsNull() {
            addCriterion("assessmould_total is null");
            return (Criteria) this;
        }

        public Criteria andAssessmouldTotalIsNotNull() {
            addCriterion("assessmould_total is not null");
            return (Criteria) this;
        }

        public Criteria andAssessmouldTotalEqualTo(Long value) {
            addCriterion("assessmould_total =", value, "assessmouldTotal");
            return (Criteria) this;
        }

        public Criteria andAssessmouldTotalNotEqualTo(Long value) {
            addCriterion("assessmould_total <>", value, "assessmouldTotal");
            return (Criteria) this;
        }

        public Criteria andAssessmouldTotalGreaterThan(Long value) {
            addCriterion("assessmould_total >", value, "assessmouldTotal");
            return (Criteria) this;
        }

        public Criteria andAssessmouldTotalGreaterThanOrEqualTo(Long value) {
            addCriterion("assessmould_total >=", value, "assessmouldTotal");
            return (Criteria) this;
        }

        public Criteria andAssessmouldTotalLessThan(Long value) {
            addCriterion("assessmould_total <", value, "assessmouldTotal");
            return (Criteria) this;
        }

        public Criteria andAssessmouldTotalLessThanOrEqualTo(Long value) {
            addCriterion("assessmould_total <=", value, "assessmouldTotal");
            return (Criteria) this;
        }

        public Criteria andAssessmouldTotalIn(List<Long> values) {
            addCriterion("assessmould_total in", values, "assessmouldTotal");
            return (Criteria) this;
        }

        public Criteria andAssessmouldTotalNotIn(List<Long> values) {
            addCriterion("assessmould_total not in", values, "assessmouldTotal");
            return (Criteria) this;
        }

        public Criteria andAssessmouldTotalBetween(Long value1, Long value2) {
            addCriterion("assessmould_total between", value1, value2, "assessmouldTotal");
            return (Criteria) this;
        }

        public Criteria andAssessmouldTotalNotBetween(Long value1, Long value2) {
            addCriterion("assessmould_total not between", value1, value2, "assessmouldTotal");
            return (Criteria) this;
        }

        public Criteria andAssessmouldTypeIsNull() {
            addCriterion("assessmould_type is null");
            return (Criteria) this;
        }

        public Criteria andAssessmouldTypeIsNotNull() {
            addCriterion("assessmould_type is not null");
            return (Criteria) this;
        }

        public Criteria andAssessmouldTypeEqualTo(String value) {
            addCriterion("assessmould_type =", value, "assessmouldType");
            return (Criteria) this;
        }

        public Criteria andAssessmouldTypeNotEqualTo(String value) {
            addCriterion("assessmould_type <>", value, "assessmouldType");
            return (Criteria) this;
        }

        public Criteria andAssessmouldTypeGreaterThan(String value) {
            addCriterion("assessmould_type >", value, "assessmouldType");
            return (Criteria) this;
        }

        public Criteria andAssessmouldTypeGreaterThanOrEqualTo(String value) {
            addCriterion("assessmould_type >=", value, "assessmouldType");
            return (Criteria) this;
        }

        public Criteria andAssessmouldTypeLessThan(String value) {
            addCriterion("assessmould_type <", value, "assessmouldType");
            return (Criteria) this;
        }

        public Criteria andAssessmouldTypeLessThanOrEqualTo(String value) {
            addCriterion("assessmould_type <=", value, "assessmouldType");
            return (Criteria) this;
        }

        public Criteria andAssessmouldTypeLike(String value) {
            addCriterion("assessmould_type like", value, "assessmouldType");
            return (Criteria) this;
        }

        public Criteria andAssessmouldTypeNotLike(String value) {
            addCriterion("assessmould_type not like", value, "assessmouldType");
            return (Criteria) this;
        }

        public Criteria andAssessmouldTypeIn(List<String> values) {
            addCriterion("assessmould_type in", values, "assessmouldType");
            return (Criteria) this;
        }

        public Criteria andAssessmouldTypeNotIn(List<String> values) {
            addCriterion("assessmould_type not in", values, "assessmouldType");
            return (Criteria) this;
        }

        public Criteria andAssessmouldTypeBetween(String value1, String value2) {
            addCriterion("assessmould_type between", value1, value2, "assessmouldType");
            return (Criteria) this;
        }

        public Criteria andAssessmouldTypeNotBetween(String value1, String value2) {
            addCriterion("assessmould_type not between", value1, value2, "assessmouldType");
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