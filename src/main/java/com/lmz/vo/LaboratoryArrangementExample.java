package com.lmz.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LaboratoryArrangementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LaboratoryArrangementExample() {
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

        public Criteria andLabIdIsNull() {
            addCriterion("lab_id is null");
            return (Criteria) this;
        }

        public Criteria andLabIdIsNotNull() {
            addCriterion("lab_id is not null");
            return (Criteria) this;
        }

        public Criteria andLabIdEqualTo(Integer value) {
            addCriterion("lab_id =", value, "labId");
            return (Criteria) this;
        }

        public Criteria andLabIdNotEqualTo(Integer value) {
            addCriterion("lab_id <>", value, "labId");
            return (Criteria) this;
        }

        public Criteria andLabIdGreaterThan(Integer value) {
            addCriterion("lab_id >", value, "labId");
            return (Criteria) this;
        }

        public Criteria andLabIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("lab_id >=", value, "labId");
            return (Criteria) this;
        }

        public Criteria andLabIdLessThan(Integer value) {
            addCriterion("lab_id <", value, "labId");
            return (Criteria) this;
        }

        public Criteria andLabIdLessThanOrEqualTo(Integer value) {
            addCriterion("lab_id <=", value, "labId");
            return (Criteria) this;
        }

        public Criteria andLabIdIn(List<Integer> values) {
            addCriterion("lab_id in", values, "labId");
            return (Criteria) this;
        }

        public Criteria andLabIdNotIn(List<Integer> values) {
            addCriterion("lab_id not in", values, "labId");
            return (Criteria) this;
        }

        public Criteria andLabIdBetween(Integer value1, Integer value2) {
            addCriterion("lab_id between", value1, value2, "labId");
            return (Criteria) this;
        }

        public Criteria andLabIdNotBetween(Integer value1, Integer value2) {
            addCriterion("lab_id not between", value1, value2, "labId");
            return (Criteria) this;
        }

        public Criteria andLabNameIsNull() {
            addCriterion("lab_name is null");
            return (Criteria) this;
        }

        public Criteria andLabNameIsNotNull() {
            addCriterion("lab_name is not null");
            return (Criteria) this;
        }

        public Criteria andLabNameEqualTo(String value) {
            addCriterion("lab_name =", value, "labName");
            return (Criteria) this;
        }

        public Criteria andLabNameNotEqualTo(String value) {
            addCriterion("lab_name <>", value, "labName");
            return (Criteria) this;
        }

        public Criteria andLabNameGreaterThan(String value) {
            addCriterion("lab_name >", value, "labName");
            return (Criteria) this;
        }

        public Criteria andLabNameGreaterThanOrEqualTo(String value) {
            addCriterion("lab_name >=", value, "labName");
            return (Criteria) this;
        }

        public Criteria andLabNameLessThan(String value) {
            addCriterion("lab_name <", value, "labName");
            return (Criteria) this;
        }

        public Criteria andLabNameLessThanOrEqualTo(String value) {
            addCriterion("lab_name <=", value, "labName");
            return (Criteria) this;
        }

        public Criteria andLabNameLike(String value) {
            addCriterion("lab_name like", value, "labName");
            return (Criteria) this;
        }

        public Criteria andLabNameNotLike(String value) {
            addCriterion("lab_name not like", value, "labName");
            return (Criteria) this;
        }

        public Criteria andLabNameIn(List<String> values) {
            addCriterion("lab_name in", values, "labName");
            return (Criteria) this;
        }

        public Criteria andLabNameNotIn(List<String> values) {
            addCriterion("lab_name not in", values, "labName");
            return (Criteria) this;
        }

        public Criteria andLabNameBetween(String value1, String value2) {
            addCriterion("lab_name between", value1, value2, "labName");
            return (Criteria) this;
        }

        public Criteria andLabNameNotBetween(String value1, String value2) {
            addCriterion("lab_name not between", value1, value2, "labName");
            return (Criteria) this;
        }

        public Criteria andLabTeacherIsNull() {
            addCriterion("lab_teacher is null");
            return (Criteria) this;
        }

        public Criteria andLabTeacherIsNotNull() {
            addCriterion("lab_teacher is not null");
            return (Criteria) this;
        }

        public Criteria andLabTeacherEqualTo(String value) {
            addCriterion("lab_teacher =", value, "labTeacher");
            return (Criteria) this;
        }

        public Criteria andLabTeacherNotEqualTo(String value) {
            addCriterion("lab_teacher <>", value, "labTeacher");
            return (Criteria) this;
        }

        public Criteria andLabTeacherGreaterThan(String value) {
            addCriterion("lab_teacher >", value, "labTeacher");
            return (Criteria) this;
        }

        public Criteria andLabTeacherGreaterThanOrEqualTo(String value) {
            addCriterion("lab_teacher >=", value, "labTeacher");
            return (Criteria) this;
        }

        public Criteria andLabTeacherLessThan(String value) {
            addCriterion("lab_teacher <", value, "labTeacher");
            return (Criteria) this;
        }

        public Criteria andLabTeacherLessThanOrEqualTo(String value) {
            addCriterion("lab_teacher <=", value, "labTeacher");
            return (Criteria) this;
        }

        public Criteria andLabTeacherLike(String value) {
            addCriterion("lab_teacher like", value, "labTeacher");
            return (Criteria) this;
        }

        public Criteria andLabTeacherNotLike(String value) {
            addCriterion("lab_teacher not like", value, "labTeacher");
            return (Criteria) this;
        }

        public Criteria andLabTeacherIn(List<String> values) {
            addCriterion("lab_teacher in", values, "labTeacher");
            return (Criteria) this;
        }

        public Criteria andLabTeacherNotIn(List<String> values) {
            addCriterion("lab_teacher not in", values, "labTeacher");
            return (Criteria) this;
        }

        public Criteria andLabTeacherBetween(String value1, String value2) {
            addCriterion("lab_teacher between", value1, value2, "labTeacher");
            return (Criteria) this;
        }

        public Criteria andLabTeacherNotBetween(String value1, String value2) {
            addCriterion("lab_teacher not between", value1, value2, "labTeacher");
            return (Criteria) this;
        }

        public Criteria andLabInstructionIsNull() {
            addCriterion("lab_instruction is null");
            return (Criteria) this;
        }

        public Criteria andLabInstructionIsNotNull() {
            addCriterion("lab_instruction is not null");
            return (Criteria) this;
        }

        public Criteria andLabInstructionEqualTo(String value) {
            addCriterion("lab_instruction =", value, "labInstruction");
            return (Criteria) this;
        }

        public Criteria andLabInstructionNotEqualTo(String value) {
            addCriterion("lab_instruction <>", value, "labInstruction");
            return (Criteria) this;
        }

        public Criteria andLabInstructionGreaterThan(String value) {
            addCriterion("lab_instruction >", value, "labInstruction");
            return (Criteria) this;
        }

        public Criteria andLabInstructionGreaterThanOrEqualTo(String value) {
            addCriterion("lab_instruction >=", value, "labInstruction");
            return (Criteria) this;
        }

        public Criteria andLabInstructionLessThan(String value) {
            addCriterion("lab_instruction <", value, "labInstruction");
            return (Criteria) this;
        }

        public Criteria andLabInstructionLessThanOrEqualTo(String value) {
            addCriterion("lab_instruction <=", value, "labInstruction");
            return (Criteria) this;
        }

        public Criteria andLabInstructionLike(String value) {
            addCriterion("lab_instruction like", value, "labInstruction");
            return (Criteria) this;
        }

        public Criteria andLabInstructionNotLike(String value) {
            addCriterion("lab_instruction not like", value, "labInstruction");
            return (Criteria) this;
        }

        public Criteria andLabInstructionIn(List<String> values) {
            addCriterion("lab_instruction in", values, "labInstruction");
            return (Criteria) this;
        }

        public Criteria andLabInstructionNotIn(List<String> values) {
            addCriterion("lab_instruction not in", values, "labInstruction");
            return (Criteria) this;
        }

        public Criteria andLabInstructionBetween(String value1, String value2) {
            addCriterion("lab_instruction between", value1, value2, "labInstruction");
            return (Criteria) this;
        }

        public Criteria andLabInstructionNotBetween(String value1, String value2) {
            addCriterion("lab_instruction not between", value1, value2, "labInstruction");
            return (Criteria) this;
        }

        public Criteria andLabStartTimeIsNull() {
            addCriterion("lab_start_time is null");
            return (Criteria) this;
        }

        public Criteria andLabStartTimeIsNotNull() {
            addCriterion("lab_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andLabStartTimeEqualTo(Date value) {
            addCriterion("lab_start_time =", value, "labStartTime");
            return (Criteria) this;
        }

        public Criteria andLabStartTimeNotEqualTo(Date value) {
            addCriterion("lab_start_time <>", value, "labStartTime");
            return (Criteria) this;
        }

        public Criteria andLabStartTimeGreaterThan(Date value) {
            addCriterion("lab_start_time >", value, "labStartTime");
            return (Criteria) this;
        }

        public Criteria andLabStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lab_start_time >=", value, "labStartTime");
            return (Criteria) this;
        }

        public Criteria andLabStartTimeLessThan(Date value) {
            addCriterion("lab_start_time <", value, "labStartTime");
            return (Criteria) this;
        }

        public Criteria andLabStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("lab_start_time <=", value, "labStartTime");
            return (Criteria) this;
        }

        public Criteria andLabStartTimeIn(List<Date> values) {
            addCriterion("lab_start_time in", values, "labStartTime");
            return (Criteria) this;
        }

        public Criteria andLabStartTimeNotIn(List<Date> values) {
            addCriterion("lab_start_time not in", values, "labStartTime");
            return (Criteria) this;
        }

        public Criteria andLabStartTimeBetween(Date value1, Date value2) {
            addCriterion("lab_start_time between", value1, value2, "labStartTime");
            return (Criteria) this;
        }

        public Criteria andLabStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("lab_start_time not between", value1, value2, "labStartTime");
            return (Criteria) this;
        }

        public Criteria andLabEndTimeIsNull() {
            addCriterion("lab_end_time is null");
            return (Criteria) this;
        }

        public Criteria andLabEndTimeIsNotNull() {
            addCriterion("lab_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andLabEndTimeEqualTo(Date value) {
            addCriterion("lab_end_time =", value, "labEndTime");
            return (Criteria) this;
        }

        public Criteria andLabEndTimeNotEqualTo(Date value) {
            addCriterion("lab_end_time <>", value, "labEndTime");
            return (Criteria) this;
        }

        public Criteria andLabEndTimeGreaterThan(Date value) {
            addCriterion("lab_end_time >", value, "labEndTime");
            return (Criteria) this;
        }

        public Criteria andLabEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lab_end_time >=", value, "labEndTime");
            return (Criteria) this;
        }

        public Criteria andLabEndTimeLessThan(Date value) {
            addCriterion("lab_end_time <", value, "labEndTime");
            return (Criteria) this;
        }

        public Criteria andLabEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("lab_end_time <=", value, "labEndTime");
            return (Criteria) this;
        }

        public Criteria andLabEndTimeIn(List<Date> values) {
            addCriterion("lab_end_time in", values, "labEndTime");
            return (Criteria) this;
        }

        public Criteria andLabEndTimeNotIn(List<Date> values) {
            addCriterion("lab_end_time not in", values, "labEndTime");
            return (Criteria) this;
        }

        public Criteria andLabEndTimeBetween(Date value1, Date value2) {
            addCriterion("lab_end_time between", value1, value2, "labEndTime");
            return (Criteria) this;
        }

        public Criteria andLabEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("lab_end_time not between", value1, value2, "labEndTime");
            return (Criteria) this;
        }

        public Criteria andLabPersonAmountIsNull() {
            addCriterion("lab_person_amount is null");
            return (Criteria) this;
        }

        public Criteria andLabPersonAmountIsNotNull() {
            addCriterion("lab_person_amount is not null");
            return (Criteria) this;
        }

        public Criteria andLabPersonAmountEqualTo(Integer value) {
            addCriterion("lab_person_amount =", value, "labPersonAmount");
            return (Criteria) this;
        }

        public Criteria andLabPersonAmountNotEqualTo(Integer value) {
            addCriterion("lab_person_amount <>", value, "labPersonAmount");
            return (Criteria) this;
        }

        public Criteria andLabPersonAmountGreaterThan(Integer value) {
            addCriterion("lab_person_amount >", value, "labPersonAmount");
            return (Criteria) this;
        }

        public Criteria andLabPersonAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("lab_person_amount >=", value, "labPersonAmount");
            return (Criteria) this;
        }

        public Criteria andLabPersonAmountLessThan(Integer value) {
            addCriterion("lab_person_amount <", value, "labPersonAmount");
            return (Criteria) this;
        }

        public Criteria andLabPersonAmountLessThanOrEqualTo(Integer value) {
            addCriterion("lab_person_amount <=", value, "labPersonAmount");
            return (Criteria) this;
        }

        public Criteria andLabPersonAmountIn(List<Integer> values) {
            addCriterion("lab_person_amount in", values, "labPersonAmount");
            return (Criteria) this;
        }

        public Criteria andLabPersonAmountNotIn(List<Integer> values) {
            addCriterion("lab_person_amount not in", values, "labPersonAmount");
            return (Criteria) this;
        }

        public Criteria andLabPersonAmountBetween(Integer value1, Integer value2) {
            addCriterion("lab_person_amount between", value1, value2, "labPersonAmount");
            return (Criteria) this;
        }

        public Criteria andLabPersonAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("lab_person_amount not between", value1, value2, "labPersonAmount");
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

        public Criteria andLabPersonAmountNowIsNull() {
            addCriterion("lab_person_amount_now is null");
            return (Criteria) this;
        }

        public Criteria andLabPersonAmountNowIsNotNull() {
            addCriterion("lab_person_amount_now is not null");
            return (Criteria) this;
        }

        public Criteria andLabPersonAmountNowEqualTo(Integer value) {
            addCriterion("lab_person_amount_now =", value, "labPersonAmountNow");
            return (Criteria) this;
        }

        public Criteria andLabPersonAmountNowNotEqualTo(Integer value) {
            addCriterion("lab_person_amount_now <>", value, "labPersonAmountNow");
            return (Criteria) this;
        }

        public Criteria andLabPersonAmountNowGreaterThan(Integer value) {
            addCriterion("lab_person_amount_now >", value, "labPersonAmountNow");
            return (Criteria) this;
        }

        public Criteria andLabPersonAmountNowGreaterThanOrEqualTo(Integer value) {
            addCriterion("lab_person_amount_now >=", value, "labPersonAmountNow");
            return (Criteria) this;
        }

        public Criteria andLabPersonAmountNowLessThan(Integer value) {
            addCriterion("lab_person_amount_now <", value, "labPersonAmountNow");
            return (Criteria) this;
        }

        public Criteria andLabPersonAmountNowLessThanOrEqualTo(Integer value) {
            addCriterion("lab_person_amount_now <=", value, "labPersonAmountNow");
            return (Criteria) this;
        }

        public Criteria andLabPersonAmountNowIn(List<Integer> values) {
            addCriterion("lab_person_amount_now in", values, "labPersonAmountNow");
            return (Criteria) this;
        }

        public Criteria andLabPersonAmountNowNotIn(List<Integer> values) {
            addCriterion("lab_person_amount_now not in", values, "labPersonAmountNow");
            return (Criteria) this;
        }

        public Criteria andLabPersonAmountNowBetween(Integer value1, Integer value2) {
            addCriterion("lab_person_amount_now between", value1, value2, "labPersonAmountNow");
            return (Criteria) this;
        }

        public Criteria andLabPersonAmountNowNotBetween(Integer value1, Integer value2) {
            addCriterion("lab_person_amount_now not between", value1, value2, "labPersonAmountNow");
            return (Criteria) this;
        }

        public Criteria andTimePeriodIsNull() {
            addCriterion("time_period is null");
            return (Criteria) this;
        }

        public Criteria andTimePeriodIsNotNull() {
            addCriterion("time_period is not null");
            return (Criteria) this;
        }

        public Criteria andTimePeriodEqualTo(Integer value) {
            addCriterion("time_period =", value, "timePeriod");
            return (Criteria) this;
        }

        public Criteria andTimePeriodNotEqualTo(Integer value) {
            addCriterion("time_period <>", value, "timePeriod");
            return (Criteria) this;
        }

        public Criteria andTimePeriodGreaterThan(Integer value) {
            addCriterion("time_period >", value, "timePeriod");
            return (Criteria) this;
        }

        public Criteria andTimePeriodGreaterThanOrEqualTo(Integer value) {
            addCriterion("time_period >=", value, "timePeriod");
            return (Criteria) this;
        }

        public Criteria andTimePeriodLessThan(Integer value) {
            addCriterion("time_period <", value, "timePeriod");
            return (Criteria) this;
        }

        public Criteria andTimePeriodLessThanOrEqualTo(Integer value) {
            addCriterion("time_period <=", value, "timePeriod");
            return (Criteria) this;
        }

        public Criteria andTimePeriodIn(List<Integer> values) {
            addCriterion("time_period in", values, "timePeriod");
            return (Criteria) this;
        }

        public Criteria andTimePeriodNotIn(List<Integer> values) {
            addCriterion("time_period not in", values, "timePeriod");
            return (Criteria) this;
        }

        public Criteria andTimePeriodBetween(Integer value1, Integer value2) {
            addCriterion("time_period between", value1, value2, "timePeriod");
            return (Criteria) this;
        }

        public Criteria andTimePeriodNotBetween(Integer value1, Integer value2) {
            addCriterion("time_period not between", value1, value2, "timePeriod");
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