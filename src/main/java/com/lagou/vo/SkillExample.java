package com.lagou.vo;

import java.util.ArrayList;
import java.util.List;

public class SkillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SkillExample() {
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

        public Criteria andSkillnameIsNull() {
            addCriterion("skillName is null");
            return (Criteria) this;
        }

        public Criteria andSkillnameIsNotNull() {
            addCriterion("skillName is not null");
            return (Criteria) this;
        }

        public Criteria andSkillnameEqualTo(String value) {
            addCriterion("skillName =", value, "skillname");
            return (Criteria) this;
        }

        public Criteria andSkillnameNotEqualTo(String value) {
            addCriterion("skillName <>", value, "skillname");
            return (Criteria) this;
        }

        public Criteria andSkillnameGreaterThan(String value) {
            addCriterion("skillName >", value, "skillname");
            return (Criteria) this;
        }

        public Criteria andSkillnameGreaterThanOrEqualTo(String value) {
            addCriterion("skillName >=", value, "skillname");
            return (Criteria) this;
        }

        public Criteria andSkillnameLessThan(String value) {
            addCriterion("skillName <", value, "skillname");
            return (Criteria) this;
        }

        public Criteria andSkillnameLessThanOrEqualTo(String value) {
            addCriterion("skillName <=", value, "skillname");
            return (Criteria) this;
        }

        public Criteria andSkillnameLike(String value) {
            addCriterion("skillName like", value, "skillname");
            return (Criteria) this;
        }

        public Criteria andSkillnameNotLike(String value) {
            addCriterion("skillName not like", value, "skillname");
            return (Criteria) this;
        }

        public Criteria andSkillnameIn(List<String> values) {
            addCriterion("skillName in", values, "skillname");
            return (Criteria) this;
        }

        public Criteria andSkillnameNotIn(List<String> values) {
            addCriterion("skillName not in", values, "skillname");
            return (Criteria) this;
        }

        public Criteria andSkillnameBetween(String value1, String value2) {
            addCriterion("skillName between", value1, value2, "skillname");
            return (Criteria) this;
        }

        public Criteria andSkillnameNotBetween(String value1, String value2) {
            addCriterion("skillName not between", value1, value2, "skillname");
            return (Criteria) this;
        }

        public Criteria andSkillclickIsNull() {
            addCriterion("skillClick is null");
            return (Criteria) this;
        }

        public Criteria andSkillclickIsNotNull() {
            addCriterion("skillClick is not null");
            return (Criteria) this;
        }

        public Criteria andSkillclickEqualTo(Integer value) {
            addCriterion("skillClick =", value, "skillclick");
            return (Criteria) this;
        }

        public Criteria andSkillclickNotEqualTo(Integer value) {
            addCriterion("skillClick <>", value, "skillclick");
            return (Criteria) this;
        }

        public Criteria andSkillclickGreaterThan(Integer value) {
            addCriterion("skillClick >", value, "skillclick");
            return (Criteria) this;
        }

        public Criteria andSkillclickGreaterThanOrEqualTo(Integer value) {
            addCriterion("skillClick >=", value, "skillclick");
            return (Criteria) this;
        }

        public Criteria andSkillclickLessThan(Integer value) {
            addCriterion("skillClick <", value, "skillclick");
            return (Criteria) this;
        }

        public Criteria andSkillclickLessThanOrEqualTo(Integer value) {
            addCriterion("skillClick <=", value, "skillclick");
            return (Criteria) this;
        }

        public Criteria andSkillclickIn(List<Integer> values) {
            addCriterion("skillClick in", values, "skillclick");
            return (Criteria) this;
        }

        public Criteria andSkillclickNotIn(List<Integer> values) {
            addCriterion("skillClick not in", values, "skillclick");
            return (Criteria) this;
        }

        public Criteria andSkillclickBetween(Integer value1, Integer value2) {
            addCriterion("skillClick between", value1, value2, "skillclick");
            return (Criteria) this;
        }

        public Criteria andSkillclickNotBetween(Integer value1, Integer value2) {
            addCriterion("skillClick not between", value1, value2, "skillclick");
            return (Criteria) this;
        }

        public Criteria andSkillshortcutIsNull() {
            addCriterion("skillShortcut is null");
            return (Criteria) this;
        }

        public Criteria andSkillshortcutIsNotNull() {
            addCriterion("skillShortcut is not null");
            return (Criteria) this;
        }

        public Criteria andSkillshortcutEqualTo(Integer value) {
            addCriterion("skillShortcut =", value, "skillshortcut");
            return (Criteria) this;
        }

        public Criteria andSkillshortcutNotEqualTo(Integer value) {
            addCriterion("skillShortcut <>", value, "skillshortcut");
            return (Criteria) this;
        }

        public Criteria andSkillshortcutGreaterThan(Integer value) {
            addCriterion("skillShortcut >", value, "skillshortcut");
            return (Criteria) this;
        }

        public Criteria andSkillshortcutGreaterThanOrEqualTo(Integer value) {
            addCriterion("skillShortcut >=", value, "skillshortcut");
            return (Criteria) this;
        }

        public Criteria andSkillshortcutLessThan(Integer value) {
            addCriterion("skillShortcut <", value, "skillshortcut");
            return (Criteria) this;
        }

        public Criteria andSkillshortcutLessThanOrEqualTo(Integer value) {
            addCriterion("skillShortcut <=", value, "skillshortcut");
            return (Criteria) this;
        }

        public Criteria andSkillshortcutIn(List<Integer> values) {
            addCriterion("skillShortcut in", values, "skillshortcut");
            return (Criteria) this;
        }

        public Criteria andSkillshortcutNotIn(List<Integer> values) {
            addCriterion("skillShortcut not in", values, "skillshortcut");
            return (Criteria) this;
        }

        public Criteria andSkillshortcutBetween(Integer value1, Integer value2) {
            addCriterion("skillShortcut between", value1, value2, "skillshortcut");
            return (Criteria) this;
        }

        public Criteria andSkillshortcutNotBetween(Integer value1, Integer value2) {
            addCriterion("skillShortcut not between", value1, value2, "skillshortcut");
            return (Criteria) this;
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