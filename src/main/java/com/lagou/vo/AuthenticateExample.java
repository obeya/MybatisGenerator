package com.lagou.vo;

import java.util.ArrayList;
import java.util.List;

public class AuthenticateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AuthenticateExample() {
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

        public Criteria andAuthidIsNull() {
            addCriterion("authId is null");
            return (Criteria) this;
        }

        public Criteria andAuthidIsNotNull() {
            addCriterion("authId is not null");
            return (Criteria) this;
        }

        public Criteria andAuthidEqualTo(Integer value) {
            addCriterion("authId =", value, "authid");
            return (Criteria) this;
        }

        public Criteria andAuthidNotEqualTo(Integer value) {
            addCriterion("authId <>", value, "authid");
            return (Criteria) this;
        }

        public Criteria andAuthidGreaterThan(Integer value) {
            addCriterion("authId >", value, "authid");
            return (Criteria) this;
        }

        public Criteria andAuthidGreaterThanOrEqualTo(Integer value) {
            addCriterion("authId >=", value, "authid");
            return (Criteria) this;
        }

        public Criteria andAuthidLessThan(Integer value) {
            addCriterion("authId <", value, "authid");
            return (Criteria) this;
        }

        public Criteria andAuthidLessThanOrEqualTo(Integer value) {
            addCriterion("authId <=", value, "authid");
            return (Criteria) this;
        }

        public Criteria andAuthidIn(List<Integer> values) {
            addCriterion("authId in", values, "authid");
            return (Criteria) this;
        }

        public Criteria andAuthidNotIn(List<Integer> values) {
            addCriterion("authId not in", values, "authid");
            return (Criteria) this;
        }

        public Criteria andAuthidBetween(Integer value1, Integer value2) {
            addCriterion("authId between", value1, value2, "authid");
            return (Criteria) this;
        }

        public Criteria andAuthidNotBetween(Integer value1, Integer value2) {
            addCriterion("authId not between", value1, value2, "authid");
            return (Criteria) this;
        }

        public Criteria andAuthcharterIsNull() {
            addCriterion("authCharter is null");
            return (Criteria) this;
        }

        public Criteria andAuthcharterIsNotNull() {
            addCriterion("authCharter is not null");
            return (Criteria) this;
        }

        public Criteria andAuthcharterEqualTo(String value) {
            addCriterion("authCharter =", value, "authcharter");
            return (Criteria) this;
        }

        public Criteria andAuthcharterNotEqualTo(String value) {
            addCriterion("authCharter <>", value, "authcharter");
            return (Criteria) this;
        }

        public Criteria andAuthcharterGreaterThan(String value) {
            addCriterion("authCharter >", value, "authcharter");
            return (Criteria) this;
        }

        public Criteria andAuthcharterGreaterThanOrEqualTo(String value) {
            addCriterion("authCharter >=", value, "authcharter");
            return (Criteria) this;
        }

        public Criteria andAuthcharterLessThan(String value) {
            addCriterion("authCharter <", value, "authcharter");
            return (Criteria) this;
        }

        public Criteria andAuthcharterLessThanOrEqualTo(String value) {
            addCriterion("authCharter <=", value, "authcharter");
            return (Criteria) this;
        }

        public Criteria andAuthcharterLike(String value) {
            addCriterion("authCharter like", value, "authcharter");
            return (Criteria) this;
        }

        public Criteria andAuthcharterNotLike(String value) {
            addCriterion("authCharter not like", value, "authcharter");
            return (Criteria) this;
        }

        public Criteria andAuthcharterIn(List<String> values) {
            addCriterion("authCharter in", values, "authcharter");
            return (Criteria) this;
        }

        public Criteria andAuthcharterNotIn(List<String> values) {
            addCriterion("authCharter not in", values, "authcharter");
            return (Criteria) this;
        }

        public Criteria andAuthcharterBetween(String value1, String value2) {
            addCriterion("authCharter between", value1, value2, "authcharter");
            return (Criteria) this;
        }

        public Criteria andAuthcharterNotBetween(String value1, String value2) {
            addCriterion("authCharter not between", value1, value2, "authcharter");
            return (Criteria) this;
        }

        public Criteria andAuthcowebsiteIsNull() {
            addCriterion("authCoWebsite is null");
            return (Criteria) this;
        }

        public Criteria andAuthcowebsiteIsNotNull() {
            addCriterion("authCoWebsite is not null");
            return (Criteria) this;
        }

        public Criteria andAuthcowebsiteEqualTo(String value) {
            addCriterion("authCoWebsite =", value, "authcowebsite");
            return (Criteria) this;
        }

        public Criteria andAuthcowebsiteNotEqualTo(String value) {
            addCriterion("authCoWebsite <>", value, "authcowebsite");
            return (Criteria) this;
        }

        public Criteria andAuthcowebsiteGreaterThan(String value) {
            addCriterion("authCoWebsite >", value, "authcowebsite");
            return (Criteria) this;
        }

        public Criteria andAuthcowebsiteGreaterThanOrEqualTo(String value) {
            addCriterion("authCoWebsite >=", value, "authcowebsite");
            return (Criteria) this;
        }

        public Criteria andAuthcowebsiteLessThan(String value) {
            addCriterion("authCoWebsite <", value, "authcowebsite");
            return (Criteria) this;
        }

        public Criteria andAuthcowebsiteLessThanOrEqualTo(String value) {
            addCriterion("authCoWebsite <=", value, "authcowebsite");
            return (Criteria) this;
        }

        public Criteria andAuthcowebsiteLike(String value) {
            addCriterion("authCoWebsite like", value, "authcowebsite");
            return (Criteria) this;
        }

        public Criteria andAuthcowebsiteNotLike(String value) {
            addCriterion("authCoWebsite not like", value, "authcowebsite");
            return (Criteria) this;
        }

        public Criteria andAuthcowebsiteIn(List<String> values) {
            addCriterion("authCoWebsite in", values, "authcowebsite");
            return (Criteria) this;
        }

        public Criteria andAuthcowebsiteNotIn(List<String> values) {
            addCriterion("authCoWebsite not in", values, "authcowebsite");
            return (Criteria) this;
        }

        public Criteria andAuthcowebsiteBetween(String value1, String value2) {
            addCriterion("authCoWebsite between", value1, value2, "authcowebsite");
            return (Criteria) this;
        }

        public Criteria andAuthcowebsiteNotBetween(String value1, String value2) {
            addCriterion("authCoWebsite not between", value1, value2, "authcowebsite");
            return (Criteria) this;
        }

        public Criteria andAuthconameIsNull() {
            addCriterion("authCoName is null");
            return (Criteria) this;
        }

        public Criteria andAuthconameIsNotNull() {
            addCriterion("authCoName is not null");
            return (Criteria) this;
        }

        public Criteria andAuthconameEqualTo(String value) {
            addCriterion("authCoName =", value, "authconame");
            return (Criteria) this;
        }

        public Criteria andAuthconameNotEqualTo(String value) {
            addCriterion("authCoName <>", value, "authconame");
            return (Criteria) this;
        }

        public Criteria andAuthconameGreaterThan(String value) {
            addCriterion("authCoName >", value, "authconame");
            return (Criteria) this;
        }

        public Criteria andAuthconameGreaterThanOrEqualTo(String value) {
            addCriterion("authCoName >=", value, "authconame");
            return (Criteria) this;
        }

        public Criteria andAuthconameLessThan(String value) {
            addCriterion("authCoName <", value, "authconame");
            return (Criteria) this;
        }

        public Criteria andAuthconameLessThanOrEqualTo(String value) {
            addCriterion("authCoName <=", value, "authconame");
            return (Criteria) this;
        }

        public Criteria andAuthconameLike(String value) {
            addCriterion("authCoName like", value, "authconame");
            return (Criteria) this;
        }

        public Criteria andAuthconameNotLike(String value) {
            addCriterion("authCoName not like", value, "authconame");
            return (Criteria) this;
        }

        public Criteria andAuthconameIn(List<String> values) {
            addCriterion("authCoName in", values, "authconame");
            return (Criteria) this;
        }

        public Criteria andAuthconameNotIn(List<String> values) {
            addCriterion("authCoName not in", values, "authconame");
            return (Criteria) this;
        }

        public Criteria andAuthconameBetween(String value1, String value2) {
            addCriterion("authCoName between", value1, value2, "authconame");
            return (Criteria) this;
        }

        public Criteria andAuthconameNotBetween(String value1, String value2) {
            addCriterion("authCoName not between", value1, value2, "authconame");
            return (Criteria) this;
        }

        public Criteria andAuthcologoIsNull() {
            addCriterion("authCoLOGO is null");
            return (Criteria) this;
        }

        public Criteria andAuthcologoIsNotNull() {
            addCriterion("authCoLOGO is not null");
            return (Criteria) this;
        }

        public Criteria andAuthcologoEqualTo(String value) {
            addCriterion("authCoLOGO =", value, "authcologo");
            return (Criteria) this;
        }

        public Criteria andAuthcologoNotEqualTo(String value) {
            addCriterion("authCoLOGO <>", value, "authcologo");
            return (Criteria) this;
        }

        public Criteria andAuthcologoGreaterThan(String value) {
            addCriterion("authCoLOGO >", value, "authcologo");
            return (Criteria) this;
        }

        public Criteria andAuthcologoGreaterThanOrEqualTo(String value) {
            addCriterion("authCoLOGO >=", value, "authcologo");
            return (Criteria) this;
        }

        public Criteria andAuthcologoLessThan(String value) {
            addCriterion("authCoLOGO <", value, "authcologo");
            return (Criteria) this;
        }

        public Criteria andAuthcologoLessThanOrEqualTo(String value) {
            addCriterion("authCoLOGO <=", value, "authcologo");
            return (Criteria) this;
        }

        public Criteria andAuthcologoLike(String value) {
            addCriterion("authCoLOGO like", value, "authcologo");
            return (Criteria) this;
        }

        public Criteria andAuthcologoNotLike(String value) {
            addCriterion("authCoLOGO not like", value, "authcologo");
            return (Criteria) this;
        }

        public Criteria andAuthcologoIn(List<String> values) {
            addCriterion("authCoLOGO in", values, "authcologo");
            return (Criteria) this;
        }

        public Criteria andAuthcologoNotIn(List<String> values) {
            addCriterion("authCoLOGO not in", values, "authcologo");
            return (Criteria) this;
        }

        public Criteria andAuthcologoBetween(String value1, String value2) {
            addCriterion("authCoLOGO between", value1, value2, "authcologo");
            return (Criteria) this;
        }

        public Criteria andAuthcologoNotBetween(String value1, String value2) {
            addCriterion("authCoLOGO not between", value1, value2, "authcologo");
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

        public Criteria andAuthstateIsNull() {
            addCriterion("authState is null");
            return (Criteria) this;
        }

        public Criteria andAuthstateIsNotNull() {
            addCriterion("authState is not null");
            return (Criteria) this;
        }

        public Criteria andAuthstateEqualTo(Integer value) {
            addCriterion("authState =", value, "authstate");
            return (Criteria) this;
        }

        public Criteria andAuthstateNotEqualTo(Integer value) {
            addCriterion("authState <>", value, "authstate");
            return (Criteria) this;
        }

        public Criteria andAuthstateGreaterThan(Integer value) {
            addCriterion("authState >", value, "authstate");
            return (Criteria) this;
        }

        public Criteria andAuthstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("authState >=", value, "authstate");
            return (Criteria) this;
        }

        public Criteria andAuthstateLessThan(Integer value) {
            addCriterion("authState <", value, "authstate");
            return (Criteria) this;
        }

        public Criteria andAuthstateLessThanOrEqualTo(Integer value) {
            addCriterion("authState <=", value, "authstate");
            return (Criteria) this;
        }

        public Criteria andAuthstateIn(List<Integer> values) {
            addCriterion("authState in", values, "authstate");
            return (Criteria) this;
        }

        public Criteria andAuthstateNotIn(List<Integer> values) {
            addCriterion("authState not in", values, "authstate");
            return (Criteria) this;
        }

        public Criteria andAuthstateBetween(Integer value1, Integer value2) {
            addCriterion("authState between", value1, value2, "authstate");
            return (Criteria) this;
        }

        public Criteria andAuthstateNotBetween(Integer value1, Integer value2) {
            addCriterion("authState not between", value1, value2, "authstate");
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