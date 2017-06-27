package com.lagou.vo;

import java.util.ArrayList;
import java.util.List;

public class SkillchildtypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SkillchildtypeExample() {
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

        public Criteria andSkillchildtypeidIsNull() {
            addCriterion("skillChildTypeId is null");
            return (Criteria) this;
        }

        public Criteria andSkillchildtypeidIsNotNull() {
            addCriterion("skillChildTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andSkillchildtypeidEqualTo(Integer value) {
            addCriterion("skillChildTypeId =", value, "skillchildtypeid");
            return (Criteria) this;
        }

        public Criteria andSkillchildtypeidNotEqualTo(Integer value) {
            addCriterion("skillChildTypeId <>", value, "skillchildtypeid");
            return (Criteria) this;
        }

        public Criteria andSkillchildtypeidGreaterThan(Integer value) {
            addCriterion("skillChildTypeId >", value, "skillchildtypeid");
            return (Criteria) this;
        }

        public Criteria andSkillchildtypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("skillChildTypeId >=", value, "skillchildtypeid");
            return (Criteria) this;
        }

        public Criteria andSkillchildtypeidLessThan(Integer value) {
            addCriterion("skillChildTypeId <", value, "skillchildtypeid");
            return (Criteria) this;
        }

        public Criteria andSkillchildtypeidLessThanOrEqualTo(Integer value) {
            addCriterion("skillChildTypeId <=", value, "skillchildtypeid");
            return (Criteria) this;
        }

        public Criteria andSkillchildtypeidIn(List<Integer> values) {
            addCriterion("skillChildTypeId in", values, "skillchildtypeid");
            return (Criteria) this;
        }

        public Criteria andSkillchildtypeidNotIn(List<Integer> values) {
            addCriterion("skillChildTypeId not in", values, "skillchildtypeid");
            return (Criteria) this;
        }

        public Criteria andSkillchildtypeidBetween(Integer value1, Integer value2) {
            addCriterion("skillChildTypeId between", value1, value2, "skillchildtypeid");
            return (Criteria) this;
        }

        public Criteria andSkillchildtypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("skillChildTypeId not between", value1, value2, "skillchildtypeid");
            return (Criteria) this;
        }

        public Criteria andSkillchildtypenameIsNull() {
            addCriterion("skillChildTypeName is null");
            return (Criteria) this;
        }

        public Criteria andSkillchildtypenameIsNotNull() {
            addCriterion("skillChildTypeName is not null");
            return (Criteria) this;
        }

        public Criteria andSkillchildtypenameEqualTo(String value) {
            addCriterion("skillChildTypeName =", value, "skillchildtypename");
            return (Criteria) this;
        }

        public Criteria andSkillchildtypenameNotEqualTo(String value) {
            addCriterion("skillChildTypeName <>", value, "skillchildtypename");
            return (Criteria) this;
        }

        public Criteria andSkillchildtypenameGreaterThan(String value) {
            addCriterion("skillChildTypeName >", value, "skillchildtypename");
            return (Criteria) this;
        }

        public Criteria andSkillchildtypenameGreaterThanOrEqualTo(String value) {
            addCriterion("skillChildTypeName >=", value, "skillchildtypename");
            return (Criteria) this;
        }

        public Criteria andSkillchildtypenameLessThan(String value) {
            addCriterion("skillChildTypeName <", value, "skillchildtypename");
            return (Criteria) this;
        }

        public Criteria andSkillchildtypenameLessThanOrEqualTo(String value) {
            addCriterion("skillChildTypeName <=", value, "skillchildtypename");
            return (Criteria) this;
        }

        public Criteria andSkillchildtypenameLike(String value) {
            addCriterion("skillChildTypeName like", value, "skillchildtypename");
            return (Criteria) this;
        }

        public Criteria andSkillchildtypenameNotLike(String value) {
            addCriterion("skillChildTypeName not like", value, "skillchildtypename");
            return (Criteria) this;
        }

        public Criteria andSkillchildtypenameIn(List<String> values) {
            addCriterion("skillChildTypeName in", values, "skillchildtypename");
            return (Criteria) this;
        }

        public Criteria andSkillchildtypenameNotIn(List<String> values) {
            addCriterion("skillChildTypeName not in", values, "skillchildtypename");
            return (Criteria) this;
        }

        public Criteria andSkillchildtypenameBetween(String value1, String value2) {
            addCriterion("skillChildTypeName between", value1, value2, "skillchildtypename");
            return (Criteria) this;
        }

        public Criteria andSkillchildtypenameNotBetween(String value1, String value2) {
            addCriterion("skillChildTypeName not between", value1, value2, "skillchildtypename");
            return (Criteria) this;
        }

        public Criteria andSkilltypeidIsNull() {
            addCriterion("skillTypeId is null");
            return (Criteria) this;
        }

        public Criteria andSkilltypeidIsNotNull() {
            addCriterion("skillTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andSkilltypeidEqualTo(Integer value) {
            addCriterion("skillTypeId =", value, "skilltypeid");
            return (Criteria) this;
        }

        public Criteria andSkilltypeidNotEqualTo(Integer value) {
            addCriterion("skillTypeId <>", value, "skilltypeid");
            return (Criteria) this;
        }

        public Criteria andSkilltypeidGreaterThan(Integer value) {
            addCriterion("skillTypeId >", value, "skilltypeid");
            return (Criteria) this;
        }

        public Criteria andSkilltypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("skillTypeId >=", value, "skilltypeid");
            return (Criteria) this;
        }

        public Criteria andSkilltypeidLessThan(Integer value) {
            addCriterion("skillTypeId <", value, "skilltypeid");
            return (Criteria) this;
        }

        public Criteria andSkilltypeidLessThanOrEqualTo(Integer value) {
            addCriterion("skillTypeId <=", value, "skilltypeid");
            return (Criteria) this;
        }

        public Criteria andSkilltypeidIn(List<Integer> values) {
            addCriterion("skillTypeId in", values, "skilltypeid");
            return (Criteria) this;
        }

        public Criteria andSkilltypeidNotIn(List<Integer> values) {
            addCriterion("skillTypeId not in", values, "skilltypeid");
            return (Criteria) this;
        }

        public Criteria andSkilltypeidBetween(Integer value1, Integer value2) {
            addCriterion("skillTypeId between", value1, value2, "skilltypeid");
            return (Criteria) this;
        }

        public Criteria andSkilltypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("skillTypeId not between", value1, value2, "skilltypeid");
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