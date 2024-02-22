import java.util.Date

data class TodoItem(
    val id: String,
    var isCompleted: Boolean = false,
    val creationDate: Date,
    var modificationDate: Date? = null
)
