package com.lagou.vo;

import java.util.ArrayList;
import java.util.List;

public class LeaderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LeaderExample() {
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

        public Criteria andLeaderidIsNull() {
            addCriterion("leaderId is null");
            return (Criteria) this;
        }

        public Criteria andLeaderidIsNotNull() {
            addCriterion("leaderId is not null");
            return (Criteria) this;
        }

        public Criteria andLeaderidEqualTo(Integer value) {
            addCriterion("leaderId =", value, "leaderid");
            return (Criteria) this;
        }

        public Criteria andLeaderidNotEqualTo(Integer value) {
            addCriterion("leaderId <>", value, "leaderid");
            return (Criteria) this;
        }

        public Criteria andLeaderidGreaterThan(Integer value) {
            addCriterion("leaderId >", value, "leaderid");
            return (Criteria) this;
        }

        public Criteria andLeaderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("leaderId >=", value, "leaderid");
            return (Criteria) this;
        }

        public Criteria andLeaderidLessThan(Integer value) {
            addCriterion("leaderId <", value, "leaderid");
            return (Criteria) this;
        }

        public Criteria andLeaderidLessThanOrEqualTo(Integer value) {
            addCriterion("leaderId <=", value, "leaderid");
            return (Criteria) this;
        }

        public Criteria andLeaderidIn(List<Integer> values) {
            addCriterion("leaderId in", values, "leaderid");
            return (Criteria) this;
        }

        public Criteria andLeaderidNotIn(List<Integer> values) {
            addCriterion("leaderId not in", values, "leaderid");
            return (Criteria) this;
        }

        public Criteria andLeaderidBetween(Integer value1, Integer value2) {
            addCriterion("leaderId between", value1, value2, "leaderid");
            return (Criteria) this;
        }

        public Criteria andLeaderidNotBetween(Integer value1, Integer value2) {
            addCriterion("leaderId not between", value1, value2, "leaderid");
            return (Criteria) this;
        }

        public Criteria andLeadernameIsNull() {
            addCriterion("leaderName is null");
            return (Criteria) this;
        }

        public Criteria andLeadernameIsNotNull() {
            addCriterion("leaderName is not null");
            return (Criteria) this;
        }

        public Criteria andLeadernameEqualTo(String value) {
            addCriterion("leaderName =", value, "leadername");
            return (Criteria) this;
        }

        public Criteria andLeadernameNotEqualTo(String value) {
            addCriterion("leaderName <>", value, "leadername");
            return (Criteria) this;
        }

        public Criteria andLeadernameGreaterThan(String value) {
            addCriterion("leaderName >", value, "leadername");
            return (Criteria) this;
        }

        public Criteria andLeadernameGreaterThanOrEqualTo(String value) {
            addCriterion("leaderName >=", value, "leadername");
            return (Criteria) this;
        }

        public Criteria andLeadernameLessThan(String value) {
            addCriterion("leaderName <", value, "leadername");
            return (Criteria) this;
        }

        public Criteria andLeadernameLessThanOrEqualTo(String value) {
            addCriterion("leaderName <=", value, "leadername");
            return (Criteria) this;
        }

        public Criteria andLeadernameLike(String value) {
            addCriterion("leaderName like", value, "leadername");
            return (Criteria) this;
        }

        public Criteria andLeadernameNotLike(String value) {
            addCriterion("leaderName not like", value, "leadername");
            return (Criteria) this;
        }

        public Criteria andLeadernameIn(List<String> values) {
            addCriterion("leaderName in", values, "leadername");
            return (Criteria) this;
        }

        public Criteria andLeadernameNotIn(List<String> values) {
            addCriterion("leaderName not in", values, "leadername");
            return (Criteria) this;
        }

        public Criteria andLeadernameBetween(String value1, String value2) {
            addCriterion("leaderName between", value1, value2, "leadername");
            return (Criteria) this;
        }

        public Criteria andLeadernameNotBetween(String value1, String value2) {
            addCriterion("leaderName not between", value1, value2, "leadername");
            return (Criteria) this;
        }

        public Criteria andLeaderportraitIsNull() {
            addCriterion("leaderPortrait is null");
            return (Criteria) this;
        }

        public Criteria andLeaderportraitIsNotNull() {
            addCriterion("leaderPortrait is not null");
            return (Criteria) this;
        }

        public Criteria andLeaderportraitEqualTo(String value) {
            addCriterion("leaderPortrait =", value, "leaderportrait");
            return (Criteria) this;
        }

        public Criteria andLeaderportraitNotEqualTo(String value) {
            addCriterion("leaderPortrait <>", value, "leaderportrait");
            return (Criteria) this;
        }

        public Criteria andLeaderportraitGreaterThan(String value) {
            addCriterion("leaderPortrait >", value, "leaderportrait");
            return (Criteria) this;
        }

        public Criteria andLeaderportraitGreaterThanOrEqualTo(String value) {
            addCriterion("leaderPortrait >=", value, "leaderportrait");
            return (Criteria) this;
        }

        public Criteria andLeaderportraitLessThan(String value) {
            addCriterion("leaderPortrait <", value, "leaderportrait");
            return (Criteria) this;
        }

        public Criteria andLeaderportraitLessThanOrEqualTo(String value) {
            addCriterion("leaderPortrait <=", value, "leaderportrait");
            return (Criteria) this;
        }

        public Criteria andLeaderportraitLike(String value) {
            addCriterion("leaderPortrait like", value, "leaderportrait");
            return (Criteria) this;
        }

        public Criteria andLeaderportraitNotLike(String value) {
            addCriterion("leaderPortrait not like", value, "leaderportrait");
            return (Criteria) this;
        }

        public Criteria andLeaderportraitIn(List<String> values) {
            addCriterion("leaderPortrait in", values, "leaderportrait");
            return (Criteria) this;
        }

        public Criteria andLeaderportraitNotIn(List<String> values) {
            addCriterion("leaderPortrait not in", values, "leaderportrait");
            return (Criteria) this;
        }

        public Criteria andLeaderportraitBetween(String value1, String value2) {
            addCriterion("leaderPortrait between", value1, value2, "leaderportrait");
            return (Criteria) this;
        }

        public Criteria andLeaderportraitNotBetween(String value1, String value2) {
            addCriterion("leaderPortrait not between", value1, value2, "leaderportrait");
            return (Criteria) this;
        }

        public Criteria andLeanderpositionIsNull() {
            addCriterion("leanderPosition is null");
            return (Criteria) this;
        }

        public Criteria andLeanderpositionIsNotNull() {
            addCriterion("leanderPosition is not null");
            return (Criteria) this;
        }

        public Criteria andLeanderpositionEqualTo(String value) {
            addCriterion("leanderPosition =", value, "leanderposition");
            return (Criteria) this;
        }

        public Criteria andLeanderpositionNotEqualTo(String value) {
            addCriterion("leanderPosition <>", value, "leanderposition");
            return (Criteria) this;
        }

        public Criteria andLeanderpositionGreaterThan(String value) {
            addCriterion("leanderPosition >", value, "leanderposition");
            return (Criteria) this;
        }

        public Criteria andLeanderpositionGreaterThanOrEqualTo(String value) {
            addCriterion("leanderPosition >=", value, "leanderposition");
            return (Criteria) this;
        }

        public Criteria andLeanderpositionLessThan(String value) {
            addCriterion("leanderPosition <", value, "leanderposition");
            return (Criteria) this;
        }

        public Criteria andLeanderpositionLessThanOrEqualTo(String value) {
            addCriterion("leanderPosition <=", value, "leanderposition");
            return (Criteria) this;
        }

        public Criteria andLeanderpositionLike(String value) {
            addCriterion("leanderPosition like", value, "leanderposition");
            return (Criteria) this;
        }

        public Criteria andLeanderpositionNotLike(String value) {
            addCriterion("leanderPosition not like", value, "leanderposition");
            return (Criteria) this;
        }

        public Criteria andLeanderpositionIn(List<String> values) {
            addCriterion("leanderPosition in", values, "leanderposition");
            return (Criteria) this;
        }

        public Criteria andLeanderpositionNotIn(List<String> values) {
            addCriterion("leanderPosition not in", values, "leanderposition");
            return (Criteria) this;
        }

        public Criteria andLeanderpositionBetween(String value1, String value2) {
            addCriterion("leanderPosition between", value1, value2, "leanderposition");
            return (Criteria) this;
        }

        public Criteria andLeanderpositionNotBetween(String value1, String value2) {
            addCriterion("leanderPosition not between", value1, value2, "leanderposition");
            return (Criteria) this;
        }

        public Criteria andLeaderweiboIsNull() {
            addCriterion("leaderWeibo is null");
            return (Criteria) this;
        }

        public Criteria andLeaderweiboIsNotNull() {
            addCriterion("leaderWeibo is not null");
            return (Criteria) this;
        }

        public Criteria andLeaderweiboEqualTo(String value) {
            addCriterion("leaderWeibo =", value, "leaderweibo");
            return (Criteria) this;
        }

        public Criteria andLeaderweiboNotEqualTo(String value) {
            addCriterion("leaderWeibo <>", value, "leaderweibo");
            return (Criteria) this;
        }

        public Criteria andLeaderweiboGreaterThan(String value) {
            addCriterion("leaderWeibo >", value, "leaderweibo");
            return (Criteria) this;
        }

        public Criteria andLeaderweiboGreaterThanOrEqualTo(String value) {
            addCriterion("leaderWeibo >=", value, "leaderweibo");
            return (Criteria) this;
        }

        public Criteria andLeaderweiboLessThan(String value) {
            addCriterion("leaderWeibo <", value, "leaderweibo");
            return (Criteria) this;
        }

        public Criteria andLeaderweiboLessThanOrEqualTo(String value) {
            addCriterion("leaderWeibo <=", value, "leaderweibo");
            return (Criteria) this;
        }

        public Criteria andLeaderweiboLike(String value) {
            addCriterion("leaderWeibo like", value, "leaderweibo");
            return (Criteria) this;
        }

        public Criteria andLeaderweiboNotLike(String value) {
            addCriterion("leaderWeibo not like", value, "leaderweibo");
            return (Criteria) this;
        }

        public Criteria andLeaderweiboIn(List<String> values) {
            addCriterion("leaderWeibo in", values, "leaderweibo");
            return (Criteria) this;
        }

        public Criteria andLeaderweiboNotIn(List<String> values) {
            addCriterion("leaderWeibo not in", values, "leaderweibo");
            return (Criteria) this;
        }

        public Criteria andLeaderweiboBetween(String value1, String value2) {
            addCriterion("leaderWeibo between", value1, value2, "leaderweibo");
            return (Criteria) this;
        }

        public Criteria andLeaderweiboNotBetween(String value1, String value2) {
            addCriterion("leaderWeibo not between", value1, value2, "leaderweibo");
            return (Criteria) this;
        }

        public Criteria andLeaderremarkIsNull() {
            addCriterion("leaderRemark is null");
            return (Criteria) this;
        }

        public Criteria andLeaderremarkIsNotNull() {
            addCriterion("leaderRemark is not null");
            return (Criteria) this;
        }

        public Criteria andLeaderremarkEqualTo(String value) {
            addCriterion("leaderRemark =", value, "leaderremark");
            return (Criteria) this;
        }

        public Criteria andLeaderremarkNotEqualTo(String value) {
            addCriterion("leaderRemark <>", value, "leaderremark");
            return (Criteria) this;
        }

        public Criteria andLeaderremarkGreaterThan(String value) {
            addCriterion("leaderRemark >", value, "leaderremark");
            return (Criteria) this;
        }

        public Criteria andLeaderremarkGreaterThanOrEqualTo(String value) {
            addCriterion("leaderRemark >=", value, "leaderremark");
            return (Criteria) this;
        }

        public Criteria andLeaderremarkLessThan(String value) {
            addCriterion("leaderRemark <", value, "leaderremark");
            return (Criteria) this;
        }

        public Criteria andLeaderremarkLessThanOrEqualTo(String value) {
            addCriterion("leaderRemark <=", value, "leaderremark");
            return (Criteria) this;
        }

        public Criteria andLeaderremarkLike(String value) {
            addCriterion("leaderRemark like", value, "leaderremark");
            return (Criteria) this;
        }

        public Criteria andLeaderremarkNotLike(String value) {
            addCriterion("leaderRemark not like", value, "leaderremark");
            return (Criteria) this;
        }

        public Criteria andLeaderremarkIn(List<String> values) {
            addCriterion("leaderRemark in", values, "leaderremark");
            return (Criteria) this;
        }

        public Criteria andLeaderremarkNotIn(List<String> values) {
            addCriterion("leaderRemark not in", values, "leaderremark");
            return (Criteria) this;
        }

        public Criteria andLeaderremarkBetween(String value1, String value2) {
            addCriterion("leaderRemark between", value1, value2, "leaderremark");
            return (Criteria) this;
        }

        public Criteria andLeaderremarkNotBetween(String value1, String value2) {
            addCriterion("leaderRemark not between", value1, value2, "leaderremark");
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