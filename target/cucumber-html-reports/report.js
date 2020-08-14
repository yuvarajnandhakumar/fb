$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/Feature/MakemyTrip.feature");
formatter.feature({
  "name": "Make my trip",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Print Location and Flights details in makemytrip",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch Makemytrip",
  "keyword": "Given "
});
formatter.match({
  "location": "MakeMyTrip.launch_Makemytrip()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Fetch the values of Location, Flight details and Print in console",
  "keyword": "Then "
});
formatter.match({
  "location": "MakeMyTrip.fetch_the_values_of_Location_Flight_details_and_Print_in_console()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close the Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "MakeMyTrip.close_the_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});