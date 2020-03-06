package com.yc.C71S3Tstsmuisc.bean;

import java.util.ArrayList;
import java.util.List;

public class SingerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SingerExample() {
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

        public Criteria andSNameIsNull() {
            addCriterion("s_name is null");
            return (Criteria) this;
        }

        public Criteria andSNameIsNotNull() {
            addCriterion("s_name is not null");
            return (Criteria) this;
        }

        public Criteria andSNameEqualTo(String value) {
            addCriterion("s_name =", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotEqualTo(String value) {
            addCriterion("s_name <>", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThan(String value) {
            addCriterion("s_name >", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThanOrEqualTo(String value) {
            addCriterion("s_name >=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThan(String value) {
            addCriterion("s_name <", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThanOrEqualTo(String value) {
            addCriterion("s_name <=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLike(String value) {
            addCriterion("s_name like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotLike(String value) {
            addCriterion("s_name not like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameIn(List<String> values) {
            addCriterion("s_name in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotIn(List<String> values) {
            addCriterion("s_name not in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameBetween(String value1, String value2) {
            addCriterion("s_name between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotBetween(String value1, String value2) {
            addCriterion("s_name not between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSGenderIsNull() {
            addCriterion("s_gender is null");
            return (Criteria) this;
        }

        public Criteria andSGenderIsNotNull() {
            addCriterion("s_gender is not null");
            return (Criteria) this;
        }

        public Criteria andSGenderEqualTo(String value) {
            addCriterion("s_gender =", value, "sGender");
            return (Criteria) this;
        }

        public Criteria andSGenderNotEqualTo(String value) {
            addCriterion("s_gender <>", value, "sGender");
            return (Criteria) this;
        }

        public Criteria andSGenderGreaterThan(String value) {
            addCriterion("s_gender >", value, "sGender");
            return (Criteria) this;
        }

        public Criteria andSGenderGreaterThanOrEqualTo(String value) {
            addCriterion("s_gender >=", value, "sGender");
            return (Criteria) this;
        }

        public Criteria andSGenderLessThan(String value) {
            addCriterion("s_gender <", value, "sGender");
            return (Criteria) this;
        }

        public Criteria andSGenderLessThanOrEqualTo(String value) {
            addCriterion("s_gender <=", value, "sGender");
            return (Criteria) this;
        }

        public Criteria andSGenderLike(String value) {
            addCriterion("s_gender like", value, "sGender");
            return (Criteria) this;
        }

        public Criteria andSGenderNotLike(String value) {
            addCriterion("s_gender not like", value, "sGender");
            return (Criteria) this;
        }

        public Criteria andSGenderIn(List<String> values) {
            addCriterion("s_gender in", values, "sGender");
            return (Criteria) this;
        }

        public Criteria andSGenderNotIn(List<String> values) {
            addCriterion("s_gender not in", values, "sGender");
            return (Criteria) this;
        }

        public Criteria andSGenderBetween(String value1, String value2) {
            addCriterion("s_gender between", value1, value2, "sGender");
            return (Criteria) this;
        }

        public Criteria andSGenderNotBetween(String value1, String value2) {
            addCriterion("s_gender not between", value1, value2, "sGender");
            return (Criteria) this;
        }

        public Criteria andSPictureIsNull() {
            addCriterion("s_picture is null");
            return (Criteria) this;
        }

        public Criteria andSPictureIsNotNull() {
            addCriterion("s_picture is not null");
            return (Criteria) this;
        }

        public Criteria andSPictureEqualTo(String value) {
            addCriterion("s_picture =", value, "sPicture");
            return (Criteria) this;
        }

        public Criteria andSPictureNotEqualTo(String value) {
            addCriterion("s_picture <>", value, "sPicture");
            return (Criteria) this;
        }

        public Criteria andSPictureGreaterThan(String value) {
            addCriterion("s_picture >", value, "sPicture");
            return (Criteria) this;
        }

        public Criteria andSPictureGreaterThanOrEqualTo(String value) {
            addCriterion("s_picture >=", value, "sPicture");
            return (Criteria) this;
        }

        public Criteria andSPictureLessThan(String value) {
            addCriterion("s_picture <", value, "sPicture");
            return (Criteria) this;
        }

        public Criteria andSPictureLessThanOrEqualTo(String value) {
            addCriterion("s_picture <=", value, "sPicture");
            return (Criteria) this;
        }

        public Criteria andSPictureLike(String value) {
            addCriterion("s_picture like", value, "sPicture");
            return (Criteria) this;
        }

        public Criteria andSPictureNotLike(String value) {
            addCriterion("s_picture not like", value, "sPicture");
            return (Criteria) this;
        }

        public Criteria andSPictureIn(List<String> values) {
            addCriterion("s_picture in", values, "sPicture");
            return (Criteria) this;
        }

        public Criteria andSPictureNotIn(List<String> values) {
            addCriterion("s_picture not in", values, "sPicture");
            return (Criteria) this;
        }

        public Criteria andSPictureBetween(String value1, String value2) {
            addCriterion("s_picture between", value1, value2, "sPicture");
            return (Criteria) this;
        }

        public Criteria andSPictureNotBetween(String value1, String value2) {
            addCriterion("s_picture not between", value1, value2, "sPicture");
            return (Criteria) this;
        }

        public Criteria andSIntroIsNull() {
            addCriterion("s_intro is null");
            return (Criteria) this;
        }

        public Criteria andSIntroIsNotNull() {
            addCriterion("s_intro is not null");
            return (Criteria) this;
        }

        public Criteria andSIntroEqualTo(String value) {
            addCriterion("s_intro =", value, "sIntro");
            return (Criteria) this;
        }

        public Criteria andSIntroNotEqualTo(String value) {
            addCriterion("s_intro <>", value, "sIntro");
            return (Criteria) this;
        }

        public Criteria andSIntroGreaterThan(String value) {
            addCriterion("s_intro >", value, "sIntro");
            return (Criteria) this;
        }

        public Criteria andSIntroGreaterThanOrEqualTo(String value) {
            addCriterion("s_intro >=", value, "sIntro");
            return (Criteria) this;
        }

        public Criteria andSIntroLessThan(String value) {
            addCriterion("s_intro <", value, "sIntro");
            return (Criteria) this;
        }

        public Criteria andSIntroLessThanOrEqualTo(String value) {
            addCriterion("s_intro <=", value, "sIntro");
            return (Criteria) this;
        }

        public Criteria andSIntroLike(String value) {
            addCriterion("s_intro like", value, "sIntro");
            return (Criteria) this;
        }

        public Criteria andSIntroNotLike(String value) {
            addCriterion("s_intro not like", value, "sIntro");
            return (Criteria) this;
        }

        public Criteria andSIntroIn(List<String> values) {
            addCriterion("s_intro in", values, "sIntro");
            return (Criteria) this;
        }

        public Criteria andSIntroNotIn(List<String> values) {
            addCriterion("s_intro not in", values, "sIntro");
            return (Criteria) this;
        }

        public Criteria andSIntroBetween(String value1, String value2) {
            addCriterion("s_intro between", value1, value2, "sIntro");
            return (Criteria) this;
        }

        public Criteria andSIntroNotBetween(String value1, String value2) {
            addCriterion("s_intro not between", value1, value2, "sIntro");
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