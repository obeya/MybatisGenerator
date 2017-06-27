package com.lagou.vo;

import java.util.ArrayList;
import java.util.List;

public class SubscribejobExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SubscribejobExample() {
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

        public Criteria andSubscribeidIsNull() {
            addCriterion("subscribeId is null");
            return (Criteria) this;
        }

        public Criteria andSubscribeidIsNotNull() {
            addCriterion("subscribeId is not null");
            return (Criteria) this;
        }

        public Criteria andSubscribeidEqualTo(Integer value) {
            addCriterion("subscribeId =", value, "subscribeid");
            return (Criteria) this;
        }

        public Criteria andSubscribeidNotEqualTo(Integer value) {
            addCriterion("subscribeId <>", value, "subscribeid");
            return (Criteria) this;
        }

        public Criteria andSubscribeidGreaterThan(Integer value) {
            addCriterion("subscribeId >", value, "subscribeid");
            return (Criteria) this;
        }

        public Criteria andSubscribeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("subscribeId >=", value, "subscribeid");
            return (Criteria) this;
        }

        public Criteria andSubscribeidLessThan(Integer value) {
            addCriterion("subscribeId <", value, "subscribeid");
            return (Criteria) this;
        }

        public Criteria andSubscribeidLessThanOrEqualTo(Integer value) {
            addCriterion("subscribeId <=", value, "subscribeid");
            return (Criteria) this;
        }

        public Criteria andSubscribeidIn(List<Integer> values) {
            addCriterion("subscribeId in", values, "subscribeid");
            return (Criteria) this;
        }

        public Criteria andSubscribeidNotIn(List<Integer> values) {
            addCriterion("subscribeId not in", values, "subscribeid");
            return (Criteria) this;
        }

        public Criteria andSubscribeidBetween(Integer value1, Integer value2) {
            addCriterion("subscribeId between", value1, value2, "subscribeid");
            return (Criteria) this;
        }

        public Criteria andSubscribeidNotBetween(Integer value1, Integer value2) {
            addCriterion("subscribeId not between", value1, value2, "subscribeid");
            return (Criteria) this;
        }

        public Criteria andSemailIsNull() {
            addCriterion("sEmail is null");
            return (Criteria) this;
        }

        public Criteria andSemailIsNotNull() {
            addCriterion("sEmail is not null");
            return (Criteria) this;
        }

        public Criteria andSemailEqualTo(String value) {
            addCriterion("sEmail =", value, "semail");
            return (Criteria) this;
        }

        public Criteria andSemailNotEqualTo(String value) {
            addCriterion("sEmail <>", value, "semail");
            return (Criteria) this;
        }

        public Criteria andSemailGreaterThan(String value) {
            addCriterion("sEmail >", value, "semail");
            return (Criteria) this;
        }

        public Criteria andSemailGreaterThanOrEqualTo(String value) {
            addCriterion("sEmail >=", value, "semail");
            return (Criteria) this;
        }

        public Criteria andSemailLessThan(String value) {
            addCriterion("sEmail <", value, "semail");
            return (Criteria) this;
        }

        public Criteria andSemailLessThanOrEqualTo(String value) {
            addCriterion("sEmail <=", value, "semail");
            return (Criteria) this;
        }

        public Criteria andSemailLike(String value) {
            addCriterion("sEmail like", value, "semail");
            return (Criteria) this;
        }

        public Criteria andSemailNotLike(String value) {
            addCriterion("sEmail not like", value, "semail");
            return (Criteria) this;
        }

        public Criteria andSemailIn(List<String> values) {
            addCriterion("sEmail in", values, "semail");
            return (Criteria) this;
        }

        public Criteria andSemailNotIn(List<String> values) {
            addCriterion("sEmail not in", values, "semail");
            return (Criteria) this;
        }

        public Criteria andSemailBetween(String value1, String value2) {
            addCriterion("sEmail between", value1, value2, "semail");
            return (Criteria) this;
        }

        public Criteria andSemailNotBetween(String value1, String value2) {
            addCriterion("sEmail not between", value1, value2, "semail");
            return (Criteria) this;
        }

        public Criteria andScycleIsNull() {
            addCriterion("sCycle is null");
            return (Criteria) this;
        }

        public Criteria andScycleIsNotNull() {
            addCriterion("sCycle is not null");
            return (Criteria) this;
        }

        public Criteria andScycleEqualTo(String value) {
            addCriterion("sCycle =", value, "scycle");
            return (Criteria) this;
        }

        public Criteria andScycleNotEqualTo(String value) {
            addCriterion("sCycle <>", value, "scycle");
            return (Criteria) this;
        }

        public Criteria andScycleGreaterThan(String value) {
            addCriterion("sCycle >", value, "scycle");
            return (Criteria) this;
        }

        public Criteria andScycleGreaterThanOrEqualTo(String value) {
            addCriterion("sCycle >=", value, "scycle");
            return (Criteria) this;
        }

        public Criteria andScycleLessThan(String value) {
            addCriterion("sCycle <", value, "scycle");
            return (Criteria) this;
        }

        public Criteria andScycleLessThanOrEqualTo(String value) {
            addCriterion("sCycle <=", value, "scycle");
            return (Criteria) this;
        }

        public Criteria andScycleLike(String value) {
            addCriterion("sCycle like", value, "scycle");
            return (Criteria) this;
        }

        public Criteria andScycleNotLike(String value) {
            addCriterion("sCycle not like", value, "scycle");
            return (Criteria) this;
        }

        public Criteria andScycleIn(List<String> values) {
            addCriterion("sCycle in", values, "scycle");
            return (Criteria) this;
        }

        public Criteria andScycleNotIn(List<String> values) {
            addCriterion("sCycle not in", values, "scycle");
            return (Criteria) this;
        }

        public Criteria andScycleBetween(String value1, String value2) {
            addCriterion("sCycle between", value1, value2, "scycle");
            return (Criteria) this;
        }

        public Criteria andScycleNotBetween(String value1, String value2) {
            addCriterion("sCycle not between", value1, value2, "scycle");
            return (Criteria) this;
        }

        public Criteria andSjobnameIsNull() {
            addCriterion("sJobName is null");
            return (Criteria) this;
        }

        public Criteria andSjobnameIsNotNull() {
            addCriterion("sJobName is not null");
            return (Criteria) this;
        }

        public Criteria andSjobnameEqualTo(String value) {
            addCriterion("sJobName =", value, "sjobname");
            return (Criteria) this;
        }

        public Criteria andSjobnameNotEqualTo(String value) {
            addCriterion("sJobName <>", value, "sjobname");
            return (Criteria) this;
        }

        public Criteria andSjobnameGreaterThan(String value) {
            addCriterion("sJobName >", value, "sjobname");
            return (Criteria) this;
        }

        public Criteria andSjobnameGreaterThanOrEqualTo(String value) {
            addCriterion("sJobName >=", value, "sjobname");
            return (Criteria) this;
        }

        public Criteria andSjobnameLessThan(String value) {
            addCriterion("sJobName <", value, "sjobname");
            return (Criteria) this;
        }

        public Criteria andSjobnameLessThanOrEqualTo(String value) {
            addCriterion("sJobName <=", value, "sjobname");
            return (Criteria) this;
        }

        public Criteria andSjobnameLike(String value) {
            addCriterion("sJobName like", value, "sjobname");
            return (Criteria) this;
        }

        public Criteria andSjobnameNotLike(String value) {
            addCriterion("sJobName not like", value, "sjobname");
            return (Criteria) this;
        }

        public Criteria andSjobnameIn(List<String> values) {
            addCriterion("sJobName in", values, "sjobname");
            return (Criteria) this;
        }

        public Criteria andSjobnameNotIn(List<String> values) {
            addCriterion("sJobName not in", values, "sjobname");
            return (Criteria) this;
        }

        public Criteria andSjobnameBetween(String value1, String value2) {
            addCriterion("sJobName between", value1, value2, "sjobname");
            return (Criteria) this;
        }

        public Criteria andSjobnameNotBetween(String value1, String value2) {
            addCriterion("sJobName not between", value1, value2, "sjobname");
            return (Criteria) this;
        }

        public Criteria andSjobworkcityIsNull() {
            addCriterion("sJobWorkCity is null");
            return (Criteria) this;
        }

        public Criteria andSjobworkcityIsNotNull() {
            addCriterion("sJobWorkCity is not null");
            return (Criteria) this;
        }

        public Criteria andSjobworkcityEqualTo(String value) {
            addCriterion("sJobWorkCity =", value, "sjobworkcity");
            return (Criteria) this;
        }

        public Criteria andSjobworkcityNotEqualTo(String value) {
            addCriterion("sJobWorkCity <>", value, "sjobworkcity");
            return (Criteria) this;
        }

        public Criteria andSjobworkcityGreaterThan(String value) {
            addCriterion("sJobWorkCity >", value, "sjobworkcity");
            return (Criteria) this;
        }

        public Criteria andSjobworkcityGreaterThanOrEqualTo(String value) {
            addCriterion("sJobWorkCity >=", value, "sjobworkcity");
            return (Criteria) this;
        }

        public Criteria andSjobworkcityLessThan(String value) {
            addCriterion("sJobWorkCity <", value, "sjobworkcity");
            return (Criteria) this;
        }

        public Criteria andSjobworkcityLessThanOrEqualTo(String value) {
            addCriterion("sJobWorkCity <=", value, "sjobworkcity");
            return (Criteria) this;
        }

        public Criteria andSjobworkcityLike(String value) {
            addCriterion("sJobWorkCity like", value, "sjobworkcity");
            return (Criteria) this;
        }

        public Criteria andSjobworkcityNotLike(String value) {
            addCriterion("sJobWorkCity not like", value, "sjobworkcity");
            return (Criteria) this;
        }

        public Criteria andSjobworkcityIn(List<String> values) {
            addCriterion("sJobWorkCity in", values, "sjobworkcity");
            return (Criteria) this;
        }

        public Criteria andSjobworkcityNotIn(List<String> values) {
            addCriterion("sJobWorkCity not in", values, "sjobworkcity");
            return (Criteria) this;
        }

        public Criteria andSjobworkcityBetween(String value1, String value2) {
            addCriterion("sJobWorkCity between", value1, value2, "sjobworkcity");
            return (Criteria) this;
        }

        public Criteria andSjobworkcityNotBetween(String value1, String value2) {
            addCriterion("sJobWorkCity not between", value1, value2, "sjobworkcity");
            return (Criteria) this;
        }

        public Criteria andSsalaryIsNull() {
            addCriterion("sSalary is null");
            return (Criteria) this;
        }

        public Criteria andSsalaryIsNotNull() {
            addCriterion("sSalary is not null");
            return (Criteria) this;
        }

        public Criteria andSsalaryEqualTo(String value) {
            addCriterion("sSalary =", value, "ssalary");
            return (Criteria) this;
        }

        public Criteria andSsalaryNotEqualTo(String value) {
            addCriterion("sSalary <>", value, "ssalary");
            return (Criteria) this;
        }

        public Criteria andSsalaryGreaterThan(String value) {
            addCriterion("sSalary >", value, "ssalary");
            return (Criteria) this;
        }

        public Criteria andSsalaryGreaterThanOrEqualTo(String value) {
            addCriterion("sSalary >=", value, "ssalary");
            return (Criteria) this;
        }

        public Criteria andSsalaryLessThan(String value) {
            addCriterion("sSalary <", value, "ssalary");
            return (Criteria) this;
        }

        public Criteria andSsalaryLessThanOrEqualTo(String value) {
            addCriterion("sSalary <=", value, "ssalary");
            return (Criteria) this;
        }

        public Criteria andSsalaryLike(String value) {
            addCriterion("sSalary like", value, "ssalary");
            return (Criteria) this;
        }

        public Criteria andSsalaryNotLike(String value) {
            addCriterion("sSalary not like", value, "ssalary");
            return (Criteria) this;
        }

        public Criteria andSsalaryIn(List<String> values) {
            addCriterion("sSalary in", values, "ssalary");
            return (Criteria) this;
        }

        public Criteria andSsalaryNotIn(List<String> values) {
            addCriterion("sSalary not in", values, "ssalary");
            return (Criteria) this;
        }

        public Criteria andSsalaryBetween(String value1, String value2) {
            addCriterion("sSalary between", value1, value2, "ssalary");
            return (Criteria) this;
        }

        public Criteria andSsalaryNotBetween(String value1, String value2) {
            addCriterion("sSalary not between", value1, value2, "ssalary");
            return (Criteria) this;
        }

        public Criteria andSubscribedelstatusIsNull() {
            addCriterion("subscribeDelStatus is null");
            return (Criteria) this;
        }

        public Criteria andSubscribedelstatusIsNotNull() {
            addCriterion("subscribeDelStatus is not null");
            return (Criteria) this;
        }

        public Criteria andSubscribedelstatusEqualTo(Integer value) {
            addCriterion("subscribeDelStatus =", value, "subscribedelstatus");
            return (Criteria) this;
        }

        public Criteria andSubscribedelstatusNotEqualTo(Integer value) {
            addCriterion("subscribeDelStatus <>", value, "subscribedelstatus");
            return (Criteria) this;
        }

        public Criteria andSubscribedelstatusGreaterThan(Integer value) {
            addCriterion("subscribeDelStatus >", value, "subscribedelstatus");
            return (Criteria) this;
        }

        public Criteria andSubscribedelstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("subscribeDelStatus >=", value, "subscribedelstatus");
            return (Criteria) this;
        }

        public Criteria andSubscribedelstatusLessThan(Integer value) {
            addCriterion("subscribeDelStatus <", value, "subscribedelstatus");
            return (Criteria) this;
        }

        public Criteria andSubscribedelstatusLessThanOrEqualTo(Integer value) {
            addCriterion("subscribeDelStatus <=", value, "subscribedelstatus");
            return (Criteria) this;
        }

        public Criteria andSubscribedelstatusIn(List<Integer> values) {
            addCriterion("subscribeDelStatus in", values, "subscribedelstatus");
            return (Criteria) this;
        }

        public Criteria andSubscribedelstatusNotIn(List<Integer> values) {
            addCriterion("subscribeDelStatus not in", values, "subscribedelstatus");
            return (Criteria) this;
        }

        public Criteria andSubscribedelstatusBetween(Integer value1, Integer value2) {
            addCriterion("subscribeDelStatus between", value1, value2, "subscribedelstatus");
            return (Criteria) this;
        }

        public Criteria andSubscribedelstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("subscribeDelStatus not between", value1, value2, "subscribedelstatus");
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