Feature: Login to Guru99 Application
	
	Scenario: User logins with correct credentials
		Given User navigates to login page
		When user enters the userid as mngr291840
		And user enters the password as  dYnusAv
		And user click the login button
		Then user successfully logins to the application