package com.lagou.vo;

import java.util.ArrayList;
import java.util.List;

public class ReceiveresumeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReceiveresumeExample() {
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

        public Criteria andReceiveresumeidIsNull() {
            addCriterion("receiveResumeId is null");
            return (Criteria) this;
        }

        public Criteria andReceiveresumeidIsNotNull() {
            addCriterion("receiveResumeId is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveresumeidEqualTo(Integer value) {
            addCriterion("receiveResumeId =", value, "receiveresumeid");
            return (Criteria) this;
        }

        public Criteria andReceiveresumeidNotEqualTo(Integer value) {
            addCriterion("receiveResumeId <>", value, "receiveresumeid");
            return (Criteria) this;
        }

        public Criteria andReceiveresumeidGreaterThan(Integer value) {
            addCriterion("receiveResumeId >", value, "receiveresumeid");
            return (Criteria) this;
        }

        public Criteria andReceiveresumeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("receiveResumeId >=", value, "receiveresumeid");
            return (Criteria) this;
        }

        public Criteria andReceiveresumeidLessThan(Integer value) {
            addCriterion("receiveResumeId <", value, "receiveresumeid");
            return (Criteria) this;
        }

        public Criteria andReceiveresumeidLessThanOrEqualTo(Integer value) {
            addCriterion("receiveResumeId <=", value, "receiveresumeid");
            return (Criteria) this;
        }

        public Criteria andReceiveresumeidIn(List<Integer> values) {
            addCriterion("receiveResumeId in", values, "receiveresumeid");
            return (Criteria) this;
        }

        public Criteria andReceiveresumeidNotIn(List<Integer> values) {
            addCriterion("receiveResumeId not in", values, "receiveresumeid");
            return (Criteria) this;
        }

        public Criteria andReceiveresumeidBetween(Integer value1, Integer value2) {
            addCriterion("receiveResumeId between", value1, value2, "receiveresumeid");
            return (Criteria) this;
        }

        public Criteria andReceiveresumeidNotBetween(Integer value1, Integer value2) {
            addCriterion("receiveResumeId not between", value1, value2, "receiveresumeid");
            return (Criteria) this;
        }

        public Criteria andResumestateIsNull() {
            addCriterion("resumeState is null");
            return (Criteria) this;
        }

        public Criteria andResumestateIsNotNull() {
            addCriterion("resumeState is not null");
            return (Criteria) this;
        }

        public Criteria andResumestateEqualTo(Integer value) {
            addCriterion("resumeState =", value, "resumestate");
            return (Criteria) this;
        }

        public Criteria andResumestateNotEqualTo(Integer value) {
            addCriterion("resumeState <>", value, "resumestate");
            return (Criteria) this;
        }

        public Criteria andResumestateGreaterThan(Integer value) {
            addCriterion("resumeState >", value, "resumestate");
            return (Criteria) this;
        }

        public Criteria andResumestateGreaterThanOrEqualTo(Integer value) {
            addCriterion("resumeState >=", value, "resumestate");
            return (Criteria) this;
        }

        public Criteria andResumestateLessThan(Integer value) {
            addCriterion("resumeState <", value, "resumestate");
            return (Criteria) this;
        }

        public Criteria andResumestateLessThanOrEqualTo(Integer value) {
            addCriterion("resumeState <=", value, "resumestate");
            return (Criteria) this;
        }

        public Criteria andResumestateIn(List<Integer> values) {
            addCriterion("resumeState in", values, "resumestate");
            return (Criteria) this;
        }

        public Criteria andResumestateNotIn(List<Integer> values) {
            addCriterion("resumeState not in", values, "resumestate");
            return (Criteria) this;
        }

        public Criteria andResumestateBetween(Integer value1, Integer value2) {
            addCriterion("resumeState between", value1, value2, "resumestate");
            return (Criteria) this;
        }

        public Criteria andResumestateNotBetween(Integer value1, Integer value2) {
            addCriterion("resumeState not between", value1, value2, "resumestate");
            return (Criteria) this;
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

        public Criteria andReceivedelstatusIsNull() {
            addCriterion("receiveDelStatus is null");
            return (Criteria) this;
        }

        public Criteria andReceivedelstatusIsNotNull() {
            addCriterion("receiveDelStatus is not null");
            return (Criteria) this;
        }

        public Criteria andReceivedelstatusEqualTo(Integer value) {
            addCriterion("receiveDelStatus =", value, "receivedelstatus");
            return (Criteria) this;
        }

        public Criteria andReceivedelstatusNotEqualTo(Integer value) {
            addCriterion("receiveDelStatus <>", value, "receivedelstatus");
            return (Criteria) this;
        }

        public Criteria andReceivedelstatusGreaterThan(Integer value) {
            addCriterion("receiveDelStatus >", value, "receivedelstatus");
            return (Criteria) this;
        }

        public Criteria andReceivedelstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("receiveDelStatus >=", value, "receivedelstatus");
            return (Criteria) this;
        }

        public Criteria andReceivedelstatusLessThan(Integer value) {
            addCriterion("receiveDelStatus <", value, "receivedelstatus");
            return (Criteria) this;
        }

        public Criteria andReceivedelstatusLessThanOrEqualTo(Integer value) {
            addCriterion("receiveDelStatus <=", value, "receivedelstatus");
            return (Criteria) this;
        }

        public Criteria andReceivedelstatusIn(List<Integer> values) {
            addCriterion("receiveDelStatus in", values, "receivedelstatus");
            return (Criteria) this;
        }

        public Criteria andReceivedelstatusNotIn(List<Integer> values) {
            addCriterion("receiveDelStatus not in", values, "receivedelstatus");
            return (Criteria) this;
        }

        public Criteria andReceivedelstatusBetween(Integer value1, Integer value2) {
            addCriterion("receiveDelStatus between", value1, value2, "receivedelstatus");
            return (Criteria) this;
        }

        public Criteria andReceivedelstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("receiveDelStatus not between", value1, value2, "receivedelstatus");
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