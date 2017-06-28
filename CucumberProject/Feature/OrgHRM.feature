Feature: Login and Logout Test

	Scenario:Login
		Given Browser opened and application launched
		When tester enters username and password
		And clicks on login
		Then display welcome admin message
		
	Scenario:Logout
		When tester clicks on welcome admin link
		And also on Logout
		Then login page is displayed