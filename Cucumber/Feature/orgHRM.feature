Feature: Login and Logout Test

	Scenario:Login
		Given browser opened and application launched
		When Tester enters username and password
		And click on login
		Then display welcome admin message
		
	Scenario:Logout
		When Tester clicks on welcome admin link
		And also on logout
		Then display login page	