package com.example.demo.mb.model.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StatsDeviceOnlineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StatsDeviceOnlineExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andDeviceIdIsNull() {
            addCriterion("device_id is null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNotNull() {
            addCriterion("device_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdEqualTo(String value) {
            addCriterion("device_id =", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotEqualTo(String value) {
            addCriterion("device_id <>", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThan(String value) {
            addCriterion("device_id >", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThanOrEqualTo(String value) {
            addCriterion("device_id >=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThan(String value) {
            addCriterion("device_id <", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThanOrEqualTo(String value) {
            addCriterion("device_id <=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLike(String value) {
            addCriterion("device_id like", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotLike(String value) {
            addCriterion("device_id not like", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIn(List<String> values) {
            addCriterion("device_id in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotIn(List<String> values) {
            addCriterion("device_id not in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdBetween(String value1, String value2) {
            addCriterion("device_id between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotBetween(String value1, String value2) {
            addCriterion("device_id not between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andRecordDateIsNull() {
            addCriterion("record_date is null");
            return (Criteria) this;
        }

        public Criteria andRecordDateIsNotNull() {
            addCriterion("record_date is not null");
            return (Criteria) this;
        }

        public Criteria andRecordDateEqualTo(Date value) {
            addCriterionForJDBCDate("record_date =", value, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("record_date <>", value, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateGreaterThan(Date value) {
            addCriterionForJDBCDate("record_date >", value, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("record_date >=", value, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateLessThan(Date value) {
            addCriterionForJDBCDate("record_date <", value, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("record_date <=", value, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateIn(List<Date> values) {
            addCriterionForJDBCDate("record_date in", values, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("record_date not in", values, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("record_date between", value1, value2, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("record_date not between", value1, value2, "recordDate");
            return (Criteria) this;
        }

        public Criteria andOnlineSecondsIsNull() {
            addCriterion("online_seconds is null");
            return (Criteria) this;
        }

        public Criteria andOnlineSecondsIsNotNull() {
            addCriterion("online_seconds is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineSecondsEqualTo(Long value) {
            addCriterion("online_seconds =", value, "onlineSeconds");
            return (Criteria) this;
        }

        public Criteria andOnlineSecondsNotEqualTo(Long value) {
            addCriterion("online_seconds <>", value, "onlineSeconds");
            return (Criteria) this;
        }

        public Criteria andOnlineSecondsGreaterThan(Long value) {
            addCriterion("online_seconds >", value, "onlineSeconds");
            return (Criteria) this;
        }

        public Criteria andOnlineSecondsGreaterThanOrEqualTo(Long value) {
            addCriterion("online_seconds >=", value, "onlineSeconds");
            return (Criteria) this;
        }

        public Criteria andOnlineSecondsLessThan(Long value) {
            addCriterion("online_seconds <", value, "onlineSeconds");
            return (Criteria) this;
        }

        public Criteria andOnlineSecondsLessThanOrEqualTo(Long value) {
            addCriterion("online_seconds <=", value, "onlineSeconds");
            return (Criteria) this;
        }

        public Criteria andOnlineSecondsIn(List<Long> values) {
            addCriterion("online_seconds in", values, "onlineSeconds");
            return (Criteria) this;
        }

        public Criteria andOnlineSecondsNotIn(List<Long> values) {
            addCriterion("online_seconds not in", values, "onlineSeconds");
            return (Criteria) this;
        }

        public Criteria andOnlineSecondsBetween(Long value1, Long value2) {
            addCriterion("online_seconds between", value1, value2, "onlineSeconds");
            return (Criteria) this;
        }

        public Criteria andOnlineSecondsNotBetween(Long value1, Long value2) {
            addCriterion("online_seconds not between", value1, value2, "onlineSeconds");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusIsNull() {
            addCriterion("online_status is null");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusIsNotNull() {
            addCriterion("online_status is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusEqualTo(Integer value) {
            addCriterion("online_status =", value, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusNotEqualTo(Integer value) {
            addCriterion("online_status <>", value, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusGreaterThan(Integer value) {
            addCriterion("online_status >", value, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("online_status >=", value, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusLessThan(Integer value) {
            addCriterion("online_status <", value, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusLessThanOrEqualTo(Integer value) {
            addCriterion("online_status <=", value, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusIn(List<Integer> values) {
            addCriterion("online_status in", values, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusNotIn(List<Integer> values) {
            addCriterion("online_status not in", values, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusBetween(Integer value1, Integer value2) {
            addCriterion("online_status between", value1, value2, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("online_status not between", value1, value2, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineDaysIsNull() {
            addCriterion("online_days is null");
            return (Criteria) this;
        }

        public Criteria andOnlineDaysIsNotNull() {
            addCriterion("online_days is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineDaysEqualTo(Integer value) {
            addCriterion("online_days =", value, "onlineDays");
            return (Criteria) this;
        }

        public Criteria andOnlineDaysNotEqualTo(Integer value) {
            addCriterion("online_days <>", value, "onlineDays");
            return (Criteria) this;
        }

        public Criteria andOnlineDaysGreaterThan(Integer value) {
            addCriterion("online_days >", value, "onlineDays");
            return (Criteria) this;
        }

        public Criteria andOnlineDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("online_days >=", value, "onlineDays");
            return (Criteria) this;
        }

        public Criteria andOnlineDaysLessThan(Integer value) {
            addCriterion("online_days <", value, "onlineDays");
            return (Criteria) this;
        }

        public Criteria andOnlineDaysLessThanOrEqualTo(Integer value) {
            addCriterion("online_days <=", value, "onlineDays");
            return (Criteria) this;
        }

        public Criteria andOnlineDaysIn(List<Integer> values) {
            addCriterion("online_days in", values, "onlineDays");
            return (Criteria) this;
        }

        public Criteria andOnlineDaysNotIn(List<Integer> values) {
            addCriterion("online_days not in", values, "onlineDays");
            return (Criteria) this;
        }

        public Criteria andOnlineDaysBetween(Integer value1, Integer value2) {
            addCriterion("online_days between", value1, value2, "onlineDays");
            return (Criteria) this;
        }

        public Criteria andOnlineDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("online_days not between", value1, value2, "onlineDays");
            return (Criteria) this;
        }

        public Criteria andOfflineDaysIsNull() {
            addCriterion("offline_days is null");
            return (Criteria) this;
        }

        public Criteria andOfflineDaysIsNotNull() {
            addCriterion("offline_days is not null");
            return (Criteria) this;
        }

        public Criteria andOfflineDaysEqualTo(Integer value) {
            addCriterion("offline_days =", value, "offlineDays");
            return (Criteria) this;
        }

        public Criteria andOfflineDaysNotEqualTo(Integer value) {
            addCriterion("offline_days <>", value, "offlineDays");
            return (Criteria) this;
        }

        public Criteria andOfflineDaysGreaterThan(Integer value) {
            addCriterion("offline_days >", value, "offlineDays");
            return (Criteria) this;
        }

        public Criteria andOfflineDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("offline_days >=", value, "offlineDays");
            return (Criteria) this;
        }

        public Criteria andOfflineDaysLessThan(Integer value) {
            addCriterion("offline_days <", value, "offlineDays");
            return (Criteria) this;
        }

        public Criteria andOfflineDaysLessThanOrEqualTo(Integer value) {
            addCriterion("offline_days <=", value, "offlineDays");
            return (Criteria) this;
        }

        public Criteria andOfflineDaysIn(List<Integer> values) {
            addCriterion("offline_days in", values, "offlineDays");
            return (Criteria) this;
        }

        public Criteria andOfflineDaysNotIn(List<Integer> values) {
            addCriterion("offline_days not in", values, "offlineDays");
            return (Criteria) this;
        }

        public Criteria andOfflineDaysBetween(Integer value1, Integer value2) {
            addCriterion("offline_days between", value1, value2, "offlineDays");
            return (Criteria) this;
        }

        public Criteria andOfflineDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("offline_days not between", value1, value2, "offlineDays");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNull() {
            addCriterion("last_login_time is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNotNull() {
            addCriterion("last_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeEqualTo(Date value) {
            addCriterion("last_login_time =", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotEqualTo(Date value) {
            addCriterion("last_login_time <>", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThan(Date value) {
            addCriterion("last_login_time >", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_login_time >=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThan(Date value) {
            addCriterion("last_login_time <", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_login_time <=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIn(List<Date> values) {
            addCriterion("last_login_time in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotIn(List<Date> values) {
            addCriterion("last_login_time not in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeBetween(Date value1, Date value2) {
            addCriterion("last_login_time between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_login_time not between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLogoutTimeIsNull() {
            addCriterion("last_logout_time is null");
            return (Criteria) this;
        }

        public Criteria andLastLogoutTimeIsNotNull() {
            addCriterion("last_logout_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastLogoutTimeEqualTo(Date value) {
            addCriterion("last_logout_time =", value, "lastLogoutTime");
            return (Criteria) this;
        }

        public Criteria andLastLogoutTimeNotEqualTo(Date value) {
            addCriterion("last_logout_time <>", value, "lastLogoutTime");
            return (Criteria) this;
        }

        public Criteria andLastLogoutTimeGreaterThan(Date value) {
            addCriterion("last_logout_time >", value, "lastLogoutTime");
            return (Criteria) this;
        }

        public Criteria andLastLogoutTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_logout_time >=", value, "lastLogoutTime");
            return (Criteria) this;
        }

        public Criteria andLastLogoutTimeLessThan(Date value) {
            addCriterion("last_logout_time <", value, "lastLogoutTime");
            return (Criteria) this;
        }

        public Criteria andLastLogoutTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_logout_time <=", value, "lastLogoutTime");
            return (Criteria) this;
        }

        public Criteria andLastLogoutTimeIn(List<Date> values) {
            addCriterion("last_logout_time in", values, "lastLogoutTime");
            return (Criteria) this;
        }

        public Criteria andLastLogoutTimeNotIn(List<Date> values) {
            addCriterion("last_logout_time not in", values, "lastLogoutTime");
            return (Criteria) this;
        }

        public Criteria andLastLogoutTimeBetween(Date value1, Date value2) {
            addCriterion("last_logout_time between", value1, value2, "lastLogoutTime");
            return (Criteria) this;
        }

        public Criteria andLastLogoutTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_logout_time not between", value1, value2, "lastLogoutTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNull() {
            addCriterion("last_update_time is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNotNull() {
            addCriterion("last_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeEqualTo(Date value) {
            addCriterion("last_update_time =", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotEqualTo(Date value) {
            addCriterion("last_update_time <>", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThan(Date value) {
            addCriterion("last_update_time >", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_update_time >=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThan(Date value) {
            addCriterion("last_update_time <", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_update_time <=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIn(List<Date> values) {
            addCriterion("last_update_time in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotIn(List<Date> values) {
            addCriterion("last_update_time not in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("last_update_time between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_update_time not between", value1, value2, "lastUpdateTime");
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