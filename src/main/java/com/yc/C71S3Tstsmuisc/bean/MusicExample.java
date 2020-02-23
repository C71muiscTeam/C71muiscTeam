package com.yc.C71S3Tstsmuisc.bean;

import java.util.ArrayList;
import java.util.List;

public class MusicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MusicExample() {
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

        public Criteria andMIdIsNull() {
            addCriterion("m_id is null");
            return (Criteria) this;
        }

        public Criteria andMIdIsNotNull() {
            addCriterion("m_id is not null");
            return (Criteria) this;
        }

        public Criteria andMIdEqualTo(Integer value) {
            addCriterion("m_id =", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotEqualTo(Integer value) {
            addCriterion("m_id <>", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThan(Integer value) {
            addCriterion("m_id >", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("m_id >=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThan(Integer value) {
            addCriterion("m_id <", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThanOrEqualTo(Integer value) {
            addCriterion("m_id <=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdIn(List<Integer> values) {
            addCriterion("m_id in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotIn(List<Integer> values) {
            addCriterion("m_id not in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdBetween(Integer value1, Integer value2) {
            addCriterion("m_id between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotBetween(Integer value1, Integer value2) {
            addCriterion("m_id not between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andMNameIsNull() {
            addCriterion("m_name is null");
            return (Criteria) this;
        }

        public Criteria andMNameIsNotNull() {
            addCriterion("m_name is not null");
            return (Criteria) this;
        }

        public Criteria andMNameEqualTo(String value) {
            addCriterion("m_name =", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotEqualTo(String value) {
            addCriterion("m_name <>", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameGreaterThan(String value) {
            addCriterion("m_name >", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameGreaterThanOrEqualTo(String value) {
            addCriterion("m_name >=", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameLessThan(String value) {
            addCriterion("m_name <", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameLessThanOrEqualTo(String value) {
            addCriterion("m_name <=", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameLike(String value) {
            addCriterion("m_name like", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotLike(String value) {
            addCriterion("m_name not like", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameIn(List<String> values) {
            addCriterion("m_name in", values, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotIn(List<String> values) {
            addCriterion("m_name not in", values, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameBetween(String value1, String value2) {
            addCriterion("m_name between", value1, value2, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotBetween(String value1, String value2) {
            addCriterion("m_name not between", value1, value2, "mName");
            return (Criteria) this;
        }

        public Criteria andMSingeridIsNull() {
            addCriterion("m_singerid is null");
            return (Criteria) this;
        }

        public Criteria andMSingeridIsNotNull() {
            addCriterion("m_singerid is not null");
            return (Criteria) this;
        }

        public Criteria andMSingeridEqualTo(Integer value) {
            addCriterion("m_singerid =", value, "mSingerid");
            return (Criteria) this;
        }

        public Criteria andMSingeridNotEqualTo(Integer value) {
            addCriterion("m_singerid <>", value, "mSingerid");
            return (Criteria) this;
        }

        public Criteria andMSingeridGreaterThan(Integer value) {
            addCriterion("m_singerid >", value, "mSingerid");
            return (Criteria) this;
        }

        public Criteria andMSingeridGreaterThanOrEqualTo(Integer value) {
            addCriterion("m_singerid >=", value, "mSingerid");
            return (Criteria) this;
        }

        public Criteria andMSingeridLessThan(Integer value) {
            addCriterion("m_singerid <", value, "mSingerid");
            return (Criteria) this;
        }

        public Criteria andMSingeridLessThanOrEqualTo(Integer value) {
            addCriterion("m_singerid <=", value, "mSingerid");
            return (Criteria) this;
        }

        public Criteria andMSingeridIn(List<Integer> values) {
            addCriterion("m_singerid in", values, "mSingerid");
            return (Criteria) this;
        }

        public Criteria andMSingeridNotIn(List<Integer> values) {
            addCriterion("m_singerid not in", values, "mSingerid");
            return (Criteria) this;
        }

        public Criteria andMSingeridBetween(Integer value1, Integer value2) {
            addCriterion("m_singerid between", value1, value2, "mSingerid");
            return (Criteria) this;
        }

        public Criteria andMSingeridNotBetween(Integer value1, Integer value2) {
            addCriterion("m_singerid not between", value1, value2, "mSingerid");
            return (Criteria) this;
        }

        public Criteria andMAlbumIsNull() {
            addCriterion("m_album is null");
            return (Criteria) this;
        }

        public Criteria andMAlbumIsNotNull() {
            addCriterion("m_album is not null");
            return (Criteria) this;
        }

        public Criteria andMAlbumEqualTo(Integer value) {
            addCriterion("m_album =", value, "mAlbum");
            return (Criteria) this;
        }

        public Criteria andMAlbumNotEqualTo(Integer value) {
            addCriterion("m_album <>", value, "mAlbum");
            return (Criteria) this;
        }

        public Criteria andMAlbumGreaterThan(Integer value) {
            addCriterion("m_album >", value, "mAlbum");
            return (Criteria) this;
        }

        public Criteria andMAlbumGreaterThanOrEqualTo(Integer value) {
            addCriterion("m_album >=", value, "mAlbum");
            return (Criteria) this;
        }

        public Criteria andMAlbumLessThan(Integer value) {
            addCriterion("m_album <", value, "mAlbum");
            return (Criteria) this;
        }

        public Criteria andMAlbumLessThanOrEqualTo(Integer value) {
            addCriterion("m_album <=", value, "mAlbum");
            return (Criteria) this;
        }

        public Criteria andMAlbumIn(List<Integer> values) {
            addCriterion("m_album in", values, "mAlbum");
            return (Criteria) this;
        }

        public Criteria andMAlbumNotIn(List<Integer> values) {
            addCriterion("m_album not in", values, "mAlbum");
            return (Criteria) this;
        }

        public Criteria andMAlbumBetween(Integer value1, Integer value2) {
            addCriterion("m_album between", value1, value2, "mAlbum");
            return (Criteria) this;
        }

        public Criteria andMAlbumNotBetween(Integer value1, Integer value2) {
            addCriterion("m_album not between", value1, value2, "mAlbum");
            return (Criteria) this;
        }

        public Criteria andMTypeIsNull() {
            addCriterion("m_type is null");
            return (Criteria) this;
        }

        public Criteria andMTypeIsNotNull() {
            addCriterion("m_type is not null");
            return (Criteria) this;
        }

        public Criteria andMTypeEqualTo(String value) {
            addCriterion("m_type =", value, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeNotEqualTo(String value) {
            addCriterion("m_type <>", value, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeGreaterThan(String value) {
            addCriterion("m_type >", value, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeGreaterThanOrEqualTo(String value) {
            addCriterion("m_type >=", value, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeLessThan(String value) {
            addCriterion("m_type <", value, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeLessThanOrEqualTo(String value) {
            addCriterion("m_type <=", value, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeLike(String value) {
            addCriterion("m_type like", value, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeNotLike(String value) {
            addCriterion("m_type not like", value, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeIn(List<String> values) {
            addCriterion("m_type in", values, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeNotIn(List<String> values) {
            addCriterion("m_type not in", values, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeBetween(String value1, String value2) {
            addCriterion("m_type between", value1, value2, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeNotBetween(String value1, String value2) {
            addCriterion("m_type not between", value1, value2, "mType");
            return (Criteria) this;
        }

        public Criteria andMDownloadsIsNull() {
            addCriterion("m_downloads is null");
            return (Criteria) this;
        }

        public Criteria andMDownloadsIsNotNull() {
            addCriterion("m_downloads is not null");
            return (Criteria) this;
        }

        public Criteria andMDownloadsEqualTo(Integer value) {
            addCriterion("m_downloads =", value, "mDownloads");
            return (Criteria) this;
        }

        public Criteria andMDownloadsNotEqualTo(Integer value) {
            addCriterion("m_downloads <>", value, "mDownloads");
            return (Criteria) this;
        }

        public Criteria andMDownloadsGreaterThan(Integer value) {
            addCriterion("m_downloads >", value, "mDownloads");
            return (Criteria) this;
        }

        public Criteria andMDownloadsGreaterThanOrEqualTo(Integer value) {
            addCriterion("m_downloads >=", value, "mDownloads");
            return (Criteria) this;
        }

        public Criteria andMDownloadsLessThan(Integer value) {
            addCriterion("m_downloads <", value, "mDownloads");
            return (Criteria) this;
        }

        public Criteria andMDownloadsLessThanOrEqualTo(Integer value) {
            addCriterion("m_downloads <=", value, "mDownloads");
            return (Criteria) this;
        }

        public Criteria andMDownloadsIn(List<Integer> values) {
            addCriterion("m_downloads in", values, "mDownloads");
            return (Criteria) this;
        }

        public Criteria andMDownloadsNotIn(List<Integer> values) {
            addCriterion("m_downloads not in", values, "mDownloads");
            return (Criteria) this;
        }

        public Criteria andMDownloadsBetween(Integer value1, Integer value2) {
            addCriterion("m_downloads between", value1, value2, "mDownloads");
            return (Criteria) this;
        }

        public Criteria andMDownloadsNotBetween(Integer value1, Integer value2) {
            addCriterion("m_downloads not between", value1, value2, "mDownloads");
            return (Criteria) this;
        }

        public Criteria andMPictureIsNull() {
            addCriterion("m_picture is null");
            return (Criteria) this;
        }

        public Criteria andMPictureIsNotNull() {
            addCriterion("m_picture is not null");
            return (Criteria) this;
        }

        public Criteria andMPictureEqualTo(String value) {
            addCriterion("m_picture =", value, "mPicture");
            return (Criteria) this;
        }

        public Criteria andMPictureNotEqualTo(String value) {
            addCriterion("m_picture <>", value, "mPicture");
            return (Criteria) this;
        }

        public Criteria andMPictureGreaterThan(String value) {
            addCriterion("m_picture >", value, "mPicture");
            return (Criteria) this;
        }

        public Criteria andMPictureGreaterThanOrEqualTo(String value) {
            addCriterion("m_picture >=", value, "mPicture");
            return (Criteria) this;
        }

        public Criteria andMPictureLessThan(String value) {
            addCriterion("m_picture <", value, "mPicture");
            return (Criteria) this;
        }

        public Criteria andMPictureLessThanOrEqualTo(String value) {
            addCriterion("m_picture <=", value, "mPicture");
            return (Criteria) this;
        }

        public Criteria andMPictureLike(String value) {
            addCriterion("m_picture like", value, "mPicture");
            return (Criteria) this;
        }

        public Criteria andMPictureNotLike(String value) {
            addCriterion("m_picture not like", value, "mPicture");
            return (Criteria) this;
        }

        public Criteria andMPictureIn(List<String> values) {
            addCriterion("m_picture in", values, "mPicture");
            return (Criteria) this;
        }

        public Criteria andMPictureNotIn(List<String> values) {
            addCriterion("m_picture not in", values, "mPicture");
            return (Criteria) this;
        }

        public Criteria andMPictureBetween(String value1, String value2) {
            addCriterion("m_picture between", value1, value2, "mPicture");
            return (Criteria) this;
        }

        public Criteria andMPictureNotBetween(String value1, String value2) {
            addCriterion("m_picture not between", value1, value2, "mPicture");
            return (Criteria) this;
        }

        public Criteria andMLanguageIsNull() {
            addCriterion("m_language is null");
            return (Criteria) this;
        }

        public Criteria andMLanguageIsNotNull() {
            addCriterion("m_language is not null");
            return (Criteria) this;
        }

        public Criteria andMLanguageEqualTo(String value) {
            addCriterion("m_language =", value, "mLanguage");
            return (Criteria) this;
        }

        public Criteria andMLanguageNotEqualTo(String value) {
            addCriterion("m_language <>", value, "mLanguage");
            return (Criteria) this;
        }

        public Criteria andMLanguageGreaterThan(String value) {
            addCriterion("m_language >", value, "mLanguage");
            return (Criteria) this;
        }

        public Criteria andMLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("m_language >=", value, "mLanguage");
            return (Criteria) this;
        }

        public Criteria andMLanguageLessThan(String value) {
            addCriterion("m_language <", value, "mLanguage");
            return (Criteria) this;
        }

        public Criteria andMLanguageLessThanOrEqualTo(String value) {
            addCriterion("m_language <=", value, "mLanguage");
            return (Criteria) this;
        }

        public Criteria andMLanguageLike(String value) {
            addCriterion("m_language like", value, "mLanguage");
            return (Criteria) this;
        }

        public Criteria andMLanguageNotLike(String value) {
            addCriterion("m_language not like", value, "mLanguage");
            return (Criteria) this;
        }

        public Criteria andMLanguageIn(List<String> values) {
            addCriterion("m_language in", values, "mLanguage");
            return (Criteria) this;
        }

        public Criteria andMLanguageNotIn(List<String> values) {
            addCriterion("m_language not in", values, "mLanguage");
            return (Criteria) this;
        }

        public Criteria andMLanguageBetween(String value1, String value2) {
            addCriterion("m_language between", value1, value2, "mLanguage");
            return (Criteria) this;
        }

        public Criteria andMLanguageNotBetween(String value1, String value2) {
            addCriterion("m_language not between", value1, value2, "mLanguage");
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