Feature: Free CRM contact create 
Scenario Outline: user is able to create a new contact 

	Given user is already on loginpage 
	When title of the login page is Free CRM 
	Then user enters "<username>" and "<password>" 
	Then user clicks on login button 
	Then user is on homepage 
	Then user clicks on new contact link 
	Then user enters "<firstname>" and "<lastname>" and "<position>" 
	Then user clicks on save button 
	Then close the browser 
	
	Examples: 
	
		|username|password|firstname|lastname|company|
		|sowjanyageddada6@gmail.com|Manipulation@1274|sowjanya|geddada|tech mahindra|
		|sowjanyageddada6@gmail.com|Manipulation@1274|maanvitha|anasuri|marolix|
		
