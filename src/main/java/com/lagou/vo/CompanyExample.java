package com.lagou.vo;

import java.util.ArrayList;
import java.util.List;

public class CompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompanyExample() {
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

        public Criteria andCofullnameIsNull() {
            addCriterion("coFullName is null");
            return (Criteria) this;
        }

        public Criteria andCofullnameIsNotNull() {
            addCriterion("coFullName is not null");
            return (Criteria) this;
        }

        public Criteria andCofullnameEqualTo(String value) {
            addCriterion("coFullName =", value, "cofullname");
            return (Criteria) this;
        }

        public Criteria andCofullnameNotEqualTo(String value) {
            addCriterion("coFullName <>", value, "cofullname");
            return (Criteria) this;
        }

        public Criteria andCofullnameGreaterThan(String value) {
            addCriterion("coFullName >", value, "cofullname");
            return (Criteria) this;
        }

        public Criteria andCofullnameGreaterThanOrEqualTo(String value) {
            addCriterion("coFullName >=", value, "cofullname");
            return (Criteria) this;
        }

        public Criteria andCofullnameLessThan(String value) {
            addCriterion("coFullName <", value, "cofullname");
            return (Criteria) this;
        }

        public Criteria andCofullnameLessThanOrEqualTo(String value) {
            addCriterion("coFullName <=", value, "cofullname");
            return (Criteria) this;
        }

        public Criteria andCofullnameLike(String value) {
            addCriterion("coFullName like", value, "cofullname");
            return (Criteria) this;
        }

        public Criteria andCofullnameNotLike(String value) {
            addCriterion("coFullName not like", value, "cofullname");
            return (Criteria) this;
        }

        public Criteria andCofullnameIn(List<String> values) {
            addCriterion("coFullName in", values, "cofullname");
            return (Criteria) this;
        }

        public Criteria andCofullnameNotIn(List<String> values) {
            addCriterion("coFullName not in", values, "cofullname");
            return (Criteria) this;
        }

        public Criteria andCofullnameBetween(String value1, String value2) {
            addCriterion("coFullName between", value1, value2, "cofullname");
            return (Criteria) this;
        }

        public Criteria andCofullnameNotBetween(String value1, String value2) {
            addCriterion("coFullName not between", value1, value2, "cofullname");
            return (Criteria) this;
        }

        public Criteria andCopasswordIsNull() {
            addCriterion("coPassword is null");
            return (Criteria) this;
        }

        public Criteria andCopasswordIsNotNull() {
            addCriterion("coPassword is not null");
            return (Criteria) this;
        }

        public Criteria andCopasswordEqualTo(String value) {
            addCriterion("coPassword =", value, "copassword");
            return (Criteria) this;
        }

        public Criteria andCopasswordNotEqualTo(String value) {
            addCriterion("coPassword <>", value, "copassword");
            return (Criteria) this;
        }

        public Criteria andCopasswordGreaterThan(String value) {
            addCriterion("coPassword >", value, "copassword");
            return (Criteria) this;
        }

        public Criteria andCopasswordGreaterThanOrEqualTo(String value) {
            addCriterion("coPassword >=", value, "copassword");
            return (Criteria) this;
        }

        public Criteria andCopasswordLessThan(String value) {
            addCriterion("coPassword <", value, "copassword");
            return (Criteria) this;
        }

        public Criteria andCopasswordLessThanOrEqualTo(String value) {
            addCriterion("coPassword <=", value, "copassword");
            return (Criteria) this;
        }

        public Criteria andCopasswordLike(String value) {
            addCriterion("coPassword like", value, "copassword");
            return (Criteria) this;
        }

        public Criteria andCopasswordNotLike(String value) {
            addCriterion("coPassword not like", value, "copassword");
            return (Criteria) this;
        }

        public Criteria andCopasswordIn(List<String> values) {
            addCriterion("coPassword in", values, "copassword");
            return (Criteria) this;
        }

        public Criteria andCopasswordNotIn(List<String> values) {
            addCriterion("coPassword not in", values, "copassword");
            return (Criteria) this;
        }

        public Criteria andCopasswordBetween(String value1, String value2) {
            addCriterion("coPassword between", value1, value2, "copassword");
            return (Criteria) this;
        }

        public Criteria andCopasswordNotBetween(String value1, String value2) {
            addCriterion("coPassword not between", value1, value2, "copassword");
            return (Criteria) this;
        }

        public Criteria andCosaltIsNull() {
            addCriterion("coSalt is null");
            return (Criteria) this;
        }

        public Criteria andCosaltIsNotNull() {
            addCriterion("coSalt is not null");
            return (Criteria) this;
        }

        public Criteria andCosaltEqualTo(String value) {
            addCriterion("coSalt =", value, "cosalt");
            return (Criteria) this;
        }

        public Criteria andCosaltNotEqualTo(String value) {
            addCriterion("coSalt <>", value, "cosalt");
            return (Criteria) this;
        }

        public Criteria andCosaltGreaterThan(String value) {
            addCriterion("coSalt >", value, "cosalt");
            return (Criteria) this;
        }

        public Criteria andCosaltGreaterThanOrEqualTo(String value) {
            addCriterion("coSalt >=", value, "cosalt");
            return (Criteria) this;
        }

        public Criteria andCosaltLessThan(String value) {
            addCriterion("coSalt <", value, "cosalt");
            return (Criteria) this;
        }

        public Criteria andCosaltLessThanOrEqualTo(String value) {
            addCriterion("coSalt <=", value, "cosalt");
            return (Criteria) this;
        }

        public Criteria andCosaltLike(String value) {
            addCriterion("coSalt like", value, "cosalt");
            return (Criteria) this;
        }

        public Criteria andCosaltNotLike(String value) {
            addCriterion("coSalt not like", value, "cosalt");
            return (Criteria) this;
        }

        public Criteria andCosaltIn(List<String> values) {
            addCriterion("coSalt in", values, "cosalt");
            return (Criteria) this;
        }

        public Criteria andCosaltNotIn(List<String> values) {
            addCriterion("coSalt not in", values, "cosalt");
            return (Criteria) this;
        }

        public Criteria andCosaltBetween(String value1, String value2) {
            addCriterion("coSalt between", value1, value2, "cosalt");
            return (Criteria) this;
        }

        public Criteria andCosaltNotBetween(String value1, String value2) {
            addCriterion("coSalt not between", value1, value2, "cosalt");
            return (Criteria) this;
        }

        public Criteria andCoabbrnameIsNull() {
            addCriterion("coAbbrName is null");
            return (Criteria) this;
        }

        public Criteria andCoabbrnameIsNotNull() {
            addCriterion("coAbbrName is not null");
            return (Criteria) this;
        }

        public Criteria andCoabbrnameEqualTo(String value) {
            addCriterion("coAbbrName =", value, "coabbrname");
            return (Criteria) this;
        }

        public Criteria andCoabbrnameNotEqualTo(String value) {
            addCriterion("coAbbrName <>", value, "coabbrname");
            return (Criteria) this;
        }

        public Criteria andCoabbrnameGreaterThan(String value) {
            addCriterion("coAbbrName >", value, "coabbrname");
            return (Criteria) this;
        }

        public Criteria andCoabbrnameGreaterThanOrEqualTo(String value) {
            addCriterion("coAbbrName >=", value, "coabbrname");
            return (Criteria) this;
        }

        public Criteria andCoabbrnameLessThan(String value) {
            addCriterion("coAbbrName <", value, "coabbrname");
            return (Criteria) this;
        }

        public Criteria andCoabbrnameLessThanOrEqualTo(String value) {
            addCriterion("coAbbrName <=", value, "coabbrname");
            return (Criteria) this;
        }

        public Criteria andCoabbrnameLike(String value) {
            addCriterion("coAbbrName like", value, "coabbrname");
            return (Criteria) this;
        }

        public Criteria andCoabbrnameNotLike(String value) {
            addCriterion("coAbbrName not like", value, "coabbrname");
            return (Criteria) this;
        }

        public Criteria andCoabbrnameIn(List<String> values) {
            addCriterion("coAbbrName in", values, "coabbrname");
            return (Criteria) this;
        }

        public Criteria andCoabbrnameNotIn(List<String> values) {
            addCriterion("coAbbrName not in", values, "coabbrname");
            return (Criteria) this;
        }

        public Criteria andCoabbrnameBetween(String value1, String value2) {
            addCriterion("coAbbrName between", value1, value2, "coabbrname");
            return (Criteria) this;
        }

        public Criteria andCoabbrnameNotBetween(String value1, String value2) {
            addCriterion("coAbbrName not between", value1, value2, "coabbrname");
            return (Criteria) this;
        }

        public Criteria andCoemailIsNull() {
            addCriterion("coEmail is null");
            return (Criteria) this;
        }

        public Criteria andCoemailIsNotNull() {
            addCriterion("coEmail is not null");
            return (Criteria) this;
        }

        public Criteria andCoemailEqualTo(String value) {
            addCriterion("coEmail =", value, "coemail");
            return (Criteria) this;
        }

        public Criteria andCoemailNotEqualTo(String value) {
            addCriterion("coEmail <>", value, "coemail");
            return (Criteria) this;
        }

        public Criteria andCoemailGreaterThan(String value) {
            addCriterion("coEmail >", value, "coemail");
            return (Criteria) this;
        }

        public Criteria andCoemailGreaterThanOrEqualTo(String value) {
            addCriterion("coEmail >=", value, "coemail");
            return (Criteria) this;
        }

        public Criteria andCoemailLessThan(String value) {
            addCriterion("coEmail <", value, "coemail");
            return (Criteria) this;
        }

        public Criteria andCoemailLessThanOrEqualTo(String value) {
            addCriterion("coEmail <=", value, "coemail");
            return (Criteria) this;
        }

        public Criteria andCoemailLike(String value) {
            addCriterion("coEmail like", value, "coemail");
            return (Criteria) this;
        }

        public Criteria andCoemailNotLike(String value) {
            addCriterion("coEmail not like", value, "coemail");
            return (Criteria) this;
        }

        public Criteria andCoemailIn(List<String> values) {
            addCriterion("coEmail in", values, "coemail");
            return (Criteria) this;
        }

        public Criteria andCoemailNotIn(List<String> values) {
            addCriterion("coEmail not in", values, "coemail");
            return (Criteria) this;
        }

        public Criteria andCoemailBetween(String value1, String value2) {
            addCriterion("coEmail between", value1, value2, "coemail");
            return (Criteria) this;
        }

        public Criteria andCoemailNotBetween(String value1, String value2) {
            addCriterion("coEmail not between", value1, value2, "coemail");
            return (Criteria) this;
        }

        public Criteria andCowebsiteIsNull() {
            addCriterion("coWebsite is null");
            return (Criteria) this;
        }

        public Criteria andCowebsiteIsNotNull() {
            addCriterion("coWebsite is not null");
            return (Criteria) this;
        }

        public Criteria andCowebsiteEqualTo(String value) {
            addCriterion("coWebsite =", value, "cowebsite");
            return (Criteria) this;
        }

        public Criteria andCowebsiteNotEqualTo(String value) {
            addCriterion("coWebsite <>", value, "cowebsite");
            return (Criteria) this;
        }

        public Criteria andCowebsiteGreaterThan(String value) {
            addCriterion("coWebsite >", value, "cowebsite");
            return (Criteria) this;
        }

        public Criteria andCowebsiteGreaterThanOrEqualTo(String value) {
            addCriterion("coWebsite >=", value, "cowebsite");
            return (Criteria) this;
        }

        public Criteria andCowebsiteLessThan(String value) {
            addCriterion("coWebsite <", value, "cowebsite");
            return (Criteria) this;
        }

        public Criteria andCowebsiteLessThanOrEqualTo(String value) {
            addCriterion("coWebsite <=", value, "cowebsite");
            return (Criteria) this;
        }

        public Criteria andCowebsiteLike(String value) {
            addCriterion("coWebsite like", value, "cowebsite");
            return (Criteria) this;
        }

        public Criteria andCowebsiteNotLike(String value) {
            addCriterion("coWebsite not like", value, "cowebsite");
            return (Criteria) this;
        }

        public Criteria andCowebsiteIn(List<String> values) {
            addCriterion("coWebsite in", values, "cowebsite");
            return (Criteria) this;
        }

        public Criteria andCowebsiteNotIn(List<String> values) {
            addCriterion("coWebsite not in", values, "cowebsite");
            return (Criteria) this;
        }

        public Criteria andCowebsiteBetween(String value1, String value2) {
            addCriterion("coWebsite between", value1, value2, "cowebsite");
            return (Criteria) this;
        }

        public Criteria andCowebsiteNotBetween(String value1, String value2) {
            addCriterion("coWebsite not between", value1, value2, "cowebsite");
            return (Criteria) this;
        }

        public Criteria andCocityIsNull() {
            addCriterion("coCity is null");
            return (Criteria) this;
        }

        public Criteria andCocityIsNotNull() {
            addCriterion("coCity is not null");
            return (Criteria) this;
        }

        public Criteria andCocityEqualTo(String value) {
            addCriterion("coCity =", value, "cocity");
            return (Criteria) this;
        }

        public Criteria andCocityNotEqualTo(String value) {
            addCriterion("coCity <>", value, "cocity");
            return (Criteria) this;
        }

        public Criteria andCocityGreaterThan(String value) {
            addCriterion("coCity >", value, "cocity");
            return (Criteria) this;
        }

        public Criteria andCocityGreaterThanOrEqualTo(String value) {
            addCriterion("coCity >=", value, "cocity");
            return (Criteria) this;
        }

        public Criteria andCocityLessThan(String value) {
            addCriterion("coCity <", value, "cocity");
            return (Criteria) this;
        }

        public Criteria andCocityLessThanOrEqualTo(String value) {
            addCriterion("coCity <=", value, "cocity");
            return (Criteria) this;
        }

        public Criteria andCocityLike(String value) {
            addCriterion("coCity like", value, "cocity");
            return (Criteria) this;
        }

        public Criteria andCocityNotLike(String value) {
            addCriterion("coCity not like", value, "cocity");
            return (Criteria) this;
        }

        public Criteria andCocityIn(List<String> values) {
            addCriterion("coCity in", values, "cocity");
            return (Criteria) this;
        }

        public Criteria andCocityNotIn(List<String> values) {
            addCriterion("coCity not in", values, "cocity");
            return (Criteria) this;
        }

        public Criteria andCocityBetween(String value1, String value2) {
            addCriterion("coCity between", value1, value2, "cocity");
            return (Criteria) this;
        }

        public Criteria andCocityNotBetween(String value1, String value2) {
            addCriterion("coCity not between", value1, value2, "cocity");
            return (Criteria) this;
        }

        public Criteria andCoindustryfieldIsNull() {
            addCriterion("coIndustryField is null");
            return (Criteria) this;
        }

        public Criteria andCoindustryfieldIsNotNull() {
            addCriterion("coIndustryField is not null");
            return (Criteria) this;
        }

        public Criteria andCoindustryfieldEqualTo(String value) {
            addCriterion("coIndustryField =", value, "coindustryfield");
            return (Criteria) this;
        }

        public Criteria andCoindustryfieldNotEqualTo(String value) {
            addCriterion("coIndustryField <>", value, "coindustryfield");
            return (Criteria) this;
        }

        public Criteria andCoindustryfieldGreaterThan(String value) {
            addCriterion("coIndustryField >", value, "coindustryfield");
            return (Criteria) this;
        }

        public Criteria andCoindustryfieldGreaterThanOrEqualTo(String value) {
            addCriterion("coIndustryField >=", value, "coindustryfield");
            return (Criteria) this;
        }

        public Criteria andCoindustryfieldLessThan(String value) {
            addCriterion("coIndustryField <", value, "coindustryfield");
            return (Criteria) this;
        }

        public Criteria andCoindustryfieldLessThanOrEqualTo(String value) {
            addCriterion("coIndustryField <=", value, "coindustryfield");
            return (Criteria) this;
        }

        public Criteria andCoindustryfieldLike(String value) {
            addCriterion("coIndustryField like", value, "coindustryfield");
            return (Criteria) this;
        }

        public Criteria andCoindustryfieldNotLike(String value) {
            addCriterion("coIndustryField not like", value, "coindustryfield");
            return (Criteria) this;
        }

        public Criteria andCoindustryfieldIn(List<String> values) {
            addCriterion("coIndustryField in", values, "coindustryfield");
            return (Criteria) this;
        }

        public Criteria andCoindustryfieldNotIn(List<String> values) {
            addCriterion("coIndustryField not in", values, "coindustryfield");
            return (Criteria) this;
        }

        public Criteria andCoindustryfieldBetween(String value1, String value2) {
            addCriterion("coIndustryField between", value1, value2, "coindustryfield");
            return (Criteria) this;
        }

        public Criteria andCoindustryfieldNotBetween(String value1, String value2) {
            addCriterion("coIndustryField not between", value1, value2, "coindustryfield");
            return (Criteria) this;
        }

        public Criteria andCocompanysizeIsNull() {
            addCriterion("coCompanySize is null");
            return (Criteria) this;
        }

        public Criteria andCocompanysizeIsNotNull() {
            addCriterion("coCompanySize is not null");
            return (Criteria) this;
        }

        public Criteria andCocompanysizeEqualTo(String value) {
            addCriterion("coCompanySize =", value, "cocompanysize");
            return (Criteria) this;
        }

        public Criteria andCocompanysizeNotEqualTo(String value) {
            addCriterion("coCompanySize <>", value, "cocompanysize");
            return (Criteria) this;
        }

        public Criteria andCocompanysizeGreaterThan(String value) {
            addCriterion("coCompanySize >", value, "cocompanysize");
            return (Criteria) this;
        }

        public Criteria andCocompanysizeGreaterThanOrEqualTo(String value) {
            addCriterion("coCompanySize >=", value, "cocompanysize");
            return (Criteria) this;
        }

        public Criteria andCocompanysizeLessThan(String value) {
            addCriterion("coCompanySize <", value, "cocompanysize");
            return (Criteria) this;
        }

        public Criteria andCocompanysizeLessThanOrEqualTo(String value) {
            addCriterion("coCompanySize <=", value, "cocompanysize");
            return (Criteria) this;
        }

        public Criteria andCocompanysizeLike(String value) {
            addCriterion("coCompanySize like", value, "cocompanysize");
            return (Criteria) this;
        }

        public Criteria andCocompanysizeNotLike(String value) {
            addCriterion("coCompanySize not like", value, "cocompanysize");
            return (Criteria) this;
        }

        public Criteria andCocompanysizeIn(List<String> values) {
            addCriterion("coCompanySize in", values, "cocompanysize");
            return (Criteria) this;
        }

        public Criteria andCocompanysizeNotIn(List<String> values) {
            addCriterion("coCompanySize not in", values, "cocompanysize");
            return (Criteria) this;
        }

        public Criteria andCocompanysizeBetween(String value1, String value2) {
            addCriterion("coCompanySize between", value1, value2, "cocompanysize");
            return (Criteria) this;
        }

        public Criteria andCocompanysizeNotBetween(String value1, String value2) {
            addCriterion("coCompanySize not between", value1, value2, "cocompanysize");
            return (Criteria) this;
        }

        public Criteria andCophaseIsNull() {
            addCriterion("coPhase is null");
            return (Criteria) this;
        }

        public Criteria andCophaseIsNotNull() {
            addCriterion("coPhase is not null");
            return (Criteria) this;
        }

        public Criteria andCophaseEqualTo(String value) {
            addCriterion("coPhase =", value, "cophase");
            return (Criteria) this;
        }

        public Criteria andCophaseNotEqualTo(String value) {
            addCriterion("coPhase <>", value, "cophase");
            return (Criteria) this;
        }

        public Criteria andCophaseGreaterThan(String value) {
            addCriterion("coPhase >", value, "cophase");
            return (Criteria) this;
        }

        public Criteria andCophaseGreaterThanOrEqualTo(String value) {
            addCriterion("coPhase >=", value, "cophase");
            return (Criteria) this;
        }

        public Criteria andCophaseLessThan(String value) {
            addCriterion("coPhase <", value, "cophase");
            return (Criteria) this;
        }

        public Criteria andCophaseLessThanOrEqualTo(String value) {
            addCriterion("coPhase <=", value, "cophase");
            return (Criteria) this;
        }

        public Criteria andCophaseLike(String value) {
            addCriterion("coPhase like", value, "cophase");
            return (Criteria) this;
        }

        public Criteria andCophaseNotLike(String value) {
            addCriterion("coPhase not like", value, "cophase");
            return (Criteria) this;
        }

        public Criteria andCophaseIn(List<String> values) {
            addCriterion("coPhase in", values, "cophase");
            return (Criteria) this;
        }

        public Criteria andCophaseNotIn(List<String> values) {
            addCriterion("coPhase not in", values, "cophase");
            return (Criteria) this;
        }

        public Criteria andCophaseBetween(String value1, String value2) {
            addCriterion("coPhase between", value1, value2, "cophase");
            return (Criteria) this;
        }

        public Criteria andCophaseNotBetween(String value1, String value2) {
            addCriterion("coPhase not between", value1, value2, "cophase");
            return (Criteria) this;
        }

        public Criteria andCotemptationIsNull() {
            addCriterion("coTemptation is null");
            return (Criteria) this;
        }

        public Criteria andCotemptationIsNotNull() {
            addCriterion("coTemptation is not null");
            return (Criteria) this;
        }

        public Criteria andCotemptationEqualTo(String value) {
            addCriterion("coTemptation =", value, "cotemptation");
            return (Criteria) this;
        }

        public Criteria andCotemptationNotEqualTo(String value) {
            addCriterion("coTemptation <>", value, "cotemptation");
            return (Criteria) this;
        }

        public Criteria andCotemptationGreaterThan(String value) {
            addCriterion("coTemptation >", value, "cotemptation");
            return (Criteria) this;
        }

        public Criteria andCotemptationGreaterThanOrEqualTo(String value) {
            addCriterion("coTemptation >=", value, "cotemptation");
            return (Criteria) this;
        }

        public Criteria andCotemptationLessThan(String value) {
            addCriterion("coTemptation <", value, "cotemptation");
            return (Criteria) this;
        }

        public Criteria andCotemptationLessThanOrEqualTo(String value) {
            addCriterion("coTemptation <=", value, "cotemptation");
            return (Criteria) this;
        }

        public Criteria andCotemptationLike(String value) {
            addCriterion("coTemptation like", value, "cotemptation");
            return (Criteria) this;
        }

        public Criteria andCotemptationNotLike(String value) {
            addCriterion("coTemptation not like", value, "cotemptation");
            return (Criteria) this;
        }

        public Criteria andCotemptationIn(List<String> values) {
            addCriterion("coTemptation in", values, "cotemptation");
            return (Criteria) this;
        }

        public Criteria andCotemptationNotIn(List<String> values) {
            addCriterion("coTemptation not in", values, "cotemptation");
            return (Criteria) this;
        }

        public Criteria andCotemptationBetween(String value1, String value2) {
            addCriterion("coTemptation between", value1, value2, "cotemptation");
            return (Criteria) this;
        }

        public Criteria andCotemptationNotBetween(String value1, String value2) {
            addCriterion("coTemptation not between", value1, value2, "cotemptation");
            return (Criteria) this;
        }

        public Criteria andCologoIsNull() {
            addCriterion("coLOGO is null");
            return (Criteria) this;
        }

        public Criteria andCologoIsNotNull() {
            addCriterion("coLOGO is not null");
            return (Criteria) this;
        }

        public Criteria andCologoEqualTo(String value) {
            addCriterion("coLOGO =", value, "cologo");
            return (Criteria) this;
        }

        public Criteria andCologoNotEqualTo(String value) {
            addCriterion("coLOGO <>", value, "cologo");
            return (Criteria) this;
        }

        public Criteria andCologoGreaterThan(String value) {
            addCriterion("coLOGO >", value, "cologo");
            return (Criteria) this;
        }

        public Criteria andCologoGreaterThanOrEqualTo(String value) {
            addCriterion("coLOGO >=", value, "cologo");
            return (Criteria) this;
        }

        public Criteria andCologoLessThan(String value) {
            addCriterion("coLOGO <", value, "cologo");
            return (Criteria) this;
        }

        public Criteria andCologoLessThanOrEqualTo(String value) {
            addCriterion("coLOGO <=", value, "cologo");
            return (Criteria) this;
        }

        public Criteria andCologoLike(String value) {
            addCriterion("coLOGO like", value, "cologo");
            return (Criteria) this;
        }

        public Criteria andCologoNotLike(String value) {
            addCriterion("coLOGO not like", value, "cologo");
            return (Criteria) this;
        }

        public Criteria andCologoIn(List<String> values) {
            addCriterion("coLOGO in", values, "cologo");
            return (Criteria) this;
        }

        public Criteria andCologoNotIn(List<String> values) {
            addCriterion("coLOGO not in", values, "cologo");
            return (Criteria) this;
        }

        public Criteria andCologoBetween(String value1, String value2) {
            addCriterion("coLOGO between", value1, value2, "cologo");
            return (Criteria) this;
        }

        public Criteria andCologoNotBetween(String value1, String value2) {
            addCriterion("coLOGO not between", value1, value2, "cologo");
            return (Criteria) this;
        }

        public Criteria andCoprofileIsNull() {
            addCriterion("coProfile is null");
            return (Criteria) this;
        }

        public Criteria andCoprofileIsNotNull() {
            addCriterion("coProfile is not null");
            return (Criteria) this;
        }

        public Criteria andCoprofileEqualTo(String value) {
            addCriterion("coProfile =", value, "coprofile");
            return (Criteria) this;
        }

        public Criteria andCoprofileNotEqualTo(String value) {
            addCriterion("coProfile <>", value, "coprofile");
            return (Criteria) this;
        }

        public Criteria andCoprofileGreaterThan(String value) {
            addCriterion("coProfile >", value, "coprofile");
            return (Criteria) this;
        }

        public Criteria andCoprofileGreaterThanOrEqualTo(String value) {
            addCriterion("coProfile >=", value, "coprofile");
            return (Criteria) this;
        }

        public Criteria andCoprofileLessThan(String value) {
            addCriterion("coProfile <", value, "coprofile");
            return (Criteria) this;
        }

        public Criteria andCoprofileLessThanOrEqualTo(String value) {
            addCriterion("coProfile <=", value, "coprofile");
            return (Criteria) this;
        }

        public Criteria andCoprofileLike(String value) {
            addCriterion("coProfile like", value, "coprofile");
            return (Criteria) this;
        }

        public Criteria andCoprofileNotLike(String value) {
            addCriterion("coProfile not like", value, "coprofile");
            return (Criteria) this;
        }

        public Criteria andCoprofileIn(List<String> values) {
            addCriterion("coProfile in", values, "coprofile");
            return (Criteria) this;
        }

        public Criteria andCoprofileNotIn(List<String> values) {
            addCriterion("coProfile not in", values, "coprofile");
            return (Criteria) this;
        }

        public Criteria andCoprofileBetween(String value1, String value2) {
            addCriterion("coProfile between", value1, value2, "coprofile");
            return (Criteria) this;
        }

        public Criteria andCoprofileNotBetween(String value1, String value2) {
            addCriterion("coProfile not between", value1, value2, "coprofile");
            return (Criteria) this;
        }

        public Criteria andCostateIsNull() {
            addCriterion("coState is null");
            return (Criteria) this;
        }

        public Criteria andCostateIsNotNull() {
            addCriterion("coState is not null");
            return (Criteria) this;
        }

        public Criteria andCostateEqualTo(Integer value) {
            addCriterion("coState =", value, "costate");
            return (Criteria) this;
        }

        public Criteria andCostateNotEqualTo(Integer value) {
            addCriterion("coState <>", value, "costate");
            return (Criteria) this;
        }

        public Criteria andCostateGreaterThan(Integer value) {
            addCriterion("coState >", value, "costate");
            return (Criteria) this;
        }

        public Criteria andCostateGreaterThanOrEqualTo(Integer value) {
            addCriterion("coState >=", value, "costate");
            return (Criteria) this;
        }

        public Criteria andCostateLessThan(Integer value) {
            addCriterion("coState <", value, "costate");
            return (Criteria) this;
        }

        public Criteria andCostateLessThanOrEqualTo(Integer value) {
            addCriterion("coState <=", value, "costate");
            return (Criteria) this;
        }

        public Criteria andCostateIn(List<Integer> values) {
            addCriterion("coState in", values, "costate");
            return (Criteria) this;
        }

        public Criteria andCostateNotIn(List<Integer> values) {
            addCriterion("coState not in", values, "costate");
            return (Criteria) this;
        }

        public Criteria andCostateBetween(Integer value1, Integer value2) {
            addCriterion("coState between", value1, value2, "costate");
            return (Criteria) this;
        }

        public Criteria andCostateNotBetween(Integer value1, Integer value2) {
            addCriterion("coState not between", value1, value2, "costate");
            return (Criteria) this;
        }

        public Criteria andCocodeIsNull() {
            addCriterion("coCode is null");
            return (Criteria) this;
        }

        public Criteria andCocodeIsNotNull() {
            addCriterion("coCode is not null");
            return (Criteria) this;
        }

        public Criteria andCocodeEqualTo(String value) {
            addCriterion("coCode =", value, "cocode");
            return (Criteria) this;
        }

        public Criteria andCocodeNotEqualTo(String value) {
            addCriterion("coCode <>", value, "cocode");
            return (Criteria) this;
        }

        public Criteria andCocodeGreaterThan(String value) {
            addCriterion("coCode >", value, "cocode");
            return (Criteria) this;
        }

        public Criteria andCocodeGreaterThanOrEqualTo(String value) {
            addCriterion("coCode >=", value, "cocode");
            return (Criteria) this;
        }

        public Criteria andCocodeLessThan(String value) {
            addCriterion("coCode <", value, "cocode");
            return (Criteria) this;
        }

        public Criteria andCocodeLessThanOrEqualTo(String value) {
            addCriterion("coCode <=", value, "cocode");
            return (Criteria) this;
        }

        public Criteria andCocodeLike(String value) {
            addCriterion("coCode like", value, "cocode");
            return (Criteria) this;
        }

        public Criteria andCocodeNotLike(String value) {
            addCriterion("coCode not like", value, "cocode");
            return (Criteria) this;
        }

        public Criteria andCocodeIn(List<String> values) {
            addCriterion("coCode in", values, "cocode");
            return (Criteria) this;
        }

        public Criteria andCocodeNotIn(List<String> values) {
            addCriterion("coCode not in", values, "cocode");
            return (Criteria) this;
        }

        public Criteria andCocodeBetween(String value1, String value2) {
            addCriterion("coCode between", value1, value2, "cocode");
            return (Criteria) this;
        }

        public Criteria andCocodeNotBetween(String value1, String value2) {
            addCriterion("coCode not between", value1, value2, "cocode");
            return (Criteria) this;
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

        public Criteria andCodelstatusIsNull() {
            addCriterion("coDelStatus is null");
            return (Criteria) this;
        }

        public Criteria andCodelstatusIsNotNull() {
            addCriterion("coDelStatus is not null");
            return (Criteria) this;
        }

        public Criteria andCodelstatusEqualTo(Integer value) {
            addCriterion("coDelStatus =", value, "codelstatus");
            return (Criteria) this;
        }

        public Criteria andCodelstatusNotEqualTo(Integer value) {
            addCriterion("coDelStatus <>", value, "codelstatus");
            return (Criteria) this;
        }

        public Criteria andCodelstatusGreaterThan(Integer value) {
            addCriterion("coDelStatus >", value, "codelstatus");
            return (Criteria) this;
        }

        public Criteria andCodelstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("coDelStatus >=", value, "codelstatus");
            return (Criteria) this;
        }

        public Criteria andCodelstatusLessThan(Integer value) {
            addCriterion("coDelStatus <", value, "codelstatus");
            return (Criteria) this;
        }

        public Criteria andCodelstatusLessThanOrEqualTo(Integer value) {
            addCriterion("coDelStatus <=", value, "codelstatus");
            return (Criteria) this;
        }

        public Criteria andCodelstatusIn(List<Integer> values) {
            addCriterion("coDelStatus in", values, "codelstatus");
            return (Criteria) this;
        }

        public Criteria andCodelstatusNotIn(List<Integer> values) {
            addCriterion("coDelStatus not in", values, "codelstatus");
            return (Criteria) this;
        }

        public Criteria andCodelstatusBetween(Integer value1, Integer value2) {
            addCriterion("coDelStatus between", value1, value2, "codelstatus");
            return (Criteria) this;
        }

        public Criteria andCodelstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("coDelStatus not between", value1, value2, "codelstatus");
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