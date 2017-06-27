package com.lagou.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JobExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JobExample() {
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

        public Criteria andJobidIsNull() {
            addCriterion("jobId is null");
            return (Criteria) this;
        }

        public Criteria andJobidIsNotNull() {
            addCriterion("jobId is not null");
            return (Criteria) this;
        }

        public Criteria andJobidEqualTo(Integer value) {
            addCriterion("jobId =", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidNotEqualTo(Integer value) {
            addCriterion("jobId <>", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidGreaterThan(Integer value) {
            addCriterion("jobId >", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidGreaterThanOrEqualTo(Integer value) {
            addCriterion("jobId >=", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidLessThan(Integer value) {
            addCriterion("jobId <", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidLessThanOrEqualTo(Integer value) {
            addCriterion("jobId <=", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidIn(List<Integer> values) {
            addCriterion("jobId in", values, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidNotIn(List<Integer> values) {
            addCriterion("jobId not in", values, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidBetween(Integer value1, Integer value2) {
            addCriterion("jobId between", value1, value2, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidNotBetween(Integer value1, Integer value2) {
            addCriterion("jobId not between", value1, value2, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobnameIsNull() {
            addCriterion("jobName is null");
            return (Criteria) this;
        }

        public Criteria andJobnameIsNotNull() {
            addCriterion("jobName is not null");
            return (Criteria) this;
        }

        public Criteria andJobnameEqualTo(String value) {
            addCriterion("jobName =", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotEqualTo(String value) {
            addCriterion("jobName <>", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameGreaterThan(String value) {
            addCriterion("jobName >", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameGreaterThanOrEqualTo(String value) {
            addCriterion("jobName >=", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameLessThan(String value) {
            addCriterion("jobName <", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameLessThanOrEqualTo(String value) {
            addCriterion("jobName <=", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameLike(String value) {
            addCriterion("jobName like", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotLike(String value) {
            addCriterion("jobName not like", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameIn(List<String> values) {
            addCriterion("jobName in", values, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotIn(List<String> values) {
            addCriterion("jobName not in", values, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameBetween(String value1, String value2) {
            addCriterion("jobName between", value1, value2, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotBetween(String value1, String value2) {
            addCriterion("jobName not between", value1, value2, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobdepartmentIsNull() {
            addCriterion("jobDepartment is null");
            return (Criteria) this;
        }

        public Criteria andJobdepartmentIsNotNull() {
            addCriterion("jobDepartment is not null");
            return (Criteria) this;
        }

        public Criteria andJobdepartmentEqualTo(String value) {
            addCriterion("jobDepartment =", value, "jobdepartment");
            return (Criteria) this;
        }

        public Criteria andJobdepartmentNotEqualTo(String value) {
            addCriterion("jobDepartment <>", value, "jobdepartment");
            return (Criteria) this;
        }

        public Criteria andJobdepartmentGreaterThan(String value) {
            addCriterion("jobDepartment >", value, "jobdepartment");
            return (Criteria) this;
        }

        public Criteria andJobdepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("jobDepartment >=", value, "jobdepartment");
            return (Criteria) this;
        }

        public Criteria andJobdepartmentLessThan(String value) {
            addCriterion("jobDepartment <", value, "jobdepartment");
            return (Criteria) this;
        }

        public Criteria andJobdepartmentLessThanOrEqualTo(String value) {
            addCriterion("jobDepartment <=", value, "jobdepartment");
            return (Criteria) this;
        }

        public Criteria andJobdepartmentLike(String value) {
            addCriterion("jobDepartment like", value, "jobdepartment");
            return (Criteria) this;
        }

        public Criteria andJobdepartmentNotLike(String value) {
            addCriterion("jobDepartment not like", value, "jobdepartment");
            return (Criteria) this;
        }

        public Criteria andJobdepartmentIn(List<String> values) {
            addCriterion("jobDepartment in", values, "jobdepartment");
            return (Criteria) this;
        }

        public Criteria andJobdepartmentNotIn(List<String> values) {
            addCriterion("jobDepartment not in", values, "jobdepartment");
            return (Criteria) this;
        }

        public Criteria andJobdepartmentBetween(String value1, String value2) {
            addCriterion("jobDepartment between", value1, value2, "jobdepartment");
            return (Criteria) this;
        }

        public Criteria andJobdepartmentNotBetween(String value1, String value2) {
            addCriterion("jobDepartment not between", value1, value2, "jobdepartment");
            return (Criteria) this;
        }

        public Criteria andJobworkingpropertyIsNull() {
            addCriterion("jobWorkingProperty is null");
            return (Criteria) this;
        }

        public Criteria andJobworkingpropertyIsNotNull() {
            addCriterion("jobWorkingProperty is not null");
            return (Criteria) this;
        }

        public Criteria andJobworkingpropertyEqualTo(String value) {
            addCriterion("jobWorkingProperty =", value, "jobworkingproperty");
            return (Criteria) this;
        }

        public Criteria andJobworkingpropertyNotEqualTo(String value) {
            addCriterion("jobWorkingProperty <>", value, "jobworkingproperty");
            return (Criteria) this;
        }

        public Criteria andJobworkingpropertyGreaterThan(String value) {
            addCriterion("jobWorkingProperty >", value, "jobworkingproperty");
            return (Criteria) this;
        }

        public Criteria andJobworkingpropertyGreaterThanOrEqualTo(String value) {
            addCriterion("jobWorkingProperty >=", value, "jobworkingproperty");
            return (Criteria) this;
        }

        public Criteria andJobworkingpropertyLessThan(String value) {
            addCriterion("jobWorkingProperty <", value, "jobworkingproperty");
            return (Criteria) this;
        }

        public Criteria andJobworkingpropertyLessThanOrEqualTo(String value) {
            addCriterion("jobWorkingProperty <=", value, "jobworkingproperty");
            return (Criteria) this;
        }

        public Criteria andJobworkingpropertyLike(String value) {
            addCriterion("jobWorkingProperty like", value, "jobworkingproperty");
            return (Criteria) this;
        }

        public Criteria andJobworkingpropertyNotLike(String value) {
            addCriterion("jobWorkingProperty not like", value, "jobworkingproperty");
            return (Criteria) this;
        }

        public Criteria andJobworkingpropertyIn(List<String> values) {
            addCriterion("jobWorkingProperty in", values, "jobworkingproperty");
            return (Criteria) this;
        }

        public Criteria andJobworkingpropertyNotIn(List<String> values) {
            addCriterion("jobWorkingProperty not in", values, "jobworkingproperty");
            return (Criteria) this;
        }

        public Criteria andJobworkingpropertyBetween(String value1, String value2) {
            addCriterion("jobWorkingProperty between", value1, value2, "jobworkingproperty");
            return (Criteria) this;
        }

        public Criteria andJobworkingpropertyNotBetween(String value1, String value2) {
            addCriterion("jobWorkingProperty not between", value1, value2, "jobworkingproperty");
            return (Criteria) this;
        }

        public Criteria andJobminsalaryIsNull() {
            addCriterion("jobMinSalary is null");
            return (Criteria) this;
        }

        public Criteria andJobminsalaryIsNotNull() {
            addCriterion("jobMinSalary is not null");
            return (Criteria) this;
        }

        public Criteria andJobminsalaryEqualTo(Integer value) {
            addCriterion("jobMinSalary =", value, "jobminsalary");
            return (Criteria) this;
        }

        public Criteria andJobminsalaryNotEqualTo(Integer value) {
            addCriterion("jobMinSalary <>", value, "jobminsalary");
            return (Criteria) this;
        }

        public Criteria andJobminsalaryGreaterThan(Integer value) {
            addCriterion("jobMinSalary >", value, "jobminsalary");
            return (Criteria) this;
        }

        public Criteria andJobminsalaryGreaterThanOrEqualTo(Integer value) {
            addCriterion("jobMinSalary >=", value, "jobminsalary");
            return (Criteria) this;
        }

        public Criteria andJobminsalaryLessThan(Integer value) {
            addCriterion("jobMinSalary <", value, "jobminsalary");
            return (Criteria) this;
        }

        public Criteria andJobminsalaryLessThanOrEqualTo(Integer value) {
            addCriterion("jobMinSalary <=", value, "jobminsalary");
            return (Criteria) this;
        }

        public Criteria andJobminsalaryIn(List<Integer> values) {
            addCriterion("jobMinSalary in", values, "jobminsalary");
            return (Criteria) this;
        }

        public Criteria andJobminsalaryNotIn(List<Integer> values) {
            addCriterion("jobMinSalary not in", values, "jobminsalary");
            return (Criteria) this;
        }

        public Criteria andJobminsalaryBetween(Integer value1, Integer value2) {
            addCriterion("jobMinSalary between", value1, value2, "jobminsalary");
            return (Criteria) this;
        }

        public Criteria andJobminsalaryNotBetween(Integer value1, Integer value2) {
            addCriterion("jobMinSalary not between", value1, value2, "jobminsalary");
            return (Criteria) this;
        }

        public Criteria andJobmaxsalaryIsNull() {
            addCriterion("jobMaxSalary is null");
            return (Criteria) this;
        }

        public Criteria andJobmaxsalaryIsNotNull() {
            addCriterion("jobMaxSalary is not null");
            return (Criteria) this;
        }

        public Criteria andJobmaxsalaryEqualTo(Integer value) {
            addCriterion("jobMaxSalary =", value, "jobmaxsalary");
            return (Criteria) this;
        }

        public Criteria andJobmaxsalaryNotEqualTo(Integer value) {
            addCriterion("jobMaxSalary <>", value, "jobmaxsalary");
            return (Criteria) this;
        }

        public Criteria andJobmaxsalaryGreaterThan(Integer value) {
            addCriterion("jobMaxSalary >", value, "jobmaxsalary");
            return (Criteria) this;
        }

        public Criteria andJobmaxsalaryGreaterThanOrEqualTo(Integer value) {
            addCriterion("jobMaxSalary >=", value, "jobmaxsalary");
            return (Criteria) this;
        }

        public Criteria andJobmaxsalaryLessThan(Integer value) {
            addCriterion("jobMaxSalary <", value, "jobmaxsalary");
            return (Criteria) this;
        }

        public Criteria andJobmaxsalaryLessThanOrEqualTo(Integer value) {
            addCriterion("jobMaxSalary <=", value, "jobmaxsalary");
            return (Criteria) this;
        }

        public Criteria andJobmaxsalaryIn(List<Integer> values) {
            addCriterion("jobMaxSalary in", values, "jobmaxsalary");
            return (Criteria) this;
        }

        public Criteria andJobmaxsalaryNotIn(List<Integer> values) {
            addCriterion("jobMaxSalary not in", values, "jobmaxsalary");
            return (Criteria) this;
        }

        public Criteria andJobmaxsalaryBetween(Integer value1, Integer value2) {
            addCriterion("jobMaxSalary between", value1, value2, "jobmaxsalary");
            return (Criteria) this;
        }

        public Criteria andJobmaxsalaryNotBetween(Integer value1, Integer value2) {
            addCriterion("jobMaxSalary not between", value1, value2, "jobmaxsalary");
            return (Criteria) this;
        }

        public Criteria andJobworkcityIsNull() {
            addCriterion("jobWorkCity is null");
            return (Criteria) this;
        }

        public Criteria andJobworkcityIsNotNull() {
            addCriterion("jobWorkCity is not null");
            return (Criteria) this;
        }

        public Criteria andJobworkcityEqualTo(String value) {
            addCriterion("jobWorkCity =", value, "jobworkcity");
            return (Criteria) this;
        }

        public Criteria andJobworkcityNotEqualTo(String value) {
            addCriterion("jobWorkCity <>", value, "jobworkcity");
            return (Criteria) this;
        }

        public Criteria andJobworkcityGreaterThan(String value) {
            addCriterion("jobWorkCity >", value, "jobworkcity");
            return (Criteria) this;
        }

        public Criteria andJobworkcityGreaterThanOrEqualTo(String value) {
            addCriterion("jobWorkCity >=", value, "jobworkcity");
            return (Criteria) this;
        }

        public Criteria andJobworkcityLessThan(String value) {
            addCriterion("jobWorkCity <", value, "jobworkcity");
            return (Criteria) this;
        }

        public Criteria andJobworkcityLessThanOrEqualTo(String value) {
            addCriterion("jobWorkCity <=", value, "jobworkcity");
            return (Criteria) this;
        }

        public Criteria andJobworkcityLike(String value) {
            addCriterion("jobWorkCity like", value, "jobworkcity");
            return (Criteria) this;
        }

        public Criteria andJobworkcityNotLike(String value) {
            addCriterion("jobWorkCity not like", value, "jobworkcity");
            return (Criteria) this;
        }

        public Criteria andJobworkcityIn(List<String> values) {
            addCriterion("jobWorkCity in", values, "jobworkcity");
            return (Criteria) this;
        }

        public Criteria andJobworkcityNotIn(List<String> values) {
            addCriterion("jobWorkCity not in", values, "jobworkcity");
            return (Criteria) this;
        }

        public Criteria andJobworkcityBetween(String value1, String value2) {
            addCriterion("jobWorkCity between", value1, value2, "jobworkcity");
            return (Criteria) this;
        }

        public Criteria andJobworkcityNotBetween(String value1, String value2) {
            addCriterion("jobWorkCity not between", value1, value2, "jobworkcity");
            return (Criteria) this;
        }

        public Criteria andJobexperienceIsNull() {
            addCriterion("jobExperience is null");
            return (Criteria) this;
        }

        public Criteria andJobexperienceIsNotNull() {
            addCriterion("jobExperience is not null");
            return (Criteria) this;
        }

        public Criteria andJobexperienceEqualTo(String value) {
            addCriterion("jobExperience =", value, "jobexperience");
            return (Criteria) this;
        }

        public Criteria andJobexperienceNotEqualTo(String value) {
            addCriterion("jobExperience <>", value, "jobexperience");
            return (Criteria) this;
        }

        public Criteria andJobexperienceGreaterThan(String value) {
            addCriterion("jobExperience >", value, "jobexperience");
            return (Criteria) this;
        }

        public Criteria andJobexperienceGreaterThanOrEqualTo(String value) {
            addCriterion("jobExperience >=", value, "jobexperience");
            return (Criteria) this;
        }

        public Criteria andJobexperienceLessThan(String value) {
            addCriterion("jobExperience <", value, "jobexperience");
            return (Criteria) this;
        }

        public Criteria andJobexperienceLessThanOrEqualTo(String value) {
            addCriterion("jobExperience <=", value, "jobexperience");
            return (Criteria) this;
        }

        public Criteria andJobexperienceLike(String value) {
            addCriterion("jobExperience like", value, "jobexperience");
            return (Criteria) this;
        }

        public Criteria andJobexperienceNotLike(String value) {
            addCriterion("jobExperience not like", value, "jobexperience");
            return (Criteria) this;
        }

        public Criteria andJobexperienceIn(List<String> values) {
            addCriterion("jobExperience in", values, "jobexperience");
            return (Criteria) this;
        }

        public Criteria andJobexperienceNotIn(List<String> values) {
            addCriterion("jobExperience not in", values, "jobexperience");
            return (Criteria) this;
        }

        public Criteria andJobexperienceBetween(String value1, String value2) {
            addCriterion("jobExperience between", value1, value2, "jobexperience");
            return (Criteria) this;
        }

        public Criteria andJobexperienceNotBetween(String value1, String value2) {
            addCriterion("jobExperience not between", value1, value2, "jobexperience");
            return (Criteria) this;
        }

        public Criteria andJobdegreerequiredIsNull() {
            addCriterion("jobDegreeRequired is null");
            return (Criteria) this;
        }

        public Criteria andJobdegreerequiredIsNotNull() {
            addCriterion("jobDegreeRequired is not null");
            return (Criteria) this;
        }

        public Criteria andJobdegreerequiredEqualTo(String value) {
            addCriterion("jobDegreeRequired =", value, "jobdegreerequired");
            return (Criteria) this;
        }

        public Criteria andJobdegreerequiredNotEqualTo(String value) {
            addCriterion("jobDegreeRequired <>", value, "jobdegreerequired");
            return (Criteria) this;
        }

        public Criteria andJobdegreerequiredGreaterThan(String value) {
            addCriterion("jobDegreeRequired >", value, "jobdegreerequired");
            return (Criteria) this;
        }

        public Criteria andJobdegreerequiredGreaterThanOrEqualTo(String value) {
            addCriterion("jobDegreeRequired >=", value, "jobdegreerequired");
            return (Criteria) this;
        }

        public Criteria andJobdegreerequiredLessThan(String value) {
            addCriterion("jobDegreeRequired <", value, "jobdegreerequired");
            return (Criteria) this;
        }

        public Criteria andJobdegreerequiredLessThanOrEqualTo(String value) {
            addCriterion("jobDegreeRequired <=", value, "jobdegreerequired");
            return (Criteria) this;
        }

        public Criteria andJobdegreerequiredLike(String value) {
            addCriterion("jobDegreeRequired like", value, "jobdegreerequired");
            return (Criteria) this;
        }

        public Criteria andJobdegreerequiredNotLike(String value) {
            addCriterion("jobDegreeRequired not like", value, "jobdegreerequired");
            return (Criteria) this;
        }

        public Criteria andJobdegreerequiredIn(List<String> values) {
            addCriterion("jobDegreeRequired in", values, "jobdegreerequired");
            return (Criteria) this;
        }

        public Criteria andJobdegreerequiredNotIn(List<String> values) {
            addCriterion("jobDegreeRequired not in", values, "jobdegreerequired");
            return (Criteria) this;
        }

        public Criteria andJobdegreerequiredBetween(String value1, String value2) {
            addCriterion("jobDegreeRequired between", value1, value2, "jobdegreerequired");
            return (Criteria) this;
        }

        public Criteria andJobdegreerequiredNotBetween(String value1, String value2) {
            addCriterion("jobDegreeRequired not between", value1, value2, "jobdegreerequired");
            return (Criteria) this;
        }

        public Criteria andJobtemptIsNull() {
            addCriterion("jobTempt is null");
            return (Criteria) this;
        }

        public Criteria andJobtemptIsNotNull() {
            addCriterion("jobTempt is not null");
            return (Criteria) this;
        }

        public Criteria andJobtemptEqualTo(String value) {
            addCriterion("jobTempt =", value, "jobtempt");
            return (Criteria) this;
        }

        public Criteria andJobtemptNotEqualTo(String value) {
            addCriterion("jobTempt <>", value, "jobtempt");
            return (Criteria) this;
        }

        public Criteria andJobtemptGreaterThan(String value) {
            addCriterion("jobTempt >", value, "jobtempt");
            return (Criteria) this;
        }

        public Criteria andJobtemptGreaterThanOrEqualTo(String value) {
            addCriterion("jobTempt >=", value, "jobtempt");
            return (Criteria) this;
        }

        public Criteria andJobtemptLessThan(String value) {
            addCriterion("jobTempt <", value, "jobtempt");
            return (Criteria) this;
        }

        public Criteria andJobtemptLessThanOrEqualTo(String value) {
            addCriterion("jobTempt <=", value, "jobtempt");
            return (Criteria) this;
        }

        public Criteria andJobtemptLike(String value) {
            addCriterion("jobTempt like", value, "jobtempt");
            return (Criteria) this;
        }

        public Criteria andJobtemptNotLike(String value) {
            addCriterion("jobTempt not like", value, "jobtempt");
            return (Criteria) this;
        }

        public Criteria andJobtemptIn(List<String> values) {
            addCriterion("jobTempt in", values, "jobtempt");
            return (Criteria) this;
        }

        public Criteria andJobtemptNotIn(List<String> values) {
            addCriterion("jobTempt not in", values, "jobtempt");
            return (Criteria) this;
        }

        public Criteria andJobtemptBetween(String value1, String value2) {
            addCriterion("jobTempt between", value1, value2, "jobtempt");
            return (Criteria) this;
        }

        public Criteria andJobtemptNotBetween(String value1, String value2) {
            addCriterion("jobTempt not between", value1, value2, "jobtempt");
            return (Criteria) this;
        }

        public Criteria andJobdescribeIsNull() {
            addCriterion("jobDescribe is null");
            return (Criteria) this;
        }

        public Criteria andJobdescribeIsNotNull() {
            addCriterion("jobDescribe is not null");
            return (Criteria) this;
        }

        public Criteria andJobdescribeEqualTo(String value) {
            addCriterion("jobDescribe =", value, "jobdescribe");
            return (Criteria) this;
        }

        public Criteria andJobdescribeNotEqualTo(String value) {
            addCriterion("jobDescribe <>", value, "jobdescribe");
            return (Criteria) this;
        }

        public Criteria andJobdescribeGreaterThan(String value) {
            addCriterion("jobDescribe >", value, "jobdescribe");
            return (Criteria) this;
        }

        public Criteria andJobdescribeGreaterThanOrEqualTo(String value) {
            addCriterion("jobDescribe >=", value, "jobdescribe");
            return (Criteria) this;
        }

        public Criteria andJobdescribeLessThan(String value) {
            addCriterion("jobDescribe <", value, "jobdescribe");
            return (Criteria) this;
        }

        public Criteria andJobdescribeLessThanOrEqualTo(String value) {
            addCriterion("jobDescribe <=", value, "jobdescribe");
            return (Criteria) this;
        }

        public Criteria andJobdescribeLike(String value) {
            addCriterion("jobDescribe like", value, "jobdescribe");
            return (Criteria) this;
        }

        public Criteria andJobdescribeNotLike(String value) {
            addCriterion("jobDescribe not like", value, "jobdescribe");
            return (Criteria) this;
        }

        public Criteria andJobdescribeIn(List<String> values) {
            addCriterion("jobDescribe in", values, "jobdescribe");
            return (Criteria) this;
        }

        public Criteria andJobdescribeNotIn(List<String> values) {
            addCriterion("jobDescribe not in", values, "jobdescribe");
            return (Criteria) this;
        }

        public Criteria andJobdescribeBetween(String value1, String value2) {
            addCriterion("jobDescribe between", value1, value2, "jobdescribe");
            return (Criteria) this;
        }

        public Criteria andJobdescribeNotBetween(String value1, String value2) {
            addCriterion("jobDescribe not between", value1, value2, "jobdescribe");
            return (Criteria) this;
        }

        public Criteria andJobaddressIsNull() {
            addCriterion("jobAddress is null");
            return (Criteria) this;
        }

        public Criteria andJobaddressIsNotNull() {
            addCriterion("jobAddress is not null");
            return (Criteria) this;
        }

        public Criteria andJobaddressEqualTo(String value) {
            addCriterion("jobAddress =", value, "jobaddress");
            return (Criteria) this;
        }

        public Criteria andJobaddressNotEqualTo(String value) {
            addCriterion("jobAddress <>", value, "jobaddress");
            return (Criteria) this;
        }

        public Criteria andJobaddressGreaterThan(String value) {
            addCriterion("jobAddress >", value, "jobaddress");
            return (Criteria) this;
        }

        public Criteria andJobaddressGreaterThanOrEqualTo(String value) {
            addCriterion("jobAddress >=", value, "jobaddress");
            return (Criteria) this;
        }

        public Criteria andJobaddressLessThan(String value) {
            addCriterion("jobAddress <", value, "jobaddress");
            return (Criteria) this;
        }

        public Criteria andJobaddressLessThanOrEqualTo(String value) {
            addCriterion("jobAddress <=", value, "jobaddress");
            return (Criteria) this;
        }

        public Criteria andJobaddressLike(String value) {
            addCriterion("jobAddress like", value, "jobaddress");
            return (Criteria) this;
        }

        public Criteria andJobaddressNotLike(String value) {
            addCriterion("jobAddress not like", value, "jobaddress");
            return (Criteria) this;
        }

        public Criteria andJobaddressIn(List<String> values) {
            addCriterion("jobAddress in", values, "jobaddress");
            return (Criteria) this;
        }

        public Criteria andJobaddressNotIn(List<String> values) {
            addCriterion("jobAddress not in", values, "jobaddress");
            return (Criteria) this;
        }

        public Criteria andJobaddressBetween(String value1, String value2) {
            addCriterion("jobAddress between", value1, value2, "jobaddress");
            return (Criteria) this;
        }

        public Criteria andJobaddressNotBetween(String value1, String value2) {
            addCriterion("jobAddress not between", value1, value2, "jobaddress");
            return (Criteria) this;
        }

        public Criteria andJobemailIsNull() {
            addCriterion("jobEmail is null");
            return (Criteria) this;
        }

        public Criteria andJobemailIsNotNull() {
            addCriterion("jobEmail is not null");
            return (Criteria) this;
        }

        public Criteria andJobemailEqualTo(String value) {
            addCriterion("jobEmail =", value, "jobemail");
            return (Criteria) this;
        }

        public Criteria andJobemailNotEqualTo(String value) {
            addCriterion("jobEmail <>", value, "jobemail");
            return (Criteria) this;
        }

        public Criteria andJobemailGreaterThan(String value) {
            addCriterion("jobEmail >", value, "jobemail");
            return (Criteria) this;
        }

        public Criteria andJobemailGreaterThanOrEqualTo(String value) {
            addCriterion("jobEmail >=", value, "jobemail");
            return (Criteria) this;
        }

        public Criteria andJobemailLessThan(String value) {
            addCriterion("jobEmail <", value, "jobemail");
            return (Criteria) this;
        }

        public Criteria andJobemailLessThanOrEqualTo(String value) {
            addCriterion("jobEmail <=", value, "jobemail");
            return (Criteria) this;
        }

        public Criteria andJobemailLike(String value) {
            addCriterion("jobEmail like", value, "jobemail");
            return (Criteria) this;
        }

        public Criteria andJobemailNotLike(String value) {
            addCriterion("jobEmail not like", value, "jobemail");
            return (Criteria) this;
        }

        public Criteria andJobemailIn(List<String> values) {
            addCriterion("jobEmail in", values, "jobemail");
            return (Criteria) this;
        }

        public Criteria andJobemailNotIn(List<String> values) {
            addCriterion("jobEmail not in", values, "jobemail");
            return (Criteria) this;
        }

        public Criteria andJobemailBetween(String value1, String value2) {
            addCriterion("jobEmail between", value1, value2, "jobemail");
            return (Criteria) this;
        }

        public Criteria andJobemailNotBetween(String value1, String value2) {
            addCriterion("jobEmail not between", value1, value2, "jobemail");
            return (Criteria) this;
        }

        public Criteria andJobtimeIsNull() {
            addCriterion("jobTime is null");
            return (Criteria) this;
        }

        public Criteria andJobtimeIsNotNull() {
            addCriterion("jobTime is not null");
            return (Criteria) this;
        }

        public Criteria andJobtimeEqualTo(Date value) {
            addCriterion("jobTime =", value, "jobtime");
            return (Criteria) this;
        }

        public Criteria andJobtimeNotEqualTo(Date value) {
            addCriterion("jobTime <>", value, "jobtime");
            return (Criteria) this;
        }

        public Criteria andJobtimeGreaterThan(Date value) {
            addCriterion("jobTime >", value, "jobtime");
            return (Criteria) this;
        }

        public Criteria andJobtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("jobTime >=", value, "jobtime");
            return (Criteria) this;
        }

        public Criteria andJobtimeLessThan(Date value) {
            addCriterion("jobTime <", value, "jobtime");
            return (Criteria) this;
        }

        public Criteria andJobtimeLessThanOrEqualTo(Date value) {
            addCriterion("jobTime <=", value, "jobtime");
            return (Criteria) this;
        }

        public Criteria andJobtimeIn(List<Date> values) {
            addCriterion("jobTime in", values, "jobtime");
            return (Criteria) this;
        }

        public Criteria andJobtimeNotIn(List<Date> values) {
            addCriterion("jobTime not in", values, "jobtime");
            return (Criteria) this;
        }

        public Criteria andJobtimeBetween(Date value1, Date value2) {
            addCriterion("jobTime between", value1, value2, "jobtime");
            return (Criteria) this;
        }

        public Criteria andJobtimeNotBetween(Date value1, Date value2) {
            addCriterion("jobTime not between", value1, value2, "jobtime");
            return (Criteria) this;
        }

        public Criteria andJobclickIsNull() {
            addCriterion("jobClick is null");
            return (Criteria) this;
        }

        public Criteria andJobclickIsNotNull() {
            addCriterion("jobClick is not null");
            return (Criteria) this;
        }

        public Criteria andJobclickEqualTo(Integer value) {
            addCriterion("jobClick =", value, "jobclick");
            return (Criteria) this;
        }

        public Criteria andJobclickNotEqualTo(Integer value) {
            addCriterion("jobClick <>", value, "jobclick");
            return (Criteria) this;
        }

        public Criteria andJobclickGreaterThan(Integer value) {
            addCriterion("jobClick >", value, "jobclick");
            return (Criteria) this;
        }

        public Criteria andJobclickGreaterThanOrEqualTo(Integer value) {
            addCriterion("jobClick >=", value, "jobclick");
            return (Criteria) this;
        }

        public Criteria andJobclickLessThan(Integer value) {
            addCriterion("jobClick <", value, "jobclick");
            return (Criteria) this;
        }

        public Criteria andJobclickLessThanOrEqualTo(Integer value) {
            addCriterion("jobClick <=", value, "jobclick");
            return (Criteria) this;
        }

        public Criteria andJobclickIn(List<Integer> values) {
            addCriterion("jobClick in", values, "jobclick");
            return (Criteria) this;
        }

        public Criteria andJobclickNotIn(List<Integer> values) {
            addCriterion("jobClick not in", values, "jobclick");
            return (Criteria) this;
        }

        public Criteria andJobclickBetween(Integer value1, Integer value2) {
            addCriterion("jobClick between", value1, value2, "jobclick");
            return (Criteria) this;
        }

        public Criteria andJobclickNotBetween(Integer value1, Integer value2) {
            addCriterion("jobClick not between", value1, value2, "jobclick");
            return (Criteria) this;
        }

        public Criteria andJobstateIsNull() {
            addCriterion("jobState is null");
            return (Criteria) this;
        }

        public Criteria andJobstateIsNotNull() {
            addCriterion("jobState is not null");
            return (Criteria) this;
        }

        public Criteria andJobstateEqualTo(Integer value) {
            addCriterion("jobState =", value, "jobstate");
            return (Criteria) this;
        }

        public Criteria andJobstateNotEqualTo(Integer value) {
            addCriterion("jobState <>", value, "jobstate");
            return (Criteria) this;
        }

        public Criteria andJobstateGreaterThan(Integer value) {
            addCriterion("jobState >", value, "jobstate");
            return (Criteria) this;
        }

        public Criteria andJobstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("jobState >=", value, "jobstate");
            return (Criteria) this;
        }

        public Criteria andJobstateLessThan(Integer value) {
            addCriterion("jobState <", value, "jobstate");
            return (Criteria) this;
        }

        public Criteria andJobstateLessThanOrEqualTo(Integer value) {
            addCriterion("jobState <=", value, "jobstate");
            return (Criteria) this;
        }

        public Criteria andJobstateIn(List<Integer> values) {
            addCriterion("jobState in", values, "jobstate");
            return (Criteria) this;
        }

        public Criteria andJobstateNotIn(List<Integer> values) {
            addCriterion("jobState not in", values, "jobstate");
            return (Criteria) this;
        }

        public Criteria andJobstateBetween(Integer value1, Integer value2) {
            addCriterion("jobState between", value1, value2, "jobstate");
            return (Criteria) this;
        }

        public Criteria andJobstateNotBetween(Integer value1, Integer value2) {
            addCriterion("jobState not between", value1, value2, "jobstate");
            return (Criteria) this;
        }

        public Criteria andSkillidIsNull() {
            addCriterion("skillId is null");
            return (Criteria) this;
        }

        public Criteria andSkillidIsNotNull() {
            addCriterion("skillId is not null");
            return (Criteria) this;
        }

        public Criteria andSkillidEqualTo(Integer value) {
            addCriterion("skillId =", value, "skillid");
            return (Criteria) this;
        }

        public Criteria andSkillidNotEqualTo(Integer value) {
            addCriterion("skillId <>", value, "skillid");
            return (Criteria) this;
        }

        public Criteria andSkillidGreaterThan(Integer value) {
            addCriterion("skillId >", value, "skillid");
            return (Criteria) this;
        }

        public Criteria andSkillidGreaterThanOrEqualTo(Integer value) {
            addCriterion("skillId >=", value, "skillid");
            return (Criteria) this;
        }

        public Criteria andSkillidLessThan(Integer value) {
            addCriterion("skillId <", value, "skillid");
            return (Criteria) this;
        }

        public Criteria andSkillidLessThanOrEqualTo(Integer value) {
            addCriterion("skillId <=", value, "skillid");
            return (Criteria) this;
        }

        public Criteria andSkillidIn(List<Integer> values) {
            addCriterion("skillId in", values, "skillid");
            return (Criteria) this;
        }

        public Criteria andSkillidNotIn(List<Integer> values) {
            addCriterion("skillId not in", values, "skillid");
            return (Criteria) this;
        }

        public Criteria andSkillidBetween(Integer value1, Integer value2) {
            addCriterion("skillId between", value1, value2, "skillid");
            return (Criteria) this;
        }

        public Criteria andSkillidNotBetween(Integer value1, Integer value2) {
            addCriterion("skillId not between", value1, value2, "skillid");
            return (Criteria) this;
        }

        public Criteria andCompanyidIsNull() {
            addCriterion("companyId is null");
            return (Criteria) this;
        }

        public Criteria andCompanyidIsNotNull() {
            addCriterion("companyId is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyidEqualTo(Integer value) {
            addCriterion("companyId =", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotEqualTo(Integer value) {
            addCriterion("companyId <>", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThan(Integer value) {
            addCriterion("companyId >", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("companyId >=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThan(Integer value) {
            addCriterion("companyId <", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThanOrEqualTo(Integer value) {
            addCriterion("companyId <=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidIn(List<Integer> values) {
            addCriterion("companyId in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotIn(List<Integer> values) {
            addCriterion("companyId not in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidBetween(Integer value1, Integer value2) {
            addCriterion("companyId between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotBetween(Integer value1, Integer value2) {
            addCriterion("companyId not between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andJobdelstatusIsNull() {
            addCriterion("jobDelStatus is null");
            return (Criteria) this;
        }

        public Criteria andJobdelstatusIsNotNull() {
            addCriterion("jobDelStatus is not null");
            return (Criteria) this;
        }

        public Criteria andJobdelstatusEqualTo(Integer value) {
            addCriterion("jobDelStatus =", value, "jobdelstatus");
            return (Criteria) this;
        }

        public Criteria andJobdelstatusNotEqualTo(Integer value) {
            addCriterion("jobDelStatus <>", value, "jobdelstatus");
            return (Criteria) this;
        }

        public Criteria andJobdelstatusGreaterThan(Integer value) {
            addCriterion("jobDelStatus >", value, "jobdelstatus");
            return (Criteria) this;
        }

        public Criteria andJobdelstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("jobDelStatus >=", value, "jobdelstatus");
            return (Criteria) this;
        }

        public Criteria andJobdelstatusLessThan(Integer value) {
            addCriterion("jobDelStatus <", value, "jobdelstatus");
            return (Criteria) this;
        }

        public Criteria andJobdelstatusLessThanOrEqualTo(Integer value) {
            addCriterion("jobDelStatus <=", value, "jobdelstatus");
            return (Criteria) this;
        }

        public Criteria andJobdelstatusIn(List<Integer> values) {
            addCriterion("jobDelStatus in", values, "jobdelstatus");
            return (Criteria) this;
        }

        public Criteria andJobdelstatusNotIn(List<Integer> values) {
            addCriterion("jobDelStatus not in", values, "jobdelstatus");
            return (Criteria) this;
        }

        public Criteria andJobdelstatusBetween(Integer value1, Integer value2) {
            addCriterion("jobDelStatus between", value1, value2, "jobdelstatus");
            return (Criteria) this;
        }

        public Criteria andJobdelstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("jobDelStatus not between", value1, value2, "jobdelstatus");
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