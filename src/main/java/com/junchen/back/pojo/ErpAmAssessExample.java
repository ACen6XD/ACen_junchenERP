package com.junchen.back.pojo;

import java.util.ArrayList;
import java.util.List;

public class ErpAmAssessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ErpAmAssessExample() {
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

        public Criteria andAssessIdIsNull() {
            addCriterion("assess_id is null");
            return (Criteria) this;
        }

        public Criteria andAssessIdIsNotNull() {
            addCriterion("assess_id is not null");
            return (Criteria) this;
        }

        public Criteria andAssessIdEqualTo(Long value) {
            addCriterion("assess_id =", value, "assessId");
            return (Criteria) this;
        }

        public Criteria andAssessIdNotEqualTo(Long value) {
            addCriterion("assess_id <>", value, "assessId");
            return (Criteria) this;
        }

        public Criteria andAssessIdGreaterThan(Long value) {
            addCriterion("assess_id >", value, "assessId");
            return (Criteria) this;
        }

        public Criteria andAssessIdGreaterThanOrEqualTo(Long value) {
            addCriterion("assess_id >=", value, "assessId");
            return (Criteria) this;
        }

        public Criteria andAssessIdLessThan(Long value) {
            addCriterion("assess_id <", value, "assessId");
            return (Criteria) this;
        }

        public Criteria andAssessIdLessThanOrEqualTo(Long value) {
            addCriterion("assess_id <=", value, "assessId");
            return (Criteria) this;
        }

        public Criteria andAssessIdIn(List<Long> values) {
            addCriterion("assess_id in", values, "assessId");
            return (Criteria) this;
        }

        public Criteria andAssessIdNotIn(List<Long> values) {
            addCriterion("assess_id not in", values, "assessId");
            return (Criteria) this;
        }

        public Criteria andAssessIdBetween(Long value1, Long value2) {
            addCriterion("assess_id between", value1, value2, "assessId");
            return (Criteria) this;
        }

        public Criteria andAssessIdNotBetween(Long value1, Long value2) {
            addCriterion("assess_id not between", value1, value2, "assessId");
            return (Criteria) this;
        }

        public Criteria andAssessMouldIsNull() {
            addCriterion("assess_mould is null");
            return (Criteria) this;
        }

        public Criteria andAssessMouldIsNotNull() {
            addCriterion("assess_mould is not null");
            return (Criteria) this;
        }

        public Criteria andAssessMouldEqualTo(Long value) {
            addCriterion("assess_mould =", value, "assessMould");
            return (Criteria) this;
        }

        public Criteria andAssessMouldNotEqualTo(Long value) {
            addCriterion("assess_mould <>", value, "assessMould");
            return (Criteria) this;
        }

        public Criteria andAssessMouldGreaterThan(Long value) {
            addCriterion("assess_mould >", value, "assessMould");
            return (Criteria) this;
        }

        public Criteria andAssessMouldGreaterThanOrEqualTo(Long value) {
            addCriterion("assess_mould >=", value, "assessMould");
            return (Criteria) this;
        }

        public Criteria andAssessMouldLessThan(Long value) {
            addCriterion("assess_mould <", value, "assessMould");
            return (Criteria) this;
        }

        public Criteria andAssessMouldLessThanOrEqualTo(Long value) {
            addCriterion("assess_mould <=", value, "assessMould");
            return (Criteria) this;
        }

        public Criteria andAssessMouldIn(List<Long> values) {
            addCriterion("assess_mould in", values, "assessMould");
            return (Criteria) this;
        }

        public Criteria andAssessMouldNotIn(List<Long> values) {
            addCriterion("assess_mould not in", values, "assessMould");
            return (Criteria) this;
        }

        public Criteria andAssessMouldBetween(Long value1, Long value2) {
            addCriterion("assess_mould between", value1, value2, "assessMould");
            return (Criteria) this;
        }

        public Criteria andAssessMouldNotBetween(Long value1, Long value2) {
            addCriterion("assess_mould not between", value1, value2, "assessMould");
            return (Criteria) this;
        }

        public Criteria andAssessNameIsNull() {
            addCriterion("assess_name is null");
            return (Criteria) this;
        }

        public Criteria andAssessNameIsNotNull() {
            addCriterion("assess_name is not null");
            return (Criteria) this;
        }

        public Criteria andAssessNameEqualTo(String value) {
            addCriterion("assess_name =", value, "assessName");
            return (Criteria) this;
        }

        public Criteria andAssessNameNotEqualTo(String value) {
            addCriterion("assess_name <>", value, "assessName");
            return (Criteria) this;
        }

        public Criteria andAssessNameGreaterThan(String value) {
            addCriterion("assess_name >", value, "assessName");
            return (Criteria) this;
        }

        public Criteria andAssessNameGreaterThanOrEqualTo(String value) {
            addCriterion("assess_name >=", value, "assessName");
            return (Criteria) this;
        }

        public Criteria andAssessNameLessThan(String value) {
            addCriterion("assess_name <", value, "assessName");
            return (Criteria) this;
        }

        public Criteria andAssessNameLessThanOrEqualTo(String value) {
            addCriterion("assess_name <=", value, "assessName");
            return (Criteria) this;
        }

        public Criteria andAssessNameLike(String value) {
            addCriterion("assess_name like", value, "assessName");
            return (Criteria) this;
        }

        public Criteria andAssessNameNotLike(String value) {
            addCriterion("assess_name not like", value, "assessName");
            return (Criteria) this;
        }

        public Criteria andAssessNameIn(List<String> values) {
            addCriterion("assess_name in", values, "assessName");
            return (Criteria) this;
        }

        public Criteria andAssessNameNotIn(List<String> values) {
            addCriterion("assess_name not in", values, "assessName");
            return (Criteria) this;
        }

        public Criteria andAssessNameBetween(String value1, String value2) {
            addCriterion("assess_name between", value1, value2, "assessName");
            return (Criteria) this;
        }

        public Criteria andAssessNameNotBetween(String value1, String value2) {
            addCriterion("assess_name not between", value1, value2, "assessName");
            return (Criteria) this;
        }

        public Criteria andAssessStaffIsNull() {
            addCriterion("assess_staff is null");
            return (Criteria) this;
        }

        public Criteria andAssessStaffIsNotNull() {
            addCriterion("assess_staff is not null");
            return (Criteria) this;
        }

        public Criteria andAssessStaffEqualTo(Long value) {
            addCriterion("assess_staff =", value, "assessStaff");
            return (Criteria) this;
        }

        public Criteria andAssessStaffNotEqualTo(Long value) {
            addCriterion("assess_staff <>", value, "assessStaff");
            return (Criteria) this;
        }

        public Criteria andAssessStaffGreaterThan(Long value) {
            addCriterion("assess_staff >", value, "assessStaff");
            return (Criteria) this;
        }

        public Criteria andAssessStaffGreaterThanOrEqualTo(Long value) {
            addCriterion("assess_staff >=", value, "assessStaff");
            return (Criteria) this;
        }

        public Criteria andAssessStaffLessThan(Long value) {
            addCriterion("assess_staff <", value, "assessStaff");
            return (Criteria) this;
        }

        public Criteria andAssessStaffLessThanOrEqualTo(Long value) {
            addCriterion("assess_staff <=", value, "assessStaff");
            return (Criteria) this;
        }

        public Criteria andAssessStaffIn(List<Long> values) {
            addCriterion("assess_staff in", values, "assessStaff");
            return (Criteria) this;
        }

        public Criteria andAssessStaffNotIn(List<Long> values) {
            addCriterion("assess_staff not in", values, "assessStaff");
            return (Criteria) this;
        }

        public Criteria andAssessStaffBetween(Long value1, Long value2) {
            addCriterion("assess_staff between", value1, value2, "assessStaff");
            return (Criteria) this;
        }

        public Criteria andAssessStaffNotBetween(Long value1, Long value2) {
            addCriterion("assess_staff not between", value1, value2, "assessStaff");
            return (Criteria) this;
        }

        public Criteria andAssessStaffdateIsNull() {
            addCriterion("assess_staffdate is null");
            return (Criteria) this;
        }

        public Criteria andAssessStaffdateIsNotNull() {
            addCriterion("assess_staffdate is not null");
            return (Criteria) this;
        }

        public Criteria andAssessStaffdateEqualTo(String value) {
            addCriterion("assess_staffdate =", value, "assessStaffdate");
            return (Criteria) this;
        }

        public Criteria andAssessStaffdateNotEqualTo(String value) {
            addCriterion("assess_staffdate <>", value, "assessStaffdate");
            return (Criteria) this;
        }

        public Criteria andAssessStaffdateGreaterThan(String value) {
            addCriterion("assess_staffdate >", value, "assessStaffdate");
            return (Criteria) this;
        }

        public Criteria andAssessStaffdateGreaterThanOrEqualTo(String value) {
            addCriterion("assess_staffdate >=", value, "assessStaffdate");
            return (Criteria) this;
        }

        public Criteria andAssessStaffdateLessThan(String value) {
            addCriterion("assess_staffdate <", value, "assessStaffdate");
            return (Criteria) this;
        }

        public Criteria andAssessStaffdateLessThanOrEqualTo(String value) {
            addCriterion("assess_staffdate <=", value, "assessStaffdate");
            return (Criteria) this;
        }

        public Criteria andAssessStaffdateLike(String value) {
            addCriterion("assess_staffdate like", value, "assessStaffdate");
            return (Criteria) this;
        }

        public Criteria andAssessStaffdateNotLike(String value) {
            addCriterion("assess_staffdate not like", value, "assessStaffdate");
            return (Criteria) this;
        }

        public Criteria andAssessStaffdateIn(List<String> values) {
            addCriterion("assess_staffdate in", values, "assessStaffdate");
            return (Criteria) this;
        }

        public Criteria andAssessStaffdateNotIn(List<String> values) {
            addCriterion("assess_staffdate not in", values, "assessStaffdate");
            return (Criteria) this;
        }

        public Criteria andAssessStaffdateBetween(String value1, String value2) {
            addCriterion("assess_staffdate between", value1, value2, "assessStaffdate");
            return (Criteria) this;
        }

        public Criteria andAssessStaffdateNotBetween(String value1, String value2) {
            addCriterion("assess_staffdate not between", value1, value2, "assessStaffdate");
            return (Criteria) this;
        }

        public Criteria andAssessBossIsNull() {
            addCriterion("assess_boss is null");
            return (Criteria) this;
        }

        public Criteria andAssessBossIsNotNull() {
            addCriterion("assess_boss is not null");
            return (Criteria) this;
        }

        public Criteria andAssessBossEqualTo(Long value) {
            addCriterion("assess_boss =", value, "assessBoss");
            return (Criteria) this;
        }

        public Criteria andAssessBossNotEqualTo(Long value) {
            addCriterion("assess_boss <>", value, "assessBoss");
            return (Criteria) this;
        }

        public Criteria andAssessBossGreaterThan(Long value) {
            addCriterion("assess_boss >", value, "assessBoss");
            return (Criteria) this;
        }

        public Criteria andAssessBossGreaterThanOrEqualTo(Long value) {
            addCriterion("assess_boss >=", value, "assessBoss");
            return (Criteria) this;
        }

        public Criteria andAssessBossLessThan(Long value) {
            addCriterion("assess_boss <", value, "assessBoss");
            return (Criteria) this;
        }

        public Criteria andAssessBossLessThanOrEqualTo(Long value) {
            addCriterion("assess_boss <=", value, "assessBoss");
            return (Criteria) this;
        }

        public Criteria andAssessBossIn(List<Long> values) {
            addCriterion("assess_boss in", values, "assessBoss");
            return (Criteria) this;
        }

        public Criteria andAssessBossNotIn(List<Long> values) {
            addCriterion("assess_boss not in", values, "assessBoss");
            return (Criteria) this;
        }

        public Criteria andAssessBossBetween(Long value1, Long value2) {
            addCriterion("assess_boss between", value1, value2, "assessBoss");
            return (Criteria) this;
        }

        public Criteria andAssessBossNotBetween(Long value1, Long value2) {
            addCriterion("assess_boss not between", value1, value2, "assessBoss");
            return (Criteria) this;
        }

        public Criteria andAssessBossdateIsNull() {
            addCriterion("assess_bossdate is null");
            return (Criteria) this;
        }

        public Criteria andAssessBossdateIsNotNull() {
            addCriterion("assess_bossdate is not null");
            return (Criteria) this;
        }

        public Criteria andAssessBossdateEqualTo(String value) {
            addCriterion("assess_bossdate =", value, "assessBossdate");
            return (Criteria) this;
        }

        public Criteria andAssessBossdateNotEqualTo(String value) {
            addCriterion("assess_bossdate <>", value, "assessBossdate");
            return (Criteria) this;
        }

        public Criteria andAssessBossdateGreaterThan(String value) {
            addCriterion("assess_bossdate >", value, "assessBossdate");
            return (Criteria) this;
        }

        public Criteria andAssessBossdateGreaterThanOrEqualTo(String value) {
            addCriterion("assess_bossdate >=", value, "assessBossdate");
            return (Criteria) this;
        }

        public Criteria andAssessBossdateLessThan(String value) {
            addCriterion("assess_bossdate <", value, "assessBossdate");
            return (Criteria) this;
        }

        public Criteria andAssessBossdateLessThanOrEqualTo(String value) {
            addCriterion("assess_bossdate <=", value, "assessBossdate");
            return (Criteria) this;
        }

        public Criteria andAssessBossdateLike(String value) {
            addCriterion("assess_bossdate like", value, "assessBossdate");
            return (Criteria) this;
        }

        public Criteria andAssessBossdateNotLike(String value) {
            addCriterion("assess_bossdate not like", value, "assessBossdate");
            return (Criteria) this;
        }

        public Criteria andAssessBossdateIn(List<String> values) {
            addCriterion("assess_bossdate in", values, "assessBossdate");
            return (Criteria) this;
        }

        public Criteria andAssessBossdateNotIn(List<String> values) {
            addCriterion("assess_bossdate not in", values, "assessBossdate");
            return (Criteria) this;
        }

        public Criteria andAssessBossdateBetween(String value1, String value2) {
            addCriterion("assess_bossdate between", value1, value2, "assessBossdate");
            return (Criteria) this;
        }

        public Criteria andAssessBossdateNotBetween(String value1, String value2) {
            addCriterion("assess_bossdate not between", value1, value2, "assessBossdate");
            return (Criteria) this;
        }

        public Criteria andAssessStaffpointsIsNull() {
            addCriterion("assess_staffpoints is null");
            return (Criteria) this;
        }

        public Criteria andAssessStaffpointsIsNotNull() {
            addCriterion("assess_staffpoints is not null");
            return (Criteria) this;
        }

        public Criteria andAssessStaffpointsEqualTo(Long value) {
            addCriterion("assess_staffpoints =", value, "assessStaffpoints");
            return (Criteria) this;
        }

        public Criteria andAssessStaffpointsNotEqualTo(Long value) {
            addCriterion("assess_staffpoints <>", value, "assessStaffpoints");
            return (Criteria) this;
        }

        public Criteria andAssessStaffpointsGreaterThan(Long value) {
            addCriterion("assess_staffpoints >", value, "assessStaffpoints");
            return (Criteria) this;
        }

        public Criteria andAssessStaffpointsGreaterThanOrEqualTo(Long value) {
            addCriterion("assess_staffpoints >=", value, "assessStaffpoints");
            return (Criteria) this;
        }

        public Criteria andAssessStaffpointsLessThan(Long value) {
            addCriterion("assess_staffpoints <", value, "assessStaffpoints");
            return (Criteria) this;
        }

        public Criteria andAssessStaffpointsLessThanOrEqualTo(Long value) {
            addCriterion("assess_staffpoints <=", value, "assessStaffpoints");
            return (Criteria) this;
        }

        public Criteria andAssessStaffpointsIn(List<Long> values) {
            addCriterion("assess_staffpoints in", values, "assessStaffpoints");
            return (Criteria) this;
        }

        public Criteria andAssessStaffpointsNotIn(List<Long> values) {
            addCriterion("assess_staffpoints not in", values, "assessStaffpoints");
            return (Criteria) this;
        }

        public Criteria andAssessStaffpointsBetween(Long value1, Long value2) {
            addCriterion("assess_staffpoints between", value1, value2, "assessStaffpoints");
            return (Criteria) this;
        }

        public Criteria andAssessStaffpointsNotBetween(Long value1, Long value2) {
            addCriterion("assess_staffpoints not between", value1, value2, "assessStaffpoints");
            return (Criteria) this;
        }

        public Criteria andAssessBosspointsIsNull() {
            addCriterion("assess_bosspoints is null");
            return (Criteria) this;
        }

        public Criteria andAssessBosspointsIsNotNull() {
            addCriterion("assess_bosspoints is not null");
            return (Criteria) this;
        }

        public Criteria andAssessBosspointsEqualTo(Long value) {
            addCriterion("assess_bosspoints =", value, "assessBosspoints");
            return (Criteria) this;
        }

        public Criteria andAssessBosspointsNotEqualTo(Long value) {
            addCriterion("assess_bosspoints <>", value, "assessBosspoints");
            return (Criteria) this;
        }

        public Criteria andAssessBosspointsGreaterThan(Long value) {
            addCriterion("assess_bosspoints >", value, "assessBosspoints");
            return (Criteria) this;
        }

        public Criteria andAssessBosspointsGreaterThanOrEqualTo(Long value) {
            addCriterion("assess_bosspoints >=", value, "assessBosspoints");
            return (Criteria) this;
        }

        public Criteria andAssessBosspointsLessThan(Long value) {
            addCriterion("assess_bosspoints <", value, "assessBosspoints");
            return (Criteria) this;
        }

        public Criteria andAssessBosspointsLessThanOrEqualTo(Long value) {
            addCriterion("assess_bosspoints <=", value, "assessBosspoints");
            return (Criteria) this;
        }

        public Criteria andAssessBosspointsIn(List<Long> values) {
            addCriterion("assess_bosspoints in", values, "assessBosspoints");
            return (Criteria) this;
        }

        public Criteria andAssessBosspointsNotIn(List<Long> values) {
            addCriterion("assess_bosspoints not in", values, "assessBosspoints");
            return (Criteria) this;
        }

        public Criteria andAssessBosspointsBetween(Long value1, Long value2) {
            addCriterion("assess_bosspoints between", value1, value2, "assessBosspoints");
            return (Criteria) this;
        }

        public Criteria andAssessBosspointsNotBetween(Long value1, Long value2) {
            addCriterion("assess_bosspoints not between", value1, value2, "assessBosspoints");
            return (Criteria) this;
        }

        public Criteria andAssessEnableIsNull() {
            addCriterion("assess_enable is null");
            return (Criteria) this;
        }

        public Criteria andAssessEnableIsNotNull() {
            addCriterion("assess_enable is not null");
            return (Criteria) this;
        }

        public Criteria andAssessEnableEqualTo(String value) {
            addCriterion("assess_enable =", value, "assessEnable");
            return (Criteria) this;
        }

        public Criteria andAssessEnableNotEqualTo(String value) {
            addCriterion("assess_enable <>", value, "assessEnable");
            return (Criteria) this;
        }

        public Criteria andAssessEnableGreaterThan(String value) {
            addCriterion("assess_enable >", value, "assessEnable");
            return (Criteria) this;
        }

        public Criteria andAssessEnableGreaterThanOrEqualTo(String value) {
            addCriterion("assess_enable >=", value, "assessEnable");
            return (Criteria) this;
        }

        public Criteria andAssessEnableLessThan(String value) {
            addCriterion("assess_enable <", value, "assessEnable");
            return (Criteria) this;
        }

        public Criteria andAssessEnableLessThanOrEqualTo(String value) {
            addCriterion("assess_enable <=", value, "assessEnable");
            return (Criteria) this;
        }

        public Criteria andAssessEnableLike(String value) {
            addCriterion("assess_enable like", value, "assessEnable");
            return (Criteria) this;
        }

        public Criteria andAssessEnableNotLike(String value) {
            addCriterion("assess_enable not like", value, "assessEnable");
            return (Criteria) this;
        }

        public Criteria andAssessEnableIn(List<String> values) {
            addCriterion("assess_enable in", values, "assessEnable");
            return (Criteria) this;
        }

        public Criteria andAssessEnableNotIn(List<String> values) {
            addCriterion("assess_enable not in", values, "assessEnable");
            return (Criteria) this;
        }

        public Criteria andAssessEnableBetween(String value1, String value2) {
            addCriterion("assess_enable between", value1, value2, "assessEnable");
            return (Criteria) this;
        }

        public Criteria andAssessEnableNotBetween(String value1, String value2) {
            addCriterion("assess_enable not between", value1, value2, "assessEnable");
            return (Criteria) this;
        }

        public Criteria andAssessSummaryIsNull() {
            addCriterion("assess_summary is null");
            return (Criteria) this;
        }

        public Criteria andAssessSummaryIsNotNull() {
            addCriterion("assess_summary is not null");
            return (Criteria) this;
        }

        public Criteria andAssessSummaryEqualTo(String value) {
            addCriterion("assess_summary =", value, "assessSummary");
            return (Criteria) this;
        }

        public Criteria andAssessSummaryNotEqualTo(String value) {
            addCriterion("assess_summary <>", value, "assessSummary");
            return (Criteria) this;
        }

        public Criteria andAssessSummaryGreaterThan(String value) {
            addCriterion("assess_summary >", value, "assessSummary");
            return (Criteria) this;
        }

        public Criteria andAssessSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("assess_summary >=", value, "assessSummary");
            return (Criteria) this;
        }

        public Criteria andAssessSummaryLessThan(String value) {
            addCriterion("assess_summary <", value, "assessSummary");
            return (Criteria) this;
        }

        public Criteria andAssessSummaryLessThanOrEqualTo(String value) {
            addCriterion("assess_summary <=", value, "assessSummary");
            return (Criteria) this;
        }

        public Criteria andAssessSummaryLike(String value) {
            addCriterion("assess_summary like", value, "assessSummary");
            return (Criteria) this;
        }

        public Criteria andAssessSummaryNotLike(String value) {
            addCriterion("assess_summary not like", value, "assessSummary");
            return (Criteria) this;
        }

        public Criteria andAssessSummaryIn(List<String> values) {
            addCriterion("assess_summary in", values, "assessSummary");
            return (Criteria) this;
        }

        public Criteria andAssessSummaryNotIn(List<String> values) {
            addCriterion("assess_summary not in", values, "assessSummary");
            return (Criteria) this;
        }

        public Criteria andAssessSummaryBetween(String value1, String value2) {
            addCriterion("assess_summary between", value1, value2, "assessSummary");
            return (Criteria) this;
        }

        public Criteria andAssessSummaryNotBetween(String value1, String value2) {
            addCriterion("assess_summary not between", value1, value2, "assessSummary");
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