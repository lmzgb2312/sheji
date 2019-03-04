package com.lmz.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LabDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LabDetailExample() {
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

        public Criteria andLabDetailIdIsNull() {
            addCriterion("lab_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andLabDetailIdIsNotNull() {
            addCriterion("lab_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andLabDetailIdEqualTo(Integer value) {
            addCriterion("lab_detail_id =", value, "labDetailId");
            return (Criteria) this;
        }

        public Criteria andLabDetailIdNotEqualTo(Integer value) {
            addCriterion("lab_detail_id <>", value, "labDetailId");
            return (Criteria) this;
        }

        public Criteria andLabDetailIdGreaterThan(Integer value) {
            addCriterion("lab_detail_id >", value, "labDetailId");
            return (Criteria) this;
        }

        public Criteria andLabDetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("lab_detail_id >=", value, "labDetailId");
            return (Criteria) this;
        }

        public Criteria andLabDetailIdLessThan(Integer value) {
            addCriterion("lab_detail_id <", value, "labDetailId");
            return (Criteria) this;
        }

        public Criteria andLabDetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("lab_detail_id <=", value, "labDetailId");
            return (Criteria) this;
        }

        public Criteria andLabDetailIdIn(List<Integer> values) {
            addCriterion("lab_detail_id in", values, "labDetailId");
            return (Criteria) this;
        }

        public Criteria andLabDetailIdNotIn(List<Integer> values) {
            addCriterion("lab_detail_id not in", values, "labDetailId");
            return (Criteria) this;
        }

        public Criteria andLabDetailIdBetween(Integer value1, Integer value2) {
            addCriterion("lab_detail_id between", value1, value2, "labDetailId");
            return (Criteria) this;
        }

        public Criteria andLabDetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("lab_detail_id not between", value1, value2, "labDetailId");
            return (Criteria) this;
        }

        public Criteria andLabDetailNameIsNull() {
            addCriterion("lab_detail_name is null");
            return (Criteria) this;
        }

        public Criteria andLabDetailNameIsNotNull() {
            addCriterion("lab_detail_name is not null");
            return (Criteria) this;
        }

        public Criteria andLabDetailNameEqualTo(String value) {
            addCriterion("lab_detail_name =", value, "labDetailName");
            return (Criteria) this;
        }

        public Criteria andLabDetailNameNotEqualTo(String value) {
            addCriterion("lab_detail_name <>", value, "labDetailName");
            return (Criteria) this;
        }

        public Criteria andLabDetailNameGreaterThan(String value) {
            addCriterion("lab_detail_name >", value, "labDetailName");
            return (Criteria) this;
        }

        public Criteria andLabDetailNameGreaterThanOrEqualTo(String value) {
            addCriterion("lab_detail_name >=", value, "labDetailName");
            return (Criteria) this;
        }

        public Criteria andLabDetailNameLessThan(String value) {
            addCriterion("lab_detail_name <", value, "labDetailName");
            return (Criteria) this;
        }

        public Criteria andLabDetailNameLessThanOrEqualTo(String value) {
            addCriterion("lab_detail_name <=", value, "labDetailName");
            return (Criteria) this;
        }

        public Criteria andLabDetailNameLike(String value) {
            addCriterion("lab_detail_name like", value, "labDetailName");
            return (Criteria) this;
        }

        public Criteria andLabDetailNameNotLike(String value) {
            addCriterion("lab_detail_name not like", value, "labDetailName");
            return (Criteria) this;
        }

        public Criteria andLabDetailNameIn(List<String> values) {
            addCriterion("lab_detail_name in", values, "labDetailName");
            return (Criteria) this;
        }

        public Criteria andLabDetailNameNotIn(List<String> values) {
            addCriterion("lab_detail_name not in", values, "labDetailName");
            return (Criteria) this;
        }

        public Criteria andLabDetailNameBetween(String value1, String value2) {
            addCriterion("lab_detail_name between", value1, value2, "labDetailName");
            return (Criteria) this;
        }

        public Criteria andLabDetailNameNotBetween(String value1, String value2) {
            addCriterion("lab_detail_name not between", value1, value2, "labDetailName");
            return (Criteria) this;
        }

        public Criteria andLabDetailTeacherIsNull() {
            addCriterion("lab_detail_teacher is null");
            return (Criteria) this;
        }

        public Criteria andLabDetailTeacherIsNotNull() {
            addCriterion("lab_detail_teacher is not null");
            return (Criteria) this;
        }

        public Criteria andLabDetailTeacherEqualTo(String value) {
            addCriterion("lab_detail_teacher =", value, "labDetailTeacher");
            return (Criteria) this;
        }

        public Criteria andLabDetailTeacherNotEqualTo(String value) {
            addCriterion("lab_detail_teacher <>", value, "labDetailTeacher");
            return (Criteria) this;
        }

        public Criteria andLabDetailTeacherGreaterThan(String value) {
            addCriterion("lab_detail_teacher >", value, "labDetailTeacher");
            return (Criteria) this;
        }

        public Criteria andLabDetailTeacherGreaterThanOrEqualTo(String value) {
            addCriterion("lab_detail_teacher >=", value, "labDetailTeacher");
            return (Criteria) this;
        }

        public Criteria andLabDetailTeacherLessThan(String value) {
            addCriterion("lab_detail_teacher <", value, "labDetailTeacher");
            return (Criteria) this;
        }

        public Criteria andLabDetailTeacherLessThanOrEqualTo(String value) {
            addCriterion("lab_detail_teacher <=", value, "labDetailTeacher");
            return (Criteria) this;
        }

        public Criteria andLabDetailTeacherLike(String value) {
            addCriterion("lab_detail_teacher like", value, "labDetailTeacher");
            return (Criteria) this;
        }

        public Criteria andLabDetailTeacherNotLike(String value) {
            addCriterion("lab_detail_teacher not like", value, "labDetailTeacher");
            return (Criteria) this;
        }

        public Criteria andLabDetailTeacherIn(List<String> values) {
            addCriterion("lab_detail_teacher in", values, "labDetailTeacher");
            return (Criteria) this;
        }

        public Criteria andLabDetailTeacherNotIn(List<String> values) {
            addCriterion("lab_detail_teacher not in", values, "labDetailTeacher");
            return (Criteria) this;
        }

        public Criteria andLabDetailTeacherBetween(String value1, String value2) {
            addCriterion("lab_detail_teacher between", value1, value2, "labDetailTeacher");
            return (Criteria) this;
        }

        public Criteria andLabDetailTeacherNotBetween(String value1, String value2) {
            addCriterion("lab_detail_teacher not between", value1, value2, "labDetailTeacher");
            return (Criteria) this;
        }

        public Criteria andLabDetailInstructionIsNull() {
            addCriterion("lab_detail_instruction is null");
            return (Criteria) this;
        }

        public Criteria andLabDetailInstructionIsNotNull() {
            addCriterion("lab_detail_instruction is not null");
            return (Criteria) this;
        }

        public Criteria andLabDetailInstructionEqualTo(String value) {
            addCriterion("lab_detail_instruction =", value, "labDetailInstruction");
            return (Criteria) this;
        }

        public Criteria andLabDetailInstructionNotEqualTo(String value) {
            addCriterion("lab_detail_instruction <>", value, "labDetailInstruction");
            return (Criteria) this;
        }

        public Criteria andLabDetailInstructionGreaterThan(String value) {
            addCriterion("lab_detail_instruction >", value, "labDetailInstruction");
            return (Criteria) this;
        }

        public Criteria andLabDetailInstructionGreaterThanOrEqualTo(String value) {
            addCriterion("lab_detail_instruction >=", value, "labDetailInstruction");
            return (Criteria) this;
        }

        public Criteria andLabDetailInstructionLessThan(String value) {
            addCriterion("lab_detail_instruction <", value, "labDetailInstruction");
            return (Criteria) this;
        }

        public Criteria andLabDetailInstructionLessThanOrEqualTo(String value) {
            addCriterion("lab_detail_instruction <=", value, "labDetailInstruction");
            return (Criteria) this;
        }

        public Criteria andLabDetailInstructionLike(String value) {
            addCriterion("lab_detail_instruction like", value, "labDetailInstruction");
            return (Criteria) this;
        }

        public Criteria andLabDetailInstructionNotLike(String value) {
            addCriterion("lab_detail_instruction not like", value, "labDetailInstruction");
            return (Criteria) this;
        }

        public Criteria andLabDetailInstructionIn(List<String> values) {
            addCriterion("lab_detail_instruction in", values, "labDetailInstruction");
            return (Criteria) this;
        }

        public Criteria andLabDetailInstructionNotIn(List<String> values) {
            addCriterion("lab_detail_instruction not in", values, "labDetailInstruction");
            return (Criteria) this;
        }

        public Criteria andLabDetailInstructionBetween(String value1, String value2) {
            addCriterion("lab_detail_instruction between", value1, value2, "labDetailInstruction");
            return (Criteria) this;
        }

        public Criteria andLabDetailInstructionNotBetween(String value1, String value2) {
            addCriterion("lab_detail_instruction not between", value1, value2, "labDetailInstruction");
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