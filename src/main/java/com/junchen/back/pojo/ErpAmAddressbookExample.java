package com.junchen.back.pojo;

import java.util.ArrayList;
import java.util.List;

public class ErpAmAddressbookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ErpAmAddressbookExample() {
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

        public Criteria andAddressbookIdIsNull() {
            addCriterion("addressbook_id is null");
            return (Criteria) this;
        }

        public Criteria andAddressbookIdIsNotNull() {
            addCriterion("addressbook_id is not null");
            return (Criteria) this;
        }

        public Criteria andAddressbookIdEqualTo(Long value) {
            addCriterion("addressbook_id =", value, "addressbookId");
            return (Criteria) this;
        }

        public Criteria andAddressbookIdNotEqualTo(Long value) {
            addCriterion("addressbook_id <>", value, "addressbookId");
            return (Criteria) this;
        }

        public Criteria andAddressbookIdGreaterThan(Long value) {
            addCriterion("addressbook_id >", value, "addressbookId");
            return (Criteria) this;
        }

        public Criteria andAddressbookIdGreaterThanOrEqualTo(Long value) {
            addCriterion("addressbook_id >=", value, "addressbookId");
            return (Criteria) this;
        }

        public Criteria andAddressbookIdLessThan(Long value) {
            addCriterion("addressbook_id <", value, "addressbookId");
            return (Criteria) this;
        }

        public Criteria andAddressbookIdLessThanOrEqualTo(Long value) {
            addCriterion("addressbook_id <=", value, "addressbookId");
            return (Criteria) this;
        }

        public Criteria andAddressbookIdIn(List<Long> values) {
            addCriterion("addressbook_id in", values, "addressbookId");
            return (Criteria) this;
        }

        public Criteria andAddressbookIdNotIn(List<Long> values) {
            addCriterion("addressbook_id not in", values, "addressbookId");
            return (Criteria) this;
        }

        public Criteria andAddressbookIdBetween(Long value1, Long value2) {
            addCriterion("addressbook_id between", value1, value2, "addressbookId");
            return (Criteria) this;
        }

        public Criteria andAddressbookIdNotBetween(Long value1, Long value2) {
            addCriterion("addressbook_id not between", value1, value2, "addressbookId");
            return (Criteria) this;
        }

        public Criteria andAddressbookNameIsNull() {
            addCriterion("addressbook_name is null");
            return (Criteria) this;
        }

        public Criteria andAddressbookNameIsNotNull() {
            addCriterion("addressbook_name is not null");
            return (Criteria) this;
        }

        public Criteria andAddressbookNameEqualTo(String value) {
            addCriterion("addressbook_name =", value, "addressbookName");
            return (Criteria) this;
        }

        public Criteria andAddressbookNameNotEqualTo(String value) {
            addCriterion("addressbook_name <>", value, "addressbookName");
            return (Criteria) this;
        }

        public Criteria andAddressbookNameGreaterThan(String value) {
            addCriterion("addressbook_name >", value, "addressbookName");
            return (Criteria) this;
        }

        public Criteria andAddressbookNameGreaterThanOrEqualTo(String value) {
            addCriterion("addressbook_name >=", value, "addressbookName");
            return (Criteria) this;
        }

        public Criteria andAddressbookNameLessThan(String value) {
            addCriterion("addressbook_name <", value, "addressbookName");
            return (Criteria) this;
        }

        public Criteria andAddressbookNameLessThanOrEqualTo(String value) {
            addCriterion("addressbook_name <=", value, "addressbookName");
            return (Criteria) this;
        }

        public Criteria andAddressbookNameLike(String value) {
            addCriterion("addressbook_name like", value, "addressbookName");
            return (Criteria) this;
        }

        public Criteria andAddressbookNameNotLike(String value) {
            addCriterion("addressbook_name not like", value, "addressbookName");
            return (Criteria) this;
        }

        public Criteria andAddressbookNameIn(List<String> values) {
            addCriterion("addressbook_name in", values, "addressbookName");
            return (Criteria) this;
        }

        public Criteria andAddressbookNameNotIn(List<String> values) {
            addCriterion("addressbook_name not in", values, "addressbookName");
            return (Criteria) this;
        }

        public Criteria andAddressbookNameBetween(String value1, String value2) {
            addCriterion("addressbook_name between", value1, value2, "addressbookName");
            return (Criteria) this;
        }

        public Criteria andAddressbookNameNotBetween(String value1, String value2) {
            addCriterion("addressbook_name not between", value1, value2, "addressbookName");
            return (Criteria) this;
        }

        public Criteria andAddressbookGenderIsNull() {
            addCriterion("addressbook_gender is null");
            return (Criteria) this;
        }

        public Criteria andAddressbookGenderIsNotNull() {
            addCriterion("addressbook_gender is not null");
            return (Criteria) this;
        }

        public Criteria andAddressbookGenderEqualTo(String value) {
            addCriterion("addressbook_gender =", value, "addressbookGender");
            return (Criteria) this;
        }

        public Criteria andAddressbookGenderNotEqualTo(String value) {
            addCriterion("addressbook_gender <>", value, "addressbookGender");
            return (Criteria) this;
        }

        public Criteria andAddressbookGenderGreaterThan(String value) {
            addCriterion("addressbook_gender >", value, "addressbookGender");
            return (Criteria) this;
        }

        public Criteria andAddressbookGenderGreaterThanOrEqualTo(String value) {
            addCriterion("addressbook_gender >=", value, "addressbookGender");
            return (Criteria) this;
        }

        public Criteria andAddressbookGenderLessThan(String value) {
            addCriterion("addressbook_gender <", value, "addressbookGender");
            return (Criteria) this;
        }

        public Criteria andAddressbookGenderLessThanOrEqualTo(String value) {
            addCriterion("addressbook_gender <=", value, "addressbookGender");
            return (Criteria) this;
        }

        public Criteria andAddressbookGenderLike(String value) {
            addCriterion("addressbook_gender like", value, "addressbookGender");
            return (Criteria) this;
        }

        public Criteria andAddressbookGenderNotLike(String value) {
            addCriterion("addressbook_gender not like", value, "addressbookGender");
            return (Criteria) this;
        }

        public Criteria andAddressbookGenderIn(List<String> values) {
            addCriterion("addressbook_gender in", values, "addressbookGender");
            return (Criteria) this;
        }

        public Criteria andAddressbookGenderNotIn(List<String> values) {
            addCriterion("addressbook_gender not in", values, "addressbookGender");
            return (Criteria) this;
        }

        public Criteria andAddressbookGenderBetween(String value1, String value2) {
            addCriterion("addressbook_gender between", value1, value2, "addressbookGender");
            return (Criteria) this;
        }

        public Criteria andAddressbookGenderNotBetween(String value1, String value2) {
            addCriterion("addressbook_gender not between", value1, value2, "addressbookGender");
            return (Criteria) this;
        }

        public Criteria andAddressbookQqIsNull() {
            addCriterion("addressbook_qq is null");
            return (Criteria) this;
        }

        public Criteria andAddressbookQqIsNotNull() {
            addCriterion("addressbook_qq is not null");
            return (Criteria) this;
        }

        public Criteria andAddressbookQqEqualTo(String value) {
            addCriterion("addressbook_qq =", value, "addressbookQq");
            return (Criteria) this;
        }

        public Criteria andAddressbookQqNotEqualTo(String value) {
            addCriterion("addressbook_qq <>", value, "addressbookQq");
            return (Criteria) this;
        }

        public Criteria andAddressbookQqGreaterThan(String value) {
            addCriterion("addressbook_qq >", value, "addressbookQq");
            return (Criteria) this;
        }

        public Criteria andAddressbookQqGreaterThanOrEqualTo(String value) {
            addCriterion("addressbook_qq >=", value, "addressbookQq");
            return (Criteria) this;
        }

        public Criteria andAddressbookQqLessThan(String value) {
            addCriterion("addressbook_qq <", value, "addressbookQq");
            return (Criteria) this;
        }

        public Criteria andAddressbookQqLessThanOrEqualTo(String value) {
            addCriterion("addressbook_qq <=", value, "addressbookQq");
            return (Criteria) this;
        }

        public Criteria andAddressbookQqLike(String value) {
            addCriterion("addressbook_qq like", value, "addressbookQq");
            return (Criteria) this;
        }

        public Criteria andAddressbookQqNotLike(String value) {
            addCriterion("addressbook_qq not like", value, "addressbookQq");
            return (Criteria) this;
        }

        public Criteria andAddressbookQqIn(List<String> values) {
            addCriterion("addressbook_qq in", values, "addressbookQq");
            return (Criteria) this;
        }

        public Criteria andAddressbookQqNotIn(List<String> values) {
            addCriterion("addressbook_qq not in", values, "addressbookQq");
            return (Criteria) this;
        }

        public Criteria andAddressbookQqBetween(String value1, String value2) {
            addCriterion("addressbook_qq between", value1, value2, "addressbookQq");
            return (Criteria) this;
        }

        public Criteria andAddressbookQqNotBetween(String value1, String value2) {
            addCriterion("addressbook_qq not between", value1, value2, "addressbookQq");
            return (Criteria) this;
        }

        public Criteria andAddressbookTelephoneIsNull() {
            addCriterion("addressbook_telephone is null");
            return (Criteria) this;
        }

        public Criteria andAddressbookTelephoneIsNotNull() {
            addCriterion("addressbook_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andAddressbookTelephoneEqualTo(String value) {
            addCriterion("addressbook_telephone =", value, "addressbookTelephone");
            return (Criteria) this;
        }

        public Criteria andAddressbookTelephoneNotEqualTo(String value) {
            addCriterion("addressbook_telephone <>", value, "addressbookTelephone");
            return (Criteria) this;
        }

        public Criteria andAddressbookTelephoneGreaterThan(String value) {
            addCriterion("addressbook_telephone >", value, "addressbookTelephone");
            return (Criteria) this;
        }

        public Criteria andAddressbookTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("addressbook_telephone >=", value, "addressbookTelephone");
            return (Criteria) this;
        }

        public Criteria andAddressbookTelephoneLessThan(String value) {
            addCriterion("addressbook_telephone <", value, "addressbookTelephone");
            return (Criteria) this;
        }

        public Criteria andAddressbookTelephoneLessThanOrEqualTo(String value) {
            addCriterion("addressbook_telephone <=", value, "addressbookTelephone");
            return (Criteria) this;
        }

        public Criteria andAddressbookTelephoneLike(String value) {
            addCriterion("addressbook_telephone like", value, "addressbookTelephone");
            return (Criteria) this;
        }

        public Criteria andAddressbookTelephoneNotLike(String value) {
            addCriterion("addressbook_telephone not like", value, "addressbookTelephone");
            return (Criteria) this;
        }

        public Criteria andAddressbookTelephoneIn(List<String> values) {
            addCriterion("addressbook_telephone in", values, "addressbookTelephone");
            return (Criteria) this;
        }

        public Criteria andAddressbookTelephoneNotIn(List<String> values) {
            addCriterion("addressbook_telephone not in", values, "addressbookTelephone");
            return (Criteria) this;
        }

        public Criteria andAddressbookTelephoneBetween(String value1, String value2) {
            addCriterion("addressbook_telephone between", value1, value2, "addressbookTelephone");
            return (Criteria) this;
        }

        public Criteria andAddressbookTelephoneNotBetween(String value1, String value2) {
            addCriterion("addressbook_telephone not between", value1, value2, "addressbookTelephone");
            return (Criteria) this;
        }

        public Criteria andAddressbookPhoneIsNull() {
            addCriterion("addressbook_phone is null");
            return (Criteria) this;
        }

        public Criteria andAddressbookPhoneIsNotNull() {
            addCriterion("addressbook_phone is not null");
            return (Criteria) this;
        }

        public Criteria andAddressbookPhoneEqualTo(String value) {
            addCriterion("addressbook_phone =", value, "addressbookPhone");
            return (Criteria) this;
        }

        public Criteria andAddressbookPhoneNotEqualTo(String value) {
            addCriterion("addressbook_phone <>", value, "addressbookPhone");
            return (Criteria) this;
        }

        public Criteria andAddressbookPhoneGreaterThan(String value) {
            addCriterion("addressbook_phone >", value, "addressbookPhone");
            return (Criteria) this;
        }

        public Criteria andAddressbookPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("addressbook_phone >=", value, "addressbookPhone");
            return (Criteria) this;
        }

        public Criteria andAddressbookPhoneLessThan(String value) {
            addCriterion("addressbook_phone <", value, "addressbookPhone");
            return (Criteria) this;
        }

        public Criteria andAddressbookPhoneLessThanOrEqualTo(String value) {
            addCriterion("addressbook_phone <=", value, "addressbookPhone");
            return (Criteria) this;
        }

        public Criteria andAddressbookPhoneLike(String value) {
            addCriterion("addressbook_phone like", value, "addressbookPhone");
            return (Criteria) this;
        }

        public Criteria andAddressbookPhoneNotLike(String value) {
            addCriterion("addressbook_phone not like", value, "addressbookPhone");
            return (Criteria) this;
        }

        public Criteria andAddressbookPhoneIn(List<String> values) {
            addCriterion("addressbook_phone in", values, "addressbookPhone");
            return (Criteria) this;
        }

        public Criteria andAddressbookPhoneNotIn(List<String> values) {
            addCriterion("addressbook_phone not in", values, "addressbookPhone");
            return (Criteria) this;
        }

        public Criteria andAddressbookPhoneBetween(String value1, String value2) {
            addCriterion("addressbook_phone between", value1, value2, "addressbookPhone");
            return (Criteria) this;
        }

        public Criteria andAddressbookPhoneNotBetween(String value1, String value2) {
            addCriterion("addressbook_phone not between", value1, value2, "addressbookPhone");
            return (Criteria) this;
        }

        public Criteria andAddressbookWechatIsNull() {
            addCriterion("addressbook_wechat is null");
            return (Criteria) this;
        }

        public Criteria andAddressbookWechatIsNotNull() {
            addCriterion("addressbook_wechat is not null");
            return (Criteria) this;
        }

        public Criteria andAddressbookWechatEqualTo(String value) {
            addCriterion("addressbook_wechat =", value, "addressbookWechat");
            return (Criteria) this;
        }

        public Criteria andAddressbookWechatNotEqualTo(String value) {
            addCriterion("addressbook_wechat <>", value, "addressbookWechat");
            return (Criteria) this;
        }

        public Criteria andAddressbookWechatGreaterThan(String value) {
            addCriterion("addressbook_wechat >", value, "addressbookWechat");
            return (Criteria) this;
        }

        public Criteria andAddressbookWechatGreaterThanOrEqualTo(String value) {
            addCriterion("addressbook_wechat >=", value, "addressbookWechat");
            return (Criteria) this;
        }

        public Criteria andAddressbookWechatLessThan(String value) {
            addCriterion("addressbook_wechat <", value, "addressbookWechat");
            return (Criteria) this;
        }

        public Criteria andAddressbookWechatLessThanOrEqualTo(String value) {
            addCriterion("addressbook_wechat <=", value, "addressbookWechat");
            return (Criteria) this;
        }

        public Criteria andAddressbookWechatLike(String value) {
            addCriterion("addressbook_wechat like", value, "addressbookWechat");
            return (Criteria) this;
        }

        public Criteria andAddressbookWechatNotLike(String value) {
            addCriterion("addressbook_wechat not like", value, "addressbookWechat");
            return (Criteria) this;
        }

        public Criteria andAddressbookWechatIn(List<String> values) {
            addCriterion("addressbook_wechat in", values, "addressbookWechat");
            return (Criteria) this;
        }

        public Criteria andAddressbookWechatNotIn(List<String> values) {
            addCriterion("addressbook_wechat not in", values, "addressbookWechat");
            return (Criteria) this;
        }

        public Criteria andAddressbookWechatBetween(String value1, String value2) {
            addCriterion("addressbook_wechat between", value1, value2, "addressbookWechat");
            return (Criteria) this;
        }

        public Criteria andAddressbookWechatNotBetween(String value1, String value2) {
            addCriterion("addressbook_wechat not between", value1, value2, "addressbookWechat");
            return (Criteria) this;
        }

        public Criteria andAddressbookFaxIsNull() {
            addCriterion("addressbook_fax is null");
            return (Criteria) this;
        }

        public Criteria andAddressbookFaxIsNotNull() {
            addCriterion("addressbook_fax is not null");
            return (Criteria) this;
        }

        public Criteria andAddressbookFaxEqualTo(String value) {
            addCriterion("addressbook_fax =", value, "addressbookFax");
            return (Criteria) this;
        }

        public Criteria andAddressbookFaxNotEqualTo(String value) {
            addCriterion("addressbook_fax <>", value, "addressbookFax");
            return (Criteria) this;
        }

        public Criteria andAddressbookFaxGreaterThan(String value) {
            addCriterion("addressbook_fax >", value, "addressbookFax");
            return (Criteria) this;
        }

        public Criteria andAddressbookFaxGreaterThanOrEqualTo(String value) {
            addCriterion("addressbook_fax >=", value, "addressbookFax");
            return (Criteria) this;
        }

        public Criteria andAddressbookFaxLessThan(String value) {
            addCriterion("addressbook_fax <", value, "addressbookFax");
            return (Criteria) this;
        }

        public Criteria andAddressbookFaxLessThanOrEqualTo(String value) {
            addCriterion("addressbook_fax <=", value, "addressbookFax");
            return (Criteria) this;
        }

        public Criteria andAddressbookFaxLike(String value) {
            addCriterion("addressbook_fax like", value, "addressbookFax");
            return (Criteria) this;
        }

        public Criteria andAddressbookFaxNotLike(String value) {
            addCriterion("addressbook_fax not like", value, "addressbookFax");
            return (Criteria) this;
        }

        public Criteria andAddressbookFaxIn(List<String> values) {
            addCriterion("addressbook_fax in", values, "addressbookFax");
            return (Criteria) this;
        }

        public Criteria andAddressbookFaxNotIn(List<String> values) {
            addCriterion("addressbook_fax not in", values, "addressbookFax");
            return (Criteria) this;
        }

        public Criteria andAddressbookFaxBetween(String value1, String value2) {
            addCriterion("addressbook_fax between", value1, value2, "addressbookFax");
            return (Criteria) this;
        }

        public Criteria andAddressbookFaxNotBetween(String value1, String value2) {
            addCriterion("addressbook_fax not between", value1, value2, "addressbookFax");
            return (Criteria) this;
        }

        public Criteria andAddressbookEmailIsNull() {
            addCriterion("addressbook_email is null");
            return (Criteria) this;
        }

        public Criteria andAddressbookEmailIsNotNull() {
            addCriterion("addressbook_email is not null");
            return (Criteria) this;
        }

        public Criteria andAddressbookEmailEqualTo(String value) {
            addCriterion("addressbook_email =", value, "addressbookEmail");
            return (Criteria) this;
        }

        public Criteria andAddressbookEmailNotEqualTo(String value) {
            addCriterion("addressbook_email <>", value, "addressbookEmail");
            return (Criteria) this;
        }

        public Criteria andAddressbookEmailGreaterThan(String value) {
            addCriterion("addressbook_email >", value, "addressbookEmail");
            return (Criteria) this;
        }

        public Criteria andAddressbookEmailGreaterThanOrEqualTo(String value) {
            addCriterion("addressbook_email >=", value, "addressbookEmail");
            return (Criteria) this;
        }

        public Criteria andAddressbookEmailLessThan(String value) {
            addCriterion("addressbook_email <", value, "addressbookEmail");
            return (Criteria) this;
        }

        public Criteria andAddressbookEmailLessThanOrEqualTo(String value) {
            addCriterion("addressbook_email <=", value, "addressbookEmail");
            return (Criteria) this;
        }

        public Criteria andAddressbookEmailLike(String value) {
            addCriterion("addressbook_email like", value, "addressbookEmail");
            return (Criteria) this;
        }

        public Criteria andAddressbookEmailNotLike(String value) {
            addCriterion("addressbook_email not like", value, "addressbookEmail");
            return (Criteria) this;
        }

        public Criteria andAddressbookEmailIn(List<String> values) {
            addCriterion("addressbook_email in", values, "addressbookEmail");
            return (Criteria) this;
        }

        public Criteria andAddressbookEmailNotIn(List<String> values) {
            addCriterion("addressbook_email not in", values, "addressbookEmail");
            return (Criteria) this;
        }

        public Criteria andAddressbookEmailBetween(String value1, String value2) {
            addCriterion("addressbook_email between", value1, value2, "addressbookEmail");
            return (Criteria) this;
        }

        public Criteria andAddressbookEmailNotBetween(String value1, String value2) {
            addCriterion("addressbook_email not between", value1, value2, "addressbookEmail");
            return (Criteria) this;
        }

        public Criteria andAddressbookCompanynameIsNull() {
            addCriterion("addressbook_companyname is null");
            return (Criteria) this;
        }

        public Criteria andAddressbookCompanynameIsNotNull() {
            addCriterion("addressbook_companyname is not null");
            return (Criteria) this;
        }

        public Criteria andAddressbookCompanynameEqualTo(String value) {
            addCriterion("addressbook_companyname =", value, "addressbookCompanyname");
            return (Criteria) this;
        }

        public Criteria andAddressbookCompanynameNotEqualTo(String value) {
            addCriterion("addressbook_companyname <>", value, "addressbookCompanyname");
            return (Criteria) this;
        }

        public Criteria andAddressbookCompanynameGreaterThan(String value) {
            addCriterion("addressbook_companyname >", value, "addressbookCompanyname");
            return (Criteria) this;
        }

        public Criteria andAddressbookCompanynameGreaterThanOrEqualTo(String value) {
            addCriterion("addressbook_companyname >=", value, "addressbookCompanyname");
            return (Criteria) this;
        }

        public Criteria andAddressbookCompanynameLessThan(String value) {
            addCriterion("addressbook_companyname <", value, "addressbookCompanyname");
            return (Criteria) this;
        }

        public Criteria andAddressbookCompanynameLessThanOrEqualTo(String value) {
            addCriterion("addressbook_companyname <=", value, "addressbookCompanyname");
            return (Criteria) this;
        }

        public Criteria andAddressbookCompanynameLike(String value) {
            addCriterion("addressbook_companyname like", value, "addressbookCompanyname");
            return (Criteria) this;
        }

        public Criteria andAddressbookCompanynameNotLike(String value) {
            addCriterion("addressbook_companyname not like", value, "addressbookCompanyname");
            return (Criteria) this;
        }

        public Criteria andAddressbookCompanynameIn(List<String> values) {
            addCriterion("addressbook_companyname in", values, "addressbookCompanyname");
            return (Criteria) this;
        }

        public Criteria andAddressbookCompanynameNotIn(List<String> values) {
            addCriterion("addressbook_companyname not in", values, "addressbookCompanyname");
            return (Criteria) this;
        }

        public Criteria andAddressbookCompanynameBetween(String value1, String value2) {
            addCriterion("addressbook_companyname between", value1, value2, "addressbookCompanyname");
            return (Criteria) this;
        }

        public Criteria andAddressbookCompanynameNotBetween(String value1, String value2) {
            addCriterion("addressbook_companyname not between", value1, value2, "addressbookCompanyname");
            return (Criteria) this;
        }

        public Criteria andAddressbookCompanyphoneIsNull() {
            addCriterion("addressbook_companyphone is null");
            return (Criteria) this;
        }

        public Criteria andAddressbookCompanyphoneIsNotNull() {
            addCriterion("addressbook_companyphone is not null");
            return (Criteria) this;
        }

        public Criteria andAddressbookCompanyphoneEqualTo(String value) {
            addCriterion("addressbook_companyphone =", value, "addressbookCompanyphone");
            return (Criteria) this;
        }

        public Criteria andAddressbookCompanyphoneNotEqualTo(String value) {
            addCriterion("addressbook_companyphone <>", value, "addressbookCompanyphone");
            return (Criteria) this;
        }

        public Criteria andAddressbookCompanyphoneGreaterThan(String value) {
            addCriterion("addressbook_companyphone >", value, "addressbookCompanyphone");
            return (Criteria) this;
        }

        public Criteria andAddressbookCompanyphoneGreaterThanOrEqualTo(String value) {
            addCriterion("addressbook_companyphone >=", value, "addressbookCompanyphone");
            return (Criteria) this;
        }

        public Criteria andAddressbookCompanyphoneLessThan(String value) {
            addCriterion("addressbook_companyphone <", value, "addressbookCompanyphone");
            return (Criteria) this;
        }

        public Criteria andAddressbookCompanyphoneLessThanOrEqualTo(String value) {
            addCriterion("addressbook_companyphone <=", value, "addressbookCompanyphone");
            return (Criteria) this;
        }

        public Criteria andAddressbookCompanyphoneLike(String value) {
            addCriterion("addressbook_companyphone like", value, "addressbookCompanyphone");
            return (Criteria) this;
        }

        public Criteria andAddressbookCompanyphoneNotLike(String value) {
            addCriterion("addressbook_companyphone not like", value, "addressbookCompanyphone");
            return (Criteria) this;
        }

        public Criteria andAddressbookCompanyphoneIn(List<String> values) {
            addCriterion("addressbook_companyphone in", values, "addressbookCompanyphone");
            return (Criteria) this;
        }

        public Criteria andAddressbookCompanyphoneNotIn(List<String> values) {
            addCriterion("addressbook_companyphone not in", values, "addressbookCompanyphone");
            return (Criteria) this;
        }

        public Criteria andAddressbookCompanyphoneBetween(String value1, String value2) {
            addCriterion("addressbook_companyphone between", value1, value2, "addressbookCompanyphone");
            return (Criteria) this;
        }

        public Criteria andAddressbookCompanyphoneNotBetween(String value1, String value2) {
            addCriterion("addressbook_companyphone not between", value1, value2, "addressbookCompanyphone");
            return (Criteria) this;
        }

        public Criteria andAddressbookCompanyaddressIsNull() {
            addCriterion("addressbook_companyaddress is null");
            return (Criteria) this;
        }

        public Criteria andAddressbookCompanyaddressIsNotNull() {
            addCriterion("addressbook_companyaddress is not null");
            return (Criteria) this;
        }

        public Criteria andAddressbookCompanyaddressEqualTo(String value) {
            addCriterion("addressbook_companyaddress =", value, "addressbookCompanyaddress");
            return (Criteria) this;
        }

        public Criteria andAddressbookCompanyaddressNotEqualTo(String value) {
            addCriterion("addressbook_companyaddress <>", value, "addressbookCompanyaddress");
            return (Criteria) this;
        }

        public Criteria andAddressbookCompanyaddressGreaterThan(String value) {
            addCriterion("addressbook_companyaddress >", value, "addressbookCompanyaddress");
            return (Criteria) this;
        }

        public Criteria andAddressbookCompanyaddressGreaterThanOrEqualTo(String value) {
            addCriterion("addressbook_companyaddress >=", value, "addressbookCompanyaddress");
            return (Criteria) this;
        }

        public Criteria andAddressbookCompanyaddressLessThan(String value) {
            addCriterion("addressbook_companyaddress <", value, "addressbookCompanyaddress");
            return (Criteria) this;
        }

        public Criteria andAddressbookCompanyaddressLessThanOrEqualTo(String value) {
            addCriterion("addressbook_companyaddress <=", value, "addressbookCompanyaddress");
            return (Criteria) this;
        }

        public Criteria andAddressbookCompanyaddressLike(String value) {
            addCriterion("addressbook_companyaddress like", value, "addressbookCompanyaddress");
            return (Criteria) this;
        }

        public Criteria andAddressbookCompanyaddressNotLike(String value) {
            addCriterion("addressbook_companyaddress not like", value, "addressbookCompanyaddress");
            return (Criteria) this;
        }

        public Criteria andAddressbookCompanyaddressIn(List<String> values) {
            addCriterion("addressbook_companyaddress in", values, "addressbookCompanyaddress");
            return (Criteria) this;
        }

        public Criteria andAddressbookCompanyaddressNotIn(List<String> values) {
            addCriterion("addressbook_companyaddress not in", values, "addressbookCompanyaddress");
            return (Criteria) this;
        }

        public Criteria andAddressbookCompanyaddressBetween(String value1, String value2) {
            addCriterion("addressbook_companyaddress between", value1, value2, "addressbookCompanyaddress");
            return (Criteria) this;
        }

        public Criteria andAddressbookCompanyaddressNotBetween(String value1, String value2) {
            addCriterion("addressbook_companyaddress not between", value1, value2, "addressbookCompanyaddress");
            return (Criteria) this;
        }

        public Criteria andAddressbookCompanywebIsNull() {
            addCriterion("addressbook_companyweb is null");
            return (Criteria) this;
        }

        public Criteria andAddressbookCompanywebIsNotNull() {
            addCriterion("addressbook_companyweb is not null");
            return (Criteria) this;
        }

        public Criteria andAddressbookCompanywebEqualTo(String value) {
            addCriterion("addressbook_companyweb =", value, "addressbookCompanyweb");
            return (Criteria) this;
        }

        public Criteria andAddressbookCompanywebNotEqualTo(String value) {
            addCriterion("addressbook_companyweb <>", value, "addressbookCompanyweb");
            return (Criteria) this;
        }

        public Criteria andAddressbookCompanywebGreaterThan(String value) {
            addCriterion("addressbook_companyweb >", value, "addressbookCompanyweb");
            return (Criteria) this;
        }

        public Criteria andAddressbookCompanywebGreaterThanOrEqualTo(String value) {
            addCriterion("addressbook_companyweb >=", value, "addressbookCompanyweb");
            return (Criteria) this;
        }

        public Criteria andAddressbookCompanywebLessThan(String value) {
            addCriterion("addressbook_companyweb <", value, "addressbookCompanyweb");
            return (Criteria) this;
        }

        public Criteria andAddressbookCompanywebLessThanOrEqualTo(String value) {
            addCriterion("addressbook_companyweb <=", value, "addressbookCompanyweb");
            return (Criteria) this;
        }

        public Criteria andAddressbookCompanywebLike(String value) {
            addCriterion("addressbook_companyweb like", value, "addressbookCompanyweb");
            return (Criteria) this;
        }

        public Criteria andAddressbookCompanywebNotLike(String value) {
            addCriterion("addressbook_companyweb not like", value, "addressbookCompanyweb");
            return (Criteria) this;
        }

        public Criteria andAddressbookCompanywebIn(List<String> values) {
            addCriterion("addressbook_companyweb in", values, "addressbookCompanyweb");
            return (Criteria) this;
        }

        public Criteria andAddressbookCompanywebNotIn(List<String> values) {
            addCriterion("addressbook_companyweb not in", values, "addressbookCompanyweb");
            return (Criteria) this;
        }

        public Criteria andAddressbookCompanywebBetween(String value1, String value2) {
            addCriterion("addressbook_companyweb between", value1, value2, "addressbookCompanyweb");
            return (Criteria) this;
        }

        public Criteria andAddressbookCompanywebNotBetween(String value1, String value2) {
            addCriterion("addressbook_companyweb not between", value1, value2, "addressbookCompanyweb");
            return (Criteria) this;
        }

        public Criteria andAddressbookMemoIsNull() {
            addCriterion("addressbook_memo is null");
            return (Criteria) this;
        }

        public Criteria andAddressbookMemoIsNotNull() {
            addCriterion("addressbook_memo is not null");
            return (Criteria) this;
        }

        public Criteria andAddressbookMemoEqualTo(String value) {
            addCriterion("addressbook_memo =", value, "addressbookMemo");
            return (Criteria) this;
        }

        public Criteria andAddressbookMemoNotEqualTo(String value) {
            addCriterion("addressbook_memo <>", value, "addressbookMemo");
            return (Criteria) this;
        }

        public Criteria andAddressbookMemoGreaterThan(String value) {
            addCriterion("addressbook_memo >", value, "addressbookMemo");
            return (Criteria) this;
        }

        public Criteria andAddressbookMemoGreaterThanOrEqualTo(String value) {
            addCriterion("addressbook_memo >=", value, "addressbookMemo");
            return (Criteria) this;
        }

        public Criteria andAddressbookMemoLessThan(String value) {
            addCriterion("addressbook_memo <", value, "addressbookMemo");
            return (Criteria) this;
        }

        public Criteria andAddressbookMemoLessThanOrEqualTo(String value) {
            addCriterion("addressbook_memo <=", value, "addressbookMemo");
            return (Criteria) this;
        }

        public Criteria andAddressbookMemoLike(String value) {
            addCriterion("addressbook_memo like", value, "addressbookMemo");
            return (Criteria) this;
        }

        public Criteria andAddressbookMemoNotLike(String value) {
            addCriterion("addressbook_memo not like", value, "addressbookMemo");
            return (Criteria) this;
        }

        public Criteria andAddressbookMemoIn(List<String> values) {
            addCriterion("addressbook_memo in", values, "addressbookMemo");
            return (Criteria) this;
        }

        public Criteria andAddressbookMemoNotIn(List<String> values) {
            addCriterion("addressbook_memo not in", values, "addressbookMemo");
            return (Criteria) this;
        }

        public Criteria andAddressbookMemoBetween(String value1, String value2) {
            addCriterion("addressbook_memo between", value1, value2, "addressbookMemo");
            return (Criteria) this;
        }

        public Criteria andAddressbookMemoNotBetween(String value1, String value2) {
            addCriterion("addressbook_memo not between", value1, value2, "addressbookMemo");
            return (Criteria) this;
        }

        public Criteria andAddressbookEnableIsNull() {
            addCriterion("addressbook_enable is null");
            return (Criteria) this;
        }

        public Criteria andAddressbookEnableIsNotNull() {
            addCriterion("addressbook_enable is not null");
            return (Criteria) this;
        }

        public Criteria andAddressbookEnableEqualTo(String value) {
            addCriterion("addressbook_enable =", value, "addressbookEnable");
            return (Criteria) this;
        }

        public Criteria andAddressbookEnableNotEqualTo(String value) {
            addCriterion("addressbook_enable <>", value, "addressbookEnable");
            return (Criteria) this;
        }

        public Criteria andAddressbookEnableGreaterThan(String value) {
            addCriterion("addressbook_enable >", value, "addressbookEnable");
            return (Criteria) this;
        }

        public Criteria andAddressbookEnableGreaterThanOrEqualTo(String value) {
            addCriterion("addressbook_enable >=", value, "addressbookEnable");
            return (Criteria) this;
        }

        public Criteria andAddressbookEnableLessThan(String value) {
            addCriterion("addressbook_enable <", value, "addressbookEnable");
            return (Criteria) this;
        }

        public Criteria andAddressbookEnableLessThanOrEqualTo(String value) {
            addCriterion("addressbook_enable <=", value, "addressbookEnable");
            return (Criteria) this;
        }

        public Criteria andAddressbookEnableLike(String value) {
            addCriterion("addressbook_enable like", value, "addressbookEnable");
            return (Criteria) this;
        }

        public Criteria andAddressbookEnableNotLike(String value) {
            addCriterion("addressbook_enable not like", value, "addressbookEnable");
            return (Criteria) this;
        }

        public Criteria andAddressbookEnableIn(List<String> values) {
            addCriterion("addressbook_enable in", values, "addressbookEnable");
            return (Criteria) this;
        }

        public Criteria andAddressbookEnableNotIn(List<String> values) {
            addCriterion("addressbook_enable not in", values, "addressbookEnable");
            return (Criteria) this;
        }

        public Criteria andAddressbookEnableBetween(String value1, String value2) {
            addCriterion("addressbook_enable between", value1, value2, "addressbookEnable");
            return (Criteria) this;
        }

        public Criteria andAddressbookEnableNotBetween(String value1, String value2) {
            addCriterion("addressbook_enable not between", value1, value2, "addressbookEnable");
            return (Criteria) this;
        }

        public Criteria andAddressbookJobIsNull() {
            addCriterion("addressbook_job is null");
            return (Criteria) this;
        }

        public Criteria andAddressbookJobIsNotNull() {
            addCriterion("addressbook_job is not null");
            return (Criteria) this;
        }

        public Criteria andAddressbookJobEqualTo(String value) {
            addCriterion("addressbook_job =", value, "addressbookJob");
            return (Criteria) this;
        }

        public Criteria andAddressbookJobNotEqualTo(String value) {
            addCriterion("addressbook_job <>", value, "addressbookJob");
            return (Criteria) this;
        }

        public Criteria andAddressbookJobGreaterThan(String value) {
            addCriterion("addressbook_job >", value, "addressbookJob");
            return (Criteria) this;
        }

        public Criteria andAddressbookJobGreaterThanOrEqualTo(String value) {
            addCriterion("addressbook_job >=", value, "addressbookJob");
            return (Criteria) this;
        }

        public Criteria andAddressbookJobLessThan(String value) {
            addCriterion("addressbook_job <", value, "addressbookJob");
            return (Criteria) this;
        }

        public Criteria andAddressbookJobLessThanOrEqualTo(String value) {
            addCriterion("addressbook_job <=", value, "addressbookJob");
            return (Criteria) this;
        }

        public Criteria andAddressbookJobLike(String value) {
            addCriterion("addressbook_job like", value, "addressbookJob");
            return (Criteria) this;
        }

        public Criteria andAddressbookJobNotLike(String value) {
            addCriterion("addressbook_job not like", value, "addressbookJob");
            return (Criteria) this;
        }

        public Criteria andAddressbookJobIn(List<String> values) {
            addCriterion("addressbook_job in", values, "addressbookJob");
            return (Criteria) this;
        }

        public Criteria andAddressbookJobNotIn(List<String> values) {
            addCriterion("addressbook_job not in", values, "addressbookJob");
            return (Criteria) this;
        }

        public Criteria andAddressbookJobBetween(String value1, String value2) {
            addCriterion("addressbook_job between", value1, value2, "addressbookJob");
            return (Criteria) this;
        }

        public Criteria andAddressbookJobNotBetween(String value1, String value2) {
            addCriterion("addressbook_job not between", value1, value2, "addressbookJob");
            return (Criteria) this;
        }

        public Criteria andAddressbookStaffIsNull() {
            addCriterion("addressbook_staff is null");
            return (Criteria) this;
        }

        public Criteria andAddressbookStaffIsNotNull() {
            addCriterion("addressbook_staff is not null");
            return (Criteria) this;
        }

        public Criteria andAddressbookStaffEqualTo(Long value) {
            addCriterion("addressbook_staff =", value, "addressbookStaff");
            return (Criteria) this;
        }

        public Criteria andAddressbookStaffNotEqualTo(Long value) {
            addCriterion("addressbook_staff <>", value, "addressbookStaff");
            return (Criteria) this;
        }

        public Criteria andAddressbookStaffGreaterThan(Long value) {
            addCriterion("addressbook_staff >", value, "addressbookStaff");
            return (Criteria) this;
        }

        public Criteria andAddressbookStaffGreaterThanOrEqualTo(Long value) {
            addCriterion("addressbook_staff >=", value, "addressbookStaff");
            return (Criteria) this;
        }

        public Criteria andAddressbookStaffLessThan(Long value) {
            addCriterion("addressbook_staff <", value, "addressbookStaff");
            return (Criteria) this;
        }

        public Criteria andAddressbookStaffLessThanOrEqualTo(Long value) {
            addCriterion("addressbook_staff <=", value, "addressbookStaff");
            return (Criteria) this;
        }

        public Criteria andAddressbookStaffIn(List<Long> values) {
            addCriterion("addressbook_staff in", values, "addressbookStaff");
            return (Criteria) this;
        }

        public Criteria andAddressbookStaffNotIn(List<Long> values) {
            addCriterion("addressbook_staff not in", values, "addressbookStaff");
            return (Criteria) this;
        }

        public Criteria andAddressbookStaffBetween(Long value1, Long value2) {
            addCriterion("addressbook_staff between", value1, value2, "addressbookStaff");
            return (Criteria) this;
        }

        public Criteria andAddressbookStaffNotBetween(Long value1, Long value2) {
            addCriterion("addressbook_staff not between", value1, value2, "addressbookStaff");
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