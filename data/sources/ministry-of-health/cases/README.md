# Source Case Data
Provided here are snapshots of the case data taken from the [Ministry of Health](https://www.health.govt.nz/our-work/diseases-and-conditions/covid-19-novel-coronavirus/covid-19-current-situation/covid-19-current-cases/covid-19-current-cases-details), whenever updates are made. Some useful things to note before playing with this data are as follows:

## 1. Data Loss vs Structure
Many records contain missing data, which in some cases can be recovered from other records from previous/future dates, or by cross-checking with other resources. There is also a trend for more recent data to be coarser with less specific information (e.g. All flights/places visited recorded, to just the last country/flight before entering New Zealand). Part of this could probably be attributed to the evolving record taking, which started off quite unstructured (textual descriptions) to more structured (columns for common information recorded).

## 2. Format Changes
Over time the format of the source case data has changed in terms of what is recorded. These key changes can be observed on dates:

### 26th March (262 cases)
* `Case` - A number assigned to the case
* `DHB` - The District Health Board the patient's case is registered under
* `Age` - The age group the patient fits in, either a decade (e.g. 30s, 40s) or a broad text description (e.g. Teen, Child)
* `Gender` - The gender of the case patient
* `Details` - Any details about how the patient came into contact with the virus, as well as travel details such as fights, dates, places visited
* `Date` - Appears to be the date the case was reported, however this date often conflicts with other sources, so is not very reliable

### 28th March (451 cases)
No updates were made on the 27th of March, however the 28th of March resulted in significant format changes. Cases are no longer uniquely identifiable by number from the `Case` field, also some cases are missing in the new data completely (e.g. Case 47, Bay of Plenty Male in his 50s, arrived March 10th on flight EK448). Lastly cases are now sorted into two files, one for confirmed and one for probable cases.

* ~~`Case`~~ - _Removed_
* `Report Date` - _same as_ `Date`
* `Sex` - _same as_ `Gender`
* `Age group` - The age group the patient fits in is now specified by number boundaries, removing ambiguity around `Teen`, `Child`, etc. Also anyone older than 70 is reported as `70+`
* `DHB` - _No change_
* `Overseas` - A `Yes` or `No` indicator as to whether the patient has been overseas, sometimes nothing is recorded at all
* `Last City before NZ` - The last city the patient was in before returning to New Zealand
* `Flight No` - The patient's return flight number, occassionally non-existent, refers to the wrong leg of the journey, the flight does not run on the dates specified, or simply not reported - but can be recovered by cross checking with other resources/records
* `Departure date` - The departure date of the return flight
* `Arrival date` - The arrival date of the return flight

### 29th March (514 cases)
* `Date of report` - _same as_ `Report Date`
* `Sex` - _No change_
* `Age group` - _No change_
* `DHB` - _No change_
* `International travel` - _No change_
* `Last country before return` - Instead of last city (e.g. `Sydney`), now only last country is reported (e.g. `Australia`)
* `Flight number` - _No change_
* `Flight departure date` - _No change_
* `Arrival date` - _No change_

### 30th March to Present (589+ cases)
The column names fluctuate (e.g. `Flight number`, `Flight no`), but semantically remain the same. The format for cases recording stabilizes from this date on. Also worth noting is the Excel file merges the confirmed and probable cases into one file, using a sheet for each case type.
