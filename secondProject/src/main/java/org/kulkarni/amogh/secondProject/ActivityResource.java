package org.kulkarni.amogh.secondProject;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.amogh.activity.Activity;
import com.amogh.activity.User;
import com.amogh.repository.ActivityRepository;
import com.amogh.repository.ActivityRepositoryStub;

@Path("activities")
public class ActivityResource {

	private ActivityRepository activityRepository = new ActivityRepositoryStub();
	
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	
	public List<Activity> getAllActivites() {
		return activityRepository.findAllActivities();
	}
	

	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	@Path("{activityId}")
	public Activity getActivity(@PathParam("activityId") String activityId) {
		return activityRepository.findActivity(activityId);
	}
	

	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	@Path("{activityId}/user")
	public User getActivityUser(@PathParam("activityId") String activityId) {
		return activityRepository.findActivity(activityId).getUser();
	} 



}
