package utils
import scala.collection.mutable.ArrayBuffer

object Strings {

// Function to decide and return the string key the note will be added to
  def findString(note: Int): Int = {
    val stringsWithNotePresent = ArrayBuffer[Int]()

    val guitarStrings = utils.Notes.guitarStrings
    for ((stringIndex, stringNotes) <- utils.Notes.guitarStrings) {
      if (stringNotes.contains(note)) {
        stringsWithNotePresent += stringIndex
      }
    }
    return stringsWithNotePresent.min
// utils.Notes.guitarStrings.keys.head
    // 2. loop: if note found in each string array? create new list and push note to tail
    // 3. return the first element in the array (i.e the higher string)
    // return stringsWithNotePresent.keys.head
  }

}
