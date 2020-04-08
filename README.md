# Movie-Stats
Input Files: 
* import java.io.*, and java.util.* to work with i/o files to obtain info needed
* Use fileReader and BufferedReader to read through files movies.csv & ratings.csv which is needed for further data
* In the csv files replaced "|" with "," to separate the genres and additionally removed "-" from all "sci-fi"

Storing data as key-value pairs using the Hashmap data structure: 
* Created dictionary interface 
* Dictionary ADT (Abstract Data Structure) use: 
  put(key, value) to add the key with the value to the dictionary.
  remove(dictionary, key) to remove a key with it's associated value
  destroy(dictionary) to get rid of the dictionary.
  Value get(dictionary, key) to return a value, it will display null if no key exist
 Reporting with Graphics: 
 *I was unsure how to display graph of stats so I will update shortly when I figure it out.

* Parsed the file to get the count per genre - also used arraylist to get the size
* Parsed the release year (yyyy) from the last substring of movie title to get the number of movies released per year
Contrast List and Map Interfaces:
The difference between a map and a list: map holds 2 values (key and value), while list is 1 value per entry..
