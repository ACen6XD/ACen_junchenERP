package com.junchen.back.pojo;

import java.util.ArrayList;
import java.util.List;

public class ErpAmAssesspointExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ErpAmAssesspointExample() {
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

        public Criteria andAssesspointIdIsNull() {
            addCriterion("assesspoint_id is null");
            return (Criteria) this;
        }

        public Criteria andAssesspointIdIsNotNull() {
            addCriterion("assesspoint_id is not null");
            return (Criteria) this;
        }

        public Criteria andAssesspointIdEqualTo(Long value) {
            addCriterion("assesspoint_id =", value, "assesspointId");
            return (Criteria) this;
        }

        public Criteria andAssesspointIdNotEqualTo(Long value) {
            addCriterion("assesspoint_id <>", value, "assesspointId");
            return (Criteria) this;
        }

        public Criteria andAssesspointIdGreaterThan(Long value) {
            addCriterion("assesspoint_id >", value, "assesspointId");
            return (Criteria) this;
        }

        public Criteria andAssesspointIdGreaterThanOrEqualTo(Long value) {
            addCriterion("assesspoint_id >=", value, "assesspointId");
            return (Criteria) this;
        }

        public Criteria andAssesspointIdLessThan(Long value) {
            addCriterion("assesspoint_id <", value, "assesspointId");
            return (Criteria) this;
        }

        public Criteria andAssesspointIdLessThanOrEqualTo(Long value) {
            addCriterion("assesspoint_id <=", value, "assesspointId");
            return (Criteria) this;
        }

        public Criteria andAssesspointIdIn(List<Long> values) {
            addCriterion("assesspoint_id in", values, "assesspointId");
            return (Criteria) this;
        }

        public Criteria andAssesspointIdNotIn(List<Long> values) {
            addCriterion("assesspoint_id not in", values, "assesspointId");
            return (Criteria) this;
        }

        public Criteria andAssesspointIdBetween(Long value1, Long value2) {
            addCriterion("assesspoint_id between", value1, value2, "assesspointId");
            return (Criteria) this;
        }

        public Criteria andAssesspointIdNotBetween(Long value1, Long value2) {
            addCriterion("assesspoint_id not between", value1, value2, "assesspointId");
            return (Criteria) this;
        }

        public Criteria andAssesspointRuleIsNull() {
            addCriterion("assesspoint_rule is null");
            return (Criteria) this;
        }

        public Criteria andAssesspointRuleIsNotNull() {
            addCriterion("assesspoint_rule is not null");
            return (Criteria) this;
        }

        public Criteria andAssesspointRuleEqualTo(Long value) {
            addCriterion("assesspoint_rule =", value, "assesspointRule");
            return (Criteria) this;
        }

        public Criteria andAssesspointRuleNotEqualTo(Long value) {
            addCriterion("assesspoint_rule <>", value, "assesspointRule");
            return (Criteria) this;
        }

        public Criteria andAssesspointRuleGreaterThan(Long value) {
            addCriterion("assesspoint_rule >", value, "assesspointRule");
            return (Criteria) this;
        }

        public Criteria andAssesspointRuleGreaterThanOrEqualTo(Long value) {
            addCriterion("assesspoint_rule >=", value, "assesspointRule");
            return (Criteria) this;
        }

        public Criteria andAssesspointRuleLessThan(Long value) {
            addCriterion("assesspoint_rule <", value, "assesspointRule");
            return (Criteria) this;
        }

        public Criteria andAssesspointRuleLessThanOrEqualTo(Long value) {
            addCriterion("assesspoint_rule <=", value, "assesspointRule");
            return (Criteria) this;
        }

        public Criteria andAssesspointRuleIn(List<Long> values) {
            addCriterion("assesspoint_rule in", values, "assesspointRule");
            return (Criteria) this;
        }

        public Criteria andAssesspointRuleNotIn(List<Long> values) {
            addCriterion("assesspoint_rule not in", values, "assesspointRule");
            return (Criteria) this;
        }

        public Criteria andAssesspointRuleBetween(Long value1, Long value2) {
            addCriterion("assesspoint_rule between", value1, value2, "assesspointRule");
            return (Criteria) this;
        }

        public Criteria andAssesspointRuleNotBetween(Long value1, Long value2) {
            addCriterion("assesspoint_rule not between", value1, value2, "assesspointRule");
            return (Criteria) this;
        }

        public Criteria andAssesspointStaffpointIsNull() {
            addCriterion("assesspoint_staffpoint is null");
            return (Criteria) this;
        }

        public Criteria andAssesspointStaffpointIsNotNull() {
            addCriterion("assesspoint_staffpoint is not null");
            return (Criteria) this;
        }

        public Criteria andAssesspointStaffpointEqualTo(Long value) {
            addCriterion("assesspoint_staffpoint =", value, "assesspointStaffpoint");
            return (Criteria) this;
        }

        public Criteria andAssesspointStaffpointNotEqualTo(Long value) {
            addCriterion("assesspoint_staffpoint <>", value, "assesspointStaffpoint");
            return (Criteria) this;
        }

        public Criteria andAssesspointStaffpointGreaterThan(Long value) {
            addCriterion("assesspoint_staffpoint >", value, "assesspointStaffpoint");
            return (Criteria) this;
        }

        public Criteria andAssesspointStaffpointGreaterThanOrEqualTo(Long value) {
            addCriterion("assesspoint_staffpoint >=", value, "assesspointStaffpoint");
            return (Criteria) this;
        }

        public Criteria andAssesspointStaffpointLessThan(Long value) {
            addCriterion("assesspoint_staffpoint <", value, "assesspointStaffpoint");
            return (Criteria) this;
        }

        public Criteria andAssesspointStaffpointLessThanOrEqualTo(Long value) {
            addCriterion("assesspoint_staffpoint <=", value, "assesspointStaffpoint");
            return (Criteria) this;
        }

        public Criteria andAssesspointStaffpointIn(List<Long> values) {
            addCriterion("assesspoint_staffpoint in", values, "assesspointStaffpoint");
            return (Criteria) this;
        }

        public Criteria andAssesspointStaffpointNotIn(List<Long> values) {
            addCriterion("assesspoint_staffpoint not in", values, "assesspointStaffpoint");
            return (Criteria) this;
        }

        public Criteria andAssesspointStaffpointBetween(Long value1, Long value2) {
            addCriterion("assesspoint_staffpoint between", value1, value2, "assesspointStaffpoint");
            return (Criteria) this;
        }

        public Criteria andAssesspointStaffpointNotBetween(Long value1, Long value2) {
            addCriterion("assesspoint_staffpoint not between", value1, value2, "assesspointStaffpoint");
            return (Criteria) this;
        }

        public Criteria andAssesspointBosspointIsNull() {
            addCriterion("assesspoint_bosspoint is null");
            return (Criteria) this;
        }

        public Criteria andAssesspointBosspointIsNotNull() {
            addCriterion("assesspoint_bosspoint is not null");
            return (Criteria) this;
        }

        public Criteria andAssesspointBosspointEqualTo(Long value) {
            addCriterion("assesspoint_bosspoint =", value, "assesspointBosspoint");
            return (Criteria) this;
        }

        public Criteria andAssesspointBosspointNotEqualTo(Long value) {
            addCriterion("assesspoint_bosspoint <>", value, "assesspointBosspoint");
            return (Criteria) this;
        }

        public Criteria andAssesspointBosspointGreaterThan(Long value) {
            addCriterion("assesspoint_bosspoint >", value, "assesspointBosspoint");
            return (Criteria) this;
        }

        public Criteria andAssesspointBosspointGreaterThanOrEqualTo(Long value) {
            addCriterion("assesspoint_bosspoint >=", value, "assesspointBosspoint");
            return (Criteria) this;
        }

        public Criteria andAssesspointBosspointLessThan(Long value) {
            addCriterion("assesspoint_bosspoint <", value, "assesspointBosspoint");
            return (Criteria) this;
        }

        public Criteria andAssesspointBosspointLessThanOrEqualTo(Long value) {
            addCriterion("assesspoint_bosspoint <=", value, "assesspointBosspoint");
            return (Criteria) this;
        }

        public Criteria andAssesspointBosspointIn(List<Long> values) {
            addCriterion("assesspoint_bosspoint in", values, "assesspointBosspoint");
            return (Criteria) this;
        }

        public Criteria andAssesspointBosspointNotIn(List<Long> values) {
            addCriterion("assesspoint_bosspoint not in", values, "assesspointBosspoint");
            return (Criteria) this;
        }

        public Criteria andAssesspointBosspointBetween(Long value1, Long value2) {
            addCriterion("assesspoint_bosspoint between", value1, value2, "assesspointBosspoint");
            return (Criteria) this;
        }

        public Criteria andAssesspointBosspointNotBetween(Long value1, Long value2) {
            addCriterion("assesspoint_bosspoint not between", value1, value2, "assesspointBosspoint");
            return (Criteria) this;
        }

        public Criteria andAssesspointAssessIsNull() {
            addCriterion("assesspoint_assess is null");
            return (Criteria) this;
        }

        public Criteria andAssesspointAssessIsNotNull() {
            addCriterion("assesspoint_assess is not null");
            return (Criteria) this;
        }

        public Criteria andAssesspointAssessEqualTo(Long value) {
            addCriterion("assesspoint_assess =", value, "assesspointAssess");
            return (Criteria) this;
        }

        public Criteria andAssesspointAssessNotEqualTo(Long value) {
            addCriterion("assesspoint_assess <>", value, "assesspointAssess");
            return (Criteria) this;
        }

        public Criteria andAssesspointAssessGreaterThan(Long value) {
            addCriterion("assesspoint_assess >", value, "assesspointAssess");
            return (Criteria) this;
        }

        public Criteria andAssesspointAssessGreaterThanOrEqualTo(Long value) {
            addCriterion("assesspoint_assess >=", value, "assesspointAssess");
            return (Criteria) this;
        }

        public Criteria andAssesspointAssessLessThan(Long value) {
            addCriterion("assesspoint_assess <", value, "assesspointAssess");
            return (Criteria) this;
        }

        public Criteria andAssesspointAssessLessThanOrEqualTo(Long value) {
            addCriterion("assesspoint_assess <=", value, "assesspointAssess");
            return (Criteria) this;
        }

        public Criteria andAssesspointAssessIn(List<Long> values) {
            addCriterion("assesspoint_assess in", values, "assesspointAssess");
            return (Criteria) this;
        }

        public Criteria andAssesspointAssessNotIn(List<Long> values) {
            addCriterion("assesspoint_assess not in", values, "assesspointAssess");
            return (Criteria) this;
        }

        public Criteria andAssesspointAssessBetween(Long value1, Long value2) {
            addCriterion("assesspoint_assess between", value1, value2, "assesspointAssess");
            return (Criteria) this;
        }

        public Criteria andAssesspointAssessNotBetween(Long value1, Long value2) {
            addCriterion("assesspoint_assess not between", value1, value2, "assesspointAssess");
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