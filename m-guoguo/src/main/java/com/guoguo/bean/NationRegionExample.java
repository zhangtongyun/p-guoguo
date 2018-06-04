package com.guoguo.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NationRegionExample {
    /**
     * nation_region
     */
    protected String orderByClause;

    /**
     * nation_region
     */
    protected boolean distinct;

    /**
     * nation_region
     */
    protected List<Criteria> oredCriteria;

    public NationRegionExample() {
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
     * nation_region 2018-04-23
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

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAdressIsNull() {
            addCriterion("adress is null");
            return (Criteria) this;
        }

        public Criteria andAdressIsNotNull() {
            addCriterion("adress is not null");
            return (Criteria) this;
        }

        public Criteria andAdressEqualTo(String value) {
            addCriterion("adress =", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressNotEqualTo(String value) {
            addCriterion("adress <>", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressGreaterThan(String value) {
            addCriterion("adress >", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressGreaterThanOrEqualTo(String value) {
            addCriterion("adress >=", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressLessThan(String value) {
            addCriterion("adress <", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressLessThanOrEqualTo(String value) {
            addCriterion("adress <=", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressLike(String value) {
            addCriterion("adress like", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressNotLike(String value) {
            addCriterion("adress not like", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressIn(List<String> values) {
            addCriterion("adress in", values, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressNotIn(List<String> values) {
            addCriterion("adress not in", values, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressBetween(String value1, String value2) {
            addCriterion("adress between", value1, value2, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressNotBetween(String value1, String value2) {
            addCriterion("adress not between", value1, value2, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressCodeIsNull() {
            addCriterion("adress_code is null");
            return (Criteria) this;
        }

        public Criteria andAdressCodeIsNotNull() {
            addCriterion("adress_code is not null");
            return (Criteria) this;
        }

        public Criteria andAdressCodeEqualTo(String value) {
            addCriterion("adress_code =", value, "adressCode");
            return (Criteria) this;
        }

        public Criteria andAdressCodeNotEqualTo(String value) {
            addCriterion("adress_code <>", value, "adressCode");
            return (Criteria) this;
        }

        public Criteria andAdressCodeGreaterThan(String value) {
            addCriterion("adress_code >", value, "adressCode");
            return (Criteria) this;
        }

        public Criteria andAdressCodeGreaterThanOrEqualTo(String value) {
            addCriterion("adress_code >=", value, "adressCode");
            return (Criteria) this;
        }

        public Criteria andAdressCodeLessThan(String value) {
            addCriterion("adress_code <", value, "adressCode");
            return (Criteria) this;
        }

        public Criteria andAdressCodeLessThanOrEqualTo(String value) {
            addCriterion("adress_code <=", value, "adressCode");
            return (Criteria) this;
        }

        public Criteria andAdressCodeLike(String value) {
            addCriterion("adress_code like", value, "adressCode");
            return (Criteria) this;
        }

        public Criteria andAdressCodeNotLike(String value) {
            addCriterion("adress_code not like", value, "adressCode");
            return (Criteria) this;
        }

        public Criteria andAdressCodeIn(List<String> values) {
            addCriterion("adress_code in", values, "adressCode");
            return (Criteria) this;
        }

        public Criteria andAdressCodeNotIn(List<String> values) {
            addCriterion("adress_code not in", values, "adressCode");
            return (Criteria) this;
        }

        public Criteria andAdressCodeBetween(String value1, String value2) {
            addCriterion("adress_code between", value1, value2, "adressCode");
            return (Criteria) this;
        }

        public Criteria andAdressCodeNotBetween(String value1, String value2) {
            addCriterion("adress_code not between", value1, value2, "adressCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeIsNull() {
            addCriterion("parent_code is null");
            return (Criteria) this;
        }

        public Criteria andParentCodeIsNotNull() {
            addCriterion("parent_code is not null");
            return (Criteria) this;
        }

        public Criteria andParentCodeEqualTo(String value) {
            addCriterion("parent_code =", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotEqualTo(String value) {
            addCriterion("parent_code <>", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeGreaterThan(String value) {
            addCriterion("parent_code >", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeGreaterThanOrEqualTo(String value) {
            addCriterion("parent_code >=", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeLessThan(String value) {
            addCriterion("parent_code <", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeLessThanOrEqualTo(String value) {
            addCriterion("parent_code <=", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeLike(String value) {
            addCriterion("parent_code like", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotLike(String value) {
            addCriterion("parent_code not like", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeIn(List<String> values) {
            addCriterion("parent_code in", values, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotIn(List<String> values) {
            addCriterion("parent_code not in", values, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeBetween(String value1, String value2) {
            addCriterion("parent_code between", value1, value2, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotBetween(String value1, String value2) {
            addCriterion("parent_code not between", value1, value2, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCode2IsNull() {
            addCriterion("parent_code2 is null");
            return (Criteria) this;
        }

        public Criteria andParentCode2IsNotNull() {
            addCriterion("parent_code2 is not null");
            return (Criteria) this;
        }

        public Criteria andParentCode2EqualTo(String value) {
            addCriterion("parent_code2 =", value, "parentCode2");
            return (Criteria) this;
        }

        public Criteria andParentCode2NotEqualTo(String value) {
            addCriterion("parent_code2 <>", value, "parentCode2");
            return (Criteria) this;
        }

        public Criteria andParentCode2GreaterThan(String value) {
            addCriterion("parent_code2 >", value, "parentCode2");
            return (Criteria) this;
        }

        public Criteria andParentCode2GreaterThanOrEqualTo(String value) {
            addCriterion("parent_code2 >=", value, "parentCode2");
            return (Criteria) this;
        }

        public Criteria andParentCode2LessThan(String value) {
            addCriterion("parent_code2 <", value, "parentCode2");
            return (Criteria) this;
        }

        public Criteria andParentCode2LessThanOrEqualTo(String value) {
            addCriterion("parent_code2 <=", value, "parentCode2");
            return (Criteria) this;
        }

        public Criteria andParentCode2Like(String value) {
            addCriterion("parent_code2 like", value, "parentCode2");
            return (Criteria) this;
        }

        public Criteria andParentCode2NotLike(String value) {
            addCriterion("parent_code2 not like", value, "parentCode2");
            return (Criteria) this;
        }

        public Criteria andParentCode2In(List<String> values) {
            addCriterion("parent_code2 in", values, "parentCode2");
            return (Criteria) this;
        }

        public Criteria andParentCode2NotIn(List<String> values) {
            addCriterion("parent_code2 not in", values, "parentCode2");
            return (Criteria) this;
        }

        public Criteria andParentCode2Between(String value1, String value2) {
            addCriterion("parent_code2 between", value1, value2, "parentCode2");
            return (Criteria) this;
        }

        public Criteria andParentCode2NotBetween(String value1, String value2) {
            addCriterion("parent_code2 not between", value1, value2, "parentCode2");
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

        public Criteria andInsertTimeIsNull() {
            addCriterion("insert_time is null");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIsNotNull() {
            addCriterion("insert_time is not null");
            return (Criteria) this;
        }

        public Criteria andInsertTimeEqualTo(Date value) {
            addCriterion("insert_time =", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotEqualTo(Date value) {
            addCriterion("insert_time <>", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeGreaterThan(Date value) {
            addCriterion("insert_time >", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("insert_time >=", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeLessThan(Date value) {
            addCriterion("insert_time <", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeLessThanOrEqualTo(Date value) {
            addCriterion("insert_time <=", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIn(List<Date> values) {
            addCriterion("insert_time in", values, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotIn(List<Date> values) {
            addCriterion("insert_time not in", values, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeBetween(Date value1, Date value2) {
            addCriterion("insert_time between", value1, value2, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotBetween(Date value1, Date value2) {
            addCriterion("insert_time not between", value1, value2, "insertTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andAdressAliasIsNull() {
            addCriterion("adress_alias is null");
            return (Criteria) this;
        }

        public Criteria andAdressAliasIsNotNull() {
            addCriterion("adress_alias is not null");
            return (Criteria) this;
        }

        public Criteria andAdressAliasEqualTo(String value) {
            addCriterion("adress_alias =", value, "adressAlias");
            return (Criteria) this;
        }

        public Criteria andAdressAliasNotEqualTo(String value) {
            addCriterion("adress_alias <>", value, "adressAlias");
            return (Criteria) this;
        }

        public Criteria andAdressAliasGreaterThan(String value) {
            addCriterion("adress_alias >", value, "adressAlias");
            return (Criteria) this;
        }

        public Criteria andAdressAliasGreaterThanOrEqualTo(String value) {
            addCriterion("adress_alias >=", value, "adressAlias");
            return (Criteria) this;
        }

        public Criteria andAdressAliasLessThan(String value) {
            addCriterion("adress_alias <", value, "adressAlias");
            return (Criteria) this;
        }

        public Criteria andAdressAliasLessThanOrEqualTo(String value) {
            addCriterion("adress_alias <=", value, "adressAlias");
            return (Criteria) this;
        }

        public Criteria andAdressAliasLike(String value) {
            addCriterion("adress_alias like", value, "adressAlias");
            return (Criteria) this;
        }

        public Criteria andAdressAliasNotLike(String value) {
            addCriterion("adress_alias not like", value, "adressAlias");
            return (Criteria) this;
        }

        public Criteria andAdressAliasIn(List<String> values) {
            addCriterion("adress_alias in", values, "adressAlias");
            return (Criteria) this;
        }

        public Criteria andAdressAliasNotIn(List<String> values) {
            addCriterion("adress_alias not in", values, "adressAlias");
            return (Criteria) this;
        }

        public Criteria andAdressAliasBetween(String value1, String value2) {
            addCriterion("adress_alias between", value1, value2, "adressAlias");
            return (Criteria) this;
        }

        public Criteria andAdressAliasNotBetween(String value1, String value2) {
            addCriterion("adress_alias not between", value1, value2, "adressAlias");
            return (Criteria) this;
        }

        public Criteria andAdressShortIsNull() {
            addCriterion("adress_short is null");
            return (Criteria) this;
        }

        public Criteria andAdressShortIsNotNull() {
            addCriterion("adress_short is not null");
            return (Criteria) this;
        }

        public Criteria andAdressShortEqualTo(String value) {
            addCriterion("adress_short =", value, "adressShort");
            return (Criteria) this;
        }

        public Criteria andAdressShortNotEqualTo(String value) {
            addCriterion("adress_short <>", value, "adressShort");
            return (Criteria) this;
        }

        public Criteria andAdressShortGreaterThan(String value) {
            addCriterion("adress_short >", value, "adressShort");
            return (Criteria) this;
        }

        public Criteria andAdressShortGreaterThanOrEqualTo(String value) {
            addCriterion("adress_short >=", value, "adressShort");
            return (Criteria) this;
        }

        public Criteria andAdressShortLessThan(String value) {
            addCriterion("adress_short <", value, "adressShort");
            return (Criteria) this;
        }

        public Criteria andAdressShortLessThanOrEqualTo(String value) {
            addCriterion("adress_short <=", value, "adressShort");
            return (Criteria) this;
        }

        public Criteria andAdressShortLike(String value) {
            addCriterion("adress_short like", value, "adressShort");
            return (Criteria) this;
        }

        public Criteria andAdressShortNotLike(String value) {
            addCriterion("adress_short not like", value, "adressShort");
            return (Criteria) this;
        }

        public Criteria andAdressShortIn(List<String> values) {
            addCriterion("adress_short in", values, "adressShort");
            return (Criteria) this;
        }

        public Criteria andAdressShortNotIn(List<String> values) {
            addCriterion("adress_short not in", values, "adressShort");
            return (Criteria) this;
        }

        public Criteria andAdressShortBetween(String value1, String value2) {
            addCriterion("adress_short between", value1, value2, "adressShort");
            return (Criteria) this;
        }

        public Criteria andAdressShortNotBetween(String value1, String value2) {
            addCriterion("adress_short not between", value1, value2, "adressShort");
            return (Criteria) this;
        }
    }

    /**
     * nation_region
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * nation_region 2018-04-23
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