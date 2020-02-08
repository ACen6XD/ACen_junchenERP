package com.junchen.back.pojo;

import java.util.ArrayList;
import java.util.List;

public class ErpFmSalaryruleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ErpFmSalaryruleExample() {
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

        public Criteria andSalaryruleIdIsNull() {
            addCriterion("salaryrule_id is null");
            return (Criteria) this;
        }

        public Criteria andSalaryruleIdIsNotNull() {
            addCriterion("salaryrule_id is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryruleIdEqualTo(Long value) {
            addCriterion("salaryrule_id =", value, "salaryruleId");
            return (Criteria) this;
        }

        public Criteria andSalaryruleIdNotEqualTo(Long value) {
            addCriterion("salaryrule_id <>", value, "salaryruleId");
            return (Criteria) this;
        }

        public Criteria andSalaryruleIdGreaterThan(Long value) {
            addCriterion("salaryrule_id >", value, "salaryruleId");
            return (Criteria) this;
        }

        public Criteria andSalaryruleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("salaryrule_id >=", value, "salaryruleId");
            return (Criteria) this;
        }

        public Criteria andSalaryruleIdLessThan(Long value) {
            addCriterion("salaryrule_id <", value, "salaryruleId");
            return (Criteria) this;
        }

        public Criteria andSalaryruleIdLessThanOrEqualTo(Long value) {
            addCriterion("salaryrule_id <=", value, "salaryruleId");
            return (Criteria) this;
        }

        public Criteria andSalaryruleIdIn(List<Long> values) {
            addCriterion("salaryrule_id in", values, "salaryruleId");
            return (Criteria) this;
        }

        public Criteria andSalaryruleIdNotIn(List<Long> values) {
            addCriterion("salaryrule_id not in", values, "salaryruleId");
            return (Criteria) this;
        }

        public Criteria andSalaryruleIdBetween(Long value1, Long value2) {
            addCriterion("salaryrule_id between", value1, value2, "salaryruleId");
            return (Criteria) this;
        }

        public Criteria andSalaryruleIdNotBetween(Long value1, Long value2) {
            addCriterion("salaryrule_id not between", value1, value2, "salaryruleId");
            return (Criteria) this;
        }

        public Criteria andSalaryruleStaffnameIsNull() {
            addCriterion("salaryrule_staffname is null");
            return (Criteria) this;
        }

        public Criteria andSalaryruleStaffnameIsNotNull() {
            addCriterion("salaryrule_staffname is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryruleStaffnameEqualTo(String value) {
            addCriterion("salaryrule_staffname =", value, "salaryruleStaffname");
            return (Criteria) this;
        }

        public Criteria andSalaryruleStaffnameNotEqualTo(String value) {
            addCriterion("salaryrule_staffname <>", value, "salaryruleStaffname");
            return (Criteria) this;
        }

        public Criteria andSalaryruleStaffnameGreaterThan(String value) {
            addCriterion("salaryrule_staffname >", value, "salaryruleStaffname");
            return (Criteria) this;
        }

        public Criteria andSalaryruleStaffnameGreaterThanOrEqualTo(String value) {
            addCriterion("salaryrule_staffname >=", value, "salaryruleStaffname");
            return (Criteria) this;
        }

        public Criteria andSalaryruleStaffnameLessThan(String value) {
            addCriterion("salaryrule_staffname <", value, "salaryruleStaffname");
            return (Criteria) this;
        }

        public Criteria andSalaryruleStaffnameLessThanOrEqualTo(String value) {
            addCriterion("salaryrule_staffname <=", value, "salaryruleStaffname");
            return (Criteria) this;
        }

        public Criteria andSalaryruleStaffnameLike(String value) {
            addCriterion("salaryrule_staffname like", value, "salaryruleStaffname");
            return (Criteria) this;
        }

        public Criteria andSalaryruleStaffnameNotLike(String value) {
            addCriterion("salaryrule_staffname not like", value, "salaryruleStaffname");
            return (Criteria) this;
        }

        public Criteria andSalaryruleStaffnameIn(List<String> values) {
            addCriterion("salaryrule_staffname in", values, "salaryruleStaffname");
            return (Criteria) this;
        }

        public Criteria andSalaryruleStaffnameNotIn(List<String> values) {
            addCriterion("salaryrule_staffname not in", values, "salaryruleStaffname");
            return (Criteria) this;
        }

        public Criteria andSalaryruleStaffnameBetween(String value1, String value2) {
            addCriterion("salaryrule_staffname between", value1, value2, "salaryruleStaffname");
            return (Criteria) this;
        }

        public Criteria andSalaryruleStaffnameNotBetween(String value1, String value2) {
            addCriterion("salaryrule_staffname not between", value1, value2, "salaryruleStaffname");
            return (Criteria) this;
        }

        public Criteria andSalaryruleStaffdepIsNull() {
            addCriterion("salaryrule_staffdep is null");
            return (Criteria) this;
        }

        public Criteria andSalaryruleStaffdepIsNotNull() {
            addCriterion("salaryrule_staffdep is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryruleStaffdepEqualTo(String value) {
            addCriterion("salaryrule_staffdep =", value, "salaryruleStaffdep");
            return (Criteria) this;
        }

        public Criteria andSalaryruleStaffdepNotEqualTo(String value) {
            addCriterion("salaryrule_staffdep <>", value, "salaryruleStaffdep");
            return (Criteria) this;
        }

        public Criteria andSalaryruleStaffdepGreaterThan(String value) {
            addCriterion("salaryrule_staffdep >", value, "salaryruleStaffdep");
            return (Criteria) this;
        }

        public Criteria andSalaryruleStaffdepGreaterThanOrEqualTo(String value) {
            addCriterion("salaryrule_staffdep >=", value, "salaryruleStaffdep");
            return (Criteria) this;
        }

        public Criteria andSalaryruleStaffdepLessThan(String value) {
            addCriterion("salaryrule_staffdep <", value, "salaryruleStaffdep");
            return (Criteria) this;
        }

        public Criteria andSalaryruleStaffdepLessThanOrEqualTo(String value) {
            addCriterion("salaryrule_staffdep <=", value, "salaryruleStaffdep");
            return (Criteria) this;
        }

        public Criteria andSalaryruleStaffdepLike(String value) {
            addCriterion("salaryrule_staffdep like", value, "salaryruleStaffdep");
            return (Criteria) this;
        }

        public Criteria andSalaryruleStaffdepNotLike(String value) {
            addCriterion("salaryrule_staffdep not like", value, "salaryruleStaffdep");
            return (Criteria) this;
        }

        public Criteria andSalaryruleStaffdepIn(List<String> values) {
            addCriterion("salaryrule_staffdep in", values, "salaryruleStaffdep");
            return (Criteria) this;
        }

        public Criteria andSalaryruleStaffdepNotIn(List<String> values) {
            addCriterion("salaryrule_staffdep not in", values, "salaryruleStaffdep");
            return (Criteria) this;
        }

        public Criteria andSalaryruleStaffdepBetween(String value1, String value2) {
            addCriterion("salaryrule_staffdep between", value1, value2, "salaryruleStaffdep");
            return (Criteria) this;
        }

        public Criteria andSalaryruleStaffdepNotBetween(String value1, String value2) {
            addCriterion("salaryrule_staffdep not between", value1, value2, "salaryruleStaffdep");
            return (Criteria) this;
        }

        public Criteria andSalaryruleSalaryIsNull() {
            addCriterion("salaryrule_salary is null");
            return (Criteria) this;
        }

        public Criteria andSalaryruleSalaryIsNotNull() {
            addCriterion("salaryrule_salary is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryruleSalaryEqualTo(Long value) {
            addCriterion("salaryrule_salary =", value, "salaryruleSalary");
            return (Criteria) this;
        }

        public Criteria andSalaryruleSalaryNotEqualTo(Long value) {
            addCriterion("salaryrule_salary <>", value, "salaryruleSalary");
            return (Criteria) this;
        }

        public Criteria andSalaryruleSalaryGreaterThan(Long value) {
            addCriterion("salaryrule_salary >", value, "salaryruleSalary");
            return (Criteria) this;
        }

        public Criteria andSalaryruleSalaryGreaterThanOrEqualTo(Long value) {
            addCriterion("salaryrule_salary >=", value, "salaryruleSalary");
            return (Criteria) this;
        }

        public Criteria andSalaryruleSalaryLessThan(Long value) {
            addCriterion("salaryrule_salary <", value, "salaryruleSalary");
            return (Criteria) this;
        }

        public Criteria andSalaryruleSalaryLessThanOrEqualTo(Long value) {
            addCriterion("salaryrule_salary <=", value, "salaryruleSalary");
            return (Criteria) this;
        }

        public Criteria andSalaryruleSalaryIn(List<Long> values) {
            addCriterion("salaryrule_salary in", values, "salaryruleSalary");
            return (Criteria) this;
        }

        public Criteria andSalaryruleSalaryNotIn(List<Long> values) {
            addCriterion("salaryrule_salary not in", values, "salaryruleSalary");
            return (Criteria) this;
        }

        public Criteria andSalaryruleSalaryBetween(Long value1, Long value2) {
            addCriterion("salaryrule_salary between", value1, value2, "salaryruleSalary");
            return (Criteria) this;
        }

        public Criteria andSalaryruleSalaryNotBetween(Long value1, Long value2) {
            addCriterion("salaryrule_salary not between", value1, value2, "salaryruleSalary");
            return (Criteria) this;
        }

        public Criteria andSalaryruleBaseIsNull() {
            addCriterion("salaryrule_base is null");
            return (Criteria) this;
        }

        public Criteria andSalaryruleBaseIsNotNull() {
            addCriterion("salaryrule_base is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryruleBaseEqualTo(Long value) {
            addCriterion("salaryrule_base =", value, "salaryruleBase");
            return (Criteria) this;
        }

        public Criteria andSalaryruleBaseNotEqualTo(Long value) {
            addCriterion("salaryrule_base <>", value, "salaryruleBase");
            return (Criteria) this;
        }

        public Criteria andSalaryruleBaseGreaterThan(Long value) {
            addCriterion("salaryrule_base >", value, "salaryruleBase");
            return (Criteria) this;
        }

        public Criteria andSalaryruleBaseGreaterThanOrEqualTo(Long value) {
            addCriterion("salaryrule_base >=", value, "salaryruleBase");
            return (Criteria) this;
        }

        public Criteria andSalaryruleBaseLessThan(Long value) {
            addCriterion("salaryrule_base <", value, "salaryruleBase");
            return (Criteria) this;
        }

        public Criteria andSalaryruleBaseLessThanOrEqualTo(Long value) {
            addCriterion("salaryrule_base <=", value, "salaryruleBase");
            return (Criteria) this;
        }

        public Criteria andSalaryruleBaseIn(List<Long> values) {
            addCriterion("salaryrule_base in", values, "salaryruleBase");
            return (Criteria) this;
        }

        public Criteria andSalaryruleBaseNotIn(List<Long> values) {
            addCriterion("salaryrule_base not in", values, "salaryruleBase");
            return (Criteria) this;
        }

        public Criteria andSalaryruleBaseBetween(Long value1, Long value2) {
            addCriterion("salaryrule_base between", value1, value2, "salaryruleBase");
            return (Criteria) this;
        }

        public Criteria andSalaryruleBaseNotBetween(Long value1, Long value2) {
            addCriterion("salaryrule_base not between", value1, value2, "salaryruleBase");
            return (Criteria) this;
        }

        public Criteria andSalaryruleSocialIsNull() {
            addCriterion("\"salaryrule_ social\" is null");
            return (Criteria) this;
        }

        public Criteria andSalaryruleSocialIsNotNull() {
            addCriterion("\"salaryrule_ social\" is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryruleSocialEqualTo(Long value) {
            addCriterion("\"salaryrule_ social\" =", value, "salaryruleSocial");
            return (Criteria) this;
        }

        public Criteria andSalaryruleSocialNotEqualTo(Long value) {
            addCriterion("\"salaryrule_ social\" <>", value, "salaryruleSocial");
            return (Criteria) this;
        }

        public Criteria andSalaryruleSocialGreaterThan(Long value) {
            addCriterion("\"salaryrule_ social\" >", value, "salaryruleSocial");
            return (Criteria) this;
        }

        public Criteria andSalaryruleSocialGreaterThanOrEqualTo(Long value) {
            addCriterion("\"salaryrule_ social\" >=", value, "salaryruleSocial");
            return (Criteria) this;
        }

        public Criteria andSalaryruleSocialLessThan(Long value) {
            addCriterion("\"salaryrule_ social\" <", value, "salaryruleSocial");
            return (Criteria) this;
        }

        public Criteria andSalaryruleSocialLessThanOrEqualTo(Long value) {
            addCriterion("\"salaryrule_ social\" <=", value, "salaryruleSocial");
            return (Criteria) this;
        }

        public Criteria andSalaryruleSocialIn(List<Long> values) {
            addCriterion("\"salaryrule_ social\" in", values, "salaryruleSocial");
            return (Criteria) this;
        }

        public Criteria andSalaryruleSocialNotIn(List<Long> values) {
            addCriterion("\"salaryrule_ social\" not in", values, "salaryruleSocial");
            return (Criteria) this;
        }

        public Criteria andSalaryruleSocialBetween(Long value1, Long value2) {
            addCriterion("\"salaryrule_ social\" between", value1, value2, "salaryruleSocial");
            return (Criteria) this;
        }

        public Criteria andSalaryruleSocialNotBetween(Long value1, Long value2) {
            addCriterion("\"salaryrule_ social\" not between", value1, value2, "salaryruleSocial");
            return (Criteria) this;
        }

        public Criteria andSalaryruleOldIsNull() {
            addCriterion("\"salaryrule_ old\" is null");
            return (Criteria) this;
        }

        public Criteria andSalaryruleOldIsNotNull() {
            addCriterion("\"salaryrule_ old\" is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryruleOldEqualTo(Long value) {
            addCriterion("\"salaryrule_ old\" =", value, "salaryruleOld");
            return (Criteria) this;
        }

        public Criteria andSalaryruleOldNotEqualTo(Long value) {
            addCriterion("\"salaryrule_ old\" <>", value, "salaryruleOld");
            return (Criteria) this;
        }

        public Criteria andSalaryruleOldGreaterThan(Long value) {
            addCriterion("\"salaryrule_ old\" >", value, "salaryruleOld");
            return (Criteria) this;
        }

        public Criteria andSalaryruleOldGreaterThanOrEqualTo(Long value) {
            addCriterion("\"salaryrule_ old\" >=", value, "salaryruleOld");
            return (Criteria) this;
        }

        public Criteria andSalaryruleOldLessThan(Long value) {
            addCriterion("\"salaryrule_ old\" <", value, "salaryruleOld");
            return (Criteria) this;
        }

        public Criteria andSalaryruleOldLessThanOrEqualTo(Long value) {
            addCriterion("\"salaryrule_ old\" <=", value, "salaryruleOld");
            return (Criteria) this;
        }

        public Criteria andSalaryruleOldIn(List<Long> values) {
            addCriterion("\"salaryrule_ old\" in", values, "salaryruleOld");
            return (Criteria) this;
        }

        public Criteria andSalaryruleOldNotIn(List<Long> values) {
            addCriterion("\"salaryrule_ old\" not in", values, "salaryruleOld");
            return (Criteria) this;
        }

        public Criteria andSalaryruleOldBetween(Long value1, Long value2) {
            addCriterion("\"salaryrule_ old\" between", value1, value2, "salaryruleOld");
            return (Criteria) this;
        }

        public Criteria andSalaryruleOldNotBetween(Long value1, Long value2) {
            addCriterion("\"salaryrule_ old\" not between", value1, value2, "salaryruleOld");
            return (Criteria) this;
        }

        public Criteria andSalaryruleLoseIsNull() {
            addCriterion("\"salaryrule_ lose\" is null");
            return (Criteria) this;
        }

        public Criteria andSalaryruleLoseIsNotNull() {
            addCriterion("\"salaryrule_ lose\" is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryruleLoseEqualTo(Long value) {
            addCriterion("\"salaryrule_ lose\" =", value, "salaryruleLose");
            return (Criteria) this;
        }

        public Criteria andSalaryruleLoseNotEqualTo(Long value) {
            addCriterion("\"salaryrule_ lose\" <>", value, "salaryruleLose");
            return (Criteria) this;
        }

        public Criteria andSalaryruleLoseGreaterThan(Long value) {
            addCriterion("\"salaryrule_ lose\" >", value, "salaryruleLose");
            return (Criteria) this;
        }

        public Criteria andSalaryruleLoseGreaterThanOrEqualTo(Long value) {
            addCriterion("\"salaryrule_ lose\" >=", value, "salaryruleLose");
            return (Criteria) this;
        }

        public Criteria andSalaryruleLoseLessThan(Long value) {
            addCriterion("\"salaryrule_ lose\" <", value, "salaryruleLose");
            return (Criteria) this;
        }

        public Criteria andSalaryruleLoseLessThanOrEqualTo(Long value) {
            addCriterion("\"salaryrule_ lose\" <=", value, "salaryruleLose");
            return (Criteria) this;
        }

        public Criteria andSalaryruleLoseIn(List<Long> values) {
            addCriterion("\"salaryrule_ lose\" in", values, "salaryruleLose");
            return (Criteria) this;
        }

        public Criteria andSalaryruleLoseNotIn(List<Long> values) {
            addCriterion("\"salaryrule_ lose\" not in", values, "salaryruleLose");
            return (Criteria) this;
        }

        public Criteria andSalaryruleLoseBetween(Long value1, Long value2) {
            addCriterion("\"salaryrule_ lose\" between", value1, value2, "salaryruleLose");
            return (Criteria) this;
        }

        public Criteria andSalaryruleLoseNotBetween(Long value1, Long value2) {
            addCriterion("\"salaryrule_ lose\" not between", value1, value2, "salaryruleLose");
            return (Criteria) this;
        }

        public Criteria andSalaryruleMedicalIsNull() {
            addCriterion("\"salaryrule_ medical\" is null");
            return (Criteria) this;
        }

        public Criteria andSalaryruleMedicalIsNotNull() {
            addCriterion("\"salaryrule_ medical\" is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryruleMedicalEqualTo(Long value) {
            addCriterion("\"salaryrule_ medical\" =", value, "salaryruleMedical");
            return (Criteria) this;
        }

        public Criteria andSalaryruleMedicalNotEqualTo(Long value) {
            addCriterion("\"salaryrule_ medical\" <>", value, "salaryruleMedical");
            return (Criteria) this;
        }

        public Criteria andSalaryruleMedicalGreaterThan(Long value) {
            addCriterion("\"salaryrule_ medical\" >", value, "salaryruleMedical");
            return (Criteria) this;
        }

        public Criteria andSalaryruleMedicalGreaterThanOrEqualTo(Long value) {
            addCriterion("\"salaryrule_ medical\" >=", value, "salaryruleMedical");
            return (Criteria) this;
        }

        public Criteria andSalaryruleMedicalLessThan(Long value) {
            addCriterion("\"salaryrule_ medical\" <", value, "salaryruleMedical");
            return (Criteria) this;
        }

        public Criteria andSalaryruleMedicalLessThanOrEqualTo(Long value) {
            addCriterion("\"salaryrule_ medical\" <=", value, "salaryruleMedical");
            return (Criteria) this;
        }

        public Criteria andSalaryruleMedicalIn(List<Long> values) {
            addCriterion("\"salaryrule_ medical\" in", values, "salaryruleMedical");
            return (Criteria) this;
        }

        public Criteria andSalaryruleMedicalNotIn(List<Long> values) {
            addCriterion("\"salaryrule_ medical\" not in", values, "salaryruleMedical");
            return (Criteria) this;
        }

        public Criteria andSalaryruleMedicalBetween(Long value1, Long value2) {
            addCriterion("\"salaryrule_ medical\" between", value1, value2, "salaryruleMedical");
            return (Criteria) this;
        }

        public Criteria andSalaryruleMedicalNotBetween(Long value1, Long value2) {
            addCriterion("\"salaryrule_ medical\" not between", value1, value2, "salaryruleMedical");
            return (Criteria) this;
        }

        public Criteria andSalaryruleInjureIsNull() {
            addCriterion("\"salaryrule_ injure\" is null");
            return (Criteria) this;
        }

        public Criteria andSalaryruleInjureIsNotNull() {
            addCriterion("\"salaryrule_ injure\" is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryruleInjureEqualTo(Long value) {
            addCriterion("\"salaryrule_ injure\" =", value, "salaryruleInjure");
            return (Criteria) this;
        }

        public Criteria andSalaryruleInjureNotEqualTo(Long value) {
            addCriterion("\"salaryrule_ injure\" <>", value, "salaryruleInjure");
            return (Criteria) this;
        }

        public Criteria andSalaryruleInjureGreaterThan(Long value) {
            addCriterion("\"salaryrule_ injure\" >", value, "salaryruleInjure");
            return (Criteria) this;
        }

        public Criteria andSalaryruleInjureGreaterThanOrEqualTo(Long value) {
            addCriterion("\"salaryrule_ injure\" >=", value, "salaryruleInjure");
            return (Criteria) this;
        }

        public Criteria andSalaryruleInjureLessThan(Long value) {
            addCriterion("\"salaryrule_ injure\" <", value, "salaryruleInjure");
            return (Criteria) this;
        }

        public Criteria andSalaryruleInjureLessThanOrEqualTo(Long value) {
            addCriterion("\"salaryrule_ injure\" <=", value, "salaryruleInjure");
            return (Criteria) this;
        }

        public Criteria andSalaryruleInjureIn(List<Long> values) {
            addCriterion("\"salaryrule_ injure\" in", values, "salaryruleInjure");
            return (Criteria) this;
        }

        public Criteria andSalaryruleInjureNotIn(List<Long> values) {
            addCriterion("\"salaryrule_ injure\" not in", values, "salaryruleInjure");
            return (Criteria) this;
        }

        public Criteria andSalaryruleInjureBetween(Long value1, Long value2) {
            addCriterion("\"salaryrule_ injure\" between", value1, value2, "salaryruleInjure");
            return (Criteria) this;
        }

        public Criteria andSalaryruleInjureNotBetween(Long value1, Long value2) {
            addCriterion("\"salaryrule_ injure\" not between", value1, value2, "salaryruleInjure");
            return (Criteria) this;
        }

        public Criteria andSalaryruleBabyIsNull() {
            addCriterion("\"salaryrule_ baby\" is null");
            return (Criteria) this;
        }

        public Criteria andSalaryruleBabyIsNotNull() {
            addCriterion("\"salaryrule_ baby\" is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryruleBabyEqualTo(Long value) {
            addCriterion("\"salaryrule_ baby\" =", value, "salaryruleBaby");
            return (Criteria) this;
        }

        public Criteria andSalaryruleBabyNotEqualTo(Long value) {
            addCriterion("\"salaryrule_ baby\" <>", value, "salaryruleBaby");
            return (Criteria) this;
        }

        public Criteria andSalaryruleBabyGreaterThan(Long value) {
            addCriterion("\"salaryrule_ baby\" >", value, "salaryruleBaby");
            return (Criteria) this;
        }

        public Criteria andSalaryruleBabyGreaterThanOrEqualTo(Long value) {
            addCriterion("\"salaryrule_ baby\" >=", value, "salaryruleBaby");
            return (Criteria) this;
        }

        public Criteria andSalaryruleBabyLessThan(Long value) {
            addCriterion("\"salaryrule_ baby\" <", value, "salaryruleBaby");
            return (Criteria) this;
        }

        public Criteria andSalaryruleBabyLessThanOrEqualTo(Long value) {
            addCriterion("\"salaryrule_ baby\" <=", value, "salaryruleBaby");
            return (Criteria) this;
        }

        public Criteria andSalaryruleBabyIn(List<Long> values) {
            addCriterion("\"salaryrule_ baby\" in", values, "salaryruleBaby");
            return (Criteria) this;
        }

        public Criteria andSalaryruleBabyNotIn(List<Long> values) {
            addCriterion("\"salaryrule_ baby\" not in", values, "salaryruleBaby");
            return (Criteria) this;
        }

        public Criteria andSalaryruleBabyBetween(Long value1, Long value2) {
            addCriterion("\"salaryrule_ baby\" between", value1, value2, "salaryruleBaby");
            return (Criteria) this;
        }

        public Criteria andSalaryruleBabyNotBetween(Long value1, Long value2) {
            addCriterion("\"salaryrule_ baby\" not between", value1, value2, "salaryruleBaby");
            return (Criteria) this;
        }

        public Criteria andSalaryruleFundIsNull() {
            addCriterion("\"salaryrule_ fund\" is null");
            return (Criteria) this;
        }

        public Criteria andSalaryruleFundIsNotNull() {
            addCriterion("\"salaryrule_ fund\" is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryruleFundEqualTo(Long value) {
            addCriterion("\"salaryrule_ fund\" =", value, "salaryruleFund");
            return (Criteria) this;
        }

        public Criteria andSalaryruleFundNotEqualTo(Long value) {
            addCriterion("\"salaryrule_ fund\" <>", value, "salaryruleFund");
            return (Criteria) this;
        }

        public Criteria andSalaryruleFundGreaterThan(Long value) {
            addCriterion("\"salaryrule_ fund\" >", value, "salaryruleFund");
            return (Criteria) this;
        }

        public Criteria andSalaryruleFundGreaterThanOrEqualTo(Long value) {
            addCriterion("\"salaryrule_ fund\" >=", value, "salaryruleFund");
            return (Criteria) this;
        }

        public Criteria andSalaryruleFundLessThan(Long value) {
            addCriterion("\"salaryrule_ fund\" <", value, "salaryruleFund");
            return (Criteria) this;
        }

        public Criteria andSalaryruleFundLessThanOrEqualTo(Long value) {
            addCriterion("\"salaryrule_ fund\" <=", value, "salaryruleFund");
            return (Criteria) this;
        }

        public Criteria andSalaryruleFundIn(List<Long> values) {
            addCriterion("\"salaryrule_ fund\" in", values, "salaryruleFund");
            return (Criteria) this;
        }

        public Criteria andSalaryruleFundNotIn(List<Long> values) {
            addCriterion("\"salaryrule_ fund\" not in", values, "salaryruleFund");
            return (Criteria) this;
        }

        public Criteria andSalaryruleFundBetween(Long value1, Long value2) {
            addCriterion("\"salaryrule_ fund\" between", value1, value2, "salaryruleFund");
            return (Criteria) this;
        }

        public Criteria andSalaryruleFundNotBetween(Long value1, Long value2) {
            addCriterion("\"salaryrule_ fund\" not between", value1, value2, "salaryruleFund");
            return (Criteria) this;
        }

        public Criteria andSalaryruleJobIsNull() {
            addCriterion("\"salaryrule_ job\" is null");
            return (Criteria) this;
        }

        public Criteria andSalaryruleJobIsNotNull() {
            addCriterion("\"salaryrule_ job\" is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryruleJobEqualTo(Long value) {
            addCriterion("\"salaryrule_ job\" =", value, "salaryruleJob");
            return (Criteria) this;
        }

        public Criteria andSalaryruleJobNotEqualTo(Long value) {
            addCriterion("\"salaryrule_ job\" <>", value, "salaryruleJob");
            return (Criteria) this;
        }

        public Criteria andSalaryruleJobGreaterThan(Long value) {
            addCriterion("\"salaryrule_ job\" >", value, "salaryruleJob");
            return (Criteria) this;
        }

        public Criteria andSalaryruleJobGreaterThanOrEqualTo(Long value) {
            addCriterion("\"salaryrule_ job\" >=", value, "salaryruleJob");
            return (Criteria) this;
        }

        public Criteria andSalaryruleJobLessThan(Long value) {
            addCriterion("\"salaryrule_ job\" <", value, "salaryruleJob");
            return (Criteria) this;
        }

        public Criteria andSalaryruleJobLessThanOrEqualTo(Long value) {
            addCriterion("\"salaryrule_ job\" <=", value, "salaryruleJob");
            return (Criteria) this;
        }

        public Criteria andSalaryruleJobIn(List<Long> values) {
            addCriterion("\"salaryrule_ job\" in", values, "salaryruleJob");
            return (Criteria) this;
        }

        public Criteria andSalaryruleJobNotIn(List<Long> values) {
            addCriterion("\"salaryrule_ job\" not in", values, "salaryruleJob");
            return (Criteria) this;
        }

        public Criteria andSalaryruleJobBetween(Long value1, Long value2) {
            addCriterion("\"salaryrule_ job\" between", value1, value2, "salaryruleJob");
            return (Criteria) this;
        }

        public Criteria andSalaryruleJobNotBetween(Long value1, Long value2) {
            addCriterion("\"salaryrule_ job\" not between", value1, value2, "salaryruleJob");
            return (Criteria) this;
        }

        public Criteria andSalaryruleLifeIsNull() {
            addCriterion("\"salaryrule_ life\" is null");
            return (Criteria) this;
        }

        public Criteria andSalaryruleLifeIsNotNull() {
            addCriterion("\"salaryrule_ life\" is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryruleLifeEqualTo(Long value) {
            addCriterion("\"salaryrule_ life\" =", value, "salaryruleLife");
            return (Criteria) this;
        }

        public Criteria andSalaryruleLifeNotEqualTo(Long value) {
            addCriterion("\"salaryrule_ life\" <>", value, "salaryruleLife");
            return (Criteria) this;
        }

        public Criteria andSalaryruleLifeGreaterThan(Long value) {
            addCriterion("\"salaryrule_ life\" >", value, "salaryruleLife");
            return (Criteria) this;
        }

        public Criteria andSalaryruleLifeGreaterThanOrEqualTo(Long value) {
            addCriterion("\"salaryrule_ life\" >=", value, "salaryruleLife");
            return (Criteria) this;
        }

        public Criteria andSalaryruleLifeLessThan(Long value) {
            addCriterion("\"salaryrule_ life\" <", value, "salaryruleLife");
            return (Criteria) this;
        }

        public Criteria andSalaryruleLifeLessThanOrEqualTo(Long value) {
            addCriterion("\"salaryrule_ life\" <=", value, "salaryruleLife");
            return (Criteria) this;
        }

        public Criteria andSalaryruleLifeIn(List<Long> values) {
            addCriterion("\"salaryrule_ life\" in", values, "salaryruleLife");
            return (Criteria) this;
        }

        public Criteria andSalaryruleLifeNotIn(List<Long> values) {
            addCriterion("\"salaryrule_ life\" not in", values, "salaryruleLife");
            return (Criteria) this;
        }

        public Criteria andSalaryruleLifeBetween(Long value1, Long value2) {
            addCriterion("\"salaryrule_ life\" between", value1, value2, "salaryruleLife");
            return (Criteria) this;
        }

        public Criteria andSalaryruleLifeNotBetween(Long value1, Long value2) {
            addCriterion("\"salaryrule_ life\" not between", value1, value2, "salaryruleLife");
            return (Criteria) this;
        }

        public Criteria andSalaryruleRewardIsNull() {
            addCriterion("\"salaryrule_ reward\" is null");
            return (Criteria) this;
        }

        public Criteria andSalaryruleRewardIsNotNull() {
            addCriterion("\"salaryrule_ reward\" is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryruleRewardEqualTo(Long value) {
            addCriterion("\"salaryrule_ reward\" =", value, "salaryruleReward");
            return (Criteria) this;
        }

        public Criteria andSalaryruleRewardNotEqualTo(Long value) {
            addCriterion("\"salaryrule_ reward\" <>", value, "salaryruleReward");
            return (Criteria) this;
        }

        public Criteria andSalaryruleRewardGreaterThan(Long value) {
            addCriterion("\"salaryrule_ reward\" >", value, "salaryruleReward");
            return (Criteria) this;
        }

        public Criteria andSalaryruleRewardGreaterThanOrEqualTo(Long value) {
            addCriterion("\"salaryrule_ reward\" >=", value, "salaryruleReward");
            return (Criteria) this;
        }

        public Criteria andSalaryruleRewardLessThan(Long value) {
            addCriterion("\"salaryrule_ reward\" <", value, "salaryruleReward");
            return (Criteria) this;
        }

        public Criteria andSalaryruleRewardLessThanOrEqualTo(Long value) {
            addCriterion("\"salaryrule_ reward\" <=", value, "salaryruleReward");
            return (Criteria) this;
        }

        public Criteria andSalaryruleRewardIn(List<Long> values) {
            addCriterion("\"salaryrule_ reward\" in", values, "salaryruleReward");
            return (Criteria) this;
        }

        public Criteria andSalaryruleRewardNotIn(List<Long> values) {
            addCriterion("\"salaryrule_ reward\" not in", values, "salaryruleReward");
            return (Criteria) this;
        }

        public Criteria andSalaryruleRewardBetween(Long value1, Long value2) {
            addCriterion("\"salaryrule_ reward\" between", value1, value2, "salaryruleReward");
            return (Criteria) this;
        }

        public Criteria andSalaryruleRewardNotBetween(Long value1, Long value2) {
            addCriterion("\"salaryrule_ reward\" not between", value1, value2, "salaryruleReward");
            return (Criteria) this;
        }

        public Criteria andSalaryruleAgeIsNull() {
            addCriterion("\"salaryrule_ age\" is null");
            return (Criteria) this;
        }

        public Criteria andSalaryruleAgeIsNotNull() {
            addCriterion("\"salaryrule_ age\" is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryruleAgeEqualTo(Long value) {
            addCriterion("\"salaryrule_ age\" =", value, "salaryruleAge");
            return (Criteria) this;
        }

        public Criteria andSalaryruleAgeNotEqualTo(Long value) {
            addCriterion("\"salaryrule_ age\" <>", value, "salaryruleAge");
            return (Criteria) this;
        }

        public Criteria andSalaryruleAgeGreaterThan(Long value) {
            addCriterion("\"salaryrule_ age\" >", value, "salaryruleAge");
            return (Criteria) this;
        }

        public Criteria andSalaryruleAgeGreaterThanOrEqualTo(Long value) {
            addCriterion("\"salaryrule_ age\" >=", value, "salaryruleAge");
            return (Criteria) this;
        }

        public Criteria andSalaryruleAgeLessThan(Long value) {
            addCriterion("\"salaryrule_ age\" <", value, "salaryruleAge");
            return (Criteria) this;
        }

        public Criteria andSalaryruleAgeLessThanOrEqualTo(Long value) {
            addCriterion("\"salaryrule_ age\" <=", value, "salaryruleAge");
            return (Criteria) this;
        }

        public Criteria andSalaryruleAgeIn(List<Long> values) {
            addCriterion("\"salaryrule_ age\" in", values, "salaryruleAge");
            return (Criteria) this;
        }

        public Criteria andSalaryruleAgeNotIn(List<Long> values) {
            addCriterion("\"salaryrule_ age\" not in", values, "salaryruleAge");
            return (Criteria) this;
        }

        public Criteria andSalaryruleAgeBetween(Long value1, Long value2) {
            addCriterion("\"salaryrule_ age\" between", value1, value2, "salaryruleAge");
            return (Criteria) this;
        }

        public Criteria andSalaryruleAgeNotBetween(Long value1, Long value2) {
            addCriterion("\"salaryrule_ age\" not between", value1, value2, "salaryruleAge");
            return (Criteria) this;
        }

        public Criteria andSalaryruleOtherIsNull() {
            addCriterion("salaryrule_other is null");
            return (Criteria) this;
        }

        public Criteria andSalaryruleOtherIsNotNull() {
            addCriterion("salaryrule_other is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryruleOtherEqualTo(Long value) {
            addCriterion("salaryrule_other =", value, "salaryruleOther");
            return (Criteria) this;
        }

        public Criteria andSalaryruleOtherNotEqualTo(Long value) {
            addCriterion("salaryrule_other <>", value, "salaryruleOther");
            return (Criteria) this;
        }

        public Criteria andSalaryruleOtherGreaterThan(Long value) {
            addCriterion("salaryrule_other >", value, "salaryruleOther");
            return (Criteria) this;
        }

        public Criteria andSalaryruleOtherGreaterThanOrEqualTo(Long value) {
            addCriterion("salaryrule_other >=", value, "salaryruleOther");
            return (Criteria) this;
        }

        public Criteria andSalaryruleOtherLessThan(Long value) {
            addCriterion("salaryrule_other <", value, "salaryruleOther");
            return (Criteria) this;
        }

        public Criteria andSalaryruleOtherLessThanOrEqualTo(Long value) {
            addCriterion("salaryrule_other <=", value, "salaryruleOther");
            return (Criteria) this;
        }

        public Criteria andSalaryruleOtherIn(List<Long> values) {
            addCriterion("salaryrule_other in", values, "salaryruleOther");
            return (Criteria) this;
        }

        public Criteria andSalaryruleOtherNotIn(List<Long> values) {
            addCriterion("salaryrule_other not in", values, "salaryruleOther");
            return (Criteria) this;
        }

        public Criteria andSalaryruleOtherBetween(Long value1, Long value2) {
            addCriterion("salaryrule_other between", value1, value2, "salaryruleOther");
            return (Criteria) this;
        }

        public Criteria andSalaryruleOtherNotBetween(Long value1, Long value2) {
            addCriterion("salaryrule_other not between", value1, value2, "salaryruleOther");
            return (Criteria) this;
        }

        public Criteria andSalaryruleTotalIsNull() {
            addCriterion("salaryrule_total is null");
            return (Criteria) this;
        }

        public Criteria andSalaryruleTotalIsNotNull() {
            addCriterion("salaryrule_total is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryruleTotalEqualTo(Long value) {
            addCriterion("salaryrule_total =", value, "salaryruleTotal");
            return (Criteria) this;
        }

        public Criteria andSalaryruleTotalNotEqualTo(Long value) {
            addCriterion("salaryrule_total <>", value, "salaryruleTotal");
            return (Criteria) this;
        }

        public Criteria andSalaryruleTotalGreaterThan(Long value) {
            addCriterion("salaryrule_total >", value, "salaryruleTotal");
            return (Criteria) this;
        }

        public Criteria andSalaryruleTotalGreaterThanOrEqualTo(Long value) {
            addCriterion("salaryrule_total >=", value, "salaryruleTotal");
            return (Criteria) this;
        }

        public Criteria andSalaryruleTotalLessThan(Long value) {
            addCriterion("salaryrule_total <", value, "salaryruleTotal");
            return (Criteria) this;
        }

        public Criteria andSalaryruleTotalLessThanOrEqualTo(Long value) {
            addCriterion("salaryrule_total <=", value, "salaryruleTotal");
            return (Criteria) this;
        }

        public Criteria andSalaryruleTotalIn(List<Long> values) {
            addCriterion("salaryrule_total in", values, "salaryruleTotal");
            return (Criteria) this;
        }

        public Criteria andSalaryruleTotalNotIn(List<Long> values) {
            addCriterion("salaryrule_total not in", values, "salaryruleTotal");
            return (Criteria) this;
        }

        public Criteria andSalaryruleTotalBetween(Long value1, Long value2) {
            addCriterion("salaryrule_total between", value1, value2, "salaryruleTotal");
            return (Criteria) this;
        }

        public Criteria andSalaryruleTotalNotBetween(Long value1, Long value2) {
            addCriterion("salaryrule_total not between", value1, value2, "salaryruleTotal");
            return (Criteria) this;
        }

        public Criteria andSalaryruleMemoIsNull() {
            addCriterion("salaryrule_memo is null");
            return (Criteria) this;
        }

        public Criteria andSalaryruleMemoIsNotNull() {
            addCriterion("salaryrule_memo is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryruleMemoEqualTo(String value) {
            addCriterion("salaryrule_memo =", value, "salaryruleMemo");
            return (Criteria) this;
        }

        public Criteria andSalaryruleMemoNotEqualTo(String value) {
            addCriterion("salaryrule_memo <>", value, "salaryruleMemo");
            return (Criteria) this;
        }

        public Criteria andSalaryruleMemoGreaterThan(String value) {
            addCriterion("salaryrule_memo >", value, "salaryruleMemo");
            return (Criteria) this;
        }

        public Criteria andSalaryruleMemoGreaterThanOrEqualTo(String value) {
            addCriterion("salaryrule_memo >=", value, "salaryruleMemo");
            return (Criteria) this;
        }

        public Criteria andSalaryruleMemoLessThan(String value) {
            addCriterion("salaryrule_memo <", value, "salaryruleMemo");
            return (Criteria) this;
        }

        public Criteria andSalaryruleMemoLessThanOrEqualTo(String value) {
            addCriterion("salaryrule_memo <=", value, "salaryruleMemo");
            return (Criteria) this;
        }

        public Criteria andSalaryruleMemoLike(String value) {
            addCriterion("salaryrule_memo like", value, "salaryruleMemo");
            return (Criteria) this;
        }

        public Criteria andSalaryruleMemoNotLike(String value) {
            addCriterion("salaryrule_memo not like", value, "salaryruleMemo");
            return (Criteria) this;
        }

        public Criteria andSalaryruleMemoIn(List<String> values) {
            addCriterion("salaryrule_memo in", values, "salaryruleMemo");
            return (Criteria) this;
        }

        public Criteria andSalaryruleMemoNotIn(List<String> values) {
            addCriterion("salaryrule_memo not in", values, "salaryruleMemo");
            return (Criteria) this;
        }

        public Criteria andSalaryruleMemoBetween(String value1, String value2) {
            addCriterion("salaryrule_memo between", value1, value2, "salaryruleMemo");
            return (Criteria) this;
        }

        public Criteria andSalaryruleMemoNotBetween(String value1, String value2) {
            addCriterion("salaryrule_memo not between", value1, value2, "salaryruleMemo");
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