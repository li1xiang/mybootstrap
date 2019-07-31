package com.china.mybootstrap.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsrExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsrExample() {
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

        public Criteria andUsrIdIsNull() {
            addCriterion("usr_id is null");
            return (Criteria) this;
        }

        public Criteria andUsrIdIsNotNull() {
            addCriterion("usr_id is not null");
            return (Criteria) this;
        }

        public Criteria andUsrIdEqualTo(Integer value) {
            addCriterion("usr_id =", value, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdNotEqualTo(Integer value) {
            addCriterion("usr_id <>", value, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdGreaterThan(Integer value) {
            addCriterion("usr_id >", value, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("usr_id >=", value, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdLessThan(Integer value) {
            addCriterion("usr_id <", value, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdLessThanOrEqualTo(Integer value) {
            addCriterion("usr_id <=", value, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdIn(List<Integer> values) {
            addCriterion("usr_id in", values, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdNotIn(List<Integer> values) {
            addCriterion("usr_id not in", values, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdBetween(Integer value1, Integer value2) {
            addCriterion("usr_id between", value1, value2, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("usr_id not between", value1, value2, "usrId");
            return (Criteria) this;
        }

        public Criteria andLgnIdSdscIsNull() {
            addCriterion("lgn_id_sdsc is null");
            return (Criteria) this;
        }

        public Criteria andLgnIdSdscIsNotNull() {
            addCriterion("lgn_id_sdsc is not null");
            return (Criteria) this;
        }

        public Criteria andLgnIdSdscEqualTo(String value) {
            addCriterion("lgn_id_sdsc =", value, "lgnIdSdsc");
            return (Criteria) this;
        }

        public Criteria andLgnIdSdscNotEqualTo(String value) {
            addCriterion("lgn_id_sdsc <>", value, "lgnIdSdsc");
            return (Criteria) this;
        }

        public Criteria andLgnIdSdscGreaterThan(String value) {
            addCriterion("lgn_id_sdsc >", value, "lgnIdSdsc");
            return (Criteria) this;
        }

        public Criteria andLgnIdSdscGreaterThanOrEqualTo(String value) {
            addCriterion("lgn_id_sdsc >=", value, "lgnIdSdsc");
            return (Criteria) this;
        }

        public Criteria andLgnIdSdscLessThan(String value) {
            addCriterion("lgn_id_sdsc <", value, "lgnIdSdsc");
            return (Criteria) this;
        }

        public Criteria andLgnIdSdscLessThanOrEqualTo(String value) {
            addCriterion("lgn_id_sdsc <=", value, "lgnIdSdsc");
            return (Criteria) this;
        }

        public Criteria andLgnIdSdscLike(String value) {
            addCriterion("lgn_id_sdsc like", value, "lgnIdSdsc");
            return (Criteria) this;
        }

        public Criteria andLgnIdSdscNotLike(String value) {
            addCriterion("lgn_id_sdsc not like", value, "lgnIdSdsc");
            return (Criteria) this;
        }

        public Criteria andLgnIdSdscIn(List<String> values) {
            addCriterion("lgn_id_sdsc in", values, "lgnIdSdsc");
            return (Criteria) this;
        }

        public Criteria andLgnIdSdscNotIn(List<String> values) {
            addCriterion("lgn_id_sdsc not in", values, "lgnIdSdsc");
            return (Criteria) this;
        }

        public Criteria andLgnIdSdscBetween(String value1, String value2) {
            addCriterion("lgn_id_sdsc between", value1, value2, "lgnIdSdsc");
            return (Criteria) this;
        }

        public Criteria andLgnIdSdscNotBetween(String value1, String value2) {
            addCriterion("lgn_id_sdsc not between", value1, value2, "lgnIdSdsc");
            return (Criteria) this;
        }

        public Criteria andUsrTpEnumIsNull() {
            addCriterion("usr_tp_enum is null");
            return (Criteria) this;
        }

        public Criteria andUsrTpEnumIsNotNull() {
            addCriterion("usr_tp_enum is not null");
            return (Criteria) this;
        }

        public Criteria andUsrTpEnumEqualTo(String value) {
            addCriterion("usr_tp_enum =", value, "usrTpEnum");
            return (Criteria) this;
        }

        public Criteria andUsrTpEnumNotEqualTo(String value) {
            addCriterion("usr_tp_enum <>", value, "usrTpEnum");
            return (Criteria) this;
        }

        public Criteria andUsrTpEnumGreaterThan(String value) {
            addCriterion("usr_tp_enum >", value, "usrTpEnum");
            return (Criteria) this;
        }

        public Criteria andUsrTpEnumGreaterThanOrEqualTo(String value) {
            addCriterion("usr_tp_enum >=", value, "usrTpEnum");
            return (Criteria) this;
        }

        public Criteria andUsrTpEnumLessThan(String value) {
            addCriterion("usr_tp_enum <", value, "usrTpEnum");
            return (Criteria) this;
        }

        public Criteria andUsrTpEnumLessThanOrEqualTo(String value) {
            addCriterion("usr_tp_enum <=", value, "usrTpEnum");
            return (Criteria) this;
        }

        public Criteria andUsrTpEnumLike(String value) {
            addCriterion("usr_tp_enum like", value, "usrTpEnum");
            return (Criteria) this;
        }

        public Criteria andUsrTpEnumNotLike(String value) {
            addCriterion("usr_tp_enum not like", value, "usrTpEnum");
            return (Criteria) this;
        }

        public Criteria andUsrTpEnumIn(List<String> values) {
            addCriterion("usr_tp_enum in", values, "usrTpEnum");
            return (Criteria) this;
        }

        public Criteria andUsrTpEnumNotIn(List<String> values) {
            addCriterion("usr_tp_enum not in", values, "usrTpEnum");
            return (Criteria) this;
        }

        public Criteria andUsrTpEnumBetween(String value1, String value2) {
            addCriterion("usr_tp_enum between", value1, value2, "usrTpEnum");
            return (Criteria) this;
        }

        public Criteria andUsrTpEnumNotBetween(String value1, String value2) {
            addCriterion("usr_tp_enum not between", value1, value2, "usrTpEnum");
            return (Criteria) this;
        }

        public Criteria andUsrStEnumIsNull() {
            addCriterion("usr_st_enum is null");
            return (Criteria) this;
        }

        public Criteria andUsrStEnumIsNotNull() {
            addCriterion("usr_st_enum is not null");
            return (Criteria) this;
        }

        public Criteria andUsrStEnumEqualTo(String value) {
            addCriterion("usr_st_enum =", value, "usrStEnum");
            return (Criteria) this;
        }

        public Criteria andUsrStEnumNotEqualTo(String value) {
            addCriterion("usr_st_enum <>", value, "usrStEnum");
            return (Criteria) this;
        }

        public Criteria andUsrStEnumGreaterThan(String value) {
            addCriterion("usr_st_enum >", value, "usrStEnum");
            return (Criteria) this;
        }

        public Criteria andUsrStEnumGreaterThanOrEqualTo(String value) {
            addCriterion("usr_st_enum >=", value, "usrStEnum");
            return (Criteria) this;
        }

        public Criteria andUsrStEnumLessThan(String value) {
            addCriterion("usr_st_enum <", value, "usrStEnum");
            return (Criteria) this;
        }

        public Criteria andUsrStEnumLessThanOrEqualTo(String value) {
            addCriterion("usr_st_enum <=", value, "usrStEnum");
            return (Criteria) this;
        }

        public Criteria andUsrStEnumLike(String value) {
            addCriterion("usr_st_enum like", value, "usrStEnum");
            return (Criteria) this;
        }

        public Criteria andUsrStEnumNotLike(String value) {
            addCriterion("usr_st_enum not like", value, "usrStEnum");
            return (Criteria) this;
        }

        public Criteria andUsrStEnumIn(List<String> values) {
            addCriterion("usr_st_enum in", values, "usrStEnum");
            return (Criteria) this;
        }

        public Criteria andUsrStEnumNotIn(List<String> values) {
            addCriterion("usr_st_enum not in", values, "usrStEnum");
            return (Criteria) this;
        }

        public Criteria andUsrStEnumBetween(String value1, String value2) {
            addCriterion("usr_st_enum between", value1, value2, "usrStEnum");
            return (Criteria) this;
        }

        public Criteria andUsrStEnumNotBetween(String value1, String value2) {
            addCriterion("usr_st_enum not between", value1, value2, "usrStEnum");
            return (Criteria) this;
        }

        public Criteria andPswdDescIsNull() {
            addCriterion("pswd_desc is null");
            return (Criteria) this;
        }

        public Criteria andPswdDescIsNotNull() {
            addCriterion("pswd_desc is not null");
            return (Criteria) this;
        }

        public Criteria andPswdDescEqualTo(String value) {
            addCriterion("pswd_desc =", value, "pswdDesc");
            return (Criteria) this;
        }

        public Criteria andPswdDescNotEqualTo(String value) {
            addCriterion("pswd_desc <>", value, "pswdDesc");
            return (Criteria) this;
        }

        public Criteria andPswdDescGreaterThan(String value) {
            addCriterion("pswd_desc >", value, "pswdDesc");
            return (Criteria) this;
        }

        public Criteria andPswdDescGreaterThanOrEqualTo(String value) {
            addCriterion("pswd_desc >=", value, "pswdDesc");
            return (Criteria) this;
        }

        public Criteria andPswdDescLessThan(String value) {
            addCriterion("pswd_desc <", value, "pswdDesc");
            return (Criteria) this;
        }

        public Criteria andPswdDescLessThanOrEqualTo(String value) {
            addCriterion("pswd_desc <=", value, "pswdDesc");
            return (Criteria) this;
        }

        public Criteria andPswdDescLike(String value) {
            addCriterion("pswd_desc like", value, "pswdDesc");
            return (Criteria) this;
        }

        public Criteria andPswdDescNotLike(String value) {
            addCriterion("pswd_desc not like", value, "pswdDesc");
            return (Criteria) this;
        }

        public Criteria andPswdDescIn(List<String> values) {
            addCriterion("pswd_desc in", values, "pswdDesc");
            return (Criteria) this;
        }

        public Criteria andPswdDescNotIn(List<String> values) {
            addCriterion("pswd_desc not in", values, "pswdDesc");
            return (Criteria) this;
        }

        public Criteria andPswdDescBetween(String value1, String value2) {
            addCriterion("pswd_desc between", value1, value2, "pswdDesc");
            return (Criteria) this;
        }

        public Criteria andPswdDescNotBetween(String value1, String value2) {
            addCriterion("pswd_desc not between", value1, value2, "pswdDesc");
            return (Criteria) this;
        }

        public Criteria andCrtTmstIsNull() {
            addCriterion("crt_tmst is null");
            return (Criteria) this;
        }

        public Criteria andCrtTmstIsNotNull() {
            addCriterion("crt_tmst is not null");
            return (Criteria) this;
        }

        public Criteria andCrtTmstEqualTo(Date value) {
            addCriterion("crt_tmst =", value, "crtTmst");
            return (Criteria) this;
        }

        public Criteria andCrtTmstNotEqualTo(Date value) {
            addCriterion("crt_tmst <>", value, "crtTmst");
            return (Criteria) this;
        }

        public Criteria andCrtTmstGreaterThan(Date value) {
            addCriterion("crt_tmst >", value, "crtTmst");
            return (Criteria) this;
        }

        public Criteria andCrtTmstGreaterThanOrEqualTo(Date value) {
            addCriterion("crt_tmst >=", value, "crtTmst");
            return (Criteria) this;
        }

        public Criteria andCrtTmstLessThan(Date value) {
            addCriterion("crt_tmst <", value, "crtTmst");
            return (Criteria) this;
        }

        public Criteria andCrtTmstLessThanOrEqualTo(Date value) {
            addCriterion("crt_tmst <=", value, "crtTmst");
            return (Criteria) this;
        }

        public Criteria andCrtTmstIn(List<Date> values) {
            addCriterion("crt_tmst in", values, "crtTmst");
            return (Criteria) this;
        }

        public Criteria andCrtTmstNotIn(List<Date> values) {
            addCriterion("crt_tmst not in", values, "crtTmst");
            return (Criteria) this;
        }

        public Criteria andCrtTmstBetween(Date value1, Date value2) {
            addCriterion("crt_tmst between", value1, value2, "crtTmst");
            return (Criteria) this;
        }

        public Criteria andCrtTmstNotBetween(Date value1, Date value2) {
            addCriterion("crt_tmst not between", value1, value2, "crtTmst");
            return (Criteria) this;
        }

        public Criteria andCrtUsrIdIsNull() {
            addCriterion("crt_usr_id is null");
            return (Criteria) this;
        }

        public Criteria andCrtUsrIdIsNotNull() {
            addCriterion("crt_usr_id is not null");
            return (Criteria) this;
        }

        public Criteria andCrtUsrIdEqualTo(Integer value) {
            addCriterion("crt_usr_id =", value, "crtUsrId");
            return (Criteria) this;
        }

        public Criteria andCrtUsrIdNotEqualTo(Integer value) {
            addCriterion("crt_usr_id <>", value, "crtUsrId");
            return (Criteria) this;
        }

        public Criteria andCrtUsrIdGreaterThan(Integer value) {
            addCriterion("crt_usr_id >", value, "crtUsrId");
            return (Criteria) this;
        }

        public Criteria andCrtUsrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("crt_usr_id >=", value, "crtUsrId");
            return (Criteria) this;
        }

        public Criteria andCrtUsrIdLessThan(Integer value) {
            addCriterion("crt_usr_id <", value, "crtUsrId");
            return (Criteria) this;
        }

        public Criteria andCrtUsrIdLessThanOrEqualTo(Integer value) {
            addCriterion("crt_usr_id <=", value, "crtUsrId");
            return (Criteria) this;
        }

        public Criteria andCrtUsrIdIn(List<Integer> values) {
            addCriterion("crt_usr_id in", values, "crtUsrId");
            return (Criteria) this;
        }

        public Criteria andCrtUsrIdNotIn(List<Integer> values) {
            addCriterion("crt_usr_id not in", values, "crtUsrId");
            return (Criteria) this;
        }

        public Criteria andCrtUsrIdBetween(Integer value1, Integer value2) {
            addCriterion("crt_usr_id between", value1, value2, "crtUsrId");
            return (Criteria) this;
        }

        public Criteria andCrtUsrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("crt_usr_id not between", value1, value2, "crtUsrId");
            return (Criteria) this;
        }

        public Criteria andUpdTmstIsNull() {
            addCriterion("upd_tmst is null");
            return (Criteria) this;
        }

        public Criteria andUpdTmstIsNotNull() {
            addCriterion("upd_tmst is not null");
            return (Criteria) this;
        }

        public Criteria andUpdTmstEqualTo(Date value) {
            addCriterion("upd_tmst =", value, "updTmst");
            return (Criteria) this;
        }

        public Criteria andUpdTmstNotEqualTo(Date value) {
            addCriterion("upd_tmst <>", value, "updTmst");
            return (Criteria) this;
        }

        public Criteria andUpdTmstGreaterThan(Date value) {
            addCriterion("upd_tmst >", value, "updTmst");
            return (Criteria) this;
        }

        public Criteria andUpdTmstGreaterThanOrEqualTo(Date value) {
            addCriterion("upd_tmst >=", value, "updTmst");
            return (Criteria) this;
        }

        public Criteria andUpdTmstLessThan(Date value) {
            addCriterion("upd_tmst <", value, "updTmst");
            return (Criteria) this;
        }

        public Criteria andUpdTmstLessThanOrEqualTo(Date value) {
            addCriterion("upd_tmst <=", value, "updTmst");
            return (Criteria) this;
        }

        public Criteria andUpdTmstIn(List<Date> values) {
            addCriterion("upd_tmst in", values, "updTmst");
            return (Criteria) this;
        }

        public Criteria andUpdTmstNotIn(List<Date> values) {
            addCriterion("upd_tmst not in", values, "updTmst");
            return (Criteria) this;
        }

        public Criteria andUpdTmstBetween(Date value1, Date value2) {
            addCriterion("upd_tmst between", value1, value2, "updTmst");
            return (Criteria) this;
        }

        public Criteria andUpdTmstNotBetween(Date value1, Date value2) {
            addCriterion("upd_tmst not between", value1, value2, "updTmst");
            return (Criteria) this;
        }

        public Criteria andUpdUsrIdIsNull() {
            addCriterion("upd_usr_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdUsrIdIsNotNull() {
            addCriterion("upd_usr_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdUsrIdEqualTo(Integer value) {
            addCriterion("upd_usr_id =", value, "updUsrId");
            return (Criteria) this;
        }

        public Criteria andUpdUsrIdNotEqualTo(Integer value) {
            addCriterion("upd_usr_id <>", value, "updUsrId");
            return (Criteria) this;
        }

        public Criteria andUpdUsrIdGreaterThan(Integer value) {
            addCriterion("upd_usr_id >", value, "updUsrId");
            return (Criteria) this;
        }

        public Criteria andUpdUsrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("upd_usr_id >=", value, "updUsrId");
            return (Criteria) this;
        }

        public Criteria andUpdUsrIdLessThan(Integer value) {
            addCriterion("upd_usr_id <", value, "updUsrId");
            return (Criteria) this;
        }

        public Criteria andUpdUsrIdLessThanOrEqualTo(Integer value) {
            addCriterion("upd_usr_id <=", value, "updUsrId");
            return (Criteria) this;
        }

        public Criteria andUpdUsrIdIn(List<Integer> values) {
            addCriterion("upd_usr_id in", values, "updUsrId");
            return (Criteria) this;
        }

        public Criteria andUpdUsrIdNotIn(List<Integer> values) {
            addCriterion("upd_usr_id not in", values, "updUsrId");
            return (Criteria) this;
        }

        public Criteria andUpdUsrIdBetween(Integer value1, Integer value2) {
            addCriterion("upd_usr_id between", value1, value2, "updUsrId");
            return (Criteria) this;
        }

        public Criteria andUpdUsrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("upd_usr_id not between", value1, value2, "updUsrId");
            return (Criteria) this;
        }

        public Criteria andTelSdscIsNull() {
            addCriterion("tel_sdsc is null");
            return (Criteria) this;
        }

        public Criteria andTelSdscIsNotNull() {
            addCriterion("tel_sdsc is not null");
            return (Criteria) this;
        }

        public Criteria andTelSdscEqualTo(String value) {
            addCriterion("tel_sdsc =", value, "telSdsc");
            return (Criteria) this;
        }

        public Criteria andTelSdscNotEqualTo(String value) {
            addCriterion("tel_sdsc <>", value, "telSdsc");
            return (Criteria) this;
        }

        public Criteria andTelSdscGreaterThan(String value) {
            addCriterion("tel_sdsc >", value, "telSdsc");
            return (Criteria) this;
        }

        public Criteria andTelSdscGreaterThanOrEqualTo(String value) {
            addCriterion("tel_sdsc >=", value, "telSdsc");
            return (Criteria) this;
        }

        public Criteria andTelSdscLessThan(String value) {
            addCriterion("tel_sdsc <", value, "telSdsc");
            return (Criteria) this;
        }

        public Criteria andTelSdscLessThanOrEqualTo(String value) {
            addCriterion("tel_sdsc <=", value, "telSdsc");
            return (Criteria) this;
        }

        public Criteria andTelSdscLike(String value) {
            addCriterion("tel_sdsc like", value, "telSdsc");
            return (Criteria) this;
        }

        public Criteria andTelSdscNotLike(String value) {
            addCriterion("tel_sdsc not like", value, "telSdsc");
            return (Criteria) this;
        }

        public Criteria andTelSdscIn(List<String> values) {
            addCriterion("tel_sdsc in", values, "telSdsc");
            return (Criteria) this;
        }

        public Criteria andTelSdscNotIn(List<String> values) {
            addCriterion("tel_sdsc not in", values, "telSdsc");
            return (Criteria) this;
        }

        public Criteria andTelSdscBetween(String value1, String value2) {
            addCriterion("tel_sdsc between", value1, value2, "telSdsc");
            return (Criteria) this;
        }

        public Criteria andTelSdscNotBetween(String value1, String value2) {
            addCriterion("tel_sdsc not between", value1, value2, "telSdsc");
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