package com.lagou.vo;

import java.util.ArrayList;
import java.util.List;

public class HotsearchExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HotsearchExample() {
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

        public Criteria andHotsearchidIsNull() {
            addCriterion("hotSearchId is null");
            return (Criteria) this;
        }

        public Criteria andHotsearchidIsNotNull() {
            addCriterion("hotSearchId is not null");
            return (Criteria) this;
        }

        public Criteria andHotsearchidEqualTo(Integer value) {
            addCriterion("hotSearchId =", value, "hotsearchid");
            return (Criteria) this;
        }

        public Criteria andHotsearchidNotEqualTo(Integer value) {
            addCriterion("hotSearchId <>", value, "hotsearchid");
            return (Criteria) this;
        }

        public Criteria andHotsearchidGreaterThan(Integer value) {
            addCriterion("hotSearchId >", value, "hotsearchid");
            return (Criteria) this;
        }

        public Criteria andHotsearchidGreaterThanOrEqualTo(Integer value) {
            addCriterion("hotSearchId >=", value, "hotsearchid");
            return (Criteria) this;
        }

        public Criteria andHotsearchidLessThan(Integer value) {
            addCriterion("hotSearchId <", value, "hotsearchid");
            return (Criteria) this;
        }

        public Criteria andHotsearchidLessThanOrEqualTo(Integer value) {
            addCriterion("hotSearchId <=", value, "hotsearchid");
            return (Criteria) this;
        }

        public Criteria andHotsearchidIn(List<Integer> values) {
            addCriterion("hotSearchId in", values, "hotsearchid");
            return (Criteria) this;
        }

        public Criteria andHotsearchidNotIn(List<Integer> values) {
            addCriterion("hotSearchId not in", values, "hotsearchid");
            return (Criteria) this;
        }

        public Criteria andHotsearchidBetween(Integer value1, Integer value2) {
            addCriterion("hotSearchId between", value1, value2, "hotsearchid");
            return (Criteria) this;
        }

        public Criteria andHotsearchidNotBetween(Integer value1, Integer value2) {
            addCriterion("hotSearchId not between", value1, value2, "hotsearchid");
            return (Criteria) this;
        }

        public Criteria andHotwordIsNull() {
            addCriterion("hotWord is null");
            return (Criteria) this;
        }

        public Criteria andHotwordIsNotNull() {
            addCriterion("hotWord is not null");
            return (Criteria) this;
        }

        public Criteria andHotwordEqualTo(String value) {
            addCriterion("hotWord =", value, "hotword");
            return (Criteria) this;
        }

        public Criteria andHotwordNotEqualTo(String value) {
            addCriterion("hotWord <>", value, "hotword");
            return (Criteria) this;
        }

        public Criteria andHotwordGreaterThan(String value) {
            addCriterion("hotWord >", value, "hotword");
            return (Criteria) this;
        }

        public Criteria andHotwordGreaterThanOrEqualTo(String value) {
            addCriterion("hotWord >=", value, "hotword");
            return (Criteria) this;
        }

        public Criteria andHotwordLessThan(String value) {
            addCriterion("hotWord <", value, "hotword");
            return (Criteria) this;
        }

        public Criteria andHotwordLessThanOrEqualTo(String value) {
            addCriterion("hotWord <=", value, "hotword");
            return (Criteria) this;
        }

        public Criteria andHotwordLike(String value) {
            addCriterion("hotWord like", value, "hotword");
            return (Criteria) this;
        }

        public Criteria andHotwordNotLike(String value) {
            addCriterion("hotWord not like", value, "hotword");
            return (Criteria) this;
        }

        public Criteria andHotwordIn(List<String> values) {
            addCriterion("hotWord in", values, "hotword");
            return (Criteria) this;
        }

        public Criteria andHotwordNotIn(List<String> values) {
            addCriterion("hotWord not in", values, "hotword");
            return (Criteria) this;
        }

        public Criteria andHotwordBetween(String value1, String value2) {
            addCriterion("hotWord between", value1, value2, "hotword");
            return (Criteria) this;
        }

        public Criteria andHotwordNotBetween(String value1, String value2) {
            addCriterion("hotWord not between", value1, value2, "hotword");
            return (Criteria) this;
        }

        public Criteria andHotsearchesIsNull() {
            addCriterion("hotSearches is null");
            return (Criteria) this;
        }

        public Criteria andHotsearchesIsNotNull() {
            addCriterion("hotSearches is not null");
            return (Criteria) this;
        }

        public Criteria andHotsearchesEqualTo(Integer value) {
            addCriterion("hotSearches =", value, "hotsearches");
            return (Criteria) this;
        }

        public Criteria andHotsearchesNotEqualTo(Integer value) {
            addCriterion("hotSearches <>", value, "hotsearches");
            return (Criteria) this;
        }

        public Criteria andHotsearchesGreaterThan(Integer value) {
            addCriterion("hotSearches >", value, "hotsearches");
            return (Criteria) this;
        }

        public Criteria andHotsearchesGreaterThanOrEqualTo(Integer value) {
            addCriterion("hotSearches >=", value, "hotsearches");
            return (Criteria) this;
        }

        public Criteria andHotsearchesLessThan(Integer value) {
            addCriterion("hotSearches <", value, "hotsearches");
            return (Criteria) this;
        }

        public Criteria andHotsearchesLessThanOrEqualTo(Integer value) {
            addCriterion("hotSearches <=", value, "hotsearches");
            return (Criteria) this;
        }

        public Criteria andHotsearchesIn(List<Integer> values) {
            addCriterion("hotSearches in", values, "hotsearches");
            return (Criteria) this;
        }

        public Criteria andHotsearchesNotIn(List<Integer> values) {
            addCriterion("hotSearches not in", values, "hotsearches");
            return (Criteria) this;
        }

        public Criteria andHotsearchesBetween(Integer value1, Integer value2) {
            addCriterion("hotSearches between", value1, value2, "hotsearches");
            return (Criteria) this;
        }

        public Criteria andHotsearchesNotBetween(Integer value1, Integer value2) {
            addCriterion("hotSearches not between", value1, value2, "hotsearches");
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