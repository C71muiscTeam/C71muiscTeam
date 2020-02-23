package com.yc.C71S3Tstsmuisc.bean;

import java.util.ArrayList;
import java.util.List;

public class CollectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CollectExample() {
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

        public Criteria andCIdIsNull() {
            addCriterion("c_id is null");
            return (Criteria) this;
        }

        public Criteria andCIdIsNotNull() {
            addCriterion("c_id is not null");
            return (Criteria) this;
        }

        public Criteria andCIdEqualTo(Integer value) {
            addCriterion("c_id =", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotEqualTo(Integer value) {
            addCriterion("c_id <>", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThan(Integer value) {
            addCriterion("c_id >", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_id >=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThan(Integer value) {
            addCriterion("c_id <", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThanOrEqualTo(Integer value) {
            addCriterion("c_id <=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdIn(List<Integer> values) {
            addCriterion("c_id in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotIn(List<Integer> values) {
            addCriterion("c_id not in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdBetween(Integer value1, Integer value2) {
            addCriterion("c_id between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotBetween(Integer value1, Integer value2) {
            addCriterion("c_id not between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCUseridIsNull() {
            addCriterion("c_userid is null");
            return (Criteria) this;
        }

        public Criteria andCUseridIsNotNull() {
            addCriterion("c_userid is not null");
            return (Criteria) this;
        }

        public Criteria andCUseridEqualTo(Integer value) {
            addCriterion("c_userid =", value, "cUserid");
            return (Criteria) this;
        }

        public Criteria andCUseridNotEqualTo(Integer value) {
            addCriterion("c_userid <>", value, "cUserid");
            return (Criteria) this;
        }

        public Criteria andCUseridGreaterThan(Integer value) {
            addCriterion("c_userid >", value, "cUserid");
            return (Criteria) this;
        }

        public Criteria andCUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_userid >=", value, "cUserid");
            return (Criteria) this;
        }

        public Criteria andCUseridLessThan(Integer value) {
            addCriterion("c_userid <", value, "cUserid");
            return (Criteria) this;
        }

        public Criteria andCUseridLessThanOrEqualTo(Integer value) {
            addCriterion("c_userid <=", value, "cUserid");
            return (Criteria) this;
        }

        public Criteria andCUseridIn(List<Integer> values) {
            addCriterion("c_userid in", values, "cUserid");
            return (Criteria) this;
        }

        public Criteria andCUseridNotIn(List<Integer> values) {
            addCriterion("c_userid not in", values, "cUserid");
            return (Criteria) this;
        }

        public Criteria andCUseridBetween(Integer value1, Integer value2) {
            addCriterion("c_userid between", value1, value2, "cUserid");
            return (Criteria) this;
        }

        public Criteria andCUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("c_userid not between", value1, value2, "cUserid");
            return (Criteria) this;
        }

        public Criteria andCMusicidIsNull() {
            addCriterion("c_musicid is null");
            return (Criteria) this;
        }

        public Criteria andCMusicidIsNotNull() {
            addCriterion("c_musicid is not null");
            return (Criteria) this;
        }

        public Criteria andCMusicidEqualTo(Integer value) {
            addCriterion("c_musicid =", value, "cMusicid");
            return (Criteria) this;
        }

        public Criteria andCMusicidNotEqualTo(Integer value) {
            addCriterion("c_musicid <>", value, "cMusicid");
            return (Criteria) this;
        }

        public Criteria andCMusicidGreaterThan(Integer value) {
            addCriterion("c_musicid >", value, "cMusicid");
            return (Criteria) this;
        }

        public Criteria andCMusicidGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_musicid >=", value, "cMusicid");
            return (Criteria) this;
        }

        public Criteria andCMusicidLessThan(Integer value) {
            addCriterion("c_musicid <", value, "cMusicid");
            return (Criteria) this;
        }

        public Criteria andCMusicidLessThanOrEqualTo(Integer value) {
            addCriterion("c_musicid <=", value, "cMusicid");
            return (Criteria) this;
        }

        public Criteria andCMusicidIn(List<Integer> values) {
            addCriterion("c_musicid in", values, "cMusicid");
            return (Criteria) this;
        }

        public Criteria andCMusicidNotIn(List<Integer> values) {
            addCriterion("c_musicid not in", values, "cMusicid");
            return (Criteria) this;
        }

        public Criteria andCMusicidBetween(Integer value1, Integer value2) {
            addCriterion("c_musicid between", value1, value2, "cMusicid");
            return (Criteria) this;
        }

        public Criteria andCMusicidNotBetween(Integer value1, Integer value2) {
            addCriterion("c_musicid not between", value1, value2, "cMusicid");
            return (Criteria) this;
        }

        public Criteria andCListidIsNull() {
            addCriterion("c_listid is null");
            return (Criteria) this;
        }

        public Criteria andCListidIsNotNull() {
            addCriterion("c_listid is not null");
            return (Criteria) this;
        }

        public Criteria andCListidEqualTo(Integer value) {
            addCriterion("c_listid =", value, "cListid");
            return (Criteria) this;
        }

        public Criteria andCListidNotEqualTo(Integer value) {
            addCriterion("c_listid <>", value, "cListid");
            return (Criteria) this;
        }

        public Criteria andCListidGreaterThan(Integer value) {
            addCriterion("c_listid >", value, "cListid");
            return (Criteria) this;
        }

        public Criteria andCListidGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_listid >=", value, "cListid");
            return (Criteria) this;
        }

        public Criteria andCListidLessThan(Integer value) {
            addCriterion("c_listid <", value, "cListid");
            return (Criteria) this;
        }

        public Criteria andCListidLessThanOrEqualTo(Integer value) {
            addCriterion("c_listid <=", value, "cListid");
            return (Criteria) this;
        }

        public Criteria andCListidIn(List<Integer> values) {
            addCriterion("c_listid in", values, "cListid");
            return (Criteria) this;
        }

        public Criteria andCListidNotIn(List<Integer> values) {
            addCriterion("c_listid not in", values, "cListid");
            return (Criteria) this;
        }

        public Criteria andCListidBetween(Integer value1, Integer value2) {
            addCriterion("c_listid between", value1, value2, "cListid");
            return (Criteria) this;
        }

        public Criteria andCListidNotBetween(Integer value1, Integer value2) {
            addCriterion("c_listid not between", value1, value2, "cListid");
            return (Criteria) this;
        }

        public Criteria andCAlbumidIsNull() {
            addCriterion("c_albumid is null");
            return (Criteria) this;
        }

        public Criteria andCAlbumidIsNotNull() {
            addCriterion("c_albumid is not null");
            return (Criteria) this;
        }

        public Criteria andCAlbumidEqualTo(Integer value) {
            addCriterion("c_albumid =", value, "cAlbumid");
            return (Criteria) this;
        }

        public Criteria andCAlbumidNotEqualTo(Integer value) {
            addCriterion("c_albumid <>", value, "cAlbumid");
            return (Criteria) this;
        }

        public Criteria andCAlbumidGreaterThan(Integer value) {
            addCriterion("c_albumid >", value, "cAlbumid");
            return (Criteria) this;
        }

        public Criteria andCAlbumidGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_albumid >=", value, "cAlbumid");
            return (Criteria) this;
        }

        public Criteria andCAlbumidLessThan(Integer value) {
            addCriterion("c_albumid <", value, "cAlbumid");
            return (Criteria) this;
        }

        public Criteria andCAlbumidLessThanOrEqualTo(Integer value) {
            addCriterion("c_albumid <=", value, "cAlbumid");
            return (Criteria) this;
        }

        public Criteria andCAlbumidIn(List<Integer> values) {
            addCriterion("c_albumid in", values, "cAlbumid");
            return (Criteria) this;
        }

        public Criteria andCAlbumidNotIn(List<Integer> values) {
            addCriterion("c_albumid not in", values, "cAlbumid");
            return (Criteria) this;
        }

        public Criteria andCAlbumidBetween(Integer value1, Integer value2) {
            addCriterion("c_albumid between", value1, value2, "cAlbumid");
            return (Criteria) this;
        }

        public Criteria andCAlbumidNotBetween(Integer value1, Integer value2) {
            addCriterion("c_albumid not between", value1, value2, "cAlbumid");
            return (Criteria) this;
        }

        public Criteria andCSingeridIsNull() {
            addCriterion("c_singerid is null");
            return (Criteria) this;
        }

        public Criteria andCSingeridIsNotNull() {
            addCriterion("c_singerid is not null");
            return (Criteria) this;
        }

        public Criteria andCSingeridEqualTo(Integer value) {
            addCriterion("c_singerid =", value, "cSingerid");
            return (Criteria) this;
        }

        public Criteria andCSingeridNotEqualTo(Integer value) {
            addCriterion("c_singerid <>", value, "cSingerid");
            return (Criteria) this;
        }

        public Criteria andCSingeridGreaterThan(Integer value) {
            addCriterion("c_singerid >", value, "cSingerid");
            return (Criteria) this;
        }

        public Criteria andCSingeridGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_singerid >=", value, "cSingerid");
            return (Criteria) this;
        }

        public Criteria andCSingeridLessThan(Integer value) {
            addCriterion("c_singerid <", value, "cSingerid");
            return (Criteria) this;
        }

        public Criteria andCSingeridLessThanOrEqualTo(Integer value) {
            addCriterion("c_singerid <=", value, "cSingerid");
            return (Criteria) this;
        }

        public Criteria andCSingeridIn(List<Integer> values) {
            addCriterion("c_singerid in", values, "cSingerid");
            return (Criteria) this;
        }

        public Criteria andCSingeridNotIn(List<Integer> values) {
            addCriterion("c_singerid not in", values, "cSingerid");
            return (Criteria) this;
        }

        public Criteria andCSingeridBetween(Integer value1, Integer value2) {
            addCriterion("c_singerid between", value1, value2, "cSingerid");
            return (Criteria) this;
        }

        public Criteria andCSingeridNotBetween(Integer value1, Integer value2) {
            addCriterion("c_singerid not between", value1, value2, "cSingerid");
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