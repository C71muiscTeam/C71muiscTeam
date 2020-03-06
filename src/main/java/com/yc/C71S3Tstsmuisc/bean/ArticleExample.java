package com.yc.C71S3Tstsmuisc.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArticleExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBTitleIsNull() {
            addCriterion("b_title is null");
            return (Criteria) this;
        }

        public Criteria andBTitleIsNotNull() {
            addCriterion("b_title is not null");
            return (Criteria) this;
        }

        public Criteria andBTitleEqualTo(String value) {
            addCriterion("b_title =", value, "bTitle");
            return (Criteria) this;
        }

        public Criteria andBTitleNotEqualTo(String value) {
            addCriterion("b_title <>", value, "bTitle");
            return (Criteria) this;
        }

        public Criteria andBTitleGreaterThan(String value) {
            addCriterion("b_title >", value, "bTitle");
            return (Criteria) this;
        }

        public Criteria andBTitleGreaterThanOrEqualTo(String value) {
            addCriterion("b_title >=", value, "bTitle");
            return (Criteria) this;
        }

        public Criteria andBTitleLessThan(String value) {
            addCriterion("b_title <", value, "bTitle");
            return (Criteria) this;
        }

        public Criteria andBTitleLessThanOrEqualTo(String value) {
            addCriterion("b_title <=", value, "bTitle");
            return (Criteria) this;
        }

        public Criteria andBTitleLike(String value) {
            addCriterion("b_title like", value, "bTitle");
            return (Criteria) this;
        }

        public Criteria andBTitleNotLike(String value) {
            addCriterion("b_title not like", value, "bTitle");
            return (Criteria) this;
        }

        public Criteria andBTitleIn(List<String> values) {
            addCriterion("b_title in", values, "bTitle");
            return (Criteria) this;
        }

        public Criteria andBTitleNotIn(List<String> values) {
            addCriterion("b_title not in", values, "bTitle");
            return (Criteria) this;
        }

        public Criteria andBTitleBetween(String value1, String value2) {
            addCriterion("b_title between", value1, value2, "bTitle");
            return (Criteria) this;
        }

        public Criteria andBTitleNotBetween(String value1, String value2) {
            addCriterion("b_title not between", value1, value2, "bTitle");
            return (Criteria) this;
        }

        public Criteria andBAuthorIsNull() {
            addCriterion("b_author is null");
            return (Criteria) this;
        }

        public Criteria andBAuthorIsNotNull() {
            addCriterion("b_author is not null");
            return (Criteria) this;
        }

        public Criteria andBAuthorEqualTo(String value) {
            addCriterion("b_author =", value, "bAuthor");
            return (Criteria) this;
        }

        public Criteria andBAuthorNotEqualTo(String value) {
            addCriterion("b_author <>", value, "bAuthor");
            return (Criteria) this;
        }

        public Criteria andBAuthorGreaterThan(String value) {
            addCriterion("b_author >", value, "bAuthor");
            return (Criteria) this;
        }

        public Criteria andBAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("b_author >=", value, "bAuthor");
            return (Criteria) this;
        }

        public Criteria andBAuthorLessThan(String value) {
            addCriterion("b_author <", value, "bAuthor");
            return (Criteria) this;
        }

        public Criteria andBAuthorLessThanOrEqualTo(String value) {
            addCriterion("b_author <=", value, "bAuthor");
            return (Criteria) this;
        }

        public Criteria andBAuthorLike(String value) {
            addCriterion("b_author like", value, "bAuthor");
            return (Criteria) this;
        }

        public Criteria andBAuthorNotLike(String value) {
            addCriterion("b_author not like", value, "bAuthor");
            return (Criteria) this;
        }

        public Criteria andBAuthorIn(List<String> values) {
            addCriterion("b_author in", values, "bAuthor");
            return (Criteria) this;
        }

        public Criteria andBAuthorNotIn(List<String> values) {
            addCriterion("b_author not in", values, "bAuthor");
            return (Criteria) this;
        }

        public Criteria andBAuthorBetween(String value1, String value2) {
            addCriterion("b_author between", value1, value2, "bAuthor");
            return (Criteria) this;
        }

        public Criteria andBAuthorNotBetween(String value1, String value2) {
            addCriterion("b_author not between", value1, value2, "bAuthor");
            return (Criteria) this;
        }

        public Criteria andBCreatetimeIsNull() {
            addCriterion("b_createTime is null");
            return (Criteria) this;
        }

        public Criteria andBCreatetimeIsNotNull() {
            addCriterion("b_createTime is not null");
            return (Criteria) this;
        }

        public Criteria andBCreatetimeEqualTo(Date value) {
            addCriterion("b_createTime =", value, "bCreatetime");
            return (Criteria) this;
        }

        public Criteria andBCreatetimeNotEqualTo(Date value) {
            addCriterion("b_createTime <>", value, "bCreatetime");
            return (Criteria) this;
        }

        public Criteria andBCreatetimeGreaterThan(Date value) {
            addCriterion("b_createTime >", value, "bCreatetime");
            return (Criteria) this;
        }

        public Criteria andBCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("b_createTime >=", value, "bCreatetime");
            return (Criteria) this;
        }

        public Criteria andBCreatetimeLessThan(Date value) {
            addCriterion("b_createTime <", value, "bCreatetime");
            return (Criteria) this;
        }

        public Criteria andBCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("b_createTime <=", value, "bCreatetime");
            return (Criteria) this;
        }

        public Criteria andBCreatetimeIn(List<Date> values) {
            addCriterion("b_createTime in", values, "bCreatetime");
            return (Criteria) this;
        }

        public Criteria andBCreatetimeNotIn(List<Date> values) {
            addCriterion("b_createTime not in", values, "bCreatetime");
            return (Criteria) this;
        }

        public Criteria andBCreatetimeBetween(Date value1, Date value2) {
            addCriterion("b_createTime between", value1, value2, "bCreatetime");
            return (Criteria) this;
        }

        public Criteria andBCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("b_createTime not between", value1, value2, "bCreatetime");
            return (Criteria) this;
        }

        public Criteria andBReadcntIsNull() {
            addCriterion("b_readCnt is null");
            return (Criteria) this;
        }

        public Criteria andBReadcntIsNotNull() {
            addCriterion("b_readCnt is not null");
            return (Criteria) this;
        }

        public Criteria andBReadcntEqualTo(Integer value) {
            addCriterion("b_readCnt =", value, "bReadcnt");
            return (Criteria) this;
        }

        public Criteria andBReadcntNotEqualTo(Integer value) {
            addCriterion("b_readCnt <>", value, "bReadcnt");
            return (Criteria) this;
        }

        public Criteria andBReadcntGreaterThan(Integer value) {
            addCriterion("b_readCnt >", value, "bReadcnt");
            return (Criteria) this;
        }

        public Criteria andBReadcntGreaterThanOrEqualTo(Integer value) {
            addCriterion("b_readCnt >=", value, "bReadcnt");
            return (Criteria) this;
        }

        public Criteria andBReadcntLessThan(Integer value) {
            addCriterion("b_readCnt <", value, "bReadcnt");
            return (Criteria) this;
        }

        public Criteria andBReadcntLessThanOrEqualTo(Integer value) {
            addCriterion("b_readCnt <=", value, "bReadcnt");
            return (Criteria) this;
        }

        public Criteria andBReadcntIn(List<Integer> values) {
            addCriterion("b_readCnt in", values, "bReadcnt");
            return (Criteria) this;
        }

        public Criteria andBReadcntNotIn(List<Integer> values) {
            addCriterion("b_readCnt not in", values, "bReadcnt");
            return (Criteria) this;
        }

        public Criteria andBReadcntBetween(Integer value1, Integer value2) {
            addCriterion("b_readCnt between", value1, value2, "bReadcnt");
            return (Criteria) this;
        }

        public Criteria andBReadcntNotBetween(Integer value1, Integer value2) {
            addCriterion("b_readCnt not between", value1, value2, "bReadcnt");
            return (Criteria) this;
        }

        public Criteria andBAgreecntIsNull() {
            addCriterion("b_agreeCnt is null");
            return (Criteria) this;
        }

        public Criteria andBAgreecntIsNotNull() {
            addCriterion("b_agreeCnt is not null");
            return (Criteria) this;
        }

        public Criteria andBAgreecntEqualTo(Integer value) {
            addCriterion("b_agreeCnt =", value, "bAgreecnt");
            return (Criteria) this;
        }

        public Criteria andBAgreecntNotEqualTo(Integer value) {
            addCriterion("b_agreeCnt <>", value, "bAgreecnt");
            return (Criteria) this;
        }

        public Criteria andBAgreecntGreaterThan(Integer value) {
            addCriterion("b_agreeCnt >", value, "bAgreecnt");
            return (Criteria) this;
        }

        public Criteria andBAgreecntGreaterThanOrEqualTo(Integer value) {
            addCriterion("b_agreeCnt >=", value, "bAgreecnt");
            return (Criteria) this;
        }

        public Criteria andBAgreecntLessThan(Integer value) {
            addCriterion("b_agreeCnt <", value, "bAgreecnt");
            return (Criteria) this;
        }

        public Criteria andBAgreecntLessThanOrEqualTo(Integer value) {
            addCriterion("b_agreeCnt <=", value, "bAgreecnt");
            return (Criteria) this;
        }

        public Criteria andBAgreecntIn(List<Integer> values) {
            addCriterion("b_agreeCnt in", values, "bAgreecnt");
            return (Criteria) this;
        }

        public Criteria andBAgreecntNotIn(List<Integer> values) {
            addCriterion("b_agreeCnt not in", values, "bAgreecnt");
            return (Criteria) this;
        }

        public Criteria andBAgreecntBetween(Integer value1, Integer value2) {
            addCriterion("b_agreeCnt between", value1, value2, "bAgreecnt");
            return (Criteria) this;
        }

        public Criteria andBAgreecntNotBetween(Integer value1, Integer value2) {
            addCriterion("b_agreeCnt not between", value1, value2, "bAgreecnt");
            return (Criteria) this;
        }

        public Criteria andBCommcntIsNull() {
            addCriterion("b_commCnt is null");
            return (Criteria) this;
        }

        public Criteria andBCommcntIsNotNull() {
            addCriterion("b_commCnt is not null");
            return (Criteria) this;
        }

        public Criteria andBCommcntEqualTo(Integer value) {
            addCriterion("b_commCnt =", value, "bCommcnt");
            return (Criteria) this;
        }

        public Criteria andBCommcntNotEqualTo(Integer value) {
            addCriterion("b_commCnt <>", value, "bCommcnt");
            return (Criteria) this;
        }

        public Criteria andBCommcntGreaterThan(Integer value) {
            addCriterion("b_commCnt >", value, "bCommcnt");
            return (Criteria) this;
        }

        public Criteria andBCommcntGreaterThanOrEqualTo(Integer value) {
            addCriterion("b_commCnt >=", value, "bCommcnt");
            return (Criteria) this;
        }

        public Criteria andBCommcntLessThan(Integer value) {
            addCriterion("b_commCnt <", value, "bCommcnt");
            return (Criteria) this;
        }

        public Criteria andBCommcntLessThanOrEqualTo(Integer value) {
            addCriterion("b_commCnt <=", value, "bCommcnt");
            return (Criteria) this;
        }

        public Criteria andBCommcntIn(List<Integer> values) {
            addCriterion("b_commCnt in", values, "bCommcnt");
            return (Criteria) this;
        }

        public Criteria andBCommcntNotIn(List<Integer> values) {
            addCriterion("b_commCnt not in", values, "bCommcnt");
            return (Criteria) this;
        }

        public Criteria andBCommcntBetween(Integer value1, Integer value2) {
            addCriterion("b_commCnt between", value1, value2, "bCommcnt");
            return (Criteria) this;
        }

        public Criteria andBCommcntNotBetween(Integer value1, Integer value2) {
            addCriterion("b_commCnt not between", value1, value2, "bCommcnt");
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