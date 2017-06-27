package com.lagou.vo;

import java.util.ArrayList;
import java.util.List;

public class RcmdcoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RcmdcoExample() {
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

        public Criteria andRcmdcoidIsNull() {
            addCriterion("rcmdCoId is null");
            return (Criteria) this;
        }

        public Criteria andRcmdcoidIsNotNull() {
            addCriterion("rcmdCoId is not null");
            return (Criteria) this;
        }

        public Criteria andRcmdcoidEqualTo(Integer value) {
            addCriterion("rcmdCoId =", value, "rcmdcoid");
            return (Criteria) this;
        }

        public Criteria andRcmdcoidNotEqualTo(Integer value) {
            addCriterion("rcmdCoId <>", value, "rcmdcoid");
            return (Criteria) this;
        }

        public Criteria andRcmdcoidGreaterThan(Integer value) {
            addCriterion("rcmdCoId >", value, "rcmdcoid");
            return (Criteria) this;
        }

        public Criteria andRcmdcoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rcmdCoId >=", value, "rcmdcoid");
            return (Criteria) this;
        }

        public Criteria andRcmdcoidLessThan(Integer value) {
            addCriterion("rcmdCoId <", value, "rcmdcoid");
            return (Criteria) this;
        }

        public Criteria andRcmdcoidLessThanOrEqualTo(Integer value) {
            addCriterion("rcmdCoId <=", value, "rcmdcoid");
            return (Criteria) this;
        }

        public Criteria andRcmdcoidIn(List<Integer> values) {
            addCriterion("rcmdCoId in", values, "rcmdcoid");
            return (Criteria) this;
        }

        public Criteria andRcmdcoidNotIn(List<Integer> values) {
            addCriterion("rcmdCoId not in", values, "rcmdcoid");
            return (Criteria) this;
        }

        public Criteria andRcmdcoidBetween(Integer value1, Integer value2) {
            addCriterion("rcmdCoId between", value1, value2, "rcmdcoid");
            return (Criteria) this;
        }

        public Criteria andRcmdcoidNotBetween(Integer value1, Integer value2) {
            addCriterion("rcmdCoId not between", value1, value2, "rcmdcoid");
            return (Criteria) this;
        }

        public Criteria andRcmdcostateIsNull() {
            addCriterion("rcmdCoState is null");
            return (Criteria) this;
        }

        public Criteria andRcmdcostateIsNotNull() {
            addCriterion("rcmdCoState is not null");
            return (Criteria) this;
        }

        public Criteria andRcmdcostateEqualTo(Integer value) {
            addCriterion("rcmdCoState =", value, "rcmdcostate");
            return (Criteria) this;
        }

        public Criteria andRcmdcostateNotEqualTo(Integer value) {
            addCriterion("rcmdCoState <>", value, "rcmdcostate");
            return (Criteria) this;
        }

        public Criteria andRcmdcostateGreaterThan(Integer value) {
            addCriterion("rcmdCoState >", value, "rcmdcostate");
            return (Criteria) this;
        }

        public Criteria andRcmdcostateGreaterThanOrEqualTo(Integer value) {
            addCriterion("rcmdCoState >=", value, "rcmdcostate");
            return (Criteria) this;
        }

        public Criteria andRcmdcostateLessThan(Integer value) {
            addCriterion("rcmdCoState <", value, "rcmdcostate");
            return (Criteria) this;
        }

        public Criteria andRcmdcostateLessThanOrEqualTo(Integer value) {
            addCriterion("rcmdCoState <=", value, "rcmdcostate");
            return (Criteria) this;
        }

        public Criteria andRcmdcostateIn(List<Integer> values) {
            addCriterion("rcmdCoState in", values, "rcmdcostate");
            return (Criteria) this;
        }

        public Criteria andRcmdcostateNotIn(List<Integer> values) {
            addCriterion("rcmdCoState not in", values, "rcmdcostate");
            return (Criteria) this;
        }

        public Criteria andRcmdcostateBetween(Integer value1, Integer value2) {
            addCriterion("rcmdCoState between", value1, value2, "rcmdcostate");
            return (Criteria) this;
        }

        public Criteria andRcmdcostateNotBetween(Integer value1, Integer value2) {
            addCriterion("rcmdCoState not between", value1, value2, "rcmdcostate");
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