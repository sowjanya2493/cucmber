$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/seleniumNEW/BDD/src/main/java/features/dealsmaps.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM deals create",
  "description": "",
  "id": "free-crm-deals-create",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "user is able to create a new deal",
  "description": "",
  "id": "free-crm-deals-create;user-is-able-to-create-a-new-deal",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is already on loginpage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "title of the login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 7
    },
    {
      "cells": [
        "sowjanyageddada6@gmail.com",
        "Manipulation@1274"
      ],
      "line": 8
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user is on homepage",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user clicks on new deals link",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user enters Title and AssignedTo and company and amount",
  "rows": [
    {
      "cells": [
        "title",
        "assignedTo",
        "company",
        "amount"
      ],
      "line": 14
    },
    {
      "cells": [
        "test deal1",
        "sowjanya",
        "marolix",
        "1000"
      ],
      "line": 15
    },
    {
      "cells": [
        "test deal2",
        "maanvitha",
        "clickQ",
        "2000"
      ],
      "line": 16
    },
    {
      "cells": [
        "test deal3",
        "lakshmi",
        "prasthana",
        "3000"
      ],
      "line": 17
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "user clicks on save button",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "dealsMaps.user_is_already_on_loginpage()"
});
formatter.result({
  "duration": 53866522500,
  "status": "passed"
});
formatter.match({
  "location": "dealsMaps.title_of_the_login_page_is_Free_CRM()"
});
formatter.result({
  "duration": 13722800,
  "status": "passed"
});
formatter.match({
  "location": "dealsMaps.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 1257040300,
  "status": "passed"
});
formatter.match({
  "location": "dealsMaps.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 47128800,
  "status": "passed"
});
formatter.match({
  "location": "dealsMaps.user_is_on_homepage()"
});
formatter.result({
  "duration": 6415300,
  "status": "passed"
});
formatter.match({
  "location": "dealsMaps.user_clicks_on_new_deals_link()"
});
formatter.result({
  "duration": 5534788100,
  "status": "passed"
});
formatter.match({
  "location": "dealsMaps.user_enters_Title_and_AssignedTo_and_company_and_amount(DataTable)"
});
formatter.result({
  "duration": 793543700,
  "status": "passed"
});
formatter.match({
  "location": "dealsMaps.user_clicks_on_save_button()"
});
formatter.result({
  "duration": 106668800,
  "status": "passed"
});
formatter.match({
  "location": "dealsMaps.close_the_browser()"
});
formatter.result({
  "duration": 1619203700,
  "status": "passed"
});
});