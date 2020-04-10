import scala.io.Source
import scala.util.Random

object NewZealandFirstNamesList extends App {

  // Ingest file, drop header, and map each line to an array via comma split
  var root = "<repo-location>"
  val lines = Source.fromURL(s"file:///$root/nz-covid19-travel-data/data/sources/dept-internal-affairs/baby-names-2020-01-06.csv").getLines
    .toArray.drop(1).map(line => line.split(","))

  // Separate female vs male names
  val nzFemaleNames = lines.filter(v => v(1) == "F").map(v => v(2)).distinct.toList
  val nzMaleNames = lines.filter(v => v(1) == "M").map(v => v(2)).distinct.toList

  // Identify gender neutral names
  Random.setSeed(1L)
  val nzNeutralNames = nzFemaleNames.intersect(nzMaleNames)
  val nzNeutralNamesShuffled = Random.shuffle(nzNeutralNames)
  //nzNeutralNamesShuffled.foreach(println)

  // Perform seeded shuffle of female names and prune out the gender neutral names
  Random.setSeed(1L)
  val nzFemaleNamesShuffled = Random.shuffle(nzFemaleNames).filter(n => !nzNeutralNames.contains(n))
  //nzFemaleNamesShuffled.foreach(println)

  // Perform seeded shuffle of male names and prune out the gender neutral names
  Random.setSeed(1L)
  val nzMaleNamesShuffled = Random.shuffle(nzMaleNames).filter(n => !nzNeutralNames.contains(n))
  nzMaleNamesShuffled.foreach(println)

  // Note: Could have performed the filtering before shuffling to save an operation, but wanted to retain original order
  // Note: Use of seed 1 for all cases is intentional here, easy to remember if need to regenerate any list
}