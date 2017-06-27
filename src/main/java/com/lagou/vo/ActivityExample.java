package com.lagou.vo;

import java.util.ArrayList;
import java.util.List;

public class ActivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivityExample() {
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

        public Criteria andActidIsNull() {
            addCriterion("actId is null");
            return (Criteria) this;
        }

        public Criteria andActidIsNotNull() {
            addCriterion("actId is not null");
            return (Criteria) this;
        }

        public Criteria andActidEqualTo(Integer value) {
            addCriterion("actId =", value, "actid");
            return (Criteria) this;
        }

        public Criteria andActidNotEqualTo(Integer value) {
            addCriterion("actId <>", value, "actid");
            return (Criteria) this;
        }

        public Criteria andActidGreaterThan(Integer value) {
            addCriterion("actId >", value, "actid");
            return (Criteria) this;
        }

        public Criteria andActidGreaterThanOrEqualTo(Integer value) {
            addCriterion("actId >=", value, "actid");
            return (Criteria) this;
        }

        public Criteria andActidLessThan(Integer value) {
            addCriterion("actId <", value, "actid");
            return (Criteria) this;
        }

        public Criteria andActidLessThanOrEqualTo(Integer value) {
            addCriterion("actId <=", value, "actid");
            return (Criteria) this;
        }

        public Criteria andActidIn(List<Integer> values) {
            addCriterion("actId in", values, "actid");
            return (Criteria) this;
        }

        public Criteria andActidNotIn(List<Integer> values) {
            addCriterion("actId not in", values, "actid");
            return (Criteria) this;
        }

        public Criteria andActidBetween(Integer value1, Integer value2) {
            addCriterion("actId between", value1, value2, "actid");
            return (Criteria) this;
        }

        public Criteria andActidNotBetween(Integer value1, Integer value2) {
            addCriterion("actId not between", value1, value2, "actid");
            return (Criteria) this;
        }

        public Criteria andActimgpathIsNull() {
            addCriterion("actImgPath is null");
            return (Criteria) this;
        }

        public Criteria andActimgpathIsNotNull() {
            addCriterion("actImgPath is not null");
            return (Criteria) this;
        }

        public Criteria andActimgpathEqualTo(String value) {
            addCriterion("actImgPath =", value, "actimgpath");
            return (Criteria) this;
        }

        public Criteria andActimgpathNotEqualTo(String value) {
            addCriterion("actImgPath <>", value, "actimgpath");
            return (Criteria) this;
        }

        public Criteria andActimgpathGreaterThan(String value) {
            addCriterion("actImgPath >", value, "actimgpath");
            return (Criteria) this;
        }

        public Criteria andActimgpathGreaterThanOrEqualTo(String value) {
            addCriterion("actImgPath >=", value, "actimgpath");
            return (Criteria) this;
        }

        public Criteria andActimgpathLessThan(String value) {
            addCriterion("actImgPath <", value, "actimgpath");
            return (Criteria) this;
        }

        public Criteria andActimgpathLessThanOrEqualTo(String value) {
            addCriterion("actImgPath <=", value, "actimgpath");
            return (Criteria) this;
        }

        public Criteria andActimgpathLike(String value) {
            addCriterion("actImgPath like", value, "actimgpath");
            return (Criteria) this;
        }

        public Criteria andActimgpathNotLike(String value) {
            addCriterion("actImgPath not like", value, "actimgpath");
            return (Criteria) this;
        }

        public Criteria andActimgpathIn(List<String> values) {
            addCriterion("actImgPath in", values, "actimgpath");
            return (Criteria) this;
        }

        public Criteria andActimgpathNotIn(List<String> values) {
            addCriterion("actImgPath not in", values, "actimgpath");
            return (Criteria) this;
        }

        public Criteria andActimgpathBetween(String value1, String value2) {
            addCriterion("actImgPath between", value1, value2, "actimgpath");
            return (Criteria) this;
        }

        public Criteria andActimgpathNotBetween(String value1, String value2) {
            addCriterion("actImgPath not between", value1, value2, "actimgpath");
            return (Criteria) this;
        }

        public Criteria andActstateIsNull() {
            addCriterion("actState is null");
            return (Criteria) this;
        }

        public Criteria andActstateIsNotNull() {
            addCriterion("actState is not null");
            return (Criteria) this;
        }

        public Criteria andActstateEqualTo(Integer value) {
            addCriterion("actState =", value, "actstate");
            return (Criteria) this;
        }

        public Criteria andActstateNotEqualTo(Integer value) {
            addCriterion("actState <>", value, "actstate");
            return (Criteria) this;
        }

        public Criteria andActstateGreaterThan(Integer value) {
            addCriterion("actState >", value, "actstate");
            return (Criteria) this;
        }

        public Criteria andActstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("actState >=", value, "actstate");
            return (Criteria) this;
        }

        public Criteria andActstateLessThan(Integer value) {
            addCriterion("actState <", value, "actstate");
            return (Criteria) this;
        }

        public Criteria andActstateLessThanOrEqualTo(Integer value) {
            addCriterion("actState <=", value, "actstate");
            return (Criteria) this;
        }

        public Criteria andActstateIn(List<Integer> values) {
            addCriterion("actState in", values, "actstate");
            return (Criteria) this;
        }

        public Criteria andActstateNotIn(List<Integer> values) {
            addCriterion("actState not in", values, "actstate");
            return (Criteria) this;
        }

        public Criteria andActstateBetween(Integer value1, Integer value2) {
            addCriterion("actState between", value1, value2, "actstate");
            return (Criteria) this;
        }

        public Criteria andActstateNotBetween(Integer value1, Integer value2) {
            addCriterion("actState not between", value1, value2, "actstate");
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