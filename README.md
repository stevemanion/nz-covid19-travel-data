# NZ Covid 19 Travel Data
## Dataset Content
This is a _travel dataset_ pertaining to all Covid 19 cases in New Zealand identified by the Ministry of Health. Each case record has been enriched and extended using Open Source Intelligence (OSINT), including details such as flight schedules, cruise ship itineraries, and so forth to help identify potential points of transmission between cases.

Such knowledge is very useful in New Zealand's outbreak, as a large portion of cases can be attributed to citizens returning from abroad, cruise ship activity, and pre-lockdown events hosting international visitors.

## Example Queries
Some example queries this dataset can answer, are _which_:
* _cases shared a flight/cruise?_
* _flights used the same physical aircraft?_
* _cases were at the same airport at the same time?_
* _which cases/flights/cruises are linked to each cluster?_
* _flight routes were responsible for the most infections?_
* _cases boarded both flights and cruises?_

## Resources
* [New Zealand Ministry of Health](https://www.health.govt.nz/our-work/diseases-and-conditions/covid-19-novel-coronavirus/covid-19-current-situation/covid-19-current-cases) - Details of Cases, Clusters, Testing, DHBs, & Media Releases
* [Open Flights](https://openflights.org/data.html) - Airport, Flight Route, & Schedule Data
* [New Zealand Cruise Association](https://newzealandcruiseassociation.com/) - Cruise Ship Schedule
* [New Zealand Department of Internal Affairs](https://catalogue.data.govt.nz/dataset/baby-name-popularity-over-time/resource/0b0b326c-d720-480f-8f86-bf2d221c7d3f?view_id=9841bb99-15ce-45dc-a39a-12108b93b4f1) - Popular NZ Names (_1900-2019, used as unique ids for cases_)
