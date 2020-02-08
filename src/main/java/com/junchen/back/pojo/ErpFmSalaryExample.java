package com.junchen.back.pojo;

import java.util.ArrayList;
import java.util.List;

public class ErpFmSalaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ErpFmSalaryExample() {
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

        public Criteria andSalaryIdIsNull() {
            addCriterion("salary_id is null");
            return (Criteria) this;
        }

        public Criteria andSalaryIdIsNotNull() {
            addCriterion("salary_id is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryIdEqualTo(Long value) {
            addCriterion("salary_id =", value, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdNotEqualTo(Long value) {
            addCriterion("salary_id <>", value, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdGreaterThan(Long value) {
            addCriterion("salary_id >", value, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("salary_id >=", value, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdLessThan(Long value) {
            addCriterion("salary_id <", value, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdLessThanOrEqualTo(Long value) {
            addCriterion("salary_id <=", value, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdIn(List<Long> values) {
            addCriterion("salary_id in", values, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdNotIn(List<Long> values) {
            addCriterion("salary_id not in", values, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdBetween(Long value1, Long value2) {
            addCriterion("salary_id between", value1, value2, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdNotBetween(Long value1, Long value2) {
            addCriterion("salary_id not between", value1, value2, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryNameIsNull() {
            addCriterion("salary_name is null");
            return (Criteria) this;
        }

        public Criteria andSalaryNameIsNotNull() {
            addCriterion("salary_name is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryNameEqualTo(String value) {
            addCriterion("salary_name =", value, "salaryName");
            return (Criteria) this;
        }

        public Criteria andSalaryNameNotEqualTo(String value) {
            addCriterion("salary_name <>", value, "salaryName");
            return (Criteria) this;
        }

        public Criteria andSalaryNameGreaterThan(String value) {
            addCriterion("salary_name >", value, "salaryName");
            return (Criteria) this;
        }

        public Criteria andSalaryNameGreaterThanOrEqualTo(String value) {
            addCriterion("salary_name >=", value, "salaryName");
            return (Criteria) this;
        }

        public Criteria andSalaryNameLessThan(String value) {
            addCriterion("salary_name <", value, "salaryName");
            return (Criteria) this;
        }

        public Criteria andSalaryNameLessThanOrEqualTo(String value) {
            addCriterion("salary_name <=", value, "salaryName");
            return (Criteria) this;
        }

        public Criteria andSalaryNameLike(String value) {
            addCriterion("salary_name like", value, "salaryName");
            return (Criteria) this;
        }

        public Criteria andSalaryNameNotLike(String value) {
            addCriterion("salary_name not like", value, "salaryName");
            return (Criteria) this;
        }

        public Criteria andSalaryNameIn(List<String> values) {
            addCriterion("salary_name in", values, "salaryName");
            return (Criteria) this;
        }

        public Criteria andSalaryNameNotIn(List<String> values) {
            addCriterion("salary_name not in", values, "salaryName");
            return (Criteria) this;
        }

        public Criteria andSalaryNameBetween(String value1, String value2) {
            addCriterion("salary_name between", value1, value2, "salaryName");
            return (Criteria) this;
        }

        public Criteria andSalaryNameNotBetween(String value1, String value2) {
            addCriterion("salary_name not between", value1, value2, "salaryName");
            return (Criteria) this;
        }

        public Criteria andSalaryStaffIsNull() {
            addCriterion("salary_staff is null");
            return (Criteria) this;
        }

        public Criteria andSalaryStaffIsNotNull() {
            addCriterion("salary_staff is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryStaffEqualTo(Long value) {
            addCriterion("salary_staff =", value, "salaryStaff");
            return (Criteria) this;
        }

        public Criteria andSalaryStaffNotEqualTo(Long value) {
            addCriterion("salary_staff <>", value, "salaryStaff");
            return (Criteria) this;
        }

        public Criteria andSalaryStaffGreaterThan(Long value) {
            addCriterion("salary_staff >", value, "salaryStaff");
            return (Criteria) this;
        }

        public Criteria andSalaryStaffGreaterThanOrEqualTo(Long value) {
            addCriterion("salary_staff >=", value, "salaryStaff");
            return (Criteria) this;
        }

        public Criteria andSalaryStaffLessThan(Long value) {
            addCriterion("salary_staff <", value, "salaryStaff");
            return (Criteria) this;
        }

        public Criteria andSalaryStaffLessThanOrEqualTo(Long value) {
            addCriterion("salary_staff <=", value, "salaryStaff");
            return (Criteria) this;
        }

        public Criteria andSalaryStaffIn(List<Long> values) {
            addCriterion("salary_staff in", values, "salaryStaff");
            return (Criteria) this;
        }

        public Criteria andSalaryStaffNotIn(List<Long> values) {
            addCriterion("salary_staff not in", values, "salaryStaff");
            return (Criteria) this;
        }

        public Criteria andSalaryStaffBetween(Long value1, Long value2) {
            addCriterion("salary_staff between", value1, value2, "salaryStaff");
            return (Criteria) this;
        }

        public Criteria andSalaryStaffNotBetween(Long value1, Long value2) {
            addCriterion("salary_staff not between", value1, value2, "salaryStaff");
            return (Criteria) this;
        }

        public Criteria andSalaryDateIsNull() {
            addCriterion("salary_date is null");
            return (Criteria) this;
        }

        public Criteria andSalaryDateIsNotNull() {
            addCriterion("salary_date is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryDateEqualTo(String value) {
            addCriterion("salary_date =", value, "salaryDate");
            return (Criteria) this;
        }

        public Criteria andSalaryDateNotEqualTo(String value) {
            addCriterion("salary_date <>", value, "salaryDate");
            return (Criteria) this;
        }

        public Criteria andSalaryDateGreaterThan(String value) {
            addCriterion("salary_date >", value, "salaryDate");
            return (Criteria) this;
        }

        public Criteria andSalaryDateGreaterThanOrEqualTo(String value) {
            addCriterion("salary_date >=", value, "salaryDate");
            return (Criteria) this;
        }

        public Criteria andSalaryDateLessThan(String value) {
            addCriterion("salary_date <", value, "salaryDate");
            return (Criteria) this;
        }

        public Criteria andSalaryDateLessThanOrEqualTo(String value) {
            addCriterion("salary_date <=", value, "salaryDate");
            return (Criteria) this;
        }

        public Criteria andSalaryDateLike(String value) {
            addCriterion("salary_date like", value, "salaryDate");
            return (Criteria) this;
        }

        public Criteria andSalaryDateNotLike(String value) {
            addCriterion("salary_date not like", value, "salaryDate");
            return (Criteria) this;
        }

        public Criteria andSalaryDateIn(List<String> values) {
            addCriterion("salary_date in", values, "salaryDate");
            return (Criteria) this;
        }

        public Criteria andSalaryDateNotIn(List<String> values) {
            addCriterion("salary_date not in", values, "salaryDate");
            return (Criteria) this;
        }

        public Criteria andSalaryDateBetween(String value1, String value2) {
            addCriterion("salary_date between", value1, value2, "salaryDate");
            return (Criteria) this;
        }

        public Criteria andSalaryDateNotBetween(String value1, String value2) {
            addCriterion("salary_date not between", value1, value2, "salaryDate");
            return (Criteria) this;
        }

        public Criteria andSalaryMemoIsNull() {
            addCriterion("salary_memo is null");
            return (Criteria) this;
        }

        public Criteria andSalaryMemoIsNotNull() {
            addCriterion("salary_memo is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryMemoEqualTo(String value) {
            addCriterion("salary_memo =", value, "salaryMemo");
            return (Criteria) this;
        }

        public Criteria andSalaryMemoNotEqualTo(String value) {
            addCriterion("salary_memo <>", value, "salaryMemo");
            return (Criteria) this;
        }

        public Criteria andSalaryMemoGreaterThan(String value) {
            addCriterion("salary_memo >", value, "salaryMemo");
            return (Criteria) this;
        }

        public Criteria andSalaryMemoGreaterThanOrEqualTo(String value) {
            addCriterion("salary_memo >=", value, "salaryMemo");
            return (Criteria) this;
        }

        public Criteria andSalaryMemoLessThan(String value) {
            addCriterion("salary_memo <", value, "salaryMemo");
            return (Criteria) this;
        }

        public Criteria andSalaryMemoLessThanOrEqualTo(String value) {
            addCriterion("salary_memo <=", value, "salaryMemo");
            return (Criteria) this;
        }

        public Criteria andSalaryMemoLike(String value) {
            addCriterion("salary_memo like", value, "salaryMemo");
            return (Criteria) this;
        }

        public Criteria andSalaryMemoNotLike(String value) {
            addCriterion("salary_memo not like", value, "salaryMemo");
            return (Criteria) this;
        }

        public Criteria andSalaryMemoIn(List<String> values) {
            addCriterion("salary_memo in", values, "salaryMemo");
            return (Criteria) this;
        }

        public Criteria andSalaryMemoNotIn(List<String> values) {
            addCriterion("salary_memo not in", values, "salaryMemo");
            return (Criteria) this;
        }

        public Criteria andSalaryMemoBetween(String value1, String value2) {
            addCriterion("salary_memo between", value1, value2, "salaryMemo");
            return (Criteria) this;
        }

        public Criteria andSalaryMemoNotBetween(String value1, String value2) {
            addCriterion("salary_memo not between", value1, value2, "salaryMemo");
            return (Criteria) this;
        }

        public Criteria andSalaryEnableIsNull() {
            addCriterion("salary_enable is null");
            return (Criteria) this;
        }

        public Criteria andSalaryEnableIsNotNull() {
            addCriterion("salary_enable is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryEnableEqualTo(String value) {
            addCriterion("salary_enable =", value, "salaryEnable");
            return (Criteria) this;
        }

        public Criteria andSalaryEnableNotEqualTo(String value) {
            addCriterion("salary_enable <>", value, "salaryEnable");
            return (Criteria) this;
        }

        public Criteria andSalaryEnableGreaterThan(String value) {
            addCriterion("salary_enable >", value, "salaryEnable");
            return (Criteria) this;
        }

        public Criteria andSalaryEnableGreaterThanOrEqualTo(String value) {
            addCriterion("salary_enable >=", value, "salaryEnable");
            return (Criteria) this;
        }

        public Criteria andSalaryEnableLessThan(String value) {
            addCriterion("salary_enable <", value, "salaryEnable");
            return (Criteria) this;
        }

        public Criteria andSalaryEnableLessThanOrEqualTo(String value) {
            addCriterion("salary_enable <=", value, "salaryEnable");
            return (Criteria) this;
        }

        public Criteria andSalaryEnableLike(String value) {
            addCriterion("salary_enable like", value, "salaryEnable");
            return (Criteria) this;
        }

        public Criteria andSalaryEnableNotLike(String value) {
            addCriterion("salary_enable not like", value, "salaryEnable");
            return (Criteria) this;
        }

        public Criteria andSalaryEnableIn(List<String> values) {
            addCriterion("salary_enable in", values, "salaryEnable");
            return (Criteria) this;
        }

        public Criteria andSalaryEnableNotIn(List<String> values) {
            addCriterion("salary_enable not in", values, "salaryEnable");
            return (Criteria) this;
        }

        public Criteria andSalaryEnableBetween(String value1, String value2) {
            addCriterion("salary_enable between", value1, value2, "salaryEnable");
            return (Criteria) this;
        }

        public Criteria andSalaryEnableNotBetween(String value1, String value2) {
            addCriterion("salary_enable not between", value1, value2, "salaryEnable");
            return (Criteria) this;
        }

        public Criteria andSalaryBossIsNull() {
            addCriterion("salary_boss is null");
            return (Criteria) this;
        }

        public Criteria andSalaryBossIsNotNull() {
            addCriterion("salary_boss is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryBossEqualTo(Long value) {
            addCriterion("salary_boss =", value, "salaryBoss");
            return (Criteria) this;
        }

        public Criteria andSalaryBossNotEqualTo(Long value) {
            addCriterion("salary_boss <>", value, "salaryBoss");
            return (Criteria) this;
        }

        public Criteria andSalaryBossGreaterThan(Long value) {
            addCriterion("salary_boss >", value, "salaryBoss");
            return (Criteria) this;
        }

        public Criteria andSalaryBossGreaterThanOrEqualTo(Long value) {
            addCriterion("salary_boss >=", value, "salaryBoss");
            return (Criteria) this;
        }

        public Criteria andSalaryBossLessThan(Long value) {
            addCriterion("salary_boss <", value, "salaryBoss");
            return (Criteria) this;
        }

        public Criteria andSalaryBossLessThanOrEqualTo(Long value) {
            addCriterion("salary_boss <=", value, "salaryBoss");
            return (Criteria) this;
        }

        public Criteria andSalaryBossIn(List<Long> values) {
            addCriterion("salary_boss in", values, "salaryBoss");
            return (Criteria) this;
        }

        public Criteria andSalaryBossNotIn(List<Long> values) {
            addCriterion("salary_boss not in", values, "salaryBoss");
            return (Criteria) this;
        }

        public Criteria andSalaryBossBetween(Long value1, Long value2) {
            addCriterion("salary_boss between", value1, value2, "salaryBoss");
            return (Criteria) this;
        }

        public Criteria andSalaryBossNotBetween(Long value1, Long value2) {
            addCriterion("salary_boss not between", value1, value2, "salaryBoss");
            return (Criteria) this;
        }

        public Criteria andSalaryBossdateIsNull() {
            addCriterion("salary_bossdate is null");
            return (Criteria) this;
        }

        public Criteria andSalaryBossdateIsNotNull() {
            addCriterion("salary_bossdate is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryBossdateEqualTo(String value) {
            addCriterion("salary_bossdate =", value, "salaryBossdate");
            return (Criteria) this;
        }

        public Criteria andSalaryBossdateNotEqualTo(String value) {
            addCriterion("salary_bossdate <>", value, "salaryBossdate");
            return (Criteria) this;
        }

        public Criteria andSalaryBossdateGreaterThan(String value) {
            addCriterion("salary_bossdate >", value, "salaryBossdate");
            return (Criteria) this;
        }

        public Criteria andSalaryBossdateGreaterThanOrEqualTo(String value) {
            addCriterion("salary_bossdate >=", value, "salaryBossdate");
            return (Criteria) this;
        }

        public Criteria andSalaryBossdateLessThan(String value) {
            addCriterion("salary_bossdate <", value, "salaryBossdate");
            return (Criteria) this;
        }

        public Criteria andSalaryBossdateLessThanOrEqualTo(String value) {
            addCriterion("salary_bossdate <=", value, "salaryBossdate");
            return (Criteria) this;
        }

        public Criteria andSalaryBossdateLike(String value) {
            addCriterion("salary_bossdate like", value, "salaryBossdate");
            return (Criteria) this;
        }

        public Criteria andSalaryBossdateNotLike(String value) {
            addCriterion("salary_bossdate not like", value, "salaryBossdate");
            return (Criteria) this;
        }

        public Criteria andSalaryBossdateIn(List<String> values) {
            addCriterion("salary_bossdate in", values, "salaryBossdate");
            return (Criteria) this;
        }

        public Criteria andSalaryBossdateNotIn(List<String> values) {
            addCriterion("salary_bossdate not in", values, "salaryBossdate");
            return (Criteria) this;
        }

        public Criteria andSalaryBossdateBetween(String value1, String value2) {
            addCriterion("salary_bossdate between", value1, value2, "salaryBossdate");
            return (Criteria) this;
        }

        public Criteria andSalaryBossdateNotBetween(String value1, String value2) {
            addCriterion("salary_bossdate not between", value1, value2, "salaryBossdate");
            return (Criteria) this;
        }

        public Criteria andSalaryBossmemoIsNull() {
            addCriterion("salary_bossmemo is null");
            return (Criteria) this;
        }

        public Criteria andSalaryBossmemoIsNotNull() {
            addCriterion("salary_bossmemo is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryBossmemoEqualTo(String value) {
            addCriterion("salary_bossmemo =", value, "salaryBossmemo");
            return (Criteria) this;
        }

        public Criteria andSalaryBossmemoNotEqualTo(String value) {
            addCriterion("salary_bossmemo <>", value, "salaryBossmemo");
            return (Criteria) this;
        }

        public Criteria andSalaryBossmemoGreaterThan(String value) {
            addCriterion("salary_bossmemo >", value, "salaryBossmemo");
            return (Criteria) this;
        }

        public Criteria andSalaryBossmemoGreaterThanOrEqualTo(String value) {
            addCriterion("salary_bossmemo >=", value, "salaryBossmemo");
            return (Criteria) this;
        }

        public Criteria andSalaryBossmemoLessThan(String value) {
            addCriterion("salary_bossmemo <", value, "salaryBossmemo");
            return (Criteria) this;
        }

        public Criteria andSalaryBossmemoLessThanOrEqualTo(String value) {
            addCriterion("salary_bossmemo <=", value, "salaryBossmemo");
            return (Criteria) this;
        }

        public Criteria andSalaryBossmemoLike(String value) {
            addCriterion("salary_bossmemo like", value, "salaryBossmemo");
            return (Criteria) this;
        }

        public Criteria andSalaryBossmemoNotLike(String value) {
            addCriterion("salary_bossmemo not like", value, "salaryBossmemo");
            return (Criteria) this;
        }

        public Criteria andSalaryBossmemoIn(List<String> values) {
            addCriterion("salary_bossmemo in", values, "salaryBossmemo");
            return (Criteria) this;
        }

        public Criteria andSalaryBossmemoNotIn(List<String> values) {
            addCriterion("salary_bossmemo not in", values, "salaryBossmemo");
            return (Criteria) this;
        }

        public Criteria andSalaryBossmemoBetween(String value1, String value2) {
            addCriterion("salary_bossmemo between", value1, value2, "salaryBossmemo");
            return (Criteria) this;
        }

        public Criteria andSalaryBossmemoNotBetween(String value1, String value2) {
            addCriterion("salary_bossmemo not between", value1, value2, "salaryBossmemo");
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