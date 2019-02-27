package com.lmz.vo;

import java.util.ArrayList;
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

        public Criteria andLibidIsNull() {
            addCriterion("libid is null");
            return (Criteria) this;
        }

        public Criteria andLibidIsNotNull() {
            addCriterion("libid is not null");
            return (Criteria) this;
        }

        public Criteria andLibidEqualTo(Integer value) {
            addCriterion("libid =", value, "libid");
            return (Criteria) this;
        }

        public Criteria andLibidNotEqualTo(Integer value) {
            addCriterion("libid <>", value, "libid");
            return (Criteria) this;
        }

        public Criteria andLibidGreaterThan(Integer value) {
            addCriterion("libid >", value, "libid");
            return (Criteria) this;
        }

        public Criteria andLibidGreaterThanOrEqualTo(Integer value) {
            addCriterion("libid >=", value, "libid");
            return (Criteria) this;
        }

        public Criteria andLibidLessThan(Integer value) {
            addCriterion("libid <", value, "libid");
            return (Criteria) this;
        }

        public Criteria andLibidLessThanOrEqualTo(Integer value) {
            addCriterion("libid <=", value, "libid");
            return (Criteria) this;
        }

        public Criteria andLibidIn(List<Integer> values) {
            addCriterion("libid in", values, "libid");
            return (Criteria) this;
        }

        public Criteria andLibidNotIn(List<Integer> values) {
            addCriterion("libid not in", values, "libid");
            return (Criteria) this;
        }

        public Criteria andLibidBetween(Integer value1, Integer value2) {
            addCriterion("libid between", value1, value2, "libid");
            return (Criteria) this;
        }

        public Criteria andLibidNotBetween(Integer value1, Integer value2) {
            addCriterion("libid not between", value1, value2, "libid");
            return (Criteria) this;
        }

        public Criteria andLibnameIsNull() {
            addCriterion("libname is null");
            return (Criteria) this;
        }

        public Criteria andLibnameIsNotNull() {
            addCriterion("libname is not null");
            return (Criteria) this;
        }

        public Criteria andLibnameEqualTo(String value) {
            addCriterion("libname =", value, "libname");
            return (Criteria) this;
        }

        public Criteria andLibnameNotEqualTo(String value) {
            addCriterion("libname <>", value, "libname");
            return (Criteria) this;
        }

        public Criteria andLibnameGreaterThan(String value) {
            addCriterion("libname >", value, "libname");
            return (Criteria) this;
        }

        public Criteria andLibnameGreaterThanOrEqualTo(String value) {
            addCriterion("libname >=", value, "libname");
            return (Criteria) this;
        }

        public Criteria andLibnameLessThan(String value) {
            addCriterion("libname <", value, "libname");
            return (Criteria) this;
        }

        public Criteria andLibnameLessThanOrEqualTo(String value) {
            addCriterion("libname <=", value, "libname");
            return (Criteria) this;
        }

        public Criteria andLibnameLike(String value) {
            addCriterion("libname like", value, "libname");
            return (Criteria) this;
        }

        public Criteria andLibnameNotLike(String value) {
            addCriterion("libname not like", value, "libname");
            return (Criteria) this;
        }

        public Criteria andLibnameIn(List<String> values) {
            addCriterion("libname in", values, "libname");
            return (Criteria) this;
        }

        public Criteria andLibnameNotIn(List<String> values) {
            addCriterion("libname not in", values, "libname");
            return (Criteria) this;
        }

        public Criteria andLibnameBetween(String value1, String value2) {
            addCriterion("libname between", value1, value2, "libname");
            return (Criteria) this;
        }

        public Criteria andLibnameNotBetween(String value1, String value2) {
            addCriterion("libname not between", value1, value2, "libname");
            return (Criteria) this;
        }

        public Criteria andLibteacherIsNull() {
            addCriterion("libteacher is null");
            return (Criteria) this;
        }

        public Criteria andLibteacherIsNotNull() {
            addCriterion("libteacher is not null");
            return (Criteria) this;
        }

        public Criteria andLibteacherEqualTo(String value) {
            addCriterion("libteacher =", value, "libteacher");
            return (Criteria) this;
        }

        public Criteria andLibteacherNotEqualTo(String value) {
            addCriterion("libteacher <>", value, "libteacher");
            return (Criteria) this;
        }

        public Criteria andLibteacherGreaterThan(String value) {
            addCriterion("libteacher >", value, "libteacher");
            return (Criteria) this;
        }

        public Criteria andLibteacherGreaterThanOrEqualTo(String value) {
            addCriterion("libteacher >=", value, "libteacher");
            return (Criteria) this;
        }

        public Criteria andLibteacherLessThan(String value) {
            addCriterion("libteacher <", value, "libteacher");
            return (Criteria) this;
        }

        public Criteria andLibteacherLessThanOrEqualTo(String value) {
            addCriterion("libteacher <=", value, "libteacher");
            return (Criteria) this;
        }

        public Criteria andLibteacherLike(String value) {
            addCriterion("libteacher like", value, "libteacher");
            return (Criteria) this;
        }

        public Criteria andLibteacherNotLike(String value) {
            addCriterion("libteacher not like", value, "libteacher");
            return (Criteria) this;
        }

        public Criteria andLibteacherIn(List<String> values) {
            addCriterion("libteacher in", values, "libteacher");
            return (Criteria) this;
        }

        public Criteria andLibteacherNotIn(List<String> values) {
            addCriterion("libteacher not in", values, "libteacher");
            return (Criteria) this;
        }

        public Criteria andLibteacherBetween(String value1, String value2) {
            addCriterion("libteacher between", value1, value2, "libteacher");
            return (Criteria) this;
        }

        public Criteria andLibteacherNotBetween(String value1, String value2) {
            addCriterion("libteacher not between", value1, value2, "libteacher");
            return (Criteria) this;
        }

        public Criteria andLibinstructionIsNull() {
            addCriterion("libinstruction is null");
            return (Criteria) this;
        }

        public Criteria andLibinstructionIsNotNull() {
            addCriterion("libinstruction is not null");
            return (Criteria) this;
        }

        public Criteria andLibinstructionEqualTo(String value) {
            addCriterion("libinstruction =", value, "libinstruction");
            return (Criteria) this;
        }

        public Criteria andLibinstructionNotEqualTo(String value) {
            addCriterion("libinstruction <>", value, "libinstruction");
            return (Criteria) this;
        }

        public Criteria andLibinstructionGreaterThan(String value) {
            addCriterion("libinstruction >", value, "libinstruction");
            return (Criteria) this;
        }

        public Criteria andLibinstructionGreaterThanOrEqualTo(String value) {
            addCriterion("libinstruction >=", value, "libinstruction");
            return (Criteria) this;
        }

        public Criteria andLibinstructionLessThan(String value) {
            addCriterion("libinstruction <", value, "libinstruction");
            return (Criteria) this;
        }

        public Criteria andLibinstructionLessThanOrEqualTo(String value) {
            addCriterion("libinstruction <=", value, "libinstruction");
            return (Criteria) this;
        }

        public Criteria andLibinstructionLike(String value) {
            addCriterion("libinstruction like", value, "libinstruction");
            return (Criteria) this;
        }

        public Criteria andLibinstructionNotLike(String value) {
            addCriterion("libinstruction not like", value, "libinstruction");
            return (Criteria) this;
        }

        public Criteria andLibinstructionIn(List<String> values) {
            addCriterion("libinstruction in", values, "libinstruction");
            return (Criteria) this;
        }

        public Criteria andLibinstructionNotIn(List<String> values) {
            addCriterion("libinstruction not in", values, "libinstruction");
            return (Criteria) this;
        }

        public Criteria andLibinstructionBetween(String value1, String value2) {
            addCriterion("libinstruction between", value1, value2, "libinstruction");
            return (Criteria) this;
        }

        public Criteria andLibinstructionNotBetween(String value1, String value2) {
            addCriterion("libinstruction not between", value1, value2, "libinstruction");
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