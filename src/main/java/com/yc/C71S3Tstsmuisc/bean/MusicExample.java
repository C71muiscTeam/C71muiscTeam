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

        public Criteria andMAlbumidIsNull() {
            addCriterion("m_albumid is null");
            return (Criteria) this;
        }

        public Criteria andMAlbumidIsNotNull() {
            addCriterion("m_albumid is not null");
            return (Criteria) this;
        }

        public Criteria andMAlbumidEqualTo(Integer value) {
            addCriterion("m_albumid =", value, "mAlbumid");
            return (Criteria) this;
        }

        public Criteria andMAlbumidNotEqualTo(Integer value) {
            addCriterion("m_albumid <>", value, "mAlbumid");
            return (Criteria) this;
        }

        public Criteria andMAlbumidGreaterThan(Integer value) {
            addCriterion("m_albumid >", value, "mAlbumid");
            return (Criteria) this;
        }

        public Criteria andMAlbumidGreaterThanOrEqualTo(Integer value) {
            addCriterion("m_albumid >=", value, "mAlbumid");
            return (Criteria) this;
        }

        public Criteria andMAlbumidLessThan(Integer value) {
            addCriterion("m_albumid <", value, "mAlbumid");
            return (Criteria) this;
        }

        public Criteria andMAlbumidLessThanOrEqualTo(Integer value) {
            addCriterion("m_albumid <=", value, "mAlbumid");
            return (Criteria) this;
        }

        public Criteria andMAlbumidIn(List<Integer> values) {
            addCriterion("m_albumid in", values, "mAlbumid");
            return (Criteria) this;
        }

        public Criteria andMAlbumidNotIn(List<Integer> values) {
            addCriterion("m_albumid not in", values, "mAlbumid");
            return (Criteria) this;
        }

        public Criteria andMAlbumidBetween(Integer value1, Integer value2) {
            addCriterion("m_albumid between", value1, value2, "mAlbumid");
            return (Criteria) this;
        }

        public Criteria andMAlbumidNotBetween(Integer value1, Integer value2) {
            addCriterion("m_albumid not between", value1, value2, "mAlbumid");
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

        public Criteria andMCheckIsNull() {
            addCriterion("m_check is null");
            return (Criteria) this;
        }

        public Criteria andMCheckIsNotNull() {
            addCriterion("m_check is not null");
            return (Criteria) this;
        }

        public Criteria andMCheckEqualTo(Integer value) {
            addCriterion("m_check =", value, "mCheck");
            return (Criteria) this;
        }

        public Criteria andMCheckNotEqualTo(Integer value) {
            addCriterion("m_check <>", value, "mCheck");
            return (Criteria) this;
        }

        public Criteria andMCheckGreaterThan(Integer value) {
            addCriterion("m_check >", value, "mCheck");
            return (Criteria) this;
        }

        public Criteria andMCheckGreaterThanOrEqualTo(Integer value) {
            addCriterion("m_check >=", value, "mCheck");
            return (Criteria) this;
        }

        public Criteria andMCheckLessThan(Integer value) {
            addCriterion("m_check <", value, "mCheck");
            return (Criteria) this;
        }

        public Criteria andMCheckLessThanOrEqualTo(Integer value) {
            addCriterion("m_check <=", value, "mCheck");
            return (Criteria) this;
        }

        public Criteria andMCheckIn(List<Integer> values) {
            addCriterion("m_check in", values, "mCheck");
            return (Criteria) this;
        }

        public Criteria andMCheckNotIn(List<Integer> values) {
            addCriterion("m_check not in", values, "mCheck");
            return (Criteria) this;
        }

        public Criteria andMCheckBetween(Integer value1, Integer value2) {
            addCriterion("m_check between", value1, value2, "mCheck");
            return (Criteria) this;
        }

        public Criteria andMCheckNotBetween(Integer value1, Integer value2) {
            addCriterion("m_check not between", value1, value2, "mCheck");
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