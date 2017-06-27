package com.lagou.vo;

import java.util.ArrayList;
import java.util.List;

public class InvestorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InvestorExample() {
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

        public Criteria andInvestoridIsNull() {
            addCriterion("investorId is null");
            return (Criteria) this;
        }

        public Criteria andInvestoridIsNotNull() {
            addCriterion("investorId is not null");
            return (Criteria) this;
        }

        public Criteria andInvestoridEqualTo(Integer value) {
            addCriterion("investorId =", value, "investorid");
            return (Criteria) this;
        }

        public Criteria andInvestoridNotEqualTo(Integer value) {
            addCriterion("investorId <>", value, "investorid");
            return (Criteria) this;
        }

        public Criteria andInvestoridGreaterThan(Integer value) {
            addCriterion("investorId >", value, "investorid");
            return (Criteria) this;
        }

        public Criteria andInvestoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("investorId >=", value, "investorid");
            return (Criteria) this;
        }

        public Criteria andInvestoridLessThan(Integer value) {
            addCriterion("investorId <", value, "investorid");
            return (Criteria) this;
        }

        public Criteria andInvestoridLessThanOrEqualTo(Integer value) {
            addCriterion("investorId <=", value, "investorid");
            return (Criteria) this;
        }

        public Criteria andInvestoridIn(List<Integer> values) {
            addCriterion("investorId in", values, "investorid");
            return (Criteria) this;
        }

        public Criteria andInvestoridNotIn(List<Integer> values) {
            addCriterion("investorId not in", values, "investorid");
            return (Criteria) this;
        }

        public Criteria andInvestoridBetween(Integer value1, Integer value2) {
            addCriterion("investorId between", value1, value2, "investorid");
            return (Criteria) this;
        }

        public Criteria andInvestoridNotBetween(Integer value1, Integer value2) {
            addCriterion("investorId not between", value1, value2, "investorid");
            return (Criteria) this;
        }

        public Criteria andInvestnameIsNull() {
            addCriterion("investName is null");
            return (Criteria) this;
        }

        public Criteria andInvestnameIsNotNull() {
            addCriterion("investName is not null");
            return (Criteria) this;
        }

        public Criteria andInvestnameEqualTo(String value) {
            addCriterion("investName =", value, "investname");
            return (Criteria) this;
        }

        public Criteria andInvestnameNotEqualTo(String value) {
            addCriterion("investName <>", value, "investname");
            return (Criteria) this;
        }

        public Criteria andInvestnameGreaterThan(String value) {
            addCriterion("investName >", value, "investname");
            return (Criteria) this;
        }

        public Criteria andInvestnameGreaterThanOrEqualTo(String value) {
            addCriterion("investName >=", value, "investname");
            return (Criteria) this;
        }

        public Criteria andInvestnameLessThan(String value) {
            addCriterion("investName <", value, "investname");
            return (Criteria) this;
        }

        public Criteria andInvestnameLessThanOrEqualTo(String value) {
            addCriterion("investName <=", value, "investname");
            return (Criteria) this;
        }

        public Criteria andInvestnameLike(String value) {
            addCriterion("investName like", value, "investname");
            return (Criteria) this;
        }

        public Criteria andInvestnameNotLike(String value) {
            addCriterion("investName not like", value, "investname");
            return (Criteria) this;
        }

        public Criteria andInvestnameIn(List<String> values) {
            addCriterion("investName in", values, "investname");
            return (Criteria) this;
        }

        public Criteria andInvestnameNotIn(List<String> values) {
            addCriterion("investName not in", values, "investname");
            return (Criteria) this;
        }

        public Criteria andInvestnameBetween(String value1, String value2) {
            addCriterion("investName between", value1, value2, "investname");
            return (Criteria) this;
        }

        public Criteria andInvestnameNotBetween(String value1, String value2) {
            addCriterion("investName not between", value1, value2, "investname");
            return (Criteria) this;
        }

        public Criteria andInvestphaseIsNull() {
            addCriterion("investPhase is null");
            return (Criteria) this;
        }

        public Criteria andInvestphaseIsNotNull() {
            addCriterion("investPhase is not null");
            return (Criteria) this;
        }

        public Criteria andInvestphaseEqualTo(String value) {
            addCriterion("investPhase =", value, "investphase");
            return (Criteria) this;
        }

        public Criteria andInvestphaseNotEqualTo(String value) {
            addCriterion("investPhase <>", value, "investphase");
            return (Criteria) this;
        }

        public Criteria andInvestphaseGreaterThan(String value) {
            addCriterion("investPhase >", value, "investphase");
            return (Criteria) this;
        }

        public Criteria andInvestphaseGreaterThanOrEqualTo(String value) {
            addCriterion("investPhase >=", value, "investphase");
            return (Criteria) this;
        }

        public Criteria andInvestphaseLessThan(String value) {
            addCriterion("investPhase <", value, "investphase");
            return (Criteria) this;
        }

        public Criteria andInvestphaseLessThanOrEqualTo(String value) {
            addCriterion("investPhase <=", value, "investphase");
            return (Criteria) this;
        }

        public Criteria andInvestphaseLike(String value) {
            addCriterion("investPhase like", value, "investphase");
            return (Criteria) this;
        }

        public Criteria andInvestphaseNotLike(String value) {
            addCriterion("investPhase not like", value, "investphase");
            return (Criteria) this;
        }

        public Criteria andInvestphaseIn(List<String> values) {
            addCriterion("investPhase in", values, "investphase");
            return (Criteria) this;
        }

        public Criteria andInvestphaseNotIn(List<String> values) {
            addCriterion("investPhase not in", values, "investphase");
            return (Criteria) this;
        }

        public Criteria andInvestphaseBetween(String value1, String value2) {
            addCriterion("investPhase between", value1, value2, "investphase");
            return (Criteria) this;
        }

        public Criteria andInvestphaseNotBetween(String value1, String value2) {
            addCriterion("investPhase not between", value1, value2, "investphase");
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