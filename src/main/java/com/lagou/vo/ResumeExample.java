package com.lagou.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ResumeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResumeExample() {
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

        public Criteria andResumeidIsNull() {
            addCriterion("resumeId is null");
            return (Criteria) this;
        }

        public Criteria andResumeidIsNotNull() {
            addCriterion("resumeId is not null");
            return (Criteria) this;
        }

        public Criteria andResumeidEqualTo(Integer value) {
            addCriterion("resumeId =", value, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidNotEqualTo(Integer value) {
            addCriterion("resumeId <>", value, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidGreaterThan(Integer value) {
            addCriterion("resumeId >", value, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("resumeId >=", value, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidLessThan(Integer value) {
            addCriterion("resumeId <", value, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidLessThanOrEqualTo(Integer value) {
            addCriterion("resumeId <=", value, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidIn(List<Integer> values) {
            addCriterion("resumeId in", values, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidNotIn(List<Integer> values) {
            addCriterion("resumeId not in", values, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidBetween(Integer value1, Integer value2) {
            addCriterion("resumeId between", value1, value2, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidNotBetween(Integer value1, Integer value2) {
            addCriterion("resumeId not between", value1, value2, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumenameIsNull() {
            addCriterion("resumeName is null");
            return (Criteria) this;
        }

        public Criteria andResumenameIsNotNull() {
            addCriterion("resumeName is not null");
            return (Criteria) this;
        }

        public Criteria andResumenameEqualTo(String value) {
            addCriterion("resumeName =", value, "resumename");
            return (Criteria) this;
        }

        public Criteria andResumenameNotEqualTo(String value) {
            addCriterion("resumeName <>", value, "resumename");
            return (Criteria) this;
        }

        public Criteria andResumenameGreaterThan(String value) {
            addCriterion("resumeName >", value, "resumename");
            return (Criteria) this;
        }

        public Criteria andResumenameGreaterThanOrEqualTo(String value) {
            addCriterion("resumeName >=", value, "resumename");
            return (Criteria) this;
        }

        public Criteria andResumenameLessThan(String value) {
            addCriterion("resumeName <", value, "resumename");
            return (Criteria) this;
        }

        public Criteria andResumenameLessThanOrEqualTo(String value) {
            addCriterion("resumeName <=", value, "resumename");
            return (Criteria) this;
        }

        public Criteria andResumenameLike(String value) {
            addCriterion("resumeName like", value, "resumename");
            return (Criteria) this;
        }

        public Criteria andResumenameNotLike(String value) {
            addCriterion("resumeName not like", value, "resumename");
            return (Criteria) this;
        }

        public Criteria andResumenameIn(List<String> values) {
            addCriterion("resumeName in", values, "resumename");
            return (Criteria) this;
        }

        public Criteria andResumenameNotIn(List<String> values) {
            addCriterion("resumeName not in", values, "resumename");
            return (Criteria) this;
        }

        public Criteria andResumenameBetween(String value1, String value2) {
            addCriterion("resumeName between", value1, value2, "resumename");
            return (Criteria) this;
        }

        public Criteria andResumenameNotBetween(String value1, String value2) {
            addCriterion("resumeName not between", value1, value2, "resumename");
            return (Criteria) this;
        }

        public Criteria andResumegenderIsNull() {
            addCriterion("resumeGender is null");
            return (Criteria) this;
        }

        public Criteria andResumegenderIsNotNull() {
            addCriterion("resumeGender is not null");
            return (Criteria) this;
        }

        public Criteria andResumegenderEqualTo(Integer value) {
            addCriterion("resumeGender =", value, "resumegender");
            return (Criteria) this;
        }

        public Criteria andResumegenderNotEqualTo(Integer value) {
            addCriterion("resumeGender <>", value, "resumegender");
            return (Criteria) this;
        }

        public Criteria andResumegenderGreaterThan(Integer value) {
            addCriterion("resumeGender >", value, "resumegender");
            return (Criteria) this;
        }

        public Criteria andResumegenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("resumeGender >=", value, "resumegender");
            return (Criteria) this;
        }

        public Criteria andResumegenderLessThan(Integer value) {
            addCriterion("resumeGender <", value, "resumegender");
            return (Criteria) this;
        }

        public Criteria andResumegenderLessThanOrEqualTo(Integer value) {
            addCriterion("resumeGender <=", value, "resumegender");
            return (Criteria) this;
        }

        public Criteria andResumegenderIn(List<Integer> values) {
            addCriterion("resumeGender in", values, "resumegender");
            return (Criteria) this;
        }

        public Criteria andResumegenderNotIn(List<Integer> values) {
            addCriterion("resumeGender not in", values, "resumegender");
            return (Criteria) this;
        }

        public Criteria andResumegenderBetween(Integer value1, Integer value2) {
            addCriterion("resumeGender between", value1, value2, "resumegender");
            return (Criteria) this;
        }

        public Criteria andResumegenderNotBetween(Integer value1, Integer value2) {
            addCriterion("resumeGender not between", value1, value2, "resumegender");
            return (Criteria) this;
        }

        public Criteria andResumeexperienceIsNull() {
            addCriterion("resumeExperience is null");
            return (Criteria) this;
        }

        public Criteria andResumeexperienceIsNotNull() {
            addCriterion("resumeExperience is not null");
            return (Criteria) this;
        }

        public Criteria andResumeexperienceEqualTo(String value) {
            addCriterion("resumeExperience =", value, "resumeexperience");
            return (Criteria) this;
        }

        public Criteria andResumeexperienceNotEqualTo(String value) {
            addCriterion("resumeExperience <>", value, "resumeexperience");
            return (Criteria) this;
        }

        public Criteria andResumeexperienceGreaterThan(String value) {
            addCriterion("resumeExperience >", value, "resumeexperience");
            return (Criteria) this;
        }

        public Criteria andResumeexperienceGreaterThanOrEqualTo(String value) {
            addCriterion("resumeExperience >=", value, "resumeexperience");
            return (Criteria) this;
        }

        public Criteria andResumeexperienceLessThan(String value) {
            addCriterion("resumeExperience <", value, "resumeexperience");
            return (Criteria) this;
        }

        public Criteria andResumeexperienceLessThanOrEqualTo(String value) {
            addCriterion("resumeExperience <=", value, "resumeexperience");
            return (Criteria) this;
        }

        public Criteria andResumeexperienceLike(String value) {
            addCriterion("resumeExperience like", value, "resumeexperience");
            return (Criteria) this;
        }

        public Criteria andResumeexperienceNotLike(String value) {
            addCriterion("resumeExperience not like", value, "resumeexperience");
            return (Criteria) this;
        }

        public Criteria andResumeexperienceIn(List<String> values) {
            addCriterion("resumeExperience in", values, "resumeexperience");
            return (Criteria) this;
        }

        public Criteria andResumeexperienceNotIn(List<String> values) {
            addCriterion("resumeExperience not in", values, "resumeexperience");
            return (Criteria) this;
        }

        public Criteria andResumeexperienceBetween(String value1, String value2) {
            addCriterion("resumeExperience between", value1, value2, "resumeexperience");
            return (Criteria) this;
        }

        public Criteria andResumeexperienceNotBetween(String value1, String value2) {
            addCriterion("resumeExperience not between", value1, value2, "resumeexperience");
            return (Criteria) this;
        }

        public Criteria andResumephoneIsNull() {
            addCriterion("resumePhone is null");
            return (Criteria) this;
        }

        public Criteria andResumephoneIsNotNull() {
            addCriterion("resumePhone is not null");
            return (Criteria) this;
        }

        public Criteria andResumephoneEqualTo(String value) {
            addCriterion("resumePhone =", value, "resumephone");
            return (Criteria) this;
        }

        public Criteria andResumephoneNotEqualTo(String value) {
            addCriterion("resumePhone <>", value, "resumephone");
            return (Criteria) this;
        }

        public Criteria andResumephoneGreaterThan(String value) {
            addCriterion("resumePhone >", value, "resumephone");
            return (Criteria) this;
        }

        public Criteria andResumephoneGreaterThanOrEqualTo(String value) {
            addCriterion("resumePhone >=", value, "resumephone");
            return (Criteria) this;
        }

        public Criteria andResumephoneLessThan(String value) {
            addCriterion("resumePhone <", value, "resumephone");
            return (Criteria) this;
        }

        public Criteria andResumephoneLessThanOrEqualTo(String value) {
            addCriterion("resumePhone <=", value, "resumephone");
            return (Criteria) this;
        }

        public Criteria andResumephoneLike(String value) {
            addCriterion("resumePhone like", value, "resumephone");
            return (Criteria) this;
        }

        public Criteria andResumephoneNotLike(String value) {
            addCriterion("resumePhone not like", value, "resumephone");
            return (Criteria) this;
        }

        public Criteria andResumephoneIn(List<String> values) {
            addCriterion("resumePhone in", values, "resumephone");
            return (Criteria) this;
        }

        public Criteria andResumephoneNotIn(List<String> values) {
            addCriterion("resumePhone not in", values, "resumephone");
            return (Criteria) this;
        }

        public Criteria andResumephoneBetween(String value1, String value2) {
            addCriterion("resumePhone between", value1, value2, "resumephone");
            return (Criteria) this;
        }

        public Criteria andResumephoneNotBetween(String value1, String value2) {
            addCriterion("resumePhone not between", value1, value2, "resumephone");
            return (Criteria) this;
        }

        public Criteria andResumeemailIsNull() {
            addCriterion("resumeEmail is null");
            return (Criteria) this;
        }

        public Criteria andResumeemailIsNotNull() {
            addCriterion("resumeEmail is not null");
            return (Criteria) this;
        }

        public Criteria andResumeemailEqualTo(String value) {
            addCriterion("resumeEmail =", value, "resumeemail");
            return (Criteria) this;
        }

        public Criteria andResumeemailNotEqualTo(String value) {
            addCriterion("resumeEmail <>", value, "resumeemail");
            return (Criteria) this;
        }

        public Criteria andResumeemailGreaterThan(String value) {
            addCriterion("resumeEmail >", value, "resumeemail");
            return (Criteria) this;
        }

        public Criteria andResumeemailGreaterThanOrEqualTo(String value) {
            addCriterion("resumeEmail >=", value, "resumeemail");
            return (Criteria) this;
        }

        public Criteria andResumeemailLessThan(String value) {
            addCriterion("resumeEmail <", value, "resumeemail");
            return (Criteria) this;
        }

        public Criteria andResumeemailLessThanOrEqualTo(String value) {
            addCriterion("resumeEmail <=", value, "resumeemail");
            return (Criteria) this;
        }

        public Criteria andResumeemailLike(String value) {
            addCriterion("resumeEmail like", value, "resumeemail");
            return (Criteria) this;
        }

        public Criteria andResumeemailNotLike(String value) {
            addCriterion("resumeEmail not like", value, "resumeemail");
            return (Criteria) this;
        }

        public Criteria andResumeemailIn(List<String> values) {
            addCriterion("resumeEmail in", values, "resumeemail");
            return (Criteria) this;
        }

        public Criteria andResumeemailNotIn(List<String> values) {
            addCriterion("resumeEmail not in", values, "resumeemail");
            return (Criteria) this;
        }

        public Criteria andResumeemailBetween(String value1, String value2) {
            addCriterion("resumeEmail between", value1, value2, "resumeemail");
            return (Criteria) this;
        }

        public Criteria andResumeemailNotBetween(String value1, String value2) {
            addCriterion("resumeEmail not between", value1, value2, "resumeemail");
            return (Criteria) this;
        }

        public Criteria andResumecurrentstateIsNull() {
            addCriterion("resumeCurrentState is null");
            return (Criteria) this;
        }

        public Criteria andResumecurrentstateIsNotNull() {
            addCriterion("resumeCurrentState is not null");
            return (Criteria) this;
        }

        public Criteria andResumecurrentstateEqualTo(String value) {
            addCriterion("resumeCurrentState =", value, "resumecurrentstate");
            return (Criteria) this;
        }

        public Criteria andResumecurrentstateNotEqualTo(String value) {
            addCriterion("resumeCurrentState <>", value, "resumecurrentstate");
            return (Criteria) this;
        }

        public Criteria andResumecurrentstateGreaterThan(String value) {
            addCriterion("resumeCurrentState >", value, "resumecurrentstate");
            return (Criteria) this;
        }

        public Criteria andResumecurrentstateGreaterThanOrEqualTo(String value) {
            addCriterion("resumeCurrentState >=", value, "resumecurrentstate");
            return (Criteria) this;
        }

        public Criteria andResumecurrentstateLessThan(String value) {
            addCriterion("resumeCurrentState <", value, "resumecurrentstate");
            return (Criteria) this;
        }

        public Criteria andResumecurrentstateLessThanOrEqualTo(String value) {
            addCriterion("resumeCurrentState <=", value, "resumecurrentstate");
            return (Criteria) this;
        }

        public Criteria andResumecurrentstateLike(String value) {
            addCriterion("resumeCurrentState like", value, "resumecurrentstate");
            return (Criteria) this;
        }

        public Criteria andResumecurrentstateNotLike(String value) {
            addCriterion("resumeCurrentState not like", value, "resumecurrentstate");
            return (Criteria) this;
        }

        public Criteria andResumecurrentstateIn(List<String> values) {
            addCriterion("resumeCurrentState in", values, "resumecurrentstate");
            return (Criteria) this;
        }

        public Criteria andResumecurrentstateNotIn(List<String> values) {
            addCriterion("resumeCurrentState not in", values, "resumecurrentstate");
            return (Criteria) this;
        }

        public Criteria andResumecurrentstateBetween(String value1, String value2) {
            addCriterion("resumeCurrentState between", value1, value2, "resumecurrentstate");
            return (Criteria) this;
        }

        public Criteria andResumecurrentstateNotBetween(String value1, String value2) {
            addCriterion("resumeCurrentState not between", value1, value2, "resumecurrentstate");
            return (Criteria) this;
        }

        public Criteria andResumeexpectcityIsNull() {
            addCriterion("resumeExpectCity is null");
            return (Criteria) this;
        }

        public Criteria andResumeexpectcityIsNotNull() {
            addCriterion("resumeExpectCity is not null");
            return (Criteria) this;
        }

        public Criteria andResumeexpectcityEqualTo(String value) {
            addCriterion("resumeExpectCity =", value, "resumeexpectcity");
            return (Criteria) this;
        }

        public Criteria andResumeexpectcityNotEqualTo(String value) {
            addCriterion("resumeExpectCity <>", value, "resumeexpectcity");
            return (Criteria) this;
        }

        public Criteria andResumeexpectcityGreaterThan(String value) {
            addCriterion("resumeExpectCity >", value, "resumeexpectcity");
            return (Criteria) this;
        }

        public Criteria andResumeexpectcityGreaterThanOrEqualTo(String value) {
            addCriterion("resumeExpectCity >=", value, "resumeexpectcity");
            return (Criteria) this;
        }

        public Criteria andResumeexpectcityLessThan(String value) {
            addCriterion("resumeExpectCity <", value, "resumeexpectcity");
            return (Criteria) this;
        }

        public Criteria andResumeexpectcityLessThanOrEqualTo(String value) {
            addCriterion("resumeExpectCity <=", value, "resumeexpectcity");
            return (Criteria) this;
        }

        public Criteria andResumeexpectcityLike(String value) {
            addCriterion("resumeExpectCity like", value, "resumeexpectcity");
            return (Criteria) this;
        }

        public Criteria andResumeexpectcityNotLike(String value) {
            addCriterion("resumeExpectCity not like", value, "resumeexpectcity");
            return (Criteria) this;
        }

        public Criteria andResumeexpectcityIn(List<String> values) {
            addCriterion("resumeExpectCity in", values, "resumeexpectcity");
            return (Criteria) this;
        }

        public Criteria andResumeexpectcityNotIn(List<String> values) {
            addCriterion("resumeExpectCity not in", values, "resumeexpectcity");
            return (Criteria) this;
        }

        public Criteria andResumeexpectcityBetween(String value1, String value2) {
            addCriterion("resumeExpectCity between", value1, value2, "resumeexpectcity");
            return (Criteria) this;
        }

        public Criteria andResumeexpectcityNotBetween(String value1, String value2) {
            addCriterion("resumeExpectCity not between", value1, value2, "resumeexpectcity");
            return (Criteria) this;
        }

        public Criteria andResumeworkingpropertyIsNull() {
            addCriterion("resumeWorkingProperty is null");
            return (Criteria) this;
        }

        public Criteria andResumeworkingpropertyIsNotNull() {
            addCriterion("resumeWorkingProperty is not null");
            return (Criteria) this;
        }

        public Criteria andResumeworkingpropertyEqualTo(String value) {
            addCriterion("resumeWorkingProperty =", value, "resumeworkingproperty");
            return (Criteria) this;
        }

        public Criteria andResumeworkingpropertyNotEqualTo(String value) {
            addCriterion("resumeWorkingProperty <>", value, "resumeworkingproperty");
            return (Criteria) this;
        }

        public Criteria andResumeworkingpropertyGreaterThan(String value) {
            addCriterion("resumeWorkingProperty >", value, "resumeworkingproperty");
            return (Criteria) this;
        }

        public Criteria andResumeworkingpropertyGreaterThanOrEqualTo(String value) {
            addCriterion("resumeWorkingProperty >=", value, "resumeworkingproperty");
            return (Criteria) this;
        }

        public Criteria andResumeworkingpropertyLessThan(String value) {
            addCriterion("resumeWorkingProperty <", value, "resumeworkingproperty");
            return (Criteria) this;
        }

        public Criteria andResumeworkingpropertyLessThanOrEqualTo(String value) {
            addCriterion("resumeWorkingProperty <=", value, "resumeworkingproperty");
            return (Criteria) this;
        }

        public Criteria andResumeworkingpropertyLike(String value) {
            addCriterion("resumeWorkingProperty like", value, "resumeworkingproperty");
            return (Criteria) this;
        }

        public Criteria andResumeworkingpropertyNotLike(String value) {
            addCriterion("resumeWorkingProperty not like", value, "resumeworkingproperty");
            return (Criteria) this;
        }

        public Criteria andResumeworkingpropertyIn(List<String> values) {
            addCriterion("resumeWorkingProperty in", values, "resumeworkingproperty");
            return (Criteria) this;
        }

        public Criteria andResumeworkingpropertyNotIn(List<String> values) {
            addCriterion("resumeWorkingProperty not in", values, "resumeworkingproperty");
            return (Criteria) this;
        }

        public Criteria andResumeworkingpropertyBetween(String value1, String value2) {
            addCriterion("resumeWorkingProperty between", value1, value2, "resumeworkingproperty");
            return (Criteria) this;
        }

        public Criteria andResumeworkingpropertyNotBetween(String value1, String value2) {
            addCriterion("resumeWorkingProperty not between", value1, value2, "resumeworkingproperty");
            return (Criteria) this;
        }

        public Criteria andResumeexpectpositionIsNull() {
            addCriterion("resumeExpectPosition is null");
            return (Criteria) this;
        }

        public Criteria andResumeexpectpositionIsNotNull() {
            addCriterion("resumeExpectPosition is not null");
            return (Criteria) this;
        }

        public Criteria andResumeexpectpositionEqualTo(String value) {
            addCriterion("resumeExpectPosition =", value, "resumeexpectposition");
            return (Criteria) this;
        }

        public Criteria andResumeexpectpositionNotEqualTo(String value) {
            addCriterion("resumeExpectPosition <>", value, "resumeexpectposition");
            return (Criteria) this;
        }

        public Criteria andResumeexpectpositionGreaterThan(String value) {
            addCriterion("resumeExpectPosition >", value, "resumeexpectposition");
            return (Criteria) this;
        }

        public Criteria andResumeexpectpositionGreaterThanOrEqualTo(String value) {
            addCriterion("resumeExpectPosition >=", value, "resumeexpectposition");
            return (Criteria) this;
        }

        public Criteria andResumeexpectpositionLessThan(String value) {
            addCriterion("resumeExpectPosition <", value, "resumeexpectposition");
            return (Criteria) this;
        }

        public Criteria andResumeexpectpositionLessThanOrEqualTo(String value) {
            addCriterion("resumeExpectPosition <=", value, "resumeexpectposition");
            return (Criteria) this;
        }

        public Criteria andResumeexpectpositionLike(String value) {
            addCriterion("resumeExpectPosition like", value, "resumeexpectposition");
            return (Criteria) this;
        }

        public Criteria andResumeexpectpositionNotLike(String value) {
            addCriterion("resumeExpectPosition not like", value, "resumeexpectposition");
            return (Criteria) this;
        }

        public Criteria andResumeexpectpositionIn(List<String> values) {
            addCriterion("resumeExpectPosition in", values, "resumeexpectposition");
            return (Criteria) this;
        }

        public Criteria andResumeexpectpositionNotIn(List<String> values) {
            addCriterion("resumeExpectPosition not in", values, "resumeexpectposition");
            return (Criteria) this;
        }

        public Criteria andResumeexpectpositionBetween(String value1, String value2) {
            addCriterion("resumeExpectPosition between", value1, value2, "resumeexpectposition");
            return (Criteria) this;
        }

        public Criteria andResumeexpectpositionNotBetween(String value1, String value2) {
            addCriterion("resumeExpectPosition not between", value1, value2, "resumeexpectposition");
            return (Criteria) this;
        }

        public Criteria andResumeexpectsalaryIsNull() {
            addCriterion("resumeExpectSalary is null");
            return (Criteria) this;
        }

        public Criteria andResumeexpectsalaryIsNotNull() {
            addCriterion("resumeExpectSalary is not null");
            return (Criteria) this;
        }

        public Criteria andResumeexpectsalaryEqualTo(String value) {
            addCriterion("resumeExpectSalary =", value, "resumeexpectsalary");
            return (Criteria) this;
        }

        public Criteria andResumeexpectsalaryNotEqualTo(String value) {
            addCriterion("resumeExpectSalary <>", value, "resumeexpectsalary");
            return (Criteria) this;
        }

        public Criteria andResumeexpectsalaryGreaterThan(String value) {
            addCriterion("resumeExpectSalary >", value, "resumeexpectsalary");
            return (Criteria) this;
        }

        public Criteria andResumeexpectsalaryGreaterThanOrEqualTo(String value) {
            addCriterion("resumeExpectSalary >=", value, "resumeexpectsalary");
            return (Criteria) this;
        }

        public Criteria andResumeexpectsalaryLessThan(String value) {
            addCriterion("resumeExpectSalary <", value, "resumeexpectsalary");
            return (Criteria) this;
        }

        public Criteria andResumeexpectsalaryLessThanOrEqualTo(String value) {
            addCriterion("resumeExpectSalary <=", value, "resumeexpectsalary");
            return (Criteria) this;
        }

        public Criteria andResumeexpectsalaryLike(String value) {
            addCriterion("resumeExpectSalary like", value, "resumeexpectsalary");
            return (Criteria) this;
        }

        public Criteria andResumeexpectsalaryNotLike(String value) {
            addCriterion("resumeExpectSalary not like", value, "resumeexpectsalary");
            return (Criteria) this;
        }

        public Criteria andResumeexpectsalaryIn(List<String> values) {
            addCriterion("resumeExpectSalary in", values, "resumeexpectsalary");
            return (Criteria) this;
        }

        public Criteria andResumeexpectsalaryNotIn(List<String> values) {
            addCriterion("resumeExpectSalary not in", values, "resumeexpectsalary");
            return (Criteria) this;
        }

        public Criteria andResumeexpectsalaryBetween(String value1, String value2) {
            addCriterion("resumeExpectSalary between", value1, value2, "resumeexpectsalary");
            return (Criteria) this;
        }

        public Criteria andResumeexpectsalaryNotBetween(String value1, String value2) {
            addCriterion("resumeExpectSalary not between", value1, value2, "resumeexpectsalary");
            return (Criteria) this;
        }

        public Criteria andResumecompanynameIsNull() {
            addCriterion("resumeCompanyName is null");
            return (Criteria) this;
        }

        public Criteria andResumecompanynameIsNotNull() {
            addCriterion("resumeCompanyName is not null");
            return (Criteria) this;
        }

        public Criteria andResumecompanynameEqualTo(String value) {
            addCriterion("resumeCompanyName =", value, "resumecompanyname");
            return (Criteria) this;
        }

        public Criteria andResumecompanynameNotEqualTo(String value) {
            addCriterion("resumeCompanyName <>", value, "resumecompanyname");
            return (Criteria) this;
        }

        public Criteria andResumecompanynameGreaterThan(String value) {
            addCriterion("resumeCompanyName >", value, "resumecompanyname");
            return (Criteria) this;
        }

        public Criteria andResumecompanynameGreaterThanOrEqualTo(String value) {
            addCriterion("resumeCompanyName >=", value, "resumecompanyname");
            return (Criteria) this;
        }

        public Criteria andResumecompanynameLessThan(String value) {
            addCriterion("resumeCompanyName <", value, "resumecompanyname");
            return (Criteria) this;
        }

        public Criteria andResumecompanynameLessThanOrEqualTo(String value) {
            addCriterion("resumeCompanyName <=", value, "resumecompanyname");
            return (Criteria) this;
        }

        public Criteria andResumecompanynameLike(String value) {
            addCriterion("resumeCompanyName like", value, "resumecompanyname");
            return (Criteria) this;
        }

        public Criteria andResumecompanynameNotLike(String value) {
            addCriterion("resumeCompanyName not like", value, "resumecompanyname");
            return (Criteria) this;
        }

        public Criteria andResumecompanynameIn(List<String> values) {
            addCriterion("resumeCompanyName in", values, "resumecompanyname");
            return (Criteria) this;
        }

        public Criteria andResumecompanynameNotIn(List<String> values) {
            addCriterion("resumeCompanyName not in", values, "resumecompanyname");
            return (Criteria) this;
        }

        public Criteria andResumecompanynameBetween(String value1, String value2) {
            addCriterion("resumeCompanyName between", value1, value2, "resumecompanyname");
            return (Criteria) this;
        }

        public Criteria andResumecompanynameNotBetween(String value1, String value2) {
            addCriterion("resumeCompanyName not between", value1, value2, "resumecompanyname");
            return (Criteria) this;
        }

        public Criteria andResumepositionnameIsNull() {
            addCriterion("resumePositionName is null");
            return (Criteria) this;
        }

        public Criteria andResumepositionnameIsNotNull() {
            addCriterion("resumePositionName is not null");
            return (Criteria) this;
        }

        public Criteria andResumepositionnameEqualTo(String value) {
            addCriterion("resumePositionName =", value, "resumepositionname");
            return (Criteria) this;
        }

        public Criteria andResumepositionnameNotEqualTo(String value) {
            addCriterion("resumePositionName <>", value, "resumepositionname");
            return (Criteria) this;
        }

        public Criteria andResumepositionnameGreaterThan(String value) {
            addCriterion("resumePositionName >", value, "resumepositionname");
            return (Criteria) this;
        }

        public Criteria andResumepositionnameGreaterThanOrEqualTo(String value) {
            addCriterion("resumePositionName >=", value, "resumepositionname");
            return (Criteria) this;
        }

        public Criteria andResumepositionnameLessThan(String value) {
            addCriterion("resumePositionName <", value, "resumepositionname");
            return (Criteria) this;
        }

        public Criteria andResumepositionnameLessThanOrEqualTo(String value) {
            addCriterion("resumePositionName <=", value, "resumepositionname");
            return (Criteria) this;
        }

        public Criteria andResumepositionnameLike(String value) {
            addCriterion("resumePositionName like", value, "resumepositionname");
            return (Criteria) this;
        }

        public Criteria andResumepositionnameNotLike(String value) {
            addCriterion("resumePositionName not like", value, "resumepositionname");
            return (Criteria) this;
        }

        public Criteria andResumepositionnameIn(List<String> values) {
            addCriterion("resumePositionName in", values, "resumepositionname");
            return (Criteria) this;
        }

        public Criteria andResumepositionnameNotIn(List<String> values) {
            addCriterion("resumePositionName not in", values, "resumepositionname");
            return (Criteria) this;
        }

        public Criteria andResumepositionnameBetween(String value1, String value2) {
            addCriterion("resumePositionName between", value1, value2, "resumepositionname");
            return (Criteria) this;
        }

        public Criteria andResumepositionnameNotBetween(String value1, String value2) {
            addCriterion("resumePositionName not between", value1, value2, "resumepositionname");
            return (Criteria) this;
        }

        public Criteria andResumeworkyearstartIsNull() {
            addCriterion("resumeWorkYearStart is null");
            return (Criteria) this;
        }

        public Criteria andResumeworkyearstartIsNotNull() {
            addCriterion("resumeWorkYearStart is not null");
            return (Criteria) this;
        }

        public Criteria andResumeworkyearstartEqualTo(String value) {
            addCriterion("resumeWorkYearStart =", value, "resumeworkyearstart");
            return (Criteria) this;
        }

        public Criteria andResumeworkyearstartNotEqualTo(String value) {
            addCriterion("resumeWorkYearStart <>", value, "resumeworkyearstart");
            return (Criteria) this;
        }

        public Criteria andResumeworkyearstartGreaterThan(String value) {
            addCriterion("resumeWorkYearStart >", value, "resumeworkyearstart");
            return (Criteria) this;
        }

        public Criteria andResumeworkyearstartGreaterThanOrEqualTo(String value) {
            addCriterion("resumeWorkYearStart >=", value, "resumeworkyearstart");
            return (Criteria) this;
        }

        public Criteria andResumeworkyearstartLessThan(String value) {
            addCriterion("resumeWorkYearStart <", value, "resumeworkyearstart");
            return (Criteria) this;
        }

        public Criteria andResumeworkyearstartLessThanOrEqualTo(String value) {
            addCriterion("resumeWorkYearStart <=", value, "resumeworkyearstart");
            return (Criteria) this;
        }

        public Criteria andResumeworkyearstartLike(String value) {
            addCriterion("resumeWorkYearStart like", value, "resumeworkyearstart");
            return (Criteria) this;
        }

        public Criteria andResumeworkyearstartNotLike(String value) {
            addCriterion("resumeWorkYearStart not like", value, "resumeworkyearstart");
            return (Criteria) this;
        }

        public Criteria andResumeworkyearstartIn(List<String> values) {
            addCriterion("resumeWorkYearStart in", values, "resumeworkyearstart");
            return (Criteria) this;
        }

        public Criteria andResumeworkyearstartNotIn(List<String> values) {
            addCriterion("resumeWorkYearStart not in", values, "resumeworkyearstart");
            return (Criteria) this;
        }

        public Criteria andResumeworkyearstartBetween(String value1, String value2) {
            addCriterion("resumeWorkYearStart between", value1, value2, "resumeworkyearstart");
            return (Criteria) this;
        }

        public Criteria andResumeworkyearstartNotBetween(String value1, String value2) {
            addCriterion("resumeWorkYearStart not between", value1, value2, "resumeworkyearstart");
            return (Criteria) this;
        }

        public Criteria andResumeworkmonthstartIsNull() {
            addCriterion("resumeWorkMonthStart is null");
            return (Criteria) this;
        }

        public Criteria andResumeworkmonthstartIsNotNull() {
            addCriterion("resumeWorkMonthStart is not null");
            return (Criteria) this;
        }

        public Criteria andResumeworkmonthstartEqualTo(String value) {
            addCriterion("resumeWorkMonthStart =", value, "resumeworkmonthstart");
            return (Criteria) this;
        }

        public Criteria andResumeworkmonthstartNotEqualTo(String value) {
            addCriterion("resumeWorkMonthStart <>", value, "resumeworkmonthstart");
            return (Criteria) this;
        }

        public Criteria andResumeworkmonthstartGreaterThan(String value) {
            addCriterion("resumeWorkMonthStart >", value, "resumeworkmonthstart");
            return (Criteria) this;
        }

        public Criteria andResumeworkmonthstartGreaterThanOrEqualTo(String value) {
            addCriterion("resumeWorkMonthStart >=", value, "resumeworkmonthstart");
            return (Criteria) this;
        }

        public Criteria andResumeworkmonthstartLessThan(String value) {
            addCriterion("resumeWorkMonthStart <", value, "resumeworkmonthstart");
            return (Criteria) this;
        }

        public Criteria andResumeworkmonthstartLessThanOrEqualTo(String value) {
            addCriterion("resumeWorkMonthStart <=", value, "resumeworkmonthstart");
            return (Criteria) this;
        }

        public Criteria andResumeworkmonthstartLike(String value) {
            addCriterion("resumeWorkMonthStart like", value, "resumeworkmonthstart");
            return (Criteria) this;
        }

        public Criteria andResumeworkmonthstartNotLike(String value) {
            addCriterion("resumeWorkMonthStart not like", value, "resumeworkmonthstart");
            return (Criteria) this;
        }

        public Criteria andResumeworkmonthstartIn(List<String> values) {
            addCriterion("resumeWorkMonthStart in", values, "resumeworkmonthstart");
            return (Criteria) this;
        }

        public Criteria andResumeworkmonthstartNotIn(List<String> values) {
            addCriterion("resumeWorkMonthStart not in", values, "resumeworkmonthstart");
            return (Criteria) this;
        }

        public Criteria andResumeworkmonthstartBetween(String value1, String value2) {
            addCriterion("resumeWorkMonthStart between", value1, value2, "resumeworkmonthstart");
            return (Criteria) this;
        }

        public Criteria andResumeworkmonthstartNotBetween(String value1, String value2) {
            addCriterion("resumeWorkMonthStart not between", value1, value2, "resumeworkmonthstart");
            return (Criteria) this;
        }

        public Criteria andResumeworkyearendIsNull() {
            addCriterion("resumeWorkYearEnd is null");
            return (Criteria) this;
        }

        public Criteria andResumeworkyearendIsNotNull() {
            addCriterion("resumeWorkYearEnd is not null");
            return (Criteria) this;
        }

        public Criteria andResumeworkyearendEqualTo(String value) {
            addCriterion("resumeWorkYearEnd =", value, "resumeworkyearend");
            return (Criteria) this;
        }

        public Criteria andResumeworkyearendNotEqualTo(String value) {
            addCriterion("resumeWorkYearEnd <>", value, "resumeworkyearend");
            return (Criteria) this;
        }

        public Criteria andResumeworkyearendGreaterThan(String value) {
            addCriterion("resumeWorkYearEnd >", value, "resumeworkyearend");
            return (Criteria) this;
        }

        public Criteria andResumeworkyearendGreaterThanOrEqualTo(String value) {
            addCriterion("resumeWorkYearEnd >=", value, "resumeworkyearend");
            return (Criteria) this;
        }

        public Criteria andResumeworkyearendLessThan(String value) {
            addCriterion("resumeWorkYearEnd <", value, "resumeworkyearend");
            return (Criteria) this;
        }

        public Criteria andResumeworkyearendLessThanOrEqualTo(String value) {
            addCriterion("resumeWorkYearEnd <=", value, "resumeworkyearend");
            return (Criteria) this;
        }

        public Criteria andResumeworkyearendLike(String value) {
            addCriterion("resumeWorkYearEnd like", value, "resumeworkyearend");
            return (Criteria) this;
        }

        public Criteria andResumeworkyearendNotLike(String value) {
            addCriterion("resumeWorkYearEnd not like", value, "resumeworkyearend");
            return (Criteria) this;
        }

        public Criteria andResumeworkyearendIn(List<String> values) {
            addCriterion("resumeWorkYearEnd in", values, "resumeworkyearend");
            return (Criteria) this;
        }

        public Criteria andResumeworkyearendNotIn(List<String> values) {
            addCriterion("resumeWorkYearEnd not in", values, "resumeworkyearend");
            return (Criteria) this;
        }

        public Criteria andResumeworkyearendBetween(String value1, String value2) {
            addCriterion("resumeWorkYearEnd between", value1, value2, "resumeworkyearend");
            return (Criteria) this;
        }

        public Criteria andResumeworkyearendNotBetween(String value1, String value2) {
            addCriterion("resumeWorkYearEnd not between", value1, value2, "resumeworkyearend");
            return (Criteria) this;
        }

        public Criteria andResumeworkmonthendIsNull() {
            addCriterion("resumeWorkMonthEnd is null");
            return (Criteria) this;
        }

        public Criteria andResumeworkmonthendIsNotNull() {
            addCriterion("resumeWorkMonthEnd is not null");
            return (Criteria) this;
        }

        public Criteria andResumeworkmonthendEqualTo(String value) {
            addCriterion("resumeWorkMonthEnd =", value, "resumeworkmonthend");
            return (Criteria) this;
        }

        public Criteria andResumeworkmonthendNotEqualTo(String value) {
            addCriterion("resumeWorkMonthEnd <>", value, "resumeworkmonthend");
            return (Criteria) this;
        }

        public Criteria andResumeworkmonthendGreaterThan(String value) {
            addCriterion("resumeWorkMonthEnd >", value, "resumeworkmonthend");
            return (Criteria) this;
        }

        public Criteria andResumeworkmonthendGreaterThanOrEqualTo(String value) {
            addCriterion("resumeWorkMonthEnd >=", value, "resumeworkmonthend");
            return (Criteria) this;
        }

        public Criteria andResumeworkmonthendLessThan(String value) {
            addCriterion("resumeWorkMonthEnd <", value, "resumeworkmonthend");
            return (Criteria) this;
        }

        public Criteria andResumeworkmonthendLessThanOrEqualTo(String value) {
            addCriterion("resumeWorkMonthEnd <=", value, "resumeworkmonthend");
            return (Criteria) this;
        }

        public Criteria andResumeworkmonthendLike(String value) {
            addCriterion("resumeWorkMonthEnd like", value, "resumeworkmonthend");
            return (Criteria) this;
        }

        public Criteria andResumeworkmonthendNotLike(String value) {
            addCriterion("resumeWorkMonthEnd not like", value, "resumeworkmonthend");
            return (Criteria) this;
        }

        public Criteria andResumeworkmonthendIn(List<String> values) {
            addCriterion("resumeWorkMonthEnd in", values, "resumeworkmonthend");
            return (Criteria) this;
        }

        public Criteria andResumeworkmonthendNotIn(List<String> values) {
            addCriterion("resumeWorkMonthEnd not in", values, "resumeworkmonthend");
            return (Criteria) this;
        }

        public Criteria andResumeworkmonthendBetween(String value1, String value2) {
            addCriterion("resumeWorkMonthEnd between", value1, value2, "resumeworkmonthend");
            return (Criteria) this;
        }

        public Criteria andResumeworkmonthendNotBetween(String value1, String value2) {
            addCriterion("resumeWorkMonthEnd not between", value1, value2, "resumeworkmonthend");
            return (Criteria) this;
        }

        public Criteria andResumeprojectnameIsNull() {
            addCriterion("resumeProjectName is null");
            return (Criteria) this;
        }

        public Criteria andResumeprojectnameIsNotNull() {
            addCriterion("resumeProjectName is not null");
            return (Criteria) this;
        }

        public Criteria andResumeprojectnameEqualTo(String value) {
            addCriterion("resumeProjectName =", value, "resumeprojectname");
            return (Criteria) this;
        }

        public Criteria andResumeprojectnameNotEqualTo(String value) {
            addCriterion("resumeProjectName <>", value, "resumeprojectname");
            return (Criteria) this;
        }

        public Criteria andResumeprojectnameGreaterThan(String value) {
            addCriterion("resumeProjectName >", value, "resumeprojectname");
            return (Criteria) this;
        }

        public Criteria andResumeprojectnameGreaterThanOrEqualTo(String value) {
            addCriterion("resumeProjectName >=", value, "resumeprojectname");
            return (Criteria) this;
        }

        public Criteria andResumeprojectnameLessThan(String value) {
            addCriterion("resumeProjectName <", value, "resumeprojectname");
            return (Criteria) this;
        }

        public Criteria andResumeprojectnameLessThanOrEqualTo(String value) {
            addCriterion("resumeProjectName <=", value, "resumeprojectname");
            return (Criteria) this;
        }

        public Criteria andResumeprojectnameLike(String value) {
            addCriterion("resumeProjectName like", value, "resumeprojectname");
            return (Criteria) this;
        }

        public Criteria andResumeprojectnameNotLike(String value) {
            addCriterion("resumeProjectName not like", value, "resumeprojectname");
            return (Criteria) this;
        }

        public Criteria andResumeprojectnameIn(List<String> values) {
            addCriterion("resumeProjectName in", values, "resumeprojectname");
            return (Criteria) this;
        }

        public Criteria andResumeprojectnameNotIn(List<String> values) {
            addCriterion("resumeProjectName not in", values, "resumeprojectname");
            return (Criteria) this;
        }

        public Criteria andResumeprojectnameBetween(String value1, String value2) {
            addCriterion("resumeProjectName between", value1, value2, "resumeprojectname");
            return (Criteria) this;
        }

        public Criteria andResumeprojectnameNotBetween(String value1, String value2) {
            addCriterion("resumeProjectName not between", value1, value2, "resumeprojectname");
            return (Criteria) this;
        }

        public Criteria andResumeprojectpositionIsNull() {
            addCriterion("resumeProjectPosition is null");
            return (Criteria) this;
        }

        public Criteria andResumeprojectpositionIsNotNull() {
            addCriterion("resumeProjectPosition is not null");
            return (Criteria) this;
        }

        public Criteria andResumeprojectpositionEqualTo(String value) {
            addCriterion("resumeProjectPosition =", value, "resumeprojectposition");
            return (Criteria) this;
        }

        public Criteria andResumeprojectpositionNotEqualTo(String value) {
            addCriterion("resumeProjectPosition <>", value, "resumeprojectposition");
            return (Criteria) this;
        }

        public Criteria andResumeprojectpositionGreaterThan(String value) {
            addCriterion("resumeProjectPosition >", value, "resumeprojectposition");
            return (Criteria) this;
        }

        public Criteria andResumeprojectpositionGreaterThanOrEqualTo(String value) {
            addCriterion("resumeProjectPosition >=", value, "resumeprojectposition");
            return (Criteria) this;
        }

        public Criteria andResumeprojectpositionLessThan(String value) {
            addCriterion("resumeProjectPosition <", value, "resumeprojectposition");
            return (Criteria) this;
        }

        public Criteria andResumeprojectpositionLessThanOrEqualTo(String value) {
            addCriterion("resumeProjectPosition <=", value, "resumeprojectposition");
            return (Criteria) this;
        }

        public Criteria andResumeprojectpositionLike(String value) {
            addCriterion("resumeProjectPosition like", value, "resumeprojectposition");
            return (Criteria) this;
        }

        public Criteria andResumeprojectpositionNotLike(String value) {
            addCriterion("resumeProjectPosition not like", value, "resumeprojectposition");
            return (Criteria) this;
        }

        public Criteria andResumeprojectpositionIn(List<String> values) {
            addCriterion("resumeProjectPosition in", values, "resumeprojectposition");
            return (Criteria) this;
        }

        public Criteria andResumeprojectpositionNotIn(List<String> values) {
            addCriterion("resumeProjectPosition not in", values, "resumeprojectposition");
            return (Criteria) this;
        }

        public Criteria andResumeprojectpositionBetween(String value1, String value2) {
            addCriterion("resumeProjectPosition between", value1, value2, "resumeprojectposition");
            return (Criteria) this;
        }

        public Criteria andResumeprojectpositionNotBetween(String value1, String value2) {
            addCriterion("resumeProjectPosition not between", value1, value2, "resumeprojectposition");
            return (Criteria) this;
        }

        public Criteria andResumeprojectyearstartIsNull() {
            addCriterion("resumeProjectYearStart is null");
            return (Criteria) this;
        }

        public Criteria andResumeprojectyearstartIsNotNull() {
            addCriterion("resumeProjectYearStart is not null");
            return (Criteria) this;
        }

        public Criteria andResumeprojectyearstartEqualTo(Date value) {
            addCriterionForJDBCDate("resumeProjectYearStart =", value, "resumeprojectyearstart");
            return (Criteria) this;
        }

        public Criteria andResumeprojectyearstartNotEqualTo(Date value) {
            addCriterionForJDBCDate("resumeProjectYearStart <>", value, "resumeprojectyearstart");
            return (Criteria) this;
        }

        public Criteria andResumeprojectyearstartGreaterThan(Date value) {
            addCriterionForJDBCDate("resumeProjectYearStart >", value, "resumeprojectyearstart");
            return (Criteria) this;
        }

        public Criteria andResumeprojectyearstartGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("resumeProjectYearStart >=", value, "resumeprojectyearstart");
            return (Criteria) this;
        }

        public Criteria andResumeprojectyearstartLessThan(Date value) {
            addCriterionForJDBCDate("resumeProjectYearStart <", value, "resumeprojectyearstart");
            return (Criteria) this;
        }

        public Criteria andResumeprojectyearstartLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("resumeProjectYearStart <=", value, "resumeprojectyearstart");
            return (Criteria) this;
        }

        public Criteria andResumeprojectyearstartIn(List<Date> values) {
            addCriterionForJDBCDate("resumeProjectYearStart in", values, "resumeprojectyearstart");
            return (Criteria) this;
        }

        public Criteria andResumeprojectyearstartNotIn(List<Date> values) {
            addCriterionForJDBCDate("resumeProjectYearStart not in", values, "resumeprojectyearstart");
            return (Criteria) this;
        }

        public Criteria andResumeprojectyearstartBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("resumeProjectYearStart between", value1, value2, "resumeprojectyearstart");
            return (Criteria) this;
        }

        public Criteria andResumeprojectyearstartNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("resumeProjectYearStart not between", value1, value2, "resumeprojectyearstart");
            return (Criteria) this;
        }

        public Criteria andResumeprojectyearendIsNull() {
            addCriterion("resumeProjectYearEnd is null");
            return (Criteria) this;
        }

        public Criteria andResumeprojectyearendIsNotNull() {
            addCriterion("resumeProjectYearEnd is not null");
            return (Criteria) this;
        }

        public Criteria andResumeprojectyearendEqualTo(Date value) {
            addCriterionForJDBCDate("resumeProjectYearEnd =", value, "resumeprojectyearend");
            return (Criteria) this;
        }

        public Criteria andResumeprojectyearendNotEqualTo(Date value) {
            addCriterionForJDBCDate("resumeProjectYearEnd <>", value, "resumeprojectyearend");
            return (Criteria) this;
        }

        public Criteria andResumeprojectyearendGreaterThan(Date value) {
            addCriterionForJDBCDate("resumeProjectYearEnd >", value, "resumeprojectyearend");
            return (Criteria) this;
        }

        public Criteria andResumeprojectyearendGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("resumeProjectYearEnd >=", value, "resumeprojectyearend");
            return (Criteria) this;
        }

        public Criteria andResumeprojectyearendLessThan(Date value) {
            addCriterionForJDBCDate("resumeProjectYearEnd <", value, "resumeprojectyearend");
            return (Criteria) this;
        }

        public Criteria andResumeprojectyearendLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("resumeProjectYearEnd <=", value, "resumeprojectyearend");
            return (Criteria) this;
        }

        public Criteria andResumeprojectyearendIn(List<Date> values) {
            addCriterionForJDBCDate("resumeProjectYearEnd in", values, "resumeprojectyearend");
            return (Criteria) this;
        }

        public Criteria andResumeprojectyearendNotIn(List<Date> values) {
            addCriterionForJDBCDate("resumeProjectYearEnd not in", values, "resumeprojectyearend");
            return (Criteria) this;
        }

        public Criteria andResumeprojectyearendBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("resumeProjectYearEnd between", value1, value2, "resumeprojectyearend");
            return (Criteria) this;
        }

        public Criteria andResumeprojectyearendNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("resumeProjectYearEnd not between", value1, value2, "resumeprojectyearend");
            return (Criteria) this;
        }

        public Criteria andResumeprojectmonthstartIsNull() {
            addCriterion("resumeProjectMonthStart is null");
            return (Criteria) this;
        }

        public Criteria andResumeprojectmonthstartIsNotNull() {
            addCriterion("resumeProjectMonthStart is not null");
            return (Criteria) this;
        }

        public Criteria andResumeprojectmonthstartEqualTo(Date value) {
            addCriterionForJDBCDate("resumeProjectMonthStart =", value, "resumeprojectmonthstart");
            return (Criteria) this;
        }

        public Criteria andResumeprojectmonthstartNotEqualTo(Date value) {
            addCriterionForJDBCDate("resumeProjectMonthStart <>", value, "resumeprojectmonthstart");
            return (Criteria) this;
        }

        public Criteria andResumeprojectmonthstartGreaterThan(Date value) {
            addCriterionForJDBCDate("resumeProjectMonthStart >", value, "resumeprojectmonthstart");
            return (Criteria) this;
        }

        public Criteria andResumeprojectmonthstartGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("resumeProjectMonthStart >=", value, "resumeprojectmonthstart");
            return (Criteria) this;
        }

        public Criteria andResumeprojectmonthstartLessThan(Date value) {
            addCriterionForJDBCDate("resumeProjectMonthStart <", value, "resumeprojectmonthstart");
            return (Criteria) this;
        }

        public Criteria andResumeprojectmonthstartLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("resumeProjectMonthStart <=", value, "resumeprojectmonthstart");
            return (Criteria) this;
        }

        public Criteria andResumeprojectmonthstartIn(List<Date> values) {
            addCriterionForJDBCDate("resumeProjectMonthStart in", values, "resumeprojectmonthstart");
            return (Criteria) this;
        }

        public Criteria andResumeprojectmonthstartNotIn(List<Date> values) {
            addCriterionForJDBCDate("resumeProjectMonthStart not in", values, "resumeprojectmonthstart");
            return (Criteria) this;
        }

        public Criteria andResumeprojectmonthstartBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("resumeProjectMonthStart between", value1, value2, "resumeprojectmonthstart");
            return (Criteria) this;
        }

        public Criteria andResumeprojectmonthstartNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("resumeProjectMonthStart not between", value1, value2, "resumeprojectmonthstart");
            return (Criteria) this;
        }

        public Criteria andResumeprojectmonthendIsNull() {
            addCriterion("resumeProjectMonthEnd is null");
            return (Criteria) this;
        }

        public Criteria andResumeprojectmonthendIsNotNull() {
            addCriterion("resumeProjectMonthEnd is not null");
            return (Criteria) this;
        }

        public Criteria andResumeprojectmonthendEqualTo(Date value) {
            addCriterionForJDBCDate("resumeProjectMonthEnd =", value, "resumeprojectmonthend");
            return (Criteria) this;
        }

        public Criteria andResumeprojectmonthendNotEqualTo(Date value) {
            addCriterionForJDBCDate("resumeProjectMonthEnd <>", value, "resumeprojectmonthend");
            return (Criteria) this;
        }

        public Criteria andResumeprojectmonthendGreaterThan(Date value) {
            addCriterionForJDBCDate("resumeProjectMonthEnd >", value, "resumeprojectmonthend");
            return (Criteria) this;
        }

        public Criteria andResumeprojectmonthendGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("resumeProjectMonthEnd >=", value, "resumeprojectmonthend");
            return (Criteria) this;
        }

        public Criteria andResumeprojectmonthendLessThan(Date value) {
            addCriterionForJDBCDate("resumeProjectMonthEnd <", value, "resumeprojectmonthend");
            return (Criteria) this;
        }

        public Criteria andResumeprojectmonthendLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("resumeProjectMonthEnd <=", value, "resumeprojectmonthend");
            return (Criteria) this;
        }

        public Criteria andResumeprojectmonthendIn(List<Date> values) {
            addCriterionForJDBCDate("resumeProjectMonthEnd in", values, "resumeprojectmonthend");
            return (Criteria) this;
        }

        public Criteria andResumeprojectmonthendNotIn(List<Date> values) {
            addCriterionForJDBCDate("resumeProjectMonthEnd not in", values, "resumeprojectmonthend");
            return (Criteria) this;
        }

        public Criteria andResumeprojectmonthendBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("resumeProjectMonthEnd between", value1, value2, "resumeprojectmonthend");
            return (Criteria) this;
        }

        public Criteria andResumeprojectmonthendNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("resumeProjectMonthEnd not between", value1, value2, "resumeprojectmonthend");
            return (Criteria) this;
        }

        public Criteria andResumeprojectdescIsNull() {
            addCriterion("resumeProjectDesc is null");
            return (Criteria) this;
        }

        public Criteria andResumeprojectdescIsNotNull() {
            addCriterion("resumeProjectDesc is not null");
            return (Criteria) this;
        }

        public Criteria andResumeprojectdescEqualTo(String value) {
            addCriterion("resumeProjectDesc =", value, "resumeprojectdesc");
            return (Criteria) this;
        }

        public Criteria andResumeprojectdescNotEqualTo(String value) {
            addCriterion("resumeProjectDesc <>", value, "resumeprojectdesc");
            return (Criteria) this;
        }

        public Criteria andResumeprojectdescGreaterThan(String value) {
            addCriterion("resumeProjectDesc >", value, "resumeprojectdesc");
            return (Criteria) this;
        }

        public Criteria andResumeprojectdescGreaterThanOrEqualTo(String value) {
            addCriterion("resumeProjectDesc >=", value, "resumeprojectdesc");
            return (Criteria) this;
        }

        public Criteria andResumeprojectdescLessThan(String value) {
            addCriterion("resumeProjectDesc <", value, "resumeprojectdesc");
            return (Criteria) this;
        }

        public Criteria andResumeprojectdescLessThanOrEqualTo(String value) {
            addCriterion("resumeProjectDesc <=", value, "resumeprojectdesc");
            return (Criteria) this;
        }

        public Criteria andResumeprojectdescLike(String value) {
            addCriterion("resumeProjectDesc like", value, "resumeprojectdesc");
            return (Criteria) this;
        }

        public Criteria andResumeprojectdescNotLike(String value) {
            addCriterion("resumeProjectDesc not like", value, "resumeprojectdesc");
            return (Criteria) this;
        }

        public Criteria andResumeprojectdescIn(List<String> values) {
            addCriterion("resumeProjectDesc in", values, "resumeprojectdesc");
            return (Criteria) this;
        }

        public Criteria andResumeprojectdescNotIn(List<String> values) {
            addCriterion("resumeProjectDesc not in", values, "resumeprojectdesc");
            return (Criteria) this;
        }

        public Criteria andResumeprojectdescBetween(String value1, String value2) {
            addCriterion("resumeProjectDesc between", value1, value2, "resumeprojectdesc");
            return (Criteria) this;
        }

        public Criteria andResumeprojectdescNotBetween(String value1, String value2) {
            addCriterion("resumeProjectDesc not between", value1, value2, "resumeprojectdesc");
            return (Criteria) this;
        }

        public Criteria andResumeschoolnameIsNull() {
            addCriterion("resumeSchoolName is null");
            return (Criteria) this;
        }

        public Criteria andResumeschoolnameIsNotNull() {
            addCriterion("resumeSchoolName is not null");
            return (Criteria) this;
        }

        public Criteria andResumeschoolnameEqualTo(String value) {
            addCriterion("resumeSchoolName =", value, "resumeschoolname");
            return (Criteria) this;
        }

        public Criteria andResumeschoolnameNotEqualTo(String value) {
            addCriterion("resumeSchoolName <>", value, "resumeschoolname");
            return (Criteria) this;
        }

        public Criteria andResumeschoolnameGreaterThan(String value) {
            addCriterion("resumeSchoolName >", value, "resumeschoolname");
            return (Criteria) this;
        }

        public Criteria andResumeschoolnameGreaterThanOrEqualTo(String value) {
            addCriterion("resumeSchoolName >=", value, "resumeschoolname");
            return (Criteria) this;
        }

        public Criteria andResumeschoolnameLessThan(String value) {
            addCriterion("resumeSchoolName <", value, "resumeschoolname");
            return (Criteria) this;
        }

        public Criteria andResumeschoolnameLessThanOrEqualTo(String value) {
            addCriterion("resumeSchoolName <=", value, "resumeschoolname");
            return (Criteria) this;
        }

        public Criteria andResumeschoolnameLike(String value) {
            addCriterion("resumeSchoolName like", value, "resumeschoolname");
            return (Criteria) this;
        }

        public Criteria andResumeschoolnameNotLike(String value) {
            addCriterion("resumeSchoolName not like", value, "resumeschoolname");
            return (Criteria) this;
        }

        public Criteria andResumeschoolnameIn(List<String> values) {
            addCriterion("resumeSchoolName in", values, "resumeschoolname");
            return (Criteria) this;
        }

        public Criteria andResumeschoolnameNotIn(List<String> values) {
            addCriterion("resumeSchoolName not in", values, "resumeschoolname");
            return (Criteria) this;
        }

        public Criteria andResumeschoolnameBetween(String value1, String value2) {
            addCriterion("resumeSchoolName between", value1, value2, "resumeschoolname");
            return (Criteria) this;
        }

        public Criteria andResumeschoolnameNotBetween(String value1, String value2) {
            addCriterion("resumeSchoolName not between", value1, value2, "resumeschoolname");
            return (Criteria) this;
        }

        public Criteria andResumedegreeIsNull() {
            addCriterion("resumeDegree is null");
            return (Criteria) this;
        }

        public Criteria andResumedegreeIsNotNull() {
            addCriterion("resumeDegree is not null");
            return (Criteria) this;
        }

        public Criteria andResumedegreeEqualTo(String value) {
            addCriterion("resumeDegree =", value, "resumedegree");
            return (Criteria) this;
        }

        public Criteria andResumedegreeNotEqualTo(String value) {
            addCriterion("resumeDegree <>", value, "resumedegree");
            return (Criteria) this;
        }

        public Criteria andResumedegreeGreaterThan(String value) {
            addCriterion("resumeDegree >", value, "resumedegree");
            return (Criteria) this;
        }

        public Criteria andResumedegreeGreaterThanOrEqualTo(String value) {
            addCriterion("resumeDegree >=", value, "resumedegree");
            return (Criteria) this;
        }

        public Criteria andResumedegreeLessThan(String value) {
            addCriterion("resumeDegree <", value, "resumedegree");
            return (Criteria) this;
        }

        public Criteria andResumedegreeLessThanOrEqualTo(String value) {
            addCriterion("resumeDegree <=", value, "resumedegree");
            return (Criteria) this;
        }

        public Criteria andResumedegreeLike(String value) {
            addCriterion("resumeDegree like", value, "resumedegree");
            return (Criteria) this;
        }

        public Criteria andResumedegreeNotLike(String value) {
            addCriterion("resumeDegree not like", value, "resumedegree");
            return (Criteria) this;
        }

        public Criteria andResumedegreeIn(List<String> values) {
            addCriterion("resumeDegree in", values, "resumedegree");
            return (Criteria) this;
        }

        public Criteria andResumedegreeNotIn(List<String> values) {
            addCriterion("resumeDegree not in", values, "resumedegree");
            return (Criteria) this;
        }

        public Criteria andResumedegreeBetween(String value1, String value2) {
            addCriterion("resumeDegree between", value1, value2, "resumedegree");
            return (Criteria) this;
        }

        public Criteria andResumedegreeNotBetween(String value1, String value2) {
            addCriterion("resumeDegree not between", value1, value2, "resumedegree");
            return (Criteria) this;
        }

        public Criteria andResumeprofessionalIsNull() {
            addCriterion("resumeProfessional is null");
            return (Criteria) this;
        }

        public Criteria andResumeprofessionalIsNotNull() {
            addCriterion("resumeProfessional is not null");
            return (Criteria) this;
        }

        public Criteria andResumeprofessionalEqualTo(String value) {
            addCriterion("resumeProfessional =", value, "resumeprofessional");
            return (Criteria) this;
        }

        public Criteria andResumeprofessionalNotEqualTo(String value) {
            addCriterion("resumeProfessional <>", value, "resumeprofessional");
            return (Criteria) this;
        }

        public Criteria andResumeprofessionalGreaterThan(String value) {
            addCriterion("resumeProfessional >", value, "resumeprofessional");
            return (Criteria) this;
        }

        public Criteria andResumeprofessionalGreaterThanOrEqualTo(String value) {
            addCriterion("resumeProfessional >=", value, "resumeprofessional");
            return (Criteria) this;
        }

        public Criteria andResumeprofessionalLessThan(String value) {
            addCriterion("resumeProfessional <", value, "resumeprofessional");
            return (Criteria) this;
        }

        public Criteria andResumeprofessionalLessThanOrEqualTo(String value) {
            addCriterion("resumeProfessional <=", value, "resumeprofessional");
            return (Criteria) this;
        }

        public Criteria andResumeprofessionalLike(String value) {
            addCriterion("resumeProfessional like", value, "resumeprofessional");
            return (Criteria) this;
        }

        public Criteria andResumeprofessionalNotLike(String value) {
            addCriterion("resumeProfessional not like", value, "resumeprofessional");
            return (Criteria) this;
        }

        public Criteria andResumeprofessionalIn(List<String> values) {
            addCriterion("resumeProfessional in", values, "resumeprofessional");
            return (Criteria) this;
        }

        public Criteria andResumeprofessionalNotIn(List<String> values) {
            addCriterion("resumeProfessional not in", values, "resumeprofessional");
            return (Criteria) this;
        }

        public Criteria andResumeprofessionalBetween(String value1, String value2) {
            addCriterion("resumeProfessional between", value1, value2, "resumeprofessional");
            return (Criteria) this;
        }

        public Criteria andResumeprofessionalNotBetween(String value1, String value2) {
            addCriterion("resumeProfessional not between", value1, value2, "resumeprofessional");
            return (Criteria) this;
        }

        public Criteria andResumeschoolyearstartIsNull() {
            addCriterion("resumeSchoolYearStart is null");
            return (Criteria) this;
        }

        public Criteria andResumeschoolyearstartIsNotNull() {
            addCriterion("resumeSchoolYearStart is not null");
            return (Criteria) this;
        }

        public Criteria andResumeschoolyearstartEqualTo(Date value) {
            addCriterionForJDBCDate("resumeSchoolYearStart =", value, "resumeschoolyearstart");
            return (Criteria) this;
        }

        public Criteria andResumeschoolyearstartNotEqualTo(Date value) {
            addCriterionForJDBCDate("resumeSchoolYearStart <>", value, "resumeschoolyearstart");
            return (Criteria) this;
        }

        public Criteria andResumeschoolyearstartGreaterThan(Date value) {
            addCriterionForJDBCDate("resumeSchoolYearStart >", value, "resumeschoolyearstart");
            return (Criteria) this;
        }

        public Criteria andResumeschoolyearstartGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("resumeSchoolYearStart >=", value, "resumeschoolyearstart");
            return (Criteria) this;
        }

        public Criteria andResumeschoolyearstartLessThan(Date value) {
            addCriterionForJDBCDate("resumeSchoolYearStart <", value, "resumeschoolyearstart");
            return (Criteria) this;
        }

        public Criteria andResumeschoolyearstartLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("resumeSchoolYearStart <=", value, "resumeschoolyearstart");
            return (Criteria) this;
        }

        public Criteria andResumeschoolyearstartIn(List<Date> values) {
            addCriterionForJDBCDate("resumeSchoolYearStart in", values, "resumeschoolyearstart");
            return (Criteria) this;
        }

        public Criteria andResumeschoolyearstartNotIn(List<Date> values) {
            addCriterionForJDBCDate("resumeSchoolYearStart not in", values, "resumeschoolyearstart");
            return (Criteria) this;
        }

        public Criteria andResumeschoolyearstartBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("resumeSchoolYearStart between", value1, value2, "resumeschoolyearstart");
            return (Criteria) this;
        }

        public Criteria andResumeschoolyearstartNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("resumeSchoolYearStart not between", value1, value2, "resumeschoolyearstart");
            return (Criteria) this;
        }

        public Criteria andResumeschoolyearendIsNull() {
            addCriterion("resumeSchoolYearEnd is null");
            return (Criteria) this;
        }

        public Criteria andResumeschoolyearendIsNotNull() {
            addCriterion("resumeSchoolYearEnd is not null");
            return (Criteria) this;
        }

        public Criteria andResumeschoolyearendEqualTo(Date value) {
            addCriterionForJDBCDate("resumeSchoolYearEnd =", value, "resumeschoolyearend");
            return (Criteria) this;
        }

        public Criteria andResumeschoolyearendNotEqualTo(Date value) {
            addCriterionForJDBCDate("resumeSchoolYearEnd <>", value, "resumeschoolyearend");
            return (Criteria) this;
        }

        public Criteria andResumeschoolyearendGreaterThan(Date value) {
            addCriterionForJDBCDate("resumeSchoolYearEnd >", value, "resumeschoolyearend");
            return (Criteria) this;
        }

        public Criteria andResumeschoolyearendGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("resumeSchoolYearEnd >=", value, "resumeschoolyearend");
            return (Criteria) this;
        }

        public Criteria andResumeschoolyearendLessThan(Date value) {
            addCriterionForJDBCDate("resumeSchoolYearEnd <", value, "resumeschoolyearend");
            return (Criteria) this;
        }

        public Criteria andResumeschoolyearendLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("resumeSchoolYearEnd <=", value, "resumeschoolyearend");
            return (Criteria) this;
        }

        public Criteria andResumeschoolyearendIn(List<Date> values) {
            addCriterionForJDBCDate("resumeSchoolYearEnd in", values, "resumeschoolyearend");
            return (Criteria) this;
        }

        public Criteria andResumeschoolyearendNotIn(List<Date> values) {
            addCriterionForJDBCDate("resumeSchoolYearEnd not in", values, "resumeschoolyearend");
            return (Criteria) this;
        }

        public Criteria andResumeschoolyearendBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("resumeSchoolYearEnd between", value1, value2, "resumeschoolyearend");
            return (Criteria) this;
        }

        public Criteria andResumeschoolyearendNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("resumeSchoolYearEnd not between", value1, value2, "resumeschoolyearend");
            return (Criteria) this;
        }

        public Criteria andResumeselfdescIsNull() {
            addCriterion("resumeSelfDesc is null");
            return (Criteria) this;
        }

        public Criteria andResumeselfdescIsNotNull() {
            addCriterion("resumeSelfDesc is not null");
            return (Criteria) this;
        }

        public Criteria andResumeselfdescEqualTo(String value) {
            addCriterion("resumeSelfDesc =", value, "resumeselfdesc");
            return (Criteria) this;
        }

        public Criteria andResumeselfdescNotEqualTo(String value) {
            addCriterion("resumeSelfDesc <>", value, "resumeselfdesc");
            return (Criteria) this;
        }

        public Criteria andResumeselfdescGreaterThan(String value) {
            addCriterion("resumeSelfDesc >", value, "resumeselfdesc");
            return (Criteria) this;
        }

        public Criteria andResumeselfdescGreaterThanOrEqualTo(String value) {
            addCriterion("resumeSelfDesc >=", value, "resumeselfdesc");
            return (Criteria) this;
        }

        public Criteria andResumeselfdescLessThan(String value) {
            addCriterion("resumeSelfDesc <", value, "resumeselfdesc");
            return (Criteria) this;
        }

        public Criteria andResumeselfdescLessThanOrEqualTo(String value) {
            addCriterion("resumeSelfDesc <=", value, "resumeselfdesc");
            return (Criteria) this;
        }

        public Criteria andResumeselfdescLike(String value) {
            addCriterion("resumeSelfDesc like", value, "resumeselfdesc");
            return (Criteria) this;
        }

        public Criteria andResumeselfdescNotLike(String value) {
            addCriterion("resumeSelfDesc not like", value, "resumeselfdesc");
            return (Criteria) this;
        }

        public Criteria andResumeselfdescIn(List<String> values) {
            addCriterion("resumeSelfDesc in", values, "resumeselfdesc");
            return (Criteria) this;
        }

        public Criteria andResumeselfdescNotIn(List<String> values) {
            addCriterion("resumeSelfDesc not in", values, "resumeselfdesc");
            return (Criteria) this;
        }

        public Criteria andResumeselfdescBetween(String value1, String value2) {
            addCriterion("resumeSelfDesc between", value1, value2, "resumeselfdesc");
            return (Criteria) this;
        }

        public Criteria andResumeselfdescNotBetween(String value1, String value2) {
            addCriterion("resumeSelfDesc not between", value1, value2, "resumeselfdesc");
            return (Criteria) this;
        }

        public Criteria andResumeworklinkIsNull() {
            addCriterion("resumeWorkLink is null");
            return (Criteria) this;
        }

        public Criteria andResumeworklinkIsNotNull() {
            addCriterion("resumeWorkLink is not null");
            return (Criteria) this;
        }

        public Criteria andResumeworklinkEqualTo(String value) {
            addCriterion("resumeWorkLink =", value, "resumeworklink");
            return (Criteria) this;
        }

        public Criteria andResumeworklinkNotEqualTo(String value) {
            addCriterion("resumeWorkLink <>", value, "resumeworklink");
            return (Criteria) this;
        }

        public Criteria andResumeworklinkGreaterThan(String value) {
            addCriterion("resumeWorkLink >", value, "resumeworklink");
            return (Criteria) this;
        }

        public Criteria andResumeworklinkGreaterThanOrEqualTo(String value) {
            addCriterion("resumeWorkLink >=", value, "resumeworklink");
            return (Criteria) this;
        }

        public Criteria andResumeworklinkLessThan(String value) {
            addCriterion("resumeWorkLink <", value, "resumeworklink");
            return (Criteria) this;
        }

        public Criteria andResumeworklinkLessThanOrEqualTo(String value) {
            addCriterion("resumeWorkLink <=", value, "resumeworklink");
            return (Criteria) this;
        }

        public Criteria andResumeworklinkLike(String value) {
            addCriterion("resumeWorkLink like", value, "resumeworklink");
            return (Criteria) this;
        }

        public Criteria andResumeworklinkNotLike(String value) {
            addCriterion("resumeWorkLink not like", value, "resumeworklink");
            return (Criteria) this;
        }

        public Criteria andResumeworklinkIn(List<String> values) {
            addCriterion("resumeWorkLink in", values, "resumeworklink");
            return (Criteria) this;
        }

        public Criteria andResumeworklinkNotIn(List<String> values) {
            addCriterion("resumeWorkLink not in", values, "resumeworklink");
            return (Criteria) this;
        }

        public Criteria andResumeworklinkBetween(String value1, String value2) {
            addCriterion("resumeWorkLink between", value1, value2, "resumeworklink");
            return (Criteria) this;
        }

        public Criteria andResumeworklinkNotBetween(String value1, String value2) {
            addCriterion("resumeWorkLink not between", value1, value2, "resumeworklink");
            return (Criteria) this;
        }

        public Criteria andResumeworkdescIsNull() {
            addCriterion("resumeWorkDesc is null");
            return (Criteria) this;
        }

        public Criteria andResumeworkdescIsNotNull() {
            addCriterion("resumeWorkDesc is not null");
            return (Criteria) this;
        }

        public Criteria andResumeworkdescEqualTo(String value) {
            addCriterion("resumeWorkDesc =", value, "resumeworkdesc");
            return (Criteria) this;
        }

        public Criteria andResumeworkdescNotEqualTo(String value) {
            addCriterion("resumeWorkDesc <>", value, "resumeworkdesc");
            return (Criteria) this;
        }

        public Criteria andResumeworkdescGreaterThan(String value) {
            addCriterion("resumeWorkDesc >", value, "resumeworkdesc");
            return (Criteria) this;
        }

        public Criteria andResumeworkdescGreaterThanOrEqualTo(String value) {
            addCriterion("resumeWorkDesc >=", value, "resumeworkdesc");
            return (Criteria) this;
        }

        public Criteria andResumeworkdescLessThan(String value) {
            addCriterion("resumeWorkDesc <", value, "resumeworkdesc");
            return (Criteria) this;
        }

        public Criteria andResumeworkdescLessThanOrEqualTo(String value) {
            addCriterion("resumeWorkDesc <=", value, "resumeworkdesc");
            return (Criteria) this;
        }

        public Criteria andResumeworkdescLike(String value) {
            addCriterion("resumeWorkDesc like", value, "resumeworkdesc");
            return (Criteria) this;
        }

        public Criteria andResumeworkdescNotLike(String value) {
            addCriterion("resumeWorkDesc not like", value, "resumeworkdesc");
            return (Criteria) this;
        }

        public Criteria andResumeworkdescIn(List<String> values) {
            addCriterion("resumeWorkDesc in", values, "resumeworkdesc");
            return (Criteria) this;
        }

        public Criteria andResumeworkdescNotIn(List<String> values) {
            addCriterion("resumeWorkDesc not in", values, "resumeworkdesc");
            return (Criteria) this;
        }

        public Criteria andResumeworkdescBetween(String value1, String value2) {
            addCriterion("resumeWorkDesc between", value1, value2, "resumeworkdesc");
            return (Criteria) this;
        }

        public Criteria andResumeworkdescNotBetween(String value1, String value2) {
            addCriterion("resumeWorkDesc not between", value1, value2, "resumeworkdesc");
            return (Criteria) this;
        }

        public Criteria andResumelastupdateIsNull() {
            addCriterion("resumeLastUpdate is null");
            return (Criteria) this;
        }

        public Criteria andResumelastupdateIsNotNull() {
            addCriterion("resumeLastUpdate is not null");
            return (Criteria) this;
        }

        public Criteria andResumelastupdateEqualTo(Date value) {
            addCriterionForJDBCDate("resumeLastUpdate =", value, "resumelastupdate");
            return (Criteria) this;
        }

        public Criteria andResumelastupdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("resumeLastUpdate <>", value, "resumelastupdate");
            return (Criteria) this;
        }

        public Criteria andResumelastupdateGreaterThan(Date value) {
            addCriterionForJDBCDate("resumeLastUpdate >", value, "resumelastupdate");
            return (Criteria) this;
        }

        public Criteria andResumelastupdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("resumeLastUpdate >=", value, "resumelastupdate");
            return (Criteria) this;
        }

        public Criteria andResumelastupdateLessThan(Date value) {
            addCriterionForJDBCDate("resumeLastUpdate <", value, "resumelastupdate");
            return (Criteria) this;
        }

        public Criteria andResumelastupdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("resumeLastUpdate <=", value, "resumelastupdate");
            return (Criteria) this;
        }

        public Criteria andResumelastupdateIn(List<Date> values) {
            addCriterionForJDBCDate("resumeLastUpdate in", values, "resumelastupdate");
            return (Criteria) this;
        }

        public Criteria andResumelastupdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("resumeLastUpdate not in", values, "resumelastupdate");
            return (Criteria) this;
        }

        public Criteria andResumelastupdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("resumeLastUpdate between", value1, value2, "resumelastupdate");
            return (Criteria) this;
        }

        public Criteria andResumelastupdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("resumeLastUpdate not between", value1, value2, "resumelastupdate");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andResumedelstatusIsNull() {
            addCriterion("resumeDelStatus is null");
            return (Criteria) this;
        }

        public Criteria andResumedelstatusIsNotNull() {
            addCriterion("resumeDelStatus is not null");
            return (Criteria) this;
        }

        public Criteria andResumedelstatusEqualTo(Integer value) {
            addCriterion("resumeDelStatus =", value, "resumedelstatus");
            return (Criteria) this;
        }

        public Criteria andResumedelstatusNotEqualTo(Integer value) {
            addCriterion("resumeDelStatus <>", value, "resumedelstatus");
            return (Criteria) this;
        }

        public Criteria andResumedelstatusGreaterThan(Integer value) {
            addCriterion("resumeDelStatus >", value, "resumedelstatus");
            return (Criteria) this;
        }

        public Criteria andResumedelstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("resumeDelStatus >=", value, "resumedelstatus");
            return (Criteria) this;
        }

        public Criteria andResumedelstatusLessThan(Integer value) {
            addCriterion("resumeDelStatus <", value, "resumedelstatus");
            return (Criteria) this;
        }

        public Criteria andResumedelstatusLessThanOrEqualTo(Integer value) {
            addCriterion("resumeDelStatus <=", value, "resumedelstatus");
            return (Criteria) this;
        }

        public Criteria andResumedelstatusIn(List<Integer> values) {
            addCriterion("resumeDelStatus in", values, "resumedelstatus");
            return (Criteria) this;
        }

        public Criteria andResumedelstatusNotIn(List<Integer> values) {
            addCriterion("resumeDelStatus not in", values, "resumedelstatus");
            return (Criteria) this;
        }

        public Criteria andResumedelstatusBetween(Integer value1, Integer value2) {
            addCriterion("resumeDelStatus between", value1, value2, "resumedelstatus");
            return (Criteria) this;
        }

        public Criteria andResumedelstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("resumeDelStatus not between", value1, value2, "resumedelstatus");
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