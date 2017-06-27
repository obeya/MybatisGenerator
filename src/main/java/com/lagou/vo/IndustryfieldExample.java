package com.lagou.vo;

import java.util.ArrayList;
import java.util.List;

public class IndustryfieldExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IndustryfieldExample() {
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

        public Criteria andIndustryfieldidIsNull() {
            addCriterion("industryFieldId is null");
            return (Criteria) this;
        }

        public Criteria andIndustryfieldidIsNotNull() {
            addCriterion("industryFieldId is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryfieldidEqualTo(Integer value) {
            addCriterion("industryFieldId =", value, "industryfieldid");
            return (Criteria) this;
        }

        public Criteria andIndustryfieldidNotEqualTo(Integer value) {
            addCriterion("industryFieldId <>", value, "industryfieldid");
            return (Criteria) this;
        }

        public Criteria andIndustryfieldidGreaterThan(Integer value) {
            addCriterion("industryFieldId >", value, "industryfieldid");
            return (Criteria) this;
        }

        public Criteria andIndustryfieldidGreaterThanOrEqualTo(Integer value) {
            addCriterion("industryFieldId >=", value, "industryfieldid");
            return (Criteria) this;
        }

        public Criteria andIndustryfieldidLessThan(Integer value) {
            addCriterion("industryFieldId <", value, "industryfieldid");
            return (Criteria) this;
        }

        public Criteria andIndustryfieldidLessThanOrEqualTo(Integer value) {
            addCriterion("industryFieldId <=", value, "industryfieldid");
            return (Criteria) this;
        }

        public Criteria andIndustryfieldidIn(List<Integer> values) {
            addCriterion("industryFieldId in", values, "industryfieldid");
            return (Criteria) this;
        }

        public Criteria andIndustryfieldidNotIn(List<Integer> values) {
            addCriterion("industryFieldId not in", values, "industryfieldid");
            return (Criteria) this;
        }

        public Criteria andIndustryfieldidBetween(Integer value1, Integer value2) {
            addCriterion("industryFieldId between", value1, value2, "industryfieldid");
            return (Criteria) this;
        }

        public Criteria andIndustryfieldidNotBetween(Integer value1, Integer value2) {
            addCriterion("industryFieldId not between", value1, value2, "industryfieldid");
            return (Criteria) this;
        }

        public Criteria andIndustrynameIsNull() {
            addCriterion("industryName is null");
            return (Criteria) this;
        }

        public Criteria andIndustrynameIsNotNull() {
            addCriterion("industryName is not null");
            return (Criteria) this;
        }

        public Criteria andIndustrynameEqualTo(String value) {
            addCriterion("industryName =", value, "industryname");
            return (Criteria) this;
        }

        public Criteria andIndustrynameNotEqualTo(String value) {
            addCriterion("industryName <>", value, "industryname");
            return (Criteria) this;
        }

        public Criteria andIndustrynameGreaterThan(String value) {
            addCriterion("industryName >", value, "industryname");
            return (Criteria) this;
        }

        public Criteria andIndustrynameGreaterThanOrEqualTo(String value) {
            addCriterion("industryName >=", value, "industryname");
            return (Criteria) this;
        }

        public Criteria andIndustrynameLessThan(String value) {
            addCriterion("industryName <", value, "industryname");
            return (Criteria) this;
        }

        public Criteria andIndustrynameLessThanOrEqualTo(String value) {
            addCriterion("industryName <=", value, "industryname");
            return (Criteria) this;
        }

        public Criteria andIndustrynameLike(String value) {
            addCriterion("industryName like", value, "industryname");
            return (Criteria) this;
        }

        public Criteria andIndustrynameNotLike(String value) {
            addCriterion("industryName not like", value, "industryname");
            return (Criteria) this;
        }

        public Criteria andIndustrynameIn(List<String> values) {
            addCriterion("industryName in", values, "industryname");
            return (Criteria) this;
        }

        public Criteria andIndustrynameNotIn(List<String> values) {
            addCriterion("industryName not in", values, "industryname");
            return (Criteria) this;
        }

        public Criteria andIndustrynameBetween(String value1, String value2) {
            addCriterion("industryName between", value1, value2, "industryname");
            return (Criteria) this;
        }

        public Criteria andIndustrynameNotBetween(String value1, String value2) {
            addCriterion("industryName not between", value1, value2, "industryname");
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