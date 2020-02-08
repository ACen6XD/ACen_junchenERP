package com.junchen.back.pojo;

import java.util.ArrayList;
import java.util.List;

public class ErpAmStaffExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ErpAmStaffExample() {
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

        public Criteria andStaffIdIsNull() {
            addCriterion("staff_id is null");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNotNull() {
            addCriterion("staff_id is not null");
            return (Criteria) this;
        }

        public Criteria andStaffIdEqualTo(Long value) {
            addCriterion("staff_id =", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotEqualTo(Long value) {
            addCriterion("staff_id <>", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThan(Long value) {
            addCriterion("staff_id >", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThanOrEqualTo(Long value) {
            addCriterion("staff_id >=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThan(Long value) {
            addCriterion("staff_id <", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThanOrEqualTo(Long value) {
            addCriterion("staff_id <=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIn(List<Long> values) {
            addCriterion("staff_id in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotIn(List<Long> values) {
            addCriterion("staff_id not in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdBetween(Long value1, Long value2) {
            addCriterion("staff_id between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotBetween(Long value1, Long value2) {
            addCriterion("staff_id not between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffNameIsNull() {
            addCriterion("staff_name is null");
            return (Criteria) this;
        }

        public Criteria andStaffNameIsNotNull() {
            addCriterion("staff_name is not null");
            return (Criteria) this;
        }

        public Criteria andStaffNameEqualTo(String value) {
            addCriterion("staff_name =", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotEqualTo(String value) {
            addCriterion("staff_name <>", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameGreaterThan(String value) {
            addCriterion("staff_name >", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameGreaterThanOrEqualTo(String value) {
            addCriterion("staff_name >=", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLessThan(String value) {
            addCriterion("staff_name <", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLessThanOrEqualTo(String value) {
            addCriterion("staff_name <=", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLike(String value) {
            addCriterion("staff_name like", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotLike(String value) {
            addCriterion("staff_name not like", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameIn(List<String> values) {
            addCriterion("staff_name in", values, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotIn(List<String> values) {
            addCriterion("staff_name not in", values, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameBetween(String value1, String value2) {
            addCriterion("staff_name between", value1, value2, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotBetween(String value1, String value2) {
            addCriterion("staff_name not between", value1, value2, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffGenderIsNull() {
            addCriterion("staff_gender is null");
            return (Criteria) this;
        }

        public Criteria andStaffGenderIsNotNull() {
            addCriterion("staff_gender is not null");
            return (Criteria) this;
        }

        public Criteria andStaffGenderEqualTo(String value) {
            addCriterion("staff_gender =", value, "staffGender");
            return (Criteria) this;
        }

        public Criteria andStaffGenderNotEqualTo(String value) {
            addCriterion("staff_gender <>", value, "staffGender");
            return (Criteria) this;
        }

        public Criteria andStaffGenderGreaterThan(String value) {
            addCriterion("staff_gender >", value, "staffGender");
            return (Criteria) this;
        }

        public Criteria andStaffGenderGreaterThanOrEqualTo(String value) {
            addCriterion("staff_gender >=", value, "staffGender");
            return (Criteria) this;
        }

        public Criteria andStaffGenderLessThan(String value) {
            addCriterion("staff_gender <", value, "staffGender");
            return (Criteria) this;
        }

        public Criteria andStaffGenderLessThanOrEqualTo(String value) {
            addCriterion("staff_gender <=", value, "staffGender");
            return (Criteria) this;
        }

        public Criteria andStaffGenderLike(String value) {
            addCriterion("staff_gender like", value, "staffGender");
            return (Criteria) this;
        }

        public Criteria andStaffGenderNotLike(String value) {
            addCriterion("staff_gender not like", value, "staffGender");
            return (Criteria) this;
        }

        public Criteria andStaffGenderIn(List<String> values) {
            addCriterion("staff_gender in", values, "staffGender");
            return (Criteria) this;
        }

        public Criteria andStaffGenderNotIn(List<String> values) {
            addCriterion("staff_gender not in", values, "staffGender");
            return (Criteria) this;
        }

        public Criteria andStaffGenderBetween(String value1, String value2) {
            addCriterion("staff_gender between", value1, value2, "staffGender");
            return (Criteria) this;
        }

        public Criteria andStaffGenderNotBetween(String value1, String value2) {
            addCriterion("staff_gender not between", value1, value2, "staffGender");
            return (Criteria) this;
        }

        public Criteria andStaffCardidIsNull() {
            addCriterion("staff_cardid is null");
            return (Criteria) this;
        }

        public Criteria andStaffCardidIsNotNull() {
            addCriterion("staff_cardid is not null");
            return (Criteria) this;
        }

        public Criteria andStaffCardidEqualTo(String value) {
            addCriterion("staff_cardid =", value, "staffCardid");
            return (Criteria) this;
        }

        public Criteria andStaffCardidNotEqualTo(String value) {
            addCriterion("staff_cardid <>", value, "staffCardid");
            return (Criteria) this;
        }

        public Criteria andStaffCardidGreaterThan(String value) {
            addCriterion("staff_cardid >", value, "staffCardid");
            return (Criteria) this;
        }

        public Criteria andStaffCardidGreaterThanOrEqualTo(String value) {
            addCriterion("staff_cardid >=", value, "staffCardid");
            return (Criteria) this;
        }

        public Criteria andStaffCardidLessThan(String value) {
            addCriterion("staff_cardid <", value, "staffCardid");
            return (Criteria) this;
        }

        public Criteria andStaffCardidLessThanOrEqualTo(String value) {
            addCriterion("staff_cardid <=", value, "staffCardid");
            return (Criteria) this;
        }

        public Criteria andStaffCardidLike(String value) {
            addCriterion("staff_cardid like", value, "staffCardid");
            return (Criteria) this;
        }

        public Criteria andStaffCardidNotLike(String value) {
            addCriterion("staff_cardid not like", value, "staffCardid");
            return (Criteria) this;
        }

        public Criteria andStaffCardidIn(List<String> values) {
            addCriterion("staff_cardid in", values, "staffCardid");
            return (Criteria) this;
        }

        public Criteria andStaffCardidNotIn(List<String> values) {
            addCriterion("staff_cardid not in", values, "staffCardid");
            return (Criteria) this;
        }

        public Criteria andStaffCardidBetween(String value1, String value2) {
            addCriterion("staff_cardid between", value1, value2, "staffCardid");
            return (Criteria) this;
        }

        public Criteria andStaffCardidNotBetween(String value1, String value2) {
            addCriterion("staff_cardid not between", value1, value2, "staffCardid");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneIsNull() {
            addCriterion("staff_phone is null");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneIsNotNull() {
            addCriterion("staff_phone is not null");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneEqualTo(String value) {
            addCriterion("staff_phone =", value, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneNotEqualTo(String value) {
            addCriterion("staff_phone <>", value, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneGreaterThan(String value) {
            addCriterion("staff_phone >", value, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("staff_phone >=", value, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneLessThan(String value) {
            addCriterion("staff_phone <", value, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneLessThanOrEqualTo(String value) {
            addCriterion("staff_phone <=", value, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneLike(String value) {
            addCriterion("staff_phone like", value, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneNotLike(String value) {
            addCriterion("staff_phone not like", value, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneIn(List<String> values) {
            addCriterion("staff_phone in", values, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneNotIn(List<String> values) {
            addCriterion("staff_phone not in", values, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneBetween(String value1, String value2) {
            addCriterion("staff_phone between", value1, value2, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneNotBetween(String value1, String value2) {
            addCriterion("staff_phone not between", value1, value2, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffAddressIsNull() {
            addCriterion("staff_address is null");
            return (Criteria) this;
        }

        public Criteria andStaffAddressIsNotNull() {
            addCriterion("staff_address is not null");
            return (Criteria) this;
        }

        public Criteria andStaffAddressEqualTo(String value) {
            addCriterion("staff_address =", value, "staffAddress");
            return (Criteria) this;
        }

        public Criteria andStaffAddressNotEqualTo(String value) {
            addCriterion("staff_address <>", value, "staffAddress");
            return (Criteria) this;
        }

        public Criteria andStaffAddressGreaterThan(String value) {
            addCriterion("staff_address >", value, "staffAddress");
            return (Criteria) this;
        }

        public Criteria andStaffAddressGreaterThanOrEqualTo(String value) {
            addCriterion("staff_address >=", value, "staffAddress");
            return (Criteria) this;
        }

        public Criteria andStaffAddressLessThan(String value) {
            addCriterion("staff_address <", value, "staffAddress");
            return (Criteria) this;
        }

        public Criteria andStaffAddressLessThanOrEqualTo(String value) {
            addCriterion("staff_address <=", value, "staffAddress");
            return (Criteria) this;
        }

        public Criteria andStaffAddressLike(String value) {
            addCriterion("staff_address like", value, "staffAddress");
            return (Criteria) this;
        }

        public Criteria andStaffAddressNotLike(String value) {
            addCriterion("staff_address not like", value, "staffAddress");
            return (Criteria) this;
        }

        public Criteria andStaffAddressIn(List<String> values) {
            addCriterion("staff_address in", values, "staffAddress");
            return (Criteria) this;
        }

        public Criteria andStaffAddressNotIn(List<String> values) {
            addCriterion("staff_address not in", values, "staffAddress");
            return (Criteria) this;
        }

        public Criteria andStaffAddressBetween(String value1, String value2) {
            addCriterion("staff_address between", value1, value2, "staffAddress");
            return (Criteria) this;
        }

        public Criteria andStaffAddressNotBetween(String value1, String value2) {
            addCriterion("staff_address not between", value1, value2, "staffAddress");
            return (Criteria) this;
        }

        public Criteria andStaffTypeIsNull() {
            addCriterion("staff_type is null");
            return (Criteria) this;
        }

        public Criteria andStaffTypeIsNotNull() {
            addCriterion("staff_type is not null");
            return (Criteria) this;
        }

        public Criteria andStaffTypeEqualTo(String value) {
            addCriterion("staff_type =", value, "staffType");
            return (Criteria) this;
        }

        public Criteria andStaffTypeNotEqualTo(String value) {
            addCriterion("staff_type <>", value, "staffType");
            return (Criteria) this;
        }

        public Criteria andStaffTypeGreaterThan(String value) {
            addCriterion("staff_type >", value, "staffType");
            return (Criteria) this;
        }

        public Criteria andStaffTypeGreaterThanOrEqualTo(String value) {
            addCriterion("staff_type >=", value, "staffType");
            return (Criteria) this;
        }

        public Criteria andStaffTypeLessThan(String value) {
            addCriterion("staff_type <", value, "staffType");
            return (Criteria) this;
        }

        public Criteria andStaffTypeLessThanOrEqualTo(String value) {
            addCriterion("staff_type <=", value, "staffType");
            return (Criteria) this;
        }

        public Criteria andStaffTypeLike(String value) {
            addCriterion("staff_type like", value, "staffType");
            return (Criteria) this;
        }

        public Criteria andStaffTypeNotLike(String value) {
            addCriterion("staff_type not like", value, "staffType");
            return (Criteria) this;
        }

        public Criteria andStaffTypeIn(List<String> values) {
            addCriterion("staff_type in", values, "staffType");
            return (Criteria) this;
        }

        public Criteria andStaffTypeNotIn(List<String> values) {
            addCriterion("staff_type not in", values, "staffType");
            return (Criteria) this;
        }

        public Criteria andStaffTypeBetween(String value1, String value2) {
            addCriterion("staff_type between", value1, value2, "staffType");
            return (Criteria) this;
        }

        public Criteria andStaffTypeNotBetween(String value1, String value2) {
            addCriterion("staff_type not between", value1, value2, "staffType");
            return (Criteria) this;
        }

        public Criteria andStaffDepartmentIsNull() {
            addCriterion("staff_department is null");
            return (Criteria) this;
        }

        public Criteria andStaffDepartmentIsNotNull() {
            addCriterion("staff_department is not null");
            return (Criteria) this;
        }

        public Criteria andStaffDepartmentEqualTo(String value) {
            addCriterion("staff_department =", value, "staffDepartment");
            return (Criteria) this;
        }

        public Criteria andStaffDepartmentNotEqualTo(String value) {
            addCriterion("staff_department <>", value, "staffDepartment");
            return (Criteria) this;
        }

        public Criteria andStaffDepartmentGreaterThan(String value) {
            addCriterion("staff_department >", value, "staffDepartment");
            return (Criteria) this;
        }

        public Criteria andStaffDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("staff_department >=", value, "staffDepartment");
            return (Criteria) this;
        }

        public Criteria andStaffDepartmentLessThan(String value) {
            addCriterion("staff_department <", value, "staffDepartment");
            return (Criteria) this;
        }

        public Criteria andStaffDepartmentLessThanOrEqualTo(String value) {
            addCriterion("staff_department <=", value, "staffDepartment");
            return (Criteria) this;
        }

        public Criteria andStaffDepartmentLike(String value) {
            addCriterion("staff_department like", value, "staffDepartment");
            return (Criteria) this;
        }

        public Criteria andStaffDepartmentNotLike(String value) {
            addCriterion("staff_department not like", value, "staffDepartment");
            return (Criteria) this;
        }

        public Criteria andStaffDepartmentIn(List<String> values) {
            addCriterion("staff_department in", values, "staffDepartment");
            return (Criteria) this;
        }

        public Criteria andStaffDepartmentNotIn(List<String> values) {
            addCriterion("staff_department not in", values, "staffDepartment");
            return (Criteria) this;
        }

        public Criteria andStaffDepartmentBetween(String value1, String value2) {
            addCriterion("staff_department between", value1, value2, "staffDepartment");
            return (Criteria) this;
        }

        public Criteria andStaffDepartmentNotBetween(String value1, String value2) {
            addCriterion("staff_department not between", value1, value2, "staffDepartment");
            return (Criteria) this;
        }

        public Criteria andStaffTitlesIsNull() {
            addCriterion("staff_titles is null");
            return (Criteria) this;
        }

        public Criteria andStaffTitlesIsNotNull() {
            addCriterion("staff_titles is not null");
            return (Criteria) this;
        }

        public Criteria andStaffTitlesEqualTo(String value) {
            addCriterion("staff_titles =", value, "staffTitles");
            return (Criteria) this;
        }

        public Criteria andStaffTitlesNotEqualTo(String value) {
            addCriterion("staff_titles <>", value, "staffTitles");
            return (Criteria) this;
        }

        public Criteria andStaffTitlesGreaterThan(String value) {
            addCriterion("staff_titles >", value, "staffTitles");
            return (Criteria) this;
        }

        public Criteria andStaffTitlesGreaterThanOrEqualTo(String value) {
            addCriterion("staff_titles >=", value, "staffTitles");
            return (Criteria) this;
        }

        public Criteria andStaffTitlesLessThan(String value) {
            addCriterion("staff_titles <", value, "staffTitles");
            return (Criteria) this;
        }

        public Criteria andStaffTitlesLessThanOrEqualTo(String value) {
            addCriterion("staff_titles <=", value, "staffTitles");
            return (Criteria) this;
        }

        public Criteria andStaffTitlesLike(String value) {
            addCriterion("staff_titles like", value, "staffTitles");
            return (Criteria) this;
        }

        public Criteria andStaffTitlesNotLike(String value) {
            addCriterion("staff_titles not like", value, "staffTitles");
            return (Criteria) this;
        }

        public Criteria andStaffTitlesIn(List<String> values) {
            addCriterion("staff_titles in", values, "staffTitles");
            return (Criteria) this;
        }

        public Criteria andStaffTitlesNotIn(List<String> values) {
            addCriterion("staff_titles not in", values, "staffTitles");
            return (Criteria) this;
        }

        public Criteria andStaffTitlesBetween(String value1, String value2) {
            addCriterion("staff_titles between", value1, value2, "staffTitles");
            return (Criteria) this;
        }

        public Criteria andStaffTitlesNotBetween(String value1, String value2) {
            addCriterion("staff_titles not between", value1, value2, "staffTitles");
            return (Criteria) this;
        }

        public Criteria andStaffPhotoIsNull() {
            addCriterion("staff_photo is null");
            return (Criteria) this;
        }

        public Criteria andStaffPhotoIsNotNull() {
            addCriterion("staff_photo is not null");
            return (Criteria) this;
        }

        public Criteria andStaffPhotoEqualTo(String value) {
            addCriterion("staff_photo =", value, "staffPhoto");
            return (Criteria) this;
        }

        public Criteria andStaffPhotoNotEqualTo(String value) {
            addCriterion("staff_photo <>", value, "staffPhoto");
            return (Criteria) this;
        }

        public Criteria andStaffPhotoGreaterThan(String value) {
            addCriterion("staff_photo >", value, "staffPhoto");
            return (Criteria) this;
        }

        public Criteria andStaffPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("staff_photo >=", value, "staffPhoto");
            return (Criteria) this;
        }

        public Criteria andStaffPhotoLessThan(String value) {
            addCriterion("staff_photo <", value, "staffPhoto");
            return (Criteria) this;
        }

        public Criteria andStaffPhotoLessThanOrEqualTo(String value) {
            addCriterion("staff_photo <=", value, "staffPhoto");
            return (Criteria) this;
        }

        public Criteria andStaffPhotoLike(String value) {
            addCriterion("staff_photo like", value, "staffPhoto");
            return (Criteria) this;
        }

        public Criteria andStaffPhotoNotLike(String value) {
            addCriterion("staff_photo not like", value, "staffPhoto");
            return (Criteria) this;
        }

        public Criteria andStaffPhotoIn(List<String> values) {
            addCriterion("staff_photo in", values, "staffPhoto");
            return (Criteria) this;
        }

        public Criteria andStaffPhotoNotIn(List<String> values) {
            addCriterion("staff_photo not in", values, "staffPhoto");
            return (Criteria) this;
        }

        public Criteria andStaffPhotoBetween(String value1, String value2) {
            addCriterion("staff_photo between", value1, value2, "staffPhoto");
            return (Criteria) this;
        }

        public Criteria andStaffPhotoNotBetween(String value1, String value2) {
            addCriterion("staff_photo not between", value1, value2, "staffPhoto");
            return (Criteria) this;
        }

        public Criteria andStaffContractIsNull() {
            addCriterion("staff_contract is null");
            return (Criteria) this;
        }

        public Criteria andStaffContractIsNotNull() {
            addCriterion("staff_contract is not null");
            return (Criteria) this;
        }

        public Criteria andStaffContractEqualTo(String value) {
            addCriterion("staff_contract =", value, "staffContract");
            return (Criteria) this;
        }

        public Criteria andStaffContractNotEqualTo(String value) {
            addCriterion("staff_contract <>", value, "staffContract");
            return (Criteria) this;
        }

        public Criteria andStaffContractGreaterThan(String value) {
            addCriterion("staff_contract >", value, "staffContract");
            return (Criteria) this;
        }

        public Criteria andStaffContractGreaterThanOrEqualTo(String value) {
            addCriterion("staff_contract >=", value, "staffContract");
            return (Criteria) this;
        }

        public Criteria andStaffContractLessThan(String value) {
            addCriterion("staff_contract <", value, "staffContract");
            return (Criteria) this;
        }

        public Criteria andStaffContractLessThanOrEqualTo(String value) {
            addCriterion("staff_contract <=", value, "staffContract");
            return (Criteria) this;
        }

        public Criteria andStaffContractLike(String value) {
            addCriterion("staff_contract like", value, "staffContract");
            return (Criteria) this;
        }

        public Criteria andStaffContractNotLike(String value) {
            addCriterion("staff_contract not like", value, "staffContract");
            return (Criteria) this;
        }

        public Criteria andStaffContractIn(List<String> values) {
            addCriterion("staff_contract in", values, "staffContract");
            return (Criteria) this;
        }

        public Criteria andStaffContractNotIn(List<String> values) {
            addCriterion("staff_contract not in", values, "staffContract");
            return (Criteria) this;
        }

        public Criteria andStaffContractBetween(String value1, String value2) {
            addCriterion("staff_contract between", value1, value2, "staffContract");
            return (Criteria) this;
        }

        public Criteria andStaffContractNotBetween(String value1, String value2) {
            addCriterion("staff_contract not between", value1, value2, "staffContract");
            return (Criteria) this;
        }

        public Criteria andStaffEducationIsNull() {
            addCriterion("staff_education is null");
            return (Criteria) this;
        }

        public Criteria andStaffEducationIsNotNull() {
            addCriterion("staff_education is not null");
            return (Criteria) this;
        }

        public Criteria andStaffEducationEqualTo(String value) {
            addCriterion("staff_education =", value, "staffEducation");
            return (Criteria) this;
        }

        public Criteria andStaffEducationNotEqualTo(String value) {
            addCriterion("staff_education <>", value, "staffEducation");
            return (Criteria) this;
        }

        public Criteria andStaffEducationGreaterThan(String value) {
            addCriterion("staff_education >", value, "staffEducation");
            return (Criteria) this;
        }

        public Criteria andStaffEducationGreaterThanOrEqualTo(String value) {
            addCriterion("staff_education >=", value, "staffEducation");
            return (Criteria) this;
        }

        public Criteria andStaffEducationLessThan(String value) {
            addCriterion("staff_education <", value, "staffEducation");
            return (Criteria) this;
        }

        public Criteria andStaffEducationLessThanOrEqualTo(String value) {
            addCriterion("staff_education <=", value, "staffEducation");
            return (Criteria) this;
        }

        public Criteria andStaffEducationLike(String value) {
            addCriterion("staff_education like", value, "staffEducation");
            return (Criteria) this;
        }

        public Criteria andStaffEducationNotLike(String value) {
            addCriterion("staff_education not like", value, "staffEducation");
            return (Criteria) this;
        }

        public Criteria andStaffEducationIn(List<String> values) {
            addCriterion("staff_education in", values, "staffEducation");
            return (Criteria) this;
        }

        public Criteria andStaffEducationNotIn(List<String> values) {
            addCriterion("staff_education not in", values, "staffEducation");
            return (Criteria) this;
        }

        public Criteria andStaffEducationBetween(String value1, String value2) {
            addCriterion("staff_education between", value1, value2, "staffEducation");
            return (Criteria) this;
        }

        public Criteria andStaffEducationNotBetween(String value1, String value2) {
            addCriterion("staff_education not between", value1, value2, "staffEducation");
            return (Criteria) this;
        }

        public Criteria andStaffHealthIsNull() {
            addCriterion("staff_health is null");
            return (Criteria) this;
        }

        public Criteria andStaffHealthIsNotNull() {
            addCriterion("staff_health is not null");
            return (Criteria) this;
        }

        public Criteria andStaffHealthEqualTo(String value) {
            addCriterion("staff_health =", value, "staffHealth");
            return (Criteria) this;
        }

        public Criteria andStaffHealthNotEqualTo(String value) {
            addCriterion("staff_health <>", value, "staffHealth");
            return (Criteria) this;
        }

        public Criteria andStaffHealthGreaterThan(String value) {
            addCriterion("staff_health >", value, "staffHealth");
            return (Criteria) this;
        }

        public Criteria andStaffHealthGreaterThanOrEqualTo(String value) {
            addCriterion("staff_health >=", value, "staffHealth");
            return (Criteria) this;
        }

        public Criteria andStaffHealthLessThan(String value) {
            addCriterion("staff_health <", value, "staffHealth");
            return (Criteria) this;
        }

        public Criteria andStaffHealthLessThanOrEqualTo(String value) {
            addCriterion("staff_health <=", value, "staffHealth");
            return (Criteria) this;
        }

        public Criteria andStaffHealthLike(String value) {
            addCriterion("staff_health like", value, "staffHealth");
            return (Criteria) this;
        }

        public Criteria andStaffHealthNotLike(String value) {
            addCriterion("staff_health not like", value, "staffHealth");
            return (Criteria) this;
        }

        public Criteria andStaffHealthIn(List<String> values) {
            addCriterion("staff_health in", values, "staffHealth");
            return (Criteria) this;
        }

        public Criteria andStaffHealthNotIn(List<String> values) {
            addCriterion("staff_health not in", values, "staffHealth");
            return (Criteria) this;
        }

        public Criteria andStaffHealthBetween(String value1, String value2) {
            addCriterion("staff_health between", value1, value2, "staffHealth");
            return (Criteria) this;
        }

        public Criteria andStaffHealthNotBetween(String value1, String value2) {
            addCriterion("staff_health not between", value1, value2, "staffHealth");
            return (Criteria) this;
        }

        public Criteria andStaffEnableIsNull() {
            addCriterion("staff_enable is null");
            return (Criteria) this;
        }

        public Criteria andStaffEnableIsNotNull() {
            addCriterion("staff_enable is not null");
            return (Criteria) this;
        }

        public Criteria andStaffEnableEqualTo(String value) {
            addCriterion("staff_enable =", value, "staffEnable");
            return (Criteria) this;
        }

        public Criteria andStaffEnableNotEqualTo(String value) {
            addCriterion("staff_enable <>", value, "staffEnable");
            return (Criteria) this;
        }

        public Criteria andStaffEnableGreaterThan(String value) {
            addCriterion("staff_enable >", value, "staffEnable");
            return (Criteria) this;
        }

        public Criteria andStaffEnableGreaterThanOrEqualTo(String value) {
            addCriterion("staff_enable >=", value, "staffEnable");
            return (Criteria) this;
        }

        public Criteria andStaffEnableLessThan(String value) {
            addCriterion("staff_enable <", value, "staffEnable");
            return (Criteria) this;
        }

        public Criteria andStaffEnableLessThanOrEqualTo(String value) {
            addCriterion("staff_enable <=", value, "staffEnable");
            return (Criteria) this;
        }

        public Criteria andStaffEnableLike(String value) {
            addCriterion("staff_enable like", value, "staffEnable");
            return (Criteria) this;
        }

        public Criteria andStaffEnableNotLike(String value) {
            addCriterion("staff_enable not like", value, "staffEnable");
            return (Criteria) this;
        }

        public Criteria andStaffEnableIn(List<String> values) {
            addCriterion("staff_enable in", values, "staffEnable");
            return (Criteria) this;
        }

        public Criteria andStaffEnableNotIn(List<String> values) {
            addCriterion("staff_enable not in", values, "staffEnable");
            return (Criteria) this;
        }

        public Criteria andStaffEnableBetween(String value1, String value2) {
            addCriterion("staff_enable between", value1, value2, "staffEnable");
            return (Criteria) this;
        }

        public Criteria andStaffEnableNotBetween(String value1, String value2) {
            addCriterion("staff_enable not between", value1, value2, "staffEnable");
            return (Criteria) this;
        }

        public Criteria andStaffIndateIsNull() {
            addCriterion("staff_indate is null");
            return (Criteria) this;
        }

        public Criteria andStaffIndateIsNotNull() {
            addCriterion("staff_indate is not null");
            return (Criteria) this;
        }

        public Criteria andStaffIndateEqualTo(String value) {
            addCriterion("staff_indate =", value, "staffIndate");
            return (Criteria) this;
        }

        public Criteria andStaffIndateNotEqualTo(String value) {
            addCriterion("staff_indate <>", value, "staffIndate");
            return (Criteria) this;
        }

        public Criteria andStaffIndateGreaterThan(String value) {
            addCriterion("staff_indate >", value, "staffIndate");
            return (Criteria) this;
        }

        public Criteria andStaffIndateGreaterThanOrEqualTo(String value) {
            addCriterion("staff_indate >=", value, "staffIndate");
            return (Criteria) this;
        }

        public Criteria andStaffIndateLessThan(String value) {
            addCriterion("staff_indate <", value, "staffIndate");
            return (Criteria) this;
        }

        public Criteria andStaffIndateLessThanOrEqualTo(String value) {
            addCriterion("staff_indate <=", value, "staffIndate");
            return (Criteria) this;
        }

        public Criteria andStaffIndateLike(String value) {
            addCriterion("staff_indate like", value, "staffIndate");
            return (Criteria) this;
        }

        public Criteria andStaffIndateNotLike(String value) {
            addCriterion("staff_indate not like", value, "staffIndate");
            return (Criteria) this;
        }

        public Criteria andStaffIndateIn(List<String> values) {
            addCriterion("staff_indate in", values, "staffIndate");
            return (Criteria) this;
        }

        public Criteria andStaffIndateNotIn(List<String> values) {
            addCriterion("staff_indate not in", values, "staffIndate");
            return (Criteria) this;
        }

        public Criteria andStaffIndateBetween(String value1, String value2) {
            addCriterion("staff_indate between", value1, value2, "staffIndate");
            return (Criteria) this;
        }

        public Criteria andStaffIndateNotBetween(String value1, String value2) {
            addCriterion("staff_indate not between", value1, value2, "staffIndate");
            return (Criteria) this;
        }

        public Criteria andStaffOutdateIsNull() {
            addCriterion("staff_outdate is null");
            return (Criteria) this;
        }

        public Criteria andStaffOutdateIsNotNull() {
            addCriterion("staff_outdate is not null");
            return (Criteria) this;
        }

        public Criteria andStaffOutdateEqualTo(String value) {
            addCriterion("staff_outdate =", value, "staffOutdate");
            return (Criteria) this;
        }

        public Criteria andStaffOutdateNotEqualTo(String value) {
            addCriterion("staff_outdate <>", value, "staffOutdate");
            return (Criteria) this;
        }

        public Criteria andStaffOutdateGreaterThan(String value) {
            addCriterion("staff_outdate >", value, "staffOutdate");
            return (Criteria) this;
        }

        public Criteria andStaffOutdateGreaterThanOrEqualTo(String value) {
            addCriterion("staff_outdate >=", value, "staffOutdate");
            return (Criteria) this;
        }

        public Criteria andStaffOutdateLessThan(String value) {
            addCriterion("staff_outdate <", value, "staffOutdate");
            return (Criteria) this;
        }

        public Criteria andStaffOutdateLessThanOrEqualTo(String value) {
            addCriterion("staff_outdate <=", value, "staffOutdate");
            return (Criteria) this;
        }

        public Criteria andStaffOutdateLike(String value) {
            addCriterion("staff_outdate like", value, "staffOutdate");
            return (Criteria) this;
        }

        public Criteria andStaffOutdateNotLike(String value) {
            addCriterion("staff_outdate not like", value, "staffOutdate");
            return (Criteria) this;
        }

        public Criteria andStaffOutdateIn(List<String> values) {
            addCriterion("staff_outdate in", values, "staffOutdate");
            return (Criteria) this;
        }

        public Criteria andStaffOutdateNotIn(List<String> values) {
            addCriterion("staff_outdate not in", values, "staffOutdate");
            return (Criteria) this;
        }

        public Criteria andStaffOutdateBetween(String value1, String value2) {
            addCriterion("staff_outdate between", value1, value2, "staffOutdate");
            return (Criteria) this;
        }

        public Criteria andStaffOutdateNotBetween(String value1, String value2) {
            addCriterion("staff_outdate not between", value1, value2, "staffOutdate");
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