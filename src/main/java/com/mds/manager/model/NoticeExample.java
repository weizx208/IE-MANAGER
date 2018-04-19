package com.mds.manager.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NoticeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_notice
     *
     * @mbggenerated Wed Aug 23 10:28:55 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_notice
     *
     * @mbggenerated Wed Aug 23 10:28:55 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_notice
     *
     * @mbggenerated Wed Aug 23 10:28:55 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_notice
     *
     * @mbggenerated Wed Aug 23 10:28:55 CST 2017
     */
    public NoticeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_notice
     *
     * @mbggenerated Wed Aug 23 10:28:55 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_notice
     *
     * @mbggenerated Wed Aug 23 10:28:55 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_notice
     *
     * @mbggenerated Wed Aug 23 10:28:55 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_notice
     *
     * @mbggenerated Wed Aug 23 10:28:55 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_notice
     *
     * @mbggenerated Wed Aug 23 10:28:55 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_notice
     *
     * @mbggenerated Wed Aug 23 10:28:55 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_notice
     *
     * @mbggenerated Wed Aug 23 10:28:55 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_notice
     *
     * @mbggenerated Wed Aug 23 10:28:55 CST 2017
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_notice
     *
     * @mbggenerated Wed Aug 23 10:28:55 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_notice
     *
     * @mbggenerated Wed Aug 23 10:28:55 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_notice
     *
     * @mbggenerated Wed Aug 23 10:28:55 CST 2017
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleIsNull() {
            addCriterion("notice_title is null");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleIsNotNull() {
            addCriterion("notice_title is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleEqualTo(String value) {
            addCriterion("notice_title =", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleNotEqualTo(String value) {
            addCriterion("notice_title <>", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleGreaterThan(String value) {
            addCriterion("notice_title >", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleGreaterThanOrEqualTo(String value) {
            addCriterion("notice_title >=", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleLessThan(String value) {
            addCriterion("notice_title <", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleLessThanOrEqualTo(String value) {
            addCriterion("notice_title <=", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleLike(String value) {
            addCriterion("notice_title like", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleNotLike(String value) {
            addCriterion("notice_title not like", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleIn(List<String> values) {
            addCriterion("notice_title in", values, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleNotIn(List<String> values) {
            addCriterion("notice_title not in", values, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleBetween(String value1, String value2) {
            addCriterion("notice_title between", value1, value2, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleNotBetween(String value1, String value2) {
            addCriterion("notice_title not between", value1, value2, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeContentIsNull() {
            addCriterion("notice_content is null");
            return (Criteria) this;
        }

        public Criteria andNoticeContentIsNotNull() {
            addCriterion("notice_content is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeContentEqualTo(String value) {
            addCriterion("notice_content =", value, "noticeContent");
            return (Criteria) this;
        }

        public Criteria andNoticeContentNotEqualTo(String value) {
            addCriterion("notice_content <>", value, "noticeContent");
            return (Criteria) this;
        }

        public Criteria andNoticeContentGreaterThan(String value) {
            addCriterion("notice_content >", value, "noticeContent");
            return (Criteria) this;
        }

        public Criteria andNoticeContentGreaterThanOrEqualTo(String value) {
            addCriterion("notice_content >=", value, "noticeContent");
            return (Criteria) this;
        }

        public Criteria andNoticeContentLessThan(String value) {
            addCriterion("notice_content <", value, "noticeContent");
            return (Criteria) this;
        }

        public Criteria andNoticeContentLessThanOrEqualTo(String value) {
            addCriterion("notice_content <=", value, "noticeContent");
            return (Criteria) this;
        }

        public Criteria andNoticeContentLike(String value) {
            addCriterion("notice_content like", value, "noticeContent");
            return (Criteria) this;
        }

        public Criteria andNoticeContentNotLike(String value) {
            addCriterion("notice_content not like", value, "noticeContent");
            return (Criteria) this;
        }

        public Criteria andNoticeContentIn(List<String> values) {
            addCriterion("notice_content in", values, "noticeContent");
            return (Criteria) this;
        }

        public Criteria andNoticeContentNotIn(List<String> values) {
            addCriterion("notice_content not in", values, "noticeContent");
            return (Criteria) this;
        }

        public Criteria andNoticeContentBetween(String value1, String value2) {
            addCriterion("notice_content between", value1, value2, "noticeContent");
            return (Criteria) this;
        }

        public Criteria andNoticeContentNotBetween(String value1, String value2) {
            addCriterion("notice_content not between", value1, value2, "noticeContent");
            return (Criteria) this;
        }

        public Criteria andNoticeFromIsNull() {
            addCriterion("notice_from is null");
            return (Criteria) this;
        }

        public Criteria andNoticeFromIsNotNull() {
            addCriterion("notice_from is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeFromEqualTo(String value) {
            addCriterion("notice_from =", value, "noticeFrom");
            return (Criteria) this;
        }

        public Criteria andNoticeFromNotEqualTo(String value) {
            addCriterion("notice_from <>", value, "noticeFrom");
            return (Criteria) this;
        }

        public Criteria andNoticeFromGreaterThan(String value) {
            addCriterion("notice_from >", value, "noticeFrom");
            return (Criteria) this;
        }

        public Criteria andNoticeFromGreaterThanOrEqualTo(String value) {
            addCriterion("notice_from >=", value, "noticeFrom");
            return (Criteria) this;
        }

        public Criteria andNoticeFromLessThan(String value) {
            addCriterion("notice_from <", value, "noticeFrom");
            return (Criteria) this;
        }

        public Criteria andNoticeFromLessThanOrEqualTo(String value) {
            addCriterion("notice_from <=", value, "noticeFrom");
            return (Criteria) this;
        }

        public Criteria andNoticeFromLike(String value) {
            addCriterion("notice_from like", value, "noticeFrom");
            return (Criteria) this;
        }

        public Criteria andNoticeFromNotLike(String value) {
            addCriterion("notice_from not like", value, "noticeFrom");
            return (Criteria) this;
        }

        public Criteria andNoticeFromIn(List<String> values) {
            addCriterion("notice_from in", values, "noticeFrom");
            return (Criteria) this;
        }

        public Criteria andNoticeFromNotIn(List<String> values) {
            addCriterion("notice_from not in", values, "noticeFrom");
            return (Criteria) this;
        }

        public Criteria andNoticeFromBetween(String value1, String value2) {
            addCriterion("notice_from between", value1, value2, "noticeFrom");
            return (Criteria) this;
        }

        public Criteria andNoticeFromNotBetween(String value1, String value2) {
            addCriterion("notice_from not between", value1, value2, "noticeFrom");
            return (Criteria) this;
        }

        public Criteria andNoticeToIsNull() {
            addCriterion("notice_to is null");
            return (Criteria) this;
        }

        public Criteria andNoticeToIsNotNull() {
            addCriterion("notice_to is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeToEqualTo(String value) {
            addCriterion("notice_to =", value, "noticeTo");
            return (Criteria) this;
        }

        public Criteria andNoticeToNotEqualTo(String value) {
            addCriterion("notice_to <>", value, "noticeTo");
            return (Criteria) this;
        }

        public Criteria andNoticeToGreaterThan(String value) {
            addCriterion("notice_to >", value, "noticeTo");
            return (Criteria) this;
        }

        public Criteria andNoticeToGreaterThanOrEqualTo(String value) {
            addCriterion("notice_to >=", value, "noticeTo");
            return (Criteria) this;
        }

        public Criteria andNoticeToLessThan(String value) {
            addCriterion("notice_to <", value, "noticeTo");
            return (Criteria) this;
        }

        public Criteria andNoticeToLessThanOrEqualTo(String value) {
            addCriterion("notice_to <=", value, "noticeTo");
            return (Criteria) this;
        }

        public Criteria andNoticeToLike(String value) {
            addCriterion("notice_to like", value, "noticeTo");
            return (Criteria) this;
        }

        public Criteria andNoticeToNotLike(String value) {
            addCriterion("notice_to not like", value, "noticeTo");
            return (Criteria) this;
        }

        public Criteria andNoticeToIn(List<String> values) {
            addCriterion("notice_to in", values, "noticeTo");
            return (Criteria) this;
        }

        public Criteria andNoticeToNotIn(List<String> values) {
            addCriterion("notice_to not in", values, "noticeTo");
            return (Criteria) this;
        }

        public Criteria andNoticeToBetween(String value1, String value2) {
            addCriterion("notice_to between", value1, value2, "noticeTo");
            return (Criteria) this;
        }

        public Criteria andNoticeToNotBetween(String value1, String value2) {
            addCriterion("notice_to not between", value1, value2, "noticeTo");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andNoiceScopeIsNull() {
            addCriterion("noice_scope is null");
            return (Criteria) this;
        }

        public Criteria andNoiceScopeIsNotNull() {
            addCriterion("noice_scope is not null");
            return (Criteria) this;
        }

        public Criteria andNoiceScopeEqualTo(Integer value) {
            addCriterion("noice_scope =", value, "noiceScope");
            return (Criteria) this;
        }

        public Criteria andNoiceScopeNotEqualTo(Integer value) {
            addCriterion("noice_scope <>", value, "noiceScope");
            return (Criteria) this;
        }

        public Criteria andNoiceScopeGreaterThan(Integer value) {
            addCriterion("noice_scope >", value, "noiceScope");
            return (Criteria) this;
        }

        public Criteria andNoiceScopeGreaterThanOrEqualTo(Integer value) {
            addCriterion("noice_scope >=", value, "noiceScope");
            return (Criteria) this;
        }

        public Criteria andNoiceScopeLessThan(Integer value) {
            addCriterion("noice_scope <", value, "noiceScope");
            return (Criteria) this;
        }

        public Criteria andNoiceScopeLessThanOrEqualTo(Integer value) {
            addCriterion("noice_scope <=", value, "noiceScope");
            return (Criteria) this;
        }

        public Criteria andNoiceScopeIn(List<Integer> values) {
            addCriterion("noice_scope in", values, "noiceScope");
            return (Criteria) this;
        }

        public Criteria andNoiceScopeNotIn(List<Integer> values) {
            addCriterion("noice_scope not in", values, "noiceScope");
            return (Criteria) this;
        }

        public Criteria andNoiceScopeBetween(Integer value1, Integer value2) {
            addCriterion("noice_scope between", value1, value2, "noiceScope");
            return (Criteria) this;
        }

        public Criteria andNoiceScopeNotBetween(Integer value1, Integer value2) {
            addCriterion("noice_scope not between", value1, value2, "noiceScope");
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

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("create_user like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("create_user not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_notice
     *
     * @mbggenerated do_not_delete_during_merge Wed Aug 23 10:28:55 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_notice
     *
     * @mbggenerated Wed Aug 23 10:28:55 CST 2017
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