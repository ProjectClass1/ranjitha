Feature: Generating 10 order id from Adactin hotel page.
Scenario Outline: Generating order id.
Given user is on Adactinhotel application on chrome browser.
When user enter "<username>" and "<password>".
And user should click login button.
When user select "<location>","<roomtypes>","<noofrooms>","<Adultperroom>","<checkindate>","<checkoutdate>","<childperroom>".
And click continue button.
When user select hotel and click continue for booking.
When user enter"<firstname>","<lastname>","<billingaddress>","<cardtype>","<cardno>","<expmonth>","<expyear>","<cvv>".
And user click on continue for generating order id.
And user print order id to console.
Examples:
|username|password|location|roomtypes|noofrooms|Adultperroom|checkindate|checkoutdate|childperroom|firstname|lastname|billingaddress|cardtype|cardno|expmonth|expyear|cvv|".

|ranjitha|priya234|London|Double|4|2|23/04/2022|24/04/2022|2|rose|mario|34thstreetbangalore|VISA|328533187865543|March|2022|2764|






