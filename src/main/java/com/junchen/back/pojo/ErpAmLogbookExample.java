package com.junchen.back.pojo;

import java.util.ArrayList;
import java.util.List;

public class ErpAmLogbookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ErpAmLogbookExample() {
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

        public Criteria andLogbookIdIsNull() {
            addCriterion("logbook_id is null");
            return (Criteria) this;
        }

        public Criteria andLogbookIdIsNotNull() {
            addCriterion("logbook_id is not null");
            return (Criteria) this;
        }

        public Criteria andLogbookIdEqualTo(Long value) {
            addCriterion("logbook_id =", value, "logbookId");
            return (Criteria) this;
        }

        public Criteria andLogbookIdNotEqualTo(Long value) {
            addCriterion("logbook_id <>", value, "logbookId");
            return (Criteria) this;
        }

        public Criteria andLogbookIdGreaterThan(Long value) {
            addCriterion("logbook_id >", value, "logbookId");
            return (Criteria) this;
        }

        public Criteria andLogbookIdGreaterThanOrEqualTo(Long value) {
            addCriterion("logbook_id >=", value, "logbookId");
            return (Criteria) this;
        }

        public Criteria andLogbookIdLessThan(Long value) {
            addCriterion("logbook_id <", value, "logbookId");
            return (Criteria) this;
        }

        public Criteria andLogbookIdLessThanOrEqualTo(Long value) {
            addCriterion("logbook_id <=", value, "logbookId");
            return (Criteria) this;
        }

        public Criteria andLogbookIdIn(List<Long> values) {
            addCriterion("logbook_id in", values, "logbookId");
            return (Criteria) this;
        }

        public Criteria andLogbookIdNotIn(List<Long> values) {
            addCriterion("logbook_id not in", values, "logbookId");
            return (Criteria) this;
        }

        public Criteria andLogbookIdBetween(Long value1, Long value2) {
            addCriterion("logbook_id between", value1, value2, "logbookId");
            return (Criteria) this;
        }

        public Criteria andLogbookIdNotBetween(Long value1, Long value2) {
            addCriterion("logbook_id not between", value1, value2, "logbookId");
            return (Criteria) this;
        }

        public Criteria andLogbookTitleIsNull() {
            addCriterion("logbook_title is null");
            return (Criteria) this;
        }

        public Criteria andLogbookTitleIsNotNull() {
            addCriterion("logbook_title is not null");
            return (Criteria) this;
        }

        public Criteria andLogbookTitleEqualTo(String value) {
            addCriterion("logbook_title =", value, "logbookTitle");
            return (Criteria) this;
        }

        public Criteria andLogbookTitleNotEqualTo(String value) {
            addCriterion("logbook_title <>", value, "logbookTitle");
            return (Criteria) this;
        }

        public Criteria andLogbookTitleGreaterThan(String value) {
            addCriterion("logbook_title >", value, "logbookTitle");
            return (Criteria) this;
        }

        public Criteria andLogbookTitleGreaterThanOrEqualTo(String value) {
            addCriterion("logbook_title >=", value, "logbookTitle");
            return (Criteria) this;
        }

        public Criteria andLogbookTitleLessThan(String value) {
            addCriterion("logbook_title <", value, "logbookTitle");
            return (Criteria) this;
        }

        public Criteria andLogbookTitleLessThanOrEqualTo(String value) {
            addCriterion("logbook_title <=", value, "logbookTitle");
            return (Criteria) this;
        }

        public Criteria andLogbookTitleLike(String value) {
            addCriterion("logbook_title like", value, "logbookTitle");
            return (Criteria) this;
        }

        public Criteria andLogbookTitleNotLike(String value) {
            addCriterion("logbook_title not like", value, "logbookTitle");
            return (Criteria) this;
        }

        public Criteria andLogbookTitleIn(List<String> values) {
            addCriterion("logbook_title in", values, "logbookTitle");
            return (Criteria) this;
        }

        public Criteria andLogbookTitleNotIn(List<String> values) {
            addCriterion("logbook_title not in", values, "logbookTitle");
            return (Criteria) this;
        }

        public Criteria andLogbookTitleBetween(String value1, String value2) {
            addCriterion("logbook_title between", value1, value2, "logbookTitle");
            return (Criteria) this;
        }

        public Criteria andLogbookTitleNotBetween(String value1, String value2) {
            addCriterion("logbook_title not between", value1, value2, "logbookTitle");
            return (Criteria) this;
        }

        public Criteria andLogbookContentIsNull() {
            addCriterion("logbook_content is null");
            return (Criteria) this;
        }

        public Criteria andLogbookContentIsNotNull() {
            addCriterion("logbook_content is not null");
            return (Criteria) this;
        }

        public Criteria andLogbookContentEqualTo(String value) {
            addCriterion("logbook_content =", value, "logbookContent");
            return (Criteria) this;
        }

        public Criteria andLogbookContentNotEqualTo(String value) {
            addCriterion("logbook_content <>", value, "logbookContent");
            return (Criteria) this;
        }

        public Criteria andLogbookContentGreaterThan(String value) {
            addCriterion("logbook_content >", value, "logbookContent");
            return (Criteria) this;
        }

        public Criteria andLogbookContentGreaterThanOrEqualTo(String value) {
            addCriterion("logbook_content >=", value, "logbookContent");
            return (Criteria) this;
        }

        public Criteria andLogbookContentLessThan(String value) {
            addCriterion("logbook_content <", value, "logbookContent");
            return (Criteria) this;
        }

        public Criteria andLogbookContentLessThanOrEqualTo(String value) {
            addCriterion("logbook_content <=", value, "logbookContent");
            return (Criteria) this;
        }

        public Criteria andLogbookContentLike(String value) {
            addCriterion("logbook_content like", value, "logbookContent");
            return (Criteria) this;
        }

        public Criteria andLogbookContentNotLike(String value) {
            addCriterion("logbook_content not like", value, "logbookContent");
            return (Criteria) this;
        }

        public Criteria andLogbookContentIn(List<String> values) {
            addCriterion("logbook_content in", values, "logbookContent");
            return (Criteria) this;
        }

        public Criteria andLogbookContentNotIn(List<String> values) {
            addCriterion("logbook_content not in", values, "logbookContent");
            return (Criteria) this;
        }

        public Criteria andLogbookContentBetween(String value1, String value2) {
            addCriterion("logbook_content between", value1, value2, "logbookContent");
            return (Criteria) this;
        }

        public Criteria andLogbookContentNotBetween(String value1, String value2) {
            addCriterion("logbook_content not between", value1, value2, "logbookContent");
            return (Criteria) this;
        }

        public Criteria andLogbookStudyIsNull() {
            addCriterion("logbook_study is null");
            return (Criteria) this;
        }

        public Criteria andLogbookStudyIsNotNull() {
            addCriterion("logbook_study is not null");
            return (Criteria) this;
        }

        public Criteria andLogbookStudyEqualTo(String value) {
            addCriterion("logbook_study =", value, "logbookStudy");
            return (Criteria) this;
        }

        public Criteria andLogbookStudyNotEqualTo(String value) {
            addCriterion("logbook_study <>", value, "logbookStudy");
            return (Criteria) this;
        }

        public Criteria andLogbookStudyGreaterThan(String value) {
            addCriterion("logbook_study >", value, "logbookStudy");
            return (Criteria) this;
        }

        public Criteria andLogbookStudyGreaterThanOrEqualTo(String value) {
            addCriterion("logbook_study >=", value, "logbookStudy");
            return (Criteria) this;
        }

        public Criteria andLogbookStudyLessThan(String value) {
            addCriterion("logbook_study <", value, "logbookStudy");
            return (Criteria) this;
        }

        public Criteria andLogbookStudyLessThanOrEqualTo(String value) {
            addCriterion("logbook_study <=", value, "logbookStudy");
            return (Criteria) this;
        }

        public Criteria andLogbookStudyLike(String value) {
            addCriterion("logbook_study like", value, "logbookStudy");
            return (Criteria) this;
        }

        public Criteria andLogbookStudyNotLike(String value) {
            addCriterion("logbook_study not like", value, "logbookStudy");
            return (Criteria) this;
        }

        public Criteria andLogbookStudyIn(List<String> values) {
            addCriterion("logbook_study in", values, "logbookStudy");
            return (Criteria) this;
        }

        public Criteria andLogbookStudyNotIn(List<String> values) {
            addCriterion("logbook_study not in", values, "logbookStudy");
            return (Criteria) this;
        }

        public Criteria andLogbookStudyBetween(String value1, String value2) {
            addCriterion("logbook_study between", value1, value2, "logbookStudy");
            return (Criteria) this;
        }

        public Criteria andLogbookStudyNotBetween(String value1, String value2) {
            addCriterion("logbook_study not between", value1, value2, "logbookStudy");
            return (Criteria) this;
        }

        public Criteria andLogbookSummaryIsNull() {
            addCriterion("logbook_summary is null");
            return (Criteria) this;
        }

        public Criteria andLogbookSummaryIsNotNull() {
            addCriterion("logbook_summary is not null");
            return (Criteria) this;
        }

        public Criteria andLogbookSummaryEqualTo(String value) {
            addCriterion("logbook_summary =", value, "logbookSummary");
            return (Criteria) this;
        }

        public Criteria andLogbookSummaryNotEqualTo(String value) {
            addCriterion("logbook_summary <>", value, "logbookSummary");
            return (Criteria) this;
        }

        public Criteria andLogbookSummaryGreaterThan(String value) {
            addCriterion("logbook_summary >", value, "logbookSummary");
            return (Criteria) this;
        }

        public Criteria andLogbookSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("logbook_summary >=", value, "logbookSummary");
            return (Criteria) this;
        }

        public Criteria andLogbookSummaryLessThan(String value) {
            addCriterion("logbook_summary <", value, "logbookSummary");
            return (Criteria) this;
        }

        public Criteria andLogbookSummaryLessThanOrEqualTo(String value) {
            addCriterion("logbook_summary <=", value, "logbookSummary");
            return (Criteria) this;
        }

        public Criteria andLogbookSummaryLike(String value) {
            addCriterion("logbook_summary like", value, "logbookSummary");
            return (Criteria) this;
        }

        public Criteria andLogbookSummaryNotLike(String value) {
            addCriterion("logbook_summary not like", value, "logbookSummary");
            return (Criteria) this;
        }

        public Criteria andLogbookSummaryIn(List<String> values) {
            addCriterion("logbook_summary in", values, "logbookSummary");
            return (Criteria) this;
        }

        public Criteria andLogbookSummaryNotIn(List<String> values) {
            addCriterion("logbook_summary not in", values, "logbookSummary");
            return (Criteria) this;
        }

        public Criteria andLogbookSummaryBetween(String value1, String value2) {
            addCriterion("logbook_summary between", value1, value2, "logbookSummary");
            return (Criteria) this;
        }

        public Criteria andLogbookSummaryNotBetween(String value1, String value2) {
            addCriterion("logbook_summary not between", value1, value2, "logbookSummary");
            return (Criteria) this;
        }

        public Criteria andLogbookDateIsNull() {
            addCriterion("logbook_date is null");
            return (Criteria) this;
        }

        public Criteria andLogbookDateIsNotNull() {
            addCriterion("logbook_date is not null");
            return (Criteria) this;
        }

        public Criteria andLogbookDateEqualTo(String value) {
            addCriterion("logbook_date =", value, "logbookDate");
            return (Criteria) this;
        }

        public Criteria andLogbookDateNotEqualTo(String value) {
            addCriterion("logbook_date <>", value, "logbookDate");
            return (Criteria) this;
        }

        public Criteria andLogbookDateGreaterThan(String value) {
            addCriterion("logbook_date >", value, "logbookDate");
            return (Criteria) this;
        }

        public Criteria andLogbookDateGreaterThanOrEqualTo(String value) {
            addCriterion("logbook_date >=", value, "logbookDate");
            return (Criteria) this;
        }

        public Criteria andLogbookDateLessThan(String value) {
            addCriterion("logbook_date <", value, "logbookDate");
            return (Criteria) this;
        }

        public Criteria andLogbookDateLessThanOrEqualTo(String value) {
            addCriterion("logbook_date <=", value, "logbookDate");
            return (Criteria) this;
        }

        public Criteria andLogbookDateLike(String value) {
            addCriterion("logbook_date like", value, "logbookDate");
            return (Criteria) this;
        }

        public Criteria andLogbookDateNotLike(String value) {
            addCriterion("logbook_date not like", value, "logbookDate");
            return (Criteria) this;
        }

        public Criteria andLogbookDateIn(List<String> values) {
            addCriterion("logbook_date in", values, "logbookDate");
            return (Criteria) this;
        }

        public Criteria andLogbookDateNotIn(List<String> values) {
            addCriterion("logbook_date not in", values, "logbookDate");
            return (Criteria) this;
        }

        public Criteria andLogbookDateBetween(String value1, String value2) {
            addCriterion("logbook_date between", value1, value2, "logbookDate");
            return (Criteria) this;
        }

        public Criteria andLogbookDateNotBetween(String value1, String value2) {
            addCriterion("logbook_date not between", value1, value2, "logbookDate");
            return (Criteria) this;
        }

        public Criteria andLogbookStaffIsNull() {
            addCriterion("logbook_staff is null");
            return (Criteria) this;
        }

        public Criteria andLogbookStaffIsNotNull() {
            addCriterion("logbook_staff is not null");
            return (Criteria) this;
        }

        public Criteria andLogbookStaffEqualTo(Long value) {
            addCriterion("logbook_staff =", value, "logbookStaff");
            return (Criteria) this;
        }

        public Criteria andLogbookStaffNotEqualTo(Long value) {
            addCriterion("logbook_staff <>", value, "logbookStaff");
            return (Criteria) this;
        }

        public Criteria andLogbookStaffGreaterThan(Long value) {
            addCriterion("logbook_staff >", value, "logbookStaff");
            return (Criteria) this;
        }

        public Criteria andLogbookStaffGreaterThanOrEqualTo(Long value) {
            addCriterion("logbook_staff >=", value, "logbookStaff");
            return (Criteria) this;
        }

        public Criteria andLogbookStaffLessThan(Long value) {
            addCriterion("logbook_staff <", value, "logbookStaff");
            return (Criteria) this;
        }

        public Criteria andLogbookStaffLessThanOrEqualTo(Long value) {
            addCriterion("logbook_staff <=", value, "logbookStaff");
            return (Criteria) this;
        }

        public Criteria andLogbookStaffIn(List<Long> values) {
            addCriterion("logbook_staff in", values, "logbookStaff");
            return (Criteria) this;
        }

        public Criteria andLogbookStaffNotIn(List<Long> values) {
            addCriterion("logbook_staff not in", values, "logbookStaff");
            return (Criteria) this;
        }

        public Criteria andLogbookStaffBetween(Long value1, Long value2) {
            addCriterion("logbook_staff between", value1, value2, "logbookStaff");
            return (Criteria) this;
        }

        public Criteria andLogbookStaffNotBetween(Long value1, Long value2) {
            addCriterion("logbook_staff not between", value1, value2, "logbookStaff");
            return (Criteria) this;
        }

        public Criteria andLogbookApproverIsNull() {
            addCriterion("logbook_approver is null");
            return (Criteria) this;
        }

        public Criteria andLogbookApproverIsNotNull() {
            addCriterion("logbook_approver is not null");
            return (Criteria) this;
        }

        public Criteria andLogbookApproverEqualTo(Long value) {
            addCriterion("logbook_approver =", value, "logbookApprover");
            return (Criteria) this;
        }

        public Criteria andLogbookApproverNotEqualTo(Long value) {
            addCriterion("logbook_approver <>", value, "logbookApprover");
            return (Criteria) this;
        }

        public Criteria andLogbookApproverGreaterThan(Long value) {
            addCriterion("logbook_approver >", value, "logbookApprover");
            return (Criteria) this;
        }

        public Criteria andLogbookApproverGreaterThanOrEqualTo(Long value) {
            addCriterion("logbook_approver >=", value, "logbookApprover");
            return (Criteria) this;
        }

        public Criteria andLogbookApproverLessThan(Long value) {
            addCriterion("logbook_approver <", value, "logbookApprover");
            return (Criteria) this;
        }

        public Criteria andLogbookApproverLessThanOrEqualTo(Long value) {
            addCriterion("logbook_approver <=", value, "logbookApprover");
            return (Criteria) this;
        }

        public Criteria andLogbookApproverIn(List<Long> values) {
            addCriterion("logbook_approver in", values, "logbookApprover");
            return (Criteria) this;
        }

        public Criteria andLogbookApproverNotIn(List<Long> values) {
            addCriterion("logbook_approver not in", values, "logbookApprover");
            return (Criteria) this;
        }

        public Criteria andLogbookApproverBetween(Long value1, Long value2) {
            addCriterion("logbook_approver between", value1, value2, "logbookApprover");
            return (Criteria) this;
        }

        public Criteria andLogbookApproverNotBetween(Long value1, Long value2) {
            addCriterion("logbook_approver not between", value1, value2, "logbookApprover");
            return (Criteria) this;
        }

        public Criteria andLogbookApprovermsgIsNull() {
            addCriterion("logbook_approvermsg is null");
            return (Criteria) this;
        }

        public Criteria andLogbookApprovermsgIsNotNull() {
            addCriterion("logbook_approvermsg is not null");
            return (Criteria) this;
        }

        public Criteria andLogbookApprovermsgEqualTo(String value) {
            addCriterion("logbook_approvermsg =", value, "logbookApprovermsg");
            return (Criteria) this;
        }

        public Criteria andLogbookApprovermsgNotEqualTo(String value) {
            addCriterion("logbook_approvermsg <>", value, "logbookApprovermsg");
            return (Criteria) this;
        }

        public Criteria andLogbookApprovermsgGreaterThan(String value) {
            addCriterion("logbook_approvermsg >", value, "logbookApprovermsg");
            return (Criteria) this;
        }

        public Criteria andLogbookApprovermsgGreaterThanOrEqualTo(String value) {
            addCriterion("logbook_approvermsg >=", value, "logbookApprovermsg");
            return (Criteria) this;
        }

        public Criteria andLogbookApprovermsgLessThan(String value) {
            addCriterion("logbook_approvermsg <", value, "logbookApprovermsg");
            return (Criteria) this;
        }

        public Criteria andLogbookApprovermsgLessThanOrEqualTo(String value) {
            addCriterion("logbook_approvermsg <=", value, "logbookApprovermsg");
            return (Criteria) this;
        }

        public Criteria andLogbookApprovermsgLike(String value) {
            addCriterion("logbook_approvermsg like", value, "logbookApprovermsg");
            return (Criteria) this;
        }

        public Criteria andLogbookApprovermsgNotLike(String value) {
            addCriterion("logbook_approvermsg not like", value, "logbookApprovermsg");
            return (Criteria) this;
        }

        public Criteria andLogbookApprovermsgIn(List<String> values) {
            addCriterion("logbook_approvermsg in", values, "logbookApprovermsg");
            return (Criteria) this;
        }

        public Criteria andLogbookApprovermsgNotIn(List<String> values) {
            addCriterion("logbook_approvermsg not in", values, "logbookApprovermsg");
            return (Criteria) this;
        }

        public Criteria andLogbookApprovermsgBetween(String value1, String value2) {
            addCriterion("logbook_approvermsg between", value1, value2, "logbookApprovermsg");
            return (Criteria) this;
        }

        public Criteria andLogbookApprovermsgNotBetween(String value1, String value2) {
            addCriterion("logbook_approvermsg not between", value1, value2, "logbookApprovermsg");
            return (Criteria) this;
        }

        public Criteria andLogbookApproverdateIsNull() {
            addCriterion("logbook_approverdate is null");
            return (Criteria) this;
        }

        public Criteria andLogbookApproverdateIsNotNull() {
            addCriterion("logbook_approverdate is not null");
            return (Criteria) this;
        }

        public Criteria andLogbookApproverdateEqualTo(String value) {
            addCriterion("logbook_approverdate =", value, "logbookApproverdate");
            return (Criteria) this;
        }

        public Criteria andLogbookApproverdateNotEqualTo(String value) {
            addCriterion("logbook_approverdate <>", value, "logbookApproverdate");
            return (Criteria) this;
        }

        public Criteria andLogbookApproverdateGreaterThan(String value) {
            addCriterion("logbook_approverdate >", value, "logbookApproverdate");
            return (Criteria) this;
        }

        public Criteria andLogbookApproverdateGreaterThanOrEqualTo(String value) {
            addCriterion("logbook_approverdate >=", value, "logbookApproverdate");
            return (Criteria) this;
        }

        public Criteria andLogbookApproverdateLessThan(String value) {
            addCriterion("logbook_approverdate <", value, "logbookApproverdate");
            return (Criteria) this;
        }

        public Criteria andLogbookApproverdateLessThanOrEqualTo(String value) {
            addCriterion("logbook_approverdate <=", value, "logbookApproverdate");
            return (Criteria) this;
        }

        public Criteria andLogbookApproverdateLike(String value) {
            addCriterion("logbook_approverdate like", value, "logbookApproverdate");
            return (Criteria) this;
        }

        public Criteria andLogbookApproverdateNotLike(String value) {
            addCriterion("logbook_approverdate not like", value, "logbookApproverdate");
            return (Criteria) this;
        }

        public Criteria andLogbookApproverdateIn(List<String> values) {
            addCriterion("logbook_approverdate in", values, "logbookApproverdate");
            return (Criteria) this;
        }

        public Criteria andLogbookApproverdateNotIn(List<String> values) {
            addCriterion("logbook_approverdate not in", values, "logbookApproverdate");
            return (Criteria) this;
        }

        public Criteria andLogbookApproverdateBetween(String value1, String value2) {
            addCriterion("logbook_approverdate between", value1, value2, "logbookApproverdate");
            return (Criteria) this;
        }

        public Criteria andLogbookApproverdateNotBetween(String value1, String value2) {
            addCriterion("logbook_approverdate not between", value1, value2, "logbookApproverdate");
            return (Criteria) this;
        }

        public Criteria andLogbookEnableIsNull() {
            addCriterion("logbook_enable is null");
            return (Criteria) this;
        }

        public Criteria andLogbookEnableIsNotNull() {
            addCriterion("logbook_enable is not null");
            return (Criteria) this;
        }

        public Criteria andLogbookEnableEqualTo(String value) {
            addCriterion("logbook_enable =", value, "logbookEnable");
            return (Criteria) this;
        }

        public Criteria andLogbookEnableNotEqualTo(String value) {
            addCriterion("logbook_enable <>", value, "logbookEnable");
            return (Criteria) this;
        }

        public Criteria andLogbookEnableGreaterThan(String value) {
            addCriterion("logbook_enable >", value, "logbookEnable");
            return (Criteria) this;
        }

        public Criteria andLogbookEnableGreaterThanOrEqualTo(String value) {
            addCriterion("logbook_enable >=", value, "logbookEnable");
            return (Criteria) this;
        }

        public Criteria andLogbookEnableLessThan(String value) {
            addCriterion("logbook_enable <", value, "logbookEnable");
            return (Criteria) this;
        }

        public Criteria andLogbookEnableLessThanOrEqualTo(String value) {
            addCriterion("logbook_enable <=", value, "logbookEnable");
            return (Criteria) this;
        }

        public Criteria andLogbookEnableLike(String value) {
            addCriterion("logbook_enable like", value, "logbookEnable");
            return (Criteria) this;
        }

        public Criteria andLogbookEnableNotLike(String value) {
            addCriterion("logbook_enable not like", value, "logbookEnable");
            return (Criteria) this;
        }

        public Criteria andLogbookEnableIn(List<String> values) {
            addCriterion("logbook_enable in", values, "logbookEnable");
            return (Criteria) this;
        }

        public Criteria andLogbookEnableNotIn(List<String> values) {
            addCriterion("logbook_enable not in", values, "logbookEnable");
            return (Criteria) this;
        }

        public Criteria andLogbookEnableBetween(String value1, String value2) {
            addCriterion("logbook_enable between", value1, value2, "logbookEnable");
            return (Criteria) this;
        }

        public Criteria andLogbookEnableNotBetween(String value1, String value2) {
            addCriterion("logbook_enable not between", value1, value2, "logbookEnable");
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