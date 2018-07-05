package com.amogh.repository;

import java.util.List;

import com.amogh.activity.Activity;

public interface ActivityRepository {

	List<Activity> findAllActivities();

	Activity findActivity(String activityId);

}