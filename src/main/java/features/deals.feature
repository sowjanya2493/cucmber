Feature: Free CRM deals create 
Scenario: user is able to create a new deal 

	Given user is already on loginpage 
	When title of the login page is Free CRM 
	Then user enters username and password 
		|sowjanyageddada6@gmail.com|Manipulation@1274|
	Then user clicks on login button 
	Then user is on homepage 
	Then user clicks on new deals link 
	Then user enters Title and AssignedTo and company and amount 
		|test deal|sowjanya|marolix|1000| 
		
	Then user clicks on save button 
	Then close the browser