package com.lagou.vo;

import java.util.ArrayList;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
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

        public Criteria andProductidIsNull() {
            addCriterion("productId is null");
            return (Criteria) this;
        }

        public Criteria andProductidIsNotNull() {
            addCriterion("productId is not null");
            return (Criteria) this;
        }

        public Criteria andProductidEqualTo(Integer value) {
            addCriterion("productId =", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotEqualTo(Integer value) {
            addCriterion("productId <>", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThan(Integer value) {
            addCriterion("productId >", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThanOrEqualTo(Integer value) {
            addCriterion("productId >=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThan(Integer value) {
            addCriterion("productId <", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThanOrEqualTo(Integer value) {
            addCriterion("productId <=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidIn(List<Integer> values) {
            addCriterion("productId in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotIn(List<Integer> values) {
            addCriterion("productId not in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidBetween(Integer value1, Integer value2) {
            addCriterion("productId between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotBetween(Integer value1, Integer value2) {
            addCriterion("productId not between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNull() {
            addCriterion("productName is null");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNotNull() {
            addCriterion("productName is not null");
            return (Criteria) this;
        }

        public Criteria andProductnameEqualTo(String value) {
            addCriterion("productName =", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotEqualTo(String value) {
            addCriterion("productName <>", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThan(String value) {
            addCriterion("productName >", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThanOrEqualTo(String value) {
            addCriterion("productName >=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThan(String value) {
            addCriterion("productName <", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThanOrEqualTo(String value) {
            addCriterion("productName <=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLike(String value) {
            addCriterion("productName like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotLike(String value) {
            addCriterion("productName not like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameIn(List<String> values) {
            addCriterion("productName in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotIn(List<String> values) {
            addCriterion("productName not in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameBetween(String value1, String value2) {
            addCriterion("productName between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotBetween(String value1, String value2) {
            addCriterion("productName not between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andProducturlIsNull() {
            addCriterion("productUrl is null");
            return (Criteria) this;
        }

        public Criteria andProducturlIsNotNull() {
            addCriterion("productUrl is not null");
            return (Criteria) this;
        }

        public Criteria andProducturlEqualTo(String value) {
            addCriterion("productUrl =", value, "producturl");
            return (Criteria) this;
        }

        public Criteria andProducturlNotEqualTo(String value) {
            addCriterion("productUrl <>", value, "producturl");
            return (Criteria) this;
        }

        public Criteria andProducturlGreaterThan(String value) {
            addCriterion("productUrl >", value, "producturl");
            return (Criteria) this;
        }

        public Criteria andProducturlGreaterThanOrEqualTo(String value) {
            addCriterion("productUrl >=", value, "producturl");
            return (Criteria) this;
        }

        public Criteria andProducturlLessThan(String value) {
            addCriterion("productUrl <", value, "producturl");
            return (Criteria) this;
        }

        public Criteria andProducturlLessThanOrEqualTo(String value) {
            addCriterion("productUrl <=", value, "producturl");
            return (Criteria) this;
        }

        public Criteria andProducturlLike(String value) {
            addCriterion("productUrl like", value, "producturl");
            return (Criteria) this;
        }

        public Criteria andProducturlNotLike(String value) {
            addCriterion("productUrl not like", value, "producturl");
            return (Criteria) this;
        }

        public Criteria andProducturlIn(List<String> values) {
            addCriterion("productUrl in", values, "producturl");
            return (Criteria) this;
        }

        public Criteria andProducturlNotIn(List<String> values) {
            addCriterion("productUrl not in", values, "producturl");
            return (Criteria) this;
        }

        public Criteria andProducturlBetween(String value1, String value2) {
            addCriterion("productUrl between", value1, value2, "producturl");
            return (Criteria) this;
        }

        public Criteria andProducturlNotBetween(String value1, String value2) {
            addCriterion("productUrl not between", value1, value2, "producturl");
            return (Criteria) this;
        }

        public Criteria andProductprofileIsNull() {
            addCriterion("productProfile is null");
            return (Criteria) this;
        }

        public Criteria andProductprofileIsNotNull() {
            addCriterion("productProfile is not null");
            return (Criteria) this;
        }

        public Criteria andProductprofileEqualTo(String value) {
            addCriterion("productProfile =", value, "productprofile");
            return (Criteria) this;
        }

        public Criteria andProductprofileNotEqualTo(String value) {
            addCriterion("productProfile <>", value, "productprofile");
            return (Criteria) this;
        }

        public Criteria andProductprofileGreaterThan(String value) {
            addCriterion("productProfile >", value, "productprofile");
            return (Criteria) this;
        }

        public Criteria andProductprofileGreaterThanOrEqualTo(String value) {
            addCriterion("productProfile >=", value, "productprofile");
            return (Criteria) this;
        }

        public Criteria andProductprofileLessThan(String value) {
            addCriterion("productProfile <", value, "productprofile");
            return (Criteria) this;
        }

        public Criteria andProductprofileLessThanOrEqualTo(String value) {
            addCriterion("productProfile <=", value, "productprofile");
            return (Criteria) this;
        }

        public Criteria andProductprofileLike(String value) {
            addCriterion("productProfile like", value, "productprofile");
            return (Criteria) this;
        }

        public Criteria andProductprofileNotLike(String value) {
            addCriterion("productProfile not like", value, "productprofile");
            return (Criteria) this;
        }

        public Criteria andProductprofileIn(List<String> values) {
            addCriterion("productProfile in", values, "productprofile");
            return (Criteria) this;
        }

        public Criteria andProductprofileNotIn(List<String> values) {
            addCriterion("productProfile not in", values, "productprofile");
            return (Criteria) this;
        }

        public Criteria andProductprofileBetween(String value1, String value2) {
            addCriterion("productProfile between", value1, value2, "productprofile");
            return (Criteria) this;
        }

        public Criteria andProductprofileNotBetween(String value1, String value2) {
            addCriterion("productProfile not between", value1, value2, "productprofile");
            return (Criteria) this;
        }

        public Criteria andProductposterIsNull() {
            addCriterion("productPoster is null");
            return (Criteria) this;
        }

        public Criteria andProductposterIsNotNull() {
            addCriterion("productPoster is not null");
            return (Criteria) this;
        }

        public Criteria andProductposterEqualTo(String value) {
            addCriterion("productPoster =", value, "productposter");
            return (Criteria) this;
        }

        public Criteria andProductposterNotEqualTo(String value) {
            addCriterion("productPoster <>", value, "productposter");
            return (Criteria) this;
        }

        public Criteria andProductposterGreaterThan(String value) {
            addCriterion("productPoster >", value, "productposter");
            return (Criteria) this;
        }

        public Criteria andProductposterGreaterThanOrEqualTo(String value) {
            addCriterion("productPoster >=", value, "productposter");
            return (Criteria) this;
        }

        public Criteria andProductposterLessThan(String value) {
            addCriterion("productPoster <", value, "productposter");
            return (Criteria) this;
        }

        public Criteria andProductposterLessThanOrEqualTo(String value) {
            addCriterion("productPoster <=", value, "productposter");
            return (Criteria) this;
        }

        public Criteria andProductposterLike(String value) {
            addCriterion("productPoster like", value, "productposter");
            return (Criteria) this;
        }

        public Criteria andProductposterNotLike(String value) {
            addCriterion("productPoster not like", value, "productposter");
            return (Criteria) this;
        }

        public Criteria andProductposterIn(List<String> values) {
            addCriterion("productPoster in", values, "productposter");
            return (Criteria) this;
        }

        public Criteria andProductposterNotIn(List<String> values) {
            addCriterion("productPoster not in", values, "productposter");
            return (Criteria) this;
        }

        public Criteria andProductposterBetween(String value1, String value2) {
            addCriterion("productPoster between", value1, value2, "productposter");
            return (Criteria) this;
        }

        public Criteria andProductposterNotBetween(String value1, String value2) {
            addCriterion("productPoster not between", value1, value2, "productposter");
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

        public Criteria andProductdelstatusIsNull() {
            addCriterion("productDelStatus is null");
            return (Criteria) this;
        }

        public Criteria andProductdelstatusIsNotNull() {
            addCriterion("productDelStatus is not null");
            return (Criteria) this;
        }

        public Criteria andProductdelstatusEqualTo(Integer value) {
            addCriterion("productDelStatus =", value, "productdelstatus");
            return (Criteria) this;
        }

        public Criteria andProductdelstatusNotEqualTo(Integer value) {
            addCriterion("productDelStatus <>", value, "productdelstatus");
            return (Criteria) this;
        }

        public Criteria andProductdelstatusGreaterThan(Integer value) {
            addCriterion("productDelStatus >", value, "productdelstatus");
            return (Criteria) this;
        }

        public Criteria andProductdelstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("productDelStatus >=", value, "productdelstatus");
            return (Criteria) this;
        }

        public Criteria andProductdelstatusLessThan(Integer value) {
            addCriterion("productDelStatus <", value, "productdelstatus");
            return (Criteria) this;
        }

        public Criteria andProductdelstatusLessThanOrEqualTo(Integer value) {
            addCriterion("productDelStatus <=", value, "productdelstatus");
            return (Criteria) this;
        }

        public Criteria andProductdelstatusIn(List<Integer> values) {
            addCriterion("productDelStatus in", values, "productdelstatus");
            return (Criteria) this;
        }

        public Criteria andProductdelstatusNotIn(List<Integer> values) {
            addCriterion("productDelStatus not in", values, "productdelstatus");
            return (Criteria) this;
        }

        public Criteria andProductdelstatusBetween(Integer value1, Integer value2) {
            addCriterion("productDelStatus between", value1, value2, "productdelstatus");
            return (Criteria) this;
        }

        public Criteria andProductdelstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("productDelStatus not between", value1, value2, "productdelstatus");
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