package com.guoguo.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NationCodeExample {
    /**
     * nation_code
     */
    protected String orderByClause;

    /**
     * nation_code
     */
    protected boolean distinct;

    /**
     * nation_code
     */
    protected List<Criteria> oredCriteria;

    public NationCodeExample() {
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

    /**
     * nation_code 2018-04-04
     */
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

        public Criteria andNationCodeIsNull() {
            addCriterion("nation_code is null");
            return (Criteria) this;
        }

        public Criteria andNationCodeIsNotNull() {
            addCriterion("nation_code is not null");
            return (Criteria) this;
        }

        public Criteria andNationCodeEqualTo(String value) {
            addCriterion("nation_code =", value, "nationCode");
            return (Criteria) this;
        }

        public Criteria andNationCodeNotEqualTo(String value) {
            addCriterion("nation_code <>", value, "nationCode");
            return (Criteria) this;
        }

        public Criteria andNationCodeGreaterThan(String value) {
            addCriterion("nation_code >", value, "nationCode");
            return (Criteria) this;
        }

        public Criteria andNationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("nation_code >=", value, "nationCode");
            return (Criteria) this;
        }

        public Criteria andNationCodeLessThan(String value) {
            addCriterion("nation_code <", value, "nationCode");
            return (Criteria) this;
        }

        public Criteria andNationCodeLessThanOrEqualTo(String value) {
            addCriterion("nation_code <=", value, "nationCode");
            return (Criteria) this;
        }

        public Criteria andNationCodeLike(String value) {
            addCriterion("nation_code like", value, "nationCode");
            return (Criteria) this;
        }

        public Criteria andNationCodeNotLike(String value) {
            addCriterion("nation_code not like", value, "nationCode");
            return (Criteria) this;
        }

        public Criteria andNationCodeIn(List<String> values) {
            addCriterion("nation_code in", values, "nationCode");
            return (Criteria) this;
        }

        public Criteria andNationCodeNotIn(List<String> values) {
            addCriterion("nation_code not in", values, "nationCode");
            return (Criteria) this;
        }

        public Criteria andNationCodeBetween(String value1, String value2) {
            addCriterion("nation_code between", value1, value2, "nationCode");
            return (Criteria) this;
        }

        public Criteria andNationCodeNotBetween(String value1, String value2) {
            addCriterion("nation_code not between", value1, value2, "nationCode");
            return (Criteria) this;
        }

        public Criteria andNationNameIsNull() {
            addCriterion("nation_name is null");
            return (Criteria) this;
        }

        public Criteria andNationNameIsNotNull() {
            addCriterion("nation_name is not null");
            return (Criteria) this;
        }

        public Criteria andNationNameEqualTo(String value) {
            addCriterion("nation_name =", value, "nationName");
            return (Criteria) this;
        }

        public Criteria andNationNameNotEqualTo(String value) {
            addCriterion("nation_name <>", value, "nationName");
            return (Criteria) this;
        }

        public Criteria andNationNameGreaterThan(String value) {
            addCriterion("nation_name >", value, "nationName");
            return (Criteria) this;
        }

        public Criteria andNationNameGreaterThanOrEqualTo(String value) {
            addCriterion("nation_name >=", value, "nationName");
            return (Criteria) this;
        }

        public Criteria andNationNameLessThan(String value) {
            addCriterion("nation_name <", value, "nationName");
            return (Criteria) this;
        }

        public Criteria andNationNameLessThanOrEqualTo(String value) {
            addCriterion("nation_name <=", value, "nationName");
            return (Criteria) this;
        }

        public Criteria andNationNameLike(String value) {
            addCriterion("nation_name like", value, "nationName");
            return (Criteria) this;
        }

        public Criteria andNationNameNotLike(String value) {
            addCriterion("nation_name not like", value, "nationName");
            return (Criteria) this;
        }

        public Criteria andNationNameIn(List<String> values) {
            addCriterion("nation_name in", values, "nationName");
            return (Criteria) this;
        }

        public Criteria andNationNameNotIn(List<String> values) {
            addCriterion("nation_name not in", values, "nationName");
            return (Criteria) this;
        }

        public Criteria andNationNameBetween(String value1, String value2) {
            addCriterion("nation_name between", value1, value2, "nationName");
            return (Criteria) this;
        }

        public Criteria andNationNameNotBetween(String value1, String value2) {
            addCriterion("nation_name not between", value1, value2, "nationName");
            return (Criteria) this;
        }

        public Criteria andNationEngIsNull() {
            addCriterion("nation_eng is null");
            return (Criteria) this;
        }

        public Criteria andNationEngIsNotNull() {
            addCriterion("nation_eng is not null");
            return (Criteria) this;
        }

        public Criteria andNationEngEqualTo(String value) {
            addCriterion("nation_eng =", value, "nationEng");
            return (Criteria) this;
        }

        public Criteria andNationEngNotEqualTo(String value) {
            addCriterion("nation_eng <>", value, "nationEng");
            return (Criteria) this;
        }

        public Criteria andNationEngGreaterThan(String value) {
            addCriterion("nation_eng >", value, "nationEng");
            return (Criteria) this;
        }

        public Criteria andNationEngGreaterThanOrEqualTo(String value) {
            addCriterion("nation_eng >=", value, "nationEng");
            return (Criteria) this;
        }

        public Criteria andNationEngLessThan(String value) {
            addCriterion("nation_eng <", value, "nationEng");
            return (Criteria) this;
        }

        public Criteria andNationEngLessThanOrEqualTo(String value) {
            addCriterion("nation_eng <=", value, "nationEng");
            return (Criteria) this;
        }

        public Criteria andNationEngLike(String value) {
            addCriterion("nation_eng like", value, "nationEng");
            return (Criteria) this;
        }

        public Criteria andNationEngNotLike(String value) {
            addCriterion("nation_eng not like", value, "nationEng");
            return (Criteria) this;
        }

        public Criteria andNationEngIn(List<String> values) {
            addCriterion("nation_eng in", values, "nationEng");
            return (Criteria) this;
        }

        public Criteria andNationEngNotIn(List<String> values) {
            addCriterion("nation_eng not in", values, "nationEng");
            return (Criteria) this;
        }

        public Criteria andNationEngBetween(String value1, String value2) {
            addCriterion("nation_eng between", value1, value2, "nationEng");
            return (Criteria) this;
        }

        public Criteria andNationEngNotBetween(String value1, String value2) {
            addCriterion("nation_eng not between", value1, value2, "nationEng");
            return (Criteria) this;
        }

        public Criteria andNationPhoneCodeIsNull() {
            addCriterion("nation_phone_code is null");
            return (Criteria) this;
        }

        public Criteria andNationPhoneCodeIsNotNull() {
            addCriterion("nation_phone_code is not null");
            return (Criteria) this;
        }

        public Criteria andNationPhoneCodeEqualTo(String value) {
            addCriterion("nation_phone_code =", value, "nationPhoneCode");
            return (Criteria) this;
        }

        public Criteria andNationPhoneCodeNotEqualTo(String value) {
            addCriterion("nation_phone_code <>", value, "nationPhoneCode");
            return (Criteria) this;
        }

        public Criteria andNationPhoneCodeGreaterThan(String value) {
            addCriterion("nation_phone_code >", value, "nationPhoneCode");
            return (Criteria) this;
        }

        public Criteria andNationPhoneCodeGreaterThanOrEqualTo(String value) {
            addCriterion("nation_phone_code >=", value, "nationPhoneCode");
            return (Criteria) this;
        }

        public Criteria andNationPhoneCodeLessThan(String value) {
            addCriterion("nation_phone_code <", value, "nationPhoneCode");
            return (Criteria) this;
        }

        public Criteria andNationPhoneCodeLessThanOrEqualTo(String value) {
            addCriterion("nation_phone_code <=", value, "nationPhoneCode");
            return (Criteria) this;
        }

        public Criteria andNationPhoneCodeLike(String value) {
            addCriterion("nation_phone_code like", value, "nationPhoneCode");
            return (Criteria) this;
        }

        public Criteria andNationPhoneCodeNotLike(String value) {
            addCriterion("nation_phone_code not like", value, "nationPhoneCode");
            return (Criteria) this;
        }

        public Criteria andNationPhoneCodeIn(List<String> values) {
            addCriterion("nation_phone_code in", values, "nationPhoneCode");
            return (Criteria) this;
        }

        public Criteria andNationPhoneCodeNotIn(List<String> values) {
            addCriterion("nation_phone_code not in", values, "nationPhoneCode");
            return (Criteria) this;
        }

        public Criteria andNationPhoneCodeBetween(String value1, String value2) {
            addCriterion("nation_phone_code between", value1, value2, "nationPhoneCode");
            return (Criteria) this;
        }

        public Criteria andNationPhoneCodeNotBetween(String value1, String value2) {
            addCriterion("nation_phone_code not between", value1, value2, "nationPhoneCode");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andIsExpandIsNull() {
            addCriterion("is_expand is null");
            return (Criteria) this;
        }

        public Criteria andIsExpandIsNotNull() {
            addCriterion("is_expand is not null");
            return (Criteria) this;
        }

        public Criteria andIsExpandEqualTo(Byte value) {
            addCriterion("is_expand =", value, "isExpand");
            return (Criteria) this;
        }

        public Criteria andIsExpandNotEqualTo(Byte value) {
            addCriterion("is_expand <>", value, "isExpand");
            return (Criteria) this;
        }

        public Criteria andIsExpandGreaterThan(Byte value) {
            addCriterion("is_expand >", value, "isExpand");
            return (Criteria) this;
        }

        public Criteria andIsExpandGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_expand >=", value, "isExpand");
            return (Criteria) this;
        }

        public Criteria andIsExpandLessThan(Byte value) {
            addCriterion("is_expand <", value, "isExpand");
            return (Criteria) this;
        }

        public Criteria andIsExpandLessThanOrEqualTo(Byte value) {
            addCriterion("is_expand <=", value, "isExpand");
            return (Criteria) this;
        }

        public Criteria andIsExpandIn(List<Byte> values) {
            addCriterion("is_expand in", values, "isExpand");
            return (Criteria) this;
        }

        public Criteria andIsExpandNotIn(List<Byte> values) {
            addCriterion("is_expand not in", values, "isExpand");
            return (Criteria) this;
        }

        public Criteria andIsExpandBetween(Byte value1, Byte value2) {
            addCriterion("is_expand between", value1, value2, "isExpand");
            return (Criteria) this;
        }

        public Criteria andIsExpandNotBetween(Byte value1, Byte value2) {
            addCriterion("is_expand not between", value1, value2, "isExpand");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNull() {
            addCriterion("is_del is null");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNotNull() {
            addCriterion("is_del is not null");
            return (Criteria) this;
        }

        public Criteria andIsDelEqualTo(Byte value) {
            addCriterion("is_del =", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualTo(Byte value) {
            addCriterion("is_del <>", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThan(Byte value) {
            addCriterion("is_del >", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_del >=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThan(Byte value) {
            addCriterion("is_del <", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualTo(Byte value) {
            addCriterion("is_del <=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelIn(List<Byte> values) {
            addCriterion("is_del in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotIn(List<Byte> values) {
            addCriterion("is_del not in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelBetween(Byte value1, Byte value2) {
            addCriterion("is_del between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotBetween(Byte value1, Byte value2) {
            addCriterion("is_del not between", value1, value2, "isDel");
            return (Criteria) this;
        }
    }

    /**
     * nation_code
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * nation_code 2018-04-04
     */
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