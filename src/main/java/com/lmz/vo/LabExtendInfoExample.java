package com.lmz.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LabExtendInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LabExtendInfoExample() {
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

        public Criteria andLabExtendNameIsNull() {
            addCriterion("lab_extend_name is null");
            return (Criteria) this;
        }

        public Criteria andLabExtendNameIsNotNull() {
            addCriterion("lab_extend_name is not null");
            return (Criteria) this;
        }

        public Criteria andLabExtendNameEqualTo(String value) {
            addCriterion("lab_extend_name =", value, "labExtendName");
            return (Criteria) this;
        }

        public Criteria andLabExtendNameNotEqualTo(String value) {
            addCriterion("lab_extend_name <>", value, "labExtendName");
            return (Criteria) this;
        }

        public Criteria andLabExtendNameGreaterThan(String value) {
            addCriterion("lab_extend_name >", value, "labExtendName");
            return (Criteria) this;
        }

        public Criteria andLabExtendNameGreaterThanOrEqualTo(String value) {
            addCriterion("lab_extend_name >=", value, "labExtendName");
            return (Criteria) this;
        }

        public Criteria andLabExtendNameLessThan(String value) {
            addCriterion("lab_extend_name <", value, "labExtendName");
            return (Criteria) this;
        }

        public Criteria andLabExtendNameLessThanOrEqualTo(String value) {
            addCriterion("lab_extend_name <=", value, "labExtendName");
            return (Criteria) this;
        }

        public Criteria andLabExtendNameLike(String value) {
            addCriterion("lab_extend_name like", value, "labExtendName");
            return (Criteria) this;
        }

        public Criteria andLabExtendNameNotLike(String value) {
            addCriterion("lab_extend_name not like", value, "labExtendName");
            return (Criteria) this;
        }

        public Criteria andLabExtendNameIn(List<String> values) {
            addCriterion("lab_extend_name in", values, "labExtendName");
            return (Criteria) this;
        }

        public Criteria andLabExtendNameNotIn(List<String> values) {
            addCriterion("lab_extend_name not in", values, "labExtendName");
            return (Criteria) this;
        }

        public Criteria andLabExtendNameBetween(String value1, String value2) {
            addCriterion("lab_extend_name between", value1, value2, "labExtendName");
            return (Criteria) this;
        }

        public Criteria andLabExtendNameNotBetween(String value1, String value2) {
            addCriterion("lab_extend_name not between", value1, value2, "labExtendName");
            return (Criteria) this;
        }

        public Criteria andLabExtendTeacherIsNull() {
            addCriterion("lab_extend_teacher is null");
            return (Criteria) this;
        }

        public Criteria andLabExtendTeacherIsNotNull() {
            addCriterion("lab_extend_teacher is not null");
            return (Criteria) this;
        }

        public Criteria andLabExtendTeacherEqualTo(String value) {
            addCriterion("lab_extend_teacher =", value, "labExtendTeacher");
            return (Criteria) this;
        }

        public Criteria andLabExtendTeacherNotEqualTo(String value) {
            addCriterion("lab_extend_teacher <>", value, "labExtendTeacher");
            return (Criteria) this;
        }

        public Criteria andLabExtendTeacherGreaterThan(String value) {
            addCriterion("lab_extend_teacher >", value, "labExtendTeacher");
            return (Criteria) this;
        }

        public Criteria andLabExtendTeacherGreaterThanOrEqualTo(String value) {
            addCriterion("lab_extend_teacher >=", value, "labExtendTeacher");
            return (Criteria) this;
        }

        public Criteria andLabExtendTeacherLessThan(String value) {
            addCriterion("lab_extend_teacher <", value, "labExtendTeacher");
            return (Criteria) this;
        }

        public Criteria andLabExtendTeacherLessThanOrEqualTo(String value) {
            addCriterion("lab_extend_teacher <=", value, "labExtendTeacher");
            return (Criteria) this;
        }

        public Criteria andLabExtendTeacherLike(String value) {
            addCriterion("lab_extend_teacher like", value, "labExtendTeacher");
            return (Criteria) this;
        }

        public Criteria andLabExtendTeacherNotLike(String value) {
            addCriterion("lab_extend_teacher not like", value, "labExtendTeacher");
            return (Criteria) this;
        }

        public Criteria andLabExtendTeacherIn(List<String> values) {
            addCriterion("lab_extend_teacher in", values, "labExtendTeacher");
            return (Criteria) this;
        }

        public Criteria andLabExtendTeacherNotIn(List<String> values) {
            addCriterion("lab_extend_teacher not in", values, "labExtendTeacher");
            return (Criteria) this;
        }

        public Criteria andLabExtendTeacherBetween(String value1, String value2) {
            addCriterion("lab_extend_teacher between", value1, value2, "labExtendTeacher");
            return (Criteria) this;
        }

        public Criteria andLabExtendTeacherNotBetween(String value1, String value2) {
            addCriterion("lab_extend_teacher not between", value1, value2, "labExtendTeacher");
            return (Criteria) this;
        }

        public Criteria andLabExtendStartTimeIsNull() {
            addCriterion("lab_extend_start_time is null");
            return (Criteria) this;
        }

        public Criteria andLabExtendStartTimeIsNotNull() {
            addCriterion("lab_extend_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andLabExtendStartTimeEqualTo(Date value) {
            addCriterion("lab_extend_start_time =", value, "labExtendStartTime");
            return (Criteria) this;
        }

        public Criteria andLabExtendStartTimeNotEqualTo(Date value) {
            addCriterion("lab_extend_start_time <>", value, "labExtendStartTime");
            return (Criteria) this;
        }

        public Criteria andLabExtendStartTimeGreaterThan(Date value) {
            addCriterion("lab_extend_start_time >", value, "labExtendStartTime");
            return (Criteria) this;
        }

        public Criteria andLabExtendStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lab_extend_start_time >=", value, "labExtendStartTime");
            return (Criteria) this;
        }

        public Criteria andLabExtendStartTimeLessThan(Date value) {
            addCriterion("lab_extend_start_time <", value, "labExtendStartTime");
            return (Criteria) this;
        }

        public Criteria andLabExtendStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("lab_extend_start_time <=", value, "labExtendStartTime");
            return (Criteria) this;
        }

        public Criteria andLabExtendStartTimeIn(List<Date> values) {
            addCriterion("lab_extend_start_time in", values, "labExtendStartTime");
            return (Criteria) this;
        }

        public Criteria andLabExtendStartTimeNotIn(List<Date> values) {
            addCriterion("lab_extend_start_time not in", values, "labExtendStartTime");
            return (Criteria) this;
        }

        public Criteria andLabExtendStartTimeBetween(Date value1, Date value2) {
            addCriterion("lab_extend_start_time between", value1, value2, "labExtendStartTime");
            return (Criteria) this;
        }

        public Criteria andLabExtendStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("lab_extend_start_time not between", value1, value2, "labExtendStartTime");
            return (Criteria) this;
        }

        public Criteria andLabExtendEndTimeIsNull() {
            addCriterion("lab_extend_end_time is null");
            return (Criteria) this;
        }

        public Criteria andLabExtendEndTimeIsNotNull() {
            addCriterion("lab_extend_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andLabExtendEndTimeEqualTo(Date value) {
            addCriterion("lab_extend_end_time =", value, "labExtendEndTime");
            return (Criteria) this;
        }

        public Criteria andLabExtendEndTimeNotEqualTo(Date value) {
            addCriterion("lab_extend_end_time <>", value, "labExtendEndTime");
            return (Criteria) this;
        }

        public Criteria andLabExtendEndTimeGreaterThan(Date value) {
            addCriterion("lab_extend_end_time >", value, "labExtendEndTime");
            return (Criteria) this;
        }

        public Criteria andLabExtendEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lab_extend_end_time >=", value, "labExtendEndTime");
            return (Criteria) this;
        }

        public Criteria andLabExtendEndTimeLessThan(Date value) {
            addCriterion("lab_extend_end_time <", value, "labExtendEndTime");
            return (Criteria) this;
        }

        public Criteria andLabExtendEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("lab_extend_end_time <=", value, "labExtendEndTime");
            return (Criteria) this;
        }

        public Criteria andLabExtendEndTimeIn(List<Date> values) {
            addCriterion("lab_extend_end_time in", values, "labExtendEndTime");
            return (Criteria) this;
        }

        public Criteria andLabExtendEndTimeNotIn(List<Date> values) {
            addCriterion("lab_extend_end_time not in", values, "labExtendEndTime");
            return (Criteria) this;
        }

        public Criteria andLabExtendEndTimeBetween(Date value1, Date value2) {
            addCriterion("lab_extend_end_time between", value1, value2, "labExtendEndTime");
            return (Criteria) this;
        }

        public Criteria andLabExtendEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("lab_extend_end_time not between", value1, value2, "labExtendEndTime");
            return (Criteria) this;
        }

        public Criteria andLabExtendPeriodTimeIsNull() {
            addCriterion("lab_extend_period_time is null");
            return (Criteria) this;
        }

        public Criteria andLabExtendPeriodTimeIsNotNull() {
            addCriterion("lab_extend_period_time is not null");
            return (Criteria) this;
        }

        public Criteria andLabExtendPeriodTimeEqualTo(Integer value) {
            addCriterion("lab_extend_period_time =", value, "labExtendPeriodTime");
            return (Criteria) this;
        }

        public Criteria andLabExtendPeriodTimeNotEqualTo(Integer value) {
            addCriterion("lab_extend_period_time <>", value, "labExtendPeriodTime");
            return (Criteria) this;
        }

        public Criteria andLabExtendPeriodTimeGreaterThan(Integer value) {
            addCriterion("lab_extend_period_time >", value, "labExtendPeriodTime");
            return (Criteria) this;
        }

        public Criteria andLabExtendPeriodTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("lab_extend_period_time >=", value, "labExtendPeriodTime");
            return (Criteria) this;
        }

        public Criteria andLabExtendPeriodTimeLessThan(Integer value) {
            addCriterion("lab_extend_period_time <", value, "labExtendPeriodTime");
            return (Criteria) this;
        }

        public Criteria andLabExtendPeriodTimeLessThanOrEqualTo(Integer value) {
            addCriterion("lab_extend_period_time <=", value, "labExtendPeriodTime");
            return (Criteria) this;
        }

        public Criteria andLabExtendPeriodTimeIn(List<Integer> values) {
            addCriterion("lab_extend_period_time in", values, "labExtendPeriodTime");
            return (Criteria) this;
        }

        public Criteria andLabExtendPeriodTimeNotIn(List<Integer> values) {
            addCriterion("lab_extend_period_time not in", values, "labExtendPeriodTime");
            return (Criteria) this;
        }

        public Criteria andLabExtendPeriodTimeBetween(Integer value1, Integer value2) {
            addCriterion("lab_extend_period_time between", value1, value2, "labExtendPeriodTime");
            return (Criteria) this;
        }

        public Criteria andLabExtendPeriodTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("lab_extend_period_time not between", value1, value2, "labExtendPeriodTime");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedIsNull() {
            addCriterion("gmt_created is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedIsNotNull() {
            addCriterion("gmt_created is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedEqualTo(Date value) {
            addCriterion("gmt_created =", value, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedNotEqualTo(Date value) {
            addCriterion("gmt_created <>", value, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedGreaterThan(Date value) {
            addCriterion("gmt_created >", value, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_created >=", value, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedLessThan(Date value) {
            addCriterion("gmt_created <", value, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_created <=", value, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedIn(List<Date> values) {
            addCriterion("gmt_created in", values, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedNotIn(List<Date> values) {
            addCriterion("gmt_created not in", values, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedBetween(Date value1, Date value2) {
            addCriterion("gmt_created between", value1, value2, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_created not between", value1, value2, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andLabExtendAmountIsNull() {
            addCriterion("lab_extend_amount is null");
            return (Criteria) this;
        }

        public Criteria andLabExtendAmountIsNotNull() {
            addCriterion("lab_extend_amount is not null");
            return (Criteria) this;
        }

        public Criteria andLabExtendAmountEqualTo(Integer value) {
            addCriterion("lab_extend_amount =", value, "labExtendAmount");
            return (Criteria) this;
        }

        public Criteria andLabExtendAmountNotEqualTo(Integer value) {
            addCriterion("lab_extend_amount <>", value, "labExtendAmount");
            return (Criteria) this;
        }

        public Criteria andLabExtendAmountGreaterThan(Integer value) {
            addCriterion("lab_extend_amount >", value, "labExtendAmount");
            return (Criteria) this;
        }

        public Criteria andLabExtendAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("lab_extend_amount >=", value, "labExtendAmount");
            return (Criteria) this;
        }

        public Criteria andLabExtendAmountLessThan(Integer value) {
            addCriterion("lab_extend_amount <", value, "labExtendAmount");
            return (Criteria) this;
        }

        public Criteria andLabExtendAmountLessThanOrEqualTo(Integer value) {
            addCriterion("lab_extend_amount <=", value, "labExtendAmount");
            return (Criteria) this;
        }

        public Criteria andLabExtendAmountIn(List<Integer> values) {
            addCriterion("lab_extend_amount in", values, "labExtendAmount");
            return (Criteria) this;
        }

        public Criteria andLabExtendAmountNotIn(List<Integer> values) {
            addCriterion("lab_extend_amount not in", values, "labExtendAmount");
            return (Criteria) this;
        }

        public Criteria andLabExtendAmountBetween(Integer value1, Integer value2) {
            addCriterion("lab_extend_amount between", value1, value2, "labExtendAmount");
            return (Criteria) this;
        }

        public Criteria andLabExtendAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("lab_extend_amount not between", value1, value2, "labExtendAmount");
            return (Criteria) this;
        }

        public Criteria andLabExtendCurrentIsNull() {
            addCriterion("lab_extend_current is null");
            return (Criteria) this;
        }

        public Criteria andLabExtendCurrentIsNotNull() {
            addCriterion("lab_extend_current is not null");
            return (Criteria) this;
        }

        public Criteria andLabExtendCurrentEqualTo(Integer value) {
            addCriterion("lab_extend_current =", value, "labExtendCurrent");
            return (Criteria) this;
        }

        public Criteria andLabExtendCurrentNotEqualTo(Integer value) {
            addCriterion("lab_extend_current <>", value, "labExtendCurrent");
            return (Criteria) this;
        }

        public Criteria andLabExtendCurrentGreaterThan(Integer value) {
            addCriterion("lab_extend_current >", value, "labExtendCurrent");
            return (Criteria) this;
        }

        public Criteria andLabExtendCurrentGreaterThanOrEqualTo(Integer value) {
            addCriterion("lab_extend_current >=", value, "labExtendCurrent");
            return (Criteria) this;
        }

        public Criteria andLabExtendCurrentLessThan(Integer value) {
            addCriterion("lab_extend_current <", value, "labExtendCurrent");
            return (Criteria) this;
        }

        public Criteria andLabExtendCurrentLessThanOrEqualTo(Integer value) {
            addCriterion("lab_extend_current <=", value, "labExtendCurrent");
            return (Criteria) this;
        }

        public Criteria andLabExtendCurrentIn(List<Integer> values) {
            addCriterion("lab_extend_current in", values, "labExtendCurrent");
            return (Criteria) this;
        }

        public Criteria andLabExtendCurrentNotIn(List<Integer> values) {
            addCriterion("lab_extend_current not in", values, "labExtendCurrent");
            return (Criteria) this;
        }

        public Criteria andLabExtendCurrentBetween(Integer value1, Integer value2) {
            addCriterion("lab_extend_current between", value1, value2, "labExtendCurrent");
            return (Criteria) this;
        }

        public Criteria andLabExtendCurrentNotBetween(Integer value1, Integer value2) {
            addCriterion("lab_extend_current not between", value1, value2, "labExtendCurrent");
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