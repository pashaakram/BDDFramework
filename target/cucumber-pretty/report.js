$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Edge_Networks/EdgeNetworks/src/test/java/DMSFeatures/07_iwoValidation.feature");
formatter.feature({
  "line": 2,
  "name": "IWO :- Filter Validation in IWO",
  "description": "",
  "id": "iwo-:--filter-validation-in-iwo",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@ta"
    },
    {
      "line": 1,
      "name": "@ust"
    },
    {
      "line": 1,
      "name": "@dms"
    }
  ]
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 4,
      "value": "# \t @ust @dms"
    },
    {
      "line": 5,
      "value": "# \tScenario Outline: IWO :- Validate All Filter present in iwo page"
    },
    {
      "line": 6,
      "value": "# \t\tGiven User should navigate to Opportunities page."
    },
    {
      "line": 7,
      "value": "# \t\tThen User navigates to iwo page."
    },
    {
      "line": 8,
      "value": "# \t\tThen Validate the Filters present on iwo page \"\u003cCost_Center\u003e\",\"\u003cExperience_Lower\u003e\",\"\u003cExperience_Upper\u003e\",\"\u003cPayBand\u003e\",\"\u003cPractice\u003e\",\"\u003cRR_Type\u003e\",\"\u003cVisa_Type\u003e\""
    },
    {
      "line": 9,
      "value": "#"
    },
    {
      "line": 10,
      "value": "# \t\tExamples:"
    },
    {
      "line": 11,
      "value": "# \t\t| Cost_Center | Experience_Lower | Experience_Upper | PayBand | Practice | RR_Type | Visa_Type |"
    },
    {
      "line": 12,
      "value": "# \t\t| COST CENTER | EXPERIENCE LOWER | EXPERIENCE UPPER | PAYBAND | PRACTICE | RR TYPE | VISA TYPE |"
    },
    {
      "line": 13,
      "value": "#"
    },
    {
      "line": 14,
      "value": "#"
    },
    {
      "line": 15,
      "value": "# \t\t @ust @dms"
    },
    {
      "line": 16,
      "value": "# \tScenario Outline: IWO :- Select different filters in IWO."
    },
    {
      "line": 17,
      "value": "# \t\tGiven User should navigate to Opportunities page."
    },
    {
      "line": 18,
      "value": "#\t\tThen User navigates to iwo page."
    },
    {
      "line": 19,
      "value": "# \t\tThen Select any filter \"\u003cFilterSelectCost\u003e\" ,\"\u003cFilterCost\u003e\" from drop down."
    },
    {
      "line": 20,
      "value": "# \t\tThen Select any filter \"\u003cFilterSelectPayBand\u003e\" ,\"\u003cFilterPayBand\u003e\" from drop down."
    },
    {
      "line": 21,
      "value": "# \t\tThen Select any filter \"\u003cFilterSelectPractice\u003e\" ,\"\u003cFilterPractice\u003e\" from drop down."
    },
    {
      "line": 22,
      "value": "# \t\tThen Select any filter \"\u003cFilterSelectRRType\u003e\" ,\"\u003cFilterPayBandRRType\u003e\" from drop down."
    },
    {
      "line": 23,
      "value": "# \t\tThen Select any filter \"\u003cFilterSelectVisa\u003e\" ,\"\u003cFilterPayVisa\u003e\" from drop down."
    },
    {
      "line": 24,
      "value": "#"
    },
    {
      "line": 25,
      "value": "# \t\tExamples:"
    },
    {
      "line": 26,
      "value": "# \t\t | FilterSelectCost | FilterCost \t\t\t\t     | FilterSelectPayBand | FilterPayBand | FilterSelectPractice | FilterPractice \t\t\t\t\t\t  |  FilterSelectRRType |FilterPayBandRRType | FilterSelectVisa | FilterPayVisa |"
    },
    {
      "line": 27,
      "value": "# \t\t | cost center\t    | FA: Staffing Philly Operations |  payband\t\t\t   | L2\t\t\t   | practice             | Enterprise Application Services (EAS) | rr type\t\t\t\t| Proactive Hiring   | visa type        | H-1B (US)\t\t|"
    },
    {
      "line": 28,
      "value": "#"
    },
    {
      "line": 29,
      "value": "#"
    }
  ],
  "line": 32,
  "name": "IWO :- Validate All Filter present in iwo page",
  "description": "",
  "id": "iwo-:--filter-validation-in-iwo;iwo-:--validate-all-filter-present-in-iwo-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 31,
      "name": "@ust"
    },
    {
      "line": 31,
      "name": "@dms"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "User should navigate to Opportunities page.",
  "keyword": "Given "
});
formatter.step({
  "line": 34,
  "name": "User navigates to iwo page.",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "Select the \"\u003cOpenStatus\u003e\" from DropDown and validate that same status RR are appearing by clicking on More Details.",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "Select the \"\u003cOnHoldStatus\u003e\" from DropDown and validate that same status RR are appearing by clicking on More Details.",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "Select the \"\u003cArchiveStatus\u003e\" from DropDown and validate that same status RR are appearing by clicking on More Details.",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "Select the \"\u003cFulfilledStatus\u003e\" from DropDown and validate that same status RR are appearing by clicking on More Details.",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "Search for a particular \"\u003cRR\u003e\" and validate whether the searched RR is present.",
  "keyword": "Then "
});
formatter.examples({
  "line": 41,
  "name": "",
  "description": "",
  "id": "iwo-:--filter-validation-in-iwo;iwo-:--validate-all-filter-present-in-iwo-page;",
  "rows": [
    {
      "cells": [
        "OpenStatus",
        "OnHoldStatus",
        "ArchiveStatus",
        "FulfilledStatus",
        "RR"
      ],
      "line": 42,
      "id": "iwo-:--filter-validation-in-iwo;iwo-:--validate-all-filter-present-in-iwo-page;;1"
    },
    {
      "cells": [
        "Open",
        "On-Hold",
        "Archive",
        "Fulfilled",
        "1000001123"
      ],
      "line": 43,
      "id": "iwo-:--filter-validation-in-iwo;iwo-:--validate-all-filter-present-in-iwo-page;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 6734583200,
  "status": "passed"
});
formatter.scenario({
  "line": 43,
  "name": "IWO :- Validate All Filter present in iwo page",
  "description": "",
  "id": "iwo-:--filter-validation-in-iwo;iwo-:--validate-all-filter-present-in-iwo-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@dms"
    },
    {
      "line": 1,
      "name": "@ust"
    },
    {
      "line": 1,
      "name": "@ta"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "User should navigate to Opportunities page.",
  "keyword": "Given "
});
formatter.step({
  "line": 34,
  "name": "User navigates to iwo page.",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "Select the \"Open\" from DropDown and validate that same status RR are appearing by clicking on More Details.",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "Select the \"On-Hold\" from DropDown and validate that same status RR are appearing by clicking on More Details.",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "Select the \"Archive\" from DropDown and validate that same status RR are appearing by clicking on More Details.",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "Select the \"Fulfilled\" from DropDown and validate that same status RR are appearing by clicking on More Details.",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "Search for a particular \"1000001123\" and validate whether the searched RR is present.",
  "matchedColumns": [
    4
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "CreateRR_SFDCStepDefinition.user_should_navigate_to_Opportunities_page()"
});
formatter.result({
  "duration": 16399351800,
  "status": "passed"
});
formatter.match({
  "location": "IWOValidationStepDefinition.user_navigates_to_iwo_page()"
});
formatter.result({
  "duration": 5160542900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Open",
      "offset": 12
    }
  ],
  "location": "IWOValidationStepDefinition.select_the_from_DropDown_and_validate_that_same_status_RR_are_appearing_by_clicking_on_More_Details(String)"
});
formatter.result({
  "duration": 4457374400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "On-Hold",
      "offset": 12
    }
  ],
  "location": "IWOValidationStepDefinition.select_the_from_DropDown_and_validate_that_same_status_RR_are_appearing_by_clicking_on_More_Details(String)"
});
formatter.result({
  "duration": 4288487500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Archive",
      "offset": 12
    }
  ],
  "location": "IWOValidationStepDefinition.select_the_from_DropDown_and_validate_that_same_status_RR_are_appearing_by_clicking_on_More_Details(String)"
});
formatter.result({
  "duration": 3871841700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Fulfilled",
      "offset": 12
    }
  ],
  "location": "IWOValidationStepDefinition.select_the_from_DropDown_and_validate_that_same_status_RR_are_appearing_by_clicking_on_More_Details(String)"
});
formatter.result({
  "duration": 4095704600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1000001123",
      "offset": 25
    }
  ],
  "location": "IWOValidationStepDefinition.search_for_a_particular_and_validate_whether_the_searched_RR_is_present(String)"
});
formatter.result({
  "duration": 7086656300,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1149687600,
  "status": "passed"
});
});