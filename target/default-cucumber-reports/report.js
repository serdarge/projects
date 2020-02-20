$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/GuestExploreTests.feature");
formatter.feature({
  "name": "Guests Explores",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Guest explores shore excursions destinations",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "a Guest",
  "keyword": "Given "
});
formatter.match({
  "location": "GuestsExploreStepDefinitions.a_Guest()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am on Homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "GuestsExploreStepDefinitions.i_am_on_Homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigated to “Shore Excursion” page",
  "keyword": "And "
});
formatter.match({
  "location": "GuestsExploreStepDefinitions.i_navigated_to_Shore_Excursion_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for destination “Alaska Cruises”",
  "keyword": "When "
});
formatter.match({
  "location": "GuestsExploreStepDefinitions.i_search_for_destination_Alaska_Cruises()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Shore Excursions page is present",
  "keyword": "Then "
});
formatter.match({
  "location": "GuestsExploreStepDefinitions.shore_Excursions_page_is_present()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Results are filtered by “Alaska Cruises”",
  "keyword": "And "
});
formatter.match({
  "location": "GuestsExploreStepDefinitions.results_are_filtered_by_Alaska_Cruises()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Filter By Ports are only belong to “Alaska, British Columbia”",
  "keyword": "And "
});
formatter.match({
  "location": "GuestsExploreStepDefinitions.filter_By_Ports_are_only_belong_to_Alaska_British_Columbia()"
});
formatter.result({
  "status": "passed"
});
});