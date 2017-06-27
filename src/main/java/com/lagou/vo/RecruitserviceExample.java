package com.lagou.vo;

import java.util.ArrayList;
import java.util.List;

public class RecruitserviceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecruitserviceExample() {
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

        public Criteria andRecruitidIsNull() {
            addCriterion("recruitId is null");
            return (Criteria) this;
        }

        public Criteria andRecruitidIsNotNull() {
            addCriterion("recruitId is not null");
            return (Criteria) this;
        }

        public Criteria andRecruitidEqualTo(Integer value) {
            addCriterion("recruitId =", value, "recruitid");
            return (Criteria) this;
        }

        public Criteria andRecruitidNotEqualTo(Integer value) {
            addCriterion("recruitId <>", value, "recruitid");
            return (Criteria) this;
        }

        public Criteria andRecruitidGreaterThan(Integer value) {
            addCriterion("recruitId >", value, "recruitid");
            return (Criteria) this;
        }

        public Criteria andRecruitidGreaterThanOrEqualTo(Integer value) {
            addCriterion("recruitId >=", value, "recruitid");
            return (Criteria) this;
        }

        public Criteria andRecruitidLessThan(Integer value) {
            addCriterion("recruitId <", value, "recruitid");
            return (Criteria) this;
        }

        public Criteria andRecruitidLessThanOrEqualTo(Integer value) {
            addCriterion("recruitId <=", value, "recruitid");
            return (Criteria) this;
        }

        public Criteria andRecruitidIn(List<Integer> values) {
            addCriterion("recruitId in", values, "recruitid");
            return (Criteria) this;
        }

        public Criteria andRecruitidNotIn(List<Integer> values) {
            addCriterion("recruitId not in", values, "recruitid");
            return (Criteria) this;
        }

        public Criteria andRecruitidBetween(Integer value1, Integer value2) {
            addCriterion("recruitId between", value1, value2, "recruitid");
            return (Criteria) this;
        }

        public Criteria andRecruitidNotBetween(Integer value1, Integer value2) {
            addCriterion("recruitId not between", value1, value2, "recruitid");
            return (Criteria) this;
        }

        public Criteria andRecruittelIsNull() {
            addCriterion("recruitTel is null");
            return (Criteria) this;
        }

        public Criteria andRecruittelIsNotNull() {
            addCriterion("recruitTel is not null");
            return (Criteria) this;
        }

        public Criteria andRecruittelEqualTo(String value) {
            addCriterion("recruitTel =", value, "recruittel");
            return (Criteria) this;
        }

        public Criteria andRecruittelNotEqualTo(String value) {
            addCriterion("recruitTel <>", value, "recruittel");
            return (Criteria) this;
        }

        public Criteria andRecruittelGreaterThan(String value) {
            addCriterion("recruitTel >", value, "recruittel");
            return (Criteria) this;
        }

        public Criteria andRecruittelGreaterThanOrEqualTo(String value) {
            addCriterion("recruitTel >=", value, "recruittel");
            return (Criteria) this;
        }

        public Criteria andRecruittelLessThan(String value) {
            addCriterion("recruitTel <", value, "recruittel");
            return (Criteria) this;
        }

        public Criteria andRecruittelLessThanOrEqualTo(String value) {
            addCriterion("recruitTel <=", value, "recruittel");
            return (Criteria) this;
        }

        public Criteria andRecruittelLike(String value) {
            addCriterion("recruitTel like", value, "recruittel");
            return (Criteria) this;
        }

        public Criteria andRecruittelNotLike(String value) {
            addCriterion("recruitTel not like", value, "recruittel");
            return (Criteria) this;
        }

        public Criteria andRecruittelIn(List<String> values) {
            addCriterion("recruitTel in", values, "recruittel");
            return (Criteria) this;
        }

        public Criteria andRecruittelNotIn(List<String> values) {
            addCriterion("recruitTel not in", values, "recruittel");
            return (Criteria) this;
        }

        public Criteria andRecruittelBetween(String value1, String value2) {
            addCriterion("recruitTel between", value1, value2, "recruittel");
            return (Criteria) this;
        }

        public Criteria andRecruittelNotBetween(String value1, String value2) {
            addCriterion("recruitTel not between", value1, value2, "recruittel");
            return (Criteria) this;
        }

        public Criteria andRecruitemailIsNull() {
            addCriterion("recruitEmail is null");
            return (Criteria) this;
        }

        public Criteria andRecruitemailIsNotNull() {
            addCriterion("recruitEmail is not null");
            return (Criteria) this;
        }

        public Criteria andRecruitemailEqualTo(String value) {
            addCriterion("recruitEmail =", value, "recruitemail");
            return (Criteria) this;
        }

        public Criteria andRecruitemailNotEqualTo(String value) {
            addCriterion("recruitEmail <>", value, "recruitemail");
            return (Criteria) this;
        }

        public Criteria andRecruitemailGreaterThan(String value) {
            addCriterion("recruitEmail >", value, "recruitemail");
            return (Criteria) this;
        }

        public Criteria andRecruitemailGreaterThanOrEqualTo(String value) {
            addCriterion("recruitEmail >=", value, "recruitemail");
            return (Criteria) this;
        }

        public Criteria andRecruitemailLessThan(String value) {
            addCriterion("recruitEmail <", value, "recruitemail");
            return (Criteria) this;
        }

        public Criteria andRecruitemailLessThanOrEqualTo(String value) {
            addCriterion("recruitEmail <=", value, "recruitemail");
            return (Criteria) this;
        }

        public Criteria andRecruitemailLike(String value) {
            addCriterion("recruitEmail like", value, "recruitemail");
            return (Criteria) this;
        }

        public Criteria andRecruitemailNotLike(String value) {
            addCriterion("recruitEmail not like", value, "recruitemail");
            return (Criteria) this;
        }

        public Criteria andRecruitemailIn(List<String> values) {
            addCriterion("recruitEmail in", values, "recruitemail");
            return (Criteria) this;
        }

        public Criteria andRecruitemailNotIn(List<String> values) {
            addCriterion("recruitEmail not in", values, "recruitemail");
            return (Criteria) this;
        }

        public Criteria andRecruitemailBetween(String value1, String value2) {
            addCriterion("recruitEmail between", value1, value2, "recruitemail");
            return (Criteria) this;
        }

        public Criteria andRecruitemailNotBetween(String value1, String value2) {
            addCriterion("recruitEmail not between", value1, value2, "recruitemail");
            return (Criteria) this;
        }

        public Criteria andRecruitcofullnameIsNull() {
            addCriterion("recruitCoFullName is null");
            return (Criteria) this;
        }

        public Criteria andRecruitcofullnameIsNotNull() {
            addCriterion("recruitCoFullName is not null");
            return (Criteria) this;
        }

        public Criteria andRecruitcofullnameEqualTo(String value) {
            addCriterion("recruitCoFullName =", value, "recruitcofullname");
            return (Criteria) this;
        }

        public Criteria andRecruitcofullnameNotEqualTo(String value) {
            addCriterion("recruitCoFullName <>", value, "recruitcofullname");
            return (Criteria) this;
        }

        public Criteria andRecruitcofullnameGreaterThan(String value) {
            addCriterion("recruitCoFullName >", value, "recruitcofullname");
            return (Criteria) this;
        }

        public Criteria andRecruitcofullnameGreaterThanOrEqualTo(String value) {
            addCriterion("recruitCoFullName >=", value, "recruitcofullname");
            return (Criteria) this;
        }

        public Criteria andRecruitcofullnameLessThan(String value) {
            addCriterion("recruitCoFullName <", value, "recruitcofullname");
            return (Criteria) this;
        }

        public Criteria andRecruitcofullnameLessThanOrEqualTo(String value) {
            addCriterion("recruitCoFullName <=", value, "recruitcofullname");
            return (Criteria) this;
        }

        public Criteria andRecruitcofullnameLike(String value) {
            addCriterion("recruitCoFullName like", value, "recruitcofullname");
            return (Criteria) this;
        }

        public Criteria andRecruitcofullnameNotLike(String value) {
            addCriterion("recruitCoFullName not like", value, "recruitcofullname");
            return (Criteria) this;
        }

        public Criteria andRecruitcofullnameIn(List<String> values) {
            addCriterion("recruitCoFullName in", values, "recruitcofullname");
            return (Criteria) this;
        }

        public Criteria andRecruitcofullnameNotIn(List<String> values) {
            addCriterion("recruitCoFullName not in", values, "recruitcofullname");
            return (Criteria) this;
        }

        public Criteria andRecruitcofullnameBetween(String value1, String value2) {
            addCriterion("recruitCoFullName between", value1, value2, "recruitcofullname");
            return (Criteria) this;
        }

        public Criteria andRecruitcofullnameNotBetween(String value1, String value2) {
            addCriterion("recruitCoFullName not between", value1, value2, "recruitcofullname");
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

        public Criteria andRcrtservstateIsNull() {
            addCriterion("rcrtServState is null");
            return (Criteria) this;
        }

        public Criteria andRcrtservstateIsNotNull() {
            addCriterion("rcrtServState is not null");
            return (Criteria) this;
        }

        public Criteria andRcrtservstateEqualTo(Integer value) {
            addCriterion("rcrtServState =", value, "rcrtservstate");
            return (Criteria) this;
        }

        public Criteria andRcrtservstateNotEqualTo(Integer value) {
            addCriterion("rcrtServState <>", value, "rcrtservstate");
            return (Criteria) this;
        }

        public Criteria andRcrtservstateGreaterThan(Integer value) {
            addCriterion("rcrtServState >", value, "rcrtservstate");
            return (Criteria) this;
        }

        public Criteria andRcrtservstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("rcrtServState >=", value, "rcrtservstate");
            return (Criteria) this;
        }

        public Criteria andRcrtservstateLessThan(Integer value) {
            addCriterion("rcrtServState <", value, "rcrtservstate");
            return (Criteria) this;
        }

        public Criteria andRcrtservstateLessThanOrEqualTo(Integer value) {
            addCriterion("rcrtServState <=", value, "rcrtservstate");
            return (Criteria) this;
        }

        public Criteria andRcrtservstateIn(List<Integer> values) {
            addCriterion("rcrtServState in", values, "rcrtservstate");
            return (Criteria) this;
        }

        public Criteria andRcrtservstateNotIn(List<Integer> values) {
            addCriterion("rcrtServState not in", values, "rcrtservstate");
            return (Criteria) this;
        }

        public Criteria andRcrtservstateBetween(Integer value1, Integer value2) {
            addCriterion("rcrtServState between", value1, value2, "rcrtservstate");
            return (Criteria) this;
        }

        public Criteria andRcrtservstateNotBetween(Integer value1, Integer value2) {
            addCriterion("rcrtServState not between", value1, value2, "rcrtservstate");
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