/*
 * The class will let the Authority sitting in different hospital to update their databases.
 * 
 * Author-Atul Agrawal
 */
public class RegistrationModule {
     
/*
 * set authentication details provided by the Hospital Authority to insert patient information in database
 */
public void setAuthenticationDetails(String username,String Password){
  
}

/*
 * return login status based on username and password provided by hospital autority
 */
public boolean getLoginStatus(){
	return false;
}
/*
 *Connect the user to the database.Here default DatabaseURL will be used
 */

public void connectDatabase(){
	
}
/*
 * connect the user to the database.URL is provided so that the hospital can maintain different databse.If they have different branch
 */
public void connectDatabase(String DatabaseURL){
	
}
/*
 * return database connectivity status
 */

public boolean isDatabaseConnected(){
	return false;
}


/*
 * This will set default URl.URL to be used if nothing is provided
 */
public void setDefaultURL(String URL){
	
}

/*
 * this will get the parameters given by Hospital Authority
 */

public void setPatientParameter(String patient_id,String alert_type,String alert_time){
	
}

/*
 * This will insert the parameter in database.
 */
public void insertParameter(){
	
}

/*
 * This will return if the database is updated properly
 * 
 */
public boolean getUpdateStatus(){
	return false;
}
/*
 * This will logOut the user
 */
public void logout(){
	
}
/*
 * This will send the logout status
 */
public boolean getLogOutStatus(){

	return false;
}

}
