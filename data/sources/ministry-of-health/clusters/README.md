# Source Cluster Data
Provided here are snapshots of the cluster data taken from the [Ministry of Health](https://www.health.govt.nz/our-work/diseases-and-conditions/covid-19-novel-coronavirus/covid-19-current-situation/covid-19-current-cases/covid-19-significant-clusters), whenever updates are made. Some useful things to note before playing with this data are as follows:

## 1. Observed Format Changes
Over time the format of the source cluster data has changed in terms of what is recorded. These key changes can be observed on periods:

### 27th March - 30th March
* `Cluster under investigation` - describes the cluster, specifically by event/place name etc
* `Number of cases` - specifies the number of confirmed and probable cases in the cluster

### 31 March - 8th April
* `Clusters under investigation` - descriptions are less specific, simply describing the cluster type, e.g. `Event`, `Workplace`, etc
* `Location` - City/region of cluster origin provided
* `Total to date` - A count of number of cases, including both confirmed and probable
* `New in last 24 hours` - Any change in the total number of cases attributed to the cluster


### 11th April - Current
* `Clusters under investigation` - _No change_
* `Location` -  _No change_
* `Total to date` -  _No change_
* `New in last 24 hours` - _No change_
* `Origin` - The source of transmission, either `Overseas exposure` or `Unknown`

## 2. Negative Case Changes
Sometimes the field `New in last 24 hours` will have a negative number with an asterisk &ast;, quoted from the Ministry of Health website, this indicates:
> &ast; A decrease in numbers is due to probable cases being reclassified as not a case.

## 3. Other Gotchas
### Hawke's Bay Apostrophe
Watch out for the apostrophe in `(Hawke's|Hawke’s) Bay`, we try to clean it out but sometimes it sneaks back in when snapshotting, or replaced with the _replacement_ Unicode character `U+FFFD`. It's an `ISO 8859-1` vs `UTF-8` thing, use the cleaned data under `data/meta/` to avoid such issues altogether (to be pushed later) :P
