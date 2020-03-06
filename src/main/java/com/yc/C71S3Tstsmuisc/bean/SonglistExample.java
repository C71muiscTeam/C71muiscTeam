package com.yc.C71S3Tstsmuisc.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SonglistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SonglistExample() {
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

        public Criteria andLNameIsNull() {
            addCriterion("l_name is null");
            return (Criteria) this;
        }

        public Criteria andLNameIsNotNull() {
            addCriterion("l_name is not null");
            return (Criteria) this;
        }

        public Criteria andLNameEqualTo(String value) {
            addCriterion("l_name =", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameNotEqualTo(String value) {
            addCriterion("l_name <>", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameGreaterThan(String value) {
            addCriterion("l_name >", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameGreaterThanOrEqualTo(String value) {
            addCriterion("l_name >=", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameLessThan(String value) {
            addCriterion("l_name <", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameLessThanOrEqualTo(String value) {
            addCriterion("l_name <=", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameLike(String value) {
            addCriterion("l_name like", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameNotLike(String value) {
            addCriterion("l_name not like", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameIn(List<String> values) {
            addCriterion("l_name in", values, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameNotIn(List<String> values) {
            addCriterion("l_name not in", values, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameBetween(String value1, String value2) {
            addCriterion("l_name between", value1, value2, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameNotBetween(String value1, String value2) {
            addCriterion("l_name not between", value1, value2, "lName");
            return (Criteria) this;
        }

        public Criteria andLUseridIsNull() {
            addCriterion("l_userid is null");
            return (Criteria) this;
        }

        public Criteria andLUseridIsNotNull() {
            addCriterion("l_userid is not null");
            return (Criteria) this;
        }

        public Criteria andLUseridEqualTo(Integer value) {
            addCriterion("l_userid =", value, "lUserid");
            return (Criteria) this;
        }

        public Criteria andLUseridNotEqualTo(Integer value) {
            addCriterion("l_userid <>", value, "lUserid");
            return (Criteria) this;
        }

        public Criteria andLUseridGreaterThan(Integer value) {
            addCriterion("l_userid >", value, "lUserid");
            return (Criteria) this;
        }

        public Criteria andLUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("l_userid >=", value, "lUserid");
            return (Criteria) this;
        }

        public Criteria andLUseridLessThan(Integer value) {
            addCriterion("l_userid <", value, "lUserid");
            return (Criteria) this;
        }

        public Criteria andLUseridLessThanOrEqualTo(Integer value) {
            addCriterion("l_userid <=", value, "lUserid");
            return (Criteria) this;
        }

        public Criteria andLUseridIn(List<Integer> values) {
            addCriterion("l_userid in", values, "lUserid");
            return (Criteria) this;
        }

        public Criteria andLUseridNotIn(List<Integer> values) {
            addCriterion("l_userid not in", values, "lUserid");
            return (Criteria) this;
        }

        public Criteria andLUseridBetween(Integer value1, Integer value2) {
            addCriterion("l_userid between", value1, value2, "lUserid");
            return (Criteria) this;
        }

        public Criteria andLUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("l_userid not between", value1, value2, "lUserid");
            return (Criteria) this;
        }

        public Criteria andLTimeIsNull() {
            addCriterion("l_time is null");
            return (Criteria) this;
        }

        public Criteria andLTimeIsNotNull() {
            addCriterion("l_time is not null");
            return (Criteria) this;
        }

        public Criteria andLTimeEqualTo(Date value) {
            addCriterion("l_time =", value, "lTime");
            return (Criteria) this;
        }

        public Criteria andLTimeNotEqualTo(Date value) {
            addCriterion("l_time <>", value, "lTime");
            return (Criteria) this;
        }

        public Criteria andLTimeGreaterThan(Date value) {
            addCriterion("l_time >", value, "lTime");
            return (Criteria) this;
        }

        public Criteria andLTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("l_time >=", value, "lTime");
            return (Criteria) this;
        }

        public Criteria andLTimeLessThan(Date value) {
            addCriterion("l_time <", value, "lTime");
            return (Criteria) this;
        }

        public Criteria andLTimeLessThanOrEqualTo(Date value) {
            addCriterion("l_time <=", value, "lTime");
            return (Criteria) this;
        }

        public Criteria andLTimeIn(List<Date> values) {
            addCriterion("l_time in", values, "lTime");
            return (Criteria) this;
        }

        public Criteria andLTimeNotIn(List<Date> values) {
            addCriterion("l_time not in", values, "lTime");
            return (Criteria) this;
        }

        public Criteria andLTimeBetween(Date value1, Date value2) {
            addCriterion("l_time between", value1, value2, "lTime");
            return (Criteria) this;
        }

        public Criteria andLTimeNotBetween(Date value1, Date value2) {
            addCriterion("l_time not between", value1, value2, "lTime");
            return (Criteria) this;
        }

        public Criteria andLIntroIsNull() {
            addCriterion("l_intro is null");
            return (Criteria) this;
        }

        public Criteria andLIntroIsNotNull() {
            addCriterion("l_intro is not null");
            return (Criteria) this;
        }

        public Criteria andLIntroEqualTo(String value) {
            addCriterion("l_intro =", value, "lIntro");
            return (Criteria) this;
        }

        public Criteria andLIntroNotEqualTo(String value) {
            addCriterion("l_intro <>", value, "lIntro");
            return (Criteria) this;
        }

        public Criteria andLIntroGreaterThan(String value) {
            addCriterion("l_intro >", value, "lIntro");
            return (Criteria) this;
        }

        public Criteria andLIntroGreaterThanOrEqualTo(String value) {
            addCriterion("l_intro >=", value, "lIntro");
            return (Criteria) this;
        }

        public Criteria andLIntroLessThan(String value) {
            addCriterion("l_intro <", value, "lIntro");
            return (Criteria) this;
        }

        public Criteria andLIntroLessThanOrEqualTo(String value) {
            addCriterion("l_intro <=", value, "lIntro");
            return (Criteria) this;
        }

        public Criteria andLIntroLike(String value) {
            addCriterion("l_intro like", value, "lIntro");
            return (Criteria) this;
        }

        public Criteria andLIntroNotLike(String value) {
            addCriterion("l_intro not like", value, "lIntro");
            return (Criteria) this;
        }

        public Criteria andLIntroIn(List<String> values) {
            addCriterion("l_intro in", values, "lIntro");
            return (Criteria) this;
        }

        public Criteria andLIntroNotIn(List<String> values) {
            addCriterion("l_intro not in", values, "lIntro");
            return (Criteria) this;
        }

        public Criteria andLIntroBetween(String value1, String value2) {
            addCriterion("l_intro between", value1, value2, "lIntro");
            return (Criteria) this;
        }

        public Criteria andLIntroNotBetween(String value1, String value2) {
            addCriterion("l_intro not between", value1, value2, "lIntro");
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